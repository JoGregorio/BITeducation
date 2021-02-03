package chapter08.multiImplements;

import java.util.Vector;

public class Shop {
	protected Vector store = new Vector();//가게에물건의갯수를알수있는메서드
	public int getCount(){
		return store.size();}
}
