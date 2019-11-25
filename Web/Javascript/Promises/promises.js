const promise=new Promise(function(resolve,reject){
    if(0>10){
        resolve('success')
}
else{
    reject("Error")
}
})
promise.then(function(data){
console.log('data ',data)
}).catch(function(error){
    console.log('error ',error)
})

const personData=new Promise(function(resolve,reject){
    if(20>10){
        // let data=[10,30,24,50]
        // resolve(data)
let emp=[
    {
        name:"Anu",
        age:7,

    }
]
resolve("emp")
    }
    else{
reject("No data")
    }
})

employeeData.then(function(empD){

})




personData.then(function(data){
console.log("Data ",data)
data=data.push(245,340)
return data
}).then(function(planetdata){
    console.log("Planet data ",planetdata)
}).catch(function(err){
    console.log("Error ",err)
})

