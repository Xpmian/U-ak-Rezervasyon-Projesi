package denemeGu;

import java.awt.Container;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dene.Kayit;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class Main extends JFrame 
{
	private JPanel contentPane;
	static Main frame ;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
    public static ResultSet rs;
    public static String ad ;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame = new Main();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	public Main() throws IOException 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 564);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(564, 564); 
        this.setLocation((EkranX - 564) / 2, (EkranY - 564) / 2);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Dosya");
		mnNewMenu.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		JMenuItem mnıtmNewMenuItem = new JMenuItem("Kart Kayıt ");
		mnıtmNewMenuItem.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mnıtmNewMenuItem.addActionListener(new java.awt.event.ActionListener() 
		{
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
               try 
               {
				KartBilgileri b = new KartBilgileri();
				b.setVisible(true);
				setVisible(false);
				
			}  
               catch (IOException e) 
               {
				
				e.printStackTrace();
			} 	
            }
        });
		mnNewMenu.add(mnıtmNewMenuItem);
		
		JMenuItem mnıtmNewMenuItem_1 = new JMenuItem("Geri");
		mnıtmNewMenuItem_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Giris g;
				try 
				{
					g = new Giris();
					g.setVisible(true);
					setVisible(false);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}				
			}
		});
		mnıtmNewMenuItem_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mnNewMenu.add(mnıtmNewMenuItem_1);
		
		JMenuItem mnıtmNewMenuItem_2 = new JMenuItem("Ödeme");
		mnıtmNewMenuItem_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
					try 
					{
						Odeme1 o = new Odeme1();
						o.setVisible(true);
						setVisible(false);
					} 
					catch (IOException e1) 
					{
						e1.printStackTrace();
					}
			}
		});
		mnıtmNewMenuItem_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mnNewMenu.add(mnıtmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Araçlar");
		mnNewMenu_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mnıtmNewMenuItem_3 = new JMenuItem("Rezervevasyon Yap");
		mnıtmNewMenuItem_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RezerveKoltuk r = new RezerveKoltuk();
				r.setVisible(true);
				setVisible(false);
			}
		});
		mnıtmNewMenuItem_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mnNewMenu_1.add(mnıtmNewMenuItem_3);
		
		JMenuItem mnıtmNewMenuItem_4 = new JMenuItem("Rezervasyon İptal Et");
		mnıtmNewMenuItem_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RezervasyonIptal rv = new RezervasyonIptal();
				rv.setVisible(true);
				setVisible(false);
			}
		});
		mnıtmNewMenuItem_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mnNewMenu_1.add(mnıtmNewMenuItem_4);
		
		JMenuItem mnıtmNewMenuItem_5 = new JMenuItem("Rezervasyon Ara");
		mnıtmNewMenuItem_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RezervasyonArama r = new RezervasyonArama();
				r.setVisible(true);
				setVisible(false);
			}
		});
		mnıtmNewMenuItem_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mnNewMenu_1.add(mnıtmNewMenuItem_5);
		
		JMenuItem mnıtmNewMenuItem_6 = new JMenuItem("Yolcu Rezervasyonlari");
		mnıtmNewMenuItem_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Kayit k = new Kayit();	
				try 
				{
					rs=k.YolcuBilgileri();
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				try 
				{
					while(rs.next())
					{
							 ad = rs.getString("Ad");
					}
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				
				try 
				{
					try 
					{
						YolcuRezervasyonlari r = new YolcuRezervasyonlari();
						r.setVisible(true);
						setVisible(false);
					} catch (SQLException e1) 
					{
						e1.printStackTrace();
					}	
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		});
		mnıtmNewMenuItem_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mnNewMenu_1.add(mnıtmNewMenuItem_6);
		
		JMenu mnNewMenu_2 = new JMenu("Sistem");
		mnNewMenu_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mnıtmNewMenuItem_7 = new JMenuItem("Kapat");
		mnıtmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
			
		});
		mnıtmNewMenuItem_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mnNewMenu_2.add(mnıtmNewMenuItem_7);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		final BufferedImage image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\a2.jpg"));
			contentPane = new JPanel(){
	            @Override
	            protected void paintComponent(Graphics g) 
	            {
	                super.paintComponent(g);
	                g.drawImage(image, 0, 0, null);
	            }
	        };

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
