import { useState } from 'react'
import UserContextProvider from './context/UserContextProvider'
import Login from "./components/Login"
import Profile from "./components/Profile"
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <UserContextProvider>
      <h1>Day 2 of 365 Days Of Code</h1>
      <Login/>
      <Profile/>
    </UserContextProvider>
  )
}

export default App