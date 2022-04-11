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




const MainContainer = () => {
    const stateUserName = localStorage.getItem("userName").replace(/"/g, '')
    const stateUserEmail = localStorage.getItem("userEmail").replace(/"/g, '')
    const stateUserLocation = localStorage.getItem("userLocation").replace(/"/g, '')
    const stateUserOrders = JSON.parse(localStorage.getItem("userOrders"))
    const stateUserId = parseInt(localStorage.getItem("userId"))
    const stateUser = {
        "name": stateUserName,
        "email": stateUserEmail,
        "location": stateUserLocation,
        "orders": stateUserOrders,
        "id": stateUserId
    }

    const stateBakeryName = localStorage.getItem("bakeryName").replace(/"/g, '')
    const stateBakeryEmail = localStorage.getItem("bakeryEmail").replace(/"/g, '')
    const stateBakeryLocation = localStorage.getItem("bakeryLocation").replace(/"/g, '')
    const stateBakeryOrders = JSON.parse(localStorage.getItem("bakeryOrders"))
    const stateBakeryItems = JSON.parse(localStorage.getItem("bakeryItems"))
    const stateBakeryId = parseInt(localStorage.getItem("bakeryId"))
    const stateBakeryCollectionTime = JSON.parse(localStorage.getItem("bakeryCollectionTime"))
    const stateBakery = {
        "name": stateBakeryName,
        "email": stateBakeryEmail,
        "location": stateBakeryLocation,
        "orders": stateBakeryOrders,
        "id": stateBakeryId,
        "availableItems": stateBakeryItems,
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
    // const [bakeryItems, setItems] = useState([]);
    const [selectedBakery, setSelectedBakery] = useState(stateBakery ? stateBakery : null);
    const [selectedUser, setSelectedUser] = useState(stateUser ? stateUser : null);


    

    useEffect(() => {
        fetchBakeries();
        fetchUsers();
        fetchImages();
        // fetchItems();
        fetchOrders();

    }, [])

    // useEffect(() => {
    //     if(stateUserId != null){
    //     setSelectedUser(findUserById(stateUserId));
    //     // console.log("use effect " + selectedUser.name);
    // }
    // }, [users])

    console.log(selectedBakery)
    // console.log("user by ID" + findUserById(stateUserId))

    const findUserById = (id) =>{
        users.map((user) => {
            if (user.id == id){
                return user
            }
        })
    }

    

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

  //   const fetchItems = () => {
  //     fetch('http://localhost:8080/api/bakeryItems')
  //     .then(response => response.json())
  //     .then(data => setItems(data))
  // }

    const fetchOrders = () => {
        fetch('http://localhost:8080/api/orders')
        .then(response => response.json())
        .then(data => setOrders(data))
    }

    // const findBakeryById = (id) => {
    //     return bakeries.find((bakery) => {
    //         return bakery.id === parseInt(id);
    //     })
    // }

    const handleItemPost = (item) => {
        const request = new Request();
        const url ="/api/bakeryItems"
        request.post(url, item)
        .then(() => {window.location = "/bakeries"})
    }


    const handlePost = (user) => {
        // console.log(user);
        const request = new Request();
        const url = "/api/users";
        request.post(url, user)
        .then(() => {window.location = "/users"})
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
        const url = "/api/bakeries/" + {id};
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


      

    return(
        <Router>
        <Fragment>
        <Routes>
            <Route path="/" element={<HomePage/>}/>

          <Route path="/users" element={<UserContainer users={users} setSelectedUser={setSelectedUser} selectedUser={selectedUser} />} />

          <Route path="/users/new" element={<NewUserForm selectedUser={selectedUser} onCreate={handlePost} onUpdate={handleUserUpdate}/>} />
          <Route path="/users/:id/edit" element={<EditUserForm selectedUser={selectedUser} onCreate={handlePost} onUpdate={handleUserUpdate}/>} />

          <Route path="users/:id" element={<UserConsole selectedUser={selectedUser} bakeries={bakeries} handleDelete={handleDeleteU}/>}/>

          <Route path="/bakeries" element={<BakeryContainer bakeries={bakeries} setSelectedBakery={setSelectedBakery} selectedBakery={selectedBakery}/>}/>
          <Route path="/bakeries/new" element={<NewBakerForm selectedBakery={selectedBakery} onCreateB={handlePostB} />}/>

          <Route path="bakeries/:id" element={<BakeryConsole selectedBakery={selectedBakery} images={images}/>}/>

         
          <Route path="/bakeries/:id/edit" element={<EditBakerForm selectedBakery={selectedBakery} onUpdate={handleBakeryUpdate}/>} />


          <Route path="bakeryitems" element={<CreateBakeryItem setSelectedBakery={setSelectedBakery} selectedBakery={selectedBakery} onCreateItem={handleItemPost}/>} />

         

  
        </Routes>
  
  
        </Fragment>
        </Router>
      )
    
}


export default MainContainer