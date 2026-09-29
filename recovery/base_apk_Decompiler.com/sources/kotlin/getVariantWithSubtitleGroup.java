package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lo/getVariantWithSubtitleGroup;", "", "<init>", "(Ljava/lang/String;I)V", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getVariantWithSubtitleGroup {
    private static final /* synthetic */ getVariantWithSubtitleGroup[] MediaBrowserCompatCustomActionResultReceiver;
    private static getVariantWithSubtitleGroup MediaBrowserCompatItemReceiver = new getVariantWithSubtitleGroup("STATE_DWLD_INITIAL", 0);
    public static final getVariantWithSubtitleGroup AudioAttributesCompatParcelizer = new getVariantWithSubtitleGroup("STATE_DWLD_START", 1);
    public static final getVariantWithSubtitleGroup IconCompatParcelizer = new getVariantWithSubtitleGroup("STATE_DWLD_INTERUPPTED", 2);
    public static final getVariantWithSubtitleGroup RemoteActionCompatParcelizer = new getVariantWithSubtitleGroup("STATE_DWLD_RESUMED", 3);
    public static final getVariantWithSubtitleGroup read = new getVariantWithSubtitleGroup("STATE_DWLD_COMPLETE", 4);
    public static final getVariantWithSubtitleGroup write = new getVariantWithSubtitleGroup("STATE_DWLD_QUEUED", 5);

    private getVariantWithSubtitleGroup(String str, int i) {
    }

    static {
        getVariantWithSubtitleGroup[] getvariantwithsubtitlegroupArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver = getvariantwithsubtitlegroupArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getvariantwithsubtitlegroupArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ getVariantWithSubtitleGroup[] RemoteActionCompatParcelizer() {
        return new getVariantWithSubtitleGroup[]{MediaBrowserCompatItemReceiver, AudioAttributesCompatParcelizer, IconCompatParcelizer, RemoteActionCompatParcelizer, read, write};
    }

    public static getVariantWithSubtitleGroup valueOf(String str) {
        return (getVariantWithSubtitleGroup) Enum.valueOf(getVariantWithSubtitleGroup.class, str);
    }

    public static getVariantWithSubtitleGroup[] values() {
        return (getVariantWithSubtitleGroup[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
