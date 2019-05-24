const { expect } = require('chai');
const { func } = require('../src/solution');

describe('#solution', function() {
  it('success', function() {
    expect(func()).to.eq('hello world');
  });

  it('error', function() {
    expect(func()).to.eq('byebye');
  });
});
