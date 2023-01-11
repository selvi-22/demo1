var myApp = {};
myApp.vehicleCount = 5;
myApp.vehicles = new Array();
myApp.Car = function () { }
myApp.Truck = function () { }
myApp.repair = {
    description: 'changed spark plugs',
    cost: 100
};

//In this sample, myApp is the only entry in the global namespace.
//You can see that a namespace was created by creating an object. Although only one entry
//is made in the global namespace, all the members of myApp are globally accessible