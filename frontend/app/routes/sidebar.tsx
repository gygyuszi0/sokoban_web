import { Component } from "react";

export function LoggedOutSideBar() {
    return (
        <>
            <div className="logged-out-side-bar">
                <div className="logged-out-side-bar-heading">
                    <h2>Logged Out</h2>
                </div>
                <div className="logged-out-side-bar-content">
                    <button className="button-style">Log in</button>
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