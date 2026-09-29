package kotlin;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\b"}, d2 = {"Lo/isAnonymous;", "", "Ljava/util/concurrent/TimeUnit;", "p0", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/util/concurrent/TimeUnit;", "write", "()Ljava/util/concurrent/TimeUnit;", "RemoteActionCompatParcelizer", "read", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isAnonymous {
    private static final /* synthetic */ isAnonymous[] AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final TimeUnit RemoteActionCompatParcelizer;
    public static final isAnonymous read = new isAnonymous("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    private static isAnonymous MediaBrowserCompatItemReceiver = new isAnonymous("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final isAnonymous RemoteActionCompatParcelizer = new isAnonymous("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final isAnonymous AudioAttributesImplApi26Parcelizer = new isAnonymous("SECONDS", 3, TimeUnit.SECONDS);
    public static final isAnonymous IconCompatParcelizer = new isAnonymous("MINUTES", 4, TimeUnit.MINUTES);
    public static final isAnonymous AudioAttributesCompatParcelizer = new isAnonymous("HOURS", 5, TimeUnit.HOURS);
    public static final isAnonymous write = new isAnonymous("DAYS", 6, TimeUnit.DAYS);

    private isAnonymous(String str, int i, TimeUnit timeUnit) {
        this.RemoteActionCompatParcelizer = timeUnit;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final TimeUnit getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        isAnonymous[] isanonymousArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesImplApi21Parcelizer = isanonymousArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(isanonymousArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ isAnonymous[] RemoteActionCompatParcelizer() {
        return new isAnonymous[]{read, MediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer, AudioAttributesImplApi26Parcelizer, IconCompatParcelizer, AudioAttributesCompatParcelizer, write};
    }

    public static isAnonymous valueOf(String str) {
        return (isAnonymous) Enum.valueOf(isAnonymous.class, str);
    }

    public static isAnonymous[] values() {
        return (isAnonymous[]) AudioAttributesImplApi21Parcelizer.clone();
    }
}
