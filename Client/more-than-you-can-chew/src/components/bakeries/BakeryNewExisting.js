import React from "react";
import {Link} from 'react-router-dom';


const BakeryNewExisting = () => {

    const handleSubmit = () => {
        return null
    }

    const handleBakery= () => {
        return null
    }

    return (
        <div className="BakeryNewExisting">
        <form onSubmit={handleSubmit}>
            <select name="bakery" onchange={handleBakery} defaultValue="select-bakery">
                <option disabled value="select-bakery">Select Bakery</option>
                {/* put in list of bakeries */}
            </select>
            <button type="submit">Login</button>
        </form>
        <Link to={"bakeries/new"}><button type="button">New Baker</button></Link>
        </div>
    )



}


export default BakeryNewExisting;