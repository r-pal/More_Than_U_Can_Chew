import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";


const BakeryItem = ({selectedItem}) => {



return(
    <div className='BakeryItemsContainer'>
        <h2>
            Item Details
        </h2>
        <ul >
            Name: {selectedItem.name}
            Allergens: {selectedItem.allergens}
            Quantity: {selectedItem.quantity}
            {selectedItem.imageId}
        </ul>
    </div>
)

export default BakeryItem;