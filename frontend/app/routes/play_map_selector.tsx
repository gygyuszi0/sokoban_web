import type { LoaderFunctionArgs, ActionFunctionArgs } from "@remix-run/node";
import { useLoaderData, isRouteErrorResponse, useRouteError, Link, json } from "@remix-run/react";
import { date } from "zod";

interface MapModel {
    id : number;
    name : string;
    content : string;
};

export const loader = async ({ request }: LoaderFunctionArgs) => {

    const result = fetch('http://localhost:8888/map/read_all', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
    })
    .catch(error => {
        console.log(error);
    });

    return result;
};

export const action = async ({ request }: ActionFunctionArgs) => {
    return null;
};

export default function RouteComponent() {
    const data = useLoaderData<typeof loader>();

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
                    {data.map((item) => (
                        <MapItem mapId={item?.id} mapName={item?.mapName} />
                    ))}

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