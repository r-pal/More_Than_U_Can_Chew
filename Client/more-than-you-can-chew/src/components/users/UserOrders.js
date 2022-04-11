import React from 'react'
import UserOrderListItem from './UserOrderListItem'
import UserNavBar from './UserNavBar'

function UserOrders({selectedUser, bakeries, orders, items, handleDelete}) {

    const userOrderListitems = orders.map((order, index) => {
      if (order.userId === selectedUser.id){
        return <UserOrderListItem items={items} order={order} key={index} bakeries={bakeries}/>
      }
      })

  return (
    <>
    <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
    <div className="User-order">
        <h2>Orders</h2>
        <ul>
            {userOrderListitems}
        </ul>
    </div>
    </>
  )
}

export default UserOrders