import React, {useState, useEffect, Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';
import UserContainer from './UserContainer';
import BakeryContainer from './BakeryContainer';
import HomePage from '../components/HomePage';
import NewBakerForm from '../components/bakeries/NewBakerForm';
import BakeryConsole from '../components/bakeries/BakeryConsole';
import NewUserForm from '../components/users/NewUserForm';
import UserConsole from '../components/users/UserConsole';




const MainContainer = () => {

    const [bakeries, setBakeries] = useState([]);
    const [users, setUsers] = useState([]);
    const [orders, setOrders] = useState([]);
    const [selectedBakery, setSelectedBakery] = useState(null);
    const [selectedUser, setSelectedUser] = useState(null);


    useEffect(() => {
        fetchBakeries();
        fetchUsers();
        // fetchOrders();
    }, [])

    // const bakery1 = [{
    //     "name": "Baker",
    //     "id": 1,
    //     "orders": "pastry"
    //       },
    //     {"name": "Baker2",
    //     "id": 2,
    //     "orders": "bread"}]

    // const fetchBakeries = () => {
    //     setBakeries(bakery1)
    // }

    // const fetchUsers = () => {
    //     setUsers(User1)
    // }

    // const User1 = [{
    //   "name": "Chris",
    //   "id": 1,
    //   "email": "pastry@gmail"
    //     },
    //   {"name": "Tam",
    //   "id": 2,
    //   "email": "bread@gmail"}]


    const fetchBakeries = () => {
        fetch('http://localhost:8080/api/bakeries')
        .then(response => response.json())
        .then(data => setBakeries(data))
    }

    const fetchUsers = () => {
        fetch('http://localhost:8080/api/users')
        .then(response => response.json())
        .then(data => setUsers(data))
    }

    // const fetchOrders = () => {
    //     fetch('http://localhost:8080/api/orders')
    //     .then(response => response.json())
    //     .then(data => setOrders(data))
    // }

    // const findBakeryById = (id) => {
    //     return bakeries.find((bakery) => {
    //         return bakery.id === parseInt(id);
    //     })
    // }





    return(
        <Router>
        <Fragment>
    
        <Routes>
            <Route path="/" element={<HomePage/>}/>

          <Route path="/users" element={<UserContainer users={users} setSelectedUser={setSelectedUser} selectedUser={selectedUser} />} />
          <Route path="/users/new" element={<NewUserForm />} />
          <Route path="users/:id" element={<UserConsole selectedUser={selectedUser} bakeries={bakeries}/>}/>

          <Route path="/bakeries" element={<BakeryContainer bakeries={bakeries} setSelectedBakery={setSelectedBakery} selectedBakery={selectedBakery}/>}/>
          <Route path="bakeries/new" element={<NewBakerForm/>}/>
          <Route path="bakeries/:id" element={<BakeryConsole selectedBakery={selectedBakery}/>}/>

  
        </Routes>
  
  
        </Fragment>
        </Router>
      )
}

export default MainContainer