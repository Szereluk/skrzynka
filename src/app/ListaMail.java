/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.LinkedList;

/**
 *
 * @author Patryk
 */
public class ListaMail {
   protected LinkedList<Email> maile; 

    public ListaMail() {
        maile = new LinkedList<>();
    }
   
   public void dodaj_mail(Email e)
   {
       maile.add(e);
   }
   
   public String[] getTit()
   {
       String [] pom = new String[maile.size()];
       
       int i =0;
       
       for (Email e : maile) {
            pom[i++] = e.getInfo();
        }
      return pom; 
   }
   
   public String getSzczegoly(int idx){
   
   return maile.get(idx).getOpis();
   
    }
   
   public void Usun(int index)
   {
       
       
       maile.remove(index);
   }
   
   
}
