import React from 'react'

const BakeryOrder = ({selectedBakery}) => {
  

  return (
    <div className='Bakery-Order'>
       <p>Order No.</p>
       <p>items: {selectedBakery.orders}</p>
       <p>collection time: </p>
       
    </div>
  )
}

export default BakeryOrder