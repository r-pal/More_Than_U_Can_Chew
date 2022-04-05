import React from "react";
import {Link} from 'react-router-dom';



const BakeryNewExisting = () => {

    // look at pirate form 
    
    const handleSubmit = () => {
        return window.location.href='/id';
    }

    const handleBakery= () => {
        
        return null
    }

    return (
        <div className="BakeryNewExisting">
        <form onSubmit={<Link to={"/id"}/>}>
            <select name="bakery" onchange={handleBakery} defaultValue="select-bakery">
                <option disabled value="select-bakery">Select Bakery</option>
                <option value="test">Test</option>
                {/* put in list of bakeries */}
            </select>
            <button type="submit">Login</button>
        </form>
        <Link to={"new"}><button type="button">New Baker</button></Link>
        </div>
    )



}


export default BakeryNewExisting;