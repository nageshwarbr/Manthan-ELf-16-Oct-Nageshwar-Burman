class Person{
    constructor(name,age){
        this.age=age
        this.name=name
    }
    getName(){
        return this.name
    }
}
const person1=new Person("Anu",34)
const person2=new Person("Shruti",19)
console.log(person1.name)
let pname=person2.getName()
console.log("Person 2 name ",pname)

console.log('=========================')


class Teacher extends Person{
    constructor(name,age,subjects){
        super(name,age)
        this.subject=subjects
    }
    getSubjects(){
        return this.subject
    }
}
const teacher1=new Teacher('arun',26,"Maths")
const teacher2=new Teacher('Anil',33,["Maths","Science"])
console.log(teacher1.name)
let tsub=teacher2.getSubjects()
console.log("Teacher 2 subjects ",tsub)

