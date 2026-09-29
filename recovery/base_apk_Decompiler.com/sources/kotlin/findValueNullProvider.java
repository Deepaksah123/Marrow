package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class findValueNullProvider {
    private final Context read;

    private findValueNullProvider(Context context) {
        this.read = context;
    }

    public static findValueNullProvider RemoteActionCompatParcelizer(Context context) {
        return new findValueNullProvider(context);
    }
}
