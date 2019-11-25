var hobbies=["travelling","singing","trekking","playing"]
console.log("******Using For Of Loop*******")
for(var hobby of hobbies){
    console.log(hobby)
}

console.log("******Using For  Loop*******")
for(var i =0;i<hobbies.length;i++){
console.log(hobbies[i])
}

console.log("******Using For In Loop*******")
for(var index in hobbies){
    console.log(hobbies[index])
}



var employee = {
    name : "Karthik",
    age : 23,
    color : 'Black',   
    phoneno : 9632315219,
    hobbies : ["Travelling","Playing Games","Trekking"]
    }
    
    console.log("******Using For In Loop Using Object*******")
    for(var key in employee){
        console.log(employee[key])
    }