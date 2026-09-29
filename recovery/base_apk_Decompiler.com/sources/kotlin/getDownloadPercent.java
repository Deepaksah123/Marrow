package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getDownloadPercent extends getDownloadCount {
    private Runnable read;

    public getDownloadPercent(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.read = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.read.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        sb.append(isVerified.read(this.read));
        sb.append('@');
        sb.append(isVerified.IconCompatParcelizer(this.read));
        sb.append(", ");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", ");
        sb.append(CourseDownloadCount.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver));
        sb.append(']');
        return sb.toString();
    }
}
