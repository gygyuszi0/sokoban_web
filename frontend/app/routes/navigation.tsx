import { Navigation } from "@remix-run/react";
import { Link } from "@remix-run/react";
import React from "react";


function EmptyNav() {
    return (
        <>
            <nav className="nav">
                <div className="nav-item font-bold">Sokoban Web</div>
            </nav>
        </>
    );
};

export default function Nav() {
    return (
        <>
            <EmptyNav />
        </>
    );
};


function LoggedInNav(props) {
    return (
        <>
            <nav className="nav">
                <div className="nav-item font-bold">Sokoban Web </div>
                <div className="nav-item">{props.userName} </div>
            </nav>
        </>
    );
};
