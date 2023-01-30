import { expect } from 'chai'
import { solution } from '../src/solution'

describe('#solution', function () {
  it('success', function () {
    expect(solution()).to.eq('hello world')
  })

  it('error', function () {
    expect([1, 2, 3]).deep.equal([1, 3, 2])
  })
})
