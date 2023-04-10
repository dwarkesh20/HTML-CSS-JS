import React from 'react'
import { Link } from 'react-router-dom'

function Home() {
  return (

    <div class="relative px-8 m-2">
        <img className='w-full h-full rounded-xl' src="https://img.freepik.com/free-photo/breakfast-food-cafe-delicious-contemporary-concept_53876-31718.jpg?w=1060&t=st=1681106874~exp=1681107474~hmac=9747b97db44b28f3ca47f4d9eb51822a8a93ec9870f86eee457e9befd9535960" />
        <h1 class="absolute text-5xl  top-1/2 left-1/4 -translate-x-1/2 -translate-y-1/2">
        <Link to="/viewallfoods">
            <span className='text-[#a5b4fc]'>
                Food Manu
            </span>
        </Link>
        </h1>
    </div>
  )
}

export default Home