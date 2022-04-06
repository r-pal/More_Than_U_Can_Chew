import React from 'react';
import BakeryNewExisting from '../components/bakeries/BakeryNewExisting';

const BakeryContainer = ({bakeries, setSelectedBakery, selectedBakery}) => {


    return(
        
        <>
        <BakeryNewExisting bakeries={bakeries} setSelectedBakery={setSelectedBakery} selectedBakery={selectedBakery}/>
        </>
    )
}

export default BakeryContainer;