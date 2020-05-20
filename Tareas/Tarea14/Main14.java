import javax.swing.JOptionPane;

public class Main14 {
	public static void main(String[] args) {

		int a[][], i, j, n, m, busq;
		String entrada;

		entrada = JOptionPane.showInputDialog("cantidad de filas: ");
		n = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("cantidad de columnas:");
		m = Integer.parseInt(entrada);

		a = new int[n][m];

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				entrada = JOptionPane.showInputDialog("A[" + (i + 1) + "][" + (j + 1) + "]=");
				a[i][j] = Integer.parseInt(entrada);
			}
		}

		String letrero = "A[" + n + "][" + m + "]\n";
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				letrero = letrero + a[i][j] + "  ";
			}
			letrero = letrero + "\n";
		}
		entrada = JOptionPane.showInputDialog("\n" + letrero + "\nNumero a buscar en la matriz:");
		busq = Integer.parseInt(entrada);

		int x = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {

				if (busq == a[i][j]) {
					x++;
				}
			}
		}

		if (x >= 1) {
			JOptionPane.showMessageDialog(null, "\n" + letrero + "\nEl numero que busca es el: " + busq + "\nNumero de veces que aparece: " + x);
		} else {
			JOptionPane.showMessageDialog(null, "\n" + letrero + "El numero no fue encontrado.");
		}
	}
}