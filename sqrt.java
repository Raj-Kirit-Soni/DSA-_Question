class sqrt {
    public int mySqrt(int x) {
        if (x < 2) return x;  // sqrt(0)=0, sqrt(1)=1

        int left = 1, right = x / 2;  // sqrt(x) ≤ x/2 for x ≥ 2
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // To avoid overflow, compare mid with x/mid instead of mid*mid
            if (mid <= x / mid) {
                ans = mid;       // mid is a candidate
                left = mid + 1;  // try to find a larger one
            } else {
                right = mid - 1; // mid^2 > x, move left
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        sqrt solution = new sqrt();
        int x = 8;
        System.out.println("The integer square root of " + x + " is: " + solution.mySqrt(x));
    }
}
