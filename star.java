class while_sumofdigit{
    public static void main(String[] args) {
		int inputNumber = 7161;
		int sumOfDigits = 0;
		int temp = 0;

		while (inputNumber > 0) {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
            System.out.println("Input is : " + inputNumber + " Sum of digit is : " + sumOfDigits + " Temp is " + temp);
		}

		System.out.println("Sum of digits are : " + sumOfDigits);
}
}