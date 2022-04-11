import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";
import Image from './Image';
import { unstable_renderSubtreeIntoContainer } from 'react-dom';
import { Link } from 'react-router-dom';




const BakeryItem = ({item, images, selectedItem, onUpdate, setSelectedItem}) => {

    const getImageUrl = images.map((image, index) => {
        console.log("Image" + image.id)
        console.log("Item" + item.imageId)
        if (image.id === item.imageId){
            return image.imageUrl
        }
    })

    let imageString = getImageUrl.join('')

    const handleClick = () => {
        setSelectedItem(item)
    }


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
            <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"items/:id/edit"}><button className='ButtonEdit' type="button" onClick={handleClick}>Edit {selectedItem.name}</button></Link>
        </ul>
    </div>
)
}

export default BakeryItem