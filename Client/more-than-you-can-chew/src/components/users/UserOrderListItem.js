import React from 'react'
import "../stylesheets/Main.css";


function UserOrderListItem({order, bakeries, items}) {

    const orderBakery = bakeries.map((bakery, index) => {
      if(bakery.id === order.bakeryId){
        return bakery.name
      }

    })

      

    const userOrderItemsOrdered = items.map((item, index) => {
      if(item.orderId === order.id){
        return item.name
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
      <p>Bakery: {orderBakery}</p>
      <p>Items: {userOrderItemsOrdered}</p>
      <h4>{collected}</h4>
    </div>
  )
}

export default UserOrderListItem