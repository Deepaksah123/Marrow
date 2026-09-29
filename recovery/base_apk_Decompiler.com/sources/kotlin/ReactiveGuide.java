package kotlin;

import kotlin.Metadata;
import kotlin.ReactiveGuide;
import kotlin.setTag;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001c\u001a\u00020\u00122.\u0010\u0003\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$J§\u0001\u0010%\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u0019J\u0013\u0010%\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\b%\u0010'J\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010'R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R8\u0010*\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010.R8\u0010!\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-"}, d2 = {"Lo/ReactiveGuide;", "Lo/Guideline;", "Lo/setEmptyVisibility;", "p0", "Lkotlin/Function1;", "Lo/handleWeirdNumberValue;", "", "p1", "Lo/superDispatchKeyEvent;", "p2", "p3", "Lo/hashCode;", "p4", "p5", "Lkotlin/Function3;", "Lo/TopUserCompanion;", "Lo/getReferencedType;", "Lo/SampleVideos;", "", "", "p6", "", "p7", "p8", "<init>", "(Lo/setEmptyVisibility;Lo/getAnswerMap;Lo/superDispatchKeyEvent;ZLo/hashCode;ZLo/getModuleData;Lo/getModuleData;Z)V", "Lkotlin/Function2;", "Lo/setTag$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "write", "(J)V", "Lo/setTag$write;", "AudioAttributesCompatParcelizer", "(Lo/setTag$write;)V", "MediaMetadataCompat", "()Z", "read", "Lo/UnsupportedTypeDeserializer;", "(J)J", "MediaBrowserCompatItemReceiver", "Lo/setEmptyVisibility;", "RemoteActionCompatParcelizer", "Lo/superDispatchKeyEvent;", "AudioAttributesImplApi21Parcelizer", "Z", "Lo/getModuleData;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactiveGuide extends Guideline {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getModuleData<? super TopUserCompanion, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getModuleData<? super TopUserCompanion, ? super Float, ? super SampleVideos<? super getShowPopup>, ? extends Object> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private setEmptyVisibility IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private superDispatchKeyEvent read;

    public ReactiveGuide(setEmptyVisibility setemptyvisibility, getAnswerMap<? super handleWeirdNumberValue, Boolean> getanswermap, superDispatchKeyEvent superdispatchkeyevent, boolean z, hashCode hashcode, boolean z2, getModuleData<? super TopUserCompanion, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, getModuleData<? super TopUserCompanion, ? super Float, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata2, boolean z3) {
        super(getanswermap, z, hashcode, superdispatchkeyevent);
        this.IconCompatParcelizer = setemptyvisibility;
        this.read = superdispatchkeyevent;
        this.write = z2;
        this.RemoteActionCompatParcelizer = getmoduledata;
        this.AudioAttributesCompatParcelizer = getmoduledata2;
        this.MediaBrowserCompatItemReceiver = z3;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<Placeholder, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        final /* synthetic */ ReactiveGuide read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final Placeholder placeholder = (Placeholder) this.AudioAttributesCompatParcelizer;
                MagicModuleSubmissionRequestBody<getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.IconCompatParcelizer;
                final ReactiveGuide reactiveGuide = this.read;
                getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup> getanswermap = new getAnswerMap() { // from class: o.setApplyToConstraintSetId
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return ReactiveGuide.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(placeholder, reactiveGuide, (setTag.AudioAttributesCompatParcelizer) obj2);
                    }
                };
                this.write = 1;
                if (magicModuleSubmissionRequestBody.invoke(getanswermap, this) == objIconCompatParcelizer) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(Placeholder placeholder, ReactiveGuide reactiveGuide, setTag.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            placeholder.write(setContentId.RemoteActionCompatParcelizer(reactiveGuide.IconCompatParcelizer(audioAttributesCompatParcelizer.getWrite()), reactiveGuide.read));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, ReactiveGuide reactiveGuide, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = reactiveGuide;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read, sampleVideos);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = obj;
            return remoteActionCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Placeholder placeholder, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(placeholder, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.Guideline
    public final Object IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(Flow.AudioAttributesCompatParcelizer, new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, this, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        final /* synthetic */ long read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.IconCompatParcelizer;
                getModuleData getmoduledata = ReactiveGuide.this.RemoteActionCompatParcelizer;
                getReferencedType getreferencedtype = getReferencedType.read(this.read);
                this.write = 1;
                if (getmoduledata.AudioAttributesCompatParcelizer(topUserCompanion, getreferencedtype, this) == objIconCompatParcelizer) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(long j, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = ReactiveGuide.this.new write(this.read, sampleVideos);
            writeVar.IconCompatParcelizer = obj;
            return writeVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.Guideline
    public final void write(long p0) {
        if (!getRatingCompat() || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setContentId.IconCompatParcelizer)) {
            return;
        }
        C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, getCollegeName.AudioAttributesCompatParcelizer, new write(p0, null), 1);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        int read;
        final /* synthetic */ setTag.write write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.IconCompatParcelizer;
                getModuleData getmoduledata = ReactiveGuide.this.AudioAttributesCompatParcelizer;
                Float fWrite = QBankStatsResponse.write(setContentId.AudioAttributesCompatParcelizer(ReactiveGuide.this.read(this.write.getRemoteActionCompatParcelizer()), ReactiveGuide.this.read));
                this.read = 1;
                if (getmoduledata.AudioAttributesCompatParcelizer(topUserCompanion, fWrite, this) == objIconCompatParcelizer) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(setTag.write writeVar, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = writeVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = ReactiveGuide.this.new IconCompatParcelizer(this.write, sampleVideos);
            iconCompatParcelizer.IconCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.Guideline
    public final void AudioAttributesCompatParcelizer(setTag.write p0) {
        if (!getRatingCompat() || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, setContentId.RemoteActionCompatParcelizer)) {
            return;
        }
        C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, getCollegeName.AudioAttributesCompatParcelizer, new IconCompatParcelizer(p0, null), 1);
    }

    @Override // kotlin.Guideline
    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final void read(setEmptyVisibility p0, getAnswerMap<? super handleWeirdNumberValue, Boolean> p1, superDispatchKeyEvent p2, boolean p3, hashCode p4, boolean p5, getModuleData<? super TopUserCompanion, ? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> p6, getModuleData<? super TopUserCompanion, ? super Float, ? super SampleVideos<? super getShowPopup>, ? extends Object> p7, boolean p8) {
        boolean z;
        boolean z2 = true;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0)) {
            z = false;
        } else {
            this.IconCompatParcelizer = p0;
            z = true;
        }
        if (this.read != p2) {
            this.read = p2;
            z = true;
        }
        if (this.MediaBrowserCompatItemReceiver != p8) {
            this.MediaBrowserCompatItemReceiver = p8;
        } else {
            z2 = z;
        }
        this.RemoteActionCompatParcelizer = p6;
        this.AudioAttributesCompatParcelizer = p7;
        this.write = p5;
        IconCompatParcelizer(p1, p3, p4, p2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long read(long j) {
        return UnsupportedTypeDeserializer.IconCompatParcelizer(j, this.MediaBrowserCompatItemReceiver ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long IconCompatParcelizer(long j) {
        return getReferencedType.read(j, this.MediaBrowserCompatItemReceiver ? -1.0f : 1.0f);
    }
}
