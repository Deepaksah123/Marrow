package kotlin;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0005\u001a\u00020\n2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0007\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0007\u0010\u0012R(\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000e\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019"}, d2 = {"Lo/JsonAlias;", "", "<init>", "()V", "Lo/JsonAlias$AudioAttributesCompatParcelizer;", "p0", "", "IconCompatParcelizer", "(Lo/JsonAlias$AudioAttributesCompatParcelizer;)V", "R", "Lo/Flow;", "Lkotlin/Function1;", "Lo/SampleVideos;", "p1", "AudioAttributesCompatParcelizer", "(Lo/Flow;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "(Lo/getCreatedOnDateMs;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/write;", "write", "Ljava/util/concurrent/atomic/AtomicReference;", "RemoteActionCompatParcelizer", "Lo/setDownloadPercent;", "Lo/setDownloadPercent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonAlias {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AtomicReference<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer = new AtomicReference<>(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setDownloadPercent AudioAttributesCompatParcelizer = setEncryptSalt.AudioAttributesCompatParcelizer(false);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/JsonAlias$AudioAttributesCompatParcelizer;", "", "Lo/Flow;", "p0", "Lo/setPassingYear;", "p1", "<init>", "(Lo/Flow;Lo/setPassingYear;)V", "", "AudioAttributesCompatParcelizer", "(Lo/JsonAlias$AudioAttributesCompatParcelizer;)Z", "", "()V", "Lo/Flow;", "IconCompatParcelizer", "Lo/setPassingYear;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final Flow IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final setPassingYear AudioAttributesCompatParcelizer;

        public AudioAttributesCompatParcelizer(Flow flow, setPassingYear setpassingyear) {
            this.IconCompatParcelizer = flow;
            this.AudioAttributesCompatParcelizer = setpassingyear;
        }

        public final boolean AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer p0) {
            return this.IconCompatParcelizer.compareTo(p0.IconCompatParcelizer) >= 0;
        }

        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((CancellationException) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(AudioAttributesCompatParcelizer p0) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        do {
            audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.get();
            if (audioAttributesCompatParcelizer != null && !p0.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!setBackInvokedCallbackEnabled.read(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer, p0));
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer<R> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super R>, Object> {
        final /* synthetic */ getAnswerMap<SampleVideos<? super R>, Object> AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ JsonAlias AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        private /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        final /* synthetic */ Flow read;
        Object write;

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.setDownloadPercent] */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            setDownloadPercent setdownloadpercent;
            getAnswerMap<SampleVideos<? super R>, Object> getanswermap;
            JsonAlias jsonAlias;
            JsonAlias jsonAlias2;
            Throwable th;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2;
            setDownloadPercent setdownloadpercent2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            ?? r1 = this.AudioAttributesImplApi21Parcelizer;
            try {
                try {
                    if (r1 == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        TopUserCompanion topUserCompanion = (TopUserCompanion) this.MediaBrowserCompatCustomActionResultReceiver;
                        Flow flow = this.read;
                        CurrentQuery.write writeVar = topUserCompanion.getIconCompatParcelizer().get(setPassingYear.b_);
                        toMagicModuleMetaRepoModel.write(writeVar);
                        audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(flow, (setPassingYear) writeVar);
                        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizer);
                        setdownloadpercent = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer;
                        getAnswerMap<SampleVideos<? super R>, Object> getanswermap2 = this.AudioAttributesCompatParcelizer;
                        JsonAlias jsonAlias3 = this.AudioAttributesImplBaseParcelizer;
                        this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer;
                        this.write = setdownloadpercent;
                        this.IconCompatParcelizer = getanswermap2;
                        this.RemoteActionCompatParcelizer = jsonAlias3;
                        this.AudioAttributesImplApi21Parcelizer = 1;
                        if (setdownloadpercent.RemoteActionCompatParcelizer(null, this) != objIconCompatParcelizer) {
                            getanswermap = getanswermap2;
                            jsonAlias = jsonAlias3;
                        }
                        return objIconCompatParcelizer;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jsonAlias2 = (JsonAlias) this.IconCompatParcelizer;
                        setdownloadpercent2 = (setDownloadPercent) this.write;
                        audioAttributesCompatParcelizer2 = (AudioAttributesCompatParcelizer) this.MediaBrowserCompatCustomActionResultReceiver;
                        try {
                            SdkPayloadData.IconCompatParcelizer(obj);
                            setBackInvokedCallbackEnabled.read(jsonAlias2.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer2, null);
                            setdownloadpercent2.write(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            setBackInvokedCallbackEnabled.read(jsonAlias2.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer2, null);
                            throw th;
                        }
                    }
                    jsonAlias = (JsonAlias) this.RemoteActionCompatParcelizer;
                    getanswermap = (getAnswerMap) this.IconCompatParcelizer;
                    setDownloadPercent setdownloadpercent3 = (setDownloadPercent) this.write;
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = (AudioAttributesCompatParcelizer) this.MediaBrowserCompatCustomActionResultReceiver;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    setdownloadpercent = setdownloadpercent3;
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizer3;
                    this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer;
                    this.write = setdownloadpercent;
                    this.IconCompatParcelizer = jsonAlias;
                    this.RemoteActionCompatParcelizer = null;
                    this.AudioAttributesImplApi21Parcelizer = 2;
                    Object objInvoke = getanswermap.invoke(this);
                    if (objInvoke != objIconCompatParcelizer) {
                        jsonAlias2 = jsonAlias;
                        setdownloadpercent2 = setdownloadpercent;
                        obj = objInvoke;
                        audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                        setBackInvokedCallbackEnabled.read(jsonAlias2.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer2, null);
                        setdownloadpercent2.write(null);
                        return obj;
                    }
                    return objIconCompatParcelizer;
                } catch (Throwable th3) {
                    jsonAlias2 = jsonAlias;
                    th = th3;
                    audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                    setBackInvokedCallbackEnabled.read(jsonAlias2.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.write(null);
                throw th4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(Flow flow, JsonAlias jsonAlias, getAnswerMap<? super SampleVideos<? super R>, ? extends Object> getanswermap, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = flow;
            this.AudioAttributesImplBaseParcelizer = jsonAlias;
            this.AudioAttributesCompatParcelizer = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.read, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = obj;
            return remoteActionCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super R> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final <R> Object AudioAttributesCompatParcelizer(Flow flow, getAnswerMap<? super SampleVideos<? super R>, ? extends Object> getanswermap, SampleVideos<? super R> sampleVideos) {
        return College.IconCompatParcelizer(new RemoteActionCompatParcelizer(flow, this, getanswermap, null), sampleVideos);
    }

    public final boolean IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        boolean zRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(null);
        if (!zRemoteActionCompatParcelizer) {
            return zRemoteActionCompatParcelizer;
        }
        try {
            p0.invoke();
            return zRemoteActionCompatParcelizer;
        } finally {
            this.AudioAttributesCompatParcelizer.write(null);
        }
    }
}
