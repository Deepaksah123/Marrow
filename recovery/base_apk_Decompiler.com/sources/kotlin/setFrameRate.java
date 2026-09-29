package kotlin;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.setFrameRate;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B\u007f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J}\u0010\u0018\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0004*\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001c\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\"\u0010/\u001a\u00020\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b\u001c\u0010.R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u000204008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u00103"}, d2 = {"Lo/setFrameRate;", "Lo/getLongMask;", "Lo/invoke;", "Lkotlin/Function0;", "", "p0", "", "p1", "p2", "p3", "", "p4", "Lo/hashCode;", "p5", "Lo/setParentLayoutDirection;", "p6", "p7", "p8", "p9", "Lo/keyDeserializers;", "p10", "<init>", "(Lo/getCreatedOnDateMs;Ljava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;ZLo/hashCode;Lo/setParentLayoutDirection;ZZLjava/lang/String;Lo/keyDeserializers;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/handleWeirdStringValue;", "read", "()Lo/handleWeirdStringValue;", "(Lo/getCreatedOnDateMs;Ljava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/hashCode;Lo/setParentLayoutDirection;ZZLjava/lang/String;Lo/keyDeserializers;)V", "Lo/getConfigOverride;", "IconCompatParcelizer", "(Lo/getConfigOverride;)V", "Lo/constructType;", "(Landroid/view/KeyEvent;)Z", "RemoteActionCompatParcelizer", "RatingCompat", "()V", "p_", "onRewind", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "write", "MediaBrowserCompatItemReceiver", "Lo/getCreatedOnDateMs;", "AudioAttributesImplApi26Parcelizer", "Z", "onCustomAction", "()Z", "(Z)V", "AudioAttributesCompatParcelizer", "Lo/ActivityChooserViewInnerLayout;", "Lo/setPassingYear;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/ActivityChooserViewInnerLayout;", "Lo/setFrameRate$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setFrameRate extends invoke {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final ActivityChooserViewInnerLayout<setPassingYear> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ActivityChooserViewInnerLayout<AudioAttributesCompatParcelizer> MediaBrowserCompatItemReceiver;

    private setFrameRate(getCreatedOnDateMs<getShowPopup> getcreatedondatems, String str, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getCreatedOnDateMs<getShowPopup> getcreatedondatems3, boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, boolean z3, String str2, C0184keyDeserializers c0184keyDeserializers) {
        super(hashcode, setparentlayoutdirection, z2, z3, str2, c0184keyDeserializers, getcreatedondatems, null);
        this.write = str;
        this.IconCompatParcelizer = getcreatedondatems2;
        this.read = getcreatedondatems3;
        this.AudioAttributesCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = setOnMenuItemClickListener.read();
        this.MediaBrowserCompatItemReceiver = setOnMenuItemClickListener.read();
    }

    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\b\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\b\u0010\u000e"}, d2 = {"Lo/setFrameRate$AudioAttributesCompatParcelizer;", "", "Lo/setPassingYear;", "p0", "<init>", "(Lo/setPassingYear;)V", "read", "Lo/setPassingYear;", "AudioAttributesCompatParcelizer", "()Lo/setPassingYear;", "", "Z", "RemoteActionCompatParcelizer", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private final setPassingYear read;

        public AudioAttributesCompatParcelizer(setPassingYear setpassingyear) {
            this.read = setpassingyear;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final setPassingYear getRead() {
            return this.read;
        }

        public final void AudioAttributesCompatParcelizer(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Override // kotlin.invoke
    public final handleWeirdStringValue read() {
        return hasSomeOfFeatures.write(new RemoteActionCompatParcelizer());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements PointerInputEventHandler {
        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            getAnswerMap getanswermap;
            getAnswerMap getanswermap2;
            if (!setFrameRate.this.getMediaBrowserCompatItemReceiver() || setFrameRate.this.read == null) {
                getanswermap = null;
            } else {
                final setFrameRate setframerate = setFrameRate.this;
                getanswermap = new getAnswerMap() { // from class: o.getClockui_tooling
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setFrameRate.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(setframerate, (getReferencedType) obj);
                    }
                };
            }
            if (!setFrameRate.this.getMediaBrowserCompatItemReceiver() || setFrameRate.this.IconCompatParcelizer == null) {
                getanswermap2 = null;
            } else {
                final setFrameRate setframerate2 = setFrameRate.this;
                getanswermap2 = new getAnswerMap() { // from class: o.getViewInfosui_tooling
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setFrameRate.RemoteActionCompatParcelizer.write(setframerate2, (getReferencedType) obj);
                    }
                };
            }
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(setFrameRate.this, null);
            final setFrameRate setframerate3 = setFrameRate.this;
            Object objAudioAttributesCompatParcelizer = isSpanStillValid.AudioAttributesCompatParcelizer(handlebadmerge, getanswermap, getanswermap2, anonymousClass4, new getAnswerMap() { // from class: o.setClockui_tooling
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setFrameRate.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(setframerate3, (getReferencedType) obj);
                }
            }, sampleVideos);
            return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(setFrameRate setframerate, getReferencedType getreferencedtype) {
            getCreatedOnDateMs getcreatedondatems = setframerate.read;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(setFrameRate setframerate, getReferencedType getreferencedtype) {
            getCreatedOnDateMs getcreatedondatems = setframerate.IconCompatParcelizer;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
            if (setframerate.getAudioAttributesCompatParcelizer()) {
                ((depositSchemaProperty) MappingJsonFactory.write(setframerate, getDefaultNullValueSerializer.MediaBrowserCompatItemReceiver())).AudioAttributesCompatParcelizer(isNonStaticInnerClass.INSTANCE.AudioAttributesImplApi26Parcelizer());
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.setFrameRate$RemoteActionCompatParcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends getMagicModuleStats implements getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> {
            int IconCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;
            /* synthetic */ long read;
            final /* synthetic */ setFrameRate write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    RemoteActionCompat remoteActionCompat = (RemoteActionCompat) this.RemoteActionCompatParcelizer;
                    long j = this.read;
                    if (this.write.getMediaBrowserCompatItemReceiver()) {
                        this.IconCompatParcelizer = 1;
                        if (this.write.IconCompatParcelizer(remoteActionCompat, j, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(setFrameRate setframerate, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(3, sampleVideos);
                this.write = setframerate;
            }

            @Override // kotlin.getModuleData
            public final /* synthetic */ Object AudioAttributesCompatParcelizer(RemoteActionCompat remoteActionCompat, getReferencedType getreferencedtype, SampleVideos<? super getShowPopup> sampleVideos) {
                return read(remoteActionCompat, getreferencedtype.getWrite(), sampleVideos);
            }

            public final Object read(RemoteActionCompat remoteActionCompat, long j, SampleVideos<? super getShowPopup> sampleVideos) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.write, sampleVideos);
                anonymousClass4.RemoteActionCompatParcelizer = remoteActionCompat;
                anonymousClass4.read = j;
                return anonymousClass4.invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup MediaBrowserCompatItemReceiver(setFrameRate setframerate, getReferencedType getreferencedtype) {
            if (setframerate.getMediaBrowserCompatItemReceiver()) {
                setframerate.AudioAttributesImplApi26Parcelizer().invoke();
            }
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer() {
        }
    }

    public final void read(getCreatedOnDateMs<getShowPopup> p0, String p1, getCreatedOnDateMs<getShowPopup> p2, getCreatedOnDateMs<getShowPopup> p3, hashCode p4, setParentLayoutDirection p5, boolean p6, boolean p7, String p8, C0184keyDeserializers p9) {
        boolean z;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) p1)) {
            this.write = p1;
            getValueNulls.write(this);
        }
        if ((this.IconCompatParcelizer == null) != (p2 == null)) {
            IconCompatParcelizer();
            getValueNulls.write(this);
            z = true;
        } else {
            z = false;
        }
        this.IconCompatParcelizer = p2;
        if ((this.read == null) != (p3 == null)) {
            z = true;
        }
        this.read = p3;
        boolean z2 = getMediaBrowserCompatItemReceiver() != p7 ? true : z;
        read(p4, p5, p6, p7, p8, p9, p0);
        if (z2) {
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    @Override // kotlin.invoke
    public final void IconCompatParcelizer(getConfigOverride getconfigoverride) {
        if (this.IconCompatParcelizer != null) {
            MapperBuilder.AudioAttributesImplApi21Parcelizer(getconfigoverride, this.write, new getCreatedOnDateMs() { // from class: o.ComposeViewAdapter
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Boolean.valueOf(setFrameRate.write(this.write));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(setFrameRate setframerate) {
        getCreatedOnDateMs<getShowPopup> getcreatedondatems = setframerate.IconCompatParcelizer;
        if (getcreatedondatems == null) {
            return true;
        }
        getcreatedondatems.invoke();
        return true;
    }

    @Override // kotlin.invoke
    protected final boolean IconCompatParcelizer(KeyEvent p0) {
        boolean z;
        long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
        if (this.IconCompatParcelizer == null || this.RemoteActionCompatParcelizer.read(jIconCompatParcelizer) != null) {
            z = false;
        } else {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(jIconCompatParcelizer, C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new read(null), 3));
            z = true;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.read(jIconCompatParcelizer);
        if (audioAttributesCompatParcelizer != null) {
            if (audioAttributesCompatParcelizer.getRead().read()) {
                audioAttributesCompatParcelizer.getRead().RemoteActionCompatParcelizer((CancellationException) null);
                if (!audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) {
                    AudioAttributesImplApi26Parcelizer().invoke();
                    this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(jIconCompatParcelizer);
                    return z;
                }
            } else {
                this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(jIconCompatParcelizer);
            }
        }
        return z;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(((CoercionConfig) MappingJsonFactory.write(setFrameRate.this, getDefaultNullValueSerializer.onAddQueueItem())).IconCompatParcelizer(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getCreatedOnDateMs getcreatedondatems = setFrameRate.this.IconCompatParcelizer;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setFrameRate.this.new read(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.invoke
    protected final boolean RemoteActionCompatParcelizer(KeyEvent p0) {
        getCreatedOnDateMs<getShowPopup> getcreatedondatems;
        long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
        boolean z = false;
        if (this.RemoteActionCompatParcelizer.read(jIconCompatParcelizer) != null) {
            setPassingYear setpassingyear = this.RemoteActionCompatParcelizer.read(jIconCompatParcelizer);
            if (setpassingyear != null) {
                if (setpassingyear.read()) {
                    setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
                } else {
                    z = true;
                }
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(jIconCompatParcelizer);
        }
        if (this.read != null) {
            if (this.MediaBrowserCompatItemReceiver.read(jIconCompatParcelizer) != null) {
                if (!z && (getcreatedondatems = this.read) != null) {
                    getcreatedondatems.invoke();
                }
                this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(jIconCompatParcelizer);
            } else if (!z) {
                this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(jIconCompatParcelizer, new AudioAttributesCompatParcelizer(C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new IconCompatParcelizer(jIconCompatParcelizer, null), 3)));
            }
        } else if (!z) {
            AudioAttributesImplApi26Parcelizer().invoke();
        }
        return true;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        long AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        long RemoteActionCompatParcelizer;
        final /* synthetic */ long write;

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            if (kotlin.setCountry.IconCompatParcelizer(r4 - r6, r10) == r0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r10.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L6c
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L1a:
                long r4 = r10.RemoteActionCompatParcelizer
                long r6 = r10.AudioAttributesCompatParcelizer
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L4c
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                o.setFrameRate r11 = kotlin.setFrameRate.this
                o.getLongMask r11 = (kotlin.getLongMask) r11
                o.CharacterEscapes r1 = kotlin.getDefaultNullValueSerializer.onAddQueueItem()
                o.getTokenColumnNr r1 = (kotlin.getTokenColumnNr) r1
                java.lang.Object r11 = kotlin.MappingJsonFactory.write(r11, r1)
                o.CoercionConfig r11 = (kotlin.CoercionConfig) r11
                long r6 = r11.AudioAttributesCompatParcelizer()
                long r4 = r11.read()
                r11 = r10
                o.SampleVideos r11 = (kotlin.SampleVideos) r11
                r10.AudioAttributesCompatParcelizer = r6
                r10.RemoteActionCompatParcelizer = r4
                r10.IconCompatParcelizer = r3
                java.lang.Object r11 = kotlin.setCountry.IconCompatParcelizer(r6, r11)
                if (r11 == r0) goto L78
            L4c:
                o.setFrameRate r11 = kotlin.setFrameRate.this
                o.ActivityChooserViewInnerLayout r11 = kotlin.setFrameRate.AudioAttributesCompatParcelizer(r11)
                long r8 = r10.write
                java.lang.Object r11 = r11.read(r8)
                o.setFrameRate$AudioAttributesCompatParcelizer r11 = (o.setFrameRate.AudioAttributesCompatParcelizer) r11
                if (r11 == 0) goto L5f
                r11.AudioAttributesCompatParcelizer(r3)
            L5f:
                r11 = r10
                o.SampleVideos r11 = (kotlin.SampleVideos) r11
                r10.IconCompatParcelizer = r2
                long r4 = r4 - r6
                java.lang.Object r11 = kotlin.setCountry.IconCompatParcelizer(r4, r11)
                if (r11 != r0) goto L6c
                goto L78
            L6c:
                o.setFrameRate r10 = kotlin.setFrameRate.this
                o.getCreatedOnDateMs r10 = r10.AudioAttributesImplApi26Parcelizer()
                r10.invoke()
                o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                return r10
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setFrameRate.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(long j, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setFrameRate.this.new IconCompatParcelizer(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.invoke
    protected final void RatingCompat() {
        onRewind();
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void p_() {
        super.p_();
        onRewind();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onRewind() {
        /*
            r21 = this;
            r0 = r21
            o.ActivityChooserViewInnerLayout<o.setPassingYear> r1 = r0.RemoteActionCompatParcelizer
            r2 = r1
            o.setOverflowIcon r2 = (kotlin.setOverflowIcon) r2
            java.lang.Object[] r3 = r2.MediaBrowserCompatCustomActionResultReceiver
            long[] r2 = r2.RemoteActionCompatParcelizer
            int r4 = r2.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 0
            r13 = 8
            if (r4 < 0) goto L4e
            r14 = r12
        L1a:
            r5 = r2[r14]
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L49
            int r7 = r14 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r12
        L2c:
            if (r8 >= r7) goto L47
            r17 = 255(0xff, double:1.26E-321)
            long r19 = r5 & r17
            r15 = 128(0x80, double:6.3E-322)
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto L43
            int r19 = r14 << 3
            int r19 = r19 + r8
            r19 = r3[r19]
            o.setPassingYear r19 = (kotlin.setPassingYear) r19
            o.setPassingYear.read.write(r19)
        L43:
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L2c
        L47:
            if (r7 != r13) goto L4e
        L49:
            if (r14 == r4) goto L4e
            int r14 = r14 + 1
            goto L1a
        L4e:
            r1.IconCompatParcelizer()
            o.ActivityChooserViewInnerLayout<o.setFrameRate$AudioAttributesCompatParcelizer> r0 = r0.MediaBrowserCompatItemReceiver
            r1 = r0
            o.setOverflowIcon r1 = (kotlin.setOverflowIcon) r1
            java.lang.Object[] r2 = r1.MediaBrowserCompatCustomActionResultReceiver
            long[] r1 = r1.RemoteActionCompatParcelizer
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La1
            r4 = r12
        L60:
            r5 = r1[r4]
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L98
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r12
        L72:
            if (r8 >= r7) goto L91
            r17 = 255(0xff, double:1.26E-321)
            long r19 = r5 & r17
            r14 = 128(0x80, double:6.3E-322)
            int r16 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r16 >= 0) goto L8d
            int r16 = r4 << 3
            int r16 = r16 + r8
            r16 = r2[r16]
            o.setFrameRate$AudioAttributesCompatParcelizer r16 = (o.setFrameRate.AudioAttributesCompatParcelizer) r16
            o.setPassingYear r16 = r16.getRead()
            o.setPassingYear.read.write(r16)
        L8d:
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L72
        L91:
            r14 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
            if (r7 != r13) goto La1
            goto L9c
        L98:
            r14 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L9c:
            if (r4 == r3) goto La1
            int r4 = r4 + 1
            goto L60
        La1:
            r0.IconCompatParcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setFrameRate.onRewind():void");
    }

    public /* synthetic */ setFrameRate(getCreatedOnDateMs getcreatedondatems, String str, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, boolean z, hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z2, boolean z3, String str2, C0184keyDeserializers c0184keyDeserializers, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getcreatedondatems, str, getcreatedondatems2, getcreatedondatems3, z, hashcode, setparentlayoutdirection, z2, z3, str2, c0184keyDeserializers);
    }
}
