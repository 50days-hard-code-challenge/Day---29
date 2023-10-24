int countDigits(int n) {
    if (n == 0) {
        return 1; // Special case: if n is 0, it has one digit, which is 0 itself.
    }  
    int val = n;
    int count = 0;
    while (n != 0) {
        int rem = n % 10;
        if (rem != 0 && val % rem == 0) {
            count++;
        }    
        n = n / 10;
    }
    return count;
}

 
