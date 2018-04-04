public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // 1. Create a byte variable and set it to a valid byte number

        byte myByte = 127;

        // 2. Create a short variable and set it to a valid short number

        short myShort = 30000;

        // 3. Create an int variable and set it to a valid int number

        int myInt = 1234566667;

        // 4. Create a variable of type long and make it equal
        // to 50000 = 10 times the sum of the byte plus the short
        // plus the int

        long myLong = 1 * (myByte + myInt + myShort);

        System.out.println("myLong = " + myLong);
    }
}
