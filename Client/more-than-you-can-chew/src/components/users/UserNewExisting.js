import React, { useState } from "react";
import {Link, Navigate, useNavigate} from 'react-router-dom';
import "../stylesheets/Main.css";
import NavBar from "../NavBar";



const UserNewExisting = ({users, setSelectedUser, selectedUser}) => {

    const [userChosen, setUserChosen] = useState(false);

    const userOptions = users.map((user, index) => {
        return <option key={index} value={index}>{user.name}</option>

    })

    let navigate = useNavigate();

    const nextPath = () =>{
        let newStateUser = {
            "name": selectedUser.name,
            "email": selectedUser.email,
            "location": selectedUser.location,
            "id": selectedUser.id
        }
        localStorage.setItem("userName", JSON.stringify(newStateUser.name));
        localStorage.setItem("userEmail", JSON.stringify(newStateUser.email));
        localStorage.setItem("userLocation", JSON.stringify(newStateUser.location));
        localStorage.setItem("userId", JSON.stringify(newStateUser.id));
        let id = selectedUser.id
        console.log(id);
        let path = "/users/" + parseInt(id)
        console.log(navigate);
        navigate(path)
    }

    const handleExistingUserChange = (event) => {
        let newSelectedUser = users[event.target.value];
        setSelectedUser(newSelectedUser)
    }

    const handleUserUpdate = () => {
        setUserChosen(true);
    }


    if(userChosen){
        let url = "/users/" + selectedUser.id
        return(
            <Navigate to={url} />

        )
    }

    return (



        <>
        <NavBar />

        <div className="UserNewExisting">
        <form className="login" onSubmit={nextPath}>
            <select name="user" onChange={handleExistingUserChange} defaultValue="select-user">
                <option disabled value="select-user">Select user</option>
                {userOptions}
            </select>
            <button type="submit">Login</button>
        </form>
        <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"new"}><button type="button">New User</button></Link>
        </div>



        </>

    )



}


export default UserNewExisting;

