import React, {useState, useEffect, Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';
import UserContainer from './UserContainer';
import BakeryContainer from './BakeryContainer';
import HomePage from '../components/HomePage';
import NewBakerForm from '../components/bakeries/NewBakerForm';
import BakeryConsole from '../components/bakeries/BakeryConsole';
import NewUserForm from '../components/users/NewUserForm';
import UserConsole from '../components/users/UserConsole';
import BakeryNavBar from '../components/bakeries/BakeryNavBar';
import Request from '../helpers/Request';
import EditUserForm from '../components/users/EditUserForm';
import CreateBakeryItem from '../components/bakeryItems/CreateBakeryItem';
import EditBakerForm from '../components/bakeries/EditBakerForm';

import EditBakeryItem from '../components/bakeryItems/EditBakeryItem';


import UserOrders from '../components/users/UserOrders';
import UserBakeryDetails from '../components/users/UserBakeryDetails';
import BakeryOrder from '../components/bakeries/BakeryOrder';
import ShowBakeryItems from '../components/bakeryItems/ShowBakeryItems';
import Basket from '../components/users/Basket';




const MainContainer = () => {
    const stateUserName = localStorage.getItem("userName").replace(/"/g, '')
    const stateUserEmail = localStorage.getItem("userEmail").replace(/"/g, '')
    const stateUserLocation = localStorage.getItem("userLocation").replace(/"/g, '')
    const stateUserId = parseInt(localStorage.getItem("userId"))
    const stateUser = {
        "name": stateUserName,
        "email": stateUserEmail,
        "location": stateUserLocation,
        "id": stateUserId
    }

    const stateBakeryName = localStorage.getItem("bakeryName").replace(/"/g, '')
    const stateBakeryEmail = localStorage.getItem("bakeryEmail").replace(/"/g, '')
    const stateBakeryLocation = localStorage.getItem("bakeryLocation").replace(/"/g, '')
    const stateBakeryId = parseInt(localStorage.getItem("bakeryId"))
    const stateBakeryCollectionTime = JSON.parse(localStorage.getItem("bakeryCollectionTime"))
    const stateBakery = {
        "name": stateBakeryName,
        "email": stateBakeryEmail,
        "location": stateBakeryLocation,
        "id": stateBakeryId,
        "collectionTime": stateBakeryCollectionTime

    }

    // console.log("stateUserName", stateUserName);
    // console.log("stateUserEmail", stateUserEmail);
    // console.log("stateUserLocation", stateUserLocation);
    // console.log("stateUserOrders", stateUserOrders);

    const [bakeries, setBakeries] = useState([]);
    const [users, setUsers] = useState([]);
    const [orders, setOrders] = useState([]);
    const [images, setImages] = useState([]);
    const [items, setItems] = useState([]);
    const [selectedOrder, setSelectedOrder] = useState({})
    const [basket, setBasket] = useState([])

    const [selectedItem, setSelectedItem] = useState({});

    const [selectedBakery, setSelectedBakery] = useState(stateBakery ? stateBakery : null);
    const [selectedUser, setSelectedUser] = useState(stateUser ? stateUser : null);



    

    useEffect(() => {
        fetchBakeries();
        fetchUsers();
        fetchImages();
        fetchItems();
        fetchOrders();

    }, [])

    useEffect(() => {
      console.log("selected order: " + selectedOrder);
    }, [selectedOrder])



    // useEffect(() => {
    //     if(stateUserId != null){
    //     setSelectedUser(findUserById(stateUserId));
    //     // console.log("use effect " + selectedUser.name);
    // }
    // }, [users])

    // console.log(selectedBakery)
    // console.log("user by ID" + findUserById(stateUserId))

    const findUserById = (id) =>{
        users.map((user) => {
            if (user.id == id){
                return user
            }
        })
    }

    const mapOrders = orders.map((order, index) => {
      return order
    })

    // useEffect(() => {
        
    //     setSelectedUser(JSON.parse(window.sessionStorage.getItem("selectedUser")));
    //   }, []);
    




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

    const fetchImages = () => {
        fetch('http://localhost:8080/api/images')
        .then(response => response.json())
        .then(data => setImages(data))
    }

    const fetchItems = () => {
      fetch('http://localhost:8080/api/bakeryItems')
      .then(response => response.json())
      .then(data => setItems(data))
  }

    const fetchOrders = () => {
        fetch('http://localhost:8080/api/orders')
        .then(response => response.json())
        .then(data => setOrders(data))
        .then(setSelectedOrder(mapOrders[mapOrders.length - 1]))
    }

    // const findBakeryById = (id) => {
    //     return bakeries.find((bakery) => {
    //         return bakery.id === parseInt(id);
    //     })
    // }

    const handleItemPost = (item, id) => {
        const request = new Request();
        const url ="/api/bakeryItems"
        request.post(url, item)
        .then(() => {window.location = "/bakeries/" + id})
    }

    const handleItemPostOrder = (item) => {
      const request = new Request();
      const url ="/api/bakeryItems"
      request.post(url, item)
      .then(() => {window.location = "/users/:id/orders"})
  }


    const handlePost = (user) => {
        // console.log(user);
        const request = new Request();
        const url = "/api/users";
        request.post(url, user)
        .then(() => {window.location = "/users"})
      }

      const handlePostOrder = (order, id) => {
        // console.log(user);
        const request = new Request();
        const url = "/api/orders";
        request.post(url, order)
        .then(fetchOrders())
        // .then(() => {window.location = "/users/" + id + "/bakery"})
        // console.log("orders: " + orders)
      }

      const handleOrderUpdate = (order) => {
        const request = new Request();
        request.patch("/api/orders/" + order.id, order)
        // .then(fetchOrders())
        .then(() => {window.location = "/bakeries/1/orders"})
        

      }


    


    const handlePostB = (bakery) => {
      console.log(bakery);
      const request = new Request();
      const url = "/api/bakeries";
      request.post(url, bakery)
      .then(() => {window.location = "/bakeries"})
    }

    const handleDeleteB = (id) => {
        const request = new Request();
        const url = "/api/bakeries/" + id;
        request.delete(url, id)
        .then(() => {window.location = "/bakeries"})
      }
      const handleDeleteU = (id) => {
        id = selectedUser.id
        console.log("This is the one Tam " + id);
        const request = new Request();
        const url = "/api/users/" + id;
        request.delete(url)
        .then(() => {window.location = "/users"})
      }

    
      const handleUserUpdate = (user) => {
        const request = new Request();
        request.patch("/api/users/" + user.id, user)
        .then(() => {
          window.location = "/users/" + user.id
      })
    }

    const handleBakeryUpdate = (bakery) => {
        const request = new Request();
        request.patch("/api/bakeries/" + bakery.id, bakery)
        .then(() => {
          window.location = "/bakeries/" + bakery.id
      })
    }

    const handleItemUpdate = (item) => {
        const request = new Request();
        request.patch("/api/bakeryItems/" + item.id, item)
        .then(() => {
          window.location = "/bakeries/:id/items"
      })
    }

    const handleItemUpdateOnOrder = (item) => {
      const request = new Request();
      request.patch("/api/bakeryItems/" + item.id, item)
    //   .then(() => {
    //     window.location = "/users/:id/orders"
    // })

  }

    
      

    return(
        <Router>
        <Fragment>
        <Routes>
            <Route path="/" element={<HomePage/>}/>

          <Route path="/users" element={<UserContainer users={users} setSelectedUser={setSelectedUser} selectedUser={selectedUser}/>} />
          <Route path="/users/:id/orders" element={<UserOrders items={items} selectedUser={selectedUser} bakeries={bakeries} orders={orders} handleDelete={handleDeleteU}/>}/>
          <Route path="/users/new" element={<NewUserForm selectedUser={selectedUser} onCreate={handlePost} onUpdate={handleUserUpdate}/>} />
          <Route path="/users/:id/edit" element={<EditUserForm selectedUser={selectedUser} onCreate={handlePost} onUpdate={handleUserUpdate} handleDelete={handleDeleteU}/>} />

          <Route path="users/:id" element={<UserConsole items={items} orders={orders} selectedUser={selectedUser} bakeries={bakeries} handleDelete={handleDeleteU} setSelectedBakery={setSelectedBakery}/>}/>
          <Route path="users/:id/bakery" element={<UserBakeryDetails onUpdateItem={handleItemUpdateOnOrder} selectedItem={selectedItem} setOrders={setOrders} fetchOrders={fetchOrders} items={items} orders={orders} selectedUser={selectedUser} bakeries={bakeries} handleDelete={handleDeleteU} selectedBakery={selectedBakery} images={images} selectedOrder={selectedOrder} setSelectedOrder={setSelectedOrder} handlePostOrder={handlePostOrder} basket={basket} setBasket={setBasket} setSelectedBakery={setSelectedBakery} setSelectedItem={setSelectedItem}/>}/>
          <Route path="users/:id/bakery/basket" element={<Basket basket={basket} setBasket={setBasket} items={items} handlePostOrder={handlePostOrder} selectedUser={selectedUser} handleDelete={handleDeleteU} selectedBakery={selectedBakery} onUpdateItem={handleItemUpdateOnOrder} onCreateItem={handleItemPostOrder} selectedOrder={selectedOrder} selectedItem={selectedItem}/>}/>


          <Route path="/bakeries" element={<BakeryContainer bakeries={bakeries} setSelectedBakery={setSelectedBakery} selectedBakery={selectedBakery}/>}/>
          <Route path="/bakeries/new" element={<NewBakerForm selectedBakery={selectedBakery} onCreateB={handlePostB} />}/>


          <Route path="bakeries/:id" element={<BakeryConsole items={items} users={users} orders={orders} selectedBakery={selectedBakery} images={images} selectedItem={selectedItem} onUpdate={handleItemUpdate} setSelectedItem={setSelectedItem}/>}/>

          <Route path="bakeries/:id/items/:id/edit" element={<EditBakeryItem selectedItem={selectedItem} onUpdateItem={handleItemUpdate} selectedBakery={selectedBakery} setSelectedItem={setSelectedItem} images={images}/>}/>

          <Route path="bakeries/:id/orders" element={<BakeryOrder handleOrderUpdate={handleOrderUpdate} items={items} users={users} selectedBakery={selectedBakery} orders={orders} />}/>
         <Route path="bakeries/:id/items" element={<ShowBakeryItems items={items} selectedBakery={selectedBakery} images={images} setSelectedItem={setSelectedItem}/>}/>
          <Route path="/bakeries/:id/edit" element={<EditBakerForm selectedBakery={selectedBakery} onUpdate={handleBakeryUpdate} handleDeleteB={handleDeleteB} setSelectedItem={setSelectedItem} images={images}/>} />


          <Route path="/bakeries/:id/create_item" element={<CreateBakeryItem setSelectedBakery={setSelectedBakery} selectedBakery={selectedBakery} onCreateItem={handleItemPost} images={images}/>} />


         

  
        </Routes>
  
  
        </Fragment>
        </Router>
      )
    
}


export default MainContainer