package denemeGu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import dene.Kayit;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class EkonomiClass extends JFrame 
{

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	static EkonomiClass frame;
	int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
    private JTextField textField_8;

	public static void main(String[] args) 
	{	
	    Toolkit kit = Toolkit.getDefaultToolkit();
	    Container c;
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame = new EkonomiClass();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	public EkonomiClass() throws IOException 
	{
		Random random = new Random();
		long randomSayi = random.nextInt(214748664) + 214748664;
		String randomsayi = Long.toString(randomSayi);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 680);
		c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width;
        EkranY = (int) kit.getScreenSize().height;
        this.setSize(1080, 657); 
        this.setLocation((EkranX - 1080) / 2, (EkranY - 680) / 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JOptionPane jf=new JOptionPane();
        jf.showMessageDialog(frame, "UcusId'nizi kayit etmeyi unutmayiniz!!!!!");
		
		
		final BufferedImage image = ImageIO.read(new File("C:\\Users\\teofi\\Desktop\\a13.jpg"));
		contentPane_1 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };
		
		
		JTextArea textarea = new JTextArea(25,40);
		JScrollPane scrollpane = new JScrollPane(textarea);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		this.getContentPane().add(scrollpane);
		

		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
		JScrollPane scrollPanel = new JScrollPane();
		scrollPanel.setBounds(10, 46, 535, 362);
		contentPane_1.add(scrollPanel);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setForeground(Color.WHITE);
		scrollPanel.setViewportView(jPanel1);
		
		JButton A60 = new JButton();
		A60.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A60");
			}
		});
		A60.setText("A60");
		
		JButton B60 = new JButton();
		B60.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B60");
			}
		});
		B60.setText("B60");
		
		JButton C60 = new JButton();
		C60.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C60");
			}
		});
		C60.setText("C60");
		
		JButton D60 = new JButton();
		D60.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D60");
			}
		});
		D60.setText("D60");
		
		JButton E60 = new JButton();
		E60.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("E60");
			}
		});
		E60.setText("E60");
		
		JButton F60 = new JButton();
		F60.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F60");
			}
		});
		F60.setText("F60");
		
		JButton G60 = new JButton();
		G60.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("G60");
			}
		});
		G60.setText("G60");
		
		JButton H60 = new JButton();
		H60.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H60");
			}
		});
		H60.setText("H60");
		
		JButton A59 = new JButton();
		A59.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A59");
			}
		});
		A59.setText("A59");
		
		JButton B59 = new JButton();
		B59.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B59");
			}
		});
		B59.setText("B59");
		
		JButton C59 = new JButton();
		C59.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C59");
			}
		});
		C59.setText("C59");
		
		JButton D59 = new JButton();
		D59.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D59");
			}
		});
		D59.setText("D59");
		
		JButton E59 = new JButton();
		E59.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("E59");
			}
		});
		E59.setText("E59");
		
		JButton F59 = new JButton();
		F59.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F59");
			}
		});
		F59.setText("F59");
		
		JButton G59 = new JButton();
		G59.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("G59");
			}
		});
		G59.setText("G59");
		
		JButton H59 = new JButton();
		H59.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H59");
			}
		});
		H59.setText("H59");
		
		JButton A58 = new JButton();
		A58.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A58");
			}
		});
		A58.setText("A58");
		
		JButton B58 = new JButton();
		B58.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B58");
			}
		});
		B58.setText("B58");
		
		JButton C58 = new JButton();
		C58.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C58");
			}
		});
		C58.setText("C58");
		
		JButton D58 = new JButton();
		D58.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D58");
			}
		});
		D58.setText("D58");
		
		JButton E58 = new JButton();
		E58.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("E58");
			}
		});
		E58.setText("E58");
		
		JButton F58 = new JButton();
		F58.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F58");
			}
		});
		F58.setText("F58");
		
		JButton G58 = new JButton();
		G58.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("G58");
			}
		});
		G58.setText("G58");
		
		JButton H58 = new JButton();
		H58.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H58");
			}
		});
		H58.setText("H58");
		
		JButton A57 = new JButton();
		A57.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A57");
			}
		});
		A57.setText("A57");
		
		JButton B57 = new JButton();
		B57.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B57");
			}
		});
		B57.setText("B57");
		
		JButton C57 = new JButton();
		C57.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C57");
			}
		});
		C57.setText("C57");
		
		JButton D57 = new JButton();
		D57.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D57");
			}
		});
		D57.setText("D57");
		
		JButton E57 = new JButton();
		E57.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("E57");
			}
		});
		E57.setText("E57");
		
		JButton F57 = new JButton();
		F57.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F57");
			}
		});
		F57.setText("F57");
		
		JButton G57 = new JButton();
		G57.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("G57");
			}
		});
		G57.setText("G57");
		
		JButton H57 = new JButton();
		H57.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H57");
			}
		});
		H57.setText("H57");
		
		JButton A56 = new JButton();
		A56.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A56");
			}
		});
		A56.setText("A56");
		
		JButton B56 = new JButton();
		B56.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B56");
			}
		});
		B56.setText("B56");
		
		JButton C56 = new JButton();
		C56.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C56");
			}
		});
		C56.setText("C56");
		
		JButton D56 = new JButton();
		D56.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D56");
			}
		});
		D56.setText("D56");
		
		JButton E56 = new JButton();
		E56.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("E56");
			}
		});
		E56.setText("E56");
		
		JButton F56 = new JButton();
		F56.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F56");
			}
		});
		F56.setText("F56");
		
		JButton G56 = new JButton();
		G56.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("G56");
			}
		});
		G56.setText("G56");
		
		JButton H56 = new JButton();
		H56.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H56");
			}
		});
		H56.setText("H56");
		
		JButton A55 = new JButton();
		A55.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A55");
			}
		});
		A55.setText("A55");
		
		JButton B55 = new JButton();
		B55.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B55");
			}
		});
		B55.setText("B55");
		
		JButton C55 = new JButton();
		C55.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C55");
			}
		});
		C55.setText("C55");
		
		JButton D55 = new JButton();
		D55.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("D55");
			}
		});
		D55.setText("D55");
		
		JButton E55 = new JButton();
		E55.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("E55");
			}
		});
		E55.setText("E55");
		
		JButton F55 = new JButton();
		F55.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("F55");
			}
		});
		F55.setText("F55");
		
		JButton G55 = new JButton();
		G55.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("G55");
			}
		});
		G55.setText("G55");
		
		JButton H55 = new JButton();
		H55.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("H55");
			}
		});
		H55.setText("H55");
		
		JButton A54 = new JButton();
		A54.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A54");
			}
		});
		A54.setText("A54");
		
		JButton B54 = new JButton();
		B54.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("B54");
			}
		});
		B54.setText("B54");
		
		JButton C54 = new JButton();
		C54.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("C54");
			}
		});
		C54.setText("C54");
		
		JButton D54 = new JButton();
		D54.setText("D54");
		
		JButton E54 = new JButton();
		E54.setText("E54");
		
		JButton F54 = new JButton();
		F54.setText("F54");
		
		JButton G54 = new JButton();
		G54.setText("G54");
		
		JButton H54 = new JButton();
		H54.setText("H54");
		
		JButton A53 = new JButton();
		A53.setText("A53");
		
		JButton B53 = new JButton();
		B53.setText("B53");
		
		JButton C53 = new JButton();
		C53.setText("C53");
		
		JButton D53 = new JButton();
		D53.setText("D53");
		
		JButton E53 = new JButton();
		E53.setText("E53");
		
		JButton F53 = new JButton();
		F53.setText("F53");
		
		JButton G53 = new JButton();
		G53.setText("G53");
		
		JButton H53 = new JButton();
		H53.setText("H53");
		
		JButton A52 = new JButton();
		A52.setText("A52");
		
		JButton B52 = new JButton();
		B52.setText("B52");
		
		JButton C52 = new JButton();
		C52.setText("C52");
		
		JButton D52 = new JButton();
		D52.setText("D52");
		
		JButton E52 = new JButton();
		E52.setText("E52");
		
		JButton F52 = new JButton();
		F52.setText("F52");
		
		JButton G52 = new JButton();
		G52.setText("G52");
		
		JButton H52 = new JButton();
		H52.setText("H52");
		
		JButton A51 = new JButton();
		A51.setText("A51");
		
		JButton B51 = new JButton();
		B51.setText("B51");
		
		JButton C51 = new JButton();
		C51.setText("C51");
		
		JButton D51 = new JButton();
		D51.setText("D51");
		
		JButton E51 = new JButton();
		E51.setText("E51");
		
		JButton F51 = new JButton();
		F51.setText("F51");
		
		JButton G51 = new JButton();
		G51.setText("G51");
		
		JButton H51 = new JButton();
		H51.setText("H51");
		
		JButton A50 = new JButton();
		A50.setText("A50");
		
		JButton B50 = new JButton();
		B50.setText("B50");
		
		JButton C50 = new JButton();
		C50.setText("C50");
		
		JButton D50 = new JButton();
		D50.setText("D50");
		
		JButton E50 = new JButton();
		E50.setText("E50");
		
		JButton F50 = new JButton();
		F50.setText("F50");
		
		JButton G50 = new JButton();
		G50.setText("G50");
		
		JButton H50 = new JButton();
		H50.setText("H50");
		
		JButton A49 = new JButton();
		A49.setText("A49");
		
		JButton B49 = new JButton();
		B49.setText("B49");
		
		JButton C49 = new JButton();
		C49.setText("C49");
		
		JButton D49 = new JButton();
		D49.setText("D49");
		
		JButton E49 = new JButton();
		E49.setText("E49");
		
		JButton F49 = new JButton();
		F49.setText("F49");
		
		JButton G49 = new JButton();
		G49.setText("G49");
		
		JButton H49 = new JButton();
		H49.setText("H49");
		
		JButton A48 = new JButton();
		A48.setText("A48");
		
		JButton B48 = new JButton();
		B48.setText("B48");
		
		JButton C48 = new JButton();
		C48.setText("C48");
		
		JButton D48 = new JButton();
		D48.setText("D48");
		
		JButton E48 = new JButton();
		E48.setText("E48");
		
		JButton F48 = new JButton();
		F48.setText("F48");
		
		JButton G48 = new JButton();
		G48.setText("G48");
		
		JButton H48 = new JButton();
		H48.setText("H48");
		
		JButton A47 = new JButton();
		A47.setText("A47");
		
		JButton B47 = new JButton();
		B47.setText("B47");
		
		JButton C47 = new JButton();
		C47.setText("C47");
		
		JButton D47 = new JButton();
		D47.setText("D47");
		
		JButton E47 = new JButton();
		E47.setText("E47");
		
		JButton F47 = new JButton();
		F47.setText("F47");
		
		JButton G47 = new JButton();
		G47.setText("G47");
		
		JButton H47 = new JButton();
		H47.setText("H47");
		
		JButton A46 = new JButton();
		A46.setText("A46");
		
		JButton B46 = new JButton();
		B46.setText("B46");
		
		JButton C46 = new JButton();
		C46.setText("C46");
		
		JButton D46 = new JButton();
		D46.setText("D46");
		
		JButton E46 = new JButton();
		E46.setText("E46");
		
		JButton F46 = new JButton();
		F46.setText("F46");
		
		JButton G46 = new JButton();
		G46.setText("G46");
		
		JButton H46 = new JButton();
		H46.setText("H46");
		
		JButton A45 = new JButton();
		A45.setText("A45");
		
		JButton B45 = new JButton();
		B45.setText("B45");
		
		JButton C45 = new JButton();
		C45.setText("C45");
		
		JButton D45 = new JButton();
		D45.setText("D45");
		
		JButton E45 = new JButton();
		E45.setText("E45");
		
		JButton F45 = new JButton();
		F45.setText("F45");
		
		JButton G45 = new JButton();
		G45.setText("G45");
		
		JButton H45 = new JButton();
		H45.setText("H45");
		
		JButton A44 = new JButton();
		A44.setText("A44");
		
		JButton B44 = new JButton();
		B44.setText("B44");
		
		JButton C44 = new JButton();
		C44.setText("C44");
		
		JButton D44 = new JButton();
		D44.setText("D44");
		
		JButton E44 = new JButton();
		E44.setText("E44");
		
		JButton F44 = new JButton();
		F44.setText("F44");
		
		JButton G44 = new JButton();
		G44.setText("G44");
		
		JButton H44 = new JButton();
		H44.setText("H44");
		
		JButton A43 = new JButton();
		A43.setText("A43");
		
		JButton B43 = new JButton();
		B43.setText("B43");
		
		JButton C43 = new JButton();
		C43.setText("C43");
		
		JButton D43 = new JButton();
		D43.setText("D43");
		
		JButton jButton262 = new JButton();
		jButton262.setText("E43");
		
		JButton F43 = new JButton();
		F43.setText("F43");
		
		JButton G43 = new JButton();
		G43.setText("G43");
		
		JButton H43 = new JButton();
		H43.setText("H43");
		
		JButton A42 = new JButton();
		A42.setText("A42");
		
		JButton B42 = new JButton();
		B42.setText("B42");
		
		JButton C42 = new JButton();
		C42.setText("C42");
		
		JButton D42 = new JButton();
		D42.setText("D42");
		
		JButton E42 = new JButton();
		E42.setText("E42");
		
		JButton F42 = new JButton();
		F42.setText("F42");
		
		JButton G42 = new JButton();
		G42.setText("G42");
		
		JButton H42 = new JButton();
		H42.setText("H42");
		
		JButton A41 = new JButton();
		A41.setText("A41");
		
		JButton B41 = new JButton();
		B41.setText("B41");
		
		JButton C41 = new JButton();
		C41.setText("C41");
		
		JButton D41 = new JButton();
		D41.setText("D41");
		
		JButton E41 = new JButton();
		E41.setText("E41");
		
		JButton F41 = new JButton();
		F41.setText("F41");
		
		JButton G41 = new JButton();
		G41.setText("G41");
		
		JButton H41 = new JButton();
		H41.setText("H41");
		
		JButton A40 = new JButton();
		A40.setText("A40");
		
		JButton B40 = new JButton();
		B40.setText("B40");
		
		JButton C40 = new JButton();
		C40.setText("C40");
		
		JButton D40 = new JButton();
		D40.setText("D40");
		
		JButton E40 = new JButton();
		E40.setText("E40");
		
		JButton F40 = new JButton();
		F40.setText("F40");
		
		JButton G40 = new JButton();
		G40.setText("G40");
		
		JButton H40 = new JButton();
		H40.setText("H40");
		
		JButton A39 = new JButton();
		A39.setText("A39");
		
		JButton B39 = new JButton();
		B39.setText("B39");
		
		JButton C39 = new JButton();
		C39.setText("C39");
		
		JButton D39 = new JButton();
		D39.setText("D39");
		
		JButton E39 = new JButton();
		E39.setText("E39");
		
		JButton F39 = new JButton();
		F39.setText("F39");
		
		JButton G39 = new JButton();
		G39.setText("G39");
		
		JButton H39 = new JButton();
		H39.setText("H39");
		
		JButton A38 = new JButton();
		A38.setText("A38");
		
		JButton B38 = new JButton();
		B38.setText("B38");
		
		JButton C38 = new JButton();
		C38.setText("C38");
		
		JButton D38 = new JButton();
		D38.setText("D38");
		
		JButton E38 = new JButton();
		E38.setText("E38");
		
		JButton F38 = new JButton();
		F38.setText("F38");
		
		JButton G38 = new JButton();
		G38.setText("G38");
		
		JButton H38 = new JButton();
		H38.setText("H38");
		
		JButton A37 = new JButton();
		A37.setText("A37");
		
		JButton B37 = new JButton();
		B37.setText("B37");
		
		JButton C37 = new JButton();
		C37.setText("C37");
		
		JButton D37 = new JButton();
		D37.setText("D37");
		
		JButton E37 = new JButton();
		E37.setText("E37");
		
		JButton F37 = new JButton();
		F37.setText("F37");
		
		JButton G37 = new JButton();
		G37.setText("G37");
		
		JButton H37 = new JButton();
		H37.setText("H37");
		
		JButton A36 = new JButton();
		A36.setText("A36");
		
		JButton B36 = new JButton();
		B36.setText("B36");
		
		JButton C36 = new JButton();
		C36.setText("C36");
		
		JButton D36 = new JButton();
		D36.setText("D36");
		
		JButton E36 = new JButton();
		E36.setText("E36");
		
		JButton F36 = new JButton();
		F36.setText("F36");
		
		JButton G36 = new JButton();
		G36.setText("G36");
		
		JButton H36 = new JButton();
		H36.setText("H36");
		
		JButton A35 = new JButton();
		A35.setText("A35");
		
		JButton B35 = new JButton();
		B35.setText("B35");
		
		JButton C35 = new JButton();
		C35.setText("C35");
		
		JButton D35 = new JButton();
		D35.setText("D35");
		
		JButton E35 = new JButton();
		E35.setText("E35");
		
		JButton F35 = new JButton();
		F35.setText("F35");
		
		JButton G35 = new JButton();
		G35.setText("G35");
		
		JButton H35 = new JButton();
		H35.setText("H35");
		
		JButton A34 = new JButton();
		A34.setText("A34");
		
		JButton B34 = new JButton();
		B34.setText("B34");
		
		JButton C34 = new JButton();
		C34.setText("C34");
		
		JButton D34 = new JButton();
		D34.setText("D34");
		
		JButton E34 = new JButton();
		E34.setText("E34");
		
		JButton F34 = new JButton();
		F34.setText("F34");
		
		JButton G34 = new JButton();
		G34.setText("G34");
		
		JButton H34 = new JButton();
		H34.setText("H34");
		
		JButton A33 = new JButton();
		A33.setText("A33");
		
		JButton B33 = new JButton();
		B33.setText("B33");
		
		JButton C33 = new JButton();
		C33.setText("C33");
		
		JButton D33 = new JButton();
		D33.setText("D33");
		
		JButton E33 = new JButton();
		E33.setText("E33");
		
		JButton F33 = new JButton();
		F33.setText("F33");
		
		JButton G33 = new JButton();
		G33.setText("G33");
		
		JButton H33 = new JButton();
		H33.setText("H33");
		
		JButton A32 = new JButton();
		A32.setText("A32");
		
		JButton B32 = new JButton();
		B32.setText("B32");
		
		JButton C32 = new JButton();
		C32.setText("C32");
		
		JButton D32 = new JButton();
		D32.setText("D32");
		
		JButton E32 = new JButton();
		E32.setText("E32");
		
		JButton F32 = new JButton();
		F32.setText("F32");
		
		JButton G32 = new JButton();
		G32.setText("G32");
		
		JButton H32 = new JButton();
		H32.setText("H32");
		
		JButton A31 = new JButton();
		A31.setText("A31");
		
		JButton B31 = new JButton();
		B31.setText("B31");
		
		JButton C31 = new JButton();
		C31.setText("C31");
		
		JButton D31 = new JButton();
		D31.setText("D31");
		
		JButton E31 = new JButton();
		E31.setText("E31");
		
		JButton F31 = new JButton();
		F31.setText("F31");
		
		JButton G31 = new JButton();
		G31.setText("G31");
		
		JButton H31 = new JButton();
		H31.setText("H31");
		
		JButton A30 = new JButton();
		A30.setText("A30");
		
		JButton B30 = new JButton();
		B30.setText("B30");
		
		JButton C30 = new JButton();
		C30.setText("C30");
		
		JButton D30 = new JButton();
		D30.setText("D30");
		
		JButton E30 = new JButton();
		E30.setText("E30");
		
		JButton F30 = new JButton();
		F30.setText("F30");
		
		JButton G30 = new JButton();
		G30.setText("G30");
		
		JButton H30 = new JButton();
		H30.setText("H30");
		
		JButton A29 = new JButton();
		A29.setText("A29");
		
		JButton B29 = new JButton();
		B29.setText("B29");
		
		JButton C29 = new JButton();
		C29.setText("C29");
		
		JButton D29 = new JButton();
		D29.setText("D29");
		
		JButton E29 = new JButton();
		E29.setText("E29");
		
		JButton F29 = new JButton();
		F29.setText("F29");
		
		JButton G29 = new JButton();
		G29.setText("G29");
		
		JButton H29 = new JButton();
		H29.setText("H29");
		
		JButton A28 = new JButton();
		A28.setText("A28");
		
		JButton B28 = new JButton();
		B28.setText("B28");
		
		JButton C28 = new JButton();
		C28.setText("C28");
		
		JButton D28 = new JButton();
		D28.setText("D28");
		
		JButton E28 = new JButton();
		E28.setText("E28");
		
		JButton F28 = new JButton();
		F28.setText("F28");
		
		JButton G28 = new JButton();
		G28.setText("G28");
		
		JButton H28 = new JButton();
		H28.setText("H28");
		
		JButton A27 = new JButton();
		A27.setText("A27");
		
		JButton B27 = new JButton();
		B27.setText("B27");
		
		JButton C27 = new JButton();
		C27.setText("C27");
		
		JButton D27 = new JButton();
		D27.setText("D27");
		
		JButton E27 = new JButton();
		E27.setText("E27");
		
		JButton F27 = new JButton();
		F27.setText("F27");
		
		JButton G27 = new JButton();
		G27.setText("G27");
		
		JButton H27 = new JButton();
		H27.setText("H27");
		
		JButton A26 = new JButton();
		A26.setText("A26");
		
		JButton B26 = new JButton();
		B26.setText("B26");
		
		JButton C26 = new JButton();
		C26.setText("C26");
		
		JButton D26 = new JButton();
		D26.setText("D26");
		
		JButton E26 = new JButton();
		E26.setText("E26");
		
		JButton F26 = new JButton();
		F26.setText("F26");
		
		JButton G26 = new JButton();
		G26.setText("G26");
		
		JButton H26 = new JButton();
		H26.setText("H26");
		
		JButton A25 = new JButton();
		A25.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A25");
			}
		});
		A25.setText("A25");
		
		JButton B25 = new JButton();
		B25.setText("B25");
		
		JButton C25 = new JButton();
		C25.setText("C25");
		
		JButton D25 = new JButton();
		D25.setText("D25");
		
		JButton E25 = new JButton();
		E25.setText("E25");
		
		JButton F25 = new JButton();
		F25.setText("F25");
		
		JButton G25 = new JButton();
		G25.setText("G25");
		
		JButton H25 = new JButton();
		H25.setText("H25");
		
		JButton A24 = new JButton();
		A24.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A24");
			}
		});
		A24.setText("A24");
		
		JButton B24 = new JButton();
		B24.setText("B24");
		
		JButton C24 = new JButton();
		C24.setText("C24");
		
		JButton D24 = new JButton();
		D24.setText("D24");
		
		JButton E24 = new JButton();
		E24.setText("E24");
		
		JButton F24 = new JButton();
		F24.setText("F24");
		
		JButton G24 = new JButton();
		G24.setText("G24");
		
		JButton H24 = new JButton();
		H24.setText("H24");
		
		JButton A23 = new JButton();
		A23.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A23");
			}
		});
		A23.setText("A23");
		
		JButton B23 = new JButton();
		B23.setText("B23");
		
		JButton C23 = new JButton();
		C23.setText("C23");
		
		JButton D23 = new JButton();
		D23.setText("D23");
		
		JButton E23 = new JButton();
		E23.setText("E23");
		
		JButton F23 = new JButton();
		F23.setText("F23");
		
		JButton G23 = new JButton();
		G23.setText("G23");
		
		JButton H23 = new JButton();
		H23.setText("H23");
		
		JButton A22 = new JButton();
		A22.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A22");
			}
		});
		A22.setText("A22");
		
		JButton B22 = new JButton();
		B22.setText("B22");
		
		JButton C22 = new JButton();
		C22.setText("C22");
		
		JButton D22 = new JButton();
		D22.setText("D22");
		
		JButton E22 = new JButton();
		E22.setText("E22");
		
		JButton F22 = new JButton();
		F22.setText("F22");
		
		JButton G22 = new JButton();
		G22.setText("G22");
		
		JButton H22 = new JButton();
		H22.setText("H22");
		
		JButton A21 = new JButton();
		A21.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A21");
			}
		});
		A21.setText("A21");
		
		JButton B21 = new JButton();
		B21.setText("B21");
		
		JButton C21 = new JButton();
		C21.setText("C21");
		
		JButton D21 = new JButton();
		D21.setText("D21");
		
		JButton E21 = new JButton();
		E21.setText("E21");
		
		JButton F21 = new JButton();
		F21.setText("F21");
		
		JButton G21 = new JButton();
		G21.setText("G21");
		
		JButton H21 = new JButton();
		H21.setText("H21");
		
		JButton A20 = new JButton();
		A20.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A20");
			}
		});
		A20.setText("A20");
		
		JButton B20 = new JButton();
		B20.setText("B20");
		
		JButton C20 = new JButton();
		C20.setText("C20");
		
		JButton D20 = new JButton();
		D20.setText("D20");
		
		JButton E20 = new JButton();
		E20.setText("E20");
		
		JButton F20 = new JButton();
		F20.setText("F20");
		
		JButton G20 = new JButton();
		G20.setText("G20");
		
		JButton H20 = new JButton();
		H20.setText("H20");
		
		JButton A19 = new JButton();
		A19.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A19");
			}
		});
		A19.setText("A19");
		
		JButton B19 = new JButton();
		B19.setText("B19");
		
		JButton C19 = new JButton();
		C19.setText("C19");
		
		JButton D19 = new JButton();
		D19.setText("D19");
		
		JButton E19 = new JButton();
		E19.setText("E19");
		
		JButton F19 = new JButton();
		F19.setText("F19");
		
		JButton G19 = new JButton();
		G19.setText("G19");
		
		JButton H19 = new JButton();
		H19.setText("H19");
		
		JButton A18 = new JButton();
		A18.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A18");
			}
		});
		A18.setText("A18");
		
		JButton B18 = new JButton();
		B18.setText("B18");
		
		JButton C18 = new JButton();
		C18.setText("C18");
		
		JButton D18 = new JButton();
		D18.setText("D18");
		
		JButton E18 = new JButton();
		E18.setText("E18");
		
		JButton F18 = new JButton();
		F18.setText("F18");
		
		JButton G18 = new JButton();
		G18.setText("G18");
		
		JButton H18 = new JButton();
		H18.setText("H18");
		
		JButton A17 = new JButton();
		A17.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A17");
			}
		});
		A17.setText("A17");
		
		JButton B17 = new JButton();
		B17.setText("B17");
		
		JButton C17 = new JButton();
		C17.setText("C17");
		
		JButton D17 = new JButton();
		D17.setText("D17");
		
		JButton E17 = new JButton();
		E17.setText("E17");
		
		JButton F17 = new JButton();
		F17.setText("F17");
		
		JButton G17 = new JButton();
		G17.setText("G17");
		
		JButton H17 = new JButton();
		H17.setText("H17");
		
		JButton A16 = new JButton();
		A16.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A16");
			}
			
		});
		A16.setText("A16");
		
		JButton B16 = new JButton();
		B16.setText("B16");
		
		JButton C16 = new JButton();
		C16.setText("C16");
		
		JButton D16 = new JButton();
		D16.setText("D16");
		
		JButton E16 = new JButton();
		E16.setText("E16");
		
		JButton F16 = new JButton();
		F16.setText("F16");
		
		JButton G16 = new JButton();
		G16.setText("G16");
		
		JButton H16 = new JButton();
		H16.setText("H16");
		
		JButton A15 = new JButton();
		A15.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A15");
			}
		});
		A15.setText("A15");
		
		JButton B15 = new JButton();
		B15.setText("B15");
		
		JButton C15 = new JButton();
		C15.setText("C15");
		
		JButton D15 = new JButton();
		D15.setText("D15");
		
		JButton E15 = new JButton();
		E15.setText("E15");
		
		JButton F15 = new JButton();
		F15.setText("F15");
		
		JButton G15 = new JButton();
		G15.setText("G15");
		
		JButton H15 = new JButton();
		H15.setText("H15");
		
		JButton A14 = new JButton();
		A14.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A14");
			}
		});
		A14.setText("A14");
		
		JButton B14 = new JButton();
		B14.setText("B14");
		
		JButton C14 = new JButton();
		C14.setText("C14");
		
		JButton D14 = new JButton();
		D14.setText("D14");
		
		JButton E14 = new JButton();
		E14.setText("E14");
		
		JButton F14 = new JButton();
		F14.setText("F14");
		
		JButton G14 = new JButton();
		G14.setText("G14");
		
		JButton H14 = new JButton();
		H14.setText("H14");
		
		JButton A13 = new JButton();
		A13.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_4.setText("A13");
			}
		});
		A13.setText("A13");
		
		JButton B13 = new JButton();
		B13.setText("B13");
		
		JButton C13 = new JButton();
		C13.setText("C13");
		
		JButton D13 = new JButton();
		D13.setText("D13");
		
		JButton E13 = new JButton();
		E13.setText("E13");
		
		JButton F13 = new JButton();
		F13.setText("F13");
		
		JButton G13 = new JButton();
		G13.setText("G13");
		
		JButton H13 = new JButton();
		H13.setText("H13");
		GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
		gl_jPanel1.setHorizontalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 468, Short.MAX_VALUE)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(A60)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(B60)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(C60)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(D60)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(E60)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(F60)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(G60)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(H60))
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(A59)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(B59)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(C59)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(D59)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(E59)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(F59)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(G59)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(H59))
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(A58)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(B58)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(C58)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(D58)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(E58)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(F58)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(G58)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(H58))
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(A57)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(B57)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(C57)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(D57)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(E57)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(F57)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(G57)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(H57))
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(A56)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(B56)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(C56)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(D56)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(E56)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(F56)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(G56)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(H56))
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(A55)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(B55)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(C55)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(D55)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(E55)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(F55)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(G55)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(H55))
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(A54)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(B54)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(C54)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(D54)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(E54)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(F54)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(G54)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(H54))
						.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_jPanel1.createSequentialGroup()
								.addComponent(A53)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(B53)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(C53)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(D53)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(E53)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(F53)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(G53)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(H53))
							.addGroup(gl_jPanel1.createSequentialGroup()
								.addComponent(A52)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(B52)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(C52)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(D52)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(E52)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(F52)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(G52)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(H52))
							.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jPanel1.createSequentialGroup()
									.addComponent(A51)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(B51)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(C51)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(D51)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(E51)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(F51)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(G51)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(H51))
								.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_jPanel1.createSequentialGroup()
										.addComponent(A50)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(B50)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(C50)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(D50)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(E50)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(F50)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(G50)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(H50))
									.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A49)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B49)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C49)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D49)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E49)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F49)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G49)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H49))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A48)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B48)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C48)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D48)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E48)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F48)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G48)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H48))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A47)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B47)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C47)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D47)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E47)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F47)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G47)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H47))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A46)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B46)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C46)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D46)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E46)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F46)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G46)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H46))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A45)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B45)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C45)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D45)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E45)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F45)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G45)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H45))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A44)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B44)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C44)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D44)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E44)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F44)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G44)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H44))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A43)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B43)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C43)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D43)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(jButton262)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F43)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G43)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H43))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A42)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B42)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C42)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D42)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E42)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F42)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G42)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H42))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A41)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B41)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C41)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D41)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E41)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F41)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G41)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H41))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A40)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B40)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C40)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D40)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E40)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F40)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G40)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H40))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A39)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B39)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C39)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D39)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E39)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F39)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G39)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H39))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A38)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B38)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C38)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D38)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E38)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F38)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G38)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H38))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A37)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B37)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C37)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D37)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E37)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F37)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G37)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H37))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A36)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B36)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C36)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D36)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E36)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F36)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G36)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H36))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A35)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B35)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C35)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D35)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E35)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F35)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G35)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H35))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A34)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B34)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C34)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D34)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E34)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F34)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G34)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H34))
										.addGroup(gl_jPanel1.createSequentialGroup()
											.addComponent(A33)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(B33)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(C33)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(D33)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(E33)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(F33)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(G33)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(H33))
										.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_jPanel1.createSequentialGroup()
												.addComponent(A32)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(B32)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(C32)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(D32)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(E32)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(F32)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(G32)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(H32))
											.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_jPanel1.createSequentialGroup()
													.addComponent(A31)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(B31)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(C31)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(D31)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(E31)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(F31)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(G31)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(H31))
												.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
													.addGroup(gl_jPanel1.createSequentialGroup()
														.addComponent(A30)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(B30)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(C30)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(D30)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(E30)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(F30)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(G30)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(H30))
													.addGroup(gl_jPanel1.createSequentialGroup()
														.addComponent(A29)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(B29)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(C29)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(D29)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(E29)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(F29)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(G29)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(H29))
													.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A28)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B28)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C28)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D28)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E28)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F28)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G28)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H28))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A27)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B27)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C27)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D27)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E27)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F27)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G27)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H27))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A26)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B26)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C26)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D26)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E26)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F26)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G26)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H26))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A25)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B25)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C25)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D25)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E25)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F25)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G25)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H25))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A24)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B24)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C24)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D24)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E24)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F24)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G24)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H24))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A23)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B23)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C23)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D23)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E23)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F23)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G23)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H23))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A22)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B22)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C22)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D22)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E22)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F22)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G22)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H22))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A21)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B21)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C21)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D21)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E21)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F21)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G21)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H21))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A20)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B20)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C20)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D20)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E20)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F20)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G20)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H20))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A19)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B19)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C19)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D19)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E19)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F19)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G19)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H19))
														.addGroup(gl_jPanel1.createSequentialGroup()
															.addComponent(A18)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(B18)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(C18)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(D18)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(E18)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(F18)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(G18)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(H18))
														.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
															.addGroup(gl_jPanel1.createSequentialGroup()
																.addComponent(A17)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(B17)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(C17)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(D17)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(E17)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(F17)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(G17)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(H17))
															.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_jPanel1.createSequentialGroup()
																	.addComponent(A16)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(B16)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(C16)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(D16)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(E16)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(F16)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(G16)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(H16))
																.addGroup(gl_jPanel1.createSequentialGroup()
																	.addComponent(A15)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(B15)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(C15)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(D15)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(E15)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(F15)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(G15)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(H15))
																.addGroup(gl_jPanel1.createSequentialGroup()
																	.addComponent(A14)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(B14)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(C14)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(D14)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(E14)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(F14)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(G14)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(H14))
																.addGroup(gl_jPanel1.createSequentialGroup()
																	.addComponent(A13)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(B13)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(C13)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(D13)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(E13)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(F13)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(G13)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(H13)))))))))))))
					.addContainerGap())
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1310, Short.MAX_VALUE)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A13)
						.addComponent(B13)
						.addComponent(C13)
						.addComponent(D13)
						.addComponent(E13)
						.addComponent(F13)
						.addComponent(G13)
						.addComponent(H13))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A14)
						.addComponent(B14)
						.addComponent(C14)
						.addComponent(D14)
						.addComponent(E14)
						.addComponent(F14)
						.addComponent(G14)
						.addComponent(H14))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A15)
						.addComponent(B15)
						.addComponent(C15)
						.addComponent(D15)
						.addComponent(E15)
						.addComponent(F15)
						.addComponent(G15)
						.addComponent(H15))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A16)
						.addComponent(B16)
						.addComponent(C16)
						.addComponent(D16)
						.addComponent(E16)
						.addComponent(F16)
						.addComponent(G16)
						.addComponent(H16))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A17)
						.addComponent(B17)
						.addComponent(C17)
						.addComponent(D17)
						.addComponent(E17)
						.addComponent(F17)
						.addComponent(G17)
						.addComponent(H17))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A18)
						.addComponent(B18)
						.addComponent(C18)
						.addComponent(D18)
						.addComponent(E18)
						.addComponent(F18)
						.addComponent(G18)
						.addComponent(H18))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A19)
						.addComponent(B19)
						.addComponent(C19)
						.addComponent(D19)
						.addComponent(E19)
						.addComponent(F19)
						.addComponent(G19)
						.addComponent(H19))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A20)
						.addComponent(B20)
						.addComponent(C20)
						.addComponent(D20)
						.addComponent(E20)
						.addComponent(F20)
						.addComponent(G20)
						.addComponent(H20))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A21)
						.addComponent(B21)
						.addComponent(C21)
						.addComponent(D21)
						.addComponent(E21)
						.addComponent(F21)
						.addComponent(G21)
						.addComponent(H21))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A22)
						.addComponent(B22)
						.addComponent(C22)
						.addComponent(D22)
						.addComponent(E22)
						.addComponent(F22)
						.addComponent(G22)
						.addComponent(H22))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A23)
						.addComponent(B23)
						.addComponent(C23)
						.addComponent(D23)
						.addComponent(E23)
						.addComponent(F23)
						.addComponent(G23)
						.addComponent(H23))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A24)
						.addComponent(B24)
						.addComponent(C24)
						.addComponent(D24)
						.addComponent(E24)
						.addComponent(F24)
						.addComponent(G24)
						.addComponent(H24))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A25)
						.addComponent(B25)
						.addComponent(C25)
						.addComponent(D25)
						.addComponent(E25)
						.addComponent(F25)
						.addComponent(G25)
						.addComponent(H25))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A26)
						.addComponent(B26)
						.addComponent(C26)
						.addComponent(D26)
						.addComponent(E26)
						.addComponent(F26)
						.addComponent(G26)
						.addComponent(H26))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A27)
						.addComponent(B27)
						.addComponent(C27)
						.addComponent(D27)
						.addComponent(E27)
						.addComponent(F27)
						.addComponent(G27)
						.addComponent(H27))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A28)
						.addComponent(B28)
						.addComponent(C28)
						.addComponent(D28)
						.addComponent(E28)
						.addComponent(F28)
						.addComponent(G28)
						.addComponent(H28))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A29)
						.addComponent(B29)
						.addComponent(C29)
						.addComponent(D29)
						.addComponent(E29)
						.addComponent(F29)
						.addComponent(G29)
						.addComponent(H29))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A30)
						.addComponent(B30)
						.addComponent(C30)
						.addComponent(D30)
						.addComponent(E30)
						.addComponent(F30)
						.addComponent(G30)
						.addComponent(H30))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A31)
						.addComponent(B31)
						.addComponent(C31)
						.addComponent(D31)
						.addComponent(E31)
						.addComponent(F31)
						.addComponent(G31)
						.addComponent(H31))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A32)
						.addComponent(B32)
						.addComponent(C32)
						.addComponent(D32)
						.addComponent(E32)
						.addComponent(F32)
						.addComponent(G32)
						.addComponent(H32))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A33)
						.addComponent(B33)
						.addComponent(C33)
						.addComponent(D33)
						.addComponent(E33)
						.addComponent(F33)
						.addComponent(G33)
						.addComponent(H33))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A34)
						.addComponent(B34)
						.addComponent(C34)
						.addComponent(D34)
						.addComponent(E34)
						.addComponent(F34)
						.addComponent(G34)
						.addComponent(H34))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A35)
						.addComponent(B35)
						.addComponent(C35)
						.addComponent(D35)
						.addComponent(E35)
						.addComponent(F35)
						.addComponent(G35)
						.addComponent(H35))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A36)
						.addComponent(B36)
						.addComponent(C36)
						.addComponent(D36)
						.addComponent(E36)
						.addComponent(F36)
						.addComponent(G36)
						.addComponent(H36))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A37)
						.addComponent(B37)
						.addComponent(C37)
						.addComponent(D37)
						.addComponent(E37)
						.addComponent(F37)
						.addComponent(G37)
						.addComponent(H37))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A38)
						.addComponent(B38)
						.addComponent(C38)
						.addComponent(D38)
						.addComponent(E38)
						.addComponent(F38)
						.addComponent(G38)
						.addComponent(H38))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A39)
						.addComponent(B39)
						.addComponent(C39)
						.addComponent(D39)
						.addComponent(E39)
						.addComponent(F39)
						.addComponent(G39)
						.addComponent(H39))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A40)
						.addComponent(B40)
						.addComponent(C40)
						.addComponent(D40)
						.addComponent(E40)
						.addComponent(F40)
						.addComponent(G40)
						.addComponent(H40))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A41)
						.addComponent(B41)
						.addComponent(C41)
						.addComponent(D41)
						.addComponent(E41)
						.addComponent(F41)
						.addComponent(G41)
						.addComponent(H41))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A42)
						.addComponent(B42)
						.addComponent(C42)
						.addComponent(D42)
						.addComponent(E42)
						.addComponent(F42)
						.addComponent(G42)
						.addComponent(H42))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A43)
						.addComponent(B43)
						.addComponent(C43)
						.addComponent(D43)
						.addComponent(jButton262)
						.addComponent(F43)
						.addComponent(G43)
						.addComponent(H43))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A44)
						.addComponent(B44)
						.addComponent(C44)
						.addComponent(D44)
						.addComponent(E44)
						.addComponent(F44)
						.addComponent(G44)
						.addComponent(H44))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A45)
						.addComponent(B45)
						.addComponent(C45)
						.addComponent(D45)
						.addComponent(E45)
						.addComponent(F45)
						.addComponent(G45)
						.addComponent(H45))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A46)
						.addComponent(B46)
						.addComponent(C46)
						.addComponent(D46)
						.addComponent(E46)
						.addComponent(F46)
						.addComponent(G46)
						.addComponent(H46))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A47)
						.addComponent(B47)
						.addComponent(C47)
						.addComponent(D47)
						.addComponent(E47)
						.addComponent(F47)
						.addComponent(G47)
						.addComponent(H47))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A48)
						.addComponent(B48)
						.addComponent(C48)
						.addComponent(D48)
						.addComponent(E48)
						.addComponent(F48)
						.addComponent(G48)
						.addComponent(H48))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A49)
						.addComponent(B49)
						.addComponent(C49)
						.addComponent(D49)
						.addComponent(E49)
						.addComponent(F49)
						.addComponent(G49)
						.addComponent(H49))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A50)
						.addComponent(B50)
						.addComponent(C50)
						.addComponent(D50)
						.addComponent(E50)
						.addComponent(F50)
						.addComponent(G50)
						.addComponent(H50))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A51)
						.addComponent(B51)
						.addComponent(C51)
						.addComponent(D51)
						.addComponent(E51)
						.addComponent(F51)
						.addComponent(G51)
						.addComponent(H51))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A52)
						.addComponent(B52)
						.addComponent(C52)
						.addComponent(D52)
						.addComponent(E52)
						.addComponent(F52)
						.addComponent(G52)
						.addComponent(H52))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A53)
						.addComponent(B53)
						.addComponent(C53)
						.addComponent(D53)
						.addComponent(E53)
						.addComponent(F53)
						.addComponent(G53)
						.addComponent(H53))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A54)
						.addComponent(B54)
						.addComponent(C54)
						.addComponent(D54)
						.addComponent(E54)
						.addComponent(F54)
						.addComponent(G54)
						.addComponent(H54))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A55)
						.addComponent(B55)
						.addComponent(C55)
						.addComponent(D55)
						.addComponent(E55)
						.addComponent(F55)
						.addComponent(G55)
						.addComponent(H55))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A56)
						.addComponent(B56)
						.addComponent(C56)
						.addComponent(D56)
						.addComponent(E56)
						.addComponent(F56)
						.addComponent(G56)
						.addComponent(H56))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A57)
						.addComponent(B57)
						.addComponent(C57)
						.addComponent(D57)
						.addComponent(E57)
						.addComponent(F57)
						.addComponent(G57)
						.addComponent(H57))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A58)
						.addComponent(B58)
						.addComponent(C58)
						.addComponent(D58)
						.addComponent(E58)
						.addComponent(F58)
						.addComponent(G58)
						.addComponent(H58))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A59)
						.addComponent(B59)
						.addComponent(C59)
						.addComponent(D59)
						.addComponent(E59)
						.addComponent(F59)
						.addComponent(G59)
						.addComponent(H59))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(A60)
						.addComponent(B60)
						.addComponent(C60)
						.addComponent(D60)
						.addComponent(E60)
						.addComponent(F60)
						.addComponent(G60)
						.addComponent(H60))
					.addContainerGap())
		);
		jPanel1.setLayout(gl_jPanel1);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setText("UcusID");
		jLabel1.setFont(new Font("Verdana", Font.ITALIC, 12));
		jLabel1.setBounds(10, 18, 52, 15);
		contentPane_1.add(jLabel1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(72, 17, 96, 19);
		contentPane_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Yolcu Bilgilerini Giriniz", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(808, 46, 248, 137);
		contentPane_1.add(panel);
		
		JLabel lblAd = new JLabel();
		lblAd.setText("Ad");
		lblAd.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblAd.setBounds(10, 24, 15, 19);
		panel.add(lblAd);
		
		JLabel lblTelefonNumarasi = new JLabel();
		lblTelefonNumarasi.setText("Telefon Numarasi");
		lblTelefonNumarasi.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblTelefonNumarasi.setBounds(10, 74, 106, 13);
		panel.add(lblTelefonNumarasi);
		
		JLabel lblSoyad = new JLabel();
		lblSoyad.setText("Soyad");
		lblSoyad.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblSoyad.setBounds(10, 51, 48, 13);
		panel.add(lblSoyad);
		
		JLabel lblNewLabel = new JLabel("Koltuk");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 99, 106, 13);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 49, 87, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 22, 87, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(126, 74, 87, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setForeground(Color.BLACK);
		textField_4.setColumns(10);
		textField_4.setBounds(126, 97, 87, 19);
		panel.add(textField_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Saati Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(808, 192, 248, 137);
		contentPane_1.add(panel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Saat");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_1.setBounds(10, 21, 45, 13);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dakika");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1_2.setBounds(65, 22, 45, 13);
		panel_2.add(lblNewLabel_1_2);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(10, 68, 228, 20);
		panel_2.add(textField_5);
		
		JComboBox<String> comboDept_2 = new JComboBox<String>();
		comboDept_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboDept_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2.setBounds(10, 38, 39, 19);
		panel_2.add(comboDept_2);
		
		JComboBox<String> comboDept_2_1 = new JComboBox<String>();
		comboDept_2_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboDept_2_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_1.setBounds(65, 38, 39, 19);
		panel_2.add(comboDept_2_1);
		
		JButton btnNewButton_3_2 = new JButton("Ok");
		btnNewButton_3_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String saat= comboDept_2.getSelectedItem().toString();
				String dakika= comboDept_2_1.getSelectedItem().toString();
				textField_5.setText("\t"+saat + " : " + dakika);
			}
		});
		btnNewButton_3_2.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_2.setBounds(10, 106, 85, 21);
		panel_2.add(btnNewButton_3_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tarih Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(808, 340, 248, 151);
		contentPane_1.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Gün");
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_1.setBounds(10, 23, 45, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ay");
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_2.setBounds(65, 23, 45, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Yil");
		lblNewLabel_3.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_3.setBounds(120, 23, 45, 13);
		panel_1.add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(10, 80, 228, 33);
		panel_1.add(textField_6);
		
		JComboBox<String> comboDept_2_2 = new JComboBox<String>();
		comboDept_2_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboDept_2_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_2.setBounds(10, 40, 39, 19);
		panel_1.add(comboDept_2_2);
		
		JComboBox<String> comboDept_2_2_1 = new JComboBox<String>();
		comboDept_2_2_1.setModel(new DefaultComboBoxModel(new String[] {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz ", "Agustos ", "Eylul", "Ekim ", "Kasim", "Aralik"}));
		comboDept_2_2_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_2_1.setBounds(55, 40, 62, 19);
		panel_1.add(comboDept_2_2_1);
		
		JComboBox<String> comboDept_2_2_2 = new JComboBox<String>();
		comboDept_2_2_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031"}));
		comboDept_2_2_2.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_2_2.setBounds(120, 40, 55, 19);
		panel_1.add(comboDept_2_2_2);
		
		JButton btnNewButton_3 = new JButton("Ok");
		btnNewButton_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String Gun= comboDept_2_2.getSelectedItem().toString();
				String Ay= comboDept_2_2_1.getSelectedItem().toString();
				String Yil= comboDept_2_2_2.getSelectedItem().toString();
				
				textField_6.setText("\t"+Gun+"/"+Ay+"/"+Yil);
			}
		});
		btnNewButton_3.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3.setBounds(10, 123, 85, 21);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(null, "Adres Bilgilerini Seciniz", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(10, 428, 389, 137);
		contentPane_1.add(panel_1_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Verdana", Font.ITALIC, 10));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(10, 80, 355, 19);
		panel_1_1.add(textField_7);
		
		JComboBox<String> comboDept = new JComboBox<String>();
		comboDept.setModel(new DefaultComboBoxModel(new String[] {"Sabiha Gökçen Havalimanı", "İstanbul Havalimanı", "Konya Havalimanı", "Trabzon Havalimanı", "Zonguldak Havalimanı", "Ordu-Giresun Havalimanı", "Rize-Artvin Havalimanı", "Samsun Çarşamba Havalimanı", "Sinop Havalimanı", "Çanakkale Havalimanı", "Antalya Havalimanı", "Ankara Esenboğa Havalimanı", "Gazipaşa Havalimanı", "Balıkesir Koca Seyit Havalimanı", "Bursa Yenişehir Havalimanı", "Denizli Çardak Havalimanı", "Erzurum Havalimanı", "Gaziantep Havalimanı", "Isparta Süleyman Demirel Havalimanı", "Adnan Menderes Havalimanı", "Kars Harakani Havalimanı", "Malatya Havalimanı", "Düzce Havalimanı"}));
		comboDept.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept.setBounds(10, 47, 170, 19);
		panel_1_1.add(comboDept);
		
		JLabel lblNewLabel_4 = new JLabel("Gidilecek Havalimani");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_4.setBounds(10, 24, 130, 13);
		panel_1_1.add(lblNewLabel_4);
		
		JComboBox<String> comboDept_1 = new JComboBox<String>();
		comboDept_1.setModel(new DefaultComboBoxModel(new String[] {"Sabiha Gökçen Havalimanı", "İstanbul Havalimanı", "Konya Havalimanı", "Trabzon Havalimanı", "Zonguldak Havalimanı", "Ordu-Giresun Havalimanı", "Rize-Artvin Havalimanı", "Samsun Çarşamba Havalimanı", "Sinop Havalimanı", "Çanakkale Havalimanı", "Antalya Havalimanı", "Ankara Esenboğa Havalimanı", "Gazipaşa Havalimanı", "Balıkesir Koca Seyit Havalimanı", "Bursa Yenişehir Havalimanı", "Denizli Çardak Havalimanı", "Erzurum Havalimanı", "Gaziantep Havalimanı", "Isparta Süleyman Demirel Havalimanı", "Adnan Menderes Havalimanı", "Kars Harakani Havalimanı", "Malatya Havalimanı", "Düzce Havalimanı"}));
		comboDept_1.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_1.setBounds(195, 47, 170, 19);
		panel_1_1.add(comboDept_1);
		
		JButton btnNewButton_3_1 = new JButton("Ok");
		btnNewButton_3_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ilk= comboDept.getSelectedItem().toString();
				String ikinci= comboDept_1.getSelectedItem().toString();
				textField_7.setText(ilk + " ---> " + ikinci);
			}
		});
		btnNewButton_3_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_1.setBounds(10, 109, 85, 21);
		panel_1_1.add(btnNewButton_3_1);
		
		textField.setText(randomsayi);
			
		JButton btnNewButton_1 = new JButton("Geri");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RezerveKoltuk r = new RezerveKoltuk();
				r.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.ITALIC, 12));
		btnNewButton_1.setBounds(10, 597, 85, 21);
		contentPane_1.add(btnNewButton_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(Color.WHITE);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Kabin Sinifi", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBounds(409, 428, 248, 137);
		contentPane_1.add(panel_2_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(10, 76, 228, 20);
		panel_2_1.add(textField_8);
		
		JComboBox<String> comboDept_2_3 = new JComboBox<String>();
		comboDept_2_3.setModel(new DefaultComboBoxModel(new String[] {"Yetiskin", "Cocuk"}));
		comboDept_2_3.setFont(new Font("Verdana", Font.ITALIC, 10));
		comboDept_2_3.setBounds(10, 47, 85, 19);
		panel_2_1.add(comboDept_2_3);
		
		JSpinner jSpinDay = new JSpinner();
		jSpinDay.setModel(new SpinnerListModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		jSpinDay.setBounds(129, 47, 39, 20);
		panel_2_1.add(jSpinDay);
		
		JButton btnNewButton_3_2_1 = new JButton("Ok");
		btnNewButton_3_2_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ilk= comboDept_2_3.getSelectedItem().toString();
				String value = (String) jSpinDay.getValue();
				textField_8.setText(value+" "+ilk);
			}
		});
		btnNewButton_3_2_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		btnNewButton_3_2_1.setBounds(10, 106, 85, 21);
		panel_2_1.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_2 = new JButton("Ileri");
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ilk= comboDept_2_3.getSelectedItem().toString();
				String value = (String) jSpinDay.getValue();
				String Sinif = "Ekonomi Class";
				String Koltuk = textField_4.getText();
				String Ad =  textField_2.getText();
				String Soyad = textField_1.getText();
				String TelefonNumarasi = textField_3.getText();
				String UcusID = textField.getText();
				String Tarih = textField_6.getText();
				String Kalkis_Gidis = textField_7.getText();
				String Saat = textField_5.getText(); 
				String Kabin_Sinifi = ilk;
				String Adet = value;
				Kayit k = new Kayit();
				try 
				{
					k.KayitEkleme(Sinif, Koltuk, Ad, Soyad, TelefonNumarasi, UcusID, Tarih, Kalkis_Gidis, Saat,Kabin_Sinifi,Adet);
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				JOptionPane jf=new JOptionPane();
				jf.showMessageDialog(frame, "Bilgileriniz basari ile kayit edildi.");
				
				try 
				{
					Ara_gecis a = new Ara_gecis();
					a.setVisible(true);
					setVisible(false);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.ITALIC, 12));
		btnNewButton_2.setBounds(971, 597, 85, 21);
		contentPane_1.add(btnNewButton_2);
		
	}
}
