package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0007\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lo/LearnMoreResponseSpecials;", "", "<init>", "()V", "", "p0", "Lo/LearnMoreResponseCompanion;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/LearnMoreResponseCompanion;", "RemoteActionCompatParcelizer", "Lo/newYearNameItem;", "Lo/newYearNameItem;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LearnMoreResponseSpecials {
    public static final LearnMoreResponseSpecials INSTANCE = new LearnMoreResponseSpecials();
    private static final newYearNameItem AudioAttributesCompatParcelizer = new newYearNameItem(".+@.+\\..+");

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final newYearNameItem IconCompatParcelizer = new newYearNameItem("^[0-9a-fA-F]+$");

    private LearnMoreResponseSpecials() {
    }

    @getMagicModuleMeta
    public static final LearnMoreResponseCompanion AudioAttributesCompatParcelizer(String p0) {
        String str = p0;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            return LearnMoreResponseCompanion.RemoteActionCompatParcelizer;
        }
        if (p0.length() != 24) {
            return LearnMoreResponseCompanion.write;
        }
        if (!IconCompatParcelizer.write(str)) {
            return LearnMoreResponseCompanion.AudioAttributesImplApi26Parcelizer;
        }
        return LearnMoreResponseCompanion.MediaBrowserCompatItemReceiver;
    }

    @getMagicModuleMeta
    public static final LearnMoreResponseCompanion RemoteActionCompatParcelizer(String p0) {
        String str = p0;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            return LearnMoreResponseCompanion.IconCompatParcelizer;
        }
        if (!AudioAttributesCompatParcelizer.write(str)) {
            return LearnMoreResponseCompanion.AudioAttributesCompatParcelizer;
        }
        return LearnMoreResponseCompanion.MediaBrowserCompatItemReceiver;
    }
}
