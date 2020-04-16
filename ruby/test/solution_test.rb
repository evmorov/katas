require 'minitest/autorun'
require_relative '../src/solution'

class SolutionTest < Minitest::Test
  def test_correct
    assert_equal 4, sum(1, 3)
  end

  def test_mistake
    assert_equal 5, sum(1, 3)
  end
end
