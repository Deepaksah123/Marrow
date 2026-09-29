package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/JsonTypeName;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonTypeName {
    private static final /* synthetic */ JsonTypeName[] AudioAttributesCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final JsonTypeName RemoteActionCompatParcelizer = new JsonTypeName("Dismissed", 0);
    public static final JsonTypeName IconCompatParcelizer = new JsonTypeName("ActionPerformed", 1);

    private JsonTypeName(String str, int i) {
    }

    static {
        JsonTypeName[] jsonTypeNameArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer = jsonTypeNameArrAudioAttributesCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(jsonTypeNameArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ JsonTypeName[] AudioAttributesCompatParcelizer() {
        return new JsonTypeName[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static JsonTypeName valueOf(String str) {
        return (JsonTypeName) Enum.valueOf(JsonTypeName.class, str);
    }

    public static JsonTypeName[] values() {
        return (JsonTypeName[]) AudioAttributesCompatParcelizer.clone();
    }
}
