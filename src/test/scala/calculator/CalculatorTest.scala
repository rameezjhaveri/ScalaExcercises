package calculator

import resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {
def calculator(number1:Int, number2:Int):Any=number1+number2

  test("1+1 should return 2"){
    assert(calculator(1,1)==2)
  }

  test("2+2 should return 4"){
    assert(calculator(2,2)==4)
  }

  test("7+8 should return 15"){
    assert(calculator(7,8)==15)
  }

  test("7-3 should return 4"){
    assert(calculator(7,3)==4)
  }
}

