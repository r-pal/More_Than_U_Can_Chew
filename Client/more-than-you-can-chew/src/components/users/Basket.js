import React, {useState, useEffect} from 'react'
import UserNavBar from './UserNavBar'
import { Link } from 'react-router-dom'
import NumericInput from 'react-numeric-input';

function Basket({basket, setBasket, items, selectedUser, handleDelete, selectedBakery, handlePostOrder, selectedOrder, onUpdateItem, selectedItem, onCreateItem}) {


    const basketItem = basket.map((basketItem, index) => {
        return items.map((item, index) => {
            if (item.id === basketItem){
                return item.name
            }
        })
    })

    const [newItem, setNewItem] = useState({
        name: "",
        allergens: "",
        imageId: 0,
        bakeryId: 0,
        quantity: 0,
        orderId: selectedOrder.id

      }, [])

      useEffect(() => {
        if(selectedItem){
          let copiedItem = {
              name: selectedItem.name,
              allergens: selectedItem.allergens,
                imageId: selectedItem.imageId,
                bakeryId: selectedItem.bakeryId,
                quantity: selectedItem.quantity,
                orderId: selectedOrder.id + 1

          }
          setNewItem(copiedItem)
        }
      }, [])

      console.log("new item: " + newItem);
      console.log("new item name " + newItem.name);
      console.log("new item orderID: " + newItem.orderId);


      console.log("id: " + selectedOrder.id)

//     const handleChange = (event) => {
//         event.preventDefault();
//       let propertyName = event.target.name
//       let copiedItem = {...newItem};
//       copiedItem[propertyName] = event.target.value;
//       setNewItem(copiedItem);

//   }

  const handleOrderSubmit = (event) => {
    event.preventDefault();

    onCreateItem(newItem)

    // onUpdateItem(newItem)
  }

//     console.log(basket)

//     const handleOrderSubmit = () => { basket.map((basketItem, index) => {
//         return items.map((item, index) => {
//             if (item.id === basketItem){
//                 setNewItem(item)
//                 onUpdateItem(newItem)
//             }
//         })
//     })
// }

//     // const addObjectId()

//     const [newItem, setNewItem] = useState({
//         orderId: selectedOrder.id})

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

        {/* <form onSubmit={handleOrderSubmit}>
        
                    <input type="text" placeholder='Name' name='name' onChange={handleChange} value={newItem.name}/>
                    <input type="number" placeholder='Quantity' name='quantity' onChange={handleChange} value={newItem.quantity}/>
                    <button type="submit">Place Order</button>
                
                </form>  */}

                <button className='ButtonUser' type="button" onClick={handleOrderSubmit}>Order</button>
    

        {/* <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"/users/:id"}><button className='ButtonUser' type="button" onClick={handleOrderSubmit}>Order</button></Link> */}

    <ul>

        
        
    </ul>
    </div>
  )
}

export default Basket