var date = new Date();
console.log("Todays Date",date)
// var date1 = new Date(0)
// console.log("Date with milliseconds constructor",date1)
// var date2 = new Date("April 10")
// console.log("Date string constructor",date2)
// var date3 = new Date(1996,4,10)
// console.log("Date yeras month constructor" +date3)

var year = date.getFullYear()
console.log("Year",year)
var minutes = date.getMinutes()
console.log("Minutes",minutes)
var month = date.getMonth()
console.log("Month",month)
var day = date.getDay()
console.log("Day",day)
var todaysDate = date.getDate()
console.log("Date",todaysDate)

var months = ["January","February","March","April","May","June","July","August","September","October","November","December"];
var thisMonth = months[month];
var days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
var thisDay = days[day]

console.log("****************************")
console.log("Month = ",thisMonth);
console.log("Day = ",thisDay)