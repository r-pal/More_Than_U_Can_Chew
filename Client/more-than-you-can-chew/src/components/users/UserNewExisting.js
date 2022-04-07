import React, { useState } from "react";
import {Link, Navigate} from 'react-router-dom';



const UserNewExisting = ({users, setSelectedUser, selectedUser}) => {

    const [userChosen, setUserChosen] = useState(false);

    const userOptions = users.map((user, index) => {
        return <option key={index} value={index}>{user.name}</option>

    })

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
        <div className="UserNewExisting">
        <form onSubmit={handleUserUpdate}>
            <select name="user" onChange={handleExistingUserChange} defaultValue="select-user">
                <option disabled value="select-user">Select user</option>
                {userOptions}
            </select>
            <button type="submit">Login</button>
        </form>
        <Link to={"new"}><button type="button">New User</button></Link>
        </div>
    )



}


export default UserNewExisting;

