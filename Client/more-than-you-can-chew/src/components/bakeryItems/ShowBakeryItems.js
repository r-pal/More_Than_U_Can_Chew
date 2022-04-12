import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";
import BakeryItem from './BakeryItem';
import Image from './Image';
import BakeryNavBar from '../bakeries/BakeryNavBar';

const showBakeryItems = ({selectedBakery, images, items}) => {

    const findBakeryItemsOfBakery = items.map((item, index) => {
        if (item.bakeryId === selectedBakery.id){
        return <BakeryItem item={item} key={index} images={images}/>}
        // else{
        //     return "booo"
        // }
    })




return(
    <>
    <BakeryNavBar selectedBakery={selectedBakery}/>
    <div className='ShowBakeryItemsContainer'>
        <h2>
            Items Available
        </h2>
        <ul >
            {findBakeryItemsOfBakery}
        </ul>

    </div>
    </>
)}


export default showBakeryItems;