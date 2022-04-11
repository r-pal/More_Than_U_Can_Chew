import React from 'react'
import "./stylesheets/Main.css";
import {Link} from 'react-router-dom';


function NavBar() {
  return (
    <header>
 <Link className="navBarLink" style={{textDecoration:"none"}} to={"/"}><h3>{'>'}U_Can_Chew</h3></Link>
<h2></h2>
<nav>
            



            <div className="dropdown">
                <span></span>
                <div className="dropdown-content">
                <p></p>
                <p></p>
                <p></p>
                </div>
                </div>
            
        </nav>
</header>
  )
}

export default NavBar