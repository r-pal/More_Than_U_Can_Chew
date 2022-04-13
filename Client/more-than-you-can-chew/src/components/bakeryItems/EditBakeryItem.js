import React, {useState, useEffect} from 'react'
import "../stylesheets/Main.css";
import BakeryNavBar from '../bakeries/BakeryNavBar';

const EditBakeryItem = ({selectedItem, onUpdateItem, selectedBakery, images}) => {

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

  const imageOptions = images.map((image, index) => {
    return <option key={index} value={index}>{image.title}</option>})


    return (
        <>
        <BakeryNavBar selectedBakery={selectedBakery}/>
                <form onSubmit={handleSubmit}> 
                    <input type="text" placeholder='Name' name='name' onChange={handleChange} value={newItem.name}/>
                    <input type="text" placeholder='Allergens' name='allergens' onChange={handleChange} value={newItem.allergens}/>
                    <select name="imageId" onChange={handleChange}>
                        <option disabled value="select-image">Select image</option>
                        {imageOptions}
                    </select>
                    <input type="number" placeholder='Quantity' name='quantity' onChange={handleChange} value={newItem.quantity}/>
                    
                    
    
                
                    <button type="submit">Edit Item</button>
                
                </form>  
            </>
      ) 
    

    }

export default EditBakeryItem;