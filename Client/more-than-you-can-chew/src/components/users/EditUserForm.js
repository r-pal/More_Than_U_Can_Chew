import React, {useEffect, useState} from 'react'
import "../stylesheets/Main.css";
import NavBar from '../NavBar';
import {Link, Navigate, useNavigate} from 'react-router-dom';


function EditUserForm({setSelectedUser, selectedUser, onCreate, onUpdate}) {

  const [newUser, setNewUser] = useState({
    name: "",
    location: "",
    email: "",
    id: selectedUser.id
  })

  useEffect(() => {
    if(selectedUser){
      let copiedUser = {...selectedUser}
      setNewUser(copiedUser)
    }
  }, [selectedUser])

  let buttonText ="";
  if(!selectedUser){
    buttonText = "Save New User"
  }else{
    buttonText = "Edit " + selectedUser.name
  }

    const handleSubmit = (event) => {
        event.preventDefault();
        if(newUser.id){
          onUpdate(newUser)
          setSelectedUser(newUser)
        }else{
        console.log("did handlesubmit else");
        // onCreate(newUser)
    }}


    const handleChange = (event) => {
      let propertyName = event.target.name
      let copiedUser = {...newUser};
      copiedUser[propertyName] = event.target.value;
      setNewUser(copiedUser)
      console.log("selectuserID: " + selectedUser.id);
      console.log("newUserID: " + newUser.id);
      // console.log(newUser.name);

  }
  return (
    <>
    <NavBar />
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder='User Name' name='name' onChange={handleChange} value={newUser.name}/>
                <input type="text" placeholder='Location' name='location' onChange={handleChange} value={newUser.location}/>
                <input type="text" placeholder='Email' name='email' onChange={handleChange} value={newUser.email}/>

            
                <button type="submit">{buttonText}</button>
            
            </form>
        </>
  )
}

export default EditUserForm;