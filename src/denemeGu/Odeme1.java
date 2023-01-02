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

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;

public class Odeme1 extends JFrame 
{
	private JPanel contentPane;
	private JTextField textField;
	public static ResultSet rs;;
	public static String kabin_sinifi;
	public static String adet;
	public static String sinif;
	public static String a ="Yetiskin";
	public static String b ="Cocuk";
	public static int tutar;
	static int firstc = 10300;
	static int firsty = 11300;
	static int busic = 5800;
	static int busiy = 6800;
	static int ekoc = 1100;
	static int ekoy = 2100;
	static Odeme1 frame;
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
				try 
				{
					frame = new Odeme1();
					frame.setVisible(true);
				} 
				catch (Exception e) 
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
	public Odeme1() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 200);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(335, 200); 
        this.setLocation((EkranX - 335) / 2, (EkranY - 200) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		final BufferedImage image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\f4.jpg"));
		contentPane = new JPanel()
		{
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UcusID");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(49, 61, 42, 15);
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 11));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textField.setColumns(10);
		textField.setBounds(101, 63, 87, 13);
		contentPane.add(textField);
		
		JButton btnde = new JButton("Öde\r\n");
		btnde.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String UcusId = textField.getText();
				Kayit k = new Kayit();
				try 
				{
					rs=k.OdemeBilgileriGetir(UcusId);
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				try 
				{
					while(rs.next())
					{
						kabin_sinifi = rs.getString("Kabin_Sinifi");
						adet = rs.getString("Adet");
						sinif = rs.getString("Sinif");
					}
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				int sonuc = Integer.parseInt(adet);
				if(sinif.equals("First Class"))
				{
					if(kabin_sinifi.equals("Yetiskin"))
				    {
						tutar = firsty*sonuc;
				    }
					else 
					{
						tutar = firstc*sonuc;
					}
					try 
					{
						Odeme o = new Odeme();
						o.setVisible(true);
						setVisible(false);
					} 
					catch (IOException e1) 
					{
					e1.printStackTrace();
					}
				}
				else if(sinif.equals("Business Class"))
				{
					if(kabin_sinifi.equals("Yetiskin"))
				    {
						tutar = busiy*sonuc;
				    }
					else 
					{
						tutar = busic*sonuc;
					}
					try 
					{
						Odeme o = new Odeme();
						o.setVisible(true);
						setVisible(false);
					} 
					catch (IOException e1) 
					{
					e1.printStackTrace();
					}
				}
				else if(sinif.equals("Ekonomi Class"))
				{
					if(kabin_sinifi.equals("Yetiskin"))
				    {
						tutar = ekoy*sonuc;
				    }
					else 
					{
						tutar = ekoc*sonuc;
					}
					try 
					{
						Odeme o = new Odeme();
						o.setVisible(true);
						setVisible(false);
					} 
					catch (IOException e1) 
					{
					e1.printStackTrace();
					}
				}
			}
		});
		btnde.setFont(new Font("Verdana", Font.ITALIC, 10));
		btnde.setBounds(101, 86, 87, 13);
		contentPane.add(btnde);
	}

}
