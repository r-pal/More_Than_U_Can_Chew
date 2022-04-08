import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";


const BakeryItem = ({item}) => {



return(
    <div className='BakeryItemsContainer'>
        <h2>
            Item Details
        </h2>
        <ul >
            Name: {item.name}
            Allergens: {item.allergens}
            Quantity: {item.quantity}
            {item.imageId}
        </ul>
    </div>
)
}

export default BakeryItem