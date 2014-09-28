package calculator;

public class CalculatorModel {

	private int calculatorValue;
	
	public void addTwoNumbers(int numberOne, int numberTwo){
		calculatorValue = numberOne + numberTwo;
	}
	
	public int getCalculationValue(){
		return calculatorValue;
	}
}
