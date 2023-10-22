class Solution {
public:
    int myAtoi(string s) {
        int i = 0;
        int n = s.length();
        while (i < n && s[i] == ' ') {
            i++;
        }
        int sign = 1;
        if (i < n && s[i] == '-') {
            sign = -1;
            i++;
        } else if (i < n && s[i] == '+') {
            i++;
        }
        long long result = 0;
        while (i < n && isdigit(s[i])) {
            result = result * 10 + (s[i] - '0');
            i++;
            if (result * sign < INT_MIN) {
                return INT_MIN;
            }
            if (result * sign > INT_MAX) {
                return INT_MAX;
            }
        }
        
        return static_cast<int>(result * sign);
    }
};
