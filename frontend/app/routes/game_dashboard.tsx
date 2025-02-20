import type { LinksFunction, redirect } from "@remix-run/node";
import { isRouteErrorResponse, Link, useRouteError } from "@remix-run/react";

export const links: LinksFunction = () => (
  [
    // your links here
  ]
);

export default function GameDashboard() {
  return (
    <>
      <h1 className="sub-title">Dashboard</h1>
      <div className="dashboard-content">
        <a href="play_map_selector" className="dashboard-item">
          <div className="dashboard-item-img">img</div>
          <h2 className="dashboard-item-title">Play</h2>
        </a>
        <a href="play_map_selector_shift" className="dashboard-item">
          <div className="dashboard-item-img">img</div>
          <h2 className="dashboard-item-title">Play with target shift</h2>
        </a>
        <a className="dashboard-item" href="./create_map_dimensions">   
          <div className="dashboard-item-img">img</div>
          <h2 className="dashboard-item-title">Craete new map</h2>
        </a>
        <a className="dashboard-item "href="./score">   
          <div className="dashboard-item-img">img</div>
          <h2 className="dashboard-item-title">Score</h2>
        </a>
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