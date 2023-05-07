package arroganteIT.leetCode.addBinary;

import java.math.BigInteger;

public class Solution {
    public String addBinary(String a, String b) {

        BigInteger n1 = new BigInteger(a, 2);
        BigInteger n2 = new BigInteger(b, 2);

        Long result = n1.longValue() + n2.longValue();
        return Long.toBinaryString(result);
    }
}
