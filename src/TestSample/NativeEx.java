package TestSample;

public class NativeEx {
	 // Declare a native method
    public native void printMessage();

    // Load the native library
    static {
        System.loadLibrary("NativeLib"); // Load the native library (e.g., NativeLib.dll or libNativeLib.so)
    }

    public static void main(String[] args) {
        NativeEx example = new NativeEx();
        example.printMessage(); // Call the native method
    }
}
