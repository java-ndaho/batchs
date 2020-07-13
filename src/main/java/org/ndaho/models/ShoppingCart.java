package org.ndaho.models;

import java.util.HashSet;
import java.util.Set;

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
