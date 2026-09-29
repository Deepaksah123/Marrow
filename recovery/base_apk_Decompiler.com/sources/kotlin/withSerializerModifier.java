package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lo/withSerializerModifier;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class withSerializerModifier {
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesImplApi26Parcelizer;
    private static final /* synthetic */ withSerializerModifier[] AudioAttributesImplBaseParcelizer;
    public static final withSerializerModifier AudioAttributesCompatParcelizer = new withSerializerModifier("Paragraph", 0);
    public static final withSerializerModifier write = new withSerializerModifier("Span", 1);
    public static final withSerializerModifier AudioAttributesImplApi21Parcelizer = new withSerializerModifier("VerbatimTts", 2);
    public static final withSerializerModifier MediaBrowserCompatCustomActionResultReceiver = new withSerializerModifier("Url", 3);
    public static final withSerializerModifier RemoteActionCompatParcelizer = new withSerializerModifier("Link", 4);
    public static final withSerializerModifier read = new withSerializerModifier("Clickable", 5);
    public static final withSerializerModifier IconCompatParcelizer = new withSerializerModifier("String", 6);

    private withSerializerModifier(String str, int i) {
    }

    static {
        withSerializerModifier[] withserializermodifierArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesImplBaseParcelizer = withserializermodifierArrRemoteActionCompatParcelizer;
        AudioAttributesImplApi26Parcelizer = getMagicModuleTimeline.IconCompatParcelizer(withserializermodifierArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ withSerializerModifier[] RemoteActionCompatParcelizer() {
        return new withSerializerModifier[]{AudioAttributesCompatParcelizer, write, AudioAttributesImplApi21Parcelizer, MediaBrowserCompatCustomActionResultReceiver, RemoteActionCompatParcelizer, read, IconCompatParcelizer};
    }

    public static withSerializerModifier valueOf(String str) {
        return (withSerializerModifier) Enum.valueOf(withSerializerModifier.class, str);
    }

    public static withSerializerModifier[] values() {
        return (withSerializerModifier[]) AudioAttributesImplBaseParcelizer.clone();
    }
}
