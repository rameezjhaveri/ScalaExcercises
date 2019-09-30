import day5.calculator.Calculator
import resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {

  test("1+1 should return 2"){
    assert(Calculator.sum(1,1,"+")==2)
  }

  test("2+2 should return 4"){
    assert(Calculator.sum(2,2,"+")==4)
  }

  test("7+8 should return 15"){
    assert(Calculator.sum(7,8,"+")==15)
  }

  test("7-3 should return 4"){
    assert(Calculator.sum(7,3,"-")==4)
  }

  test("7*3 should return 21"){
    assert(Calculator.sum(7,3,"*")==21)
  }
}

