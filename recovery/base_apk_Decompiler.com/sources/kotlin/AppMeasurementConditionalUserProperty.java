package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/AppMeasurementConditionalUserProperty;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppMeasurementConditionalUserProperty {
    private static final /* synthetic */ AppMeasurementConditionalUserProperty[] RemoteActionCompatParcelizer;
    public static final AppMeasurementConditionalUserProperty IconCompatParcelizer = new AppMeasurementConditionalUserProperty("REVIEW_TEST_SHEET", 0);
    public static final AppMeasurementConditionalUserProperty write = new AppMeasurementConditionalUserProperty("MCQ_ANSWER_SCREEN", 1);

    private AppMeasurementConditionalUserProperty(String str, int i) {
    }

    static {
        AppMeasurementConditionalUserProperty[] appMeasurementConditionalUserPropertyArrIconCompatParcelizer = IconCompatParcelizer();
        RemoteActionCompatParcelizer = appMeasurementConditionalUserPropertyArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(appMeasurementConditionalUserPropertyArrIconCompatParcelizer);
    }

    private static final /* synthetic */ AppMeasurementConditionalUserProperty[] IconCompatParcelizer() {
        return new AppMeasurementConditionalUserProperty[]{IconCompatParcelizer, write};
    }

    public static AppMeasurementConditionalUserProperty valueOf(String str) {
        return (AppMeasurementConditionalUserProperty) Enum.valueOf(AppMeasurementConditionalUserProperty.class, str);
    }

    public static AppMeasurementConditionalUserProperty[] values() {
        return (AppMeasurementConditionalUserProperty[]) RemoteActionCompatParcelizer.clone();
    }
}
