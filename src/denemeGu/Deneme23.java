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
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;

public class Deneme23 extends JFrame 
{
	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTextField textField;
	static Deneme23 frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_7;
	public static String koltukk;
	static ResultSet rs;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
    private JTextField textField_8;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Deneme23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Deneme23() throws IOException 
	{
		Random random = new Random();
		long randomSayi = random.nextInt(214748664) + 214748664;
		String randomsayi = Long.toString(randomSayi);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 580);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(1000, 580); 
        this.setLocation((EkranX - 1000) / 2, (EkranY - 580) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		final BufferedImage image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\a11.jpg"));
		contentPane_1 = new JPanel()
		{
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };
        JOptionPane jf=new JOptionPane();
        jf.showMessageDialog(frame, "UcusId'nizi kayit etmeyi unutmayiniz!!!!!");
        
		setTitle("Business Class");

		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UcusID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblNewLabel.setBounds(32, 41, 55, 16);
		contentPane_1.add(lblNewLabel);
		
	
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(92, 40, 84, 18);
		contentPane_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("A1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A1");
				ayniKoltuk(textField_4.getText());
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton.setBounds(32, 78, 48, 16);
		contentPane_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("A2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				textField_4.setText("A2");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_1.setBounds(32, 106, 48, 16);
		contentPane_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("A3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A3");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_2.setBounds(32, 134, 48, 16);
		contentPane_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("A4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A4");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_3.setBounds(32, 162, 48, 16);
		contentPane_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("A5");
		btnNewButton_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A5");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_4.setBounds(32, 190, 48, 16);
		contentPane_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("A6");
		btnNewButton_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A6");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_5.setBounds(32, 218, 48, 16);
		contentPane_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("A7");
		btnNewButton_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A7");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_6.setBounds(32, 246, 48, 16);
		contentPane_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("A8");
		btnNewButton_7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A8");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_7.setBounds(32, 274, 48, 16);
		contentPane_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("B1");
		btnNewButton_8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B1");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_8.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_8.setBounds(92, 78, 48, 16);
		contentPane_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("B2");
		btnNewButton_9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B3");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_9.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_9.setBounds(92, 106, 48, 16);
		contentPane_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("B3");
		btnNewButton_10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B3");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_10.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_10.setBounds(92, 134, 48, 16);
		contentPane_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("B4");
		btnNewButton_11.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B4");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_11.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_11.setBounds(92, 162, 48, 16);
		contentPane_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("B5");
		btnNewButton_12.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B5");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_12.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_12.setBounds(92, 190, 48, 16);
		contentPane_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("B6");
		btnNewButton_13.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B6");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_13.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_13.setBounds(92, 218, 48, 16);
		contentPane_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("B7");
		btnNewButton_14.addActionListener(new ActionListener()
{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B7");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_14.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_14.setBounds(92, 246, 48, 16);
		contentPane_1.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("B8");
		btnNewButton_15.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B8");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_15.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_15.setBounds(92, 274, 48, 16);
		contentPane_1.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("C1");
		btnNewButton_16.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C1");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_16.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_16.setBounds(152, 78, 48, 16);
		contentPane_1.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("C2");
		btnNewButton_17.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C2");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_17.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_17.setBounds(152, 106, 48, 16);
		contentPane_1.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("C3");
		btnNewButton_18.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C3");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_18.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_18.setBounds(152, 134, 48, 16);
		contentPane_1.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("C4");
		btnNewButton_19.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C4");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_19.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_19.setBounds(152, 162, 48, 16);
		contentPane_1.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("C5");
		btnNewButton_20.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C5");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_20.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_20.setBounds(152, 190, 48, 16);
		contentPane_1.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("C6");
		btnNewButton_21.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C6");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_21.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_21.setBounds(152, 218, 48, 16);
		contentPane_1.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("C7");
		btnNewButton_22.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C7");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_22.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_22.setBounds(152, 246, 48, 16);
		contentPane_1.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("C8");
		btnNewButton_23.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C8");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnNewButton_23.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_23.setBounds(152, 274, 48, 16);
		contentPane_1.add(btnNewButton_23);
		
		JButton btnD = new JButton("D1");
		btnD.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D1");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnD.setFont(new Font("Dialog", Font.BOLD, 11));
		btnD.setBounds(420, 78, 48, 16);
		contentPane_1.add(btnD);
		
		JButton btnG = new JButton("H1");
		btnG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H1");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnG.setFont(new Font("Dialog", Font.BOLD, 11));
		btnG.setBounds(360, 78, 48, 16);
		contentPane_1.add(btnG);
		
		JButton btnF = new JButton("F1");
		btnF.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F1");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnF.setFont(new Font("Dialog", Font.BOLD, 11));
		btnF.setBounds(300, 78, 48, 16);
		contentPane_1.add(btnF);
		
		JButton btnF_1 = new JButton("F2");
		btnF_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnF_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F2");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnF_1.setBounds(300, 106, 48, 16);
		contentPane_1.add(btnF_1);
		
		JButton btnH = new JButton("H2");
		btnH.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H2");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnH.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH.setBounds(360, 106, 48, 16);
		contentPane_1.add(btnH);
		
		JButton btnD_1 = new JButton("D2");
		btnD_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D2");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnD_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnD_1.setBounds(420, 106, 48, 16);
		contentPane_1.add(btnD_1);
		
		JButton btnF_2 = new JButton("F3");
		btnF_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F3");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnF_2.setFont(new Font("Dialog", Font.BOLD, 11));
		btnF_2.setBounds(300, 134, 48, 16);
		contentPane_1.add(btnF_2);
		
		JButton btnH_1 = new JButton("H3");
		btnH_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H3");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnH_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_1.setBounds(360, 134, 48, 16);
		contentPane_1.add(btnH_1);
		
		JButton btnD_2 = new JButton("D3");
		btnD_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D3");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnD_2.setFont(new Font("Dialog", Font.BOLD, 11));
		btnD_2.setBounds(420, 134, 48, 16);
		contentPane_1.add(btnD_2);
		
		JButton btnF_3 = new JButton("F4");
		btnF_3.setFont(new Font("Dialog", Font.BOLD, 11));
		btnF_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F4");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnF_3.setBounds(300, 162, 48, 16);
		contentPane_1.add(btnF_3);
		
		JButton btnH_2 = new JButton("H4");
		btnH_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H4");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnH_2.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_2.setBounds(360, 162, 48, 16);
		contentPane_1.add(btnH_2);
		
		JButton btnD_3 = new JButton("D4");
		btnD_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D4");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnD_3.setFont(new Font("Dialog", Font.BOLD, 11));
		btnD_3.setBounds(420, 162, 48, 16);
		contentPane_1.add(btnD_3);
		
		JButton btnF_4 = new JButton("F5");
		btnF_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F5");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnF_4.setFont(new Font("Dialog", Font.BOLD, 11));
		btnF_4.setBounds(300, 190, 48, 16);
		contentPane_1.add(btnF_4);
		
		JButton btnH_3 = new JButton("H5");
		btnH_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{			
				textField_4.setText("H5");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnH_3.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_3.setBounds(360, 190, 48, 16);
		contentPane_1.add(btnH_3);
		
		JButton btnD_4 = new JButton("D5");
		btnD_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D5");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnD_4.setFont(new Font("Dialog", Font.BOLD, 11));
		btnD_4.setBounds(420, 190, 48, 16);
		contentPane_1.add(btnD_4);
		
		JButton btnF_5 = new JButton("F6");
		btnF_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F6");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnF_5.setFont(new Font("Dialog", Font.BOLD, 11));
		btnF_5.setBounds(300, 218, 48, 16);
		contentPane_1.add(btnF_5);
		
		JButton btnH_4 = new JButton("H6");
		btnH_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H6");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnH_4.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_4.setBounds(360, 218, 48, 16);
		contentPane_1.add(btnH_4);
		
		JButton btnD_5 = new JButton("D6");
		btnD_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D6");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnD_5.setFont(new Font("Dialog", Font.BOLD, 11));
		btnD_5.setBounds(420, 218, 48, 16);
		contentPane_1.add(btnD_5);
		
		JButton btnF_6 = new JButton("F7");
		btnF_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F7");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnF_6.setFont(new Font("Dialog", Font.BOLD, 11));
		btnF_6.setBounds(300, 246, 48, 16);
		contentPane_1.add(btnF_6);
		
		JButton btnH_5 = new JButton("H7");
		btnH_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H7");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnH_5.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_5.setBounds(360, 246, 48, 16);
		contentPane_1.add(btnH_5);
		
		JButton btnD_6 = new JButton("D7");
		btnD_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D7");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnD_6.setFont(new Font("Dialog", Font.BOLD, 11));
		btnD_6.setBounds(420, 246, 48, 16);
		contentPane_1.add(btnD_6);
		
		JButton btnF_7 = new JButton("F8");
		btnF_7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F8");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnF_7.setFont(new Font("Dialog", Font.BOLD, 11));
		btnF_7.setBounds(300, 274, 48, 16);
		contentPane_1.add(btnF_7);
		
		JButton btnH_6 = new JButton("H8");
		btnH_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H8");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnH_6.setFont(new Font("Dialog", Font.BOLD, 11));
		btnH_6.setBounds(360, 274, 48, 16);
		contentPane_1.add(btnH_6);
		
		JButton btnD_7 = new JButton("D8");
		btnD_7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D8");
				ayniKoltuk(textField_4.getText());
			}
		});
		btnD_7.setFont(new Font("Dialog", Font.BOLD, 11));
		btnD_7.setBounds(420, 274, 48, 16);
		contentPane_1.add(btnD_7);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Yolcu Bilgilerini Giriniz", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(726, 22, 248, 137);
		contentPane_1.add(panel);
		
		JLabel lblAd = new JLabel();
		lblAd.setText("Ad");
		lblAd.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblAd.setBounds(10, 24, 15, 19);
		panel.add(lblAd);
		
		JLabel lblTelefonNumarasi = new JLabel();
		lblTelefonNumarasi.setText("Telefon Numarasi");
		lblTelefonNumarasi.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblTelefonNumarasi.setBounds(10, 74, 106, 13);
		panel.add(lblTelefonNumarasi);
		
		JLabel lblSoyad = new JLabel();
		lblSoyad.setText("Soyad");
		lblSoyad.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblSoyad.setBounds(10, 51, 48, 13);
		panel.add(lblSoyad);
		
		JLabel lblNewLabel_1 = new JLabel("Koltuk");
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(10, 99, 106, 13);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 49, 87, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 22, 87, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(126, 74, 87, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.BLACK);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(126, 97, 87, 19);
		panel.add(textField_4);
		textField.setText(randomsayi);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(null, "Adres Bilgilerini Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(18, 323, 389, 137);
		contentPane_1.add(panel_1_1);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Verdana", Font.ITALIC, 10));
		textField_6.setColumns(10);
		textField_6.setBounds(10, 78, 355, 21);
		panel_1_1.add(textField_6);
		
		JComboBox<String> comboDept = new JComboBox<String>();
		comboDept.setModel(new DefaultComboBoxModel(new String[] {"Sabiha Gökçen Havalimanı", "İstanbul Havalimanı", "Konya Havalimanı", "Trabzon Havalimanı", "Zonguldak Havalimanı", "Ordu-Giresun Havalimanı", "Rize-Artvin Havalimanı", "Samsun Çarşamba Havalimanı", "Sinop Havalimanı", "Çanakkale Havalimanı", "Antalya Havalimanı", "Ankara Esenboğa Havalimanı", "Gazipaşa Havalimanı", "Balıkesir Koca Seyit Havalimanı", "Bursa Yenişehir Havalimanı", "Denizli Çardak Havalimanı", "Erzurum Havalimanı", "Gaziantep Havalimanı", "Isparta Süleyman Demirel Havalimanı", "Adnan Menderes Havalimanı", "Kars Harakani Havalimanı", "Malatya Havalimanı", "Düzce Havalimanı"}));
		comboDept.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept.setBounds(10, 47, 170, 19);
		panel_1_1.add(comboDept);
		
		JLabel lblNewLabel_4 = new JLabel("Gidilecek Havalimani");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_4.setBounds(10, 24, 130, 13);
		panel_1_1.add(lblNewLabel_4);
		
		JComboBox<String> comboDept_1 = new JComboBox<String>();
		comboDept_1.setModel(new DefaultComboBoxModel(new String[] {"Sabiha Gökçen Havalimanı", "İstanbul Havalimanı", "Konya Havalimanı", "Trabzon Havalimanı", "Zonguldak Havalimanı", "Ordu-Giresun Havalimanı", "Rize-Artvin Havalimanı", "Samsun Çarşamba Havalimanı", "Sinop Havalimanı", "Çanakkale Havalimanı", "Antalya Havalimanı", "Ankara Esenboğa Havalimanı", "Gazipaşa Havalimanı", "Balıkesir Koca Seyit Havalimanı", "Bursa Yenişehir Havalimanı", "Denizli Çardak Havalimanı", "Erzurum Havalimanı", "Gaziantep Havalimanı", "Isparta Süleyman Demirel Havalimanı", "Adnan Menderes Havalimanı", "Kars Harakani Havalimanı", "Malatya Havalimanı", "Düzce Havalimanı"}));
		comboDept_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_1.setBounds(195, 47, 170, 19);
		panel_1_1.add(comboDept_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Ok");
		btnNewButton_3_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ilk= comboDept.getSelectedItem().toString();
				String ikinci= comboDept_1.getSelectedItem().toString();
				textField_6.setText(ilk + " ----> " + ikinci);
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_1_1.setBounds(10, 111, 85, 21);
		panel_1_1.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Geri");
		btnNewButton_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RezerveKoltuk k = new RezerveKoltuk();
				k.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1_1.setFont(new Font("Verdana", Font.ITALIC, 12));
		btnNewButton_1_1.setBounds(18, 512, 85, 21);
		contentPane_1.add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tarih Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(726, 162, 248, 153);
		contentPane_1.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gün");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_1.setBounds(10, 23, 45, 13);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ay");
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_2.setBounds(65, 23, 45, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Yil");
		lblNewLabel_3.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_3.setBounds(136, 23, 45, 13);
		panel_1.add(lblNewLabel_3);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(10, 80, 228, 33);
		panel_1.add(textField_5);
		
		JComboBox<String> comboDept_2_2 = new JComboBox<String>();
		comboDept_2_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboDept_2_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_2.setBounds(10, 40, 39, 19);
		panel_1.add(comboDept_2_2);
		
		JComboBox<String> comboDept_2_2_2 = new JComboBox<String>();
		comboDept_2_2_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031"}));
		comboDept_2_2_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_2_2.setBounds(139, 40, 55, 19);
		panel_1.add(comboDept_2_2_2);
		
		JComboBox<String> comboDept_2_2_1_1 = new JComboBox<String>();
		comboDept_2_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz ", "Agustos ", "Eylul", "Ekim ", "Kasim", "Aralik"}));
		comboDept_2_2_1_1.setBounds(60, 40, 68, 19);
		panel_1.add(comboDept_2_2_1_1);
		comboDept_2_2_1_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		
		JButton btnNewButton_3_1 = new JButton("Ok");
		btnNewButton_3_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String Gun= comboDept_2_2.getSelectedItem().toString();
				String Ay= comboDept_2_2_1_1.getSelectedItem().toString();
				String Yil= comboDept_2_2_2.getSelectedItem().toString();	
				textField_5.setText("\t"+Gun+"/"+Ay+"/"+Yil);
			}
		});
		btnNewButton_3_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_1.setBounds(10, 125, 85, 21);
		panel_1.add(btnNewButton_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Saati Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(726, 323, 248, 137);
		contentPane_1.add(panel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Saat");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_1_1.setBounds(10, 21, 45, 13);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dakika");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_2.setBounds(65, 22, 45, 13);
		panel_2.add(lblNewLabel_1_2);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(10, 68, 228, 20);
		panel_2.add(textField_7);
		
		JComboBox<String> comboDept_2 = new JComboBox<String>();
		comboDept_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboDept_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2.setBounds(10, 38, 39, 19);
		panel_2.add(comboDept_2);
		
		JComboBox<String> comboDept_2_1 = new JComboBox<String>();
		comboDept_2_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboDept_2_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_1.setBounds(65, 38, 39, 19);
		panel_2.add(comboDept_2_1);
		
		JButton btnNewButton_3_2 = new JButton("Ok");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String saat= comboDept_2.getSelectedItem().toString();
				String dakika= comboDept_2_1.getSelectedItem().toString();
				textField_7.setText("\t"+saat + " : " + dakika);
			}
		});
		btnNewButton_3_2.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_2.setBounds(10, 106, 85, 21);
		panel_2.add(btnNewButton_3_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(Color.WHITE);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Kabin Sinifi", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBounds(420, 323, 248, 137);
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
		
		JButton btnNewButton_2_1 = new JButton("Ileri");
		btnNewButton_2_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ilk= comboDept_2_3.getSelectedItem().toString();
				String value = (String) jSpinDay.getValue();
				String Sinif = "Business Class";
				String Koltuk = textField_4.getText();
				String Ad =  textField_2.getText();
				String Soyad = textField_1.getText();
				String TelefonNumarasi = textField_3.getText();
				String UcusID = textField.getText();
				String Tarih = textField_5.getText();
				String Kalkis_Gidis = textField_6.getText();
				String Saat =textField_7.getText();	
				String Kabin_Sinifi = ilk;
				String Adet = value;
				Kayit k = new Kayit();
				try 
				{
					k.KayitEkleme(Sinif,Koltuk,Ad,Soyad,TelefonNumarasi,UcusID,Tarih,Kalkis_Gidis,Saat,Kabin_Sinifi,Adet);
				} catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				JOptionPane jf=new JOptionPane();
				jf.showMessageDialog(frame, "Bilgileriniz basari ile kayit edildi.");
				try 
				{
					Ara_gecis a = new Ara_gecis();
					a.setVisible(true);
					setVisible(false);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2_1.setFont(new Font("Verdana", Font.ITALIC, 12));
		btnNewButton_2_1.setBounds(889, 506, 85, 21);
		contentPane_1.add(btnNewButton_2_1);
		
	}
	void ayniKoltuk(String a )
	{
		koltukk = a;
		String b = "Business Class";
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
					textField_4.setText("");
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
