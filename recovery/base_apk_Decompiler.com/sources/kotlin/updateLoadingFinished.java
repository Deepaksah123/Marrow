package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/updateLoadingFinished;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class updateLoadingFinished {
    private static final /* synthetic */ updateLoadingFinished[] AudioAttributesImplApi26Parcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final updateLoadingFinished AudioAttributesCompatParcelizer = new updateLoadingFinished("CHANNEL_CLEVERTAP", 0);
    public static final updateLoadingFinished RemoteActionCompatParcelizer = new updateLoadingFinished("CHANNEL_FIREBASE", 1);
    public static final updateLoadingFinished read = new updateLoadingFinished("CHANNEL_FACEBOOK", 2);
    public static final updateLoadingFinished IconCompatParcelizer = new updateLoadingFinished("CHANNEL_MIXPANEL", 3);

    private updateLoadingFinished(String str, int i) {
    }

    static {
        updateLoadingFinished[] updateloadingfinishedArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesImplApi26Parcelizer = updateloadingfinishedArrAudioAttributesCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(updateloadingfinishedArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ updateLoadingFinished[] AudioAttributesCompatParcelizer() {
        return new updateLoadingFinished[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, read, IconCompatParcelizer};
    }

    public static getMagicModuleSavedMcqCount<updateLoadingFinished> read() {
        return write;
    }

    public static updateLoadingFinished valueOf(String str) {
        return (updateLoadingFinished) Enum.valueOf(updateLoadingFinished.class, str);
    }

    public static updateLoadingFinished[] values() {
        return (updateLoadingFinished[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
