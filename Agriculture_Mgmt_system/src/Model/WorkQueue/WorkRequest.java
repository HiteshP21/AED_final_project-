/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Hitesh
 */
public class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    
    
    private String status;
    private Date requestDate;
    
    
    private Date resolveDate;
    private int harvestQty;
    
    
    
    private int primItemQty;

    public int getPrimItemQty() {
        return primItemQty;
    }

    public void setPrimItemQty(int primItemQty) {
        this.primItemQty = primItemQty;
    }

    public int getHarvestQty() {
        return harvestQty;
    }

    public void setHarvestQty(int harvestQty) {
        this.harvestQty = harvestQty;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }    
    
    
    
    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }
    
    
        public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }
    

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }



    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString()
    {
        return message;
    }    
    
}
