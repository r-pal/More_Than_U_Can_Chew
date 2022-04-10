import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";
import Image from './Image';


const BakeryItem = ({item, images}) => {

    const getImages = images.map((image, index) => {
        return <Image image={image} key={index}/>
    })

return(
    <div className='BakeryItemsContainer'>
        <ul >
            <b>{item.name}</b>
            <li>Allergens: {item.allergens}</li>
            <li>Quantity available: {item.quantity}</li>
            <li>ImageId(bakeryitem):{item.imageId}</li>

{getImages}
            <br></br>
        </ul>
    </div>
)
}

export default BakeryItem