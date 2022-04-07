import React from 'react'
import BakeryListItem from './BakeryListItem'
import "../stylesheets/Main.css";

const BakeriesNearYou = ({bakeries}) => {

    const bakeryListitems = bakeries.map((bakery, index) => {
        return <BakeryListItem bakery={bakery} key={index} />

    })

  return (
    <div className='BakeriesNearYouContainer'>
        <h2>
            Bakeries Near You
        </h2>
        <ul>
            {bakeryListitems}
        </ul>

    </div>
  )
}

export default BakeriesNearYou;