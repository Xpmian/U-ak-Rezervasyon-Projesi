package dene;

public class Koltuk 
{
	private String KoltukID;    
	private boolean Durum;
	public Koltuk(String koltukID, boolean durum) 
	{
		KoltukID = koltukID;
		Durum = durum;
	}
	public void setKoltukID(String KoltukID) 
	{
        if(KoltukID.matches("[a-zA-Z0-9]+$") && KoltukID.length()==3)
        {
            this.KoltukID = KoltukID.toUpperCase();
        }
        else
        {
            System.out.println("Gecersiz Airline ID");
        }        
        this.KoltukID = KoltukID;
    }
	public void setStatus(boolean Durum) 
	{
        this.Durum = Durum;
    }
	public String getKoltukID() 
	{       
        return KoltukID;
    }

    public boolean isDurum() 
    {
       return Durum;
    }
    @Override
    public String toString() 
    {
        return this.getKoltukID() + "\t" + this.isDurum();
    }
}
