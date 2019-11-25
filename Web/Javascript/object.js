var person = {
                firstname : "Karthik",
                lastname : "Machani",
                age : 23,
                gender : "M",
                eat : function(){
                        console.log("Eating Briyani")
                },
                getFullName : function(){
                        return this.firstname + " " + this.lastname;
                }
            }

    var firstname = person.firstname;
    var lastname  = person.lastname;
    var age = person.age;
    var gender = person.gender;
                person.eat();
    var fullname = person.getFullName();
    console.log("FirstName "+firstname);
    console.log("LastName "+lastname);
    console.log("Age "+age);
    console.log("Gender "+gender);
    console.log("Full Name "+fullname);


