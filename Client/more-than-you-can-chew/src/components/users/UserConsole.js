import React from 'react'
import BakeriesNearYou from './BakeriesNearYou'

function UserConsole({selectedUser, bakeries}) {




  return (
    <div className='UserConsoleContainer'>
      <h2>Hi {selectedUser.name}</h2>
      <BakeriesNearYou bakeries={bakeries}/>

    </div>
  )
}

export default UserConsole