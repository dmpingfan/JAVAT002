
public class T{
	static{
		System.loadLibrary("T");
	}
	public native String sendMessage();
	
	public native String changeMessage(String s);
	
	public static void main(String[] args){
		String mMessage="Start";
		String mResult="";
		System.out.println("before change "+mMessage);
		mResult=new T().changeMessage(mMessage);
		System.out.println("Result is"+mResult);
		System.out.println("after change "+mMessage);
	}
}
