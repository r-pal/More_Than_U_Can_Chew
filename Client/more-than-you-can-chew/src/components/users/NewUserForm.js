import React, {useState} from 'react'
import "../stylesheets/Main.css";

function NewUserForm({selectedUser, onCreate}) {

  const [newUser, setNewUser] = useState({
    name: "",
    location: "",
    email: ""
  })

    const handleSubmit = (event) => {
        event.preventDefault();
        onCreate(newUser)
    }


    const handleChange = (event) => {
      let propertyName = event.target.name
      let copiedUser = {...newUser};
      copiedUser[propertyName] = event.target.value;
      setNewUser(copiedUser)
  }
  return (
    <>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder='User Name' name='name' onChange={handleChange} value="name"/>
                <input type="text" placeholder='Location' name='location' onChange={handleChange} value="location"/>
                <input type="text" placeholder='Email' name='email' onChange={handleChange} value="email"/>

            
                <button type="submit">Save New User</button>
            
            </form>
        </>
  )
}

export default NewUserForm;