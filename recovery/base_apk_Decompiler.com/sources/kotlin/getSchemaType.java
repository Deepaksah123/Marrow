package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getSchemaType;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getSchemaType {
    private static final /* synthetic */ getMagicModuleSavedMcqCount RemoteActionCompatParcelizer;
    private static final /* synthetic */ getSchemaType[] write;
    public static final getSchemaType AudioAttributesCompatParcelizer = new getSchemaType("Tabs", 0);
    public static final getSchemaType read = new getSchemaType("Divider", 1);
    public static final getSchemaType IconCompatParcelizer = new getSchemaType("Indicator", 2);

    private getSchemaType(String str, int i) {
    }

    static {
        getSchemaType[] getschematypeArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        write = getschematypeArrRemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(getschematypeArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ getSchemaType[] RemoteActionCompatParcelizer() {
        return new getSchemaType[]{AudioAttributesCompatParcelizer, read, IconCompatParcelizer};
    }

    public static getSchemaType valueOf(String str) {
        return (getSchemaType) Enum.valueOf(getSchemaType.class, str);
    }

    public static getSchemaType[] values() {
        return (getSchemaType[]) write.clone();
    }
}
