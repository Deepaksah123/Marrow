package kotlin;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class hasMoreTokens extends _hasNullKey {
    public final boolean AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;

    public hasMoreTokens(Throwable th, _writeNullKeyedEntry _writenullkeyedentry, Surface surface) {
        super(th, _writenullkeyedentry);
        this.IconCompatParcelizer = System.identityHashCode(surface);
        this.AudioAttributesCompatParcelizer = surface == null || surface.isValid();
    }
}
