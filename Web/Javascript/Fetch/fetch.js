function getData(){
  tsr=""
  for(i=1;i<5;i++){
fetch('https://jsonplaceholder.typicode.com/todos/'+i)
  .then(response => response.json())
  .then(json => {
    var search=document.getElementById('butn')
    per=json
    tsr=tsr+"<tr>"
for(x in per){
  console.log(per[x],x)
  
  tsr=tsr+"<td>"+per[x]+"</td>"
}
console.log("============")
tsr+="</tr>"
console.log(per)
document.getElementById("divTable").innerHTML=tsr

  })
  .catch(err=>console.log(err))

}
}
