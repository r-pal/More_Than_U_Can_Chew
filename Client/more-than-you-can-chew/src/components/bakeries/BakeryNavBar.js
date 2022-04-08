import React from 'react'
import "../stylesheets/Main.css";


function BakeryNavBar({selectedBakery}) {
  return (
    <header>
<h3>{'>'}U_Can_Chew</h3>
<h2>{selectedBakery.name.replace(/"/g, '')}</h2>
<nav>
            



            <div className="dropdown">
                <span>Menu</span>
                <div className="dropdown-content">
                <p>View Orders</p>
                <p>Edit Profile</p>
                <p><a href="/">Log Out</a></p>
                </div>
                </div>
            
        </nav>
    
    </header>
  )
}

export default BakeryNavBar