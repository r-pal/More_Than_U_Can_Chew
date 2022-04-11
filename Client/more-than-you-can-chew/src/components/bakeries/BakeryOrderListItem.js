import React from 'react'

function BakeryOrderListItem({order, users, items}) {

  const bakeryOrderItemsOrdered = items.map((item, index) => {
    if (item.orderId === order.id){
    return <li>{item.name}</li>}
  })

  const customer = users.map((user, index) => {
    if (user.id === order.userId){
      return user.name
    }
  })

  let collected = "";
  if(order.collectedStatus){
    collected = "Collected"
  }else{
    collected = "Awaiting Collection"
  }

  return (
    <div>
      <p>Order id: {order.id}</p>
      <p>Customer Name: {customer}</p>
      <p>Items:</p>
      <ul>
        {bakeryOrderItemsOrdered}
      </ul>
      <h4>{collected}</h4>
      </div>
  )
}

export default BakeryOrderListItem;