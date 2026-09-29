package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getCachedBytesLength;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getCachedBytesLength {
    private static final /* synthetic */ getCachedBytesLength[] AudioAttributesCompatParcelizer;
    public static final getCachedBytesLength RemoteActionCompatParcelizer = new getCachedBytesLength("NA", 0);
    public static final getCachedBytesLength write = new getCachedBytesLength("NEW", 1);
    public static final getCachedBytesLength read = new getCachedBytesLength("UPDATED", 2);

    private getCachedBytesLength(String str, int i) {
    }

    static {
        getCachedBytesLength[] getcachedbyteslengthArrWrite = write();
        AudioAttributesCompatParcelizer = getcachedbyteslengthArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(getcachedbyteslengthArrWrite);
    }

    private static final /* synthetic */ getCachedBytesLength[] write() {
        return new getCachedBytesLength[]{RemoteActionCompatParcelizer, write, read};
    }

    public static getCachedBytesLength valueOf(String str) {
        return (getCachedBytesLength) Enum.valueOf(getCachedBytesLength.class, str);
    }

    public static getCachedBytesLength[] values() {
        return (getCachedBytesLength[]) AudioAttributesCompatParcelizer.clone();
    }
}
