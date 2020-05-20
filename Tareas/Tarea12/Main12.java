import javax.swing.JOptionPane;

public class Main12 {
	public static void main(String[] args) {

		String entrada;
		String letrero = "";
		int n;

		entrada = JOptionPane.showInputDialog("Cuantas veces desea realizar la serie");
		n = Integer.parseInt(entrada);

		int pos = 1;
		int seriePos = 2;
		int serieNeg = -3;
		boolean turnPos = true;
		int contadorNums = 0;

		for (int i = 1; i < n; i++)
		{
			if (turnPos) {
				for (int y = 1; y <= pos; y++) {
					if (contadorNums >= n) {
						JOptionPane.showMessageDialog(null, letrero);
						System.exit(0);
					} else {
						letrero += seriePos + ", ";
						seriePos += 2;
						contadorNums++;
					}
				}
				turnPos = false;
				pos++;
			} else {
				for (int y = 1; y <= 3; y++) {
					if (contadorNums >= n) {
						JOptionPane.showMessageDialog(null, letrero);
						System.exit(0);
					} else {
						letrero += serieNeg + ", ";
						serieNeg -= 2;
						contadorNums++;
					}
				}
				turnPos = true;
			}
		}
	}
}