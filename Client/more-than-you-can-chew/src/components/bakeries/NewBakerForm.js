import React from 'react'

function NewBakerForm() {

    const handleSubmit = () => {
        return null
    }
  return (
    <>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder='Bakery Name' name='bakeryName' onChange="handleChangeFunctionHere" value="Bakery Name"/>
                <input type="text" placeholder='Description' name='description' onChange="handleChangeFunctionHere" value="Description"/>
                <input type="text" placeholder='Location' name='location' onChange="handleChangeFunctionHere" value="Location"/>
                <input type="text" placeholder='Email' name='email' onChange="handleChangeFunctionHere" value="email"/>

            
                <button type="submit">Save New Bakery</button>
            
            </form>
        </>
  )
}

export default NewBakerForm