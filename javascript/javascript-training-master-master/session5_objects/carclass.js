/* Creating a class Vehicle */

function Vehicle(theYear, theMake, theModel) {
    var year = theYear;
    var make = theMake;
    var model = theModel;
    this.getInfo = function () {
        return 'Vehicle: ' + year + ' ' + make + ' ' + model;
    };
}

var car1 = new Vehicle(2000, 'Ford', 'Fusion');
var car2 = new Vehicle(2010, 'BMW', 'Z4');
