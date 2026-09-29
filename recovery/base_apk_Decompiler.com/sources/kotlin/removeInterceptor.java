package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/removeInterceptor;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class removeInterceptor {
    private static final /* synthetic */ removeInterceptor[] read;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final removeInterceptor IconCompatParcelizer = new removeInterceptor("Left", 0);
    public static final removeInterceptor RemoteActionCompatParcelizer = new removeInterceptor("Middle", 1);
    public static final removeInterceptor AudioAttributesCompatParcelizer = new removeInterceptor("Right", 2);

    private removeInterceptor(String str, int i) {
    }

    static {
        removeInterceptor[] removeinterceptorArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        read = removeinterceptorArrRemoteActionCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(removeinterceptorArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ removeInterceptor[] RemoteActionCompatParcelizer() {
        return new removeInterceptor[]{IconCompatParcelizer, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static removeInterceptor valueOf(String str) {
        return (removeInterceptor) Enum.valueOf(removeInterceptor.class, str);
    }

    public static removeInterceptor[] values() {
        return (removeInterceptor[]) read.clone();
    }
}
