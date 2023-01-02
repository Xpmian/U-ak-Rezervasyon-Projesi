package denemeGu;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dene.Kayit;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class RezerveKoltuk extends JFrame 
{
	private JPanel contentPane;
	static RezerveKoltuk rezervekoltuk;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					rezervekoltuk = new RezerveKoltuk();
					rezervekoltuk.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	public RezerveKoltuk() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 360);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(545, 360); 
        this.setLocation((EkranX - 545) / 2, (EkranY - 360) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Rezervasyon");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(73, 228, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JButton fClassBtn = new JButton();
		fClassBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnNewRadioButton.setSelected(true);
			}
		});
		fClassBtn.setText("First Class");
		fClassBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fClassBtn.setBounds(10, 84, 166, 138);
		contentPane.add(fClassBtn);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(237, 228, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1); 
		
		JButton bClassBtn = new JButton();
		bClassBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnNewRadioButton_1.setSelected(true);
			}
		});
		bClassBtn.setText("Business Class");
		bClassBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bClassBtn.setBounds(186, 84, 154, 138);
		contentPane.add(bClassBtn);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBounds(412, 228, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton eClassBtn = new JButton();
		eClassBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnNewRadioButton_2 .setSelected(true);
			}
		});
		eClassBtn.setText("Ekonomi Class");
		eClassBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		eClassBtn.setBounds(350, 84, 165, 138);
		contentPane.add(eClassBtn);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Ileri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{				
				
				if(rdbtnNewRadioButton_1.isSelected())
				{
					String C = "Business  Class";
					Deneme23 d;
					try 
					{
						Deneme23 deneme = new Deneme23();
						deneme.setVisible(true);
						setVisible(false);
						
					} catch (IOException e1) 
					{

						e1.printStackTrace();
					}	
					
				}
				else if(rdbtnNewRadioButton_2.isSelected())
				{
					String b = "Ekonomi Class";
					
					try 
					{
						EkonomiClass a = new EkonomiClass();
						a.setVisible(true);
						setVisible(false);
					} 
					catch (IOException e1) 
					{
						e1.printStackTrace();
					}	
					
				}
				else if(rdbtnNewRadioButton.isSelected())
				{
					String a = "First Class";					
					try 
					{
						FirstClass b = new FirstClass();
						b.setVisible(true);
						setVisible(false);
					} catch (IOException e1) 
					{
						e1.printStackTrace();
					}	
				}
				
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.ITALIC, 13));
		btnNewButton.setBounds(209, 292, 85, 21);
		contentPane.add(btnNewButton);
	}
}
