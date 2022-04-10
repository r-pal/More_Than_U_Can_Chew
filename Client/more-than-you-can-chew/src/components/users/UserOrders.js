import React from 'react'
import UserOrderListItem from './UserOrderListItem'

function UserOrders({selectedUser, bakeries}) {

    const userOrderListitems = selectedUser.orders.map((order, index) => {
        return <UserOrderListItem order={order} key={index} bakeries={bakeries}/>
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