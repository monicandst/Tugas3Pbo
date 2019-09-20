package tugas3pbo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HasilAksi extends JFrame {

    public HasilAksi(String nik, String nama, String jenkel, String agama, String hobi) {

        JFrame frameq = new JFrame();
        frameq.setTitle("D A T A");
        frameq.setSize(800, 500);
        frameq.setLocationRelativeTo(null);
        frameq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameq.setResizable(false);
        frameq.setVisible(true);
        frameq.setLayout(null);

        JLabel lnik = new JLabel("NIK");
        frameq.add(lnik);
        lnik.setBounds(50, 70, 150, 20);
        JLabel titikDua = new JLabel(" : ");
        frameq.add(titikDua);
        titikDua.setBounds(185, 70, 150, 20);
        JLabel hasilnik = new JLabel(nik);
        frameq.add(hasilnik);
        hasilnik.setBounds(200, 70, 280, 20);

        JLabel lnama = new JLabel("Nama");
        frameq.add(lnama);
        lnama.setBounds(50, 100, 150, 20);
        JLabel titikDuaA = new JLabel(" : ");
        frameq.add(titikDuaA);
        titikDuaA.setBounds(185, 100, 150, 20);
        JLabel hasilnama = new JLabel(nama);
        frameq.add(hasilnama);
        hasilnama.setBounds(200, 100, 280, 20);

        JLabel ljenkel = new JLabel("Jenis Kelamin");
        frameq.add(ljenkel);
        ljenkel.setBounds(50, 130, 150, 20);
        JLabel titikDuaB = new JLabel(" : ");
        frameq.add(titikDuaB);
        titikDuaB.setBounds(185, 130, 150, 20);
        JLabel hasiljenkel = new JLabel(jenkel);
        frameq.add(hasiljenkel);
        hasiljenkel.setBounds(200, 130, 580, 20);

        JLabel lagama = new JLabel("Agama");
        frameq.add(lagama);
        lagama.setBounds(50, 160, 150, 20);
        JLabel titikDuaC = new JLabel(" : ");
        frameq.add(titikDuaC);
        titikDuaC.setBounds(185, 160, 150, 20);
        JLabel hasilagama = new JLabel(agama);
        frameq.add(hasilagama);
        hasilagama.setBounds(200, 160, 280, 20);

        JLabel lhobi = new JLabel("Hobi");
        frameq.add(lhobi);
        lhobi.setBounds(50, 190, 150, 20);
        JLabel titikDuaD = new JLabel(" : ");
        frameq.add(titikDuaD);
        titikDuaD.setBounds(185, 190, 150, 20);
        JLabel hasilhobi = new JLabel(hobi);
        frameq.add(hasilhobi);
        hasilhobi.setBounds(200, 190, 280, 20);

    }

}
