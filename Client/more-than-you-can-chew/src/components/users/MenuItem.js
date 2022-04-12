import React from 'react'

function MenuItem({item, images}) {

    const getImageUrl = images.map((image, index) => {
        console.log("Image" + image.id)
        console.log("Item" + item.imageId)
        if (image.id === item.imageId){
            return image.imageUrl
        }
    })

    let imageString = getImageUrl.join('')


  return (
    <div>
        <li>
            <h4>{item.name}</h4>
            <p>Allergens: {item.allergens}</p>
            <img src={imageString} />
        </li>
    </div>
  )
}

export default MenuItem