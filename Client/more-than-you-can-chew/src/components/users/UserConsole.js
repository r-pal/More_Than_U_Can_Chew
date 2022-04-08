import React from 'react'
import BakeriesNearYou from './BakeriesNearYou'
import "../stylesheets/Main.css";
import UserNavBar from './UserNavBar';

function UserConsole({selectedUser, bakeries}) {


  if(selectedUser.name){
    return (
      <>
      <UserNavBar selectedUser={selectedUser}/>
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