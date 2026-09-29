package kotlin;

import androidx.media3.extractor.metadata.emsg.EventMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class serializeTypedContents {
    public final long AudioAttributesCompatParcelizer;
    public final EventMessage[] IconCompatParcelizer;
    public final long[] RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public serializeTypedContents(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        this.read = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = jArr;
        this.IconCompatParcelizer = eventMessageArr;
    }

    public final String AudioAttributesCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append("/");
        sb.append(this.write);
        return sb.toString();
    }
}
