import React from 'react'
import BakeriesNearYou from './BakeriesNearYou'
import "../stylesheets/Main.css";

function UserConsole({selectedUser, bakeries}) {


  if(selectedUser.name){
    return (
      <div className='UserConsoleContainer'>
        <h2>Hi {selectedUser.name.replace(/"/g, '')}</h2>
        <BakeriesNearYou bakeries={bakeries}/>
  
      </div>
    )
  }else{
    return(
      <p>Loading.....</p>
    )
  }


}

export default UserConsole