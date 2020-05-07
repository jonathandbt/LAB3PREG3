
package pe.edu.pucp.congresoft.config;


public class DBManager {
    public String url;
    public String username;
    public String password;
    
    public DBManager(){
        this.url="jdbc:mysql://"+
                    "lp2mysql.c8u9uevhhffp.us-east-1.rds.amazonaws.com"
            + ":3306/inf282";
        this.username="admin";
        this.password="ABCD1234";
    }
}
