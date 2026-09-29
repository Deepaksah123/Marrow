package kotlin;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public class _hasNullKey extends SimpleModule {
    public final _writeNullKeyedEntry RemoteActionCompatParcelizer;
    public final String read;
    public final int write;

    public _hasNullKey(Throwable th, _writeNullKeyedEntry _writenullkeyedentry) {
        int iAudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(_writenullkeyedentry == null ? null : _writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver);
        super(sb.toString(), th);
        this.RemoteActionCompatParcelizer = _writenullkeyedentry;
        String strRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 ? RemoteActionCompatParcelizer(th) : null;
        this.read = strRemoteActionCompatParcelizer;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23) {
            iAudioAttributesCompatParcelizer = read(th);
        } else {
            iAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer);
        }
        this.write = iAudioAttributesCompatParcelizer;
    }

    private static String RemoteActionCompatParcelizer(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    private static int read(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
