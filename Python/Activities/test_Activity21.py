import pytest
import math

def test_sum():
    num1=10
    num2=20
    sum=num1+num2
    assert sum==30

def test_difference():
    num1=30
    num2=10
    diff=num1-num2
    assert diff==20

def test_multiplication():
    num1=5
    num2=10
    multi=num1*num2
    assert multi==50

def test_div():
    num1=50
    num2=5
    div=num1/num2
    assert div==10
    