package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.JsonSerializableSchema;
import kotlin.PolymorphicTypeValidator;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class StdScalarSerializer extends NumberSerializersIntegerSerializer<Integer> {
    private static final JsonSerializableSchema RemoteActionCompatParcelizer = new JsonSerializableSchema.IconCompatParcelizer().RemoteActionCompatParcelizer("MergingMediaSource").IconCompatParcelizer();
    private final Map<Object, Long> AudioAttributesCompatParcelizer;
    private final StdKeySerializers[] AudioAttributesImplApi21Parcelizer;
    private final ArrayList<StdKeySerializers> AudioAttributesImplApi26Parcelizer;
    private final _useStatic AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private long[][] MediaDescriptionCompat;
    private final PolymorphicTypeValidator[] MediaMetadataCompat;
    private final outputPendingMetadataSamples<Object, NumberSerializersShortSerializer> read;
    private final boolean write;

    public static final class IconCompatParcelizer extends IOException {
        public final int write = 0;
    }

    @Override // kotlin.NumberSerializersIntegerSerializer
    protected final /* synthetic */ StdKeySerializers.write IconCompatParcelizer(Integer num, StdKeySerializers.write writeVar) {
        return RemoteActionCompatParcelizer(num, writeVar);
    }

    public StdScalarSerializer(StdKeySerializers... stdKeySerializersArr) {
        this(stdKeySerializersArr, (byte) 0);
    }

    private StdScalarSerializer(StdKeySerializers[] stdKeySerializersArr, byte b) {
        this(false, stdKeySerializersArr);
    }

    private StdScalarSerializer(boolean z, StdKeySerializers... stdKeySerializersArr) {
        this(false, false, new SerializableSerializer(), stdKeySerializersArr);
    }

    private StdScalarSerializer(boolean z, boolean z2, _useStatic _usestatic, StdKeySerializers... stdKeySerializersArr) {
        this.IconCompatParcelizer = z;
        this.write = false;
        this.AudioAttributesImplApi21Parcelizer = stdKeySerializersArr;
        this.AudioAttributesImplBaseParcelizer = _usestatic;
        this.AudioAttributesImplApi26Parcelizer = new ArrayList<>(Arrays.asList(stdKeySerializersArr));
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.MediaMetadataCompat = new PolymorphicTypeValidator[stdKeySerializersArr.length];
        this.MediaDescriptionCompat = new long[0][];
        this.AudioAttributesCompatParcelizer = new HashMap();
        this.read = parseSidx.read().RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
    }

    @Override // kotlin.StdKeySerializers
    public final JsonSerializableSchema getMediaItem() {
        StdKeySerializers[] stdKeySerializersArr = this.AudioAttributesImplApi21Parcelizer;
        return stdKeySerializersArr.length > 0 ? stdKeySerializersArr[0].getMediaItem() : RemoteActionCompatParcelizer;
    }

    @Override // kotlin.StdKeySerializers
    public final boolean canUpdateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        StdKeySerializers[] stdKeySerializersArr = this.AudioAttributesImplApi21Parcelizer;
        return stdKeySerializersArr.length > 0 && stdKeySerializersArr[0].canUpdateMediaItem(jsonSerializableSchema);
    }

    @Override // kotlin.StdKeySerializers
    public final void updateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        this.AudioAttributesImplApi21Parcelizer[0].updateMediaItem(jsonSerializableSchema);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.NumberSerializersIntegerSerializer, kotlin.NumberSerializers1
    public final void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver) {
        super.prepareSourceInternal(typeNameIdResolver);
        for (int i = 0; i < this.AudioAttributesImplApi21Parcelizer.length; i++) {
            RemoteActionCompatParcelizer(Integer.valueOf(i), this.AudioAttributesImplApi21Parcelizer[i]);
        }
    }

    @Override // kotlin.NumberSerializersIntegerSerializer, kotlin.StdKeySerializers
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        if (iconCompatParcelizer != null) {
            throw iconCompatParcelizer;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // kotlin.StdKeySerializers
    public final StdJdkSerializersAtomicIntegerSerializer createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        int length = this.AudioAttributesImplApi21Parcelizer.length;
        StdJdkSerializersAtomicIntegerSerializer[] stdJdkSerializersAtomicIntegerSerializerArr = new StdJdkSerializersAtomicIntegerSerializer[length];
        int i = this.MediaMetadataCompat[0].read(writeVar.AudioAttributesCompatParcelizer);
        for (int i2 = 0; i2 < length; i2++) {
            stdJdkSerializersAtomicIntegerSerializerArr[i2] = this.AudioAttributesImplApi21Parcelizer[i2].createPeriod(writeVar.RemoteActionCompatParcelizer(this.MediaMetadataCompat[i2].write(i)), _findwellknownsimple, j - this.MediaDescriptionCompat[i][i2]);
        }
        StdSerializer stdSerializer = new StdSerializer(this.AudioAttributesImplBaseParcelizer, this.MediaDescriptionCompat[i], stdJdkSerializersAtomicIntegerSerializerArr);
        if (!this.write) {
            return stdSerializer;
        }
        NumberSerializersShortSerializer numberSerializersShortSerializer = new NumberSerializersShortSerializer(stdSerializer, true, 0L, ((Long) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.get(writeVar.AudioAttributesCompatParcelizer))).longValue());
        this.read.read(writeVar.AudioAttributesCompatParcelizer, numberSerializersShortSerializer);
        return numberSerializersShortSerializer;
    }

    @Override // kotlin.StdKeySerializers
    public final void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        if (this.write) {
            NumberSerializersShortSerializer numberSerializersShortSerializer = (NumberSerializersShortSerializer) stdJdkSerializersAtomicIntegerSerializer;
            Iterator<Map.Entry<Object, NumberSerializersShortSerializer>> it = this.read.MediaMetadataCompat().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, NumberSerializersShortSerializer> next = it.next();
                if (next.getValue().equals(numberSerializersShortSerializer)) {
                    this.read.write(next.getKey(), next.getValue());
                    break;
                }
            }
            stdJdkSerializersAtomicIntegerSerializer = numberSerializersShortSerializer.write;
        }
        StdSerializer stdSerializer = (StdSerializer) stdJdkSerializersAtomicIntegerSerializer;
        int i = 0;
        while (true) {
            StdKeySerializers[] stdKeySerializersArr = this.AudioAttributesImplApi21Parcelizer;
            if (i >= stdKeySerializersArr.length) {
                return;
            }
            stdKeySerializersArr[i].releasePeriod(stdSerializer.RemoteActionCompatParcelizer(i));
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.NumberSerializersIntegerSerializer, kotlin.NumberSerializers1
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.MediaMetadataCompat, (Object) null);
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplApi26Parcelizer.clear();
        Collections.addAll(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.NumberSerializersIntegerSerializer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(Integer num, StdKeySerializers stdKeySerializers, PolymorphicTypeValidator polymorphicTypeValidator) {
        if (this.MediaBrowserCompatItemReceiver == null) {
            if (this.MediaBrowserCompatCustomActionResultReceiver == -1) {
                this.MediaBrowserCompatCustomActionResultReceiver = polymorphicTypeValidator.IconCompatParcelizer();
            } else if (polymorphicTypeValidator.IconCompatParcelizer() != this.MediaBrowserCompatCustomActionResultReceiver) {
                this.MediaBrowserCompatItemReceiver = new IconCompatParcelizer();
                return;
            }
            if (this.MediaDescriptionCompat.length == 0) {
                this.MediaDescriptionCompat = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaMetadataCompat.length);
            }
            this.AudioAttributesImplApi26Parcelizer.remove(stdKeySerializers);
            this.MediaMetadataCompat[num.intValue()] = polymorphicTypeValidator;
            if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
                if (this.IconCompatParcelizer) {
                    IconCompatParcelizer();
                }
                PolymorphicTypeValidator audioAttributesCompatParcelizer = this.MediaMetadataCompat[0];
                if (this.write) {
                    write();
                    audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer);
                }
                refreshSourceInfo(audioAttributesCompatParcelizer);
            }
        }
    }

    private static StdKeySerializers.write RemoteActionCompatParcelizer(Integer num, StdKeySerializers.write writeVar) {
        if (num.intValue() == 0) {
            return writeVar;
        }
        return null;
    }

    private void IconCompatParcelizer() {
        PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        for (int i = 0; i < this.MediaBrowserCompatCustomActionResultReceiver; i++) {
            long j = -this.MediaMetadataCompat[0].AudioAttributesCompatParcelizer(i, audioAttributesCompatParcelizer).IconCompatParcelizer();
            int i2 = 1;
            while (true) {
                PolymorphicTypeValidator[] polymorphicTypeValidatorArr = this.MediaMetadataCompat;
                if (i2 < polymorphicTypeValidatorArr.length) {
                    this.MediaDescriptionCompat[i][i2] = j - (-polymorphicTypeValidatorArr[i2].AudioAttributesCompatParcelizer(i, audioAttributesCompatParcelizer).IconCompatParcelizer());
                    i2++;
                }
            }
        }
    }

    private void write() {
        PolymorphicTypeValidator[] polymorphicTypeValidatorArr;
        PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        for (int i = 0; i < this.MediaBrowserCompatCustomActionResultReceiver; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                polymorphicTypeValidatorArr = this.MediaMetadataCompat;
                if (i2 >= polymorphicTypeValidatorArr.length) {
                    break;
                }
                long jRemoteActionCompatParcelizer = polymorphicTypeValidatorArr[i2].AudioAttributesCompatParcelizer(i, audioAttributesCompatParcelizer).RemoteActionCompatParcelizer();
                if (jRemoteActionCompatParcelizer != C.TIME_UNSET) {
                    long j2 = jRemoteActionCompatParcelizer + this.MediaDescriptionCompat[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object objWrite = polymorphicTypeValidatorArr[0].write(i);
            this.AudioAttributesCompatParcelizer.put(objWrite, Long.valueOf(j));
            Iterator<NumberSerializersShortSerializer> it = this.read.write(objWrite).iterator();
            while (it.hasNext()) {
                it.next().RemoteActionCompatParcelizer(0L, j);
            }
        }
    }

    static final class AudioAttributesCompatParcelizer extends StdArraySerializersFloatArraySerializer {
        private final long[] AudioAttributesCompatParcelizer;
        private final long[] IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, Map<Object, Long> map) {
            super(polymorphicTypeValidator);
            int iAudioAttributesCompatParcelizer = polymorphicTypeValidator.AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = new long[polymorphicTypeValidator.AudioAttributesCompatParcelizer()];
            PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer = new PolymorphicTypeValidator.IconCompatParcelizer();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                this.IconCompatParcelizer[i] = polymorphicTypeValidator.RemoteActionCompatParcelizer(i, iconCompatParcelizer).IconCompatParcelizer;
            }
            int iIconCompatParcelizer = polymorphicTypeValidator.IconCompatParcelizer();
            this.AudioAttributesCompatParcelizer = new long[iIconCompatParcelizer];
            PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
            for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
                polymorphicTypeValidator.RemoteActionCompatParcelizer(i2, audioAttributesCompatParcelizer, true);
                long jLongValue = ((Long) buildTypeSerializer.IconCompatParcelizer(map.get(audioAttributesCompatParcelizer.write))).longValue();
                this.AudioAttributesCompatParcelizer[i2] = jLongValue == Long.MIN_VALUE ? audioAttributesCompatParcelizer.read : jLongValue;
                if (audioAttributesCompatParcelizer.read != C.TIME_UNSET) {
                    long[] jArr = this.IconCompatParcelizer;
                    int i3 = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
                    jArr[i3] = jArr[i3] - (audioAttributesCompatParcelizer.read - this.AudioAttributesCompatParcelizer[i2]);
                }
            }
        }

        @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
            long jMin;
            super.write(i, iconCompatParcelizer, j);
            iconCompatParcelizer.IconCompatParcelizer = this.IconCompatParcelizer[i];
            if (iconCompatParcelizer.IconCompatParcelizer == C.TIME_UNSET || iconCompatParcelizer.AudioAttributesCompatParcelizer == C.TIME_UNSET) {
                jMin = iconCompatParcelizer.AudioAttributesCompatParcelizer;
            } else {
                jMin = Math.min(iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer);
            }
            iconCompatParcelizer.AudioAttributesCompatParcelizer = jMin;
            return iconCompatParcelizer;
        }

        @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
            super.RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer, z);
            audioAttributesCompatParcelizer.read = this.AudioAttributesCompatParcelizer[i];
            return audioAttributesCompatParcelizer;
        }
    }
}
