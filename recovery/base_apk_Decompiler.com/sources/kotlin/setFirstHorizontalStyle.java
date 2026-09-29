package kotlin;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u0005\u001a\u00020\n2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\n2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0015j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/setFirstHorizontalStyle;", "", "<init>", "()V", "Lo/setFirstHorizontalStyle$write;", "p0", "", "write", "(Lo/setFirstHorizontalStyle$write;)V", "R", "Lo/Flow;", "Lkotlin/Function1;", "Lo/SampleVideos;", "p1", "IconCompatParcelizer", "(Lo/Flow;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "T", "Lkotlin/Function2;", "p2", "read", "(Ljava/lang/Object;Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/write;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/setDownloadPercent;", "AudioAttributesCompatParcelizer", "Lo/setDownloadPercent;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setFirstHorizontalStyle {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AtomicReference<write> IconCompatParcelizer = new AtomicReference<>(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setDownloadPercent RemoteActionCompatParcelizer = setEncryptSalt.AudioAttributesCompatParcelizer(false);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setFirstHorizontalStyle$write;", "", "Lo/Flow;", "p0", "Lo/setPassingYear;", "p1", "<init>", "(Lo/Flow;Lo/setPassingYear;)V", "", "RemoteActionCompatParcelizer", "(Lo/setFirstHorizontalStyle$write;)Z", "", "IconCompatParcelizer", "()V", "Lo/Flow;", "AudioAttributesCompatParcelizer", "Lo/setPassingYear;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final setPassingYear write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final Flow AudioAttributesCompatParcelizer;

        public write(Flow flow, setPassingYear setpassingyear) {
            this.AudioAttributesCompatParcelizer = flow;
            this.write = setpassingyear;
        }

        public final boolean RemoteActionCompatParcelizer(write p0) {
            return this.AudioAttributesCompatParcelizer.compareTo(p0.AudioAttributesCompatParcelizer) >= 0;
        }

        public final void IconCompatParcelizer() {
            this.write.RemoteActionCompatParcelizer(new setFirstHorizontalBias());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(write p0) {
        write writeVar;
        do {
            writeVar = this.IconCompatParcelizer.get();
            if (writeVar != null && !p0.RemoteActionCompatParcelizer(writeVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, writeVar, p0));
        if (writeVar != null) {
            writeVar.IconCompatParcelizer();
        }
    }

    public static /* synthetic */ Object IconCompatParcelizer$default(setFirstHorizontalStyle setfirsthorizontalstyle, Flow flow, getAnswerMap getanswermap, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 1) != 0) {
            flow = Flow.read;
        }
        return setfirsthorizontalstyle.IconCompatParcelizer(flow, getanswermap, sampleVideos);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer<R> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super R>, Object> {
        final /* synthetic */ getAnswerMap<SampleVideos<? super R>, Object> AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ Flow IconCompatParcelizer;
        final /* synthetic */ setFirstHorizontalStyle MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.setDownloadPercent] */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            write writeVar;
            setDownloadPercent setdownloadpercent;
            getAnswerMap<SampleVideos<? super R>, Object> getanswermap;
            setFirstHorizontalStyle setfirsthorizontalstyle;
            setFirstHorizontalStyle setfirsthorizontalstyle2;
            Throwable th;
            write writeVar2;
            setDownloadPercent setdownloadpercent2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            ?? r1 = this.AudioAttributesImplApi21Parcelizer;
            try {
                try {
                    if (r1 == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesImplApi26Parcelizer;
                        Flow flow = this.IconCompatParcelizer;
                        CurrentQuery.write writeVar3 = topUserCompanion.getIconCompatParcelizer().get(setPassingYear.b_);
                        toMagicModuleMetaRepoModel.write(writeVar3);
                        writeVar = new write(flow, (setPassingYear) writeVar3);
                        this.MediaBrowserCompatItemReceiver.write(writeVar);
                        setdownloadpercent = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer;
                        getAnswerMap<SampleVideos<? super R>, Object> getanswermap2 = this.AudioAttributesCompatParcelizer;
                        setFirstHorizontalStyle setfirsthorizontalstyle3 = this.MediaBrowserCompatItemReceiver;
                        this.AudioAttributesImplApi26Parcelizer = writeVar;
                        this.read = setdownloadpercent;
                        this.write = getanswermap2;
                        this.RemoteActionCompatParcelizer = setfirsthorizontalstyle3;
                        this.AudioAttributesImplApi21Parcelizer = 1;
                        if (setdownloadpercent.RemoteActionCompatParcelizer(null, this) != objIconCompatParcelizer) {
                            getanswermap = getanswermap2;
                            setfirsthorizontalstyle = setfirsthorizontalstyle3;
                        }
                        return objIconCompatParcelizer;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        setfirsthorizontalstyle2 = (setFirstHorizontalStyle) this.write;
                        setdownloadpercent2 = (setDownloadPercent) this.read;
                        writeVar2 = (write) this.AudioAttributesImplApi26Parcelizer;
                        try {
                            SdkPayloadData.IconCompatParcelizer(obj);
                            setBackInvokedCallbackEnabled.read(setfirsthorizontalstyle2.IconCompatParcelizer, writeVar2, null);
                            setdownloadpercent2.write(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            setBackInvokedCallbackEnabled.read(setfirsthorizontalstyle2.IconCompatParcelizer, writeVar2, null);
                            throw th;
                        }
                    }
                    setfirsthorizontalstyle = (setFirstHorizontalStyle) this.RemoteActionCompatParcelizer;
                    getanswermap = (getAnswerMap) this.write;
                    setDownloadPercent setdownloadpercent3 = (setDownloadPercent) this.read;
                    write writeVar4 = (write) this.AudioAttributesImplApi26Parcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    setdownloadpercent = setdownloadpercent3;
                    writeVar = writeVar4;
                    this.AudioAttributesImplApi26Parcelizer = writeVar;
                    this.read = setdownloadpercent;
                    this.write = setfirsthorizontalstyle;
                    this.RemoteActionCompatParcelizer = null;
                    this.AudioAttributesImplApi21Parcelizer = 2;
                    Object objInvoke = getanswermap.invoke(this);
                    if (objInvoke != objIconCompatParcelizer) {
                        setfirsthorizontalstyle2 = setfirsthorizontalstyle;
                        setdownloadpercent2 = setdownloadpercent;
                        obj = objInvoke;
                        writeVar2 = writeVar;
                        setBackInvokedCallbackEnabled.read(setfirsthorizontalstyle2.IconCompatParcelizer, writeVar2, null);
                        setdownloadpercent2.write(null);
                        return obj;
                    }
                    return objIconCompatParcelizer;
                } catch (Throwable th3) {
                    setfirsthorizontalstyle2 = setfirsthorizontalstyle;
                    th = th3;
                    writeVar2 = writeVar;
                    setBackInvokedCallbackEnabled.read(setfirsthorizontalstyle2.IconCompatParcelizer, writeVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.write(null);
                throw th4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(Flow flow, setFirstHorizontalStyle setfirsthorizontalstyle, getAnswerMap<? super SampleVideos<? super R>, ? extends Object> getanswermap, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = flow;
            this.MediaBrowserCompatItemReceiver = setfirsthorizontalstyle;
            this.AudioAttributesCompatParcelizer = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, sampleVideos);
            iconCompatParcelizer.AudioAttributesImplApi26Parcelizer = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super R> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final <R> Object IconCompatParcelizer(Flow flow, getAnswerMap<? super SampleVideos<? super R>, ? extends Object> getanswermap, SampleVideos<? super R> sampleVideos) {
        return College.IconCompatParcelizer(new IconCompatParcelizer(flow, this, getanswermap, null), sampleVideos);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer<R> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super R>, Object> {
        final /* synthetic */ Flow AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<T, SampleVideos<? super R>, Object> IconCompatParcelizer;
        final /* synthetic */ setFirstHorizontalStyle MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        final /* synthetic */ T read;
        Object write;

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.setDownloadPercent] */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            write writeVar;
            setDownloadPercent setdownloadpercent;
            Object obj2;
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody;
            setFirstHorizontalStyle setfirsthorizontalstyle;
            setFirstHorizontalStyle setfirsthorizontalstyle2;
            Throwable th;
            write writeVar2;
            setDownloadPercent setdownloadpercent2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            ?? r1 = this.AudioAttributesImplBaseParcelizer;
            try {
                try {
                    if (r1 == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesImplApi26Parcelizer;
                        Flow flow = this.AudioAttributesCompatParcelizer;
                        CurrentQuery.write writeVar3 = topUserCompanion.getIconCompatParcelizer().get(setPassingYear.b_);
                        toMagicModuleMetaRepoModel.write(writeVar3);
                        writeVar = new write(flow, (setPassingYear) writeVar3);
                        this.MediaBrowserCompatCustomActionResultReceiver.write(writeVar);
                        setdownloadpercent = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
                        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2 = this.IconCompatParcelizer;
                        Object obj3 = this.read;
                        setFirstHorizontalStyle setfirsthorizontalstyle3 = this.MediaBrowserCompatCustomActionResultReceiver;
                        this.AudioAttributesImplApi26Parcelizer = writeVar;
                        this.write = setdownloadpercent;
                        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody2;
                        this.MediaBrowserCompatItemReceiver = obj3;
                        this.AudioAttributesImplApi21Parcelizer = setfirsthorizontalstyle3;
                        this.AudioAttributesImplBaseParcelizer = 1;
                        if (setdownloadpercent.RemoteActionCompatParcelizer(null, this) != objIconCompatParcelizer) {
                            obj2 = obj3;
                            magicModuleSubmissionRequestBody = magicModuleSubmissionRequestBody2;
                            setfirsthorizontalstyle = setfirsthorizontalstyle3;
                        }
                        return objIconCompatParcelizer;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        setfirsthorizontalstyle2 = (setFirstHorizontalStyle) this.RemoteActionCompatParcelizer;
                        setdownloadpercent2 = (setDownloadPercent) this.write;
                        writeVar2 = (write) this.AudioAttributesImplApi26Parcelizer;
                        try {
                            SdkPayloadData.IconCompatParcelizer(obj);
                            setBackInvokedCallbackEnabled.read(setfirsthorizontalstyle2.IconCompatParcelizer, writeVar2, null);
                            setdownloadpercent2.write(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            setBackInvokedCallbackEnabled.read(setfirsthorizontalstyle2.IconCompatParcelizer, writeVar2, null);
                            throw th;
                        }
                    }
                    setfirsthorizontalstyle = (setFirstHorizontalStyle) this.AudioAttributesImplApi21Parcelizer;
                    obj2 = this.MediaBrowserCompatItemReceiver;
                    MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3 = (MagicModuleSubmissionRequestBody) this.RemoteActionCompatParcelizer;
                    setDownloadPercent setdownloadpercent3 = (setDownloadPercent) this.write;
                    write writeVar4 = (write) this.AudioAttributesImplApi26Parcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    setdownloadpercent = setdownloadpercent3;
                    magicModuleSubmissionRequestBody = magicModuleSubmissionRequestBody3;
                    writeVar = writeVar4;
                    this.AudioAttributesImplApi26Parcelizer = writeVar;
                    this.write = setdownloadpercent;
                    this.RemoteActionCompatParcelizer = setfirsthorizontalstyle;
                    this.MediaBrowserCompatItemReceiver = null;
                    this.AudioAttributesImplApi21Parcelizer = null;
                    this.AudioAttributesImplBaseParcelizer = 2;
                    Object objInvoke = magicModuleSubmissionRequestBody.invoke(obj2, this);
                    if (objInvoke != objIconCompatParcelizer) {
                        setfirsthorizontalstyle2 = setfirsthorizontalstyle;
                        setdownloadpercent2 = setdownloadpercent;
                        obj = objInvoke;
                        writeVar2 = writeVar;
                        setBackInvokedCallbackEnabled.read(setfirsthorizontalstyle2.IconCompatParcelizer, writeVar2, null);
                        setdownloadpercent2.write(null);
                        return obj;
                    }
                    return objIconCompatParcelizer;
                } catch (Throwable th3) {
                    setfirsthorizontalstyle2 = setfirsthorizontalstyle;
                    th = th3;
                    writeVar2 = writeVar;
                    setBackInvokedCallbackEnabled.read(setfirsthorizontalstyle2.IconCompatParcelizer, writeVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.write(null);
                throw th4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(Flow flow, setFirstHorizontalStyle setfirsthorizontalstyle, MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, T t, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = flow;
            this.MediaBrowserCompatCustomActionResultReceiver = setfirsthorizontalstyle;
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = t;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer, this.read, sampleVideos);
            audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super R> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final <T, R> Object read(T t, Flow flow, MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super R> sampleVideos) {
        return College.IconCompatParcelizer(new AudioAttributesCompatParcelizer(flow, this, magicModuleSubmissionRequestBody, t, null), sampleVideos);
    }
}
