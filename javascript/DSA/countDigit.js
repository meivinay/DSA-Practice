class Count {
  isZero(n) {
    return n === 0;
  }
  digit(n) {
    if (this.isZero(n)) {
      return n;
    }
    let count = 0;
    let remainingDigit = Math.abs(n);
    while (remainingDigit > 0) {
      count++;
      remainingDigit = Math.floor(remainingDigit / 10);
    }
    return count;
  }
  logDigit(n) {
    if (this.isZero(n)) return 1;
    const count = Math.floor(Math.log10(Math.abs(n))) + 1;
    return count;
  }
}

const count = new Count();
