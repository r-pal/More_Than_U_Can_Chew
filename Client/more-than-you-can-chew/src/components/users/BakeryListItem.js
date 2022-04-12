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
      <li className="bakeriesNearContainer">
        <h2>{bakery.name}</h2>
      <h3>Location: {bakery.location}</h3>
      <h3>email: {bakery.email}</h3>
      <h3>Collection Time: {bakery.collectionTime}</h3>
      </li></Link>
      <div className="App">
      <MapBox /> 
    </div>
    
    </>

  )
}

export default BakeryListItem