function fibonacci(num) {
    const base = [1, 1]

    if (base.length >= num) return base.slice(0, num);

    while (base.length < num) {
        let len = base.length;
        base.push(base[len - 1] + base[len - 2])
    }
    return base
}

const fib = fibonacci(3);