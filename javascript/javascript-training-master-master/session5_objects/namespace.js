var vehicleCount = 5;
var vehicles = new Array();
function Car() { }
function Truck() { }
var repair = {
 description: 'changed spark plugs',
 cost: 100
};

/* JavaScript doesn’t have a namespace keyword*/

/* This code sample places five entries in the global namespace, and as the application grows,
this global namespace pollution also grows. You can implement the namespace pattern to
solve the problem. */