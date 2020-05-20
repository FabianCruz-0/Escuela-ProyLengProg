import javax.swing.JOptionPane;

public class Main16 {
    public static void main(String[] args) {
        int i, j, k;
        int[][] m1, m2;
        int[] n = new int[2], m = new int[2];
        String salida = "";

        for (i = 0; i < 2; i++) {
            n[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Ingresa la cantidad de filas de la matriz " + (i + 1) + ": "));
            m[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad de columnas de la matriz " + (i + 1) + ": "));
        }

        m1 = new int[n[0]][m[0]];
        m2 = new int[n[1]][m[1]];

        if (m[0] == n[1]) {
            salida = "Matriz 1 [" + n[0] + "][" + m[0] + "]\n";
            for (i = 0; i < n[0]; i++) {
                for (j = 0; j < m[0]; j++) {
                    m1[i][j] = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Matriz 1 [" + (i + 1) + "][" + (j + 1) + "]="));
                    salida = salida + " | " + m1[i][j] + " | ";
                }
                salida = salida + "\n";
            }
            salida = salida + "Matriz 2 [" + n[1] + "][" + m[1] + "]\n";

            for (i = 0; i < n[1]; i++) {
                for (j = 0; j < m[1]; j++) {
                    m2[i][j] = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Matriz 2 [" + (i + 1) + "][" + (j + 1) + "]="));
                    salida = salida + " | " + m2[i][j] + " | ";
                }
                salida = salida + "\n";
            }
            int[][] resultado = new int[m[1]][n[0]];

            for (i = 0; i < resultado.length; i++) {
                for (j = 0; j < resultado[i].length; j++) {
                    for (k = 0; k < m[0]; k++) {
                        resultado[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            salida = salida + "Resultado [" + resultado.length + "][" + resultado[0].length + "]\n";

            for (i = 0; i < resultado.length; i++) {
                for (j = 0; j < resultado[0].length; j++) {
                    salida = salida + " | " + resultado[i][j] + " | ";
                }
                salida = salida + "\n";
            }
            JOptionPane.showMessageDialog(null, salida);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Las columnas de la matriz 1 deben coincidir con las filas de la matriz 2");
        }
    }
}