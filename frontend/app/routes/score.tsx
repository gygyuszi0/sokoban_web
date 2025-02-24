import type { LoaderFunctionArgs } from "@remix-run/node";
import { useLoaderData, isRouteErrorResponse, useRouteError } from "@remix-run/react";

export const loader = async ({ request }: LoaderFunctionArgs) => {

    const result = await fetch('http://localhost:8888/score/read_all', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
    })
    .catch(error => {
        console.log(error);
    });

    return await result.json();
};

export default function RouteComponent() {
  const data = useLoaderData<typeof loader>()

  function ScoreItem(props) {
    return (
        <div className="score-item">
            <div className="score-item-field">{props.mapId}</div>
            <div className="score-item-field">{props.userId}</div>
            <div className="score-item-field">{props.score / 1000}'s</div>
        </div>
    );
  };
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
            {
                data.map((item) => (
                    <ScoreItem mapId={item.mapId} userId={item.userId} score={item.time} />
                ))
            }
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