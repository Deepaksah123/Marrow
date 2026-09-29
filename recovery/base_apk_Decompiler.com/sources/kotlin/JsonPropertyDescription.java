package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/JsonPropertyDescription;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonPropertyDescription {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ JsonPropertyDescription[] RemoteActionCompatParcelizer;
    public static final JsonPropertyDescription AudioAttributesCompatParcelizer = new JsonPropertyDescription("Short", 0);
    public static final JsonPropertyDescription write = new JsonPropertyDescription("Long", 1);
    public static final JsonPropertyDescription read = new JsonPropertyDescription("Indefinite", 2);

    private JsonPropertyDescription(String str, int i) {
    }

    static {
        JsonPropertyDescription[] jsonPropertyDescriptionArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer = jsonPropertyDescriptionArrRemoteActionCompatParcelizer;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(jsonPropertyDescriptionArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ JsonPropertyDescription[] RemoteActionCompatParcelizer() {
        return new JsonPropertyDescription[]{AudioAttributesCompatParcelizer, write, read};
    }

    public static JsonPropertyDescription valueOf(String str) {
        return (JsonPropertyDescription) Enum.valueOf(JsonPropertyDescription.class, str);
    }

    public static JsonPropertyDescription[] values() {
        return (JsonPropertyDescription[]) RemoteActionCompatParcelizer.clone();
    }
}
