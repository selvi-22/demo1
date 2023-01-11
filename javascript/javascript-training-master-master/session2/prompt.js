let theNumber = Number(prompt("Pick a number"));
console.log("Your number is the square root of " +
theNumber * theNumber);

/*
The Number.isNaN function is a standard JavaScript function that returns
true only if the argument it is given is NaN. The Number function happens to
return NaN when you give it a string that doesn’t represent a valid number
*/
if (!Number.isNaN(theNumber)) {
    console.log("Your number is the square root of " +
    theNumber * theNumber);
    }
    