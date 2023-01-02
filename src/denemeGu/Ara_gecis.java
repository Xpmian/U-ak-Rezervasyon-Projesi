package denemeGu;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ara_gecis extends JFrame {

	private JPanel contentPane;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
    static Ara_gecis frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try 
				{
					frame = new Ara_gecis();
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
	public Ara_gecis() throws IOException 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 200);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(430, 200); 
        this.setLocation((EkranX - 430) / 2, (EkranY - 200) / 2);
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
		
		
		
		JButton btnNewButton = new JButton("Ödeme");
		btnNewButton.addActionListener(new ActionListener() 
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
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 11));
		btnNewButton.setBounds(33, 53, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnKayit = new JButton("Kayit");
		btnKayit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					KartBilgileri k = new KartBilgileri();
					k.setVisible(true);
					setVisible(false);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnKayit.setFont(new Font("Verdana", Font.ITALIC, 11));
		btnKayit.setBounds(33, 115, 85, 21);
		contentPane.add(btnKayit);
		
		JLabel lblNewLabel = new JLabel("Kartinizi kayit ettiyseniz ödemeye gecebilirsiniz.");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 13));
		lblNewLabel.setBounds(33, 22, 393, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblKartinizKayitliDeilse = new JLabel("Kartiniz kayitli değilse kartiniz kayit ediniz.\r\n\r\n");
		lblKartinizKayitliDeilse.setForeground(new Color(255, 255, 255));
		lblKartinizKayitliDeilse.setFont(new Font("Verdana", Font.ITALIC, 13));
		lblKartinizKayitliDeilse.setBounds(33, 84, 393, 21);
		contentPane.add(lblKartinizKayitliDeilse);
	}
}
