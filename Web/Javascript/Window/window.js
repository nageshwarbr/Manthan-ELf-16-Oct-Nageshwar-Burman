console.log(window)
console.log(this)
console.log(window===this)
var a=10
console.log("a ="+a)
console.log(window.a)
function add(){
    console.log("add")
}
add()
window.add()

// alert("This site may contain harmful content")
//  var isAdult=confirm("Are you 18 years old?")
//  console.log("Is Adult "+isAdult)
var age=prompt('enter  your age ',3)
console.log("Age="+age)