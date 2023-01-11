
const firstName = 'Dinanath';
const lastName = 'Jayaswal'

const fullName = (firstName) + (lastName);
console.log(fullName);
console.log(typeof fullName);

// concatenation
console.log(firstName + ' ' + lastName);

console.log('Hello ' + firstName + ' ' + lastName + 'Welcome to JavaScript!');

// append
let name1 = 'Dinanath ';
let name2 = 'Jayaswal' + name1;
console.log(name1);
document.write(name1 + name2)

// concat() method
console.log(firstName.concat(' ', lastName));
document.write(firstName.concat(' '), lastName)

// length
console.log(firstName.length);
document.write(firstName.length);

// change case
console.log(firstName.toLowercase());
console.log(firstName.toUppercase());
document.write(firstName.toLowerCase);

// escaping
// let statement1 = 'wait I'm coming, that's good';
let statement1 = "wait I'm coming, that's good";
let statement2 = 'wait I\'m coming, that\'s good';

// string array - get specific character from string like an array
console.log(firstName[0]);

// indexOf
console.log(firstName.indexOf('i'));
console.log(firstName.lastIndexOf('a'));

// charAt()
console.log(firstName.charAt(2));

// get last character from string
console.log(firstName.charAt(firstName.length - 1));

// replace();
let replaceString = ('Dinanath', 'DJ');
console.log('My name is:', replaceString);

// substring();
console.log(firstName.substring(0, 4));

// slice();
console.log(firstName.slice(0, 4));

// slice(); negative number starts from backside
console.log(firstName.slice(-2));

// includes();
let message2 = 'Hello Dinanath, welcome to JavaScript';
console.log(message2.includes('Hello'));
console.log(message2.includes('Hi'));

// split()
let message3 = 'Hello Dinanath, welcome, to JavaScript';
console.log(message3.split(','));
console.log(message3.split(' '));

let courses = 'html5, css3, javascript, angular';
console.log(courses.split(','));
