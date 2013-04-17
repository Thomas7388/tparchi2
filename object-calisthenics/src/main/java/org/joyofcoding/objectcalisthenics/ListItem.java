package org.joyofcoding.objectcalisthenics;

import java.awt.List;
import java.util.ArrayList;

public class ListItem extends ArrayList<Item>{
	
	public ListItem() {
		super();
	}
	
	public Item getItem(int index){
		return this.get(index);
	}
	
//	public boolean add(Item item){
//		return this.add(item);
//	}

}
