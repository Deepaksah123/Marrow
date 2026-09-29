package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/AppMeasurementDynamiteService;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppMeasurementDynamiteService {
    private static final /* synthetic */ AppMeasurementDynamiteService[] AudioAttributesCompatParcelizer;
    public static final AppMeasurementDynamiteService IconCompatParcelizer = new AppMeasurementDynamiteService("REVIEW_TEST_SHEET", 0);
    public static final AppMeasurementDynamiteService RemoteActionCompatParcelizer = new AppMeasurementDynamiteService("LEFT_MENU", 1);
    public static final AppMeasurementDynamiteService write = new AppMeasurementDynamiteService("LAST_QUESTION", 2);

    private AppMeasurementDynamiteService(String str, int i) {
    }

    static {
        AppMeasurementDynamiteService[] appMeasurementDynamiteServiceArr = read();
        AudioAttributesCompatParcelizer = appMeasurementDynamiteServiceArr;
        getMagicModuleTimeline.IconCompatParcelizer(appMeasurementDynamiteServiceArr);
    }

    private static final /* synthetic */ AppMeasurementDynamiteService[] read() {
        return new AppMeasurementDynamiteService[]{IconCompatParcelizer, RemoteActionCompatParcelizer, write};
    }

    public static AppMeasurementDynamiteService valueOf(String str) {
        return (AppMeasurementDynamiteService) Enum.valueOf(AppMeasurementDynamiteService.class, str);
    }

    public static AppMeasurementDynamiteService[] values() {
        return (AppMeasurementDynamiteService[]) AudioAttributesCompatParcelizer.clone();
    }
}
