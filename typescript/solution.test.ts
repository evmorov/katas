import { solution } from './solution'
const jestConsole = console;
beforeEach(() => global.console = require('console'));
afterEach(() => global.console = jestConsole);

describe('#solution', () => {
  it('success', () => {
    expect(solution()).toEqual('hello world')
  })

  it('error', () => {
    expect([1, 2, 3]).toEqual([1, 3, 2])
  })
})
