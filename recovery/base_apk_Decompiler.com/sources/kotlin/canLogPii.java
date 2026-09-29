package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\t\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\n\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e"}, d2 = {"Lo/canLogPii;", "", "<init>", "()V", "", "p0", "", "IconCompatParcelizer", "(Ljava/lang/String;)Z", "read", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Lo/newYearNameItem;", "Lo/newYearNameItem;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class canLogPii {
    public static final canLogPii INSTANCE = new canLogPii();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final newYearNameItem read = new newYearNameItem("^[a-zA-Z\\s]+$");
    private static final newYearNameItem IconCompatParcelizer = new newYearNameItem("^(\\d{10})$");

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final newYearNameItem AudioAttributesCompatParcelizer = new newYearNameItem("^(\\d{6})$");

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final newYearNameItem RemoteActionCompatParcelizer = new newYearNameItem("^([a-zA-Z0-9\\s\\-\\(\\)']+)$");

    private canLogPii() {
    }

    public static boolean IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return read.write(p0);
    }

    public static boolean read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return IconCompatParcelizer.write(p0);
    }

    public static boolean AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.length() > 0;
    }

    public static boolean write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return RemoteActionCompatParcelizer.write(p0);
    }

    public static boolean RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer.write(p0);
    }
}
