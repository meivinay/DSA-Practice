const Count = require("./countDigit");

test("Digit Count is 12 by Divide", () => {
  const count = new Count();
  const dig = 123456789012;

  expect(count.digit(dig)).toBe(12);
});

test("Digit Count is 12 by Log", () => {
  const count = new Count();
  const dig = 123456789012;
  expect(count.logDigit(dig)).toBe(12);
});
