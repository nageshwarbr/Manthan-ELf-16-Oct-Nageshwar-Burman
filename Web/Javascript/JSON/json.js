const person={
name:'Sundari',
age:33,
weight:60,
hobbies:["Music","Singing"]
}
const JSONObject=JSON.stringify(person)
console.log('JSON object ',JSONObject)
const JSObject=JSON.parse(JSONObject)
console.log("JS Object ",JSObject)

