import React from 'react'

const BakeryListItem = ({bakery}) => {


  return (
    <li>
        <p>
            {bakery.name}
        </p>
        <p>
            {bakery.id}
        </p>
        <p>
            {bakery.orders}
        </p>
    </li>
  )
}

export default BakeryListItem