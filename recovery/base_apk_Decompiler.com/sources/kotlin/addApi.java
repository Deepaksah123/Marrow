package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/addApi;", "", "<init>", "(Ljava/lang/String;I)V", "read", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class addApi {
    private static final /* synthetic */ addApi[] RemoteActionCompatParcelizer;
    public static final addApi read = new addApi("NOT_SCROLLED", 0);
    public static final addApi IconCompatParcelizer = new addApi("PARTIALLY_SCROLLED", 1);
    public static final addApi write = new addApi("FULLY_SCROLLED", 2);

    private addApi(String str, int i) {
    }

    static {
        addApi[] addapiArrWrite = write();
        RemoteActionCompatParcelizer = addapiArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(addapiArrWrite);
    }

    private static final /* synthetic */ addApi[] write() {
        return new addApi[]{read, IconCompatParcelizer, write};
    }

    public static addApi valueOf(String str) {
        return (addApi) Enum.valueOf(addApi.class, str);
    }

    public static addApi[] values() {
        return (addApi[]) RemoteActionCompatParcelizer.clone();
    }
}
