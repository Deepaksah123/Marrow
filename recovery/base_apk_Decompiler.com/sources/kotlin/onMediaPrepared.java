package kotlin;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onMediaPrepared<T extends Date> extends isBeforeFirst<T> {
    private final AudioAttributesCompatParcelizer<T> AudioAttributesCompatParcelizer;
    private final List<DateFormat> RemoteActionCompatParcelizer;

    public static abstract class AudioAttributesCompatParcelizer<T extends Date> {
        private final Class<T> AudioAttributesCompatParcelizer;

        static {
            new AudioAttributesCompatParcelizer<Date>(Date.class) { // from class: o.onMediaPrepared.AudioAttributesCompatParcelizer.4
            };
        }

        public AudioAttributesCompatParcelizer(Class<T> cls) {
            this.AudioAttributesCompatParcelizer = cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    public void read(DownloadHelper2 downloadHelper2, Date date) throws IOException {
        if (date == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isBeforeFirst
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
            return null;
        }
        IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        throw null;
    }

    private Date IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
