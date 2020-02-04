package intro;

public class CountBits {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("BitCount for " + i + " :" + Integer.toBinaryString(i) + ": " + BitCount(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("BitCount for " + i + " :" + Integer.toBinaryString(i) + ": " + countOnes(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("count1Ones : BitCount for " + i + " :" + Integer.toBinaryString(i) + ": " + count1Ones(i));
        }
        System.out.println("BitCount for " + 99 + " :" + Integer.toBinaryString(99) + ": " + BitCount(99));
        System.out.println("BitCount for " + 99 + " :" + Integer.toBinaryString(99) + ": " + countOnes(99));
        System.out.println("BitCount for " + 99 + " :" + Integer.toBinaryString(99) + ": " + count1Ones(99));


        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " IsPowerOfTwo :" + isPowerOfTwo(i));
        }
    }

    /**
     * Brian Kernighan’s Algorithm:
     */
    public static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            System.out.println(" n: " + n + " : n & (n-1) : " + (n & (n - 1)));
            n = n & (n - 1);

            count++;
        }
        return count;
    }

    /**
     * Brian Kernighan’s Algorithm:
     */
    public static int count1Ones(int n) {
        int count = 0;
        while (n != 0) {
            count += n % 2;
            n = n / 2;
        }
        return count;
    }

    public static int BitCount(int a) {
        int orig = a;
        int count = 0;
        while (a > 0) {
            System.out.println("Start - a:" + a + " a>>1: " + (a >> 1));
            System.out.println("a>>1 <<1: " + (a >> 1 << 1));
            /*  Left shit 1 / divide by 2*/
            /*  Right shit 1 / mutiple by 2*/
            a = a >> 1 << 1;
            System.out.println("orig:" + orig + ", a: " + a);
            if (orig - a == 1)
                count++;
            orig = a >> 1;
            System.out.println("END - a:" + a + " a>>1: " + orig);
            a = orig;

        }
        return count;
    }

    public static Boolean isPowerOfTwo(int digit) {
        return (digit & (digit - 1)) == 0;
    }
}