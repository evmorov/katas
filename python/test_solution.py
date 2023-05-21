from solution import solution


def test_success():
    assert "hello world" == solution()


def test_error():
    assert [1, 2, 3] == [1, 3, 2]
