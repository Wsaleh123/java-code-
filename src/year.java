public class year {
	private int year_private;
	
	public static void main(String[] args) {
		year tester = new year();
        System.out.println("1800 is false: "+tester.isLeapYear(1800));
        System.out.println("1900 is false: "+tester.isLeapYear(1900));
        System.out.println("1994 is false: "+tester.isLeapYear(1994));
        System.out.println("1998 is false: "+tester.isLeapYear(1998));
        System.out.println("1999 is false: "+tester.isLeapYear(1999));
        System.out.println("2000 is true: "+ tester.isLeapYear(2000));
        System.out.println("2001 is false: "+ tester.isLeapYear(2001));
        System.out.println("2004 is true: " + tester.isLeapYear(2004));
        System.out.println("2100 is false: " + tester.isLeapYear(2100));
        System.out.println("4 is true: " + tester.isLeapYear(4));
	}
	public year() {
		
	}
	
	public boolean div(int num) {
		if(year_private%num == 0)
			return true;
		else
			return false;
	}

	
	public boolean isLeapYear(int year) {
		year_private = year;
		
		if (div(400)) 
			return true;
		else if(div(4))
			return true;
		else if(div(100))
			return false;
		else
			return false;
		
	}
	

}

/*
1800 is false: true
1900 is false: true
1994 is false: false
1998 is false: false
1999 is false: false
2000 is true: true
2001 is false: false
2004 is true: true
2100 is false: true
4 is true: true
*/