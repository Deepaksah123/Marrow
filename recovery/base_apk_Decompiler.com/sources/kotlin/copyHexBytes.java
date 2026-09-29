package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lo/copyHexBytes;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class copyHexBytes {
    private static final /* synthetic */ copyHexBytes[] AudioAttributesImplApi26Parcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount MediaBrowserCompatItemReceiver;
    public static final copyHexBytes AudioAttributesCompatParcelizer = new copyHexBytes("Invalid", 0);
    public static final copyHexBytes RemoteActionCompatParcelizer = new copyHexBytes("Cancelled", 1);
    public static final copyHexBytes IconCompatParcelizer = new copyHexBytes("InitialPending", 2);
    public static final copyHexBytes AudioAttributesImplBaseParcelizer = new copyHexBytes("RecomposePending", 3);
    public static final copyHexBytes AudioAttributesImplApi21Parcelizer = new copyHexBytes("Recomposing", 4);
    public static final copyHexBytes write = new copyHexBytes("ApplyPending", 5);
    public static final copyHexBytes read = new copyHexBytes("Applied", 6);

    private copyHexBytes(String str, int i) {
    }

    static {
        copyHexBytes[] copyhexbytesArr = read();
        AudioAttributesImplApi26Parcelizer = copyhexbytesArr;
        MediaBrowserCompatItemReceiver = getMagicModuleTimeline.IconCompatParcelizer(copyhexbytesArr);
    }

    private static final /* synthetic */ copyHexBytes[] read() {
        return new copyHexBytes[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, IconCompatParcelizer, AudioAttributesImplBaseParcelizer, AudioAttributesImplApi21Parcelizer, write, read};
    }

    public static copyHexBytes valueOf(String str) {
        return (copyHexBytes) Enum.valueOf(copyHexBytes.class, str);
    }

    public static copyHexBytes[] values() {
        return (copyHexBytes[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
