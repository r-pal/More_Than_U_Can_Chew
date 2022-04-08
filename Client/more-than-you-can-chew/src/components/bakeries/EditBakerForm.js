import React, {useState, setState} from 'react'
import "../stylesheets/Main.css";

function EditBakerForm({selectedBakery, onCreateB}) {

  const [selectedBakery, setBakery] = useState({
    name: {selectedBakeryName},
    location: "",
    email: "",
    collectionTime: ""
  }, [])

    const handleSubmitB = (event) => {
      event.preventDefault();
      // console.log(newBakery.location);
      onCreateB(newBakery)
    }

    const handleChange = (event) => {
      let propertyName = event.target.name
      let copiedBakery = {...newBakery};
      copiedBakery[propertyName] = event.target.value;
      setNewBakery(copiedBakery)
      // console.log(newBakery.bakeryName);
  }


  return (
    <>
            <form onSubmit={handleSubmitB}>
                <input type="text" placeholder='Bakery Name' name='name' onChange={handleChange} value={newBakery.name}/>
                <input type="text" placeholder='Location' name='location' onChange={handleChange} value={newBakery.location}/>
                <input type="text" placeholder='Email' name='email' onChange={handleChange} value={newBakery.email}/>
                <input type="text" placeholder='Collection Time' name='collectionTime' onChange={handleChange} value={newBakery.collectionTime}/>

            
                <button type="submit">Save New Bakery</button>
            
            </form>
        </>
  )
}

export default NewBakerForm