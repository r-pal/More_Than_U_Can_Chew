import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";
import BakeryItem from './BakeryItem';
import Image from './Image';

const showBakeryItems = ({selectedBakery, images, items, selectedItem, onUpdate, setSelectedItem}) => {

    const findBakeryItemsOfBakery = items.map((item, index) => {
        if (item.bakeryId === selectedBakery.id){
        return <BakeryItem item={item} key={index} images={images} selectedItem={selectedItem} onUpdate={onUpdate} setSelectedItem={setSelectedItem}/>}
        // else{
        //     return "booo"
        // }
    })




return(
    <div className='ShowBakeryItemsContainer'>
        <h2>
            Items Available
        </h2>
        <ul >
            {findBakeryItemsOfBakery}
        </ul>

    </div>
)}


export default showBakeryItems;