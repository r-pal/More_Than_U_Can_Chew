import React from 'react'

function BakeryNavBar({selectedBakery}) {
  return (
    <header>
<h3>Welecome to >U_Can_Chew</h3>
      <ul>
        <li className="navLink">
          <p>Edit Details</p>
        </li>
        <li className="navLink">
          <p>View Orders</p>
        </li>
        <li className="navLink">
          <p>Log Out</p>
        </li>

      </ul>
    </header>
  )
}

export default BakeryNavBar