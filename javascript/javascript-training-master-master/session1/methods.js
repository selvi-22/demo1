let person = {
    fname : "Naresh",
    lname : "Kumar",
    sayMyName : function () {
        console.log('Hi my name is :' + this.fname + " " + this.lname);
    }
}

person.sayMyName();