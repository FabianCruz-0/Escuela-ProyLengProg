import javax.swing.JOptionPane;

public class Main15 {
	public static void main(String[] args) {

		String entrada, letrero = "";
		int[][] a;
		int[][] b;
		int[][] c;
		int i, j, n, m;

		entrada = JOptionPane.showInputDialog("Numero de filas de sus matrices: ");
		n = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Numero de columnas de sus matrices: ");
		m = Integer.parseInt(entrada);
		a = new int[n][m];
		b = new int[n][m];

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				entrada = JOptionPane.showInputDialog(null,
						"numero de la primera matriz [" + (i + 1) + "][" + (j + 1) + "]");
				a[i][j] = Integer.parseInt(entrada);
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				entrada = JOptionPane.showInputDialog(null,
						"numero de la segunda matriz [" + (i + 1) + "][" + (j + 1) + "]");
				b[i][j] = Integer.parseInt(entrada);
			}
		}
		c = new int[n][m];
		letrero = letrero + "La matriz A+B resulta: \n";
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				c[i][j] = a[i][j] + b[i][j];
				letrero = letrero + c[i][j] + " ";
			}
			letrero = letrero + "\n";
		}
		JOptionPane.showMessageDialog(null, letrero);

	}
}