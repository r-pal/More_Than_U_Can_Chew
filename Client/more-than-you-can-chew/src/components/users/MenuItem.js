import React, {useState}from 'react'

function MenuItem({item, images, selectedOrder, basket, setBasket, selectedBakery, selectedUser, handlePostOrder, orders}) {

    const getImageUrl = images.map((image, index) => {
        // console.log("Image" + image.id)
        // console.log("Item" + item.imageId)
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
        handlePostOrder(newOrder, selectedUser.id)
        console.log(orders)}
            
        else{let copyBasket = [...basket]
            copyBasket.push(item.id)
            setBasket(copyBasket)
        console.log("existing basket");}
        
    
    }

   

    const [newOrder, setNewOrder] = useState({
        bakeryId: selectedBakery.id,
        userId: selectedUser.id,
        collectedStatus: false
    }, [])





  return (
    <div>
        <li>
            <h4>{item.name}</h4>
            <p>Allergens: {item.allergens}</p>
            <img src={imageString} width="100" height="100"/>
            <button onClick={addToOrder}>Add to basket</button>
        </li>
    </div>
  )
}

export default MenuItem