package INTERFACE;

public interface BookFunction {
	//¼��
	public void BookMessage_enter(String ISBN,String name,String press,String author,double price);			
	public String BookMessage_inquire(String name);			//��ѯ
	public void BookMessage_alter(String name,String change);			//�޸�
	public void CheckBook();					//
}
