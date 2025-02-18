import type { LoaderFunctionArgs, ActionFunctionArgs } from "@remix-run/node";
import { useLoaderData, isRouteErrorResponse, useRouteError, useParams } from "@remix-run/react";
import { useState } from "react";

interface coordinate {
    x:number, 
    y:number
};


function toCoordinate(value:number, width:number, height:number){
    const coordY = Math.floor(value/height);
    const coordX = value % width;
    return {x: coordX, y:coordY};
}

export const loader = async ({ request }: LoaderFunctionArgs) => {
    const Name = "teszt";
    const Content = "ssswtpbss";
    const width = 3;
    const height = 3;

    const playerCoordinate = toCoordinate(Content.indexOf("p"), width, height);
    const boxCoordinates = [];
    for (let index = 0; index < Content.length && index != -1; index++) {
        const i = Content.indexOf("b", index);
        if (i == -1) {
            break;
        }
        console.log("index : %d", i);
        boxCoordinates.push(toCoordinate(i, width, height));
        index = i;
    }
    console.log("index : done");
    console.log("box_coordinates :", boxCoordinates);
    
    
    const startCoordinateX = 2;
    const startCoordinateY = 1;
    
    // const boxCoordinates = [{x:0, y:0}, {x:0, y:0}, {x:0, y:0}]

    const response = {
        mapName: Name,
        mapContent: Content,
        width: width,
        height: height,
        startCoordinate: {
            x: startCoordinateX,
            y: startCoordinateY
        }
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

    const [buttonLabels, setButtonLabels] = useState(data?.mapContent);

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

    const [playerCoord, setPlayerCoord] = useState([0, 0]);

    return (
        <>
            <h1 className="sub-title">Play</h1>
            <p>Map id : {params.mapId}</p>
            <p>Map content : {content.length}</p>

            <div className="map-page">
                <div className="map-grid">
                    <MapGrid width={data?.width} height={data?.height}></MapGrid>
                </div>
            </div>
            <div className="play-navigation-container">
                <div className="play-navigation">
                    <button className="play-navigation-button-hidden" disabled={true}></button>
                    <button className="play-navigation-button">{String.fromCodePoint(0x2B06)}</button>
                    <button className="play-navigation-button-hidden" disabled={true}></button>
                </div>
                <div className="play-navigation">
                    <button className="play-navigation-button">{String.fromCodePoint(0x2B05)}</button>
                    <button className="play-navigation-button">{String.fromCodePoint(0x2B07)}</button>
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