import React, { useState } from "react";
import {Link, Navigate} from 'react-router-dom';
import "../stylesheets/Main.css";



const BakeryNewExisting = ({bakeries, setSelectedBakery, selectedBakery}) => {

    const [bakeryChosen, setBakeryChosen] = useState(false);

    const bakeryOptions = bakeries.map((bakery, index) => {
        return <option key={index} value={index}>{bakery.name}</option>

    })

    const handleExistingBakeryChange = (event) => {
        let newSelectedBakery = bakeries[event.target.value];
        setSelectedBakery(newSelectedBakery)
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
        <div className="BakeryNewExisting">
        <form onSubmit={handleBakeryUpdate}>
            <select name="bakery" onChange={handleExistingBakeryChange} defaultValue="select-bakery">
                <option disabled value="select-bakery">Select Bakery</option>
                {bakeryOptions}
            </select>
            <button type="submit">Login</button>
        </form>
        <Link to={"new"}><button type="button">New Baker</button></Link>
        <Link to={handleBakeryUpdate}><button type="button">LOGIN</button></Link>
        </div>
    )



}


export default BakeryNewExisting;