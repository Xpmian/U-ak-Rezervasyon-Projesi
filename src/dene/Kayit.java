package dene;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Kayit 
{
		static Connection conn;
		static Statement s;
		static ResultSet yap() throws SQLException 
		{
			ResultSet myrs=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			s=conn.createStatement();
			myrs=s.executeQuery("SELECT * FROM new_table");		
			return myrs;
		}
		public static ResultSet Ucus() throws SQLException 
		{
			ResultSet myrs1=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			s=conn.createStatement();
			myrs1=s.executeQuery("SELECT * FROM bilgiler");			
			return myrs1;
		}
		public static void KayitOl(String KullaniciAdi,String Sifre) throws SQLException 
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			Statement s=conn.createStatement(); 
            String sorgu=String.format("insert into new_table values('%s','%s')",KullaniciAdi,Sifre);
            int ekleme = s.executeUpdate(sorgu);
		}
		public static void KayitEkle(String Ad,String Soyad,String TelefonNumarasi) throws SQLException 
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			Statement s=conn.createStatement(); 
            String sorgu=String.format("insert into new_table values('%s','%s','%s')",Ad,Soyad,TelefonNumarasi);
            int ekleme = s.executeUpdate(sorgu);
		}
		public static void KayitEkleme(String Sinif,String Koltuk,String Ad,String Soyad,String TelefonNumarasi,String UcusID,String Tarih,String Kalkis_Gidis,String Saat,String Kabin_Sinifi,String Adet) throws SQLException 
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			Statement s=conn.createStatement(); 
            String sorgu=String.format("insert into bilgiler values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')",Sinif,Koltuk,Ad,Soyad,TelefonNumarasi,UcusID,Tarih,Kalkis_Gidis,Saat,Kabin_Sinifi,Adet);
            int ekleme = s.executeUpdate(sorgu);
		}
		public static void KartBilgileriEkle(String KartSahibi,String KartNumarasi,String Cvc,String Ay,String Yil) throws SQLException 
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			Statement s=conn.createStatement(); 
            String sorgu=String.format("insert into kartbilgileri values('%s','%s','%s','%s','%s')",KartSahibi,KartNumarasi,Cvc,Ay,Yil);
            int ekleme = s.executeUpdate(sorgu);
		}
		public static void sil(String a) throws SQLException
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			Statement st=conn.createStatement();			
			String sorgu=String.format("delete from bilgiler where UcusID=%s",a);
	        int silme = st.executeUpdate(sorgu);
		}
		public static ResultSet bul(String sql) throws SQLException 
		{
			ResultSet myrs1=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			s=conn.createStatement();
			myrs1=s.executeQuery(sql);
			return myrs1;
		}
		public static ResultSet BilgileriGetir(String a) throws SQLException
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			Statement st=conn.createStatement();			
			String sorgu=String.format("select * from bilgiler where UcusID = %s",a);
	        ResultSet getirme = st.executeQuery(sorgu);
			return getirme;
		}
		public static ResultSet OdemeBilgileriGetir(String a) throws SQLException
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			Statement st=conn.createStatement();			
			String sorgu=String.format("select * from bilgiler where UcusID = %s",a);
	        ResultSet getirme = st.executeQuery(sorgu);
			return getirme;
		}
		public static ResultSet YolcuBilgileri() throws SQLException
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			Statement st=conn.createStatement();			
			String sorgu=String.format("select * from bilgiler");
	        ResultSet getirme = st.executeQuery(sorgu);
			return getirme;
		}
	}