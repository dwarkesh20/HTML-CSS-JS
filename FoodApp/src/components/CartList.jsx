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

export default function CartList({ cart }) {
    var totalbill = 0
    const [myCart, setMyCart] = useState([])
    useEffect(() => {
        setMyCart(cart)
    }, [cart])

    const removeFromCart = index => {
        myCart.splice(index, 1)
        setMyCart(myCart);
    }

    return (
        <div className='mx-8'>
            <div className='flex flex-wrap justify-between mx-auto p-3'>

                {
                    myCart?.map((cartItem, cartIndex) => {
                        return (
                            <>
                                


                                <Card className="w-fit m-1 shadow-lg ">
                                    <CardHeader floated={false} color="blue-gray">
                                        <img src={"data:image/png;base64,"+cartItem.image} className='w-100' />
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
                                                <span className='font-bold'>{cartItem.foodName}</span>
                                            </Typography>
                                            <Typography
                                                color="blue-gray"
                                                className="flex items-center gap-1.5 font-normal"
                                            >
                                                <StarIcon className="-mt-0.5 h-5 w-5 text-yellow-700" />
                                                5.0
                                            </Typography>
                                        </div>
                                        <Typography color="gray">
                                            {cartItem.price}/-
                                        </Typography>
                                    </CardBody>
                                    <CardFooter className="pt-3">
                                        <Button size="sm"
                                            onClick={() => {
                                                const _cart = myCart.map((item, index) => {
                                                    return cartIndex === index ? { ...item, quantity: item.quantity > 0 ? item.quantity - 1 : 0 } : item
                                                })
                                                setMyCart(_cart)
                                            }}
                                        >-</Button>

                                        <span> {cartItem.quantity} </span>
                                        <Button size="sm"
                                            onClick={() => {
                                                const _cart = myCart.map((item, index) => {
                                                    return cartIndex === index ? { ...item, quantity: item.quantity + 1 } : item
                                                })
                                                setMyCart(_cart)
                                            }}
                                        >+</Button>
                                        <p>Rs. {cartItem.price * cartItem.quantity} /-</p>
                                        <Button size="sm"
                                            onClick={() => removeFromCart(cartIndex)}
                                        >remove</Button>

                                        {/* <Button size="lg" fullWidth={true} onClick={() => addToCart(cartItem)}>
                                            Add to Cart
                                        </Button> */}
                                    </CardFooter>
                                </Card>
                            </>
                        )
                    })




                }
            </div>
            <div className='flex flex-wrap justify-between mx-auto p-3 m-2'>
                <p> Total Amount: <span className='font-bold'>Rs.

                    {
                        totalbill = myCart.map(item => item.price * item.quantity).reduce((total, value) => total + value, 0)
                    } /-</span>
                </p>

                <div>
                    <Button
                        onClick={() => alert("Order placed successfully!\nYour total bill is " + totalbill)}
                    >Place Order</Button>
                </div>
            </div>
        </div>
    )
}
