package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getLastAdjustedTimestampUs;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getLastAdjustedTimestampUs {
    public static final getLastAdjustedTimestampUs AudioAttributesCompatParcelizer = new getLastAdjustedTimestampUs("TEXT", 0);
    public static final getLastAdjustedTimestampUs IconCompatParcelizer = new getLastAdjustedTimestampUs("MCQ", 1);
    public static final getLastAdjustedTimestampUs read = new getLastAdjustedTimestampUs("PEARL", 2);
    private static final /* synthetic */ getLastAdjustedTimestampUs[] write;

    private getLastAdjustedTimestampUs(String str, int i) {
    }

    static {
        getLastAdjustedTimestampUs[] getlastadjustedtimestampusArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        write = getlastadjustedtimestampusArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getlastadjustedtimestampusArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ getLastAdjustedTimestampUs[] AudioAttributesCompatParcelizer() {
        return new getLastAdjustedTimestampUs[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, read};
    }

    public static getLastAdjustedTimestampUs valueOf(String str) {
        return (getLastAdjustedTimestampUs) Enum.valueOf(getLastAdjustedTimestampUs.class, str);
    }

    public static getLastAdjustedTimestampUs[] values() {
        return (getLastAdjustedTimestampUs[]) write.clone();
    }
}
