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

   private int transID;
   private String infoID, brgyDocs, time;
   
   public history (int transID, String infoID, String brgyDocs, String time){
       this.transID = transID;
       this.infoID = infoID;
       this.brgyDocs = brgyDocs;
       this.time = time;       
   }
   
    public int getTransId() {
       return transID;
    }
       
    public void setTransId(int trans) {
       transID = trans;
    }
    
    public String getInfoID() {
        return infoID;
    }
    
    public void setInfoId(String info) {
        infoID = info;
    }
    
    public String getBrgyDocs() {
        return brgyDocs;
    }
    
    public void setBrgyDocs(String docs) {
        brgyDocs = docs;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String oras) {
        time = oras;
    }
}
