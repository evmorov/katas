const { hello } = require('../src/solution');

describe('#solution', () => {
  test('success', () => {
    expect(hello()).toEqual('hello world');
  });

  test('error', () => {
    expect([1, 2, 3]).toEqual([1, 3, 2]);
  });
});