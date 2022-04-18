import React, {useState} from 'react'
import "../stylesheets/Main.css";
import { Link } from 'react-router-dom';

const BakeryItem = ({item, images, selectedItem, setSelectedItem}) => {

    const getImageUrl = images.map((image, index) => {
        if (image.id === item.imageId){
            return image.imageUrl
        }
    })

    let imageString = getImageUrl.join('')

    const handleClick = () => {
        setSelectedItem(item)
    }


return(
    <div className='list-margin'>
        <li>
            <div className="minus3margin">
            <h3>{item.name}</h3>
            <p>Allergens: {item.allergens}</p>
            </div>
            <img src={imageString} height="100" width="100" alt="Bakery Item"/>
            {/* <li>Quantity available: {item.quantity}</li> */}
            <br></br>
            <Link style={{textDecoration:"none"}} to={":id/edit"}><button type="button" onClick={handleClick}>Edit {item.name}</button></Link>

        </li>
    </div>
)
}

export default BakeryItem