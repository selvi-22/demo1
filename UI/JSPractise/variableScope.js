// global variable
var globalName = 'Global';

window.alert(globalName);

function showName() {
    // local variable
    var localName = 'Local';
    const PI = 3.14;
    window.alert(localName);
    window.alert(globalName); // recall global variable
    window.alert(PI);
    window.alert("Datatype : "+typeof(PI));
}

// invoke/call/run function
showName();

// error - as local variable not exist/available outside of block { }
window.alert(localName);