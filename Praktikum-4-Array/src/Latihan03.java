import javax.swing.JOptionPane;

public class Latihan03 {

		public static void main(String[] args) {
	        String input = JOptionPane.showInputDialog(null, "Masukkan jumlah Array", "Input", JOptionPane.INFORMATION_MESSAGE);
	        final int pInput = Integer.parseInt(input);

	        int[] angka = new int[pInput];
	        final int sizeAngka = angka.length;

	        for(int i = 0; i < sizeAngka; i++) {
	            String values = JOptionPane.showInputDialog(null, "Masukkan angka.", "Data array ke - " + i, JOptionPane.QUESTION_MESSAGE);
	            int pValues = Integer.parseInt(values);
	            angka[i] = pValues;
	        }

	        String output = "";

	        for(int j = 0; j < sizeAngka; j++) {
	            output += "angka[" + j + "] = " + angka[j] + "\n";
	        }

	        JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
	    }

	}
