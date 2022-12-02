package com.ibik.pbo.praktikum;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class App {
    public static ArrayList<String> header;
    public static void main( String[] args ) {
        App mainApps = new App();

        header = new ArrayList<String>();
        header.add("Nama Lengkap");
        header.add("Alamat");
        header.add("No. Telp");
        
        ArrayList<ArrayList<String>> data_table = new ArrayList<ArrayList<String>>();

        for(int i = 0; i < header.size(); i++) {
            data_table.add(new ArrayList<String>());
            for(int j = 0; j < header.size(); j++) {
                String values = JOptionPane.showInputDialog(null,
                                "Masukkan " + header.get(j) + ":",
                                "Data ke - " + i,
                                JOptionPane.QUESTION_MESSAGE);
                data_table.get(i).add(j, values);
            }
        }

        String output_data_table = mainApps.PrintValues(data_table);

        JOptionPane.showMessageDialog(null, output_data_table, "Output Data", JOptionPane.INFORMATION_MESSAGE);
    }

    private String PrintValues(ArrayList<ArrayList<String>> val) {
        String output = "";
        for(int i = 0; i < val.size(); i++) {
            for(int j = 0; j < val.size(); j++) {
                output += header.get(j) + ": " + val.get(i).get(j) + "\n";
            }
            output += "\n";
        }
        return output;
    }

}
    
