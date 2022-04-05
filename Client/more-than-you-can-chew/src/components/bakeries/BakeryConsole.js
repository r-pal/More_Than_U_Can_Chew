import React from 'react';
import BakeryOrder from './BakeryOrder';


const BakeryConsole = () => {

    const bakeryName = 'Tams Cakes'
    const bakeryDescription = 'Small independent bakers, specialising in cakes!'

    // function to map over Bakery.orders

  return (
      <>
      <h1>{bakeryName}</h1>
      <h3>{bakeryDescription}</h3>
      <div className='orders-container'>
      <ul>
        <li>
            <BakeryOrder />
        </li>
      </ul>

      </div>
    </>
  )
}

export default BakeryConsole