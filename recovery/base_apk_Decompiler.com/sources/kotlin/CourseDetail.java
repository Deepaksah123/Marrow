package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseDetail {
    private static final accessgetVideoConfigurationC2cp RemoteActionCompatParcelizer = new accessgetVideoConfigurationC2cp("REMOVED_TASK");
    private static final accessgetVideoConfigurationC2cp read = new accessgetVideoConfigurationC2cp("CLOSED_EMPTY");

    public static final long read(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
