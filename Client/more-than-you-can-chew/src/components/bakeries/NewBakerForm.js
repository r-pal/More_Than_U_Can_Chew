import React from 'react'
import "../stylesheets/Main.css";

function NewBakerForm() {

    const handleSubmit = () => {
        return null
    }
  return (
    <>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder='Bakery Name' name='bakeryName' onChange="handleChangeFunctionHere" value="Bakery Name"/>
                <input type="text" placeholder='Location' name='location' onChange="handleChangeFunctionHere" value="Location"/>
                <input type="text" placeholder='Email' name='email' onChange="handleChangeFunctionHere" value="Email"/>
                <input type="text" placeholder='Collection Time' name='collectionTime' onChange="handleChangeFunctionHere" value="Collection Time"/>

            
                <button type="submit">Save New Bakery</button>
            
            </form>
        </>
  )
}

export default NewBakerForm