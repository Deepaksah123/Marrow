package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/MediaParserExtractorAdapter;", "", "<init>", "()V", "Lkotlin/Function0;", "", "p0", "AudioAttributesCompatParcelizer", "(Lo/getCreatedOnDateMs;)V", "write", "", "read", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MediaParserExtractorAdapter {
    public static final MediaParserExtractorAdapter INSTANCE = new MediaParserExtractorAdapter();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static volatile boolean AudioAttributesCompatParcelizer;

    private MediaParserExtractorAdapter() {
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        synchronized (INSTANCE) {
            if (!AudioAttributesCompatParcelizer) {
                p0.invoke();
                AudioAttributesCompatParcelizer = true;
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    @getMagicModuleMeta
    public static final void write() {
        synchronized (INSTANCE) {
            AudioAttributesCompatParcelizer = false;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
