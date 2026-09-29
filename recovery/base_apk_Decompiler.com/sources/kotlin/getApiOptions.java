package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getApiOptions;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getApiOptions {
    private static final /* synthetic */ getApiOptions[] write;
    public static final getApiOptions RemoteActionCompatParcelizer = new getApiOptions("HOME_TAB", 0);
    public static final getApiOptions IconCompatParcelizer = new getApiOptions("PRACTICAL_CORNER", 1);

    private getApiOptions(String str, int i) {
    }

    static {
        getApiOptions[] getapioptionsArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        write = getapioptionsArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getapioptionsArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ getApiOptions[] AudioAttributesCompatParcelizer() {
        return new getApiOptions[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static getApiOptions valueOf(String str) {
        return (getApiOptions) Enum.valueOf(getApiOptions.class, str);
    }

    public static getApiOptions[] values() {
        return (getApiOptions[]) write.clone();
    }
}
