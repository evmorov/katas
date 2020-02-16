require_relative '../src/solution'

describe 'solution' do
  describe '#sum' do
    it do
      expect(sum(1, 3)).to eq(4)
    end
  end
end
