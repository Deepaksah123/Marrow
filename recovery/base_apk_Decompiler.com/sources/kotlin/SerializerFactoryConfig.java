package kotlin;

import kotlin.Metadata;
import kotlin.Module;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\r\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\r\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0019J3\u0010\u001a\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u001bR\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001cJ=\u0010\u0018\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u001bR\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u001dJE\u0010\u001a\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u001bR\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001fJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u00060\u001bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010 J5\u0010\r\u001a\u00060\u001bR\u00020\u0000*\f\u0012\b\u0012\u00060\u001bR\u00020\u00000!2\u0006\u0010\u0005\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u001bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\"J1\u0010\u001a\u001a\u00020\f*\f\u0012\b\u0012\u00060\u001bR\u00020\u00000!2\u0006\u0010\u0005\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u001bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010#R!\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u001bR\u00020\u00000!8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\r\u0010&R\u001c\u0010\u0018\u001a\b\u0018\u00010\u001bR\u00020\u00008\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u001c\u0010*\u001a\u00020\u000f8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001a\u0010(\u001a\u0004\b\u0015\u0010)R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u001c\u0010$\u001a\u00020\u000f8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b\u001a\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010,"}, d2 = {"Lo/SerializerFactoryConfig;", "", "<init>", "()V", "Lo/hasReferringProperties;", "p0", "p1", "Lo/resetWithShared;", "p2", "", "p3", "p4", "", "RemoteActionCompatParcelizer", "(JJ[FII)Z", "", "Lo/Module;", "Lkotlin/Function1;", "Lo/getDefaultPropertyIgnorals;", "", "Lo/Module$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(IJJLo/Module;Lo/getAnswerMap;)Lo/Module$AudioAttributesCompatParcelizer;", "(IJJJ)V", "write", "(J)V", "AudioAttributesCompatParcelizer", "Lo/SerializerFactoryConfig$read;", "(Lo/SerializerFactoryConfig$read;JJJ)V", "(Lo/SerializerFactoryConfig$read;JJ[FJ)V", "p5", "(Lo/SerializerFactoryConfig$read;JJ[FJJ)J", "(Lo/SerializerFactoryConfig$read;)Z", "Lo/setProvider;", "(Lo/setProvider;ILo/SerializerFactoryConfig$read;)Lo/SerializerFactoryConfig$read;", "(Lo/setProvider;ILo/SerializerFactoryConfig$read;)Z", "AudioAttributesImplApi26Parcelizer", "Lo/setProvider;", "()Lo/setProvider;", "Lo/SerializerFactoryConfig$read;", "J", "()J", "read", "AudioAttributesImplApi21Parcelizer", "[F", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SerializerFactoryConfig {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public float[] MediaBrowserCompatItemReceiver;
    public read write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setProvider<read> AudioAttributesCompatParcelizer = ActionMenuView.write();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long read = -1;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public long IconCompatParcelizer = hasReferringProperties.INSTANCE.write();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public long RemoteActionCompatParcelizer = hasReferringProperties.INSTANCE.write();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0013\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010\u0019\u001a\b\u0018\u00010\u0000R\u00020!8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b\u001f\u0010%R\"\u0010\u0017\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b\u001f\u0010'R\"\u0010(\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a\"\u0004\b\u0013\u0010'R\"\u0010\u001c\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b\u0015\u0010\u001a\"\u0004\b\u001b\u0010'R\"\u0010#\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b\u0015\u0010'"}, d2 = {"Lo/SerializerFactoryConfig$read;", "Lo/Module$AudioAttributesCompatParcelizer;", "", "p0", "", "p1", "p2", "Lo/Module;", "p3", "Lkotlin/Function1;", "Lo/getDefaultPropertyIgnorals;", "", "p4", "<init>", "(Lo/SerializerFactoryConfig;IJJLo/Module;Lo/getAnswerMap;)V", "IconCompatParcelizer", "()V", "Lo/hasReferringProperties;", "Lo/resetWithShared;", "read", "(JJJJ[F)V", "write", "I", "MediaBrowserCompatCustomActionResultReceiver", "J", "AudioAttributesImplApi21Parcelizer", "()J", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "Lo/Module;", "()Lo/Module;", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "Lo/SerializerFactoryConfig;", "Lo/SerializerFactoryConfig$read;", "AudioAttributesImplBaseParcelizer", "()Lo/SerializerFactoryConfig$read;", "(Lo/SerializerFactoryConfig$read;)V", "MediaBrowserCompatMediaItem", "(J)V", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class read implements Module.AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final long write;
        private read AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private final long AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private final Module IconCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private long MediaBrowserCompatCustomActionResultReceiver;
        private final getAnswerMap<getDefaultPropertyIgnorals, getShowPopup> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private long AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final int read;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private long MediaBrowserCompatItemReceiver = Long.MIN_VALUE;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private long AudioAttributesImplBaseParcelizer = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public read(int i, long j, long j2, Module module, getAnswerMap<? super getDefaultPropertyIgnorals, getShowPopup> getanswermap) {
            this.read = i;
            this.AudioAttributesCompatParcelizer = j;
            this.write = j2;
            this.IconCompatParcelizer = module;
            this.RemoteActionCompatParcelizer = getanswermap;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
        public final long getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final long getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final Module getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
        public final read getAudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final void RemoteActionCompatParcelizer(read readVar) {
            this.AudioAttributesImplApi21Parcelizer = readVar;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final long getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final void RemoteActionCompatParcelizer(long j) {
            this.MediaBrowserCompatCustomActionResultReceiver = j;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final long getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final void read(long j) {
            this.AudioAttributesImplApi26Parcelizer = j;
        }

        public final void AudioAttributesCompatParcelizer(long j) {
            this.MediaBrowserCompatItemReceiver = j;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final long getMediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final long getAudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final void write(long j) {
            this.AudioAttributesImplBaseParcelizer = j;
        }

        @Override // o.Module.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer() {
            SerializerFactoryConfig serializerFactoryConfig = SerializerFactoryConfig.this;
            if (serializerFactoryConfig.AudioAttributesCompatParcelizer(serializerFactoryConfig.RemoteActionCompatParcelizer(), this.read, this)) {
                return;
            }
            SerializerFactoryConfig.this.RemoteActionCompatParcelizer(this);
        }

        public final void read(long p0, long p1, long p2, long p3, float[] p4) {
            getDefaultPropertyIgnorals getdefaultpropertyignorals = getFullRootName.read(this.IconCompatParcelizer, p0, p1, p2, p3, SerializerFactoryConfig.this.getAudioAttributesImplApi26Parcelizer(), p4);
            if (getdefaultpropertyignorals == null) {
                return;
            }
            this.RemoteActionCompatParcelizer.invoke(getdefaultpropertyignorals);
        }
    }

    public final setProvider<read> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean RemoteActionCompatParcelizer(long p0, long p1, float[] p2, int p3, int p4) {
        boolean z;
        if (hasReferringProperties.write(p1, this.IconCompatParcelizer)) {
            z = false;
        } else {
            this.IconCompatParcelizer = p1;
            z = true;
        }
        if (!hasReferringProperties.write(p0, this.RemoteActionCompatParcelizer)) {
            this.RemoteActionCompatParcelizer = p0;
            z = true;
        }
        if (p2 != null) {
            this.MediaBrowserCompatItemReceiver = p2;
            z = true;
        }
        long j = -1;
        long j2 = (((long) p3) << 32) | (((long) p4) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))));
        if (j2 == this.AudioAttributesImplApi26Parcelizer) {
            return z;
        }
        this.AudioAttributesImplApi26Parcelizer = j2;
        return true;
    }

    public final Module.AudioAttributesCompatParcelizer IconCompatParcelizer(int p0, long p1, long p2, Module p3, getAnswerMap<? super getDefaultPropertyIgnorals, getShowPopup> p4) {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0, new read(p0, p1, p2 == 0 ? p1 : p2, p3, p4));
    }

    public final void RemoteActionCompatParcelizer(int p0, long p1, long p2, long p3) {
        read readVarAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        while (true) {
            read readVar = readVarAudioAttributesCompatParcelizer;
            if (readVar == null) {
                return;
            }
            readVarAudioAttributesCompatParcelizer = readVar.getAudioAttributesImplApi21Parcelizer();
            AudioAttributesCompatParcelizer(readVar, p1, p2, p3);
        }
    }

    public final void write(long p0) {
        long[] jArr;
        long j;
        int i;
        int i2;
        long j2 = this.IconCompatParcelizer;
        long j3 = this.RemoteActionCompatParcelizer;
        float[] fArr = this.MediaBrowserCompatItemReceiver;
        setProvider<read> setprovider = this.AudioAttributesCompatParcelizer;
        Object[] objArr = setprovider.MediaBrowserCompatItemReceiver;
        long[] jArr2 = setprovider.RemoteActionCompatParcelizer;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j4 = jArr2[i3];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                long j5 = j4;
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        read audioAttributesImplApi21Parcelizer = (read) objArr[(i3 << 3) + i6];
                        while (audioAttributesImplApi21Parcelizer != null) {
                            write(audioAttributesImplApi21Parcelizer, j2, j3, fArr, p0);
                            audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi21Parcelizer();
                            i5 = i5;
                            i4 = i4;
                            i3 = i3;
                            i6 = i6;
                            j2 = j2;
                            jArr2 = jArr2;
                            length = length;
                        }
                    }
                    long j6 = j2;
                    int i7 = i4;
                    j5 >>= i7;
                    i6++;
                    i5 = i5;
                    i4 = i7;
                    i3 = i3;
                    j2 = j6;
                    jArr2 = jArr2;
                    length = length;
                }
                jArr = jArr2;
                int i8 = length;
                j = j2;
                i = i3;
                if (i5 != i4) {
                    return;
                } else {
                    i2 = i8;
                }
            } else {
                jArr = jArr2;
                j = j2;
                i = i3;
                i2 = length;
            }
            if (i == i2) {
                return;
            }
            i3 = i + 1;
            length = i2;
            j2 = j;
            jArr2 = jArr;
        }
    }

    public final void RemoteActionCompatParcelizer(long p0) {
        long j = this.IconCompatParcelizer;
        long j2 = this.RemoteActionCompatParcelizer;
        float[] fArr = this.MediaBrowserCompatItemReceiver;
        read readVar = this.write;
        if (readVar != null) {
            for (read audioAttributesImplApi21Parcelizer = readVar; audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi21Parcelizer()) {
                _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(audioAttributesImplApi21Parcelizer.getIconCompatParcelizer());
                long jWrite = _serializerProvider.AudioAttributesCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer).getAddObserverForBackInvokerlambda7().write(_assertnotnullAudioAttributesImplApi26Parcelizer);
                long audioAttributesCompatParcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer();
                audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(jWrite);
                long j3 = -1;
                audioAttributesImplApi21Parcelizer.read((((long) (hasReferringProperties.AudioAttributesCompatParcelizer(jWrite) + ((int) audioAttributesCompatParcelizer))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | ((hasReferringProperties.IconCompatParcelizer(jWrite) + ((int) (audioAttributesCompatParcelizer >> 32))) << 32));
                write(audioAttributesImplApi21Parcelizer, j, j2, fArr, p0);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(long p0) {
        float[] fArr;
        long j;
        long j2;
        long[] jArr;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        int i4;
        long[] jArr2;
        int i5;
        float[] fArr2;
        Object[] objArr2;
        long j3;
        int i6;
        int i7;
        if (this.read > p0) {
            return;
        }
        long j4 = this.IconCompatParcelizer;
        long j5 = this.RemoteActionCompatParcelizer;
        float[] fArr3 = this.MediaBrowserCompatItemReceiver;
        setProvider<read> setprovider = this.AudioAttributesCompatParcelizer;
        Object[] objArr3 = setprovider.MediaBrowserCompatItemReceiver;
        long[] jArr3 = setprovider.RemoteActionCompatParcelizer;
        int length = jArr3.length - 2;
        if (length >= 0) {
            j2 = Long.MAX_VALUE;
            int i8 = 0;
            while (true) {
                long j6 = jArr3[i8];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    long j7 = j6;
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j7 & 255) < 128) {
                            long jAudioAttributesCompatParcelizer = j2;
                            read audioAttributesImplApi21Parcelizer = (read) objArr3[(i8 << 3) + i11];
                            while (audioAttributesImplApi21Parcelizer != null) {
                                jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(audioAttributesImplApi21Parcelizer, j4, j5, fArr3, p0, jAudioAttributesCompatParcelizer);
                                audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi21Parcelizer();
                                i10 = i10;
                                i9 = i9;
                                i11 = i11;
                                j4 = j4;
                                i8 = i8;
                                jArr3 = jArr3;
                                length = length;
                                fArr3 = fArr3;
                                objArr3 = objArr3;
                            }
                            i3 = i11;
                            i4 = i8;
                            jArr2 = jArr3;
                            i5 = length;
                            fArr2 = fArr3;
                            objArr2 = objArr3;
                            j3 = j4;
                            i6 = i10;
                            i7 = i9;
                            j2 = jAudioAttributesCompatParcelizer;
                        } else {
                            i3 = i11;
                            i4 = i8;
                            jArr2 = jArr3;
                            i5 = length;
                            fArr2 = fArr3;
                            objArr2 = objArr3;
                            j3 = j4;
                            i6 = i10;
                            i7 = i9;
                        }
                        j7 >>= i7;
                        i11 = i3 + 1;
                        i10 = i6;
                        i9 = i7;
                        j4 = j3;
                        i8 = i4;
                        jArr3 = jArr2;
                        length = i5;
                        fArr3 = fArr2;
                        objArr3 = objArr2;
                    }
                    int i12 = i8;
                    jArr = jArr3;
                    int i13 = length;
                    fArr = fArr3;
                    objArr = objArr3;
                    j = j4;
                    if (i10 != i9) {
                        break;
                    }
                    i = i12;
                    i2 = i13;
                } else {
                    jArr = jArr3;
                    fArr = fArr3;
                    objArr = objArr3;
                    j = j4;
                    i = i8;
                    i2 = length;
                }
                if (i == i2) {
                    break;
                }
                i8 = i + 1;
                length = i2;
                j4 = j;
                jArr3 = jArr;
                fArr3 = fArr;
                objArr3 = objArr;
            }
        } else {
            fArr = fArr3;
            j = j4;
            j2 = Long.MAX_VALUE;
        }
        read readVar = this.write;
        if (readVar != null) {
            long jAudioAttributesCompatParcelizer2 = j2;
            for (read audioAttributesImplApi21Parcelizer2 = readVar; audioAttributesImplApi21Parcelizer2 != null; audioAttributesImplApi21Parcelizer2 = audioAttributesImplApi21Parcelizer2.getAudioAttributesImplApi21Parcelizer()) {
                jAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(audioAttributesImplApi21Parcelizer2, j, j5, fArr, p0, jAudioAttributesCompatParcelizer2);
            }
            j2 = jAudioAttributesCompatParcelizer2;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = -1;
        }
        this.read = j2;
    }

    public final void AudioAttributesCompatParcelizer(read p0, long p1, long p2, long p3) {
        long mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver();
        long audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
        long write = p0.getWrite();
        boolean z = p3 - mediaBrowserCompatItemReceiver >= audioAttributesCompatParcelizer || mediaBrowserCompatItemReceiver == Long.MIN_VALUE;
        boolean z2 = write == 0;
        boolean z3 = audioAttributesCompatParcelizer == 0;
        p0.RemoteActionCompatParcelizer(p1);
        p0.read(p2);
        boolean z4 = !(z2 || z3) || z2;
        if (z && z4) {
            p0.write(-1L);
            p0.AudioAttributesCompatParcelizer(p3);
            p0.read(p1, p2, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver);
        } else {
            if (z2) {
                return;
            }
            p0.write(p3);
            long j = this.read;
            if (j <= 0 || p3 + write >= j) {
                return;
            }
            this.read = j;
        }
    }

    private final void write(read p0, long p1, long p2, float[] p3, long p4) {
        long mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver();
        boolean z = p4 - mediaBrowserCompatItemReceiver > p0.getAudioAttributesCompatParcelizer() || mediaBrowserCompatItemReceiver == Long.MIN_VALUE;
        boolean z2 = p0.getWrite() == 0;
        p0.write(p4);
        if (z && z2) {
            p0.AudioAttributesCompatParcelizer(p4);
            p0.read(p0.getMediaBrowserCompatCustomActionResultReceiver(), p0.getAudioAttributesImplApi26Parcelizer(), p1, p2, p3);
        }
        if (z2) {
            return;
        }
        long j = this.read;
        long write = p0.getWrite();
        if (j <= 0 || write + p4 >= j) {
            return;
        }
        this.read = j;
    }

    private final long AudioAttributesCompatParcelizer(read p0, long p1, long p2, float[] p3, long p4, long p5) {
        if (p0.getWrite() <= 0 || p0.getAudioAttributesImplBaseParcelizer() <= 0) {
            return p5;
        }
        if (p4 - p0.getAudioAttributesImplBaseParcelizer() >= p0.getWrite()) {
            p0.AudioAttributesCompatParcelizer(p4);
            p0.write(-1L);
            p0.read(p0.getMediaBrowserCompatCustomActionResultReceiver(), p0.getAudioAttributesImplApi26Parcelizer(), p1, p2, p3);
            return p5;
        }
        return Math.min(p5, p0.getAudioAttributesImplBaseParcelizer() + p0.getWrite());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:8:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean RemoteActionCompatParcelizer(o.SerializerFactoryConfig.read r5) {
        /*
            r4 = this;
            o.SerializerFactoryConfig$read r0 = r4.write
            r1 = 1
            r2 = 0
            if (r0 != r5) goto L10
            o.SerializerFactoryConfig$read r0 = r0.getAudioAttributesImplApi21Parcelizer()
            r4.write = r0
            r5.RemoteActionCompatParcelizer(r2)
            return r1
        L10:
            if (r0 == 0) goto L1a
            o.SerializerFactoryConfig$read r4 = r0.getAudioAttributesImplApi21Parcelizer()
        L16:
            r3 = r0
            r0 = r4
            r4 = r3
            goto L1c
        L1a:
            r4 = r0
            r0 = r2
        L1c:
            if (r0 == 0) goto L32
            if (r0 != r5) goto L2d
            if (r4 == 0) goto L29
            o.SerializerFactoryConfig$read r0 = r0.getAudioAttributesImplApi21Parcelizer()
            r4.RemoteActionCompatParcelizer(r0)
        L29:
            r5.RemoteActionCompatParcelizer(r2)
            return r1
        L2d:
            o.SerializerFactoryConfig$read r4 = r0.getAudioAttributesImplApi21Parcelizer()
            goto L16
        L32:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SerializerFactoryConfig.RemoteActionCompatParcelizer(o.SerializerFactoryConfig$read):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AudioAttributesCompatParcelizer(setProvider<read> setprovider, int i, read readVar) {
        read readVarRemoteActionCompatParcelizer = setprovider.RemoteActionCompatParcelizer(i);
        if (readVarRemoteActionCompatParcelizer == null) {
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readVarRemoteActionCompatParcelizer, readVar)) {
            read audioAttributesImplApi21Parcelizer = readVar.getAudioAttributesImplApi21Parcelizer();
            readVar.RemoteActionCompatParcelizer((read) null);
            if (audioAttributesImplApi21Parcelizer != null) {
                setprovider.AudioAttributesCompatParcelizer(i, audioAttributesImplApi21Parcelizer);
            } else {
                _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(readVar.getIconCompatParcelizer().getRead());
                if (_assertnotnullAudioAttributesImplApi26Parcelizer.getAudioAttributesImplApi21Parcelizer()) {
                    _serializerProvider.AudioAttributesCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer).getAddObserverForBackInvokerlambda7().AudioAttributesCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer);
                }
            }
            return true;
        }
        setprovider.AudioAttributesCompatParcelizer(i, readVarRemoteActionCompatParcelizer);
        while (true) {
            if (readVarRemoteActionCompatParcelizer == null) {
                break;
            }
            read audioAttributesImplApi21Parcelizer2 = readVarRemoteActionCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
            if (audioAttributesImplApi21Parcelizer2 == null) {
                return false;
            }
            if (audioAttributesImplApi21Parcelizer2 == readVar) {
                readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(readVar.getAudioAttributesImplApi21Parcelizer());
                readVar.RemoteActionCompatParcelizer((read) null);
                break;
            }
            readVarRemoteActionCompatParcelizer = readVarRemoteActionCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
        }
        return true;
    }

    private final read RemoteActionCompatParcelizer(setProvider<read> setprovider, int i, read readVar) {
        read readVarAudioAttributesCompatParcelizer = setprovider.AudioAttributesCompatParcelizer(i);
        if (readVarAudioAttributesCompatParcelizer == null) {
            setprovider.write(i, readVar);
            readVarAudioAttributesCompatParcelizer = readVar;
        }
        read audioAttributesImplApi21Parcelizer = readVarAudioAttributesCompatParcelizer;
        if (audioAttributesImplApi21Parcelizer != readVar) {
            while (audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi21Parcelizer() != null) {
                audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi21Parcelizer();
                toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer);
            }
            audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(readVar);
        }
        return readVar;
    }
}
