function Vehicle(theYear, theMake, theModel) {
    this.year = theYear;
    this.make = theMake;
    this.model = theModel;
}
Vehicle.prototype.getInfo = function () {
    return 'Vehicle: ' + this.year + ' ' + this.make + ' ' + this.model;
}

var car1 = new Vehicle(2000, 'Ford', 'Fusion');
 var car2 = new Vehicle(2010, 'BMW', 'Z4');
 var expected = 'Vehicle: 2000 Ford Fusion';
 console.log(car1.getInfo());
/*
In JavaScript, everything, including the function, is an Object type, which has a prototype
property. 

The prototype itself is an object containing properties and methods that should be
available to all instances of the type you’re working with. 

However, this prototype is typically specified externally to the constructor function, so the prototype doesn’t have access to
private variables. 

Therefore, you must expose the data for the prototype to work. 
The following is an example of using the prototype property to create a single getInfo method that is
shared across all instances.
*/