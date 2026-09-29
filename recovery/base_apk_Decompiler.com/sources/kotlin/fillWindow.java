package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/fillWindow;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "read", "Ljava/lang/String;", "write", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fillWindow {
    private static final /* synthetic */ fillWindow[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    public static final fillWindow write = new fillWindow("SEARCH", 0, "search");
    public static final fillWindow RemoteActionCompatParcelizer = new fillWindow("PEARLS_LIST", 1, "pearl_list");
    public static final fillWindow IconCompatParcelizer = new fillWindow("NONE", 2, "");

    private fillWindow(String str, int i, String str2) {
        this.AudioAttributesCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    static {
        fillWindow[] fillwindowArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer = fillwindowArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(fillwindowArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ fillWindow[] AudioAttributesCompatParcelizer() {
        return new fillWindow[]{write, RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static fillWindow valueOf(String str) {
        return (fillWindow) Enum.valueOf(fillWindow.class, str);
    }

    public static fillWindow[] values() {
        return (fillWindow[]) AudioAttributesCompatParcelizer.clone();
    }
}
