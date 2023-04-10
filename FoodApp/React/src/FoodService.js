import axios from "axios"

export const getAllFoods = () => {
    return axios.get("http://localhost:8080/viewallfoods")
}
export const getFoodsByHotel = (hotel) => {
    return axios.get("http://localhost:8080/viewfoodbyhotelname/"+hotel)
}
export const getFoodsByFoodName = (name) => {
    return axios.get("http://localhost:8080/viewfoodbyname/"+name)
}