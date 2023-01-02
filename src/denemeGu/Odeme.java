package denemeGu;

import java.awt.Container;
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

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Odeme extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static Odeme frame;
	static ResultSet rs;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
    private JTextField textField_3;
    static int a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					frame = new Odeme();
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
	public Odeme() throws IOException 
	{
		Odeme1 o = new Odeme1();
		a = o.tutar;
		String b = String.valueOf(a);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 266);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(450, 266); 
        this.setLocation((EkranX - 450) / 2, (EkranY - 266) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		final BufferedImage image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\f2.png"));
		contentPane_1 = new JPanel()
		{
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(image, 181, 25, null);
            }
        };
		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kart Sahibi");
		lblNewLabel.setBounds(10, 10, 62, 15);
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 11));
		contentPane_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 35, 145, 19);
		contentPane_1.add(textField);
		
		JLabel lblKartNumarasi = new JLabel("Kart Numarasi");
		lblKartNumarasi.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblKartNumarasi.setBounds(10, 64, 82, 13);
		contentPane_1.add(lblKartNumarasi);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 87, 145, 19);
		contentPane_1.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ay");
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1.setBounds(10, 116, 45, 13);
		contentPane_1.add(lblNewLabel_1);
		
		JComboBox<String> comboDept_2 = new JComboBox<String>();
		comboDept_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboDept_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2.setBounds(10, 139, 39, 19);
		contentPane_1.add(comboDept_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Yil");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_1.setBounds(72, 116, 45, 13);
		contentPane_1.add(lblNewLabel_1_1);
		
		JComboBox<String> comboDept_2_1 = new JComboBox<String>();
		comboDept_2_1.setModel(new DefaultComboBoxModel(new String[] {"2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035"}));
		comboDept_2_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_1.setBounds(72, 139, 57, 19);
		contentPane_1.add(comboDept_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Güvenlik Kodu");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_2.setBounds(10, 168, 107, 13);
		contentPane_1.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 191, 39, 19);
		contentPane_1.add(textField_2);
		
		JButton btnNewButton = new JButton("Öde\r\n");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(textField.getText().length() == 0 || textField_1.getText().length() == 0 || textField_2.getText().length() == 0  ) 
				{
					JOptionPane jf =new JOptionPane();
					jf.showMessageDialog(frame, "Bos birakilan alanlarini doldurunuz.");
				}
				String kartSahibi = textField.getText();
				String kartNumarasi = textField_1.getText();
				String cvc = textField_2.getText();
				String ay= comboDept_2.getSelectedItem().toString();
				String yil= comboDept_2_1.getSelectedItem().toString();
				
				String sql="SELECT * FROM kartbilgileri"+" WHERE KartSahibi='"+kartSahibi+"'";
				String sql1 ="SELECT * FROM kartbilgileri"+" WHERE KartNumarasi='"+kartNumarasi+"'";
				String sql2 ="SELECT * FROM kartbilgileri"+" WHERE Cvc='"+cvc+"'";
				String sql3 ="SELECT * FROM kartbilgileri"+" WHERE Ay='"+ay+"'";
				String sql4 ="SELECT * FROM kartbilgileri"+" WHERE Yil='"+yil+"'";
				
				try 
				{
					rs=Kayit.bul(sql);
					rs=Kayit.bul(sql1);
					rs=Kayit.bul(sql2);
					rs=Kayit.bul(sql3);
					rs=Kayit.bul(sql4);
				} 
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				try 
				{
					while(rs.next())
					{
						if(kartSahibi.equals(rs.getString("KartSahibi")) && kartNumarasi.equals(rs.getString("KartNumarasi")) && cvc.equals(rs.getString("Cvc")) && ay.equals(rs.getString("Ay")) && yil.equals(rs.getString("Yil")))
						{
							JOptionPane jf =new JOptionPane();
							jf.showMessageDialog(frame, "Odeme Basari ile gerçekleşti.");				
							try 
							{
								Main m = new Main();
								m.setVisible(true);
								setVisible(false);
							} catch (IOException e1) 
							{
								e1.printStackTrace();
							}							
						}
						else
						{
							JOptionPane jf =new JOptionPane();
							jf.showMessageDialog(frame, "Bilgilerinizi kontrol ediniz.");
						}
					}
				}
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}			
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 11));
		btnNewButton.setBounds(341, 199, 85, 21);
		contentPane_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Ödenecek Tutar");
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		lblNewLabel_2.setBounds(183, 151, 94, 13);
		contentPane_1.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(272, 150, 107, 15);
		contentPane_1.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(b);
		
		
		
	}
}
