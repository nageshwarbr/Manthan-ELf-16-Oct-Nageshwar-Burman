console.log("--------Named Function-------------")
add(10,20)
function add(num1,num2){
    var sum = num1 + num2
    console.log("Sum = ",sum)
}



console.log("--------Anonymous Function-------------")

var multiply = function(n , n1){
    var product = n * n1
    console.log("Product = ",product)
}

multiply(15,6)

console.log("--------Self Invoked Function-------------");

(function(s){
    var square = 10 * 10;
    console.log("Square is ",square)
})(10)

console.log("--------Arrow Function-------------")

var division = (val1,val2) => {
    var div = val1/val2
    console.log("Div = ",div)
}
division(60,8)

var summ = (i,j) => i + j
var value = summ(10,20)
console.log("value is ",value)