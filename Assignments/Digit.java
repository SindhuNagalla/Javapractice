class Digit 
{
    public static void main(String[] args)
	{
        int number = 12345;
        int temp = number;
        int digitCount = 0;

        while (temp > 0) 
		{
            temp /= 10;
            digitCount++;
        }

        for (int i = digitCount - 1; i >= 0; i--) 
		{
            int digit = (number / (int) Math.pow(10, i)) % 10;
            System.out.println(digit);
        }
    }
}