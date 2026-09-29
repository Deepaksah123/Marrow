package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000bJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R$\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\b\u0010\u0014R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\f\u0010\u0014R$\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00158\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\n\u0010\u0017"}, d2 = {"Lo/setChipSpacing;", "", "<init>", "()V", "", "AudioAttributesImplApi21Parcelizer", "", "p0", "IconCompatParcelizer", "(JJ)J", "read", "(J)V", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "write", "RemoteActionCompatParcelizer", "", "toString", "()Ljava/lang/String;", "J", "()J", "", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setChipSpacing {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write;
    private long RemoteActionCompatParcelizer = -1;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private long read = -1;
    private long IconCompatParcelizer = -1;
    private long AudioAttributesCompatParcelizer = System.currentTimeMillis();

    private static long IconCompatParcelizer(long j, long j2) {
        if (j == -1) {
            j = 0;
        }
        return j + j2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.write = true;
    }

    public final void read(long p0) {
        this.RemoteActionCompatParcelizer = IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
    }

    public final void AudioAttributesCompatParcelizer(long p0) {
        this.read = IconCompatParcelizer(this.read, p0);
    }

    public final void IconCompatParcelizer(long p0) {
        this.IconCompatParcelizer = IconCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesCompatParcelizer = System.currentTimeMillis();
    }

    public final void write(long p0) {
        this.RemoteActionCompatParcelizer = p0;
    }

    public final void RemoteActionCompatParcelizer(long p0) {
        this.IconCompatParcelizer = p0;
    }

    public final void AudioAttributesImplApi21Parcelizer(long p0) {
        this.read = p0;
    }

    public final String toString() {
        long j = this.RemoteActionCompatParcelizer;
        long j2 = this.IconCompatParcelizer;
        long j3 = this.read;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("first=");
        sb.append(j);
        sb.append("ms change=");
        sb.append(j2);
        sb.append("ms review=");
        sb.append(j3);
        sb.append("ms | answered=");
        sb.append(z);
        return sb.toString();
    }
}
