import React, { useEffect, useState } from 'react'

function BakeryOrderListItem({order, users, items, handleOrderUpdate}) {

  const bakeryOrderItemsOrdered = items.map((item, index) => {
    if (item.orderId === order.id){
    return <li>{item.name}</li>}
  })

  const customer = users.map((user, index) => {
    if (user.id === order.userId){
      return user.name
    }
  })

  // let orderCollectedButton = "";
  let collected = "";
  if(order.collectedStatus){
    collected = <h3>Collected</h3>
  }else{
    collected = <h4>Awaiting Collection</h4>
    // orderCollectedButton = <button type="button" onClick={handleClick}>Order Collected</button>
  }

  const handleClick = (event) => {
    event.preventDefault();
    console.log("collected button clicked");
    console.log("new order " + newOrder.collectedStatus);

    handleOrderUpdate(newOrder)

  }

  const [newOrder, setNewOrder] = useState({
    bakeryId: order.bakeryId,
      userId: order.userId,
      id: order.id,
      collectedStatus: true
  })

  // useEffect(() => {
  //   let copiedItem = {
  //     bakeryId: order.bakeryId,
  //     userId: order.userId,
  //     id: order.id,
  //     collectedStatus: true
  //   }
  //   setNewOrder(copiedItem)
  // }, [])


  return (
    <div>
      <p>Order id: {order.id}</p>
      <p>Customer Name: {customer}</p>
      <p>Items:</p>
      <ul>
        {bakeryOrderItemsOrdered}
      </ul>
      {collected}
      {/* {orderCollectedButton} */}
      <button type="button" onClick={handleClick}>Order Collected</button>
      </div>
  )
}

export default BakeryOrderListItem;