package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/closestVsync;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class closestVsync {
    private static final /* synthetic */ closestVsync[] AudioAttributesImplBaseParcelizer;
    public static final closestVsync IconCompatParcelizer = new closestVsync("STARTED", 0);
    public static final closestVsync read = new closestVsync("UPDATE", 1);
    public static final closestVsync RemoteActionCompatParcelizer = new closestVsync("FAIL", 2);
    public static final closestVsync AudioAttributesCompatParcelizer = new closestVsync("COMPLETE", 3);
    public static final closestVsync write = new closestVsync("IDEAL", 4);

    private closestVsync(String str, int i) {
    }

    static {
        closestVsync[] closestvsyncArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesImplBaseParcelizer = closestvsyncArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(closestvsyncArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ closestVsync[] AudioAttributesCompatParcelizer() {
        return new closestVsync[]{IconCompatParcelizer, read, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, write};
    }

    public static closestVsync valueOf(String str) {
        return (closestVsync) Enum.valueOf(closestVsync.class, str);
    }

    public static closestVsync[] values() {
        return (closestVsync[]) AudioAttributesImplBaseParcelizer.clone();
    }
}
