function repeatStr(n, s) {
    var str = ""
    for (let i = 0; i < n; i++) {
        str += s
    }
    return str;
}

console.log(repeatStr(5, "Hello"));

function repeatStr1(n, s) {
    var str = "";
    for (var i = 0; i < n; i++) {
        str += s;
        return str;
    }
}

console.log(repeatStr(6, "I"));