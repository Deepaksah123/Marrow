package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TestScoreRSModel {
    public abstract boolean AudioAttributesCompatParcelizer();

    public abstract int IconCompatParcelizer();

    public abstract int RemoteActionCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract boolean read();

    public abstract void write();

    public static TestScoreRSModel IconCompatParcelizer(Context context) {
        return new getTestTitle(context);
    }
}
