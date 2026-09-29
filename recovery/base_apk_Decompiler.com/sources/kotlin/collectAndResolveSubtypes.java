package kotlin;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
public final class collectAndResolveSubtypes extends Exception {
    public final long RemoteActionCompatParcelizer;

    public static collectAndResolveSubtypes RemoteActionCompatParcelizer(Exception exc) {
        return write(exc);
    }

    private static collectAndResolveSubtypes write(Exception exc) {
        if (exc instanceof collectAndResolveSubtypes) {
            return (collectAndResolveSubtypes) exc;
        }
        return new collectAndResolveSubtypes(exc, C.TIME_UNSET);
    }

    private collectAndResolveSubtypes(Throwable th, long j) {
        super(th);
        this.RemoteActionCompatParcelizer = C.TIME_UNSET;
    }
}
