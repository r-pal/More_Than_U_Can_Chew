import React, {useState, useEffect} from 'react'
import UserNavBar from './UserNavBar'
import { Link } from 'react-router-dom'
import NumericInput from 'react-numeric-input';
import "../stylesheets/Main.css";


function Basket({basket, setBasket, items, selectedUser, handleDelete, selectedBakery, handlePostOrder, selectedOrder, onUpdateItem, selectedItem, onCreateItem}) {


    const basketItem = basket.map((basketItem, index) => {
        return items.map((item, index) => {
            if (item.id === basketItem){
                return <li className="basketItemFontSize">{item.name}</li>
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
const emptyBasket = () => {
  setBasket([])
}


  return (
    <div>
        <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
        <div className="smallMargin">Items in basket: {basket.length}</div>
        {/* <p>{selectedOrder.id}</p> */}
        <ul>{basketItem}</ul>

                <div className="CenteredButton"><button className='ButtonUser' type="button" onClick={handleOrderSubmit}>Place Order</button><br/></div>
                {/* <div className="CenteredButton"><button onclick={history.back()} className='ButtonUser' type="button">Back To Bakery</button><br/></div> */}
                <div className="CenteredButton"><button className='ButtonUser' type="button" onClick={emptyBasket}>Empty Basket</button></div>

        {/* <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"/users/:id"}><button className='ButtonUser' type="button" onClick={handleOrderSubmit}>Order</button></Link> */}

    </div>
  )
}

export default Basket