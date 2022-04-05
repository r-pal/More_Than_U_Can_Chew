import React, {Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';
import UserContainer from './UserContainer';
import BakeryContainer from './BakeryContainer';
import HomePage from '../components/HomePage';



const MainContainer = () => {



    return(
        <Router>
        <Fragment>
    
        <Routes>
            <Route path="/" element={<HomePage/>}/>
          <Route path="/users" element={<UserContainer/>}/>
          <Route path="/bakeries" element={<BakeryContainer/>}/>

  
        </Routes>
  
  
        </Fragment>
        </Router>
      )
}

export default MainContainer