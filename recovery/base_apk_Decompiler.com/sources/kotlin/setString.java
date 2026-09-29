package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lo/setString;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "AudioAttributesImplApi26Parcelizer", "I", "write", "()I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setString {
    private static final /* synthetic */ setString[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int write;
    public static final setString IconCompatParcelizer = new setString("TYPE_EMPTY_TEST_MONTH_ITEM", 0, 1);
    public static final setString RemoteActionCompatParcelizer = new setString("TYPE_EXPAND_ALL_ITEM", 1, 2);
    public static final setString write = new setString("TYPE_MONTH_TEST_ROW_ITEM", 2, 3);
    public static final setString read = new setString("TYPE_PREV_YEAR_TEST_ROW_ITEM", 3, 4);
    public static final setString AudioAttributesImplApi21Parcelizer = new setString("TYPE_TEST_ROW_ITEM", 4, 5);
    public static final setString MediaBrowserCompatItemReceiver = new setString("TYPE_TEXT_LABEL_ITEM", 5, 6);
    public static final setString AudioAttributesCompatParcelizer = new setString("TYPE_GT_NUDGE_BANNER", 6, 7);

    private setString(String str, int i, int i2) {
        this.write = i2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    static {
        setString[] setstringArr = read();
        MediaBrowserCompatCustomActionResultReceiver = setstringArr;
        getMagicModuleTimeline.IconCompatParcelizer(setstringArr);
    }

    private static final /* synthetic */ setString[] read() {
        return new setString[]{IconCompatParcelizer, RemoteActionCompatParcelizer, write, read, AudioAttributesImplApi21Parcelizer, MediaBrowserCompatItemReceiver, AudioAttributesCompatParcelizer};
    }

    public static setString valueOf(String str) {
        return (setString) Enum.valueOf(setString.class, str);
    }

    public static setString[] values() {
        return (setString[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
