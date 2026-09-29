package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\n\u001a\u00020\u00028\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0007\u0010\u0005R\u0011\u0010\u0010\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0013"}, d2 = {"Lo/_parseSlowFloat;", "", "", "p0", "<init>", "(I)V", "Lo/releaseTokenBuffer;", "write", "(Lo/releaseTokenBuffer;)I", "Lo/setEncoding;", "IconCompatParcelizer", "(Lo/setEncoding;)I", "", "toString", "()Ljava/lang/String;", "I", "AudioAttributesCompatParcelizer", "()I", "", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _parseSlowFloat {
    private int IconCompatParcelizer;

    public _parseSlowFloat(int i) {
        this.IconCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void write(int i) {
        this.IconCompatParcelizer = i;
    }

    public final boolean write() {
        return this.IconCompatParcelizer != Integer.MIN_VALUE;
    }

    public final int write(releaseTokenBuffer p0) {
        return p0.IconCompatParcelizer(this);
    }

    public final int IconCompatParcelizer(setEncoding p0) {
        return p0.read(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        sb.append(this.IconCompatParcelizer);
        sb.append(" }");
        return sb.toString();
    }
}
