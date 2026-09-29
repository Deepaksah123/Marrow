package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/AppMeasurementEventInterceptor;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppMeasurementEventInterceptor {
    public static final AppMeasurementEventInterceptor IconCompatParcelizer = new AppMeasurementEventInterceptor("LEFT_MENU", 0);
    public static final AppMeasurementEventInterceptor read = new AppMeasurementEventInterceptor("LAST_QUESTION_POPUP", 1);
    private static final /* synthetic */ AppMeasurementEventInterceptor[] write;

    private AppMeasurementEventInterceptor(String str, int i) {
    }

    static {
        AppMeasurementEventInterceptor[] appMeasurementEventInterceptorArr = read();
        write = appMeasurementEventInterceptorArr;
        getMagicModuleTimeline.IconCompatParcelizer(appMeasurementEventInterceptorArr);
    }

    private static final /* synthetic */ AppMeasurementEventInterceptor[] read() {
        return new AppMeasurementEventInterceptor[]{IconCompatParcelizer, read};
    }

    public static AppMeasurementEventInterceptor valueOf(String str) {
        return (AppMeasurementEventInterceptor) Enum.valueOf(AppMeasurementEventInterceptor.class, str);
    }

    public static AppMeasurementEventInterceptor[] values() {
        return (AppMeasurementEventInterceptor[]) write.clone();
    }
}
