function oddOrEven(array) {
    return array.reduce((a, b) => a + b, 0) % 2 === 0 ? "even" : "odd";
}

console.log(oddOrEven([0, 1, 2]))
console.log(oddOrEven([0, 1, 4]))
console.log(oddOrEven([0]))
console.log(oddOrEven([0, 1, 5]))
console.log(oddOrEven([0, 1, 3]))
console.log(oddOrEven([1]))
console.log(oddOrEven([]))



//odd = Impar / Even = Par

