import React, { useState } from "react";
import "../stylesheets/Main.css";
import {Link, Navigate, useNavigate} from 'react-router-dom';
import NavBar from "../NavBar";




const BakeryNewExisting = ({bakeries, setSelectedBakery, selectedBakery}) => {

    const [bakeryChosen, setBakeryChosen] = useState(false);

    const bakeryOptions = bakeries.map((bakery, index) => {
        return <option key={index} value={index}>{bakery.name}</option>

    })

    let navigate = useNavigate();

    const nextPath = () =>{
        let newStateBakery = {
            "name": selectedBakery.name,
            "email": selectedBakery.email,
            "location": selectedBakery.location,
            "id": selectedBakery.id,
            "orders": selectedBakery.orders,
            "availableItems": selectedBakery.availableItems,
            "collectionTime": selectedBakery.collectionTime
        }
        localStorage.setItem("bakeryName", JSON.stringify(newStateBakery.name));
        localStorage.setItem("bakeryEmail", JSON.stringify(newStateBakery.email));
        localStorage.setItem("bakeryLocation", JSON.stringify(newStateBakery.location));
        localStorage.setItem("bakeryId", JSON.stringify(newStateBakery.id));
        localStorage.setItem("bakeryOrders", JSON.stringify(newStateBakery.orders));
        localStorage.setItem("bakeryItems", JSON.stringify(newStateBakery.availableItems));
        localStorage.setItem("bakeryCollectionTime", JSON.stringify(newStateBakery.collectionTime));

        let id = selectedBakery.id
        console.log(id);
        let path = "/bakeries/" + parseInt(id)
        console.log(navigate);
        navigate(path)
    }

    const handleExistingBakeryChange = (event) => {
        let newSelectedBakery = bakeries[event.target.value];
        setSelectedBakery(newSelectedBakery)
        console.log("selected bakery" + selectedBakery.name);
    }

    const handleBakeryUpdate = () => {
        setBakeryChosen(true);
    }

    if(bakeryChosen){
        let url = "/bakeries/" + selectedBakery.id
        return(
            <Navigate to={url} />

        )
    }

    return (
        <>
        <NavBar />
        <div className="BakeryNewExisting">
        <form onSubmit={nextPath}>
            <select name="bakery" onChange={handleExistingBakeryChange} defaultValue="select-bakery">
                <option disabled value="select-bakery">Select Bakery</option>
                {bakeryOptions}
            </select>
            <button type="submit">Login</button>
        </form>
        <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"new"}><button type="button">New Baker</button></Link>
        </div>
        </>
    )



}


export default BakeryNewExisting;