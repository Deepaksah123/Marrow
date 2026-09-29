package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\bj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/resumeLoad;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "read", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class resumeLoad {
    private static final /* synthetic */ resumeLoad[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;
    public static final resumeLoad IconCompatParcelizer = new resumeLoad("FIREBASE", 0, "Firebase");
    public static final resumeLoad write = new resumeLoad("MIXPANEL", 1, "Mixpanel");
    public static final resumeLoad RemoteActionCompatParcelizer = new resumeLoad("CLEVERTAP", 2, "Clevertap");
    public static final resumeLoad read = new resumeLoad("FACEBOOK", 3, "Facebook");
    private static resumeLoad AudioAttributesImplApi21Parcelizer = new resumeLoad("OTHER", 4, "Other");

    private resumeLoad(String str, int i, String str2) {
        this.RemoteActionCompatParcelizer = str2;
    }

    static {
        resumeLoad[] resumeloadArr = read();
        AudioAttributesCompatParcelizer = resumeloadArr;
        getMagicModuleTimeline.IconCompatParcelizer(resumeloadArr);
    }

    public static resumeLoad valueOf(String str) {
        return (resumeLoad) Enum.valueOf(resumeLoad.class, str);
    }

    public static resumeLoad[] values() {
        return (resumeLoad[]) AudioAttributesCompatParcelizer.clone();
    }

    private static final /* synthetic */ resumeLoad[] read() {
        return new resumeLoad[]{IconCompatParcelizer, write, RemoteActionCompatParcelizer, read, AudioAttributesImplApi21Parcelizer};
    }
}
