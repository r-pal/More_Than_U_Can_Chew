import React from 'react';
import BakeryOrder from './BakeryOrder';
import "../stylesheets/Main.css";
import CreateBakeryItem from '../bakeryItems/CreateBakeryItem';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';
import BakeryNavBar from './BakeryNavBar';



const BakeryConsole = ({selectedBakery}) => {


  let url = "/bakeryitems"

  return (
      <>
      <BakeryNavBar selectedBakery={selectedBakery}/>
      <h3>Bakery ID: {selectedBakery.id}</h3>
      <h3>Location: {selectedBakery.location.replace(/"/g, '')}</h3>
      <h3>email: {selectedBakery.email.replace(/"/g, '')}</h3>
      <div className='CreateNewItemButton'>
      <Link style={{textDecoration:"none"}} className="ButtonContainer" to={url}><button className='ButtonItem' type="button">Create Bakery Item</button></Link>
      </div>
      <div className='orders-container'>
      <ul>
        <li>
            <BakeryOrder selectedBakery={selectedBakery}/>
        </li>
      </ul>

      </div>
    </>
  )
}

export default BakeryConsole