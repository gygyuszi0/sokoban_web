import type { LoaderFunctionArgs } from "@remix-run/node";
import { useLoaderData, isRouteErrorResponse, useRouteError } from "@remix-run/react";

export const loader = async ({ request }: LoaderFunctionArgs) => {
  return null;
};

export default function RouteComponent() {
  const data = useLoaderData<typeof loader>()

  function ScoreItem(props) {
    return (
        <div className="score-item">
            <div className="score-item-field">{props.mapId}</div>
            <div className="score-item-field">{props.userId}</div>
            <div className="score-item-field">{props.score}</div>
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
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
          <ScoreItem mapId={1} userId={1} score={100} />
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