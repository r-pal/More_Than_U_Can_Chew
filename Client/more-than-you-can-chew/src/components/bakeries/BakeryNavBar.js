import React from 'react'
import "../stylesheets/Main.css";
import {Link} from 'react-router-dom';


function BakeryNavBar({selectedBakery}) {
  return (
    <header>
 <Link className="navBarLink" style={{textDecoration:"none"}} to={"/"}><h3>{'>'}U_Can_Chew</h3></Link>
<h2>{selectedBakery.name.replace(/"/g, '')}</h2>
<nav>
            



            <div className="dropdown">
                <span>Menu</span>
                <div className="dropdown-content">
                <p>View Orders</p>
                <p><a className="navBarLink" href="/bakeries/:id/edit">Edit Profile</a></p>
                <p><a className="navBarLink" href="/">Log Out</a></p>
                </div>
                </div>
            
        </nav>
    
    </header>
  )
}

export default BakeryNavBar