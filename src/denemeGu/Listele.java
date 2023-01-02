package denemeGu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Listele extends JFrame {

	private JPanel contentPane;
	static Listele frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					frame = new Listele();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Listele() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 426);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(651, 426); 
        this.setLocation((EkranX - 651) / 2, (EkranY - 426) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Yolcu Bilgileri");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Yolcu Bilgileri", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(90, 20, 454, 288);
		contentPane.add(panel);
		
		JLabel lblAd = new JLabel();
		lblAd.setText("Ad");
		lblAd.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblAd.setBounds(10, 46, 15, 19);
		panel.add(lblAd);
		
		JLabel lblTelefonNumarasi = new JLabel();
		lblTelefonNumarasi.setText("Telefon Numarasi");
		lblTelefonNumarasi.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblTelefonNumarasi.setBounds(10, 112, 106, 13);
		panel.add(lblTelefonNumarasi);
		
		JLabel lblSoyad = new JLabel();
		lblSoyad.setText("Soyad");
		lblSoyad.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblSoyad.setBounds(10, 75, 48, 13);
		panel.add(lblSoyad);
		
		JLabel lblNewLabel = new JLabel("Koltuk");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 135, 106, 13);
		panel.add(lblNewLabel);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("Ucus ID");
		jLabel1.setFont(new Font("Verdana", Font.ITALIC, 12));
		jLabel1.setBounds(10, 158, 55, 15);
		panel.add(jLabel1);
		
		JLabel lblS = new JLabel();
		lblS.setText("Tarih");
		lblS.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblS.setBounds(10, 198, 55, 15);
		panel.add(lblS);
		
		JLabel lblKalkisgidis = new JLabel();
		lblKalkisgidis.setText("Kalkis-Gidis");
		lblKalkisgidis.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblKalkisgidis.setBounds(10, 223, 69, 15);
		panel.add(lblKalkisgidis);
		
		JLabel lblSaat = new JLabel();
		lblSaat.setText("Saat");
		lblSaat.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblSaat.setBounds(10, 248, 69, 15);
		panel.add(lblSaat);
		
		JLabel lblSinif = new JLabel();
		lblSinif.setText("Sinif");
		lblSinif.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblSinif.setBounds(10, 17, 48, 19);
		panel.add(lblSinif);
		
		textField = new JTextField();
		textField.setText((String) null);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(126, 17, 318, 22);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText((String) null);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(126, 46, 318, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText((String) null);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(126, 72, 318, 22);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(126, 105, 318, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(126, 133, 318, 22);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText((String) null);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(126, 157, 318, 22);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText((String) null);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(126, 197, 318, 22);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText((String) null);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(126, 222, 318, 22);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText((String) null);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(126, 247, 318, 22);
		panel.add(textField_8);
		
		
		JButton btnNewButton = new JButton("Ileri");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Main m = new Main();
					m.setVisible(true);
					setVisible(false);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}		
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 11));
		btnNewButton.setBounds(541, 357, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Geri");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RezervasyonArama r = new RezervasyonArama();
				r.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		btnNewButton_1.setBounds(10, 357, 85, 21);
		contentPane.add(btnNewButton_1);
		
		RezervasyonArama r = new RezervasyonArama();
		String sinif = r.sinif;
		String ad = r.ad;
		String soyad = r.soyad;
		String telefonNumarasi = r.telefonNumarasi;
		String koltuk = r.koltuk;
		String ucusid = r.Ucusid;
		String kalkis_gidis = r.kalkis_gidis;
		String tarih = r.tarih;
		String saat = r.saat;
		
		textField.setText(sinif);
		textField_1.setText(ad);
		textField_2.setText(soyad);
		textField_3.setText(telefonNumarasi);
		textField_4.setText(koltuk);
		textField_5.setText(ucusid);
		textField_6.setText(tarih);
		textField_7.setText(kalkis_gidis);
		textField_8.setText(saat);
		
	}
}
