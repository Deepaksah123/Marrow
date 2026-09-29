package kotlin;

import android.content.Context;
import java.io.IOException;
import kotlin.NullSerializer;
import kotlin._ensureOverride;
import kotlin._notNullClass;

/* JADX INFO: loaded from: classes2.dex */
public final class _findSerializer implements _ensureOverride.IconCompatParcelizer {
    private int AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;

    @Deprecated
    public _findSerializer() {
        this.AudioAttributesCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = true;
        this.IconCompatParcelizer = null;
    }

    public _findSerializer(Context context) {
        this.IconCompatParcelizer = context;
        this.AudioAttributesCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // o._ensureOverride.IconCompatParcelizer
    public final _ensureOverride IconCompatParcelizer(_ensureOverride.write writeVar) throws IOException {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && read()) {
            int iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(writeVar.read.onPlayFromUri);
            StringBuilder sb = new StringBuilder("Creating an asynchronous MediaCodec adapter for track type ");
            sb.append(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver(iIconCompatParcelizer));
            prune.write("DMCodecAdapterFactory", sb.toString());
            _notNullClass.write writeVar2 = new _notNullClass.write(iIconCompatParcelizer);
            writeVar2.write(this.RemoteActionCompatParcelizer);
            return writeVar2.IconCompatParcelizer(writeVar);
        }
        return new NullSerializer.AudioAttributesCompatParcelizer().IconCompatParcelizer(writeVar);
    }

    private boolean read() {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 31) {
            return true;
        }
        return this.IconCompatParcelizer != null && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 28 && this.IconCompatParcelizer.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
