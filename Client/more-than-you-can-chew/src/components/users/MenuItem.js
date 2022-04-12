import React from 'react'

function MenuItem({item, images, selectedOrder, basket, setBasket}) {

    const getImageUrl = images.map((image, index) => {
        console.log("Image" + image.id)
        console.log("Item" + item.imageId)
        if (image.id === item.imageId){
            return image.imageUrl
        }
    })

    let imageString = getImageUrl.join('')

    const addToOrder = () => {
        let copyBasket = [...basket]
        copyBasket.push(item.id)
        setBasket(copyBasket)        
        console.log("basket:" + basket)
    
    }  


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