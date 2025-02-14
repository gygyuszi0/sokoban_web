import type { ActionFunctionArgs } from "@remix-run/node";
import { isRouteErrorResponse, redirect, useRouteError } from "@remix-run/react";
import type { ClientActionFunctionArgs } from "@remix-run/react";
import { Form, useForm } from "react-hook-form";

export const action = async ({ request }: ActionFunctionArgs) => {
    return redirect("/create_map");
};

export default function RouteComponent() {
    return (
        <>
            <div className="dimensions-page">
                <div className="dimensions-window">
                    <h3>Dimensions</h3>
                    <form className="dimensions_form" method="post">
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