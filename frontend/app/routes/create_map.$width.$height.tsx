import type { LoaderFunctionArgs } from "@remix-run/node";
import type { ActionFunctionArgs } from "@remix-run/node";
import { isRouteErrorResponse, redirect, useParams, useRouteError } from "@remix-run/react";
import type { ClientActionFunctionArgs } from "@remix-run/react";
import React from "react";
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

function MapItem(index: any) {
    return (
        <input className="map-grid-item" type="text" name="item_${index}" value="${index}" />
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
    const h = [...Array(props.width).keys()];

    return (
        <>
            <p>h :{[Array(props.width).keys()]}</p>
            {h.map(
                (item) => (
                    <p>{item}</p>
                )
            )
            }

        </>
    );
}

export default function RouteComponent() {
    const params = useParams();
    const width = parseInt(params.width);
    const height = parseInt(params.height);

    return (
        <>
            <h1 className="sub-title">Create map</h1>
            <p>Width : {params.width}</p>
            <p>Height : {params.height}</p>
            <div className="create-map-content">
                <div className="map-grid">
                    <MapGrid width={width} height={height} />
                </div>

                <div className="map-items">
                    <div className="map-items-line">
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
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