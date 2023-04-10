import { useEffect, useState } from 'react';
import './App.css';
import { getAllFoods, getFoodsByFoodName } from './FoodService';
import FoodList from './components/FoodList';
import Header from './components/Header';
import CartList from './components/CartList';
import { Route, Routes } from 'react-router-dom';
import { Button } from '@material-tailwind/react';
import FoodByName from './components/FoodByName';
import FoodByHotel from './components/FoodByHotel';
import Footer from './components/Footer';
import Home from './components/Home';

function App() {

  const [foods, setFoods] = useState([])

  useEffect(() => {
    getAllFoods().then((res) => {
      setFoods(res.data)
    })
    
    

  }, [foods])

  const [cart, setCart] = useState([])
  console.log(cart)
  let flag = false;
  
  const addToCart = (data) => {
    for (let item of cart) {
      if (data.id === item.id) {
        flag = true;
        break;
      }
    }
    if (!flag)
      setCart([...cart, { ...data, quantity: 1 }])  
  }

  return (
    <div>
      <Header count={cart.length} />

      
      <Routes>
        <Route path='/' element={<Home/>}></Route>
        <Route path='/viewallfoods' element={<FoodList foodlist={foods} addToCart={addToCart} />}></Route>
        <Route path='/viewfoodsbyhotel' element={<FoodByHotel foodlist={foods} addToCart={addToCart} />}></Route>
        <Route path='/viewfoodsbyfoodname' element={<FoodByName foodlist={foods} addToCart={addToCart}/>}></Route>
        <Route path='/cart' element={<CartList cart={cart} />}></Route>
      </Routes>

    <Footer/>
    </div>
  );
}

export default App;
