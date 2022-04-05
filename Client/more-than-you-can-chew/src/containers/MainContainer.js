import React, {Fragment, component} from 'react';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import UserContainer from './UserContainer';



const MainContainer = () => {



    return(
        <Router>
        <Fragment>
        <Routes>
          <Route path="/users" element={<UserContainer/>}/>
  
        </Routes>
  
  
        </Fragment>
        </Router>
      )
}

export default MainContainer