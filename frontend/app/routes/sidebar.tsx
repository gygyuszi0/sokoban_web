import { 
    Link,
    Links
} from "@remix-run/react";
import { Component } from "react";

export function LoggedOutSideBar() {
    return (
        <>
            <div className="logged-out-side-bar">
                <div className="logged-out-side-bar-heading">
                    <h2>Logged Out</h2>
                </div>
                <div className="logged-out-side-bar-content">
                    <Link to="./login" className="button-style">Log in</Link>
                </div>
                <div className="logged-out-side-bar-content">
                    <Link to="./register" className="button-style">Register</Link>
                </div>
            </div>
        </>
    );    
};

export default function SideBar() {
    return (
        <>
            <LoggedOutSideBar/>
        </>
    );    
};