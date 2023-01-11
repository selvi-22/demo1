function square(x) {
    return x * x;
}

const square1 = (x) => { return x * x; };
const square2 = x => x * x;

const power = (base, exponent) => {
    let result = 1;
    for (let count = 0; count < exponent; count++) {
        result *= base;
    }
    return result;
};

/* When an arrow function has no parameters at all, 
its parameter list is just an empty set of parentheses.*/
const hello = () => {
    console.log("Hello");
};

