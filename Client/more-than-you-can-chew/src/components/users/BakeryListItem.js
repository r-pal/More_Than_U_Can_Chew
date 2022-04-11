import React from 'react'
import "../stylesheets/Main.css";
import MapBox from '../maps/MapBox';

const BakeryListItem = ({bakery}) => {


  return (
    <li className="bakeriesNearContainer">
        <h2>{bakery.name}</h2>
      <h3>Location: {bakery.location}</h3>
      <h3>email: {bakery.email}</h3>
      <h3>Collection Time: {bakery.collectionTime}</h3>
      <div className="App">
      <MapBox /> 
    </div>
    </li>
  )
}

export default BakeryListItem