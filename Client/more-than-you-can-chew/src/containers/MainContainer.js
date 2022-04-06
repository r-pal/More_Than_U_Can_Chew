import React, {useState, useEffect, Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';
import UserContainer from './UserContainer';
import BakeryContainer from './BakeryContainer';
import HomePage from '../components/HomePage';
import NewBakerForm from '../components/bakeries/NewBakerForm';
import BakeryConsole from '../components/bakeries/BakeryConsole';



const MainContainer = () => {

    const [bakeries, setBakeries] = useState([]);
    const [users, setUsers] = useState([]);
    const [orders, setOrders] = useState([]);

    useEffect(() => {
        fetchBakeries();
        fetchUsers();
        fetchOrders();
    }, [])

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

    const fetchOrders = () => {
        fetch('http://localhost:8080/api/orders')
        .then(response => response.json())
        .then(data => setOrders(data))
    }

    const findBakeryById = (id) => {
        return bakeries.find((bakery) => {
            return bakery.id === parseInt(id);
        })
    }





    return(
        <Router>
        <Fragment>
    
        <Routes>
            <Route path="/" element={<HomePage/>}/>
          <Route path="/users" element={<UserContainer/>}/>
          <Route path="/bakeries" element={<BakeryContainer/>}/>
          <Route path="bakeries/new" element={<NewBakerForm/>}/>
          <Route path="bakeries/id" element={<BakeryConsole/>}/>

  
        </Routes>
  
  
        </Fragment>
        </Router>
      )
}

export default MainContainer