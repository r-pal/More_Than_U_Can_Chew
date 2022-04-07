import React, {Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';
import "./stylesheets/HomePage.css";

const HomePage = () => {


    return(
        <div className='HomePageContainer'>
        <div className="ButtonUsers">
        <Link to={"/users"}><button type="button">Sign in as User</button></Link>
        </div>
        <div className='ButtonBakeries'>
        <Link to={"bakeries"}><button type="button">Sign in as Baker</button></Link>
</div>
</div>
    )
}

export default HomePage;