package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/JsonMerge;", "", "<init>", "(Ljava/lang/String;I)V", "read", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class JsonMerge {
    private static final /* synthetic */ JsonMerge[] AudioAttributesImplApi21Parcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount MediaBrowserCompatItemReceiver;
    public static final JsonMerge read = new JsonMerge("TopBar", 0);
    public static final JsonMerge write = new JsonMerge("MainContent", 1);
    public static final JsonMerge RemoteActionCompatParcelizer = new JsonMerge("Snackbar", 2);
    public static final JsonMerge IconCompatParcelizer = new JsonMerge("Fab", 3);
    public static final JsonMerge AudioAttributesCompatParcelizer = new JsonMerge("BottomBar", 4);

    private JsonMerge(String str, int i) {
    }

    static {
        JsonMerge[] jsonMergeArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesImplApi21Parcelizer = jsonMergeArrAudioAttributesCompatParcelizer;
        MediaBrowserCompatItemReceiver = getMagicModuleTimeline.IconCompatParcelizer(jsonMergeArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ JsonMerge[] AudioAttributesCompatParcelizer() {
        return new JsonMerge[]{read, write, RemoteActionCompatParcelizer, IconCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static JsonMerge valueOf(String str) {
        return (JsonMerge) Enum.valueOf(JsonMerge.class, str);
    }

    public static JsonMerge[] values() {
        return (JsonMerge[]) AudioAttributesImplApi21Parcelizer.clone();
    }
}
