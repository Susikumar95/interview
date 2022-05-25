package com.Array;

public class Cricket {
	// Java implementation of the approach

	
		
	static int mod = 1000000007;
	static int RUNMAX = 13;
	static int BALLMAX =3;
	static int WICKETMAX =1;
	// Function to return the number of ways
	// to score R runs in B balls with
	// at most W wickets
	static int CountWays(int r, int b, int l,
						int R, int B, int W,
								int [][][]dp)
	{

		// If the wickets lost are more
		if (l > W)
			return 0;

		// If runs scored are more
		if (r > R)
			return 0;

		// If condition is met
		if (b == B && r == R)
			return 1;

		// If no run got scored
		if (b == B)
			return 0;

		// Already visited state
		if (dp[r][b][l] != -1)
			return dp[r][b][l];

		int ans = 0;

		// If scored 0 run
		ans += CountWays(r, b + 1, l, R, B, W, dp);
		ans = ans % mod;

		// If scored 1 run
		ans += CountWays(r + 1, b + 1, l, R, B, W, dp);
		ans = ans % mod;

		// If scored 2 runs
		ans += CountWays(r + 2, b + 1, l, R, B, W, dp);
		ans = ans % mod;

		// If scored 3 runs
		ans += CountWays(r + 3, b + 1, l, R, B, W, dp);
		ans = ans % mod;

		// If scored 4 runs
		ans += CountWays(r + 4, b + 1, l, R, B, W, dp);
		ans = ans % mod;

		// If scored 6 runs
		ans += CountWays(r + 6, b + 1, l, R, B, W, dp);
		ans = ans % mod;

		// If scored no run and lost a wicket
		ans += CountWays(r, b + 1, l + 1, R, B, W, dp);
		ans = ans % mod;

		// Memoize and return
		return dp[r][b][l] = ans;
	}

	// Driver code
	public static void main(String[] args)
	{
		int R = 40, B = 10, W = 4;

		int[][][] dp = new int[RUNMAX][BALLMAX][WICKETMAX];
		for(int i = 0; i < RUNMAX;i++)
			for(int j = 0; j < BALLMAX; j++)
				for(int k = 0; k < WICKETMAX; k++)
		dp[i][j][k]=-1;

		System.out.println(CountWays(0, 0, 0, R, B, W, dp));
	}
	}

	// This code has been contributed by 29AjayKumar


