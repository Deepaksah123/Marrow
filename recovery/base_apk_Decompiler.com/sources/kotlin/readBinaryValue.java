package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/readBinaryValue;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class readBinaryValue {
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesImplApi21Parcelizer;
    private static final /* synthetic */ readBinaryValue[] MediaBrowserCompatItemReceiver;
    public static final readBinaryValue AudioAttributesCompatParcelizer = new readBinaryValue("TopBar", 0);
    public static final readBinaryValue write = new readBinaryValue("MainContent", 1);
    public static final readBinaryValue IconCompatParcelizer = new readBinaryValue("Snackbar", 2);
    public static final readBinaryValue read = new readBinaryValue("Fab", 3);
    public static final readBinaryValue RemoteActionCompatParcelizer = new readBinaryValue("BottomBar", 4);

    private readBinaryValue(String str, int i) {
    }

    static {
        readBinaryValue[] readbinaryvalueArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        MediaBrowserCompatItemReceiver = readbinaryvalueArrAudioAttributesCompatParcelizer;
        AudioAttributesImplApi21Parcelizer = getMagicModuleTimeline.IconCompatParcelizer(readbinaryvalueArrAudioAttributesCompatParcelizer);
    }

    public static readBinaryValue valueOf(String str) {
        return (readBinaryValue) Enum.valueOf(readBinaryValue.class, str);
    }

    public static readBinaryValue[] values() {
        return (readBinaryValue[]) MediaBrowserCompatItemReceiver.clone();
    }

    private static final /* synthetic */ readBinaryValue[] AudioAttributesCompatParcelizer() {
        return new readBinaryValue[]{AudioAttributesCompatParcelizer, write, IconCompatParcelizer, read, RemoteActionCompatParcelizer};
    }
}
