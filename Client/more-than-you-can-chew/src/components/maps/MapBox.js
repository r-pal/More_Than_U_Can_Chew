import React, {useState, useEffect} from 'react'
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet'
import "../../App.css"
import MapOnly from './MapOnly'

const MapBox = ({bakery, selectedUser}) => {
    // console.log({bakery});
  
    const [BakeryLat, setBakeryLat] = useState(null);
    const [BakeryLong, setBakeryLong] = useState(null);
    const [UserLat, setUserLat] = useState(null);
    const [UserLong, setUserLong] = useState(null);
    // const [BakeryLatLong, setBakeryLatLong] = useState(0);
    // const [UserLatLong, setUserLatLong] = useState(0);

    // console.log(bakery)

    useEffect(() => {
      getBakeryLatLong();
      getUserLatLong();
    }, [])

    let bakeryPostcode = bakery.location
    let userPostcode = selectedUser.location

    // console.log("user pc check" + userPostcode);

    const getBakeryLatLong = () => {
      fetch('https://api.postcodes.io/postcodes/' + bakeryPostcode)
      .then(res => res.json())
      .then(data => {
        // setLatLong(data)
        setBakeryLat(data.result.latitude)
        setBakeryLong(data.result.longitude)
        // console.log(data.result.latitude);
        // console.log(data.result.longitude);
        // console.log(LatLong);
      })
  }


  const getUserLatLong = () => {
    fetch('https://api.postcodes.io/postcodes/' + userPostcode)
    .then(res => res.json())
    .then(data => {
      // setLatLong(data)
      setUserLat(data.result.latitude)
      setUserLong(data.result.longitude)
      // console.log(data);
      // console.log(LatLong);
    })
}

  

return(<>
  {BakeryLat && BakeryLong && UserLat && UserLong && <MapOnly BakeryLat={BakeryLat} BakeryLong={BakeryLong} UserLat={UserLat} UserLong={UserLong} />}
</>
)
}

export default MapBox;