import type { LoaderFunctionArgs } from "@remix-run/node";
import type { ActionFunctionArgs } from "@remix-run/node";
import { isRouteErrorResponse, Link, redirect, useNavigate, useParams, useRouteError } from "@remix-run/react";
import type { ClientActionFunctionArgs } from "@remix-run/react";
import React, { useState } from "react";
import { Form, useForm } from "react-hook-form";
import { postRequest } from "~/routes/service/data";

export const action = async ({ request }: ActionFunctionArgs) => {
    const data = await request.formData();

    const map_content = data.get("map");
    const map_array = JSON.parse(map_content);

    const width = parseInt(data.get("width"));
    const height = parseInt(data.get("height"));
    const player_index = map_array.indexOf("p");

    const player_x = Math.floor(player_index/height);
    const player_y = player_index % width;

    let map = String();
    for (let index = 0; index < map_array.length; index++) {
        map = map.concat(map_array[index]);
    }

    fetch('http://localhost:8888/map/create', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            startCoordinate: {
                x : player_x,
                y : player_y
            },
            mapContent: map
        })
      })
    // postRequest("map/create", JSON.stringify({
    //     startCoordinate: {
    //         x: 0,
    //         y: 0
    //     },
    //     mapContent: "asdasdasdasd"
    // }))

    return redirect("/game_dashboard");
};


export const loader = async ({ request }: LoaderFunctionArgs) => {

    return null;
};

function MapRow({ children }: { children: React.ReactNode }) {
    return (
        <div className="map-grid-line">
            {children}
        </div>
    );
}

export async function cancel() {
    return redirect("./game_dashboard");
}

export default function RouteComponent() {
    const params = useParams();
    const width = parseInt(params.width);
    const height = parseInt(params.height);

    const [selected, setSelected] = useState("s");
    const [buttonLabels, setButtonLabels] = useState([...Array(width * height).keys()].map(i => "s"));

    function MapItem(props) {
        const name = "item_" + props.index;
        const index = props.index;
        const label = buttonLabels[index];
        return (
            <button className="map-grid-item" name={name}
                onClick={() => {
                    let labels = [...buttonLabels];
                    labels[index] = selected;
                    setButtonLabels(labels);
                }}>{label}</button>
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

        const labels = [...props.labels];
        return (
            <>
                {rows}
            </>
        );
    }

    const navigation = useNavigate();
    return (
        <>
            <h1 className="sub-title">Create map</h1>
            <p>Slected : {selected}</p>
            <div className="create-map-content">
                <div className="map-grid">
                    <MapGrid width={width} height={height} labels={buttonLabels} />
                </div>

                <div className="map-items">
                    <div className="map-items-line">
                        <button className="map-grid-item" onClick={() => (setSelected("w"))}>w</button>
                        <button className="map-grid-item" onClick={() => (setSelected("s"))}>s</button>
                        <button className="map-grid-item" onClick={() => (setSelected("p"))}>p</button>
                        <button className="map-grid-item" onClick={() => (setSelected("b"))}>b</button>
                        <button className="map-grid-item" onClick={() => (setSelected("t"))}>t</button>
                    </div>
                </div>
                <div className="map-buttons">
                    <button className="map-button" onClick={() => navigation(-1)}>Cancel</button>
                    <form method="post">
                        <input type="hidden" name="width" value={width} />
                        <input type="hidden" name="height" value={height} />
                        <input type="hidden" name="map" value={JSON.stringify(buttonLabels)} />
                        <button className="map-button" type="submit">OK</button>
                    </form>
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