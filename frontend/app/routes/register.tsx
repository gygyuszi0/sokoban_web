import { 
    Form
} from "@remix-run/react";

export default function Register() {
    return (
        <>
            <div className="register-page">
                <div className="register-window">
                    <h3>Register</h3>
                    <Form className="register_form" method="post" action="./proceed">
                        <input className="text-field-style" type="text" name="user_name" placeholder="Username" />
                        <input className="text-field-style" type="text" name="real_name" placeholder="Real name" />
                        <input className="text-field-style" type="password" name="password" placeholder="Password" />
                        <button className="button-style" type="submit" name="submit_register">OK</button>
                    </Form>
                </div>
            </div>
        </>
    );
}