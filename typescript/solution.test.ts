import Greeting from './solution';

describe('#solution', () => {
  it('success', () => {
    expect(Greeting.hello()).toEqual('hello world');
  });

  it('error', () => {
    expect([1, 2, 3]).toEqual([1, 3, 2]);
  });
});
