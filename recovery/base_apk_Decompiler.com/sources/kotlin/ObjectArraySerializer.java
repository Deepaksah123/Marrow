package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.PolymorphicTypeValidator;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectArraySerializer extends ClassStack {
    private long AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final ArrayList<NumberSerializersShortSerializer> MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final PolymorphicTypeValidator.IconCompatParcelizer MediaBrowserCompatMediaItem;
    private final long RatingCompat;
    private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private IconCompatParcelizer read;
    private final boolean write;

    public static final class AudioAttributesCompatParcelizer extends IOException {
        public final int RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(int i) {
            StringBuilder sb = new StringBuilder("Illegal clipping: ");
            sb.append(IconCompatParcelizer(i));
            super(sb.toString());
            this.RemoteActionCompatParcelizer = i;
        }

        private static String IconCompatParcelizer(int i) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i == 1) {
                return "not seekable to start";
            }
            if (i == 2) {
                return "start exceeds end";
            }
            return "unknown";
        }
    }

    public ObjectArraySerializer(StdKeySerializers stdKeySerializers, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((StdKeySerializers) buildTypeSerializer.IconCompatParcelizer(stdKeySerializers));
        buildTypeSerializer.IconCompatParcelizer(j >= 0);
        this.RatingCompat = j;
        this.AudioAttributesImplBaseParcelizer = j2;
        this.IconCompatParcelizer = z;
        this.write = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
        this.MediaBrowserCompatMediaItem = new PolymorphicTypeValidator.IconCompatParcelizer();
    }

    @Override // kotlin.ClassStack, kotlin.StdKeySerializers
    public final boolean canUpdateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        return getMediaItem().IconCompatParcelizer.equals(jsonSerializableSchema.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer.canUpdateMediaItem(jsonSerializableSchema);
    }

    @Override // kotlin.NumberSerializersIntegerSerializer, kotlin.StdKeySerializers
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (audioAttributesCompatParcelizer != null) {
            throw audioAttributesCompatParcelizer;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // kotlin.ClassStack, kotlin.StdKeySerializers
    public final StdJdkSerializersAtomicIntegerSerializer createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        NumberSerializersShortSerializer numberSerializersShortSerializer = new NumberSerializersShortSerializer(this.AudioAttributesCompatParcelizer.createPeriod(writeVar, _findwellknownsimple, j), this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver.add(numberSerializersShortSerializer);
        return numberSerializersShortSerializer;
    }

    @Override // kotlin.ClassStack, kotlin.StdKeySerializers
    public final void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver.remove(stdJdkSerializersAtomicIntegerSerializer));
        this.AudioAttributesCompatParcelizer.releasePeriod(((NumberSerializersShortSerializer) stdJdkSerializersAtomicIntegerSerializer).write);
        if (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty() || this.write) {
            return;
        }
        IconCompatParcelizer(((IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.read)).write);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.NumberSerializersIntegerSerializer, kotlin.NumberSerializers1
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.RemoteActionCompatParcelizer = null;
        this.read = null;
    }

    @Override // kotlin.ClassStack
    protected final void read(PolymorphicTypeValidator polymorphicTypeValidator) {
        if (this.RemoteActionCompatParcelizer != null) {
            return;
        }
        IconCompatParcelizer(polymorphicTypeValidator);
    }

    private void IconCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator) {
        long j;
        long j2;
        polymorphicTypeValidator.RemoteActionCompatParcelizer(0, this.MediaBrowserCompatMediaItem);
        long j3 = this.MediaBrowserCompatMediaItem.read();
        if (this.read == null || this.MediaBrowserCompatCustomActionResultReceiver.isEmpty() || this.write) {
            long j4 = this.RatingCompat;
            long j5 = this.AudioAttributesImplBaseParcelizer;
            if (this.MediaBrowserCompatItemReceiver) {
                long jIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
                j4 += jIconCompatParcelizer;
                j5 += jIconCompatParcelizer;
            }
            this.AudioAttributesImplApi21Parcelizer = j3 + j4;
            this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplBaseParcelizer != Long.MIN_VALUE ? j3 + j5 : Long.MIN_VALUE;
            int size = this.MediaBrowserCompatCustomActionResultReceiver.size();
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompatCustomActionResultReceiver.get(i).RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer);
            }
            j = j4;
            j2 = j5;
        } else {
            long j6 = this.AudioAttributesImplApi21Parcelizer - j3;
            j2 = this.AudioAttributesImplBaseParcelizer != Long.MIN_VALUE ? this.AudioAttributesImplApi26Parcelizer - j3 : Long.MIN_VALUE;
            j = j6;
        }
        try {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(polymorphicTypeValidator, j, j2);
            this.read = iconCompatParcelizer;
            refreshSourceInfo(iconCompatParcelizer);
        } catch (AudioAttributesCompatParcelizer e) {
            this.RemoteActionCompatParcelizer = e;
            for (int i2 = 0; i2 < this.MediaBrowserCompatCustomActionResultReceiver.size(); i2++) {
                this.MediaBrowserCompatCustomActionResultReceiver.get(i2).RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        }
    }

    static final class IconCompatParcelizer extends StdArraySerializersFloatArraySerializer {
        private final boolean AudioAttributesCompatParcelizer;
        private final long AudioAttributesImplApi26Parcelizer;
        private final long IconCompatParcelizer;
        private final long read;

        public IconCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, long j, long j2) throws AudioAttributesCompatParcelizer {
            super(polymorphicTypeValidator);
            boolean z = false;
            if (polymorphicTypeValidator.IconCompatParcelizer() != 1) {
                throw new AudioAttributesCompatParcelizer(0);
            }
            PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = polymorphicTypeValidator.RemoteActionCompatParcelizer(0, new PolymorphicTypeValidator.IconCompatParcelizer());
            long jMax = Math.max(0L, j);
            if (!iconCompatParcelizerRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver && jMax != 0 && !iconCompatParcelizerRemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) {
                throw new AudioAttributesCompatParcelizer(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? iconCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer : Math.max(0L, j2);
            if (iconCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer != C.TIME_UNSET) {
                jMax2 = jMax2 > iconCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer ? iconCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer : jMax2;
                if (jMax > jMax2) {
                    throw new AudioAttributesCompatParcelizer(2);
                }
            }
            this.AudioAttributesImplApi26Parcelizer = jMax;
            this.read = jMax2;
            this.IconCompatParcelizer = jMax2 == C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
            if (iconCompatParcelizerRemoteActionCompatParcelizer.write && (jMax2 == C.TIME_UNSET || (iconCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer != C.TIME_UNSET && jMax2 == iconCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer))) {
                z = true;
            }
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
            this.write.write(0, iconCompatParcelizer, 0L);
            iconCompatParcelizer.MediaBrowserCompatMediaItem += this.AudioAttributesImplApi26Parcelizer;
            iconCompatParcelizer.IconCompatParcelizer = this.IconCompatParcelizer;
            iconCompatParcelizer.write = this.AudioAttributesCompatParcelizer;
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer != C.TIME_UNSET) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
                long j2 = this.read;
                long jMin = iconCompatParcelizer.AudioAttributesCompatParcelizer;
                if (j2 != C.TIME_UNSET) {
                    jMin = Math.min(jMin, this.read);
                }
                iconCompatParcelizer.AudioAttributesCompatParcelizer = jMin;
                iconCompatParcelizer.AudioAttributesCompatParcelizer -= this.AudioAttributesImplApi26Parcelizer;
            }
            long jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            if (iconCompatParcelizer.MediaMetadataCompat != C.TIME_UNSET) {
                iconCompatParcelizer.MediaMetadataCompat += jAudioAttributesCompatParcelizer;
            }
            if (iconCompatParcelizer.RatingCompat != C.TIME_UNSET) {
                iconCompatParcelizer.RatingCompat += jAudioAttributesCompatParcelizer;
            }
            return iconCompatParcelizer;
        }

        @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
            this.write.RemoteActionCompatParcelizer(0, audioAttributesCompatParcelizer, z);
            long jIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer() - this.AudioAttributesImplApi26Parcelizer;
            long j = this.IconCompatParcelizer;
            return audioAttributesCompatParcelizer.read(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer.write, j != C.TIME_UNSET ? j - jIconCompatParcelizer : -9223372036854775807L, jIconCompatParcelizer);
        }
    }
}
