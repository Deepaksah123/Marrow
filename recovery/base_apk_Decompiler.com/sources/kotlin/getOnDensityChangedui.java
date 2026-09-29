package kotlin;

import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.getTappableElementInsets;
import kotlin.replaceDelegatee;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001$B3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0016J\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0017H\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u001aJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u001aJ\u001b\u0010&\u001a\u00020\r*\u00020\u00072\u0006\u0010\b\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u0013\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010\u0012R\u0014\u0010$\u001a\u00020.8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010/R\u0018\u0010\u0011\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0018\u0010\"\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010*\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u00105R\u0014\u0010,\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00107R\u0016\u0010(\u001a\u0004\u0018\u0001088CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00109"}, d2 = {"Lo/getOnDensityChangedui;", "Lo/addAbstractTypeResolver;", "Lo/hasIndex;", "Lo/insertAnnotationIntrospector;", "Lo/getLongMask;", "Lo/_prefetchRootDeserializer;", "Lo/createForPropertyOverride;", "Lo/hashCode;", "p0", "Lo/hashSeed;", "p1", "Lkotlin/Function1;", "", "", "p2", "<init>", "(Lo/hashCode;ILo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "()Z", "RemoteActionCompatParcelizer", "(Lo/hashCode;)V", "Lo/CharsToNameCanonicalizer;", "(Lo/CharsToNameCanonicalizer;Lo/CharsToNameCanonicalizer;)V", "Lo/getConfigOverride;", "(Lo/getConfigOverride;)V", "p_", "()V", "MediaMetadataCompat", "Lo/isAbstract;", "AudioAttributesCompatParcelizer", "(Lo/isAbstract;)V", "Lo/replaceDelegatee;", "MediaBrowserCompatMediaItem", "()Lo/replaceDelegatee;", "MediaBrowserCompatCustomActionResultReceiver", "(Z)V", "read", "Lo/isRound;", "IconCompatParcelizer", "(Lo/hashCode;Lo/isRound;)V", "AudioAttributesImplBaseParcelizer", "Lo/hashCode;", "AudioAttributesImplApi21Parcelizer", "Lo/getAnswerMap;", "MediaBrowserCompatItemReceiver", "Z", "", "()Ljava/lang/Object;", "Lo/getTappableElementInsets$RemoteActionCompatParcelizer;", "Lo/getTappableElementInsets$RemoteActionCompatParcelizer;", "Lo/replaceDelegatee$IconCompatParcelizer;", "AudioAttributesImplApi26Parcelizer", "Lo/replaceDelegatee$IconCompatParcelizer;", "Lo/isAbstract;", "Lo/_findSymbol2;", "Lo/_findSymbol2;", "Lo/setOnModifierChangedui;", "()Lo/setOnModifierChangedui;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getOnDensityChangedui extends addAbstractTypeResolver implements hasIndex, insertAnnotationIntrospector, getLongMask, _prefetchRootDeserializer, createForPropertyOverride {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Boolean, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private replaceDelegatee.IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private hashCode AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final _findSymbol2 MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private isAbstract AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getTappableElementInsets.RemoteActionCompatParcelizer write;
    private static final read read = new read(null);
    public static final int AudioAttributesCompatParcelizer = 8;

    /* JADX WARN: Multi-variable type inference failed */
    private getOnDensityChangedui(hashCode hashcode, int i, getAnswerMap<? super Boolean, getShowPopup> getanswermap) {
        this.AudioAttributesCompatParcelizer = hashcode;
        this.IconCompatParcelizer = getanswermap;
        this.MediaBrowserCompatItemReceiver = (_findSymbol2) AudioAttributesCompatParcelizer(findSymbol.RemoteActionCompatParcelizer(i, new RemoteActionCompatParcelizer(this)));
    }

    public /* synthetic */ getOnDensityChangedui(hashCode hashcode, int i, getAnswerMap getanswermap, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(hashcode, (i2 & 2) != 0 ? hashSeed.INSTANCE.read() : i, (i2 & 4) != 0 ? null : getanswermap, null);
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getOnDensityChangedui$read;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.createForPropertyOverride
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver */
    public final Object getIconCompatParcelizer() {
        return read;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<CharsToNameCanonicalizer, CharsToNameCanonicalizer, getShowPopup> {
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(CharsToNameCanonicalizer charsToNameCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer2) {
            write(charsToNameCanonicalizer, charsToNameCanonicalizer2);
            return getShowPopup.INSTANCE;
        }

        public final void write(CharsToNameCanonicalizer charsToNameCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer2) {
            ((getOnDensityChangedui) this.AudioAttributesImplApi26Parcelizer).RemoteActionCompatParcelizer(charsToNameCanonicalizer, charsToNameCanonicalizer2);
        }

        RemoteActionCompatParcelizer(Object obj) {
            super(2, obj, getOnDensityChangedui.class, "RemoteActionCompatParcelizer", "RemoteActionCompatParcelizer(Lo/CharsToNameCanonicalizer;Lo/CharsToNameCanonicalizer;)V", 0);
        }
    }

    public final boolean write() {
        return _findSymbol2.IconCompatParcelizer$default(this.MediaBrowserCompatItemReceiver, 0, 1, null);
    }

    private final setOnModifierChangedui AudioAttributesImplApi26Parcelizer() {
        if (!getRatingCompat()) {
            return null;
        }
        createForPropertyOverride createforpropertyoverride = PropertyName.read(this, setOnModifierChangedui.INSTANCE);
        if (createforpropertyoverride instanceof setOnModifierChangedui) {
            return (setOnModifierChangedui) createforpropertyoverride;
        }
        return null;
    }

    public final void RemoteActionCompatParcelizer(hashCode p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0)) {
            return;
        }
        read();
        this.AudioAttributesCompatParcelizer = p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(CharsToNameCanonicalizer p0, CharsToNameCanonicalizer p1) {
        boolean zWrite;
        if (!getRatingCompat() || (zWrite = p1.write()) == p0.write()) {
            return;
        }
        getAnswerMap<Boolean, getShowPopup> getanswermap = this.IconCompatParcelizer;
        if (getanswermap != null) {
            getanswermap.invoke(Boolean.valueOf(zWrite));
        }
        if (zWrite) {
            C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new IconCompatParcelizer(null), 3);
            replaceDelegatee replacedelegateeMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
            this.MediaBrowserCompatCustomActionResultReceiver = replacedelegateeMediaBrowserCompatMediaItem != null ? replacedelegateeMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer() : null;
            MediaBrowserCompatCustomActionResultReceiver();
        } else {
            replaceDelegatee.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            }
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            setOnModifierChangedui setonmodifierchangeduiAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (setonmodifierchangeduiAudioAttributesImplApi26Parcelizer != null) {
                setonmodifierchangeduiAudioAttributesImplApi26Parcelizer.write((isAbstract) null);
            }
        }
        getValueNulls.write(this);
        RemoteActionCompatParcelizer(zWrite);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (ConstructorDetector.read$default(getOnDensityChangedui.this, null, this, 1, null) == objIconCompatParcelizer) {
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getOnDensityChangedui.this.new IconCompatParcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<Boolean> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((getOnDensityChangedui) this.AudioAttributesImplApi26Parcelizer).write());
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(0, obj, getOnDensityChangedui.class, "write", "write()Z", 0);
        }
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        MapperBuilder.write(getconfigoverride, this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().write());
        MapperBuilder.RatingCompat$default(getconfigoverride, null, new AudioAttributesCompatParcelizer(this), 1, null);
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void p_() {
        replaceDelegatee.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }
        this.MediaBrowserCompatCustomActionResultReceiver = null;
    }

    @Override // kotlin._prefetchRootDeserializer
    public final void MediaMetadataCompat() {
        replaceDelegatee replacedelegateeMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().write()) {
            replaceDelegatee.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            }
            this.MediaBrowserCompatCustomActionResultReceiver = replacedelegateeMediaBrowserCompatMediaItem != null ? replacedelegateeMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer() : null;
        }
    }

    @Override // kotlin.insertAnnotationIntrospector
    public final void AudioAttributesCompatParcelizer(isAbstract p0) {
        this.AudioAttributesImplApi21Parcelizer = p0;
        if (this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().write()) {
            if (p0.MediaBrowserCompatItemReceiver()) {
                MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
            setOnModifierChangedui setonmodifierchangeduiAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (setonmodifierchangeduiAudioAttributesImplApi26Parcelizer != null) {
                setonmodifierchangeduiAudioAttributesImplApi26Parcelizer.write((isAbstract) null);
            }
        }
    }

    private final replaceDelegatee MediaBrowserCompatMediaItem() {
        final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        _detectBindAndClose.read(this, new getCreatedOnDateMs() { // from class: o.setOnDensityChangedui
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getOnDensityChangedui.IconCompatParcelizer(writeVar, this);
            }
        });
        return (replaceDelegatee) writeVar.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    public static final getShowPopup IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.write writeVar, getOnDensityChangedui getondensitychangedui) {
        writeVar.write = MappingJsonFactory.write(getondensitychangedui, _buildMessage.AudioAttributesCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        setOnModifierChangedui setonmodifierchangeduiAudioAttributesImplApi26Parcelizer;
        isAbstract isabstract = this.AudioAttributesImplApi21Parcelizer;
        if (isabstract != null) {
            toMagicModuleMetaRepoModel.write(isabstract);
            if (!isabstract.MediaBrowserCompatItemReceiver() || (setonmodifierchangeduiAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer()) == null) {
                return;
            }
            setonmodifierchangeduiAudioAttributesImplApi26Parcelizer.write(this.AudioAttributesImplApi21Parcelizer);
        }
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        hashCode hashcode = this.AudioAttributesCompatParcelizer;
        if (hashcode != null) {
            if (p0) {
                getTappableElementInsets.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write;
                if (remoteActionCompatParcelizer != null) {
                    IconCompatParcelizer(hashcode, new getTappableElementInsets.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer));
                    this.write = null;
                }
                getTappableElementInsets.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new getTappableElementInsets.RemoteActionCompatParcelizer();
                IconCompatParcelizer(hashcode, remoteActionCompatParcelizer2);
                this.write = remoteActionCompatParcelizer2;
                return;
            }
            getTappableElementInsets.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.write;
            if (remoteActionCompatParcelizer3 != null) {
                IconCompatParcelizer(hashcode, new getTappableElementInsets.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer3));
                this.write = null;
            }
        }
    }

    private final void read() {
        getTappableElementInsets.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        hashCode hashcode = this.AudioAttributesCompatParcelizer;
        if (hashcode != null && (remoteActionCompatParcelizer = this.write) != null) {
            hashcode.read(new getTappableElementInsets.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer));
        }
        this.write = null;
    }

    private final void IconCompatParcelizer(final hashCode hashcode, final isRound isround) {
        if (getRatingCompat()) {
            setPassingYear setpassingyear = (setPassingYear) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getIconCompatParcelizer().get(setPassingYear.b_);
            C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new write(hashcode, isround, setpassingyear != null ? setpassingyear.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.getOnRequestDisallowInterceptTouchEventui
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getOnDensityChangedui.IconCompatParcelizer(hashcode, isround, (Throwable) obj);
                }
            }) : null, null), 3);
        } else {
            hashcode.read(isround);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ hashCode AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        final /* synthetic */ isRound read;
        final /* synthetic */ setYearOfPassout write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            setYearOfPassout setyearofpassout = this.write;
            if (setyearofpassout != null) {
                setyearofpassout.write();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(hashCode hashcode, isRound isround, setYearOfPassout setyearofpassout, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = hashcode;
            this.read = isround;
            this.write = setyearofpassout;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.AudioAttributesCompatParcelizer, this.read, this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(hashCode hashcode, isRound isround, Throwable th) {
        hashcode.read(isround);
        return getShowPopup.INSTANCE;
    }

    public /* synthetic */ getOnDensityChangedui(hashCode hashcode, int i, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(hashcode, i, getanswermap);
    }
}
