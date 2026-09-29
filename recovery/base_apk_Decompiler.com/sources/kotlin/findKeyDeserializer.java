package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0002\u0013\u0017B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/findKeyDeserializer;", "", "Lo/findImplicitPropertyName;", "p0", "p1", "p2", "p3", "Lo/findPOJOBuilderConfig;", "p4", "", "p5", "<init>", "(Lo/findImplicitPropertyName;Lo/findImplicitPropertyName;Lo/findImplicitPropertyName;Lo/findImplicitPropertyName;I[FLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "(Lo/findImplicitPropertyName;Lo/findImplicitPropertyName;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/switchToNext;", "read", "(J)J", "Lo/findImplicitPropertyName;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "write", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "I", "MediaBrowserCompatCustomActionResultReceiver", "[F", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class findKeyDeserializer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int write = 8;
    private final findImplicitPropertyName AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final findImplicitPropertyName write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final findImplicitPropertyName IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final findImplicitPropertyName RemoteActionCompatParcelizer;

    private findKeyDeserializer(findImplicitPropertyName findimplicitpropertyname, findImplicitPropertyName findimplicitpropertyname2, findImplicitPropertyName findimplicitpropertyname3, findImplicitPropertyName findimplicitpropertyname4, int i, float[] fArr) {
        this.RemoteActionCompatParcelizer = findimplicitpropertyname;
        this.AudioAttributesCompatParcelizer = findimplicitpropertyname2;
        this.write = findimplicitpropertyname3;
        this.IconCompatParcelizer = findimplicitpropertyname4;
        this.read = i;
        this.AudioAttributesImplBaseParcelizer = fArr;
    }

    private findKeyDeserializer(findImplicitPropertyName findimplicitpropertyname, findImplicitPropertyName findimplicitpropertyname2, int i) {
        this(findimplicitpropertyname, findimplicitpropertyname2, findEnumAliases.write(findimplicitpropertyname.getAudioAttributesCompatParcelizer(), findEnumAliases.INSTANCE.write()) ? findFormat.write$default(findimplicitpropertyname, findNamingStrategy.INSTANCE.read(), null, 2, null) : findimplicitpropertyname, findEnumAliases.write(findimplicitpropertyname2.getAudioAttributesCompatParcelizer(), findEnumAliases.INSTANCE.write()) ? findFormat.write$default(findimplicitpropertyname2, findNamingStrategy.INSTANCE.read(), null, 2, null) : findimplicitpropertyname2, i, INSTANCE.RemoteActionCompatParcelizer(findimplicitpropertyname, findimplicitpropertyname2, i), null);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\n\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/findKeyDeserializer$AudioAttributesCompatParcelizer;", "Lo/findKeyDeserializer;", "Lo/findPOJOBuilder;", "p0", "p1", "Lo/findPOJOBuilderConfig;", "p2", "<init>", "(Lo/findPOJOBuilder;Lo/findPOJOBuilder;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/switchToNext;", "read", "(J)J", "", "(Lo/findPOJOBuilder;Lo/findPOJOBuilder;I)[F", "AudioAttributesCompatParcelizer", "Lo/findPOJOBuilder;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "[F", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends findKeyDeserializer {
        private final findPOJOBuilder AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final float[] write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final findPOJOBuilder IconCompatParcelizer;

        /* JADX WARN: Illegal instructions before constructor call */
        private AudioAttributesCompatParcelizer(findPOJOBuilder findpojobuilder, findPOJOBuilder findpojobuilder2, int i) {
            findPOJOBuilder findpojobuilder3 = findpojobuilder;
            findPOJOBuilder findpojobuilder4 = findpojobuilder2;
            super(findpojobuilder3, findpojobuilder4, findpojobuilder3, findpojobuilder4, i, null, null);
            this.AudioAttributesCompatParcelizer = findpojobuilder;
            this.IconCompatParcelizer = findpojobuilder2;
            this.write = read(findpojobuilder, findpojobuilder2, i);
        }

        private final float[] read(findPOJOBuilder p0, findPOJOBuilder p1, int p2) {
            if (findFormat.write(p0.getRead(), p1.getRead())) {
                return findFormat.read(p1.getAudioAttributesImplApi21Parcelizer(), p0.getAudioAttributesImplApi26Parcelizer());
            }
            float[] audioAttributesImplApi26Parcelizer = p0.getAudioAttributesImplApi26Parcelizer();
            float[] audioAttributesImplApi21Parcelizer = p1.getAudioAttributesImplApi21Parcelizer();
            float[] fArrAudioAttributesCompatParcelizer = p0.getRead().AudioAttributesCompatParcelizer();
            float[] fArrAudioAttributesCompatParcelizer2 = p1.getRead().AudioAttributesCompatParcelizer();
            if (!findFormat.write(p0.getRead(), findNamingStrategy.INSTANCE.read())) {
                audioAttributesImplApi26Parcelizer = findFormat.read(findFormat.write(findDeserializationContentConverter.INSTANCE.AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer(), fArrAudioAttributesCompatParcelizer, findNamingStrategy.INSTANCE.AudioAttributesImplApi26Parcelizer()), p0.getAudioAttributesImplApi26Parcelizer());
            }
            if (!findFormat.write(p1.getRead(), findNamingStrategy.INSTANCE.read())) {
                audioAttributesImplApi21Parcelizer = findFormat.write(findFormat.read(findFormat.write(findDeserializationContentConverter.INSTANCE.AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer(), fArrAudioAttributesCompatParcelizer2, findNamingStrategy.INSTANCE.AudioAttributesImplApi26Parcelizer()), p1.getAudioAttributesImplApi26Parcelizer()));
            }
            if (findPOJOBuilderConfig.RemoteActionCompatParcelizer(p2, findPOJOBuilderConfig.INSTANCE.write())) {
                audioAttributesImplApi26Parcelizer = findFormat.IconCompatParcelizer(new float[]{fArrAudioAttributesCompatParcelizer[0] / fArrAudioAttributesCompatParcelizer2[0], fArrAudioAttributesCompatParcelizer[1] / fArrAudioAttributesCompatParcelizer2[1], fArrAudioAttributesCompatParcelizer[2] / fArrAudioAttributesCompatParcelizer2[2]}, audioAttributesImplApi26Parcelizer);
            }
            return findFormat.read(audioAttributesImplApi21Parcelizer, audioAttributesImplApi26Parcelizer);
        }

        @Override // kotlin.findKeyDeserializer
        public final long read(long p0) {
            float fAudioAttributesImplApi21Parcelizer = switchToNext.AudioAttributesImplApi21Parcelizer(p0);
            float fAudioAttributesImplBaseParcelizer = switchToNext.AudioAttributesImplBaseParcelizer(p0);
            float fIconCompatParcelizer = switchToNext.IconCompatParcelizer(p0);
            float fRemoteActionCompatParcelizer = switchToNext.RemoteActionCompatParcelizer(p0);
            float f = (float) this.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem().read(fAudioAttributesImplApi21Parcelizer);
            float f2 = (float) this.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem().read(fAudioAttributesImplBaseParcelizer);
            float f3 = (float) this.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem().read(fIconCompatParcelizer);
            float[] fArr = this.write;
            return RequestPayload.write((float) this.IconCompatParcelizer.getMediaBrowserCompatItemReceiver().read((fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3)), (float) this.IconCompatParcelizer.getMediaBrowserCompatItemReceiver().read((fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3)), (float) this.IconCompatParcelizer.getMediaBrowserCompatItemReceiver().read((fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3)), fRemoteActionCompatParcelizer, this.IconCompatParcelizer);
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(findPOJOBuilder findpojobuilder, findPOJOBuilder findpojobuilder2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(findpojobuilder, findpojobuilder2, i);
        }
    }

    /* JADX INFO: renamed from: o.findKeyDeserializer$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/findKeyDeserializer$IconCompatParcelizer;", "", "<init>", "()V", "Lo/findImplicitPropertyName;", "p0", "p1", "Lo/findPOJOBuilderConfig;", "p2", "", "RemoteActionCompatParcelizer", "(Lo/findImplicitPropertyName;Lo/findImplicitPropertyName;I)[F", "Lo/findKeyDeserializer;", "write", "(Lo/findImplicitPropertyName;)Lo/findKeyDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] RemoteActionCompatParcelizer(findImplicitPropertyName p0, findImplicitPropertyName p1, int p2) {
            if (!findPOJOBuilderConfig.RemoteActionCompatParcelizer(p2, findPOJOBuilderConfig.INSTANCE.write())) {
                return null;
            }
            boolean zWrite = findEnumAliases.write(p0.getAudioAttributesCompatParcelizer(), findEnumAliases.INSTANCE.write());
            boolean zWrite2 = findEnumAliases.write(p1.getAudioAttributesCompatParcelizer(), findEnumAliases.INSTANCE.write());
            if (zWrite && zWrite2) {
                return null;
            }
            if (!zWrite && !zWrite2) {
                return null;
            }
            if (!zWrite) {
                p0 = p1;
            }
            toMagicModuleMetaRepoModel.read(p0, "");
            findPOJOBuilder findpojobuilder = (findPOJOBuilder) p0;
            float[] fArrAudioAttributesCompatParcelizer = zWrite ? findpojobuilder.getRead().AudioAttributesCompatParcelizer() : findNamingStrategy.INSTANCE.write();
            float[] fArrAudioAttributesCompatParcelizer2 = zWrite2 ? findpojobuilder.getRead().AudioAttributesCompatParcelizer() : findNamingStrategy.INSTANCE.write();
            return new float[]{fArrAudioAttributesCompatParcelizer[0] / fArrAudioAttributesCompatParcelizer2[0], fArrAudioAttributesCompatParcelizer[1] / fArrAudioAttributesCompatParcelizer2[1], fArrAudioAttributesCompatParcelizer[2] / fArrAudioAttributesCompatParcelizer2[2]};
        }

        /* JADX INFO: renamed from: o.findKeyDeserializer$IconCompatParcelizer$read */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/findKeyDeserializer$IconCompatParcelizer$read;", "Lo/findKeyDeserializer;", "Lo/switchToNext;", "p0", "read", "(J)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class read extends findKeyDeserializer {
            @Override // kotlin.findKeyDeserializer
            public final long read(long p0) {
                return p0;
            }

            read(findImplicitPropertyName findimplicitpropertyname, int i) {
                super(findimplicitpropertyname, findimplicitpropertyname, i, null);
            }
        }

        public final findKeyDeserializer write(findImplicitPropertyName p0) {
            return new read(p0, findPOJOBuilderConfig.INSTANCE.RemoteActionCompatParcelizer());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public long read(long p0) {
        float fAudioAttributesImplApi21Parcelizer = switchToNext.AudioAttributesImplApi21Parcelizer(p0);
        float fAudioAttributesImplBaseParcelizer = switchToNext.AudioAttributesImplBaseParcelizer(p0);
        float fIconCompatParcelizer = switchToNext.IconCompatParcelizer(p0);
        float fRemoteActionCompatParcelizer = switchToNext.RemoteActionCompatParcelizer(p0);
        long jRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(fAudioAttributesImplApi21Parcelizer, fAudioAttributesImplBaseParcelizer, fIconCompatParcelizer);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jRemoteActionCompatParcelizer >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jRemoteActionCompatParcelizer);
        float f = this.write.read(fAudioAttributesImplApi21Parcelizer, fAudioAttributesImplBaseParcelizer, fIconCompatParcelizer);
        float[] fArr = this.AudioAttributesImplBaseParcelizer;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            f *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(f2, fIntBitsToFloat2, f, fRemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    public /* synthetic */ findKeyDeserializer(findImplicitPropertyName findimplicitpropertyname, findImplicitPropertyName findimplicitpropertyname2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(findimplicitpropertyname, findimplicitpropertyname2, i);
    }

    public /* synthetic */ findKeyDeserializer(findImplicitPropertyName findimplicitpropertyname, findImplicitPropertyName findimplicitpropertyname2, findImplicitPropertyName findimplicitpropertyname3, findImplicitPropertyName findimplicitpropertyname4, int i, float[] fArr, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(findimplicitpropertyname, findimplicitpropertyname2, findimplicitpropertyname3, findimplicitpropertyname4, i, fArr);
    }
}
