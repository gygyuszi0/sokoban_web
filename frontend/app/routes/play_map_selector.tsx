import type { LoaderFunctionArgs, ActionFunctionArgs } from "@remix-run/node";
import { useLoaderData, isRouteErrorResponse, useRouteError, Link } from "@remix-run/react";

export const loader = async ({ request }: LoaderFunctionArgs) => {
    return null;
};

export const action = async ({ request }: ActionFunctionArgs) => {
    return null;
};

export default function RouteComponent() {
    const data = useLoaderData<typeof loader>()

    function MapItem(props) {
        const target = "./play/" + props.mapId;
        return (
            <a className="map-item" href={target}>
                <div className="map-item-field">{props.mapId}</div>
                <div className="map-item-field">{props.mapName}</div>
            </a>);
    };

    return (
        <>
            <h1 className="sub-title">Select map</h1>
            <div className="map-page">
                <div className="map-list">
                    <div className="map-header">
                        <div className="header-item">Id</div>
                        <div className="header-item">Name</div>
                    </div>
                    <MapItem mapId={1} mapName={"teszt"}></MapItem>
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