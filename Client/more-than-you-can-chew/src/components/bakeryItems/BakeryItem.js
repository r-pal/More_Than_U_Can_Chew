import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";
import Image from './Image';
import { unstable_renderSubtreeIntoContainer } from 'react-dom';



const BakeryItem = ({item, images}) => {

    const getImageUrl = images.map((image, index) => {
        console.log("Image" + image.id)
        console.log("Item" + item.imageId)
        if (image.id === item.imageId){
            return image.imageUrl
        }
    })

    let imageString = getImageUrl.join('')


return(
    <div className='BakeryItemsContainer'>
        <ul >
            <b>{item.name}</b>
            <li>Allergens: {item.allergens}</li>
            <li>Quantity available: {item.quantity}</li>
            <li>ImageId(bakeryitem):{item.imageId}</li>
            <br></br>{getImageUrl}
            {/* <br></br>{imageString} */}
            <img src={imageString} />
        </ul>
    </div>
)
}

export default BakeryItem