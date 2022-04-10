import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";


const BakeryItem = ({item}) => {



return(
    <div className='BakeryItemsContainer'>
        <ul >
            <b>{item.name}</b>
            <li>Allergens: {item.allergens}</li>
            <li>Quantity available: {item.quantity}</li>
            {item.imageId}
            {/* <li><img src={item.imageId}></img></li> */}
            <br></br>
        </ul>
    </div>
)
}

export default BakeryItem