class TestQue26{
	public static void main(String args[]){
		ICallable ic = new SmartPhone();
		ic.makeCall("98987493");
		
		IMessaging im = new SmartPhone();
		im.sendMessage(48989833,"hello world");
		
		Iinternet in = new SmartPhone();
		in.browser("www.dreamland.com");
	}
}

interface ICallable {
	public void makeCall(String call);
}

interface IMessaging{
	public void sendMessage(long no, String msg);

}

interface Iinternet{
	public void browser(String website);
}

class SmartPhone implements ICallable,IMessaging,Iinternet{
		
		public void makeCall(String call){
			System.out.println("calling - "+call);
		}
		public void sendMessage(long no, String msg){
		System.out.println("sending message - "+no+", message - "+msg);
		}
		public void browser(String website){
			
			System.out.println("Browser website - "+website);	
		}

	
}