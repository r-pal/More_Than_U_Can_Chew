import React from 'react'
import "../stylesheets/Main.css";
import {Link} from 'react-router-dom';
import img from '../logoBread.png'


function UserNavBar({selectedUser}) {


  return (
    <header>
 <Link className="navBarLink" 
 style={{textDecoration:"none"}} 
 to={"/"}><img src={img} height="100" width="100"/></Link>
 <Link className="navBarLink" style={{textDecoration:"none"}} to={"/users/:id"}><h2>{selectedUser.name.replace(/"/g, '')}</h2></Link>
<nav>
            



            <div className="dropdown">
                <h3>Menu</h3>
                <div className="dropdown-content">
                <p><a className="navBarLink" href="/users/:id/orders">View Orders</a></p>
                <p><a className="navBarLink" href="/users/:id/edit">Edit Profile</a></p>
                <p><a className="navBarLink" href="/">Log Out</a></p>
                </div>
                </div>
            
        </nav>
    
    </header>
  )
}

export default UserNavBar