let person={
    name:"shalini",
    age:20,
    hobbies:["singing","Dancing"]
}
let{name,hobbies}=person
console.log("Hobbies",hobbies)
console.log("===============================")
displayName(person)
function displayName({name,hobbies}){
    console.log(name)
    console.log(hobbies)
}

let hobbiess=["singing","Dancing","Riding"]
let [hobby0,hobby1]=hobbiess
console.log(hobby0)
console.log(hobby1)
console.log("===============================")

let items=[
{
    id:1,
    name:"bag",
    price:500,
},
{
    id:2,
    name:"watch",
    price:1400,
}

]
console.log('Items ',items)
items[0].id=5
console.log("after modification ",items)

var item={...items[0]}
console.log("item[0]",item)
item.id=20
console.log("items",items)
console.log("item[0]",item)

let address={
    city:"Bangalore",
    pincode :990099
}
let personAddress={...person,...address}
console.log(personAddress)

console.log("===============================")

var arr1=[10,20,30,40]
var arr2=[14,25,33,43]
var arrays=[...arr1,...arr2]
console.log(arrays)
console.log("===============================")
function sum(...args){
    let value=0
    for(let i=0;i<args.length;i++){
        value+=args[i]
    }
    return value
}
console.log(sum(1,2,3,5))
