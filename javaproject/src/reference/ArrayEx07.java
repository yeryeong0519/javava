package reference;

public class ArrayEx07 {

	public static void main(String[] args) {
		int[][] nums = new int[3][5];
		nums[0][0] = 10;
		nums[1][1] = 20;
		nums[2][2] = 30;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();

		}
	}
}
