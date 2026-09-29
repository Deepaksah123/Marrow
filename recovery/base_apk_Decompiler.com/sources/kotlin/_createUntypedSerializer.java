package kotlin;

import android.view.Choreographer;
import kotlin.C0177getRfBanners;
import kotlin.CurrentQuery;
import kotlin.Metadata;
import kotlin.appendDesc;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\u000fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/_createUntypedSerializer;", "Lo/appendDesc;", "Landroid/view/Choreographer;", "p0", "Lo/getDefaultPrettyPrinter;", "p1", "<init>", "(Landroid/view/Choreographer;Lo/getDefaultPrettyPrinter;)V", "R", "Lkotlin/Function1;", "", "IconCompatParcelizer", "(Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "read", "Landroid/view/Choreographer;", "()Landroid/view/Choreographer;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/getDefaultPrettyPrinter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _createUntypedSerializer implements appendDesc {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getDefaultPrettyPrinter IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Choreographer RemoteActionCompatParcelizer;

    public _createUntypedSerializer(Choreographer choreographer, getDefaultPrettyPrinter getdefaultprettyprinter) {
        this.RemoteActionCompatParcelizer = choreographer;
        this.IconCompatParcelizer = getdefaultprettyprinter;
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) appendDesc.DefaultImpls.write(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) appendDesc.DefaultImpls.AudioAttributesCompatParcelizer(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return appendDesc.DefaultImpls.IconCompatParcelizer(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return appendDesc.DefaultImpls.IconCompatParcelizer(this, currentQuery);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Choreographer getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.appendDesc
    public final <R> Object IconCompatParcelizer(final getAnswerMap<? super Long, ? extends R> getanswermap, SampleVideos<? super R> sampleVideos) {
        getDefaultPrettyPrinter getdefaultprettyprinter = this.IconCompatParcelizer;
        if (getdefaultprettyprinter == null) {
            CurrentQuery.write writeVar = sampleVideos.getWrite().get(getPlaybackInterval.INSTANCE);
            getdefaultprettyprinter = writeVar instanceof getDefaultPrettyPrinter ? (getDefaultPrettyPrinter) writeVar : null;
        }
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        final setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: o._createUntypedSerializer.5
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object obj;
                SampleVideos sampleVideos2 = setstatesolvedcount2;
                getAnswerMap<Long, R> getanswermap2 = getanswermap;
                try {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                    obj = C0177getRfBanners.read(getanswermap2.invoke(Long.valueOf(j)));
                } catch (Throwable th) {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                    obj = C0177getRfBanners.read(SdkPayloadData.write(th));
                }
                sampleVideos2.resumeWith(obj);
            }
        };
        if (getdefaultprettyprinter != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getdefaultprettyprinter.getAudioAttributesCompatParcelizer(), getRemoteActionCompatParcelizer())) {
            getdefaultprettyprinter.IconCompatParcelizer(frameCallback);
            setstatesolvedcount2.write((getAnswerMap<? super Throwable, getShowPopup>) new AnonymousClass1(getdefaultprettyprinter, frameCallback));
        } else {
            getRemoteActionCompatParcelizer().postFrameCallback(frameCallback);
            setstatesolvedcount2.write((getAnswerMap<? super Throwable, getShowPopup>) new AnonymousClass2(frameCallback));
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o._createUntypedSerializer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "read", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ Choreographer.FrameCallback $AudioAttributesCompatParcelizer;
        final /* synthetic */ getDefaultPrettyPrinter $read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            read(th);
            return getShowPopup.INSTANCE;
        }

        public final void read(Throwable th) {
            this.$read.write(this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(getDefaultPrettyPrinter getdefaultprettyprinter, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.$read = getdefaultprettyprinter;
            this.$AudioAttributesCompatParcelizer = frameCallback;
        }
    }

    /* JADX INFO: renamed from: o._createUntypedSerializer$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ Choreographer.FrameCallback $write;

        public final void IconCompatParcelizer(Throwable th) {
            _createUntypedSerializer.this.getRemoteActionCompatParcelizer().removeFrameCallback(this.$write);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            IconCompatParcelizer(th);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.$write = frameCallback;
        }
    }
}
