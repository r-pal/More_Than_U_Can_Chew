import React from 'react'
import BakeriesNearYou from './BakeriesNearYou'
import "../stylesheets/Main.css";
import UserNavBar from './UserNavBar';
import {Link, Navigate, useNavigate} from 'react-router-dom';
import UserOrders from './UserOrders';


function UserConsole({selectedUser, bakeries, handleDelete, setSelectedBakery, orders, items, images}) {


  if(selectedUser.name){
    return (
      <>
      <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
      <div className='UserConsoleContainer'>
        <BakeriesNearYou bakeries={bakeries} selectedUser={selectedUser} setSelectedBakery={setSelectedBakery} images={images}/>
  
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