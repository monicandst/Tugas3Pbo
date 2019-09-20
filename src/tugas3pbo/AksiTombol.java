package tugas3pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AksiTombol extends JFrame {

    public AksiTombol() {
        // judul frame
        setTitle("P E N D A F T A R A N");
        setSize(600,320);
        setDefaultCloseOperation(3);
        setSize(1000, 600); // ukuran frame
        setLocationRelativeTo(null);
        setResizable(false);
        ButtonGroup group = new ButtonGroup(); // deklarasi

        setLayout(null); // set layout

        JLabel judul= new JLabel("D A T A  D A F T A R");
        add(judul);
        judul.setBounds(450,20,150,20);

        JLabel lnik = new JLabel("NIK "); // text nik untuk mendaftar
        lnik.setBounds(10, 70, 120, 20);
        add(lnik);
        JTextField fnik = new JTextField(10); // input nik
        fnik.setBounds(130, 70, 150, 20);
        add(fnik);

        JLabel lnama = new JLabel(" Nama "); // text nama
        lnama.setBounds(10, 100, 120, 20);
        add(lnama);
        JTextField fnama = new JTextField(10); // input nama
        fnama.setBounds(130, 100, 150, 20);
        add(fnama);

        JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
        ljeniskelamin.setBounds(10, 130, 120, 20);
        add(ljeniskelamin);
        JRadioButton rbPria = new JRadioButton(" Laki-Laki "); // input menggunakan radio button
        rbPria.setBounds(130, 130, 100, 20);
        add(rbPria);
        group.add(rbPria);
        JRadioButton rbWanita = new JRadioButton("Perempuan ");// input juga menggunakan radio button
        rbWanita.setBounds(230, 130, 100, 20);
        add(rbWanita);
        group.add(rbWanita);

        JLabel lagama = new JLabel(" Agama ");
        String[] namaAgama
                = {"Islam", "Kristen", "Katolik", "Hindu", "Budha","Konghucu"};

        lagama.setBounds(10, 160, 150, 20);
        add(lagama);
        JComboBox cmbAgama = new JComboBox(namaAgama); // input menggunakan combo box (yang bisa dipilih salah satu)
        cmbAgama.setBounds(130, 160, 150, 20);
        add(cmbAgama);

        JLabel lhobby = new JLabel(" Hobby ");
        lhobby.setBounds(10, 190, 120, 20);
        add(lhobby);
        JCheckBox cbDance = new JCheckBox(" Dance ");
        cbDance.setBounds(130, 190, 100, 20);
        add(cbDance);
        JCheckBox cbBasket = new JCheckBox(" Basket ");
        cbBasket.setBounds(230, 190, 150, 20);
        add(cbBasket);

        setVisible(true);
        //button untuk menyimpan
        JButton save = new JButton("Save");
        add(save);
        save.setBounds(50, 220, 80, 30);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nik = fnik.getText();
                String nama = fnama.getText();
                String jenkel = "";
                if (rbPria.isSelected()) {
                    jenkel = "Laki-Laki";
                } else if (rbWanita.isSelected()) {
                    jenkel = "Perempuan";
                }
                String agama = cmbAgama.getSelectedItem().toString();
                String hobi = "";
                if (cbDance.isSelected()) {
                    hobi = "Sepakbola";
                } else if (cbBasket.isSelected()) {
                    hobi = "Basket";
                }
                HasilAksi out = new HasilAksi(nik, nama, jenkel, agama, hobi);
                dispose();
            }
        });
    }

}
