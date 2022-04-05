import React, {Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';

const HomePage = () => {


    return(
        <div className="buttonContainer">
        <Link to={"/users"}><button type="button">Sign in as User</button></Link>
        <Link to={"bakeries"}><button type="button">Sign in as Baker</button></Link>
</div>
    )
}

export default HomePage;