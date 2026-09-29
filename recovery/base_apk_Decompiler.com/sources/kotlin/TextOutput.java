package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\b"}, d2 = {"Lo/TextOutput;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "AudioAttributesImplApi26Parcelizer", "I", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TextOutput {
    private static final /* synthetic */ TextOutput[] MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int read;
    public static final TextOutput MediaBrowserCompatCustomActionResultReceiver = new TextOutput("QBANK", 0, 1);
    public static final TextOutput AudioAttributesImplBaseParcelizer = new TextOutput("TEST", 1, 2);
    public static final TextOutput AudioAttributesCompatParcelizer = new TextOutput("CUSTOM_MODULE", 2, 3);
    public static final TextOutput write = new TextOutput("BOOKMARK", 3, 4);
    public static final TextOutput IconCompatParcelizer = new TextOutput("PEARL", 4, 5);
    public static final TextOutput RemoteActionCompatParcelizer = new TextOutput("MAGIC_MODULE", 5, 6);
    public static final TextOutput read = new TextOutput("ACTIVE_RECALL", 6, 7);

    private TextOutput(String str, int i, int i2) {
        this.read = i2;
    }

    static {
        TextOutput[] textOutputArr = read();
        MediaBrowserCompatItemReceiver = textOutputArr;
        getMagicModuleTimeline.IconCompatParcelizer(textOutputArr);
    }

    private static final /* synthetic */ TextOutput[] read() {
        return new TextOutput[]{MediaBrowserCompatCustomActionResultReceiver, AudioAttributesImplBaseParcelizer, AudioAttributesCompatParcelizer, write, IconCompatParcelizer, RemoteActionCompatParcelizer, read};
    }

    public static TextOutput valueOf(String str) {
        return (TextOutput) Enum.valueOf(TextOutput.class, str);
    }

    public static TextOutput[] values() {
        return (TextOutput[]) MediaBrowserCompatItemReceiver.clone();
    }
}
