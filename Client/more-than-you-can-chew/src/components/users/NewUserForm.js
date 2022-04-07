import React from 'react'
import "../stylesheets/Main.css";

function NewUserForm() {

    const handleSubmit = () => {
        return null
    }
  return (
    <>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder='User Name' name='userName' onChange="handleChangeFunctionHere" value="User Name"/>
                <input type="text" placeholder='Description' name='description' onChange="handleChangeFunctionHere" value="Description"/>
                <input type="text" placeholder='Location' name='location' onChange="handleChangeFunctionHere" value="Location"/>
                <input type="text" placeholder='Email' name='email' onChange="handleChangeFunctionHere" value="email"/>

            
                <button type="submit">Save New User</button>
            
            </form>
        </>
  )
}

export default NewUserForm;