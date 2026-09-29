package kotlin;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u0005\u001a\u00020\n2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/Toolbar;", "", "<init>", "()V", "Lo/Toolbar$write;", "p0", "", "read", "(Lo/Toolbar$write;)V", "R", "Lo/setTrackTintMode;", "Lkotlin/Function1;", "Lo/SampleVideos;", "p1", "write", "(Lo/setTrackTintMode;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicReference;", "RemoteActionCompatParcelizer", "Lo/setDownloadPercent;", "IconCompatParcelizer", "Lo/setDownloadPercent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Toolbar {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final AtomicReference<write> RemoteActionCompatParcelizer = new AtomicReference<>(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setDownloadPercent write = setEncryptSalt.AudioAttributesCompatParcelizer(false);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0011"}, d2 = {"Lo/Toolbar$write;", "", "Lo/setTrackTintMode;", "p0", "Lo/setPassingYear;", "p1", "<init>", "(Lo/setTrackTintMode;Lo/setPassingYear;)V", "", "read", "(Lo/Toolbar$write;)Z", "", "RemoteActionCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "Lo/setTrackTintMode;", "IconCompatParcelizer", "Lo/setPassingYear;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final setTrackTintMode IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final setPassingYear AudioAttributesCompatParcelizer;

        public write(setTrackTintMode settracktintmode, setPassingYear setpassingyear) {
            this.IconCompatParcelizer = settracktintmode;
            this.AudioAttributesCompatParcelizer = setpassingyear;
        }

        public final boolean read(write p0) {
            return this.IconCompatParcelizer.compareTo(p0.IconCompatParcelizer) >= 0;
        }

        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new setCollapseContentDescription());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(write p0) {
        write writeVar;
        do {
            writeVar = this.RemoteActionCompatParcelizer.get();
            if (writeVar != null && !p0.read(writeVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!setBackInvokedCallbackEnabled.read(this.RemoteActionCompatParcelizer, writeVar, p0));
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer();
        }
    }

    public static /* synthetic */ Object write$default(Toolbar toolbar, setTrackTintMode settracktintmode, getAnswerMap getanswermap, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 1) != 0) {
            settracktintmode = setTrackTintMode.AudioAttributesCompatParcelizer;
        }
        return toolbar.write(settracktintmode, getanswermap, sampleVideos);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read<R> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super R>, Object> {
        Object AudioAttributesCompatParcelizer;
        final /* synthetic */ Toolbar AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        final /* synthetic */ getAnswerMap<SampleVideos<? super R>, Object> IconCompatParcelizer;
        int MediaBrowserCompatItemReceiver;
        final /* synthetic */ setTrackTintMode RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: Type inference failed for: r1v0, types: [int, o.setDownloadPercent] */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            write writeVar;
            setDownloadPercent setdownloadpercent;
            getAnswerMap<SampleVideos<? super R>, Object> getanswermap;
            Toolbar toolbar;
            Toolbar toolbar2;
            Throwable th;
            write writeVar2;
            setDownloadPercent setdownloadpercent2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            ?? r1 = this.MediaBrowserCompatItemReceiver;
            try {
                try {
                    if (r1 == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesImplBaseParcelizer;
                        setTrackTintMode settracktintmode = this.RemoteActionCompatParcelizer;
                        CurrentQuery.write writeVar3 = topUserCompanion.getIconCompatParcelizer().get(setPassingYear.b_);
                        toMagicModuleMetaRepoModel.write(writeVar3);
                        writeVar = new write(settracktintmode, (setPassingYear) writeVar3);
                        this.AudioAttributesImplApi26Parcelizer.read(writeVar);
                        setdownloadpercent = this.AudioAttributesImplApi26Parcelizer.write;
                        getAnswerMap<SampleVideos<? super R>, Object> getanswermap2 = this.IconCompatParcelizer;
                        Toolbar toolbar3 = this.AudioAttributesImplApi26Parcelizer;
                        this.AudioAttributesImplBaseParcelizer = writeVar;
                        this.write = setdownloadpercent;
                        this.AudioAttributesCompatParcelizer = getanswermap2;
                        this.read = toolbar3;
                        this.MediaBrowserCompatItemReceiver = 1;
                        if (setdownloadpercent.RemoteActionCompatParcelizer(null, this) != objIconCompatParcelizer) {
                            getanswermap = getanswermap2;
                            toolbar = toolbar3;
                        }
                        return objIconCompatParcelizer;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        toolbar2 = (Toolbar) this.AudioAttributesCompatParcelizer;
                        setdownloadpercent2 = (setDownloadPercent) this.write;
                        writeVar2 = (write) this.AudioAttributesImplBaseParcelizer;
                        try {
                            SdkPayloadData.IconCompatParcelizer(obj);
                            setBackInvokedCallbackEnabled.read(toolbar2.RemoteActionCompatParcelizer, writeVar2, null);
                            setdownloadpercent2.write(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            setBackInvokedCallbackEnabled.read(toolbar2.RemoteActionCompatParcelizer, writeVar2, null);
                            throw th;
                        }
                    }
                    toolbar = (Toolbar) this.read;
                    getanswermap = (getAnswerMap) this.AudioAttributesCompatParcelizer;
                    setDownloadPercent setdownloadpercent3 = (setDownloadPercent) this.write;
                    write writeVar4 = (write) this.AudioAttributesImplBaseParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    setdownloadpercent = setdownloadpercent3;
                    writeVar = writeVar4;
                    this.AudioAttributesImplBaseParcelizer = writeVar;
                    this.write = setdownloadpercent;
                    this.AudioAttributesCompatParcelizer = toolbar;
                    this.read = null;
                    this.MediaBrowserCompatItemReceiver = 2;
                    Object objInvoke = getanswermap.invoke(this);
                    if (objInvoke != objIconCompatParcelizer) {
                        toolbar2 = toolbar;
                        setdownloadpercent2 = setdownloadpercent;
                        obj = objInvoke;
                        writeVar2 = writeVar;
                        setBackInvokedCallbackEnabled.read(toolbar2.RemoteActionCompatParcelizer, writeVar2, null);
                        setdownloadpercent2.write(null);
                        return obj;
                    }
                    return objIconCompatParcelizer;
                } catch (Throwable th3) {
                    toolbar2 = toolbar;
                    th = th3;
                    writeVar2 = writeVar;
                    setBackInvokedCallbackEnabled.read(toolbar2.RemoteActionCompatParcelizer, writeVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.write(null);
                throw th4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(setTrackTintMode settracktintmode, Toolbar toolbar, getAnswerMap<? super SampleVideos<? super R>, ? extends Object> getanswermap, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = settracktintmode;
            this.AudioAttributesImplApi26Parcelizer = toolbar;
            this.IconCompatParcelizer = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = new read(this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, sampleVideos);
            readVar.AudioAttributesImplBaseParcelizer = obj;
            return readVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super R> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final <R> Object write(setTrackTintMode settracktintmode, getAnswerMap<? super SampleVideos<? super R>, ? extends Object> getanswermap, SampleVideos<? super R> sampleVideos) {
        return College.IconCompatParcelizer(new read(settracktintmode, this, getanswermap, null), sampleVideos);
    }
}
