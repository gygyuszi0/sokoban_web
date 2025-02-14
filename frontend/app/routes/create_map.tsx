import type { ActionFunctionArgs } from "@remix-run/node";
import { isRouteErrorResponse, redirect, useRouteError } from "@remix-run/react";
import type { ClientActionFunctionArgs } from "@remix-run/react";
import { Form, useForm } from "react-hook-form";

export const action = async ({ request }: ActionFunctionArgs) => {
    return redirect("/login");
};

export default function RouteComponent() {
    return (
        <>
            <h1>Create map</h1>
            <form method="post">
                <button type="submit">OK</button>
            </form>
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