import React, {useState, useEffect} from 'react'
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet'
import { Icon } from "leaflet";
import "../../App.css"



const MapOnly = ({BakeryLat, BakeryLong, UserLat, UserLong, bakery, user}) => {


    const homeIcon = new Icon({
        iconUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Home-icon.svg/240px-Home-icon.svg.png",
        iconSize: [25, 25]
      });


    const bakeryIcon = new Icon({
        // iconUrl: "https://cdn-icons-png.flaticon.com/512/992/992747.png",
        // iconUrl: "https://cdn.iconscout.com/icon/premium/png-256-thumb/baguette-3458933-2904537.png",
        iconUrl: "https://cdn-icons-png.flaticon.com/512/1182/1182138.png?w=826&t=st=1649803569~exp=1649804169~hmac=51f4a664b96b13d6c5f6126aada571dc15855944ba5b176c374d6818919ed00f",
        iconSize: [35, 35]
      });



    // scrollWheelZoom={true}

return(
<MapContainer center={[UserLat, UserLong]} zoom={50} >
<TileLayer
    attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
    url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
/>
<Marker icon={homeIcon} position={[UserLat, UserLong]}>
    <Popup>
    Home
    </Popup>
</Marker>
<Marker icon={bakeryIcon} position={[BakeryLat, BakeryLong]}>
    <Popup>
    {bakery.name} <br /> Open until <br/> {bakery.collectionTime}
    </Popup>
</Marker>
</MapContainer>

)
}

export default MapOnly;