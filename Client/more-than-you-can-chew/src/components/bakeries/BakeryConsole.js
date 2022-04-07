import React from 'react';
import BakeryOrder from './BakeryOrder';
import "../stylesheets/Main.css";


const BakeryConsole = ({selectedBakery}) => {




  return (
      <>
      <h1>{selectedBakery.name.replace(/"/g, '')}</h1>
      <h3>Bakery ID: {selectedBakery.id}</h3>
      <h3>Location: {selectedBakery.location.replace(/"/g, '')}</h3>
      <h3>email: {selectedBakery.email.replace(/"/g, '')}</h3>
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