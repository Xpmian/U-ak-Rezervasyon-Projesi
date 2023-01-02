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
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RezervasyonArama extends JFrame 
{

	private JPanel contentPane;
	private JButton btnNewButton;
	static RezervasyonArama frame;
	public static ResultSet rs;
	private JTextField textField_3;
	public static String sinif ;
	public static String koltuk ;
	public static String ad ;
	public static String soyad ;
	public static String telefonNumarasi;
	public static String Ucusid;
	public static String tarih ;
	public static String kalkis_gidis ;
	public static String saat ; 
	public static Connection conn;
	public static Statement s ;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					frame = new RezervasyonArama();
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
	public RezervasyonArama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 200);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(345, 160); 
        this.setLocation((EkranX - 329) / 2, (EkranY - 200) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Rezervasyon Arama");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Ara");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(textField_3.getText().length() == 0 )
				{
					JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Boşluklari doldurunuz.");
				}
				String UcusId = textField_3.getText();
				Kayit k = new Kayit();
				try 
				{
					rs=k.BilgileriGetir(UcusId);
				} catch (SQLException e2) 
				{
					e2.printStackTrace();
				}
				try 
				{
					while(rs.next())
					{
						    sinif = rs.getString("Sinif");
							koltuk = rs.getString("Koltuk");
							ad = rs.getString("Ad");
							soyad = rs.getString("Soyad");
							telefonNumarasi = rs.getString("TelefonNumarasi");
							Ucusid = rs.getString("UcusID");
							tarih = rs.getString("Tarih");
							kalkis_gidis = rs.getString("Kalkis_Gidis");
							saat = rs.getString("Saat");	
					}					
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				Listele l = new Listele();
				l.setVisible(true);
				setVisible(false);
			}
				
	});
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 10));
		btnNewButton.setBounds(115, 74, 87, 13);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("UcusID");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel.setBounds(60, 36, 45, 13);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textField_3.setColumns(10);
		textField_3.setBounds(115, 37, 87, 13);
		contentPane.add(textField_3);
		btnNewButton.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e) 
			{
			        if(e.getKeyCode() == KeyEvent.VK_ENTER) 
			        {
			        		Listele l = new Listele();
			        		l.setVisible(true);
					        setVisible(false);
					}  
			}
		});
	
}
}
