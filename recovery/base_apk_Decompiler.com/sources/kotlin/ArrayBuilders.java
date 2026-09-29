package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.getArrayComparator;

/* JADX INFO: loaded from: classes2.dex */
final class ArrayBuilders {
    private long AudioAttributesCompatParcelizer;
    private final getArrayComparator AudioAttributesImplBaseParcelizer;
    private final RemoteActionCompatParcelizer IconCompatParcelizer;
    private deserializeTypedFromObject write;
    private final getArrayComparator.RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer = new getArrayComparator.RemoteActionCompatParcelizer();
    private final ClassNameIdResolver<deserializeTypedFromObject> MediaBrowserCompatCustomActionResultReceiver = new ClassNameIdResolver<>();
    private final ClassNameIdResolver<Long> MediaBrowserCompatItemReceiver = new ClassNameIdResolver<>();
    private final AsDeductionTypeSerializer RemoteActionCompatParcelizer = new AsDeductionTypeSerializer();
    private deserializeTypedFromObject AudioAttributesImplApi26Parcelizer = deserializeTypedFromObject.read;
    private long read = C.TIME_UNSET;

    interface RemoteActionCompatParcelizer {
        void IconCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject);

        void read(long j, boolean z);

        void write();
    }

    public ArrayBuilders(RemoteActionCompatParcelizer remoteActionCompatParcelizer, getArrayComparator getarraycomparator) {
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = getarraycomparator;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        this.read = C.TIME_UNSET;
        if (this.MediaBrowserCompatItemReceiver.read() > 0) {
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(0L, Long.valueOf(((Long) read(this.MediaBrowserCompatItemReceiver)).longValue()));
        }
        if (this.write == null) {
            if (this.MediaBrowserCompatCustomActionResultReceiver.read() > 0) {
                this.write = (deserializeTypedFromObject) read(this.MediaBrowserCompatCustomActionResultReceiver);
                return;
            }
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.read(true);
    }

    public final boolean AudioAttributesCompatParcelizer(long j) {
        long j2 = this.read;
        return j2 != C.TIME_UNSET && j2 >= j;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        buildTypeSerializer.IconCompatParcelizer(f > BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesImplBaseParcelizer.write(f);
    }

    public final void AudioAttributesCompatParcelizer(long j, long j2) throws addNull {
        while (!this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            long jRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            if (read(jRemoteActionCompatParcelizer)) {
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
            }
            int i = this.AudioAttributesImplBaseParcelizer.read(jRemoteActionCompatParcelizer, j, j2, this.AudioAttributesCompatParcelizer, false, this.AudioAttributesImplApi21Parcelizer);
            if (i == 0 || i == 1) {
                this.read = jRemoteActionCompatParcelizer;
                AudioAttributesCompatParcelizer(i == 0);
            } else if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    throw new IllegalStateException(String.valueOf(i));
                }
                return;
            } else {
                this.read = jRemoteActionCompatParcelizer;
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(long j, long j2) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(j, Long.valueOf(j2));
    }

    private void RemoteActionCompatParcelizer() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(Long.valueOf(this.RemoteActionCompatParcelizer.read()));
        this.IconCompatParcelizer.write();
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        long jLongValue = ((Long) buildTypeSerializer.AudioAttributesCompatParcelizer(Long.valueOf(this.RemoteActionCompatParcelizer.read()))).longValue();
        if (IconCompatParcelizer(jLongValue)) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
        if (!z) {
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        }
        this.IconCompatParcelizer.read(jLongValue, this.AudioAttributesImplBaseParcelizer.read());
    }

    private boolean read(long j) {
        Long l = this.MediaBrowserCompatItemReceiver.read(j);
        if (l == null || l.longValue() == this.AudioAttributesCompatParcelizer) {
            return false;
        }
        this.AudioAttributesCompatParcelizer = l.longValue();
        return true;
    }

    private boolean IconCompatParcelizer(long j) {
        deserializeTypedFromObject deserializetypedfromobject = this.MediaBrowserCompatCustomActionResultReceiver.read(j);
        if (deserializetypedfromobject == null || deserializetypedfromobject.equals(deserializeTypedFromObject.read) || deserializetypedfromobject.equals(this.AudioAttributesImplApi26Parcelizer)) {
            return false;
        }
        this.AudioAttributesImplApi26Parcelizer = deserializetypedfromobject;
        return true;
    }

    private static <T> T read(ClassNameIdResolver<T> classNameIdResolver) {
        buildTypeSerializer.IconCompatParcelizer(classNameIdResolver.read() > 0);
        while (classNameIdResolver.read() > 1) {
            classNameIdResolver.IconCompatParcelizer();
        }
        return (T) buildTypeSerializer.IconCompatParcelizer(classNameIdResolver.IconCompatParcelizer());
    }
}
