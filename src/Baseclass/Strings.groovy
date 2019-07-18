package Baseclass

class Strings {

	String firststring;
	String secondstring;
	String thirdstring;
	
	static main(args) 
	{
		Strings obj = new Strings();
		obj.concatstring();
	}
	
	void concatstring()
	{
		firststring = "Koushick";
		secondstring = "Sudharasanam";
		
		thirdstring = firststring+secondstring;
		
		println(thirdstring);
	}

}
