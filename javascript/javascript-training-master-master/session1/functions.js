
// It attaches the function to a global object
function hello(){
    console.log('Hello');
}
hello();


// Because Functions are objects we can store them in variables
let greeting = function(){
    console.log('Hello');
}
let hello = greeting();
hello();

// Functions can invoke another function
//Every time a function is invoked, a brand new execution context 
// is created for that function. 
// Each function has its own execution context, but it’s created when the function is invoked or called.
function func1(){
    var something = 100;
    console.log('func1');
}

function func2(){
    var something = 200;
    console.log('func2');
    func1();
}
func2();