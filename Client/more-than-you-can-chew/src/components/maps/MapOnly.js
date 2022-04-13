import React, {useState, useEffect} from 'react'
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet'
import "../../App.css"
import geolib from 'geolib';
import { getDistance } from "geolib"



const MapOnly = ({BakeryLat, BakeryLong, UserLat, UserLong, bakery, user}) => {

    const dist = (getDistance({latitude: BakeryLat, longitude: BakeryLong },
        { latitude: UserLat, longitude: UserLong}) / 1000).toFixed(2)

    console.log("this is the distance calc " + dist);


return(
    <div className='Distance-Map-Card'>
        <h3>Distance {dist} km</h3>
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
</div>

)
}

export default MapOnly;