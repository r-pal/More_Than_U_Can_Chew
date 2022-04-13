import React from 'react'
import "../stylesheets/Main.css";
import BakeryItem from './BakeryItem';
import BakeryNavBar from '../bakeries/BakeryNavBar';


const ShowBakeryItems = ({selectedBakery, images, items, selectedItem, onUpdate, setSelectedItem}) => {

    const findBakeryItemsOfBakery = items.map((item, index) => {
        if (item.bakeryId === selectedBakery.id){
        return <BakeryItem item={item} key={index} images={images} selectedItem={selectedItem} onUpdate={onUpdate} setSelectedItem={setSelectedItem}/>}
    })




return(
    <>
    <BakeryNavBar selectedBakery={selectedBakery}/>
    <div className='UserBakeryDetails'>
        <h1 className="CenteredText">
            Items Available
        </h1>
        <ul >
            {findBakeryItemsOfBakery}
        </ul>

    </div>
    </>
)}


export default ShowBakeryItems;