import type { LoaderFunctionArgs, ActionFunctionArgs } from "@remix-run/node";
import { useLoaderData, isRouteErrorResponse, useRouteError, useParams } from "@remix-run/react";

export const loader = async ({ request }: LoaderFunctionArgs) => {
  return null;
};

export const action = async ({ request }: ActionFunctionArgs) => {
  return null;
};

export default function RouteComponent(){
  const data = useLoaderData<typeof loader>()
  const params = useParams();
  return (
    <>
        <h1 className="sub-title">Play</h1>
        <p>Map id : {params.mapId}</p>
    </>
  );
}

export function ErrorBoundary(){
  const error = useRouteError();
  if (isRouteErrorResponse(error)) {
    return <div/>
  }
  return <div/>
}