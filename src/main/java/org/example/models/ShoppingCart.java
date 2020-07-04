package org.example.models;

import java.util.HashSet;
import java.util.Set;
import org.example.models.Work;

public class ShoppingCart {
    private Set<Work> items=new HashSet<>();

	public Set<Work> getItems() {
		return items;
	}

	public void setItems(Set<Work> items) {
		this.items = items;
	}
    
	public void add(Work work) {
		items.add(work);
	}   
    
}
