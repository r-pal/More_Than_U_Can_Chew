import React, {useState, useEffect} from 'react'
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet'
import "../../App.css"



const MapOnly = ({BakeryLat, BakeryLong, UserLat, UserLong, bakery, user}) => {


return(
<MapContainer center={[UserLat, UserLong]} zoom={17} scrollWheelZoom={true}>
<TileLayer
    attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
    url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
/>
<Marker position={[BakeryLat, BakeryLong]}>
    <Popup>
    bakery.name <br /> Easily customizable.
    </Popup>
</Marker>
</MapContainer>

)
}

export default MapOnly;