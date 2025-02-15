import type { LoaderFunctionArgs } from "@remix-run/node";
import type { ActionFunctionArgs } from "@remix-run/node";
import { isRouteErrorResponse, redirect, useParams, useRouteError } from "@remix-run/react";
import type { ClientActionFunctionArgs } from "@remix-run/react";
import { Form, useForm } from "react-hook-form";

export const action = async ({ request }: ActionFunctionArgs) => {
    return redirect("/login");
};


export const loader = async ({ request }: LoaderFunctionArgs) => {
    
    return null;
};


export default function RouteComponent() {
    const params = useParams();
    return (
        <>
            <h1 className="sub-title">Create map</h1>
            <p>Width : {params.width}</p>
            <p>Height : {params.height}</p>
            <div className="create-map-content">
                <div className="map-grid">
                    <div className="map-grid-line">
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
                    </div>
                    <div className="map-grid-line">
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
                        <button className="map-grid-item"></button>
                    </div>
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