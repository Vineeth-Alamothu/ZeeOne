class Demo
{
	public static void main(String[] args) {
		float km = 20;
		double mts,ft,inch,cm;
		
		mts = km*1000;
		cm = mts*100;
		inch = cm/2.54;
		ft = inch/12;
		
		System.out.println("mts "+mts + " cm "+cm+ " inch "+inch+" ft "+ft);
	}
}
