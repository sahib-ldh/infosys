public class operators {
    public static void main(String args[]) {
        int numOne = 10;
        int numTwo = 5;
        int numThree = 30;
        boolean isTrue = true;
//unary
        System.out.println(numOne++ + " and " + ++numOne); //Output will be 10 12
        System.out.println(numTwo-- + " and " + --numTwo); //Output will be 5 3
        System.out.println(!isTrue + " and " + (~numOne + 1)); //Output will be false -13
// airthmetic
        System.out.println(numOne + numTwo); //Output will be 15
        System.out.println(numOne - numTwo); //Output will be 9
        System.out.println(numOne * numTwo); //Output will be 36
        System.out.println(numOne / numTwo); //Output will be 4
        System.out.println(numOne % numTwo); //Output will be 0
//relational
        System.out.println(numOne > numTwo); //Output will be true        
//logical   
        System.out.println(numOne > numTwo && numOne > numThree); //Output will be false
//ternary operator
        int min = (numOne < numTwo) ? numOne : numTwo;
        System.out.println(min); //Output will be 3
//Assignment operator
        System.out.println(numOne); //Output will be 12
        numOne += 5;
        System.out.println(numOne); //Output will be 17
        numOne -= 5;
        System.out.println(numOne); //Output will be 12
        numOne *= 5;
        System.out.println(numOne); //Output will be 60
        numOne /= 5;
        System.out.println(numOne); //Output will be 12
    }
    
    
}
