import React, { useEffect, useState } from 'react'
import {
    Card,
    CardHeader,
    CardBody,
    CardFooter,
    Typography,
    Button,
    Tooltip,
    IconButton,
    Input,
} from "@material-tailwind/react";
import {
    BanknotesIcon,
    StarIcon,
    HeartIcon,
    WifiIcon,
    HomeIcon,
    TvIcon,
    FireIcon,
} from "@heroicons/react/24/solid";
import { Form } from 'react-router-dom';
import { getFoodsByFoodName, getFoodsByHotel } from '../FoodService';

function FoodByHotel({ foodlist, addToCart}) {
  const [name, setName] = useState("")
  const [foods, setFoods] = useState([])
console.log(foodlist)
console.log(foods)
useEffect(() => {
    
  }, [foods])
    const handleSubmit = (e) => {
        e.preventDefault();
            setName(e.target[0].value);
            getFoodsByHotel(name).then((res) => {
                setFoods(res.data)
                console.log(foods)
            })
            console.log(foods)
        };

  return (
    <div>
        <div className='mx-8  p-2'>
        <h1>Serch By <span className='font-bold'>Hotel Name</span></h1>
        <form onSubmit={handleSubmit} className='mt-4 w-1/6'>
            <Input type="text" label="Enter Hotel Name" name="name"/><br />
            <Button type='submit'>Search</Button>
        </form>
        </div>
        
        <div className='flex flex-wrap justify-between mx-auto p-3 m-2'>

                {
                    foods.map((food, foodindex) => {
                        return (
                            <div >
                                <Card className="w-full m-1 shadow-lg ">
                                    <CardHeader floated={false} color="blue-gray">
                                        <img src={"data:image/png;base64,"+food.image} className='w-100' />
                                        <div className="to-bg-black-10 absolute inset-0 h-full w-full bg-gradient-to-tr from-transparent via-transparent to-black/60 " />
                                        <IconButton
                                            size="sm"
                                            color="red"
                                            variant="text"
                                            className="!absolute top-4 right-4 rounded-full"
                                        >
                                            <HeartIcon className="h-6 w-6" />
                                        </IconButton>
                                    </CardHeader>
                                    <CardBody>
                                        <div className="mb-3 flex items-center justify-between">
                                            <Typography variant="h5" color="blue-gray" className="font-medium">
                                              Food Name:  {food.foodName}
                                            </Typography>
                                            <Typography
                                                color="blue-gray"
                                                className="flex items-center gap-1.5 font-normal"
                                            >
                                                <StarIcon className="-mt-0.5 h-5 w-5 text-yellow-700" />
                                                5.0
                                            </Typography>
                                        </div>
                                        <Typography color="dark-gray">
                                           Hotel Name: {food.hotelName}
                                        </Typography>
                                        <Typography color="gray">
                                           Food Category: {food.foodCategory}
                                        </Typography>
                                        <Typography color="gray">
                                            {food.description}
                                        </Typography>
                                        <Typography color="gray">
                                            Rs. {food.price} /-
                                        </Typography>

                                    </CardBody>
                                    <CardFooter className="pt-3">
                                        <Button size="lg" fullWidth={true} onClick={() => addToCart(food)}>
                                            Add to Cart
                                        </Button>
                                    </CardFooter>
                                </Card>
                            </div>

                        )
                    })
                }
            </div>
    </div>
  )
}

export default FoodByHotel