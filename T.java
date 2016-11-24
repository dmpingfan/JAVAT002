
public class T{
	static{
		System.loadLibrary("T");
	}
	public native String sendMessage(int rv);
	
	public native String changeMessage(String s, int rv);
	
	public native String[] getMessage(int rv);
	
	public native String[] setMessage(String sendMessage1, String sendMessage2, int rv);
	
	public native String[] checkMessage(String[] sMessage, int rv);
	
	public native void cleanMessage(String[] sMessage, int rv);
	
	public static void main(String[] args){
		int rv=0;
		String sendMessage1="heihei";
		String sendMessage2="haha";
		String[] strList=new T().setMessage(sendMessage1,sendMessage2,rv);
		for(int i=0; i<strList.length; i++){
			System.out.println(strList[i]+" "+rv);
		}
		String[] strReturn=new T().checkMessage(strList,rv);
		for(int i=0; i<strReturn.length; i++){
			System.out.println(strReturn[i]+" "+rv);
		}
		new T().cleanMessage(strReturn,rv);
	}
}