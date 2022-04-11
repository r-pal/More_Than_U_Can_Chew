import React from 'react'

function BakeryOrderListItem({order}) {

  const bakeryOrderItemsOrdered = order.itemsOrdered.map((item, index) => {
    return <li>{item.name}</li>
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
      <p>Customer Name: {order.user.name}</p>
      <p>Items:</p>
      <ul>
        {bakeryOrderItemsOrdered}
      </ul>
      <h4>{collected}</h4>
      </div>
  )
}

export default BakeryOrderListItem;