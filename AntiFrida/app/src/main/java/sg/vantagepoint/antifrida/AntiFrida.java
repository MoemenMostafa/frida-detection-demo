package sg.vantagepoint.antifrida;

import android.content.Context;

public class AntiFrida {

    private final Context mContext;
    private boolean loggingEnabled = true;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public AntiFrida(Context context) {
        mContext = context;
        init();
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native void init();
}
