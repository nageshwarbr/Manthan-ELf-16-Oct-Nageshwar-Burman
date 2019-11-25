
function greet(message){
    let name='Bill Gates'
    alert(`${message} ${name}`)
    console.log(`${2+2}`)
    console.log("2+2")
}
function changeFont(){
    let element=document.getElementById("test")
    element.style.fontSize="50px"
}
function changefontToOld(){
    let ele=document.getElementById("test")
    ele.style.fontSize="20px"
}
function showData(){
    console.log("key pressed!!")
}
let pele=document.createElement("p")
function showElement(){
  
    pele.textContent="create p element"
    document.body.appendChild(pele)

}
let el=document.getElementById("tes")
// el.onclick=function(){
// alert("clicked")
// }
el.addEventListener('click',function(){
    alert("cliiiickkkeddd")
})
