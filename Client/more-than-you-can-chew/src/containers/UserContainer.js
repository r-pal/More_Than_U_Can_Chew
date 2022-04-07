import React from 'react';
import UserNewExisting from '../components/users/UserNewExisting';


const UserContainer = ({users, setSelectedUser, selectedUser}) => {

    return(
        <>
        <UserNewExisting users={users} setSelectedUser={setSelectedUser} selectedUser={selectedUser}/>
        </>
    )
}

export default UserContainer;