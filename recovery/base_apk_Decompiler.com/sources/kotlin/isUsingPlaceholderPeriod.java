package kotlin;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class isUsingPlaceholderPeriod {
    private final float AudioAttributesCompatParcelizer;
    private Typeface IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public isUsingPlaceholderPeriod(String str, String str2, String str3, float f) {
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.read = str3;
        this.AudioAttributesCompatParcelizer = f;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final Typeface read() {
        return this.IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(Typeface typeface) {
        this.IconCompatParcelizer = typeface;
    }
}
