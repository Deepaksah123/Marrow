package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000fB\u001d\u0012\u0014\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086@¢\u0006\u0002\u0010\rR\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "<init>", "([Lkotlinx/coroutines/Deferred;)V", "[Lkotlinx/coroutines/Deferred;", "notCompletedCount", "Lkotlinx/atomicfu/AtomicInt;", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DisposeHandlersOnCancel", "AwaitAllNode", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setFromDetailApi<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(setFromDetailApi.class, "notCompletedCount$volatile");
    private final getYearOfAdmission<T>[] IconCompatParcelizer;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public setFromDetailApi(getYearOfAdmission<? extends T>[] getyearofadmissionArr) {
        this.IconCompatParcelizer = getyearofadmissionArr;
        this.notCompletedCount$volatile = getyearofadmissionArr.length;
    }

    final class read implements setMaxMcqCount {
        private final setFromDetailApi<T>.RemoteActionCompatParcelizer[] IconCompatParcelizer;

        public read(setFromDetailApi<T>.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr) {
            this.IconCompatParcelizer = remoteActionCompatParcelizerArr;
        }

        public final void RemoteActionCompatParcelizer() {
            for (setFromDetailApi<T>.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.IconCompatParcelizer) {
                remoteActionCompatParcelizer.read().write();
            }
        }

        @Override // kotlin.setMaxMcqCount
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            RemoteActionCompatParcelizer();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisposeHandlersOnCancel[");
            sb.append(this.IconCompatParcelizer);
            sb.append(']');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00100\u000eX\u0082\u0004R<\u0010\u0012\u001a\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0011\u001a\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "<init>", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "_disposer", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "disposer", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "onCancelling", "", "getOnCancelling", "()Z", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class RemoteActionCompatParcelizer extends getDefaultCourseEdition {
        private static final /* synthetic */ AtomicReferenceFieldUpdater RemoteActionCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(RemoteActionCompatParcelizer.class, Object.class, "_disposer$volatile");
        private final setStateRank<List<? extends T>> IconCompatParcelizer;
        private volatile /* synthetic */ Object _disposer$volatile;
        private setYearOfPassout write;

        @Override // kotlin.getDefaultCourseEdition
        public final boolean IconCompatParcelizer() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer(setStateRank<? super List<? extends T>> setstaterank) {
            this.IconCompatParcelizer = setstaterank;
        }

        public final void AudioAttributesCompatParcelizer(setYearOfPassout setyearofpassout) {
            this.write = setyearofpassout;
        }

        public final setYearOfPassout read() {
            setYearOfPassout setyearofpassout = this.write;
            if (setyearofpassout != null) {
                return setyearofpassout;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private setFromDetailApi<T>.read MediaBrowserCompatCustomActionResultReceiver() {
            return (read) RemoteActionCompatParcelizer.get(this);
        }

        public final void read(setFromDetailApi<T>.read readVar) {
            RemoteActionCompatParcelizer.set(this, readVar);
        }

        @Override // kotlin.getDefaultCourseEdition
        public final void write(Throwable th) {
            if (th == null) {
                if (setFromDetailApi.RemoteActionCompatParcelizer().decrementAndGet(setFromDetailApi.this) == 0) {
                    setStateRank<List<? extends T>> setstaterank = this.IconCompatParcelizer;
                    getYearOfAdmission[] getyearofadmissionArr = ((setFromDetailApi) setFromDetailApi.this).IconCompatParcelizer;
                    ArrayList arrayList = new ArrayList(getyearofadmissionArr.length);
                    for (getYearOfAdmission getyearofadmission : getyearofadmissionArr) {
                        arrayList.add(getyearofadmission.write());
                    }
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                    setstaterank.resumeWith(C0177getRfBanners.read(arrayList));
                    return;
                }
                return;
            }
            Object objAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(th);
            if (objAudioAttributesCompatParcelizer != null) {
                this.IconCompatParcelizer.write(objAudioAttributesCompatParcelizer);
                setFromDetailApi<T>.read readVarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                if (readVarMediaBrowserCompatCustomActionResultReceiver != null) {
                    readVarMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
                }
            }
        }
    }

    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super List<? extends T>> sampleVideos) {
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        int length = this.IconCompatParcelizer.length;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = new RemoteActionCompatParcelizer[length];
        for (int i = 0; i < length; i++) {
            getYearOfAdmission getyearofadmission = this.IconCompatParcelizer[i];
            getyearofadmission.MediaMetadataCompat();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(setstatesolvedcount2);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getUserConfig.write(getyearofadmission, remoteActionCompatParcelizer));
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            remoteActionCompatParcelizerArr[i] = remoteActionCompatParcelizer;
        }
        setFromDetailApi<T>.read readVar = new read(remoteActionCompatParcelizerArr);
        for (int i2 = 0; i2 < length; i2++) {
            remoteActionCompatParcelizerArr[i2].read(readVar);
        }
        if (setstatesolvedcount2.RemoteActionCompatParcelizer()) {
            readVar.RemoteActionCompatParcelizer();
        } else {
            setStatePercentile.AudioAttributesCompatParcelizer(setstatesolvedcount2, readVar);
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }
}
