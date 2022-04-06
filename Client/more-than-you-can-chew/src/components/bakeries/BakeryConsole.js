import React from 'react';
import BakeryOrder from './BakeryOrder';


const BakeryConsole = ({selectedBakery}) => {



    

    // function to map over Bakery.orders

  return (
      <>
      <h1>{selectedBakery.name}</h1>
      <h3>Bakery ID: {selectedBakery.id}</h3>
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