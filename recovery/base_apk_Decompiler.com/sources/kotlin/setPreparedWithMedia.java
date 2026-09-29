package kotlin;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setPreparedWithMedia implements isAfterLast {
    private final moveToLast AudioAttributesCompatParcelizer;
    final boolean read = false;

    public setPreparedWithMedia(moveToLast movetolast, boolean z) {
        this.AudioAttributesCompatParcelizer = movetolast;
    }

    @Override // kotlin.isAfterLast
    public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
        Type typeRemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda3.RemoteActionCompatParcelizer();
        Class<? super T> clsAudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
        if (!Map.class.isAssignableFrom(clsAudioAttributesCompatParcelizer)) {
            return null;
        }
        Type[] typeArrAudioAttributesCompatParcelizer = moveToNext.AudioAttributesCompatParcelizer(typeRemoteActionCompatParcelizer, clsAudioAttributesCompatParcelizer);
        return new RemoteActionCompatParcelizer(setdownloadingstatestoqueued, typeArrAudioAttributesCompatParcelizer[0], IconCompatParcelizer(setdownloadingstatestoqueued, typeArrAudioAttributesCompatParcelizer[0]), typeArrAudioAttributesCompatParcelizer[1], setdownloadingstatestoqueued.IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.write(typeArrAudioAttributesCompatParcelizer[1])), this.AudioAttributesCompatParcelizer.write(downloadHelperExternalSyntheticLambda3));
    }

    private static isBeforeFirst<?> IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return replaceTrackSelections.MediaBrowserCompatItemReceiver;
        }
        return setdownloadingstatestoqueued.IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.write(type));
    }

    final class RemoteActionCompatParcelizer<K, V> extends isBeforeFirst<Map<K, V>> {
        private final isBeforeFirst<K> AudioAttributesCompatParcelizer;
        private final getRendererCapabilities<? extends Map<K, V>> IconCompatParcelizer;
        private final isBeforeFirst<V> read;

        public RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, Type type, isBeforeFirst<K> isbeforefirst, Type type2, isBeforeFirst<V> isbeforefirst2, getRendererCapabilities<? extends Map<K, V>> getrenderercapabilities) {
            this.AudioAttributesCompatParcelizer = new getTrackSelections(setdownloadingstatestoqueued, isbeforefirst, type);
            this.read = new getTrackSelections(setdownloadingstatestoqueued, isbeforefirst2, type2);
            this.IconCompatParcelizer = getrenderercapabilities;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.isBeforeFirst
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map<K, V> AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = downloadHelperExternalSyntheticLambda4.onCustomAction();
            if (downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.NULL) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return null;
            }
            Map<K, V> mapWrite = this.IconCompatParcelizer.write();
            if (downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.BEGIN_ARRAY) {
                downloadHelperExternalSyntheticLambda4.read();
                while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                    downloadHelperExternalSyntheticLambda4.read();
                    K kAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                    if (mapWrite.put(kAudioAttributesCompatParcelizer, this.read.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)) != null) {
                        throw new getPercentDownloaded("duplicate key: ".concat(String.valueOf(kAudioAttributesCompatParcelizer)));
                    }
                    downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
                }
                downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
                return mapWrite;
            }
            downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
            while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                createMediaSourceInternal.IconCompatParcelizer.write(downloadHelperExternalSyntheticLambda4);
                K kAudioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                if (mapWrite.put(kAudioAttributesCompatParcelizer2, this.read.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)) != null) {
                    throw new getPercentDownloaded("duplicate key: ".concat(String.valueOf(kAudioAttributesCompatParcelizer2)));
                }
            }
            downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            return mapWrite;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.isBeforeFirst
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void read(DownloadHelper2 downloadHelper2, Map<K, V> map) throws IOException {
            if (map == null) {
                downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
            if (!setPreparedWithMedia.this.read) {
                downloadHelper2.RemoteActionCompatParcelizer();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    downloadHelper2.read(String.valueOf(entry.getKey()));
                    this.read.read(downloadHelper2, entry.getValue());
                }
                downloadHelper2.IconCompatParcelizer();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                getCount getcountWrite = this.AudioAttributesCompatParcelizer.write(entry2.getKey());
                arrayList.add(getcountWrite);
                arrayList2.add(entry2.getValue());
                z |= getcountWrite.MediaBrowserCompatCustomActionResultReceiver() || getcountWrite.MediaBrowserCompatMediaItem();
            }
            if (z) {
                downloadHelper2.write();
                int size = arrayList.size();
                while (i < size) {
                    downloadHelper2.write();
                    getDefaultTrackSelectorParameters.AudioAttributesCompatParcelizer((getCount) arrayList.get(i), downloadHelper2);
                    this.read.read(downloadHelper2, (V) arrayList2.get(i));
                    downloadHelper2.AudioAttributesCompatParcelizer();
                    i++;
                }
                downloadHelper2.AudioAttributesCompatParcelizer();
                return;
            }
            downloadHelper2.RemoteActionCompatParcelizer();
            int size2 = arrayList.size();
            while (i < size2) {
                downloadHelper2.read(AudioAttributesCompatParcelizer((getCount) arrayList.get(i)));
                this.read.read(downloadHelper2, (V) arrayList2.get(i));
                i++;
            }
            downloadHelper2.IconCompatParcelizer();
        }

        private static String AudioAttributesCompatParcelizer(getCount getcount) {
            if (getcount.MediaBrowserCompatSearchResultReceiver()) {
                createDownloaderConstructors createdownloaderconstructorsAudioAttributesImplApi21Parcelizer = getcount.AudioAttributesImplApi21Parcelizer();
                if (createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.MediaDescriptionCompat()) {
                    return String.valueOf(createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.write());
                }
                if (createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.RatingCompat()) {
                    return Boolean.toString(createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.read());
                }
                if (createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    return createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer();
                }
                throw new AssertionError();
            }
            if (getcount.MediaMetadataCompat()) {
                return "null";
            }
            throw new AssertionError();
        }
    }
}
