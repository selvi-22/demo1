// Comparison (or Relational) operators
var num1 = 25;
var num2 = 35;
var num3 = "25";
 
alert(num1 == num3);  // true
document.write(num1==num3);
alert(num1 === num3); // false
document.write(num1===num3);

alert(num1 != num2);  // true
document.write(num1!=num3);

alert(num1 !== num3); // true
document.write(num1!==num3);

alert(num1 < num2);   // true
alert(num1 > num2);   // false
alert(num1 <= num2);  // true
alert(num1 >= num2);  // false