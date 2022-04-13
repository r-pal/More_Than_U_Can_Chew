import React from 'react'
import "../stylesheets/Main.css";
import BakeryOrderListItem from './BakeryOrderListItem';
import BakeryNavBar from './BakeryNavBar';
import BakeryOrderListItemCollected from './BakeryOrderListItemCollected';

const BakeryOrder = ({selectedBakery, orders, users, items, handleOrderUpdate}) => {



  const bakeryOrderListitemsAwaiting = orders.map((order, index) => {
    if(order.bakeryId === selectedBakery.id && order.collectedStatus != true){
    return <BakeryOrderListItem items={items} users={users} order={order} key={index} handleOrderUpdate={handleOrderUpdate}/>
    }


  })


  const bakeryOrderListitemsCollected = orders.map((order, index) => {
    if(order.bakeryId === selectedBakery.id && order.collectedStatus == true){
    return <BakeryOrderListItemCollected items={items} users={users} order={order} key={index} handleOrderUpdate={handleOrderUpdate}/>
    }

  })
  

  return (
    <>
    <BakeryNavBar selectedBakery={selectedBakery}/>
    <div className='Bakery-Order'>
      <h2>Current Orders</h2>
      <ul>
        {bakeryOrderListitemsAwaiting}
      </ul>

      <h2>Previous Orders</h2>
      <ul>
        {bakeryOrderListitemsCollected}
      </ul>
       
       
    </div>
    </>
  )
}

export default BakeryOrder;