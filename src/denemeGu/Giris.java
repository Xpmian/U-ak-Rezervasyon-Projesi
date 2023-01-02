package denemeGu;

import java.awt.Container;
import java.awt.EventQueue;
import dene.Kayit;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Giris extends JFrame 
{
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTextField textField;
	private JPasswordField textField_1;
	static Giris frame;
	static ResultSet rs;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame = new Giris();
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
	public Giris() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 313);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(709, 313); 
        this.setLocation((EkranX - 709) / 2, (EkranY - 313) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		final BufferedImage image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\aaa.jpg"));
		contentPane_1 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(image, 0, -150, null);
            }
        };

		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kullanici Adi");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblNewLabel.setBounds(241, 150, 76, 13);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sifre");
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(241, 173, 45, 13);
		contentPane_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(327, 148, 83, 19);
		contentPane_1.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e) 
			{
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) 
			        {
			        	if(textField.getText().length()== 0 || textField_1.getPassword().length==0) 
				        {
							JOptionPane message =new JOptionPane();
							message.showMessageDialog(frame, "Kullanıcı adı veya şifre alanı boş olamaz");
				        }
			        	else
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
					   
					}
			        
			}
		});
		
		textField_1 = new JPasswordField();
		textField_1.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e) 
			{
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) 
			        {
			        	if(textField.getText().length()== 0 || textField_1.getPassword().length==0) 
				        {
							JOptionPane message =new JOptionPane();
							message.showMessageDialog(frame, "Kullanıcı adı veya şifre alanı boş olamaz");
				        }
			        	else
			        	{
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
					   
					}
			        
			}
		});
		textField_1.setBounds(327, 171, 83, 19);
		contentPane_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Giris");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane jf=new JOptionPane();
				String sifre = new String(textField_1.getPassword());
				String kullaniciadi = textField.getText();
				String sql="SELECT * FROM new_table"+" WHERE KullaniciAdi='"+kullaniciadi+"'";
				String sql1 ="SELECT * FROM new_table"+" WHERE Sifre='"+sifre+"'";
				
				if(textField_1.getPassword().length==0||textField.getText().length()==0) 
				{
					jf.showMessageDialog(frame, "Giris başarısız.Kullanıcı adı veya şifre boş olamaz.");
				}
				else 
				{
				try 
				{
					rs=Kayit.bul(sql);
					rs=Kayit.bul(sql1);
				}
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				try 
				{
					while(rs.next()) 
					   {												
						if(kullaniciadi.equals(rs.getString("KullaniciAdi")) && sifre.equals(rs.getString("Sifre")))
						{	
							jf.showMessageDialog(frame, "Giris Basarili");
							
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
				}
					catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			}
			}
		});
		btnNewButton.setBounds(327, 197, 76, 13);
		contentPane_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cikis");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(327, 243, 76, 13);
		contentPane_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Kayit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(textField_1.getText().length()==0||textField.getText().length()==0) 
				{
					JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Kullanici adi ve sifre bos olamaz");
				}
				else
				{	
				String a = textField.getText();
				String b = textField_1.getText();				
				Kayit k = new Kayit();
				try 
				{
					k.KayitOl(a, b);
				} catch (SQLException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane jf=new JOptionPane();
				jf.showMessageDialog(frame, "Başarıyla kayıt oldunuz.");
				
				textField.setText("");
				textField_1.setText("");
				}
			}
		});
		btnNewButton_1_1.setBounds(327, 220, 76, 13);
		contentPane_1.add(btnNewButton_1_1);
	}

}
