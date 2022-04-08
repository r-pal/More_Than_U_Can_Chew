import React from 'react'
import BakeriesNearYou from './BakeriesNearYou'
import "../stylesheets/Main.css";
import UserNavBar from './UserNavBar';
import {Link, Navigate, useNavigate} from 'react-router-dom';


function UserConsole({selectedUser, bakeries}) {


  if(selectedUser.name){
    return (
      <>
      <UserNavBar selectedUser={selectedUser}/>
      <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"edit"}><button type="button">Edit User</button></Link>

      <div className='UserConsoleContainer'>
        <BakeriesNearYou bakeries={bakeries}/>
  
      </div>
      </>
    )
  }else{
    return(
      <p>Loading.....</p>
    )
  }


}

export default UserConsole