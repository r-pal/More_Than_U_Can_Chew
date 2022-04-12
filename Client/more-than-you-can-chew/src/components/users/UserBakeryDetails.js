import React from 'react'
import MenuItem from './MenuItem'
import UserNavBar from './UserNavBar'

function UserBakeryDetails({selectedUser, selectedBakery, bakeries, handleDelete, orders, items, images}) {

    const menuItem = items.map((item, index) => {
        if (item.bakeryId === selectedBakery.id){
            return <MenuItem item={item} key={index} images={images}/>
        }
    })

  return (
      <>
        <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
        <div className="UserBakeryDetails">
            <h1>{selectedBakery.name}</h1>
            <h2>Menu</h2>

            <ul>
                {menuItem}
            </ul>

        </div>

      </>
  )
}

export default UserBakeryDetails