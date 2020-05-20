import javax.swing.JOptionPane;

public class Main11 {
	public static void main(String[] args) {

		String entrada;
		String letrero = "";
		int n;

		entrada = JOptionPane.showInputDialog("Hasta que numero desea llegar");
		n = Integer.parseInt(entrada);
		int y=2,contador=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				for(int z=1;z<=y;z++)
				{
					letrero+= i+", ";
					contador++;
					if(contador>n)
					{
						JOptionPane.showMessageDialog(null, letrero);
						System.exit(0);
					}
				}
				y++;
			} else {
				letrero+= "-"+i+", ";
				contador++;
			}
		}
		JOptionPane.showMessageDialog(null, letrero);
	}
}
