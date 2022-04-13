import React from 'react'
import "../stylesheets/Main.css";
import BakeryOrderListItem from './BakeryOrderListItem';
import BakeryNavBar from './BakeryNavBar';

const BakeryOrder = ({selectedBakery, orders, users, items, handleOrderUpdate}) => {

  const bakeryOrderListitems = orders.map((order, index) => {
    if(order.bakeryId === selectedBakery.id){
    return <BakeryOrderListItem items={items} users={users} order={order} key={index} handleOrderUpdate={handleOrderUpdate}/>
    }
  })
  

  return (
    <>
    <BakeryNavBar selectedBakery={selectedBakery}/>
    <div className='Bakery-Order'>
      <h2>Orders</h2>
      <ul>
        {bakeryOrderListitems}
      </ul>
       
       
    </div>
    </>
  )
}

export default BakeryOrder