let numbers = [1, 5.2, 4, 0, -1];

function sum(numbers) {
    return numbers.reduce(function (a, b) {
        return a + b;
    }, 0);
}

console.log(sum(numbers))