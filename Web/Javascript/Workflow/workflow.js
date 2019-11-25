// function first(){
//     console.log("this line")
//     setTimeout(function(){
//             console.log("first function")
// },5000)
// console.log("this lineeee")

// }
// function second(){
//     console.log('secon function')
// }
// first()
// second()

console.log("===========callback fn=========")
function first(callback){
    console.log("this line")
    setTimeout(function(){
            console.log("first function")
            callback()
},5000)


}
function second(){
    console.log('secon function')
}
first(second)
