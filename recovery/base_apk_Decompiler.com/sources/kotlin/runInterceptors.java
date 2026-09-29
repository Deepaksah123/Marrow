package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/runInterceptors;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class runInterceptors {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ runInterceptors[] read;
    public static final runInterceptors write = new runInterceptors("CROSSED", 0);
    public static final runInterceptors AudioAttributesCompatParcelizer = new runInterceptors("NOT_CROSSED", 1);
    public static final runInterceptors RemoteActionCompatParcelizer = new runInterceptors("COLLAPSED", 2);

    private runInterceptors(String str, int i) {
    }

    static {
        runInterceptors[] runinterceptorsArrWrite = write();
        read = runinterceptorsArrWrite;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(runinterceptorsArrWrite);
    }

    private static final /* synthetic */ runInterceptors[] write() {
        return new runInterceptors[]{write, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static runInterceptors valueOf(String str) {
        return (runInterceptors) Enum.valueOf(runInterceptors.class, str);
    }

    public static runInterceptors[] values() {
        return (runInterceptors[]) read.clone();
    }
}
