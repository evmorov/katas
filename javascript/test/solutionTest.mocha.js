const { expect } = require('chai');
const { hello } = require('../src/solution');

describe('#solution', function () {
  it('success', function () {
    expect(hello()).to.eq('hello world');
  });

  it('error', function () {
    expect([1, 2, 3]).deep.equal([1, 3, 2]);
  });
});
