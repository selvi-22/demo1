function validation(name) {
    console.log(name);
    alert(`name is valid, ${name}`);
}
function processUserInput(callback) {
    const name = prompt("Please enter your name.");
    console.log(name);
    callback(name)
}
processUserInput(validation);
