var data = [10,20,30,"Hello", {}, function(){}, null]; // This is an array object

var numArray = [10,20,30,40];

// Access elements using an index
console.log(numArray[2]);

//Iterate elements using for loop
for ( var i in numArray){
    console.log(numArray[i]);
}


//Push appends an element to the array at the end
numArray.push(50);

//Removes element from end of an array
numArray.pop();

// Removes the first element from an array
numArray.shift();

//Adds elements to the start of an array.
numArray.unshift(0);

// It returns the selected elements in an array, as a new array object
numArray.slice(1,3);

numArray.join(". ");

