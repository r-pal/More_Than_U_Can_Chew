import React from 'react'
import "../stylesheets/Main.css";
import {Link} from 'react-router-dom';
import img from '../logoBread.png'



function BakeryNavBar({selectedBakery}) {
  return (
    <header>
 <Link className="navBarLink" 
 style={{textDecoration:"none"}} 
 to={"/"}><img src={img} height="100" width="100"/></Link>
 <Link className="navBarLink" style={{textDecoration:"none"}} to={"/bakeries/:id"}><h2>{selectedBakery.name.replace(/"/g, '')}</h2></Link>
<nav>
            



            <div className="dropdown">
                <h3>Menu</h3>
                <div className="dropdown-content">
                <p><a className="navBarLink" href="/bakeries/:id/orders">View Orders</a></p>
                <p><a className="navBarLink" href="/bakeries/:id/edit">Edit Profile</a></p>
                <p><a className="navBarLink" href="/">Log Out</a></p>
                </div>
                </div>
            
        </nav>
    
    </header>
  )
}

export default BakeryNavBar