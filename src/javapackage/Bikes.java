package javapackage;

public class Bikes implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bikes obj = new Bikes();
obj.Brake();
obj.clutch();
obj.gear();
obj.silencer();
	}

	@Override
	public void Brake() {
	        System.out.println("Bikes have brake");
		
	}

	@Override
	public void clutch() {
		
		System.out.println("Bikes have clutch");
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have gear");
	}

	@Override
	public void silencer() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have silencer");
	}

}
