package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/maybeSkipTag;", "", "<init>", "(Ljava/lang/String;I)V", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class maybeSkipTag {
    private static final /* synthetic */ maybeSkipTag[] IconCompatParcelizer;
    public static final maybeSkipTag write = new maybeSkipTag("HOME_TAB", 0);
    public static final maybeSkipTag RemoteActionCompatParcelizer = new maybeSkipTag("QBANK_TAB", 1);
    public static final maybeSkipTag AudioAttributesCompatParcelizer = new maybeSkipTag("TEST_TAB", 2);
    public static final maybeSkipTag read = new maybeSkipTag("VIDEO_TAB", 3);
    private static maybeSkipTag AudioAttributesImplApi26Parcelizer = new maybeSkipTag("NO_TAB", 4);

    private maybeSkipTag(String str, int i) {
    }

    static {
        maybeSkipTag[] maybeskiptagArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        IconCompatParcelizer = maybeskiptagArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(maybeskiptagArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ maybeSkipTag[] AudioAttributesCompatParcelizer() {
        return new maybeSkipTag[]{write, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, read, AudioAttributesImplApi26Parcelizer};
    }

    public static maybeSkipTag valueOf(String str) {
        return (maybeSkipTag) Enum.valueOf(maybeSkipTag.class, str);
    }

    public static maybeSkipTag[] values() {
        return (maybeSkipTag[]) IconCompatParcelizer.clone();
    }
}
