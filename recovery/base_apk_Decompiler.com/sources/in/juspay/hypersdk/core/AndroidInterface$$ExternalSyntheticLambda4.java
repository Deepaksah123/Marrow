package in.juspay.hypersdk.core;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidInterface$$ExternalSyntheticLambda4 implements Runnable {
    public static int IconCompatParcelizer;
    public static int write;
    public final /* synthetic */ AndroidInterface f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ AndroidInterface$$ExternalSyntheticLambda4(AndroidInterface androidInterface, String str, int i, String str2) {
        this.f$0 = androidInterface;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = str2;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = write;
        int i2 = i % 5756772;
        write = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        IconCompatParcelizer = iElapsedRealtime;
        return iElapsedRealtime;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.m292lambda$toggleKeyboard$13$injuspayhypersdkcoreAndroidInterface(this.f$1, this.f$2, this.f$3);
    }
}
