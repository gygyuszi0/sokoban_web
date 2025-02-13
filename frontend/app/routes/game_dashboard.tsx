import type { LinksFunction } from "@remix-run/node";
import { isRouteErrorResponse, useRouteError } from "@remix-run/react";

export const links: LinksFunction = () => (
  [
    // your links here
  ]
);

export default function GameDashboard() {
  return (
    <>
      <h1 className="dashboard-title">Dashboard</h1>
      <div className="dashboard-content">
        <div className="dashboard-item">
          <div className="dashboard-item-img">img</div>
          <h2 className="dashboard-item-title">Play</h2>
        </div>
        <div className="dashboard-item">
          <div className="dashboard-item-img">img</div>
          <h2 className="dashboard-item-title">Craete new map</h2>
        </div>
        <div className="dashboard-item">
          <div className="dashboard-item-img">img</div>
          <h2 className="dashboard-item-title">Score</h2>
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