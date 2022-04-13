import React from 'react'
import "../stylesheets/Main.css";
import {Link} from 'react-router-dom';
import MapBox from '../maps/MapBox';
import "../stylesheets/Main.css";


const BakeryListItem = ({bakery, selectedUser, setSelectedBakery, images}) => {

  const handleClick = () => {
    setSelectedBakery(bakery)
  }


  return (
    <>
    <Link selectedUser={selectedUser} onClick={handleClick} className="navBarLink" style={{textDecoration:"none"}} to={"bakery"}>
      
      <li>
        <h2>{bakery.name}</h2>
      <p>Location: {bakery.location}</p>
      <p>email: {bakery.email}</p>
      <p>Collection Time: {bakery.collectionTime}</p>
      </li></Link>
      <div className="App">
      <MapBox bakery={bakery} selectedUser={selectedUser}/> 
    </div>
    
    </>

  )
}

export default BakeryListItem