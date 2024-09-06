package ir.freeland.springboot.relation.onetoone.foreignkeybased;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "corrupteditem")

public class corrupteditem {
	
	
	 @Column(name = "reason")
	    private String reason;
	 @OneToOne(cascade = CascadeType.ALL) //There will be a unique constraint 
	    @JoinColumn(name = "corrupteditem_name", referencedColumnName = "item")
	    private item item;
	    
	    
	    
	    public String getreason() {
	        return reason;
	    }

	    public void setreason(String reason) {
	        this.reason = reason;
	    }

}
