console.log("Hello");

x = 100; //global scope this value is available throughtout the entire script

// we created a function with a function scope of variable y
function hello(){

    
    {
        y = 99;        
    } // that is a function scope variable

    //var makes a variable function scoped.
    //let means the variable is local scoped.
    console.log(y);

}
hello();