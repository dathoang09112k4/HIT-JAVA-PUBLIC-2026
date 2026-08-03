package app;

import model.ElectronicToy;
import model.PlushToy;
import model.Toy;

public class Main {
	public static void main(String[] args) {
		Toy[] toys = new Toy[3];
		toys[0]= new Toy("01","Xếp hình",20000,100);
		toys[1]= new ElectronicToy("02","Robot",40000,200,12);
		toys[2]= new PlushToy("03","Gấu bông",30000,150,"Bông gòn");
		
		for(int i=0; i<toys.length; i++) {
			toys[i].printInfo();
		}
	}
}
