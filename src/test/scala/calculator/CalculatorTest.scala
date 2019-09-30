package calculator

import resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {
def calculator(number1:Int):Any=number1*2


  test("1+1 should return 2"){
    assert(calculator(1)==2)
  }

  test("2+2 should return 4"){
    assert(calculator(2)==4)
  }
}

