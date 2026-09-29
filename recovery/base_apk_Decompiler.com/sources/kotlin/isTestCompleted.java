package kotlin;

import kotlin.Metadata;
import kotlin.isTestDiscarded;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/isTestCompleted;", "Lo/isTestDiscarded$IconCompatParcelizer;", "<init>", "()V", "", "IconCompatParcelizer", "()J", "", "toString", "()Ljava/lang/String;", "Lo/isTestDiscarded$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;", "read", "p0", "p1", "Lo/getTestPattern;", "AudioAttributesCompatParcelizer", "(JJ)J", "RemoteActionCompatParcelizer", "J"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isTestCompleted implements isTestDiscarded.IconCompatParcelizer {
    public static final isTestCompleted INSTANCE = new isTestCompleted();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final long read = System.nanoTime();

    private isTestCompleted() {
    }

    private static long IconCompatParcelizer() {
        return System.nanoTime() - read;
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public static long read() {
        return isTestDiscarded.RemoteActionCompatParcelizer.C0118RemoteActionCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer());
    }

    public static long AudioAttributesCompatParcelizer(long p0, long p1) {
        return isStateRankApplcable.RemoteActionCompatParcelizer(p0, p1, isAnonymous.read);
    }
}
