package NQueen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NQueen {

	public static void main(String[] args) {
		Set<String> set = callMove(8);

		for (String s : set) {
			System.out.print(s);
			System.out.print("\n"
					+ "----------------------------------------\n");
		}
		System.out.println(set.size());
	}

	static Set<String> callMove(int n) {
		Set<String> set = new HashSet<String>();

		int[][] board = new int[n][n];
		// for (int i = 0; i < n; i++) {
		for (int j = 0; j < board.length; j++) {
			// board[j][0] = 1;
			move(board, j, 0,0);
//			 if(sum == board.length-1) //one Q is already set .
			String s = toString(board);
			if (s != null)
				set.add(toString(board));

			for (int l = 0; l < n; l++) {
				for (int m = 0; m < n; m++) {
					board[l][m] = 0;
				}
				// }
			}
		}

		return set;
	}

	static int move(int[][] board, int i, int j, int sum) {
		if ((i >= 0 && i < board.length) && (j >= 0 && j < board.length)) {
		
			if(sum == board.length -7)
				return sum;
			
			if (checkBoard(board, i, j)) {
//				move(board, i , j + 1);
//				move(board, i , j - 1);//This does not work because it always fasle for checkboard
				for(int k =0; k <board.length; k++)
					sum += move(board, i + 1, k, sum+1);
				for(int k =0; k <board.length; k++)
					sum += move(board, i - 1, k, sum+1);
//				move(board, i + 2, j + 1, sum+1);
//				move(board, i + 2, j - 1, sum+1);
//				move(board, i - 2, j - 1, sum+1);// If we do i -1 or j-1 we do have
//				move(board, i - 2, j + 1, sum+1); // infinite without if
//				move(board, i + 1, j + 2, sum+1);
//				move(board, i + 1, j - 2, sum+1);
//				move(board, i - 1, j - 2, sum+1);
//				move(board, i - 1, j + 2, sum+1);
//				board[i][j] = 0;
				// loop.
			}
		}
		 return sum;
	}

	static boolean checkBoard(int[][] board, int i, int j) {
		boolean visited = false;
		for (int k = 0; k < board.length; k++) {
			if (board[i][k] == 1) {
				visited = true;
				break;
			}
			if (board[k][j] == 1) {
				visited = true;
				break;
			}
			if ((i + k < board.length && j + k < board.length)
					&& board[i + k][j + k] == 1) {
				visited = true;
				break;
			}
			if ((i - k >= 0 && j - k >= 0) && board[i - k][j - k] == 1) {
				visited = true;
				break;
			}

			if ((i - k >= 0 && j + k < board.length)
					&& board[i - k][j + k] == 1) {
				visited = true;
				break;
			}
			if ((i + k < board.length && j - k >= 0)
					&& board[i + k][j - k] == 1) {
				visited = true;
				break;
			}

		}

		if (!visited) {
			board[i][j] = 1;
		}

		return (!visited);
	}

	static String toString(int[][] board) {
		StringBuffer sb = new StringBuffer();
		int totalQ = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != 1)
					sb.append("-\t");
				else {
					totalQ++;
					sb.append("Q\t");
				}
			}
			sb.append("\n");
		}

//		return (totalQ == board.length) ? sb.toString() : null;
		return sb.toString();
	}
}
