import React, {useState, useEffect} from 'react'
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet'
import "../../App.css"

const MapBox = (bakery, user) => {
    // console.log({bakery});
  
    const [Lat, setLat] = useState([]);
    const [Long, setLong] = useState([]);
    const [LatLong, setLatLong] = useState([]);
  
  
    const getLatLong = function(bakery){
      fetch('https://api.postcodes.io/postcodes/G23AT')
      // .then(console.log(bakery.bakery.location))
      .then(res => res.json())
      .then(data => setLatLong(data.result))
      .then(console.log(LatLong))
      .then(setLat(LatLong.latitude))
      .then(setLong(LatLong.longitude))
  }
  
  useEffect(() => {
    getLatLong();
  }, [])


return(
  <MapContainer center={[51.505, -0.09]} zoom={13} scrollWheelZoom={true}>
    <TileLayer
        attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
    />
    <Marker position={[51.505, -0.09]}>
        <Popup>
        A pretty CSS3 popup. <br /> Easily customizable.
        </Popup>
    </Marker>
  </MapContainer>
)
}

export default MapBox;