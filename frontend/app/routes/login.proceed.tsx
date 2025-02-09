import { ActionFunctionArgs} from "@remix-run/node";
import { json, redirect } from "@remix-run/node";

export const action = async ({params, request}:ActionFunctionArgs) => {
    const formData = await request.formData();
    const update = Object.fromEntries(formData);
    const id = params.username;
    
    return redirect("/login");
}