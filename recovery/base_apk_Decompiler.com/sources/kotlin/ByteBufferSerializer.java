package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteBufferSerializer extends IOException {
    public ByteBufferSerializer(String str) {
        StringBuilder sb = new StringBuilder("Unable to bind a sample queue to TrackGroup with MIME type ");
        sb.append(str);
        sb.append(".");
        super(sb.toString());
    }
}
