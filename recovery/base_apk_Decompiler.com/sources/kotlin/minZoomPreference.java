package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/minZoomPreference;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class minZoomPreference {
    private static final /* synthetic */ minZoomPreference[] read;
    public static final minZoomPreference RemoteActionCompatParcelizer = new minZoomPreference("KycUploadScreen", 0);
    public static final minZoomPreference IconCompatParcelizer = new minZoomPreference("KycVerificationScreen", 1);

    private minZoomPreference(String str, int i) {
    }

    static {
        minZoomPreference[] minzoompreferenceArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        read = minzoompreferenceArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(minzoompreferenceArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ minZoomPreference[] AudioAttributesCompatParcelizer() {
        return new minZoomPreference[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static minZoomPreference valueOf(String str) {
        return (minZoomPreference) Enum.valueOf(minZoomPreference.class, str);
    }

    public static minZoomPreference[] values() {
        return (minZoomPreference[]) read.clone();
    }
}
