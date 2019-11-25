// var pElement=document.getElementById("demo")
// console.log(pElement)
// var text=pElement.textContent
// console.log(text)
// console.log("===========================")
// pElement.textContent="Good morning"
// var modifiedText=pElement.textContent
// console.log(modifiedText)
// console.log("===========================")
// var pElement=document.querySelector("p")
// pElement.textContent="Good morning"
// console.log(pElement.textContent)

// var elements=document.getElementsByClassName("test")
// console.log(document.getElementsByClassName("test"))
// elements[0].style.color="red"
// pElement.style.fontSize="40px"
// pElement.style.color="green"
// var qElements=document.querySelectorAll(".test")
// qElements[1].style.color="blue"
// qElements[1].style.fontSize="50px"
var bElement=document.createElement("button")
bElement.textContent="Click me!!"
document.body.appendChild(bElement)
var p=document.createElement("p")
p.textContent="I am lat child"
document.body.appendChild(p)
document.write("google")
var ele=document.getElementById("add")
// ele.className='xyz'
ele.classList="xyz abc"