import javax.swing.JOptionPane;

public class Main10 {
	public static void main(String[] args) {
		String entrada;
		int i, n;
		double re = 0;
		entrada = JOptionPane.showInputDialog("cantidad de serie a generar:");
		n = Integer.parseInt(entrada);
		for (i = 1; i <= n; i++) {
			re = (Math.pow(i, (i * 2 - 1)));
			JOptionPane.showMessageDialog(null, i + ".- " + re);
		}
	}
}