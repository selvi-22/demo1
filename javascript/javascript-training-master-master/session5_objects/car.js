var car1 = {
    year: 2000,
    make: 'Ford',
    model: 'Fusion',
    getInfo: function () {
    return 'Vehicle: ' + this.year + ' ' + this.make + ' ' + this.model;
    }
   };

   var car2 = {
    year: 2010,
    make: 'BMW',
    model: 'Z4',
    getInfo: function () {
    return 'Vehicle: ' + this.year + ' ' + this.make + ' ' + this.model;
    }
   };

  
  /*
   JavaScript has an Object type, and you
can use it to create an object programmatically. Object has a prototype object that is cloned
when you use the new keyword to create a new Object instance. The prototype object has the
following inherited methods.
■ constructor The function that is called to initialize a new object
■ hasOwnProperty Returns a Boolean indicator of whether the current object has the
specified property
■ isPrototypeOf Returns a Boolean indicator of whether the current object is in the
specified object’s prototype object chain
■ propertyIsEnumerable Returns true if the object can be enumerated in a for...in
loop
■ toLocalString Converts a date to a string value based on the current local
■ toString Returns the string representation of the current object
■ valueOf Returns the value of the current object converted to its most meaningful
primitive value
*/