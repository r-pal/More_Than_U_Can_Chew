import React from 'react'
import MenuItem from './MenuItem'
import UserNavBar from './UserNavBar'
import Basket from './Basket'
import { Link } from 'react-router-dom'

function UserBakeryDetails({selectedUser, selectedBakery, bakeries, handleDelete, orders, items, images, selectedOrder, setSelectedOrder, handlePostOrder, basket, setBasket, setSelectedBakery}) {

    

    const menuItem = items.map((item, index) => {
        if (item.bakeryId === selectedBakery.id){
            return <MenuItem item={item} key={index} images={images} basket={basket} setBasket={setBasket}/>
        }
    })

  return (
      <>
        <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
        <div className="UserBakeryDetails">
            <h1>{selectedBakery.name}</h1>
            <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"basket"}><button className='ButtonUser' type="button">Basket</button></Link>
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