import javax.swing.JOptionPane;
public class Main9 {
	public static void main(String[] args) {

		String entrada;
		int opcion;
		double a;
		float z;
		String[] botones = { "Dólar", "Euro", "Yen (Japonés) ", "Dólar de Hong Kong" };

		opcion = JOptionPane.showOptionDialog(null, "Convertir pesos MX a: ", "conversion",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

		switch (opcion) {
			case 0:
				entrada = JOptionPane.showInputDialog("pesos MX desea convertir: ");
				z = Integer.parseInt(entrada);
				a = z / 19.33;
				JOptionPane.showMessageDialog(null, "Dolar/es: \n" + a);
				break;

			case 1:
				entrada = JOptionPane.showInputDialog("pesos MX desea convertir:");
				z = Integer.parseInt(entrada);
				a = z / 21.41;
				JOptionPane.showMessageDialog(null, "Euro(s): \n" + a);
				break;

			case 2:
				entrada = JOptionPane.showInputDialog("pesos MX desea convertir:");
				z = Integer.parseInt(entrada);
				a = z / .18;
				JOptionPane.showMessageDialog(null, "Yen (Japonés): \n" + a);
				break;

			case 3:
				entrada = JOptionPane.showInputDialog("pesos MX desea convertir:");
				z = Integer.parseInt(entrada);
				a = z / 2.47;
				JOptionPane.showMessageDialog(null, "Dolar/es Hong Kong: \n" + a);
				break;

			default:
				JOptionPane.showMessageDialog(null, "No valida");
				break;

		}
	}
}