package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/handleLoadingMediaPeriodChanged;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class handleLoadingMediaPeriodChanged {
    private static final /* synthetic */ handleLoadingMediaPeriodChanged[] AudioAttributesCompatParcelizer;
    public static final handleLoadingMediaPeriodChanged IconCompatParcelizer = new handleLoadingMediaPeriodChanged("Immediately", 0);
    public static final handleLoadingMediaPeriodChanged write = new handleLoadingMediaPeriodChanged("OnIterationFinish", 1);

    private handleLoadingMediaPeriodChanged(String str, int i) {
    }

    static {
        handleLoadingMediaPeriodChanged[] handleloadingmediaperiodchangedArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer = handleloadingmediaperiodchangedArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(handleloadingmediaperiodchangedArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ handleLoadingMediaPeriodChanged[] RemoteActionCompatParcelizer() {
        return new handleLoadingMediaPeriodChanged[]{IconCompatParcelizer, write};
    }

    public static handleLoadingMediaPeriodChanged valueOf(String str) {
        return (handleLoadingMediaPeriodChanged) Enum.valueOf(handleLoadingMediaPeriodChanged.class, str);
    }

    public static handleLoadingMediaPeriodChanged[] values() {
        return (handleLoadingMediaPeriodChanged[]) AudioAttributesCompatParcelizer.clone();
    }
}
