package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/getLastSyncTimeMs;", "Lo/getSubtitleEnc;", "<init>", "()V", "", "p0", "", "p1", "Lo/getPlatform;", "read", "(ILjava/lang/String;)Lo/getPlatform;", "", "close", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getLastSyncTimeMs extends getSubtitleEnc {
    public static final getLastSyncTimeMs INSTANCE = new getLastSyncTimeMs();

    private getLastSyncTimeMs() {
        super(CourseDownloadCount.RemoteActionCompatParcelizer, CourseDownloadCount.write, CourseDownloadCount.AudioAttributesCompatParcelizer, CourseDownloadCount.IconCompatParcelizer);
    }

    @Override // kotlin.getPlatform
    public final getPlatform read(int p0, String p1) {
        setPbSessionId.AudioAttributesCompatParcelizer(p0);
        if (p0 >= CourseDownloadCount.RemoteActionCompatParcelizer) {
            return setPbSessionId.read(this, p1);
        }
        return super.read(p0, p1);
    }

    @Override // kotlin.getSubtitleEnc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlin.getPlatform
    public final String toString() {
        return "Dispatchers.Default";
    }
}
