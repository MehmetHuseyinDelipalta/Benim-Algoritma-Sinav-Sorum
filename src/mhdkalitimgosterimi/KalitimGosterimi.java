
package mhdkalitimgosterimi;

class bisiklet{
    public int hiz;
    public int vites;
    public bisiklet (int hiz, int vites)
    {
        this.hiz=hiz;
        this.vites=vites;
    }
public void hizDusur(int dusurulecekHiz)
{
    hiz=hiz-dusurulecekHiz;
    
}
 public void hizYukselt (int yukseltilecekHiz)
 {
     hiz=hiz+yukseltilecekHiz;
 }
 
 public String toString()
 {
     return ("Bisiklet vitesi= "+ vites +"\n" + "Hızı= " +hiz);
 }
 
}

class bisikletYap extends bisiklet
        
{
    private int koltugYuksekligi;

    public bisikletYap(int hiz, int vites, int baslangicYuksekligi)
    {
        super(hiz, vites);
        koltugYuksekligi= baslangicYuksekligi;
    }
    
    private void yukseklikGir (int yeniDeger)
    {
        koltugYuksekligi=yeniDeger;
            }
    
    public String toString()
    {
        return (super.toString()+"\n" + "koltuk yüksekliği="+ koltugYuksekligi);
    }
   
}  

        
public class MhdKalitimGosterimi {

    
    public static void main(String[] args) 
    {
        bisikletYap bs=new bisikletYap (60,18,3);
        System.out.print(bs.toString());
    }
    
}
