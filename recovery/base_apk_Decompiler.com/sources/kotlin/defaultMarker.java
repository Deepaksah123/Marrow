package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lo/defaultMarker;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "MediaBrowserCompatItemReceiver", "I", "read", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class defaultMarker {
    private static final /* synthetic */ defaultMarker[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int read;
    public static final defaultMarker AudioAttributesImplApi26Parcelizer = new defaultMarker("InitSelection", 0, -1);
    public static final defaultMarker read = new defaultMarker("CountrySelection", 1, 1);
    public static final defaultMarker AudioAttributesImplBaseParcelizer = new defaultMarker("StateSelection", 2, 1);
    public static final defaultMarker AudioAttributesCompatParcelizer = new defaultMarker("CollegeSelection", 3, 1);
    public static final defaultMarker RemoteActionCompatParcelizer = new defaultMarker("CollegeConfirmation", 4, 1);
    public static final defaultMarker IconCompatParcelizer = new defaultMarker("CollegeYOA", 5, 2);
    public static final defaultMarker write = new defaultMarker("CollegeSelectionCompleted", 6, -1);

    private defaultMarker(String str, int i, int i2) {
        this.read = i2;
    }

    static {
        defaultMarker[] defaultmarkerArr = read();
        MediaBrowserCompatCustomActionResultReceiver = defaultmarkerArr;
        getMagicModuleTimeline.IconCompatParcelizer(defaultmarkerArr);
    }

    private static final /* synthetic */ defaultMarker[] read() {
        return new defaultMarker[]{AudioAttributesImplApi26Parcelizer, read, AudioAttributesImplBaseParcelizer, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, IconCompatParcelizer, write};
    }

    public static defaultMarker valueOf(String str) {
        return (defaultMarker) Enum.valueOf(defaultMarker.class, str);
    }

    public static defaultMarker[] values() {
        return (defaultMarker[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
