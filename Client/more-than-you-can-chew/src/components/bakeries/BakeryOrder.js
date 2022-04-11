import React from 'react'
import "../stylesheets/Main.css";
import BakeryOrderListItem from './BakeryOrderListItem';

const BakeryOrder = ({selectedBakery, orders, users, items}) => {

  const bakeryOrderListitems = orders.map((order, index) => {
    if(order.bakeryId === selectedBakery.id){
    return <BakeryOrderListItem items={items} users={users} order={order} key={index} />
    }
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