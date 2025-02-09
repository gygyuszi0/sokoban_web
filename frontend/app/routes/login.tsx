import { ActionFunctionArgs } from "@remix-run/node";
import { 
    Form
} from "@remix-run/react";
import { Console } from "node:console";
import { console } from "node:inspector";


export default function Login() {
    return (
        <>
            <div className="login-page">
                <div className="login-window">
                    <h3>Log in</h3>
                    <Form className="login_from" method="post" action="./proceed">
                        <input type="text" name="username" placeholder="Username" />
                        <input type="password" name="password" placeholder="Password" />
                        <button className="button-style" type="submit" name="submit_login">OK</button>
                    </Form>
                </div>
            </div>
        </>
    );
}