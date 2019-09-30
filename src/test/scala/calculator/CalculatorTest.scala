package calculator

import resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {
def calculator():Any=2


  test("1+1 should return 2"){
    assert(calculator()==2)
  }
}
