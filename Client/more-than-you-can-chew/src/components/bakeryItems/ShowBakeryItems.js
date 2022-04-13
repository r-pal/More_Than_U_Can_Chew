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
    <div className='ShowBakeryItemsContainer'>
        <h2>
            Items Available
            {/* <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" style="width: 75%"></div> */}
        </h2>
        <ul >
            {findBakeryItemsOfBakery}
        </ul>

    </div>
    </>
)}


export default ShowBakeryItems;