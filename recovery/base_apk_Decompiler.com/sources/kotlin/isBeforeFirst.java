package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class isBeforeFirst<T> {
    public abstract T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException;

    public abstract void read(DownloadHelper2 downloadHelper2, T t) throws IOException;

    public final isBeforeFirst<T> read() {
        return new isBeforeFirst<T>() { // from class: o.isBeforeFirst.1
            @Override // kotlin.isBeforeFirst
            public final void read(DownloadHelper2 downloadHelper2, T t) throws IOException {
                if (t == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    isBeforeFirst.this.read(downloadHelper2, t);
                }
            }

            @Override // kotlin.isBeforeFirst
            public final T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return (T) isBeforeFirst.this.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }
        };
    }

    public final getCount write(T t) {
        try {
            addTrackSelection addtrackselection = new addTrackSelection();
            read(addtrackselection, t);
            return addtrackselection.read();
        } catch (IOException e) {
            throw new getDownloaderConstructor(e);
        }
    }
}
