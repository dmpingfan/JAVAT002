
"# JAVAT002" 

#purpose: for create a nice interface for an excellent project

#especially look at the variable rv, it just for debugging in order to get the error reason

public native String sendMessage(int rv);

public native String changeMessage(String s, int rv);

public native String[] getMessage(int rv);

public native String[] setMessage(String sendMessage1, String sendMessage2, int rv);

public native String[] checkMessage(String[] sMessage, int rv);

public native void cleanMessage(String[] sMessage, int rv);
