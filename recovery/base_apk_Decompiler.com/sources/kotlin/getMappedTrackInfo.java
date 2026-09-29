package kotlin;

import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class getMappedTrackInfo<T> extends getManifest<T> {
    private final DownloadState<T> AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private final DownloadHelperExternalSyntheticLambda3<T> MediaBrowserCompatItemReceiver;
    private volatile isBeforeFirst<T> RemoteActionCompatParcelizer;
    private final DefaultDownloadIndex1<T> read;
    final setDownloadingStatesToQueued write;
    private final getMappedTrackInfo<T>.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(this, 0);
    private final isAfterLast AudioAttributesImplBaseParcelizer = null;

    public getMappedTrackInfo(DownloadState<T> downloadState, DefaultDownloadIndex1<T> defaultDownloadIndex1, setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3, boolean z) {
        this.AudioAttributesImplApi26Parcelizer = downloadState;
        this.read = defaultDownloadIndex1;
        this.write = setdownloadingstatestoqueued;
        this.MediaBrowserCompatItemReceiver = downloadHelperExternalSyntheticLambda3;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.isBeforeFirst
    public final T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (this.read == null) {
            return AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        }
        getCount getcountIconCompatParcelizer = getDefaultTrackSelectorParameters.IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        if (this.IconCompatParcelizer && getcountIconCompatParcelizer.MediaMetadataCompat()) {
            return null;
        }
        return this.read.RemoteActionCompatParcelizer(getcountIconCompatParcelizer, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, T t) throws IOException {
        DownloadState<T> downloadState = this.AudioAttributesImplApi26Parcelizer;
        if (downloadState == null) {
            AudioAttributesCompatParcelizer().read(downloadHelper2, t);
        } else if (this.IconCompatParcelizer && t == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            getDefaultTrackSelectorParameters.AudioAttributesCompatParcelizer(downloadState.write(), downloadHelper2);
        }
    }

    private isBeforeFirst<T> AudioAttributesCompatParcelizer() {
        isBeforeFirst<T> isbeforefirst = this.RemoteActionCompatParcelizer;
        if (isbeforefirst != null) {
            return isbeforefirst;
        }
        isBeforeFirst<T> isbeforefirstAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
        this.RemoteActionCompatParcelizer = isbeforefirstAudioAttributesCompatParcelizer;
        return isbeforefirstAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getManifest
    public final isBeforeFirst<T> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer != null ? this : AudioAttributesCompatParcelizer();
    }

    final class RemoteActionCompatParcelizer implements isClosed {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(getMappedTrackInfo getmappedtrackinfo, byte b) {
            this();
        }

        @Override // kotlin.isClosed
        public final <R> R read(getCount getcount, Type type) throws Download {
            return (R) getMappedTrackInfo.this.write.RemoteActionCompatParcelizer(getcount, type);
        }
    }
}
