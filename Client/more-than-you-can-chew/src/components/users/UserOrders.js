import React from 'react'
import UserOrderListItem from './UserOrderListItem'
import UserNavBar from './UserNavBar'
import UserOrderListItemPrevious from './UserOrderListItemPrevious'

function UserOrders({selectedUser, bakeries, orders, items, handleDelete}) {

    const userOrderListitems = orders.map((order, index) => {
      if (order.userId === selectedUser.id && order.collectedStatus != true){
        return <UserOrderListItem items={items} order={order} key={index} bakeries={bakeries}/>
      }
      })

      const userOrderListitemsPrevious = orders.map((order, index) => {
        if (order.userId === selectedUser.id && order.collectedStatus == true){
          return <UserOrderListItemPrevious items={items} order={order} key={index} bakeries={bakeries}/>
        }
        })

  return (
    <>
    <UserNavBar selectedUser={selectedUser}/>
    <div className="User-order">
        <h2>Current Orders</h2>
        <ul>
            {userOrderListitems}
        </ul>

        <hr></hr><h2>Previous Orders</h2>
        <ul>
            {userOrderListitemsPrevious}
        </ul>
    </div>
    </>
  )
}

export default UserOrders