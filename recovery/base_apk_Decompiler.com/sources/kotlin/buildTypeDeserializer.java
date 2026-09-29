package kotlin;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public interface buildTypeDeserializer {
    public static final buildTypeDeserializer write = new AsWrapperTypeDeserializer();

    long AudioAttributesCompatParcelizer();

    long IconCompatParcelizer();

    long RemoteActionCompatParcelizer();

    long read();

    _usesExternalId read(Looper looper, Handler.Callback callback);
}
