package INTERFACE;

public interface BookFunction {
	//Â¼Èë
	public boolean BookMessage_enter(String ISBN,String name,String press,String author,double price);			
	public String BookMessage_inquire(String name);			//²éÑ¯
	public boolean BookMessage_alter(String name,String change);			//ÐÞ¸Ä
	public String CheckBook();					//
}
