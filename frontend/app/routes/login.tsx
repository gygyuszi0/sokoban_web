import { 
    Form
} from "@remix-run/react";


export default function Login() {
    return (
        <>
            <div className="login-page">
                <div className="login-window">
                    <h3>Log in</h3>
                    <Form className="login_form" method="post" action="./proceed">
                        <input className="text-field-style" type="text" name="username" placeholder="Username" />
                        <input className="text-field-style" type="password" name="password" placeholder="Password" />
                        <button className="button-style" type="submit" name="submit_login">OK</button>
                    </Form>
                </div>
            </div>
        </>
    );
}