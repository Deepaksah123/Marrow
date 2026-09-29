package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0013*\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u001eH&¢\u0006\u0004\b\u0014\u0010\u001fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020!2\u0006\u0010\n\u001a\u00020\"H&¢\u0006\u0004\b\u0014\u0010#J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020 H&¢\u0006\u0004\b\u0014\u0010$J\u001f\u0010'\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020%2\u0006\u0010\b\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u001a\u0010\u001c\u001a\u00020\u00078\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b\u001c\u0010,R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00105\u001a\u00020\u00078\u0007X\u0087D¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b4\u0010,R\u0018\u00104\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00107R\u001c\u00100\u001a\u00020\"8\u0005@\u0004X\u0085\f¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b0\u00109R$\u00102\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020!8\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b5\u0010;R\u0011\u0010-\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b-\u0010;R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00180>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010?"}, d2 = {"Lo/writeArray;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/getLongMask;", "Lo/addKeySerializers;", "Lo/_writeCloseable;", "Lo/inset;", "p0", "", "p1", "Lo/assignParameter;", "p2", "Lo/MinimalPrettyPrinter;", "p3", "Lkotlin/Function0;", "Lo/setCurrentValue;", "p4", "<init>", "(Lo/inset;ZFLo/MinimalPrettyPrinter;Lo/getCreatedOnDateMs;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/getKey;", "", "AudioAttributesCompatParcelizer", "(J)V", "c_", "()V", "Lo/setOverriddenInsets;", "read", "(Lo/setOverriddenInsets;)V", "Lo/findSerializer;", "write", "(Lo/findSerializer;)V", "Lo/findSetterInfo;", "(Lo/findSetterInfo;)V", "Lo/setOverriddenInsets$read;", "Lo/calloc;", "", "(Lo/setOverriddenInsets$read;JF)V", "(Lo/setOverriddenInsets$read;)V", "Lo/isRound;", "Lo/TopUserCompanion;", "IconCompatParcelizer", "(Lo/isRound;Lo/TopUserCompanion;)V", "Lo/inset;", "RemoteActionCompatParcelizer", "Z", "()Z", "AudioAttributesImplApi26Parcelizer", "F", "Lo/MinimalPrettyPrinter;", "AudioAttributesImplApi21Parcelizer", "Lo/getCreatedOnDateMs;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/getCreatedOnDateMs;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "Lo/writeArrayFieldStart;", "Lo/writeArrayFieldStart;", "RatingCompat", "()F", "J", "()J", "Lo/switchToNext;", "MediaDescriptionCompat", "Lo/setDropDownBackgroundResource;", "Lo/setDropDownBackgroundResource;", "MediaMetadataCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class writeArray extends _handleOddName.IconCompatParcelizer implements getLongMask, addKeySerializers, _writeCloseable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<setCurrentValue> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private long MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<setOverriddenInsets> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private writeArrayFieldStart AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final inset RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MinimalPrettyPrinter read;

    public abstract void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo);

    public abstract void AudioAttributesCompatParcelizer(setOverriddenInsets.read p0);

    public abstract void AudioAttributesCompatParcelizer(setOverriddenInsets.read p0, long p1, float p2);

    private writeArray(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, getCreatedOnDateMs<setCurrentValue> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = insetVar;
        this.write = z;
        this.AudioAttributesCompatParcelizer = f;
        this.read = minimalPrettyPrinter;
        this.IconCompatParcelizer = getcreatedondatems;
        this.MediaBrowserCompatCustomActionResultReceiver = calloc.INSTANCE.AudioAttributesCompatParcelizer();
        this.MediaMetadataCompat = new setDropDownBackgroundResource<>(0, 1, null);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    protected final boolean getWrite() {
        return this.write;
    }

    protected final getCreatedOnDateMs<setCurrentValue> MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    protected final float getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    protected final long getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        return this.read.write();
    }

    @Override // kotlin._writeCloseable
    public void AudioAttributesCompatParcelizer(long p0) {
        float fAudioAttributesCompatParcelizer;
        this.MediaDescriptionCompat = true;
        bufferMapProperty buffermappropertyWrite = collectLongDefaults.write((Module) this);
        this.MediaBrowserCompatCustomActionResultReceiver = SetterlessProperty.AudioAttributesCompatParcelizer(p0);
        if (Float.isNaN(this.AudioAttributesCompatParcelizer)) {
            fAudioAttributesCompatParcelizer = setCharacterEscapes.AudioAttributesCompatParcelizer(buffermappropertyWrite, this.write, this.MediaBrowserCompatCustomActionResultReceiver);
        } else {
            fAudioAttributesCompatParcelizer = buffermappropertyWrite.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
        this.AudioAttributesImplApi21Parcelizer = fAudioAttributesCompatParcelizer;
        setDropDownBackgroundResource<setOverriddenInsets> setdropdownbackgroundresource = this.MediaMetadataCompat;
        Object[] objArr = setdropdownbackgroundresource.IconCompatParcelizer;
        int i = setdropdownbackgroundresource.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            read((setOverriddenInsets) objArr[i2]);
        }
        this.MediaMetadataCompat.RemoteActionCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final TopUserCompanion topUserCompanion = (TopUserCompanion) this.RemoteActionCompatParcelizer;
                NewNumberOtpResendRequest<isRound> newNumberOtpResendRequestAudioAttributesCompatParcelizer = writeArray.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                final writeArray writearray = writeArray.this;
                this.write = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.writeArray.read.5
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public final Object IconCompatParcelizer(isRound isround, SampleVideos<? super getShowPopup> sampleVideos) {
                        if (isround instanceof setOverriddenInsets) {
                            if (writearray.MediaDescriptionCompat) {
                                writearray.read((setOverriddenInsets) isround);
                            } else {
                                writearray.MediaMetadataCompat.AudioAttributesCompatParcelizer(isround);
                            }
                        } else {
                            writearray.IconCompatParcelizer(isround, topUserCompanion);
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = writeArray.this.new read(sampleVideos);
            readVar.RemoteActionCompatParcelizer = obj;
            return readVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void c_() {
        C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new read(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(setOverriddenInsets p0) {
        if (p0 instanceof setOverriddenInsets.read) {
            AudioAttributesCompatParcelizer((setOverriddenInsets.read) p0, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer);
        } else if (p0 instanceof setOverriddenInsets.write) {
            AudioAttributesCompatParcelizer(((setOverriddenInsets.write) p0).getRead());
        } else if (p0 instanceof setOverriddenInsets.IconCompatParcelizer) {
            AudioAttributesCompatParcelizer(((setOverriddenInsets.IconCompatParcelizer) p0).getRemoteActionCompatParcelizer());
        }
    }

    @Override // kotlin.addKeySerializers
    public void write(findSerializer findserializer) {
        findserializer.write();
        writeArrayFieldStart writearrayfieldstart = this.AudioAttributesImplBaseParcelizer;
        if (writearrayfieldstart != null) {
            writearrayfieldstart.AudioAttributesCompatParcelizer(findserializer, this.AudioAttributesImplApi21Parcelizer, AudioAttributesImplApi26Parcelizer());
        }
        AudioAttributesCompatParcelizer(findserializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(isRound p0, TopUserCompanion p1) {
        writeArrayFieldStart writearrayfieldstart = this.AudioAttributesImplBaseParcelizer;
        if (writearrayfieldstart == null) {
            writearrayfieldstart = new writeArrayFieldStart(this.write, this.IconCompatParcelizer);
            addDeserializers.read(this);
            this.AudioAttributesImplBaseParcelizer = writearrayfieldstart;
        }
        writearrayfieldstart.AudioAttributesCompatParcelizer(p0, p1);
    }

    public /* synthetic */ writeArray(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, getCreatedOnDateMs getcreatedondatems, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(insetVar, z, f, minimalPrettyPrinter, getcreatedondatems);
    }
}
