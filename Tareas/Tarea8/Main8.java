import javax.swing.JOptionPane;

public class Main8 {
    public static void main(String[] args) {

        String entrada;
        int opciones;
        double X, Y;
        float z;

        String[] botones = { "Centigrados a Farenheit", "Farenheit a Centigrados" };

        opciones = JOptionPane.showOptionDialog(null, "Elija la conversion que desea", "Grados",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        switch (opciones) {
            case 0:
                entrada = JOptionPane.showInputDialog("Ingrese grados celsius: ");
                z = Integer.parseInt(entrada);
                X = ((z * 1.8) + 32);
                JOptionPane.showMessageDialog(null, "Grados farenheit: \n" + X);
                break;
            case 1:
                entrada = JOptionPane.showInputDialog("Ingrese grados farenheit: ");
                z = Integer.parseInt(entrada);
                Y = ((z - 32) / 1.8);
                JOptionPane.showMessageDialog(null, "Grados celsius: \n" + Y);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
                break;
        }
    }
}