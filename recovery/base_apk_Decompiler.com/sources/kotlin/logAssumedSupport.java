package kotlin;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class logAssumedSupport implements Continuation {
    public static int RemoteActionCompatParcelizer;
    public static int read;

    public static int RemoteActionCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 7193001;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        read = iMaxMemory;
        return iMaxMemory;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return isTunneling.IconCompatParcelizer();
    }
}
