package kotlin;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import kotlin.getDownloadRequest;

/* JADX INFO: loaded from: classes3.dex */
final class getTrackSelections<T> extends isBeforeFirst<T> {
    private final isBeforeFirst<T> AudioAttributesCompatParcelizer;
    private final setDownloadingStatesToQueued RemoteActionCompatParcelizer;
    private final Type read;

    getTrackSelections(setDownloadingStatesToQueued setdownloadingstatestoqueued, isBeforeFirst<T> isbeforefirst, Type type) {
        this.RemoteActionCompatParcelizer = setdownloadingstatestoqueued;
        this.AudioAttributesCompatParcelizer = isbeforefirst;
        this.read = type;
    }

    @Override // kotlin.isBeforeFirst
    public final T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
    }

    @Override // kotlin.isBeforeFirst
    public final void read(DownloadHelper2 downloadHelper2, T t) throws IOException {
        isBeforeFirst<T> isbeforefirstIconCompatParcelizer = this.AudioAttributesCompatParcelizer;
        Type typeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.read, t);
        if (typeAudioAttributesCompatParcelizer != this.read) {
            isbeforefirstIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.write(typeAudioAttributesCompatParcelizer));
            if ((isbeforefirstIconCompatParcelizer instanceof getDownloadRequest.read) && !RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
                isbeforefirstIconCompatParcelizer = this.AudioAttributesCompatParcelizer;
            }
        }
        isbeforefirstIconCompatParcelizer.read(downloadHelper2, t);
    }

    private static boolean RemoteActionCompatParcelizer(isBeforeFirst<?> isbeforefirst) {
        isBeforeFirst<?> isbeforefirstIconCompatParcelizer;
        while ((isbeforefirst instanceof getManifest) && (isbeforefirstIconCompatParcelizer = ((getManifest) isbeforefirst).IconCompatParcelizer()) != isbeforefirst) {
            isbeforefirst = isbeforefirstIconCompatParcelizer;
        }
        return isbeforefirst instanceof getDownloadRequest.read;
    }

    private static Type AudioAttributesCompatParcelizer(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }
}
