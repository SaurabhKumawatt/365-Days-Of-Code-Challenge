import React, { useContext, useState } from 'react'
import userContext from '../context/UserContext'


function Login() {

    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")

    const {setUser} = useContext(userContext)
    const handleSubmit = () => {
        e.preventDefault()
        setUser({username, password})
    }
  return (
    <div>
        <h2>Login</h2>
            <input type="text" name="username" id="username" value={username}
            placeholder='username'
            onChange={(e)=> setUsername(e.target.value)}
            />
            <input type="password" name="password" id="password" 
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            />
       <button onClick={handleSubmit}>Login</button>

    </div>
  )
}

export default Login