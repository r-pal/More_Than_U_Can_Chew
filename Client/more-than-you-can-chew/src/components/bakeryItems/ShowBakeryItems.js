import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";

const showBakeryItemsOfBakery = ({selectedBakery, bakeryItems}) => {


    //find items where selectedBakery.id === items.bakery.id
    const findBakeryItemsOfBakery = bakeryItems.map((item, index, selectedBakery) => {
        item.bakery.id === selectedBakery.id
        return <BakeryItem  />



    })
    
    
    
    bakeries.map((bakery, index) => {


        return <BakeryItem selectedItem={selectedItem} key={index} />

    })



return(
    <div className='ShowBakeryItemsContainer'>
        <h2>
            Items Available
        </h2>
        <ul >
            {}
        </ul>
    </div>
)

export default showBakeryItemsOfBakery;