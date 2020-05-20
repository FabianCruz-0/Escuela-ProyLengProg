import javax.swing.JOptionPane;

public class Main13 {
	public static void main(String[] args) {

		int n, i, a[], busq;
		int x;
		String entrada;

		entrada = JOptionPane.showInputDialog(null, "Tamaño del vector: ");
		n = Integer.parseInt(entrada);
		a = new int[n];

		for (i = 0; i < n; i++) {
			entrada = JOptionPane.showInputDialog(null, "numero: ");
			a[i] = Integer.parseInt(entrada);
		}

		String letrero = "Vector =[";
		for (i = 0; i < n; i++) {
			if (i == n - 1) {
				letrero = letrero + a[i] + "].";
				break;
			}
			letrero = letrero + a[i] + ",";
		}
		String letrero2 = letrero + "\nNumero a buscar: ";

		x = 0;
		entrada = JOptionPane.showInputDialog(null, letrero2);
		busq = Integer.parseInt(entrada);
		for (i = 0; i < n; i++) {
			if (busq == a[i]) {
				x++;
			}
		}
		if (x >= 1) {
			JOptionPane.showMessageDialog(null,
					letrero + "\nEl numero: " + busq + "\nNumero de veces encontrado: " + x);
		} else {
			JOptionPane.showMessageDialog(null, letrero + "\nEl numero no fue encontrado");
		}
	}
}
