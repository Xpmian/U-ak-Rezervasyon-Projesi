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
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class RezervasyonIptal extends JFrame 
{

	private JPanel contentPane;
	private JTextField textField;
	static RezervasyonIptal frame;
	static ResultSet rs;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					frame = new RezervasyonIptal();
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
	 */
	public RezervasyonIptal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 116);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(412, 116); 
        this.setLocation((EkranX - 412) / 2, (EkranY - 116) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Rezervasyon Iptal");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRezervasyonuIptalEtmek = new JLabel();
		lblRezervasyonuIptalEtmek.setFont(new Font("Verdana", Font.ITALIC, 10));
		lblRezervasyonuIptalEtmek.setText("Rezervasyonu iptal etmek için UcusID giriniz");
		lblRezervasyonuIptalEtmek.setBounds(21, 10, 377, 24);
		contentPane.add(lblRezervasyonuIptalEtmek);
		
		textField = new JTextField();
		textField.setBounds(21, 38, 196, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Rezervasyon Iptal");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String UcusId = textField.getText();
				Kayit k = new Kayit();
				String sql="SELECT * FROM bilgiler"+" WHERE UcusID='"+UcusId+"'";
				try 
				{
					rs = Kayit.bul(sql);
				} catch (SQLException e2) 
				{
					e2.printStackTrace();
				}
				int c = 1;
				try 
				{
					while(rs.next()) 
					   {												
						if(UcusId.equals(rs.getString("UcusID")));
						{
							k.sil(UcusId);
							JOptionPane jf=new JOptionPane();
							jf.showMessageDialog(frame, "Rezervasyon Silindi");						
							try 
							{
								Main m = new Main();
								m.setVisible(true);
								setVisible(false);
								c=0;
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
				if(c==1)
				{
					JOptionPane jf=new JOptionPane();
					jf.showMessageDialog(frame, "Boyle bir UcusID yok...");
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 7));
		btnNewButton.setBounds(263, 33, 109, 34);
		contentPane.add(btnNewButton);
	}
}
