package kotlin;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class onMediaPreparationFailed<E> extends isBeforeFirst<Object> {
    public static final isAfterLast AudioAttributesCompatParcelizer = new isAfterLast() { // from class: o.onMediaPreparationFailed.3
        @Override // kotlin.isAfterLast
        public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
            Type typeRemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda3.RemoteActionCompatParcelizer();
            if (!(typeRemoteActionCompatParcelizer instanceof GenericArrayType) && (!(typeRemoteActionCompatParcelizer instanceof Class) || !((Class) typeRemoteActionCompatParcelizer).isArray())) {
                return null;
            }
            Type type = moveToNext.read(typeRemoteActionCompatParcelizer);
            return new onMediaPreparationFailed(setdownloadingstatestoqueued, setdownloadingstatestoqueued.IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.write(type)), moveToNext.AudioAttributesCompatParcelizer(type));
        }
    };
    private final Class<E> RemoteActionCompatParcelizer;
    private final isBeforeFirst<E> read;

    public onMediaPreparationFailed(setDownloadingStatesToQueued setdownloadingstatestoqueued, isBeforeFirst<E> isbeforefirst, Class<E> cls) {
        this.read = new getTrackSelections(setdownloadingstatestoqueued, isbeforefirst, cls);
        this.RemoteActionCompatParcelizer = cls;
    }

    @Override // kotlin.isBeforeFirst
    public final Object AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        downloadHelperExternalSyntheticLambda4.read();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            arrayList.add(this.read.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
        int size = arrayList.size();
        if (this.RemoteActionCompatParcelizer.isPrimitive()) {
            Object objNewInstance = Array.newInstance((Class<?>) this.RemoteActionCompatParcelizer, size);
            for (int i = 0; i < size; i++) {
                Array.set(objNewInstance, i, arrayList.get(i));
            }
            return objNewInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.RemoteActionCompatParcelizer, size));
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, Object obj) throws IOException {
        if (obj == null) {
            downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        downloadHelper2.write();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.read.read(downloadHelper2, (E) Array.get(obj, i));
        }
        downloadHelper2.AudioAttributesCompatParcelizer();
    }
}
