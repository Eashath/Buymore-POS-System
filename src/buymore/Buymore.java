/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buymore;

/**
 *
 * @author ICTSTUDENT
 */
public class Buymore {
    String productid;
    String productname;
    String productcompanyname;
    String productunitprice;
    String productqty;
    String productnormalprice;
    String productwholessaleprice;
    String purchesedate;
    
    public Buymore(String productid,String productname,String productcompanyname,String productunitprice,String productqty,String productnormalprice,String productwholessaleprice,String purchesedate)
    {
        this.productid=productid;
        this.productname=productname;
        this.productcompanyname=productcompanyname;
        this.productunitprice=productunitprice;
        this.productqty=productqty;
        this.productnormalprice=productnormalprice;
        this.productwholessaleprice=productwholessaleprice;
        this.purchesedate=purchesedate;
    }
    
    public String getproductid()
    {
        return productid;
    }
    public String getproductname()
    {
        return productname;
    }
    public String getproductcompanyname()
    {
        return productcompanyname;
    }
    public String getproductunitprice()
    {
        return productunitprice;
    }
    public String getproductqty()
    {
        return productqty;
    }
    public String getproductnormalprice()
    {
        return productnormalprice;
    }
    public String getproductwholessaleprice()
    {
        return productwholessaleprice;
    }
    public String getpurchesedate()
    {
        return purchesedate;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        salespage main=new salespage();
        main.setVisible(true);
        
    }
    
}
