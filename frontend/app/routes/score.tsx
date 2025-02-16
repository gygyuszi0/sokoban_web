import type { LoaderFunctionArgs } from "@remix-run/node";
import { useLoaderData, isRouteErrorResponse, useRouteError } from "@remix-run/react";

export const loader = async ({ request }: LoaderFunctionArgs) => {
  return null;
};

export default function RouteComponent(){
  const data = useLoaderData<typeof loader>()

  function ScoreItem(mapId : number, userId : number, score:number){
    return (
      <div className="score-item">
        <div></div>
      </div>
    );
  }
  return (
    <>
      <h1 className="sub-title">Scores</h1>
      <div className="score-page">
        <div className="score-list">
          <div className="score-header">
            <div className="header-item">Map id</div>
            <div className="header-item">User id</div>
            <div className="header-item">Score</div>
          </div>
        </div>
      </div>
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