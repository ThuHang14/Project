import React from 'react';
import './style.css'

const NoPage = () => {
    return (
        <div className="container">
            <div className="site">
                <div className="sketch">
                    <div className="bee-sketch red"></div>
                    <div className="bee-sketch blue"></div>
                </div>

                <h1>404:
                    <small>Page Not Found</small></h1>
            </div>
        </div>
    );
};

export default NoPage;