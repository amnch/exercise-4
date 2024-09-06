package ir.freeland.springboot.relation.onetoone.foreignkeybased;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")

public class item {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "itemname")
    private String itemname;
    @Column(name = "price")
    private Long price;
    @Column(name="category")
    private String category;

    @OneToOne(mappedBy = "name") 
    private corrupteditem corrupteditem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getitemname() {
        return itemname;
    }

    
    
    public void setitemname(String itemname) {
        this.itemname = itemname;
    }

    public String getcategory() {
        return category;
    }

    
    
    public void setcategory(String category) {
        this.category = category;
    }
	

    public long getprice() {
        return price;
    }

    
    
    public void setprice(Long price) {
        this.price = price;
    }
	
}
