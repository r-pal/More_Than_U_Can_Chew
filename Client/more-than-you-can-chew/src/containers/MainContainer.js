import React, {Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import UserContainer from './UserContainer';
import BakeryContainer from './BakeryContainer';



const MainContainer = () => {



    return(
        <Router>
        <Fragment>
        <Routes>
          <Route path="/users" element={<UserContainer/>}/>
          <Route path="/bakeries" element={<BakeryContainer/>}/>

  
        </Routes>
  
  
        </Fragment>
        </Router>
      )
}

export default MainContainer