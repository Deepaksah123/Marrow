package in.juspay.hypersdk.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;

/* JADX INFO: loaded from: classes4.dex */
public class GodelServiceConnection implements ServiceConnection {
    public static int IconCompatParcelizer = 0;
    public static int RemoteActionCompatParcelizer = 0;
    private static final String TAG = "GodelServiceConnection";
    private final JuspayServices juspayServices;
    boolean isBound = false;
    private Messenger messenger = null;
    private Message pendingMsg = null;

    GodelServiceConnection(JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            StringBuilder sb = new StringBuilder("Successfully connected to ");
            sb.append(componentName.getPackageName());
            sb.append("/");
            sb.append(componentName.getClassName());
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.GODEL_SERVICE_CONNECTION, "gsc_on_service_connected", sb.toString());
            this.messenger = new Messenger(iBinder);
            this.isBound = true;
            request(this.pendingMsg);
        } catch (Exception e) {
            sdkTracker.trackAndLogException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.MPIN_UTIL, "Exception while trying to send message", e);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.messenger = null;
        this.isBound = false;
    }

    public void request(int i, Bundle bundle, Handler handler) throws RemoteException {
        this.juspayServices.getSdkTracker().trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.GODEL_SERVICE_CONNECTION, "gsc_request", "Sending request to MPIN SDK");
        Message messageObtain = Message.obtain((Handler) null, i);
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(handler);
        request(messageObtain);
    }

    public void request(Message message) throws RemoteException {
        if (this.isBound) {
            this.messenger.send(message);
        } else {
            this.pendingMsg = message;
        }
    }

    public static int write() {
        int i = IconCompatParcelizer;
        int i2 = i % 7280947;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        RemoteActionCompatParcelizer = i3;
        return i3;
    }
}
