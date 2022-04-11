import React from 'react'
import "../stylesheets/Main.css";
import BakeryOrderListItem from './BakeryOrderListItem';

const BakeryOrder = ({selectedBakery}) => {

  const bakeryOrderListitems = selectedBakery.orders.map((order, index) => {
    return <BakeryOrderListItem order={order} key={index} />
  })
  

  return (
    <div className='Bakery-Order'>
      <h2>Orders</h2>
      <ul>
        {bakeryOrderListitems}
      </ul>
       
       
    </div>
  )
}

export default BakeryOrder