import React, {useState, useEffect} from 'react'
import "../stylesheets/Main.css";
import BakeryNavBar from '../bakeries/BakeryNavBar';

const EditBakeryItem = ({selectedItem, onUpdateItem, selectedBakery}) => {

    const [newItem, setNewItem] = useState({
        name: "",
        allergens: "",
        imageId: 0,
        bakeryId: 0,
        quantity: 0,

      })

      useEffect(() => {
        if(selectedItem){
          let copiedItem = {...selectedItem}
          setNewItem(copiedItem)
        }
      }, [selectedItem])

    const handleChange = (event) => {
        event.preventDefault();
      let propertyName = event.target.name
      let copiedItem = {...newItem};
      copiedItem[propertyName] = event.target.value;
      setNewItem(copiedItem);

  }

  const handleSubmit = (event) => {
    event.preventDefault();

    onUpdateItem(newItem)
  }


    return (
        <>
        <BakeryNavBar selectedBakery={selectedBakery}/>
                <form onSubmit={handleSubmit}> 
                    <input type="text" placeholder='Name' name='name' onChange={handleChange} value={newItem.name}/>
                    <input type="text" placeholder='Allergens' name='allergens' onChange={handleChange} value={newItem.allergens}/>
                    <input type="number" placeholder='Image' name='imageId' onChange={handleChange} value={newItem.imageId}/>
                    <input type="number" placeholder='Quantity' name='quantity' onChange={handleChange} value={newItem.quantity}/>
                    
                    
    
                
                    <button type="submit">Edit Item</button>
                
                </form>  
            </>
      ) 
    

    }

export default EditBakeryItem;