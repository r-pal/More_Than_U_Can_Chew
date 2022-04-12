import React from 'react'
import MenuItem from './MenuItem'
import UserNavBar from './UserNavBar'
import Basket from './Basket'
import { Link } from 'react-router-dom'
import { logDOM } from '@testing-library/react'

function UserBakeryDetails({selectedUser, selectedBakery, bakeries, 
    handleDelete, orders, items, images, selectedOrder, setSelectedOrder, 
    handlePostOrder, basket, setBasket, setSelectedBakery, fetchOrders, setOrders, setSelectedItem}) {

    

    const menuItem = items.map((item, index) => {
        if (item.bakeryId === selectedBakery.id){
            return <MenuItem item={item} key={index} images={images} basket={basket} 
            setBasket={setBasket} selectedUser={selectedUser} handlePostOrder={handlePostOrder} 
            selectedBakery={selectedBakery} orders={orders} setSelectedItem={setSelectedItem}/>
        }
    })

    const handlePutOrderInState = () => {
        let currentOrder = orders[orders.length - 1]
        setSelectedOrder(currentOrder)

    }

    console.log("selected Order" + selectedOrder);


    const emptyBasket = () => {
        setBasket([])
    }


  return (
      <>
        <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
        <div className="UserBakeryDetails">
            <h1>{selectedBakery.name}</h1>
            <button className='ButtonUser' type="button" onClick={emptyBasket}>Empty Basket</button>

            <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"basket"}><button className='ButtonUser' type="button" onClick={handlePutOrderInState}>Basket</button></Link>
            {/* <Basket basket={basket} setBasket={setBasket} items={items}/> */}
            <h2>Menu</h2>

            <ul>
                {menuItem}
            </ul>

        </div>

      </>
  )
}

export default UserBakeryDetails