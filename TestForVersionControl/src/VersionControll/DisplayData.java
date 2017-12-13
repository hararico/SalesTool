package VersionControll;

public class DisplayData {
	int[] data = {1, 2, 3, 4};
	
	public void display(){
		for(int da : data)
			System.out.println(" print Data  " + da);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayData display = new DisplayData();
		display.display();
		System.out.println("Test for Version control");
	}

}
