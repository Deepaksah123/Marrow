package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class AsWrapperTypeDeserializer implements buildTypeDeserializer {
    protected AsWrapperTypeDeserializer() {
    }

    @Override // kotlin.buildTypeDeserializer
    public final long IconCompatParcelizer() {
        return System.currentTimeMillis();
    }

    @Override // kotlin.buildTypeDeserializer
    public final long RemoteActionCompatParcelizer() {
        return SystemClock.elapsedRealtime();
    }

    @Override // kotlin.buildTypeDeserializer
    public final long AudioAttributesCompatParcelizer() {
        return SystemClock.uptimeMillis();
    }

    @Override // kotlin.buildTypeDeserializer
    public final long read() {
        return System.nanoTime();
    }

    @Override // kotlin.buildTypeDeserializer
    public final _usesExternalId read(Looper looper, Handler.Callback callback) {
        return new _deserializeTypedUsingDefaultImpl(new Handler(looper, callback));
    }
}
