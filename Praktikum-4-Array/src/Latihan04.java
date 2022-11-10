import javax.swing.JOptionPane;
 
public class Latihan04 {

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

        int maxAngka = angka[0];
        int minAngka = angka[0];

        String output = "";

        for(int j = 0; j < sizeAngka; j++) {
            if(angka[j] > maxAngka) {
                maxAngka = angka[j];
            } else if(angka[j] < minAngka) {
                minAngka = angka[j];
            }
            output += "angka[" + j + "] = " + angka[j] + "\n";
        }

        output += "\nNilai terbesar adalah " + maxAngka + "\n";
        output += "Nilai terkecil adalah " + minAngka + "\n";

        JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }

}
