import React, {useState, useEffect} from 'react'
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet'
import "../../App.css"

const MapOnly = ({BakeryLat, BakeryLong, UserLat, UserLong, bakery, user}) => {

    console.log(BakeryLat);

    

return(
<MapContainer center={[UserLat, UserLong]} zoom={17} scrollWheelZoom={true}>
<TileLayer
    attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
    url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
/>
<Marker position={[UserLat, UserLong]}>
    <Popup>
    Home
    </Popup>
</Marker>
<Marker position={[BakeryLat, BakeryLong]}>
    <Popup>
    {bakery.name} <br /> Open until <br/> {bakery.collectionTime}
    </Popup>
</Marker>
</MapContainer>

)
}

export default MapOnly;