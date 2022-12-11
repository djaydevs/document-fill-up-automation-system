/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author joshua
 */
public class history {

   private int transID, infoID;
   private String brgyDocs, date, time;
   
   public history (int transID, int infoID, String brgyDocs, String date, String time){
       this.transID = transID;
       this.infoID = infoID;
       this.brgyDocs = brgyDocs;
       this.date = date;
       this.time = time;       
   }
   
    public int getTransId() {
       return transID;
    }
       
    public void setTransId(int trans) {
       transID = trans;
    }
    
    public int getInfoID() {
        return infoID;
    }
    
    public void setInfoId(int info) {
        infoID = info;
    }
    
    public String getBrgyDocs() {
        return brgyDocs;
    }
    
    public void setBrgyDocs(String docs) {
        brgyDocs = docs;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String petsa) {
        date = petsa;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String oras) {
        time = oras;
    }
}
