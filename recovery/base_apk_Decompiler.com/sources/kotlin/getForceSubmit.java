package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getForceSubmit<T> {
    private final getTopicStat<T> RemoteActionCompatParcelizer;
    private final Throwable read;

    public static <T> getForceSubmit<T> IconCompatParcelizer(Throwable th) {
        if (th == null) {
            throw new NullPointerException("error == null");
        }
        return new getForceSubmit<>(null, th);
    }

    public static <T> getForceSubmit<T> write(getTopicStat<T> gettopicstat) {
        if (gettopicstat == null) {
            throw new NullPointerException("response == null");
        }
        return new getForceSubmit<>(gettopicstat, null);
    }

    private getForceSubmit(getTopicStat<T> gettopicstat, Throwable th) {
        this.RemoteActionCompatParcelizer = gettopicstat;
        this.read = th;
    }
}
