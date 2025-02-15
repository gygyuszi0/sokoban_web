import type { LoaderFunctionArgs } from "@remix-run/node";
import type { ActionFunctionArgs } from "@remix-run/node";
import { isRouteErrorResponse, redirect, useNavigate, useParams, useRouteError } from "@remix-run/react";
import type { ClientActionFunctionArgs } from "@remix-run/react";
import React, { useState } from "react";
import { Form, useForm } from "react-hook-form";

export const action = async ({ request }: ActionFunctionArgs) => {
    return redirect("/login");
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

function MapItem(props) {
    const name = "item_" + props.index;
    const index = props.index;
    return (
        <input className="map-grid-item" type="text" disabled={true} name={name} value="s" />
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
        <>{rows}</>
    );
}

export default function RouteComponent() {
    const params = useParams();
    const width = parseInt(params.width);
    const height = parseInt(params.height);

    const [selected, setSelected] = useState("s");
    const navigate = useNavigate();
    return (
        <>
            <h1 className="sub-title">Create map</h1>
            <p>Slected : {selected}</p>
            <div className="create-map-content">
                <div className="map-grid">
                    <MapGrid width={width} height={height} />
                </div>

                <div className="map-items">
                    <div className="map-items-line">
                        <button className="map-grid-item" onClick={() => (setSelected("w"))}>w</button>
                        <button className="map-grid-item">s</button>
                        <button className="map-grid-item">p</button>
                        <button className="map-grid-item">b</button>
                    </div>
                </div>
                <form className="map-buttons" method="post">
                    <button className="map-button" type="button">Cancel</button>
                    <button className="map-button" type="submit">OK</button>
                </form>
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