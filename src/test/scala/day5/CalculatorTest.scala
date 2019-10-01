package day5
import resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {

  test("1+1 should return 2"){
    assert(Calculator.maths(1,1,"+")==2)
  }
  test("2+2 should return 4"){
    assert(Calculator.maths(2,2,"+")==4)
  }
  test("7+8 should return 15"){
    assert(Calculator.maths(7,8,"+")==15)
  }
  test("7-3 should return 4"){
    assert(Calculator.maths(7,3,"-")==4)
  }
  test("7*3 should return 21"){
    assert(Calculator.maths(7,3,"*")==21)
  }
  test("15/5 should return 3"){
    assert(Calculator.maths(15,5,"/")==3)
  }
  test("10/0 should return Undefined"){
    assert(Calculator.maths(10,0,"/")=="Undefined")
  }
  test("0/10 should return 0"){
    assert(Calculator.maths(0,10,"/")==0)
  }
  test("0/0 should return 0"){
    assert(Calculator.maths(0,0,"/")==0)
  }
  test("0*0 should return 0"){
    assert(Calculator.maths(0,0,"*")==0)
  }
  test("10*0 should return 0"){
    assert(Calculator.maths(10,0,"*")==0)
  }
  test("0*10 should return 0"){
    assert(Calculator.maths(0,10,"*")==0)
  }
}