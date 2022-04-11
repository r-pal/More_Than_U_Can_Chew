import React from 'react'
import BakeryListItem from './BakeryListItem'
import "../stylesheets/Main.css";

const BakeriesNearYou = ({bakeries, selectedUser, setSelectedBakery, images}) => {

    const bakeryListitems = bakeries.map((bakery, index) => {
        return <BakeryListItem bakery={bakery} key={index} selectedUser={selectedUser} setSelectedBakery={setSelectedBakery} images={images}/>

    })

  return (
    <div className='BakeriesNearYouContainer'>
        <h2>
            Bakeries Near You
        </h2>
        <ul >
            {bakeryListitems}
        </ul>

    </div>
  )
}

export default BakeriesNearYou;