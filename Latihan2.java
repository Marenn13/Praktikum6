package Praktikum6;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Latihan2 extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_X_ORIGIN = 200;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDHT = 150;
    private static final int BUTTON_HEIGHT = 30;
    private JComboBox Agama;
    private JButton Submit;
    private JTextField text1, text2;
    private JTextArea text4;
    private JRadioButton p, w, bm, m;

    public Latihan2() {
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.LIGHT_GRAY);
        JLabel judul = new JLabel(" Input Data ");
        judul.setFont(new Font("Arial", Font.BOLD, 18));// Ganti jenis font dan ukuran sesuai keinginan
        judul.setBounds(0, 10, FRAME_WIDTH, BUTTON_HEIGHT);
        judul.setHorizontalAlignment(JLabel.CENTER);

        JLabel np = new JLabel("NIP :");
        np.setBounds(20, 60, BUTTON_WIDHT, BUTTON_HEIGHT);
        text1 = new JTextField(10);
        text1.setBounds(240, 60, BUTTON_WIDHT, BUTTON_HEIGHT);

        JLabel nama = new JLabel("Nama :");
        nama.setBounds(20, 100, BUTTON_WIDHT, BUTTON_HEIGHT);
        text2 = new JTextField(10);
        text2.setBounds(240, 100, BUTTON_WIDHT, BUTTON_HEIGHT);

        JLabel jk = new JLabel("Jenis Kelamin :");
        jk.setBounds(20, 140, BUTTON_WIDHT, BUTTON_HEIGHT);
        p = new JRadioButton("Pria");
        p.setBounds(240, 140, BUTTON_WIDHT, BUTTON_HEIGHT);
        w = new JRadioButton("Wanita");
        w.setBounds(240, 180, BUTTON_WIDHT, BUTTON_HEIGHT);
        ButtonGroup gender = new ButtonGroup();
        gender.add(p);
        gender.add(w);

        JLabel st = new JLabel("Status :");
        st.setBounds(20, 220, BUTTON_WIDHT, BUTTON_HEIGHT);
        m = new JRadioButton("Menikah");
        m.setBounds(240, 220, BUTTON_WIDHT, BUTTON_HEIGHT);
        bm = new JRadioButton("Belum Menikah");
        bm.setBounds(240, 260, BUTTON_WIDHT, BUTTON_HEIGHT);
        ButtonGroup status = new ButtonGroup();
        status.add(m);
        status.add(bm);

        JLabel agm = new JLabel("Agama :");
        agm.setBounds(20, 300, BUTTON_WIDHT, BUTTON_HEIGHT);
        String[] pilAgm = new String[]{
            "Islam", "Katolik", "Budha", "Hindu", "Konghucu"
        };
        Agama = new JComboBox(pilAgm);
        Agama.setBounds(240, 300, BUTTON_WIDHT, BUTTON_HEIGHT);

        JLabel al = new JLabel("Alamat");
        al.setBounds(20, 340, BUTTON_WIDHT, BUTTON_HEIGHT);
        text4 = new JTextArea();
        text4.setBounds(240, 340, 300, 100);

        Submit = new JButton("Submit");
       Submit.setBounds(325, 460, BUTTON_WIDHT, BUTTON_HEIGHT + 10);
        Submit.addActionListener(this); // Menambahkan event handler

        contentPane.add(judul);
        contentPane.add(np);
        contentPane.add(text1);
        contentPane.add(nama);
        contentPane.add(text2);
        contentPane.add(jk);
        contentPane.add(p);
        contentPane.add(w);
        contentPane.add(st);
        contentPane.add(m);
        contentPane.add(bm);
        contentPane.add(agm);
        contentPane.add(Agama);
        contentPane.add(al);
        contentPane.add(text4);
        contentPane.add(Submit);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
}
      @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("actionPerformed dipanggil");
        // Mendapatkan nilai dari komponen input
        String nip = text1.getText();
        String nama = text2.getText();

        String jenisKelamin = p.isSelected() ? "Pria" : (w.isSelected() ? "Wanita" : "");
        String status = m.isSelected() ? "Menikah" : (bm.isSelected() ? "Belum Menikah" : "");
        String agama = Agama.getSelectedItem().toString();
        String alamat = text4.getText();

        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Status: " + status);
        System.out.println("Agama: " + agama);
        System.out.println("Alamat: " + alamat);
    }
      public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Latihan2 form = new Latihan2();
            form.setVisible(true);
        });
    }
    
}
