import React, {useState} from 'react'
import "../stylesheets/Main.css";
import { Link } from 'react-router-dom';

const BakeryItem = ({item, images, selectedItem, setSelectedItem}) => {

    const getImageUrl = images.map((image, index) => {
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
            <br></br>
            <img src={imageString} height="100" width="100" alt="Bakery Item"/>
            <li>Allergens: {item.allergens}</li>
            <li>Quantity available: {item.quantity}</li>

            <Link style={{textDecoration:"none"}} className="ButtonContainer" to={":id/edit"}><button className='ButtonEdit' type="button" onClick={handleClick}>Edit {item.name}</button></Link>

        </ul>
    </div>
)
}

export default BakeryItem