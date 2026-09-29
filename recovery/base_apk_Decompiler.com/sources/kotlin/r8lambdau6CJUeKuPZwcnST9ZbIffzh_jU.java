package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU<T> implements setMimeType<T> {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    private T AudioAttributesCompatParcelizer;

    @Override // kotlin.setMimeType
    public final void MediaBrowserCompatCustomActionResultReceiver() {
    }

    @Override // kotlin.setMimeType
    public final int write() {
        return 1;
    }

    public r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU(T t) {
        this.AudioAttributesCompatParcelizer = (T) moveMediaSource.AudioAttributesCompatParcelizer(t);
    }

    @Override // kotlin.setMimeType
    public final Class<T> read() {
        return (Class<T>) this.AudioAttributesCompatParcelizer.getClass();
    }

    @Override // kotlin.setMimeType
    public final T RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static int IconCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 7028653;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        RemoteActionCompatParcelizer = i3;
        return i3;
    }
}
