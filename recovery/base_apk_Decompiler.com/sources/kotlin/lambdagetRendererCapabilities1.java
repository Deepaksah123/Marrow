package kotlin;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdagetRendererCapabilities1 implements isAfterLast {
    private final moveToLast RemoteActionCompatParcelizer;

    public lambdagetRendererCapabilities1(moveToLast movetolast) {
        this.RemoteActionCompatParcelizer = movetolast;
    }

    @Override // kotlin.isAfterLast
    public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
        Type typeRemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda3.RemoteActionCompatParcelizer();
        Class<? super T> clsAudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
        if (!Collection.class.isAssignableFrom(clsAudioAttributesCompatParcelizer)) {
            return null;
        }
        Type typeIconCompatParcelizer = moveToNext.IconCompatParcelizer(typeRemoteActionCompatParcelizer, (Class<?>) clsAudioAttributesCompatParcelizer);
        return new write(setdownloadingstatestoqueued, typeIconCompatParcelizer, setdownloadingstatestoqueued.IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.write(typeIconCompatParcelizer)), this.RemoteActionCompatParcelizer.write(downloadHelperExternalSyntheticLambda3));
    }

    static final class write<E> extends isBeforeFirst<Collection<E>> {
        private final isBeforeFirst<E> IconCompatParcelizer;
        private final getRendererCapabilities<? extends Collection<E>> RemoteActionCompatParcelizer;

        public write(setDownloadingStatesToQueued setdownloadingstatestoqueued, Type type, isBeforeFirst<E> isbeforefirst, getRendererCapabilities<? extends Collection<E>> getrenderercapabilities) {
            this.IconCompatParcelizer = new getTrackSelections(setdownloadingstatestoqueued, isbeforefirst, type);
            this.RemoteActionCompatParcelizer = getrenderercapabilities;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.isBeforeFirst
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<E> AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return null;
            }
            Collection<E> collectionWrite = this.RemoteActionCompatParcelizer.write();
            downloadHelperExternalSyntheticLambda4.read();
            while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                collectionWrite.add(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
            }
            downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
            return collectionWrite;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.isBeforeFirst
        public void read(DownloadHelper2 downloadHelper2, Collection<E> collection) throws IOException {
            if (collection == null) {
                downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
            downloadHelper2.write();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.IconCompatParcelizer.read(downloadHelper2, it.next());
            }
            downloadHelper2.AudioAttributesCompatParcelizer();
        }
    }
}
