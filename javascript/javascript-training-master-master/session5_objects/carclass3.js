function Vehicle(theYear, theMake, theModel) {
    var year = theYear;
    var make = theMake;
    var model = theModel;
    this.getYear = function () { return year; };
    this.getMake = function () { return make; };
    this.getModel = function () { return model; };
   }
   Vehicle.prototype.getInfo = function () {
    return 'Vehicle: ' + this.getYear() +
    ' ' + this.getMake() +
    ' ' + this.getModel();
   }