class POT {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Check if the number is a power of two 
        while (n % 2 == 0) {
            n /= 2;
        }
        
        return n == 1;
    }
}
