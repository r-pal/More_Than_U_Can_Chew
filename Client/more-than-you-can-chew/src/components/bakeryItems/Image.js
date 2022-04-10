import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";

const Image = ({image}) => {


    
return(
    <div className='Image'>
        <ul>
            <img src={image.imageUrl}></img>
        </ul>
    </div>
)
}

export default Image