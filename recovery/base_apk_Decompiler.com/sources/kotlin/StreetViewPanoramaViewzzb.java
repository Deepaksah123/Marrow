package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/StreetViewPanoramaViewzzb;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StreetViewPanoramaViewzzb {
    private static final /* synthetic */ StreetViewPanoramaViewzzb[] AudioAttributesCompatParcelizer;
    public static final StreetViewPanoramaViewzzb RemoteActionCompatParcelizer = new StreetViewPanoramaViewzzb("NONE", 0);
    public static final StreetViewPanoramaViewzzb read = new StreetViewPanoramaViewzzb("QBANK", 1);
    public static final StreetViewPanoramaViewzzb write = new StreetViewPanoramaViewzzb("BOOKMARK", 2);
    public static final StreetViewPanoramaViewzzb IconCompatParcelizer = new StreetViewPanoramaViewzzb("BOTH", 3);

    private StreetViewPanoramaViewzzb(String str, int i) {
    }

    static {
        StreetViewPanoramaViewzzb[] streetViewPanoramaViewzzbArrWrite = write();
        AudioAttributesCompatParcelizer = streetViewPanoramaViewzzbArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(streetViewPanoramaViewzzbArrWrite);
    }

    private static final /* synthetic */ StreetViewPanoramaViewzzb[] write() {
        return new StreetViewPanoramaViewzzb[]{RemoteActionCompatParcelizer, read, write, IconCompatParcelizer};
    }

    public static StreetViewPanoramaViewzzb valueOf(String str) {
        return (StreetViewPanoramaViewzzb) Enum.valueOf(StreetViewPanoramaViewzzb.class, str);
    }

    public static StreetViewPanoramaViewzzb[] values() {
        return (StreetViewPanoramaViewzzb[]) AudioAttributesCompatParcelizer.clone();
    }
}
