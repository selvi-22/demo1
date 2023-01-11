let add = (num1, num2) => {
    return num1 + num2;
}

let larger = (num1, num2) => {

    if (num1 > num2) {
        return true;
    } else {
        return false;
    }
}



// operation is the callback function
function calculate(num1, num2, operation) {
    let result = operation(num1, num2);
    console.log(result)
}

calculate(95, 90, larger);

calculate(87, 90, (num1, num2) => {

    if (num1 > num2) {
        return true;
    } else {
        return false;
    }
}
);

//this is an anonymous function. It has no name
calculate(70, 35, (num1, num2) => { return num1 - num2 });







