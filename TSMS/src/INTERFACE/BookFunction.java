package INTERFACE;

public interface BookFunction {
	//¼��
	public boolean BookMessage_enter(String ISBN,String name,String press,String author,double price);			
	public String BookMessage_inquire(String name);			//��ѯ
	public boolean BookMessage_alter(String name,String change);			//�޸�
	public String CheckBook();					//
}
