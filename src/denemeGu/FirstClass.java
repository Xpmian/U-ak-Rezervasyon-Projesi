package denemeGu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dene.Kayit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class FirstClass extends JFrame 
{
	public String koltuk;
	private JPanel contentPane;
	private JPanel contentPane_1;
	static FirstClass frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_1;
	static ResultSet rs;
	public static String koltukk;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
    private JTextField textField_8;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					frame = new FirstClass();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public FirstClass() throws IOException 
	{	
		Random random = new Random();
		long randomSayi = random.nextInt(214748664) + 214748664;
		String randomsayi = Long.toString(randomSayi);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 480);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(1000, 480); 
        this.setLocation((EkranX - 1000) / 2, (EkranY - 480) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		final BufferedImage image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\a10.jpg"));
		contentPane_1 = new JPanel()
		{
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };
		setTitle("First Class");
		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setBounds(43, 42, 55, 15);
		jLabel1.setText("Ucus ID");
		jLabel1.setFont(new Font("Verdana", Font.ITALIC, 12));
		contentPane_1.add(jLabel1);
		
		JOptionPane jf=new JOptionPane();
        jf.showMessageDialog(frame, "UcusId'nizi kayit etmeyi unutmayiniz!!!!!");
		
		JButton btnNewButton = new JButton("A1");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("A1");
				ayniKoltuk(textField.getText());
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton.setBounds(43, 87, 48, 16);
		contentPane_1.add(btnNewButton);
		
		JButton btnA = new JButton("A2");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("A2");
				ayniKoltuk(textField.getText());
			}
		});
		btnA.setFont(new Font("Dialog", Font.BOLD, 11));
		btnA.setBounds(43, 113, 48, 16);
		contentPane_1.add(btnA);
		
		JButton btnA_1 = new JButton("A3");
		btnA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("A3");
				ayniKoltuk(textField.getText());
			}
		});
		btnA_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnA_1.setBounds(43, 139, 48, 16);
		contentPane_1.add(btnA_1);
		
		JButton btnA_2 = new JButton("A4");
		btnA_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("A4");
				ayniKoltuk(textField.getText());
			}
		});
		btnA_2.setFont(new Font("Dialog", Font.BOLD, 11));
		btnA_2.setBounds(43, 165, 48, 16);
		contentPane_1.add(btnA_2);
		
		JButton btnB = new JButton("B1");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("B1");
				ayniKoltuk(textField.getText());
			}
		});
		btnB.setFont(new Font("Dialog", Font.BOLD, 11));
		btnB.setBounds(101, 87, 48, 16);
		contentPane_1.add(btnB);
		
		JButton btnB_1 = new JButton("B2");
		btnB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("B2");
				ayniKoltuk(textField.getText());
			}
		});
		btnB_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnB_1.setBounds(101, 113, 48, 16);
		contentPane_1.add(btnB_1);
		
		JButton btnB_2 = new JButton("B3");
		btnB_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("B3");
				ayniKoltuk(textField.getText());
			}
		});
		btnB_2.setFont(new Font("Dialog", Font.BOLD, 11));
		btnB_2.setBounds(101, 139, 48, 16);
		contentPane_1.add(btnB_2);
		
		JButton btnB_3 = new JButton("B4");
		btnB_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("B4");
			}
		});
		btnB_3.setFont(new Font("Dialog", Font.BOLD, 11));
		btnB_3.setBounds(101, 165, 48, 16);
		contentPane_1.add(btnB_3);
		
		JButton btnG = new JButton("C1");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("C1");
				ayniKoltuk(textField.getText());
			}
		});
		btnG.setFont(new Font("Dialog", Font.BOLD, 11));
		btnG.setBounds(210, 87, 48, 16);
		contentPane_1.add(btnG);
		
		JButton btnH = new JButton("H1");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("H1");
			}
		});
		btnH.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH.setBounds(268, 87, 48, 16);
		contentPane_1.add(btnH);
		
		JButton btnG_1 = new JButton("C2");
		btnG_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("C2");
				ayniKoltuk(textField.getText());
			}
		});
		btnG_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnG_1.setBounds(210, 113, 48, 16);
		contentPane_1.add(btnG_1);
		
		JButton btnH_1 = new JButton("H2");
		btnH_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("H2");
				ayniKoltuk(textField.getText());
			}
		});
		btnH_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_1.setBounds(268, 113, 48, 16);
		contentPane_1.add(btnH_1);
		
		JButton btnG_2 = new JButton("C3");
		btnG_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("C3");
				ayniKoltuk(textField.getText());
			}
		});
		btnG_2.setFont(new Font("Dialog", Font.BOLD, 11));
		btnG_2.setBounds(210, 139, 48, 16);
		contentPane_1.add(btnG_2);
		
		JButton btnH_2 = new JButton("H3");
		btnH_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("H3");
				ayniKoltuk(textField.getText());
			}
		});
		btnH_2.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_2.setBounds(268, 139, 48, 16);
		contentPane_1.add(btnH_2);
		
		JButton btnG_3 = new JButton("C4");
		btnG_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("C4");
				ayniKoltuk(textField.getText());
			}
		});
		btnG_3.setFont(new Font("Dialog", Font.BOLD, 11));
		btnG_3.setBounds(210, 165, 48, 16);
		contentPane_1.add(btnG_3);
		
		JButton btnH_3 = new JButton("H4");
		btnH_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("H4");
				ayniKoltuk(textField.getText());
			}
		});
		btnH_3.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_3.setBounds(268, 165, 48, 16);
		contentPane_1.add(btnH_3);
		
		JButton btnNewButton_1 = new JButton("Geri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				RezerveKoltuk r = new RezerveKoltuk();
				r.setVisible(true);
				setVisible(false);	
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.ITALIC, 12));
		btnNewButton_1.setBounds(39, 398, 85, 21);
		contentPane_1.add(btnNewButton_1);
		
		
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Yolcu Bilgilerini Giriniz", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(728, 10, 248, 137);
		contentPane_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblAd = new JLabel();
		lblAd.setBounds(10, 24, 15, 19);
		lblAd.setText("Ad");
		lblAd.setFont(new Font("Verdana", Font.ITALIC, 12));
		panel.add(lblAd);
		
		JLabel lblTelefonNumarasi = new JLabel();
		lblTelefonNumarasi.setBounds(10, 74, 106, 13);
		panel.add(lblTelefonNumarasi);
		lblTelefonNumarasi.setText("Telefon Numarasi");
		lblTelefonNumarasi.setFont(new Font("Verdana", Font.ITALIC, 12));
		
		JLabel lblSoyad = new JLabel();
		lblSoyad.setBounds(10, 51, 48, 13);
		panel.add(lblSoyad);
		lblSoyad.setText("Soyad");
		lblSoyad.setFont(new Font("Verdana", Font.ITALIC, 12));
		
		JLabel lblNewLabel = new JLabel("Koltuk");
		lblNewLabel.setBounds(10, 99, 106, 13);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 12));
		
		textField_3 = new JTextField();
		textField_3.setBounds(126, 49, 87, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 22, 87, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(126, 74, 87, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setColumns(10);
		textField.setBounds(126, 97, 87, 19);
		panel.add(textField);
		textField.setEditable(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tarih Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(728, 214, 235, 137);
		contentPane_1.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("Gün");
		lblNewLabel_1.setBounds(10, 23, 45, 13);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 11));
	
		JLabel lblNewLabel_2 = new JLabel("Ay");
		lblNewLabel_2.setBounds(65, 23, 45, 13);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 11));
		
		JLabel lblNewLabel_3 = new JLabel("Yil");
		lblNewLabel_3.setBounds(120, 23, 45, 13);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Verdana", Font.ITALIC, 11));
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(10, 80, 215, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox<String> comboDept_2_2 = new JComboBox<String>();
		comboDept_2_2.setBounds(10, 40, 39, 19);
		panel_1.add(comboDept_2_2);
		comboDept_2_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboDept_2_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		
		JComboBox<String> comboDept_2_2_1 = new JComboBox<String>();
		comboDept_2_2_1.setBounds(55, 40, 62, 19);
		panel_1.add(comboDept_2_2_1);
		comboDept_2_2_1.setModel(new DefaultComboBoxModel(new String[] {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz ", "Agustos ", "Eylul", "Ekim ", "Kasim", "Aralik"}));
		comboDept_2_2_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		
		JComboBox<String> comboDept_2_2_2 = new JComboBox<String>();
		comboDept_2_2_2.setBounds(120, 40, 55, 19);
		panel_1.add(comboDept_2_2_2);
		comboDept_2_2_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031"}));
		comboDept_2_2_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		
		JButton btnNewButton_3 = new JButton("Ok");
		btnNewButton_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String Gun= comboDept_2_2.getSelectedItem().toString();
				String Ay= comboDept_2_2_1.getSelectedItem().toString();
				String Yil= comboDept_2_2_2.getSelectedItem().toString();
				
				textField_5.setText("\t"+Gun+"/"+Ay+"/"+Yil);

			}
		});
		
		btnNewButton_3.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3.setBounds(10, 109, 85, 21);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.WHITE);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(null, "Adres Bilgilerini Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(21, 214, 390, 137);
		contentPane_1.add(panel_1_1);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Verdana", Font.ITALIC, 10));
		textField_6.setColumns(10);
		textField_6.setBounds(10, 80, 355, 19);
		panel_1_1.add(textField_6);
		
		JComboBox<String> comboDept = new JComboBox<String>();
		comboDept.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept.setBounds(10, 47, 170, 19);
		panel_1_1.add(comboDept);
		comboDept.setModel(new DefaultComboBoxModel(new String[] {"Sabiha Gökçen Havalimanı", "İstanbul Havalimanı", "Konya Havalimanı", "Trabzon Havalimanı", "Zonguldak Havalimanı", "Ordu-Giresun Havalimanı", "Rize-Artvin Havalimanı", "Samsun Çarşamba Havalimanı", "Sinop Havalimanı", "Çanakkale Havalimanı", "Antalya Havalimanı", "Ankara Esenboğa Havalimanı", "Gazipaşa Havalimanı", "Balıkesir Koca Seyit Havalimanı", "Bursa Yenişehir Havalimanı", "Denizli Çardak Havalimanı", "Erzurum Havalimanı", "Gaziantep Havalimanı", "Isparta Süleyman Demirel Havalimanı", "Adnan Menderes Havalimanı", "Kars Harakani Havalimanı", "Malatya Havalimanı", "Düzce Havalimanı"}));
		
		JLabel lblNewLabel_4 = new JLabel("Gidilecek Havalimani");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_4.setBounds(10, 24, 130, 13);
		panel_1_1.add(lblNewLabel_4);
		
		JComboBox<String> comboDept_1 = new JComboBox<String>();
		comboDept_1.setModel(new DefaultComboBoxModel(new String[] {"Sabiha Gökçen Havalimanı", "İstanbul Havalimanı", "Konya Havalimanı", "Trabzon Havalimanı", "Zonguldak Havalimanı", "Ordu-Giresun Havalimanı", "Rize-Artvin Havalimanı", "Samsun Çarşamba Havalimanı", "Sinop Havalimanı", "Çanakkale Havalimanı", "Antalya Havalimanı", "Ankara Esenboğa Havalimanı", "Gazipaşa Havalimanı", "Balıkesir Koca Seyit Havalimanı", "Bursa Yenişehir Havalimanı", "Denizli Çardak Havalimanı", "Erzurum Havalimanı", "Gaziantep Havalimanı", "Isparta Süleyman Demirel Havalimanı", "Adnan Menderes Havalimanı", "Kars Harakani Havalimanı", "Malatya Havalimanı", "Düzce Havalimanı"}));
		comboDept_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_1.setBounds(195, 47, 170, 19);
		panel_1_1.add(comboDept_1);
		
		JButton btnNewButton_3_1 = new JButton("Ok");
		btnNewButton_3_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ilk= comboDept.getSelectedItem().toString();
				String ikinci= comboDept_1.getSelectedItem().toString();
				textField_6.setText(ilk + " ---> " + ikinci);
			}
		});
		btnNewButton_3_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_1.setBounds(10, 109, 85, 21);
		panel_1_1.add(btnNewButton_3_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(101, 41, 87, 19);
		contentPane_1.add(textField_7);
		textField_7.setText(randomsayi);
		textField_7.setEditable(false);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Saati Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(446, 10, 248, 137);
		contentPane_1.add(panel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Saat");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_1.setBounds(10, 21, 45, 13);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dakika");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_2.setBounds(65, 22, 45, 13);
		panel_2.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 68, 228, 20);
		panel_2.add(textField_1);
		
		JComboBox<String> comboDept_2 = new JComboBox<String>();
		comboDept_2.setBounds(10, 38, 39, 19);
		panel_2.add(comboDept_2);
		comboDept_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboDept_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		
		JComboBox<String> comboDept_2_1 = new JComboBox<String>();
		comboDept_2_1.setBounds(65, 38, 39, 19);
		panel_2.add(comboDept_2_1);
		comboDept_2_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboDept_2_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		
		JButton btnNewButton_3_2 = new JButton("Ok");
		btnNewButton_3_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String saat= comboDept_2.getSelectedItem().toString();
				String dakika= comboDept_2_1.getSelectedItem().toString();
				textField_1.setText("\t"+saat + " : " + dakika);
			}
		});
		btnNewButton_3_2.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_2.setBounds(10, 106, 85, 21);
		panel_2.add(btnNewButton_3_2);		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(Color.WHITE);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Kabin Sinifi", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBounds(446, 214, 248, 137);
		contentPane_1.add(panel_2_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(10, 76, 228, 20);
		panel_2_1.add(textField_8);
		
		JComboBox<String> comboDept_2_3 = new JComboBox<String>();
		comboDept_2_3.setModel(new DefaultComboBoxModel(new String[] {"Yetiskin", "Cocuk"}));
		comboDept_2_3.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_3.setBounds(10, 47, 85, 19);
		panel_2_1.add(comboDept_2_3);
		
		JSpinner jSpinDay = new JSpinner();
		jSpinDay.setModel(new SpinnerListModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		jSpinDay.setBounds(129, 47, 39, 20);
		panel_2_1.add(jSpinDay);
		
		JButton btnNewButton_3_2_1 = new JButton("Ok");
		btnNewButton_3_2_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ilk= comboDept_2_3.getSelectedItem().toString();
				String value = (String) jSpinDay.getValue();
				textField_8.setText(value+" "+ilk);
			}
		});
		btnNewButton_3_2_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_2_1.setBounds(10, 106, 85, 21);
		panel_2_1.add(btnNewButton_3_2_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Verdana", Font.ITALIC, 10));
		lblNewLabel_5.setBounds(210, 44, 70, 13);
		contentPane_1.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Ileri");
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ilk= comboDept_2_3.getSelectedItem().toString();
				String value =  (String) jSpinDay.getValue();
				String Sinif = "First Class";
				String Koltuk = textField.getText();
				String Ad =  textField_2.getText();
				String Soyad = textField_3.getText();
				String TelefonNumarasi = textField_4.getText();
				String UcusID = textField_7.getText();
				String Tarih = textField_5.getText();
				String Kalkis_Gidis = textField_6.getText();
				String Saat = textField_1.getText(); 
				String Kabin_Sinifi = ilk;
				String Adet = value;
				try 
				{
					Kayit k = new Kayit();
					k.KayitEkleme(Sinif, Koltuk, Ad, Soyad, TelefonNumarasi, UcusID, Tarih, Kalkis_Gidis, Saat,Kabin_Sinifi,Adet);
				} catch (SQLException e1) 
				{
					e1.printStackTrace();
				}				
				JOptionPane jf=new JOptionPane();
				jf.showMessageDialog(frame, "Bilgileriniz basari ile kayit edildi.");
				try 
				{
					Ara_gecis ab = new Ara_gecis();
					ab.setVisible(true);
					setVisible(false);
				} catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.ITALIC, 12));
		btnNewButton_2.setBounds(870, 398, 85, 21);
		contentPane_1.add(btnNewButton_2);
		
		
	}
	void ayniKoltuk(String a )
	{
		koltukk = a;
		String b = "First Class";
		Kayit k = new Kayit();
		try 
		{
			rs = k.YolcuBilgileri();
		} catch (SQLException e2) 
		{
			e2.printStackTrace();
		}
		try 
		{
			while(rs.next())
			{
			
				if(koltukk.equals(rs.getString("Koltuk")) && b.equals(rs.getString("Sinif")))
				{
					JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Koltuğa daha önceden rezervasyon yapildi.");
					textField.setText("");
					break;
				}
			}
			
			
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
	}
}
