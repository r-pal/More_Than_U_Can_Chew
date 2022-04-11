import React from 'react'
import UserOrderListItem from './UserOrderListItem'

function UserOrders({selectedUser, bakeries, orders, items}) {

    const userOrderListitems = orders.map((order, index) => {
      if (order.userId === selectedUser.id){
        return <UserOrderListItem items={items} order={order} key={index} bakeries={bakeries}/>
      }
      })

  return (
    <div className="User-order">
        <h2>Orders</h2>
        <ul>
            {userOrderListitems}
        </ul>
    </div>
  )
}

export default UserOrders