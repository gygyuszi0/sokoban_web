import type { LoaderFunctionArgs, ActionFunctionArgs } from "@remix-run/node";
import { useLoaderData, isRouteErrorResponse, useRouteError, useParams, redirect, Scripts } from "@remix-run/react";
import { console } from "node:inspector";
import { useState } from "react";

interface coordinate {
    x: number,
    y: number,
    hide: string
};


function toCoordinate(value: number, width: number, height: number) {
    const coordY = Math.floor(value / height);
    const coordX = value % width;
    return { x: coordX, y: coordY, hide: "s" };
}

function toIndex(coord: coordinate, width: number, height: number) {
    return coord.y * height + coord.x;
}

function findCoordinates(content: string, pattern: string, width: number, height: number) {
    const coordinates = [];
    for (let index = 0; index < content.length && index != -1; index++) {
        const i = content.indexOf(pattern, index);
        if (i == -1) {
            break;
        }
        console.log("index : %d", i);
        coordinates.push(toCoordinate(i, width, height));
        index = i;
    }
    console.log("index : done");
    console.log("box_coordinates :", coordinates);
    return coordinates
}
export const loader = async ({ request }: LoaderFunctionArgs) => {
    const Name = "teszt";
    const Content = "ssswtpbss";
    const width = 3;
    const height = 3;

    const playerCoordinate = toCoordinate(Content.indexOf("p"), width, height);
    const boxCoordinates = findCoordinates(Content, "b", width, height);
    const targetCoordinates = findCoordinates(Content, "t", width, height);

    const startCoordinateX = 2;
    const startCoordinateY = 1;

    const response = {
        mapName: Name,
        mapContent: Content,
        width: width,
        height: height,
        startCoordinate: playerCoordinate,
        box: boxCoordinates,
        target: targetCoordinates
    };

    return response;
};

export const action = async ({ request }: ActionFunctionArgs) => {
    return null;
};

export default function RouteComponent() {
    const data = useLoaderData<typeof loader>()
    const params = useParams();
    const content = data?.mapContent;

    const [buttonLabels, setButtonLabels] = useState([...data?.mapContent]);

    function MapItem(props) {
        const name = "item_" + props.index;
        const index = props.index;
        const label = buttonLabels[index];
        return (
            <button className="map-grid-item" name={name}>{label}</button>
        );
    }

    function MapRow({ children }: { children: React.ReactNode }) {
        return (
            <div className="map-grid-line">
                {children}
            </div>
        );
    }

    const MapGrid = (props) => {

        let rows = [];
        for (let i = 0; i < props.height; i++) {
            let row = [];
            for (let j = 0; j < props.width; j++) {
                row.push(<MapItem index={i * props.width + j} />);
            }
            rows.push(<MapRow>{row}</MapRow>);
        }

        return (
            <>
                {rows}
            </>
        );
    }

    const [playerCoord, setPlayerCoord] = useState(data.startCoordinate);

    function moveUp() {
        if (playerCoord.y != 0) {
            const upper = { x: playerCoord.x, y: playerCoord.y - 1, hide: playerCoord.hide };
            const index = toIndex(upper, data.width, data.height);
            const index_player = toIndex(playerCoord, data.width, data.height);
            const new_hide = buttonLabels[index];
            const new_player = { x: playerCoord.x, y: playerCoord.y - 1, hide: new_hide };
            let labels = [...buttonLabels];
            labels[index] = "p";
            labels[index_player] = playerCoord.hide;
            setButtonLabels(labels);
            setPlayerCoord(new_player);
        }
    }

    function moveDown() {
        if (playerCoord.y != data.height-1) {
            const upper = { x: playerCoord.x, y: playerCoord.y + 1, hide: playerCoord.hide };
            const index = toIndex(upper, data.width, data.height);
            const index_player = toIndex(playerCoord, data.width, data.height);
            const new_hide = buttonLabels[index];
            const new_player = { x: playerCoord.x, y: playerCoord.y + 1, hide: new_hide };
            let labels = [...buttonLabels];
            labels[index] = "p";
            labels[index_player] = playerCoord.hide;
            setButtonLabels(labels);
            setPlayerCoord(new_player);
        }
    }
    function moveLeft() {
        if (playerCoord.x != 0) {
            const upper = { x: playerCoord.x -1 , y: playerCoord.y, hide: playerCoord.hide };
            const index = toIndex(upper, data.width, data.height);
            const index_player = toIndex(playerCoord, data.width, data.height);
            const new_hide = buttonLabels[index];
            const new_player = { x: playerCoord.x -1 , y: playerCoord.y, hide: new_hide };
            let labels = [...buttonLabels];
            labels[index] = "p";
            labels[index_player] = playerCoord.hide;
            setButtonLabels(labels);
            setPlayerCoord(new_player);
        }
    }

    return (
        <>
            <Scripts></Scripts>
            <h1 className="sub-title">Play</h1>
            <p>Map id : {params.mapId}</p>
            <p>player : {JSON.stringify(playerCoord)}</p>

            <div className="map-page">
                <div className="map-grid">
                    <MapGrid width={data?.width} height={data?.height}></MapGrid>
                </div>
            </div>
            <div className="play-navigation-container">
                <div className="play-navigation">
                    <button className="play-navigation-button-hidden" disabled={true}></button>
                    <button className="play-navigation-button" onClick={() => (moveUp())}>{String.fromCodePoint(0x2B06)}</button>
                    <button className="play-navigation-button-hidden" disabled={true}></button>
                </div>
                <div className="play-navigation">
                    <button className="play-navigation-button" onClick={() => moveLeft()}>{String.fromCodePoint(0x2B05)}</button>
                    <button className="play-navigation-button" onClick={() => moveDown()}>{String.fromCodePoint(0x2B07)}</button>
                    <button className="play-navigation-button">{String.fromCodePoint(0x27A1)}</button>
                </div>
            </div>
        </>
    );
}

export function ErrorBoundary() {
    const error = useRouteError();
    if (isRouteErrorResponse(error)) {
        return <div />
    }
    return <div />
}