package denemeGu;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dene.Kayit;

import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;

public class YolcuRezervasyonlari extends JFrame 
{
	private JPanel contentPane;
	private JPanel contentPane_1;
	static YolcuRezervasyonlari frame;
	public static Connection conn;
	public static Statement s ;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
    private JTable table;
    static ResultSet rs;
    DefaultTableModel model = new DefaultTableModel();
    Object [] kolonlar = {"Sinif","Ad","Soyad"};
    Object [] satirlar = new Object[3];
    

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
					frame = new YolcuRezervasyonlari();
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
	 * @throws SQLException 
	 */
	public YolcuRezervasyonlari() throws IOException, SQLException 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 460);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(446, 446); 
        this.setLocation((EkranX - 470) / 2, (EkranY - 460) / 2);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		final BufferedImage image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\f3.jpg"));
		contentPane_1 = new JPanel()
		{
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };

		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 43, 346, 322);
		contentPane_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		Kayit k = new Kayit();
		rs=k.YolcuBilgileri();
		model.setColumnIdentifiers(kolonlar);
		while(rs.next())
		{
			satirlar[0] = rs.getString("Sinif");
			satirlar[1] = rs.getString("Ad");
			satirlar[2] = rs.getString("Soyad");
			model.addRow(satirlar);
		}
        table.setModel(model);
        
        JLabel lblNewLabel = new JLabel("Yolcu Listesi");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 12));
        lblNewLabel.setBounds(33, 22, 158, 13);
        contentPane_1.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("İleri");
        btnNewButton.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent e) 
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
        });
        btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 10));
        btnNewButton.setBounds(337, 375, 85, 21);
        contentPane_1.add(btnNewButton);
	}
}
