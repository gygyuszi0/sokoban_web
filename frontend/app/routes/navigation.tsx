import { Navigation } from "@remix-run/react";
import { Link } from "@remix-run/react";
import React from "react";


export default function Nav() {
    return (
        <>
            <nav className="nav">
                <div className="nav-item font-bold">Sokoban Web </div>
                <div className="nav-item">
                    <Link to="/login">Login</Link>
                </div>
            </nav>
        </>
    );
}