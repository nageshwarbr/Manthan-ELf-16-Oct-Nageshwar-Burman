function validateForm(){
   
    let userEle=document.forms["loginform"]['username']
    let passwordele=document.forms['loginform']['password']
    
    if(userEle.value.trim().length>5){
        let ple=document.getElementById('pele')
        ple.style.display="none"
        
}
else{
    let ple=document.getElementById('pele')
        ple.style.display="block"
         
}
if(passwordele.value.trim().length>5){
    let ple=document.getElementById('pelepass')
    ple.style.display="none"
    
}
else{
    let ple=document.getElementById('pelepass')
        ple.style.display="block"
        
}
if(userEle.value.trim().length>5 && passwordele.value.trim().length>5 ){
alert("data saved!!")
document.getElementById("loginForm").reset()
return true
}
else{
    
    return false
}
}