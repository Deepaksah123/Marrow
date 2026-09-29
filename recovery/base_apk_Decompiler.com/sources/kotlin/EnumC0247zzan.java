package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.zzan, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\bj\u0002\b\n"}, d2 = {"Lo/zzan;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "AudioAttributesImplApi21Parcelizer", "I", "AudioAttributesCompatParcelizer", "()I", "read", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "write", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnumC0247zzan {
    private static final /* synthetic */ EnumC0247zzan[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int read;
    public static final EnumC0247zzan MediaBrowserCompatCustomActionResultReceiver = new EnumC0247zzan("ITEM_TYPE_QBANK_TRACKER", 0, 1);
    public static final EnumC0247zzan MediaBrowserCompatItemReceiver = new EnumC0247zzan("ITEM_TYPE_QBANK_SUGGESTION", 1, 2);
    public static final EnumC0247zzan RemoteActionCompatParcelizer = new EnumC0247zzan("ITEM_TYPE_QBANK_EXTRA_FUNCTIONALITY", 2, 3);
    public static final EnumC0247zzan write = new EnumC0247zzan("ITEM_TYPE_QBANK_PLAN_BANNER", 3, 4);
    public static final EnumC0247zzan AudioAttributesImplApi26Parcelizer = new EnumC0247zzan("ITEM_TYPE_QBANK_SUBJECT", 4, 5);
    public static final EnumC0247zzan IconCompatParcelizer = new EnumC0247zzan("ITEM_TYPE_QBANK_DIVIDER", 5, 6);
    public static final EnumC0247zzan AudioAttributesCompatParcelizer = new EnumC0247zzan("ITEM_TYPE_QBANK_SCHEMA", 6, 7);
    public static final EnumC0247zzan read = new EnumC0247zzan("ITEM_TYPE_QBANK_MANIFESTO", 7, 8);

    private EnumC0247zzan(String str, int i, int i2) {
        this.read = i2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    static {
        EnumC0247zzan[] enumC0247zzanArrIconCompatParcelizer = IconCompatParcelizer();
        AudioAttributesImplBaseParcelizer = enumC0247zzanArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(enumC0247zzanArrIconCompatParcelizer);
    }

    private static final /* synthetic */ EnumC0247zzan[] IconCompatParcelizer() {
        return new EnumC0247zzan[]{MediaBrowserCompatCustomActionResultReceiver, MediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer, write, AudioAttributesImplApi26Parcelizer, IconCompatParcelizer, AudioAttributesCompatParcelizer, read};
    }

    public static EnumC0247zzan valueOf(String str) {
        return (EnumC0247zzan) Enum.valueOf(EnumC0247zzan.class, str);
    }

    public static EnumC0247zzan[] values() {
        return (EnumC0247zzan[]) AudioAttributesImplBaseParcelizer.clone();
    }
}
