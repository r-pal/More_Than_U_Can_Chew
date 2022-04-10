import React from 'react'

function UserOrderListItem({order, bakeries}) {

    const orderBakery = bakeries.map((bakery, index) => {
        return bakery.orders.map((bakeryOrder, index) => {
            if (bakeryOrder.id == order.id){
                return bakery.name
            }

        })

    })

    const userOrderItemsOrdered = order.itemsOrdered.map((item, index) => {
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
      <p>Bakery: {orderBakery}</p>
      <p>Items:</p>
      <ul>
        {userOrderItemsOrdered}
      </ul>
      <h4>{collected}</h4>
    </div>
  )
}

export default UserOrderListItem