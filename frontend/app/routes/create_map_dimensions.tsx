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
            <div className="login-page">
                <div className="login-window">
                    <h3>Log in</h3>
                    <form method="post">
                        <input className="text-field-style" type="text" name="width"></input>
                        <input className="text-field-style" type="text" name="height"></input>
                        <button className="button-style" type="submit">OK</button>
                    </form>
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