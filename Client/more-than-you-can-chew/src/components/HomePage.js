import React, {Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';
import "./stylesheets/Main.css";
import NavBar from './NavBar';

const HomePage = () => {


    return(
        <>
        <NavBar />

        <div className='HomePageContainer'>
            {/* <div className="ItalicText"><h2>More than you can chew is the free-cycle bakery app with a difference. Free baked goods for you at the end of the day, less waste for bakers and the planet. Good chews for all!</h2></div> */}
        <div>
        <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"/users"}><button className='ButtonUser' type="button">User</button></Link>
        </div>
        <div>
        <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"bakeries"}><button className='ButtonBaker' type="button">Bakery</button></Link>
</div>
</div>
</>
    )
}

export default HomePage;