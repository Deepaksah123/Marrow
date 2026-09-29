package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.reportInputMismatch;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00068\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\f\u0010\u0017"}, d2 = {"Lo/readValue;", "Lo/reportBadCoercion;", "<init>", "()V", "", "p0", "Lo/getReferencedType;", "p1", "", "RemoteActionCompatParcelizer", "(JJ)V", "Lo/UnsupportedTypeDeserializer;", "AudioAttributesCompatParcelizer", "(J)J", "Lo/getArrayBuilders;", "IconCompatParcelizer", "(Lo/getArrayBuilders;J)V", "write", "Lo/reportInputMismatch$write;", "read", "Lo/reportInputMismatch$write;", "Lo/reportInputMismatch;", "Lo/reportInputMismatch;", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class readValue implements reportBadCoercion {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public long write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final reportInputMismatch read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final reportInputMismatch.write IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final reportInputMismatch AudioAttributesCompatParcelizer;

    public readValue() {
        reportInputMismatch.write writeVar = reportInputMismatch.write.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = writeVar;
        boolean z = false;
        int i = 1;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        this.AudioAttributesCompatParcelizer = new reportInputMismatch(z, writeVar, i, magicModuleRepositoryImplExternalSyntheticLambda0);
        this.read = new reportInputMismatch(z, writeVar, i, magicModuleRepositoryImplExternalSyntheticLambda0);
        this.write = getReferencedType.INSTANCE.write();
    }

    @Override // kotlin.reportBadCoercion
    public final void RemoteActionCompatParcelizer(long p0, long p1) {
        this.AudioAttributesCompatParcelizer.write(p0, Float.intBitsToFloat((int) (p1 >> 32)));
        this.read.write(p0, Float.intBitsToFloat((int) p1));
    }

    @Override // kotlin.reportBadCoercion
    public final long AudioAttributesCompatParcelizer(long p0) {
        if (UnsupportedTypeDeserializer.read(p0) <= BitmapDescriptorFactory.HUE_RED || UnsupportedTypeDeserializer.AudioAttributesCompatParcelizer(p0) <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder("maximumVelocity should be a positive value. You specified=");
            sb.append((Object) UnsupportedTypeDeserializer.MediaBrowserCompatItemReceiver(p0));
            reportWrongTokenException.read(sb.toString());
        }
        return ValueInjector.read(this.AudioAttributesCompatParcelizer.write(UnsupportedTypeDeserializer.read(p0)), this.read.write(UnsupportedTypeDeserializer.AudioAttributesCompatParcelizer(p0)));
    }

    @Override // kotlin.reportBadCoercion
    public final void IconCompatParcelizer(getArrayBuilders p0, long p1) {
        if (reportUnresolvedObjectId.write()) {
            RemoteActionCompatParcelizer(p0, p1);
        } else {
            write(p0, p1);
        }
    }

    @Override // kotlin.reportBadCoercion
    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        this.read.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = 0L;
    }

    private final void write(getArrayBuilders p0, long p1) {
        if (bufferAsCopyOfValue.read(p0)) {
            this.write = p0.getRead();
            AudioAttributesCompatParcelizer();
        }
        long audioAttributesImplBaseParcelizer = p0.getAudioAttributesImplBaseParcelizer();
        List<findTypeDeserializer> list = p0.read();
        int size = list.size();
        int i = 0;
        while (i < size) {
            findTypeDeserializer findtypedeserializer = list.get(i);
            long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer(findtypedeserializer.getRemoteActionCompatParcelizer(), audioAttributesImplBaseParcelizer);
            long remoteActionCompatParcelizer = findtypedeserializer.getRemoteActionCompatParcelizer();
            this.write = getReferencedType.RemoteActionCompatParcelizer(this.write, jAudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer(findtypedeserializer.getAudioAttributesCompatParcelizer(), getReferencedType.RemoteActionCompatParcelizer(this.write, p1));
            i++;
            audioAttributesImplBaseParcelizer = remoteActionCompatParcelizer;
        }
        this.write = getReferencedType.RemoteActionCompatParcelizer(this.write, getReferencedType.AudioAttributesCompatParcelizer(p0.getRead(), audioAttributesImplBaseParcelizer));
        RemoteActionCompatParcelizer(p0.getWrite(), getReferencedType.RemoteActionCompatParcelizer(this.write, p1));
    }

    private final void RemoteActionCompatParcelizer(getArrayBuilders p0, long p1) {
        if (bufferAsCopyOfValue.read(p0)) {
            AudioAttributesCompatParcelizer();
        }
        if (!bufferAsCopyOfValue.AudioAttributesCompatParcelizer(p0)) {
            List<findTypeDeserializer> list = p0.read();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                findTypeDeserializer findtypedeserializer = list.get(i);
                RemoteActionCompatParcelizer(findtypedeserializer.getAudioAttributesCompatParcelizer(), getReferencedType.RemoteActionCompatParcelizer(findtypedeserializer.getRead(), p1));
            }
            RemoteActionCompatParcelizer(p0.getWrite(), getReferencedType.RemoteActionCompatParcelizer(p0.getMediaMetadataCompat(), p1));
        }
        if (bufferAsCopyOfValue.AudioAttributesCompatParcelizer(p0) && p0.getWrite() - this.RemoteActionCompatParcelizer > 40) {
            AudioAttributesCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer = p0.getWrite();
    }
}
