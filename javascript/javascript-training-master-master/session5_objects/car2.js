function getVehicle(theYear, theMake, theModel) {
    var vehicle = new Object();
    vehicle.year = theYear;
    vehicle.make = theMake;
    vehicle.model = theModel;
    vehicle.getInfo = function () {
        return 'Vehicle: ' + this.year + ' ' + this.make + ' ' + this.model;
    };
    return vehicle;
}

var car1 = getVehicle(2000, 'Ford', 'Fusion');
var car2 = getVehicle(2010, 'BMW', 'Z4');

// Object has a prototype object that is cloned
//when you use the new keyword to create a new Object instance.

/*
After the object is created, you can dynamically add properties to it that hold the data and
reference functions.*/