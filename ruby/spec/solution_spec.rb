require_relative '../src/solution'

describe 'solution' do
  describe '#solution' do
    it 'correct' do
      expect(solution(1, 3)).to eq(4)
    end

    it 'mistake' do
      expect(solution(1, 3)).to eq(5)
    end
  end
end
