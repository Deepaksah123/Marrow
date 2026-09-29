package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/writeDoubleSparseArray;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class writeDoubleSparseArray {
    private static final /* synthetic */ writeDoubleSparseArray[] write;
    public static final writeDoubleSparseArray read = new writeDoubleSparseArray("RESEND_OTP", 0);
    public static final writeDoubleSparseArray AudioAttributesCompatParcelizer = new writeDoubleSparseArray("START_TIMER", 1);
    public static final writeDoubleSparseArray RemoteActionCompatParcelizer = new writeDoubleSparseArray("CALL_OTP", 2);

    private writeDoubleSparseArray(String str, int i) {
    }

    static {
        writeDoubleSparseArray[] writedoublesparsearrayArr = read();
        write = writedoublesparsearrayArr;
        getMagicModuleTimeline.IconCompatParcelizer(writedoublesparsearrayArr);
    }

    private static final /* synthetic */ writeDoubleSparseArray[] read() {
        return new writeDoubleSparseArray[]{read, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static writeDoubleSparseArray valueOf(String str) {
        return (writeDoubleSparseArray) Enum.valueOf(writeDoubleSparseArray.class, str);
    }

    public static writeDoubleSparseArray[] values() {
        return (writeDoubleSparseArray[]) write.clone();
    }
}
