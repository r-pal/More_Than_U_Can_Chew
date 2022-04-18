import React, { useEffect, useState } from 'react'
import "../stylesheets/Main.css";


function BakeryOrderListItemCollected({order, users, items, handleOrderUpdate}) {

  const bakeryOrderItemsOrdered = items.map((item, index) => {
    if (item.orderId === order.id){
      return item.name
      }})

  const customer = users.map((user, index) => {
    if (user.id === order.userId){
      return user.name
    }
  })

  let collected = "";
  if(order.collectedStatus){
    collected = <h3>Collected</h3>

  }else{
    collected = <h4>Awaiting Collection</h4>
  }


  const [newOrder, setNewOrder] = useState({
    bakeryId: order.bakeryId,
      userId: order.userId,
      id: order.id,
      collectedStatus: true
  })

  return (
    <div>
      <p>Order id: {order.id}</p>
      <p>Customer Name: {customer}</p>
      <p>Items: {bakeryOrderItemsOrdered}</p>

      {collected}
      
      </div>
  )
}

export default BakeryOrderListItemCollected;