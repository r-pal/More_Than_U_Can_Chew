import React, {useState} from 'react'
import UserNavBar from './UserNavBar'
import { Link } from 'react-router-dom'

function Basket({basket, setBasket, items, selectedUser, handleDelete, selectedBakery, handlePostOrder}) {


    const basketItem = basket.map((basketItem, index) => {
        return items.map((item, index) => {
            if (item.id === basketItem){
                return item.name
            }
        })
    })

    const [newOrder, setNewOrder] = useState({
        bakeryId: selectedBakery.id,
        userId: selectedUser.id,
        collectedStatus: false
    }, [])

    const handleOrderPost = (event) => {
        event.preventDefault();
        handlePostOrder(newOrder)
    }




  return (
    <div>
        <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
        <div>Items in basket: {basket}</div>
        <ul>{basketItem}</ul>

        <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"basket"}><button className='ButtonUser' type="button" onClick={handleOrderPost}>Order</button></Link>

    <ul>

        
        
    </ul>
    </div>
  )
}

export default Basket