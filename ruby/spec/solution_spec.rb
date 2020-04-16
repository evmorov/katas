require_relative '../src/solution'

describe 'solution' do
  describe '#sum' do
    it 'correct'  do
      expect(sum(1, 3)).to eq(4)
    end

    it 'mistake' do
      expect(sum(1, 3)).to eq(5)
    end
  end
end
