import React, {useState} from 'react'
import UserNavBar from './UserNavBar'
import { Link } from 'react-router-dom'

function Basket({basket, setBasket, items, selectedUser, handleDelete, selectedBakery, handlePostOrder, selectedOrder, onUpdateItem}) {


    const basketItem = basket.map((basketItem, index) => {
        return items.map((item, index) => {
            if (item.id === basketItem){
                return item.name
            }
        })
    })

    console.log(basket)

    const handleOrderSubmit = () => { basket.map((basketItem, index) => {
        return items.map((item, index) => {
            if (item.id === basketItem){
                setNewItem(item)
                onUpdateItem(newItem)
            }
        })
    })
}

    // const addObjectId()

    const [newItem, setNewItem] = useState({
        orderId: selectedOrder.id})

    // useEffect(() => {
    //     if(selectedItem){
    //       let copiedItem = {...selectedItem}
    //       setNewItem(copiedItem)
    //     }
    //   }, [selectedItem])

  

//   const handleOrderSubmit = (event) => {
//     event.preventDefault();

//     onUpdateItem(newItem)
//   }


  return (
    <div>
        <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
        <div>Items in basket: {basket}</div>
        <p>{selectedOrder.id}</p>
        <ul>{basketItem}</ul>
    

        <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"basket"}><button className='ButtonUser' type="button" onClick={handleOrderSubmit}>Order</button></Link>

    <ul>

        
        
    </ul>
    </div>
  )
}

export default Basket