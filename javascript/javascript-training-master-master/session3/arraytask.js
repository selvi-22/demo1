/*
You ask the user to enter her city. 
Then you check her city against a list of the 5 cleanest
cities.
If the user enters "Cheyenne" or any of the other cleanest cities, your code displays an
alert telling her that it's one of the cleanest cities.
*/

var cityToCheck = prompt("Enter your city");
cityToCheck = cityToCheck.toLowerCase();
var cleanestCities = ["cheyenne", "santa fe", "tucson", "great falls", "honolulu"];
for (var i = 0; i <= 4; i++) {
    if (cityToCheck === cleanestCities[i]) {
        alert("It's one of the cleanest cities");
    }
}