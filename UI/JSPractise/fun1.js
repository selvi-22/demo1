// external js file
// Write all JavaScript code here

// define function - block of code to show welcome message
function sayHello() {
    alert('Hello All! Welcome to JavaScript!!');
}

// define function - block of code to show total of two numbers
function showTotal() {
    let num1 = 10;
    var num2 = 20;
      let result=0;
    var total = num1 + num2;
    alert('Total is : ' + total);
    document.write('Total : ' + total);
    document.write(result);
}
function add() {
    var num1 = 100;
    var num2 = 20;
    document.write(num1 + num2);
}

function dom() {
    document.getElementById('mainHeadingText').innerHTML = 'Heading Text change dynamically on run-time';
    var paraText = document.getElementById('mainParaText');
    paraText.innerHTML = '<strong>This Paragraphic text inserted dynamically through innerHTML method.</strong>';
}
// invoke / run  / call a function
sayHello();
showTotal();
add();
dom();