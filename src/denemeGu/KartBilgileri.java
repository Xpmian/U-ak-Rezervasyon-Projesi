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
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KartBilgileri extends JFrame 
{

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JPanel contentPane_1_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static  BufferedImage image ;
	static  BufferedImage image1;
	static KartBilgileri frame;
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
					frame = new KartBilgileri();
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
	public KartBilgileri() throws IOException 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 298);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(535, 298); 
        this.setLocation((EkranX - 535) / 2, (EkranY - 298) / 2);
		contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\f1.png"));
		contentPane_1_1 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(image, 207, 42, null);
            }
        };
		setContentPane(contentPane_1_1);
		contentPane_1_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kart Sahibi");
		lblNewLabel.setBounds(20, 27, 62, 15);
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 11));
		contentPane_1_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(20, 52, 145, 19);
		contentPane_1_1.add(textField);
		
		JLabel lblKartNumarasi = new JLabel("Kart Numarasi");
		lblKartNumarasi.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblKartNumarasi.setBounds(20, 81, 82, 13);
		contentPane_1_1.add(lblKartNumarasi);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 104, 145, 19);
		contentPane_1_1.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ay");
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1.setBounds(20, 133, 45, 13);
		contentPane_1_1.add(lblNewLabel_1);
		
		JComboBox<String> comboDept_2 = new JComboBox<String>();
		comboDept_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboDept_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2.setBounds(20, 156, 39, 19);
		contentPane_1_1.add(comboDept_2);
		
		JComboBox<String> comboDept_2_1 = new JComboBox<String>();
		comboDept_2_1.setModel(new DefaultComboBoxModel(new String[] {"2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035"}));
		comboDept_2_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_1.setBounds(82, 156, 57, 19);
		contentPane_1_1.add(comboDept_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Yil");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_1.setBounds(82, 133, 45, 13);
		contentPane_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Güvenlik Kodu");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_2.setBounds(20, 185, 93, 13);
		contentPane_1_1.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(20, 208, 39, 19);
		contentPane_1_1.add(textField_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Kullanici Sozlesmesi");
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.ITALIC, 10));
		chckbxNewCheckBox.setBounds(210, 177, 134, 21);
		contentPane_1_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxGizlilikSozlemesi = new JCheckBox("Gizlilik Sozlemesi");
		chckbxGizlilikSozlemesi.setFont(new Font("Verdana", Font.ITALIC, 10));
		chckbxGizlilikSozlemesi.setBounds(210, 207, 134, 21);
		contentPane_1_1.add(chckbxGizlilikSozlemesi);
		
		JButton btnNewButton = new JButton("Kaydet");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(textField_2.getText().length()!= 3 || textField_1.getText().length()!= 16)
				{
					JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Cvc kodunuzu veya Kart numaranizi dogru giriniz.");
				}
			    else if(!chckbxNewCheckBox.isSelected() && chckbxGizlilikSozlemesi.isSelected())
			    {
			    	JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Kulllanici sozlemesini kabul etmelisiniz.");
			    }
			    else if(chckbxNewCheckBox.isSelected() && !chckbxGizlilikSozlemesi.isSelected())
			    {
			    	JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Gizlilik sozlemesini kabul etmelisiniz.");
			    }
			    else if(!chckbxNewCheckBox.isSelected() && !chckbxGizlilikSozlemesi.isSelected())
			    {
			    	JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Gizlilik sozlemesini ve Kullanici sozlemesini kabul etmelisiniz.");
			    }
				else if(chckbxNewCheckBox.isSelected() && chckbxGizlilikSozlemesi.isSelected())
			    {
			    	String kart_sahibi = textField.getText();
					String kartNumarasi = textField_1.getText();
					String cvc = textField_2.getText();
					String ay = comboDept_2.getSelectedItem().toString();
					String yil = comboDept_2_1.getSelectedItem().toString();				
					Kayit k = new Kayit();
					try 
					{
						k.KartBilgileriEkle(kart_sahibi, kartNumarasi, cvc, ay, yil);
					} catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
			    	JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Bilgileriniz basari ile kayit edildi.");
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
			
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 10));
		btnNewButton.setBounds(422, 235, 85, 21);
		contentPane_1_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Başlıca kredi ve banka kartlarının tümünü kabul edilir.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblNewLabel_2.setBounds(210, 23, 258, 24);
		contentPane_1_1.add(lblNewLabel_2);
    
	}
}
