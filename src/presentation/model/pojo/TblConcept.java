package presentation.model.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * TblConcept generated by hbm2java
 */
public class TblConcept  implements java.io.Serializable {


     private Integer conId;
     private String conName;
     private String conDesc;
     private Boolean conStatus;
     private Set tblTransactions = new HashSet(0);

    public TblConcept() {
    }

	
    public TblConcept(String conName) {
        this.conName = conName;
    }
    public TblConcept(String conName, String conDesc, Boolean conStatus, Set tblTransactions) {
       this.conName = conName;
       this.conDesc = conDesc;
       this.conStatus = conStatus;
       this.tblTransactions = tblTransactions;
    }
   
    public Integer getConId() {
        return this.conId;
    }
    
    public void setConId(Integer conId) {
        this.conId = conId;
    }
    public String getConName() {
        return this.conName;
    }
    
    public void setConName(String conName) {
        this.conName = conName;
    }
    public String getConDesc() {
        return this.conDesc;
    }
    
    public void setConDesc(String conDesc) {
        this.conDesc = conDesc;
    }
    public Boolean getConStatus() {
        return this.conStatus;
    }
    
    public void setConStatus(Boolean conStatus) {
        this.conStatus = conStatus;
    }
    public Set getTblTransactions() {
        return this.tblTransactions;
    }
    
    public void setTblTransactions(Set tblTransactions) {
        this.tblTransactions = tblTransactions;
    }
}


