import React, {useState, useEffect}from 'react'

function MenuItem({item, images, selectedOrder, basket, setBasket, selectedBakery, selectedUser, handlePostOrder, orders, setSelectedItem, selectedItem, onUpdateItem}) {

    const getImageUrl = images.map((image, index) => {
        if (image.id === item.imageId){
            return image.imageUrl
        }
    })

    let imageString = getImageUrl.join('')

    const addToOrder = () => {
        console.log("basket " + basket)
        if (basket.length === 0){
        console.log("new basket")
        let copyBasket = [...basket]
        copyBasket.push(item.id)
        setBasket(copyBasket)
        setSelectedItem(item)
        handlePostOrder(newOrder, selectedUser.id)
        console.log(orders)}
            
        else{let copyBasket = [...basket]
            copyBasket.push(item.id)
            setBasket(copyBasket)
        console.log("existing basket");}
        
    
    }

    const reduceItemQuantity = () => {
        onUpdateItem(newItem)

    }

    const [newItem, setNewItem] = useState({
        name: "",
        allergens: "",
        imageId: 0,
        bakeryId: 0,
        quantity: 0,

      })

      useEffect(() => {
        if(selectedItem){
          let copiedItem = {
            name: selectedItem.name,
            allergens: selectedItem.allergens,
              imageId: selectedItem.imageId,
              bakeryId: selectedItem.bakeryId,
              quantity: selectedItem.quantity - 1,
          }
          setNewItem(copiedItem)
        }
      }, [selectedItem])

      useEffect(() => {
          onUpdateItem(newItem)
      }, [newItem])

//     const handleChange = (event) => {
//         event.preventDefault();
//       let propertyName = event.target.name
//       let copiedItem = {...newItem};
//       copiedItem[propertyName] = event.target.value;
//       setNewItem(copiedItem);

//   }

  const handleSubmit = (event) => {
    event.preventDefault();

    onUpdateItem(newItem)
  }

   

    const [newOrder, setNewOrder] = useState({
        bakeryId: selectedBakery.id,
        userId: selectedUser.id,
        collectedStatus: false
    }, [])





  return (
    <div className='list-margin'>
        <li>
          <div className="minus3margin">
            <h3>{item.name}</h3>
            <p>Allergens: {item.allergens}</p>
            </div>
            <img src={imageString} width="100" height="100"/>
            <br></br>
            <button onClick={addToOrder}>Add to basket</button>
        </li>
    </div>
  )
}

export default MenuItem