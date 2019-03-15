
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rowan
 */
public class ATM implements myatm{
    CLIENT c ;
    int cnt=0 ;
    String password ;
    double currentbalance ;
     ArrayList<String> History = new ArrayList<String>();
    
    public boolean login (String password){
        return this.password.equals(password);
        
       }
    
    public void  account (String a ,double b )
    {
        password = a;
        currentbalance = b;
        
    }

        
    public ATM(CLIENT c) {
        this.c = c;
    }

    
    @Override
    public String getCurrentBalance() {
        return c.getBalance()+"";
    }

    @Override
    public void withdaw(String amount) {
        double x = Double.parseDouble(amount);
        if (c.getBalance() > x){
            double current = c.getBalance();
            c.setBalance(current - x);
            History.add("withdrawn" +amount);
            cnt++ ;
            
        }
    }

    @Override
    public void deposit(String amount) {
        
        double o = Double.parseDouble(amount);
        
            double currentbalance = c.getBalance();
            c.setBalance(currentbalance + o);
            History.add("added" +amount);
            cnt++ ;
    }

    @Override
    public String prev() {
        
       if(cnt == 0){
           
           return ("NO PREV ACTIONS");
          
       }return History.get(--cnt);
    }

    @Override
    public String next() {
        
       if(cnt == History.size()-1){
           
           return ("NO MORE");
       }return History.get(++cnt);
    }
    
    
}
