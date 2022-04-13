import React from 'react'
import "../stylesheets/Main.css";
import {Link} from 'react-router-dom';
import MapBox from '../maps/MapBox';


const BakeryListItem = ({bakery, selectedUser, setSelectedBakery, images}) => {

  const handleClick = () => {
    setSelectedBakery(bakery)
  }


  return (
    <>
    <Link selectedUser={selectedUser} onClick={handleClick} className="navBarLink" style={{textDecoration:"none"}} to={"bakery"}>
      <li>
        <h2>{bakery.name}</h2>
      <span>Location: {bakery.location}</span><br/>
      <span>email: {bakery.email}</span><br/>
      <span>Collection Time: {bakery.collectionTime}</span>
      </li></Link>
      <div className="App">
      <MapBox bakery={bakery} selectedUser={selectedUser}/> 
    </div>
    
    </>

  )
}

export default BakeryListItem