package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/lambdaonDrmSessionReleased66;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaonDrmSessionReleased66 {
    private static final /* synthetic */ lambdaonDrmSessionReleased66[] RemoteActionCompatParcelizer;
    public static final lambdaonDrmSessionReleased66 AudioAttributesCompatParcelizer = new lambdaonDrmSessionReleased66("EXOPLAYER", 0);
    public static final lambdaonDrmSessionReleased66 write = new lambdaonDrmSessionReleased66("MEDIA3", 1);
    public static final lambdaonDrmSessionReleased66 IconCompatParcelizer = new lambdaonDrmSessionReleased66("NONE", 2);

    private lambdaonDrmSessionReleased66(String str, int i) {
    }

    static {
        lambdaonDrmSessionReleased66[] lambdaondrmsessionreleased66ArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer = lambdaondrmsessionreleased66ArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(lambdaondrmsessionreleased66ArrRemoteActionCompatParcelizer);
    }

    public static lambdaonDrmSessionReleased66 valueOf(String str) {
        return (lambdaonDrmSessionReleased66) Enum.valueOf(lambdaonDrmSessionReleased66.class, str);
    }

    public static lambdaonDrmSessionReleased66[] values() {
        return (lambdaonDrmSessionReleased66[]) RemoteActionCompatParcelizer.clone();
    }

    private static final /* synthetic */ lambdaonDrmSessionReleased66[] RemoteActionCompatParcelizer() {
        return new lambdaonDrmSessionReleased66[]{AudioAttributesCompatParcelizer, write, IconCompatParcelizer};
    }
}
