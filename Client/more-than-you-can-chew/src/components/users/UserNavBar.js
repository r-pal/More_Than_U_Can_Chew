import React from 'react'
import "../stylesheets/Main.css";
import {Link} from 'react-router-dom';

function UserNavBar({selectedUser}) {


  return (
    <header>
 <Link className="navBarLink" style={{textDecoration:"none"}} to={"/"}><h3>{'>'}U_Can_Chew</h3></Link>
 <Link className="navBarLink" style={{textDecoration:"none"}} to={"/users/:id"}><h2>{selectedUser.name.replace(/"/g, '')}</h2></Link>
<nav>
            



            <div className="dropdown">
                <span>Menu</span>
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