import React from 'react'
import "../stylesheets/Main.css";

function UserNavBar({selectedUser, handleDelete}) {

let id = selectedUser.id

const handleDelete2 = (id) => {
  handleDelete(id);
}




  return (
    <header>
<h3>{'>'}U_Can_Chew</h3>
<h2>{selectedUser.name.replace(/"/g, '')}</h2>
<nav>
            



            <div className="dropdown">
                <span>Menu</span>
                <div className="dropdown-content">
                <p>View Orders</p>
                <p>Edit Profile</p>
                <p><a href="/">Log Out</a></p>
                <p onClick={handleDelete2}>Delete User</p>
                </div>
                </div>
            
        </nav>
    
    </header>
  )
}

export default UserNavBar