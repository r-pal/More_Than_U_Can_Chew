import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";

const CreateBakeryItem = ({selectedBakery, onCreateItem}) => {

    const [newItem, setNewItem] = useState({
        name: "",
        allergens: "",
        imageId: 0,
        bakery: selectedBakery.id,
        quantity: 0,

      }, [])

      console.log(newItem)

    const handleItemPost = (event) => {
        event.preventDefault();
        console.log(newItem.name);
        onCreateItem(newItem)
    }

    


    const handleChange = (event) => {
      let propertyName = event.target.name
      let copiedItem = {...newItem};
      copiedItem[propertyName] = event.target.value;
      setNewItem(copiedItem)
      console.log(newItem.name);

  }


    return (
        <>
        <p>placeholder for git push</p>
                <form onSubmit={handleItemPost}> 
                    <input type="text" placeholder='Name' name='name' onChange={handleChange} value={newItem.name}/>
                    <input type="text" placeholder='Allergens' name='allergens' onChange={handleChange} value={newItem.allergens}/>
                    <input type="text" placeholder='Image' name='imageId' onChange={handleChange} value={newItem.imageId}/>
                    <input type="number" placeholder='Quantity' name='quantity' onChange={handleChange} value={newItem.quantity}/>
                    
                    
    
                
                    <button type="submit">Save Item</button>
                
                </form>  
            </>
      ) 
    

    }

export default CreateBakeryItem;