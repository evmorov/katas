from solution import solution


def test_success():
    assert solution() == "hello world"


def test_error():
    assert [1, 2, 3] == [1, 3, 2]
