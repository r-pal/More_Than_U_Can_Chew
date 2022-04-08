import React, {useState} from 'react'
import "../stylesheets/Main.css";
import NavBar from '../NavBar';

function NewUserForm({selectedUser, onCreate}) {

  const [newUser, setNewUser] = useState({
    name: "",
    location: "",
    email: ""
  }, [])

    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(newUser.name);
        onCreate(newUser)
    }

    


    const handleChange = (event) => {
      let propertyName = event.target.name
      let copiedUser = {...newUser};
      copiedUser[propertyName] = event.target.value;
      setNewUser(copiedUser)
      console.log(newUser.name);

  }
  return (
    <>
    <NavBar />
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder='User Name' name='name' onChange={handleChange} value={newUser.name}/>
                <input type="text" placeholder='Location' name='location' onChange={handleChange} value={newUser.location}/>
                <input type="text" placeholder='Email' name='email' onChange={handleChange} value={newUser.email}/>

            
                <button type="submit">Save New User</button>
            
            </form>
        </>
  )
}

export default NewUserForm;