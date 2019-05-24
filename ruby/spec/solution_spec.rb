require_relative 'spec_helper'
require_relative '../src/solution'

describe do
  it do
    expect(func).to eq('hello world')
  end

  it do
    expect(func).to eq('byebye')
  end
end
