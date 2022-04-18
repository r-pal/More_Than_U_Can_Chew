import React, {useState, useEffect} from 'react'
import "../stylesheets/Main.css";
import NavBar from '../NavBar';
import BakeryNavBar from './BakeryNavBar';

function EditBakerForm({selectedBakery, onUpdate, handleDeleteB}) {

  const [newBakery, setNewBakery] = useState({
    name: "",
    location: "",
    email: "",
    collectionTime: ""
  })

  useEffect(() => {
    if(selectedBakery){
      let copiedBakery = {...selectedBakery}
      setNewBakery(copiedBakery)
    }
  }, [selectedBakery])

    const handleSubmit = (event) => {
      event.preventDefault();
      if(newBakery.id){
        let newStateBakery = {
          "name": newBakery.name,
          "email": newBakery.email,
          "location": newBakery.location,
          "collectionTime": newBakery.collectionTime
        }
        localStorage.setItem("bakeryName", JSON.stringify(newStateBakery.name));
        localStorage.setItem("bakeryEmail", JSON.stringify(newStateBakery.email));
        localStorage.setItem("bakeryLocation", JSON.stringify(newStateBakery.location));
      
      onUpdate(newBakery)
    }else{
      console.log("handlesubmit went wrong");
    }}
    console.log(newBakery.name)
    console.log(newBakery)

    const handleChange = (event) => {
      let propertyName = event.target.name
      let copiedBakery = {...newBakery};
      copiedBakery[propertyName] = event.target.value;
      setNewBakery(copiedBakery)
      console.log(newBakery.name);
  }

  const handleClick = () => {
    handleDeleteB(selectedBakery.id)
  }


  return (
    <>
    <BakeryNavBar selectedBakery={selectedBakery} />
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder='Bakery Name' name='name' onChange={handleChange} value={newBakery.name}/>
                <input type="text" placeholder='Location' name='location' onChange={handleChange} value={newBakery.location}/>
                <input type="text" placeholder='Email' name='email' onChange={handleChange} value={newBakery.email}/>
                <input type="text" placeholder='Collection Time' name='collectionTime' onChange={handleChange} value={newBakery.collectionTime}/>

            
                <button type="submit">Edit {selectedBakery.name}</button>
            
            </form>

            <div style={{textDecoration:"none"}} className="ButtonContainer">
            <button onClick={handleClick}type="button">Delete Profile</button>
            </div>

        </>
  )
}

export default EditBakerForm