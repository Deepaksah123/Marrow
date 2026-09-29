package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogCategory;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\"H\u0016J\u001c\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0003H\u0014J\u001d\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030,2\u0006\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010.J&\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205H\u0016R\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\nR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00066"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "<init>", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "sequence", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue", "()Ljava/lang/Object;", "setValue", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "tryEmit", "(Ljava/lang/Object;)Z", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetReplayCache", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSlot", "createSlotArray", "", "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "fuse", "Lkotlinx/coroutines/flow/Flow;", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setTimelineId<T> extends TimelineCreator<setPytMcqIds> implements getResolutionSize<T>, UserShortInfoJsonParser<T>, getPbConfig<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(setTimelineId.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    private int write;

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ setTimelineId<T> AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(setTimelineId<T> settimelineid, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesImplBaseParcelizer = settimelineid;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return this.AudioAttributesImplBaseParcelizer.write(null, this);
        }
    }

    @Override // kotlin.TimelineCreator
    public final /* synthetic */ getDecoderName[] read() {
        return RemoteActionCompatParcelizer(2);
    }

    @Override // kotlin.TimelineCreator
    public final /* synthetic */ getDecoderName write() {
        return MediaBrowserCompatCustomActionResultReceiver();
    }

    public setTimelineId(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlin.getResolutionSize, kotlin.setUpdatedStatus
    public final T IconCompatParcelizer() {
        accessgetVideoConfigurationC2cp accessgetvideoconfigurationc2cp = getStartupDurationMs.IconCompatParcelizer;
        T t = (T) read.get(this);
        if (t == accessgetvideoconfigurationc2cp) {
            return null;
        }
        return t;
    }

    @Override // kotlin.getResolutionSize
    public final void write(T t) {
        if (t == null) {
            t = (T) getStartupDurationMs.IconCompatParcelizer;
        }
        IconCompatParcelizer((Object) null, t);
    }

    @Override // kotlin.getResolutionSize
    public final boolean AudioAttributesCompatParcelizer(T t, T t2) {
        if (t == null) {
            t = (T) getStartupDurationMs.IconCompatParcelizer;
        }
        if (t2 == null) {
            t2 = (T) getStartupDurationMs.IconCompatParcelizer;
        }
        return IconCompatParcelizer(t, t2);
    }

    @Override // kotlin.isDark
    public final List<T> bm_() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IconCompatParcelizer());
    }

    @Override // kotlin.ThemeState
    public final boolean RemoteActionCompatParcelizer(T t) {
        write(t);
        return true;
    }

    @Override // kotlin.ThemeState, kotlin.getValidationToken
    public final Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        write(t);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.ThemeState
    public final void AudioAttributesCompatParcelizer() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        if (((kotlin.TimelinePYTMap) r11).IconCompatParcelizer(r0) == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:37:0x00b4, B:54:0x00f0], limit reached: 66 */
    /* JADX WARN: Path cross not found for [B:54:0x00f0, B:37:0x00b4], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:37:0x00b4, B:39:0x00be, B:41:0x00c3, B:52:0x00ea, B:54:0x00f0, B:43:0x00c9, B:47:0x00d0, B:36:0x00a4), top: B:65:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:37:0x00b4, B:39:0x00be, B:41:0x00c3, B:52:0x00ea, B:54:0x00f0, B:43:0x00c9, B:47:0x00d0, B:36:0x00a4), top: B:65:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #1 {all -> 0x0103, blocks: (B:37:0x00b4, B:39:0x00be, B:41:0x00c3, B:52:0x00ea, B:54:0x00f0, B:43:0x00c9, B:47:0x00d0, B:36:0x00a4), top: B:65:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, o.getValidationToken] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ee -> B:37:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0100 -> B:37:0x00b4). Please report as a decompilation issue!!! */
    @Override // kotlin.isDark, kotlin.NewNumberOtpResendRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.getValidationToken<? super T> r11, kotlin.SampleVideos<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTimelineId.write(o.getValidationToken, o.SampleVideos):java.lang.Object");
    }

    private static setPytMcqIds MediaBrowserCompatCustomActionResultReceiver() {
        return new setPytMcqIds();
    }

    private static setPytMcqIds[] RemoteActionCompatParcelizer(int i) {
        return new setPytMcqIds[2];
    }

    @Override // kotlin.getPbConfig
    public final NewNumberOtpResendRequest<T> write(CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        return setStartTime.read(this, currentQuery, i, setaddressline2);
    }

    private final boolean IconCompatParcelizer(Object obj, Object obj2) {
        int i;
        setPytMcqIds[] setpytmcqidsArrAudioAttributesImplBaseParcelizer;
        synchronized (this) {
            Object obj3 = read.get(this);
            if (obj != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, obj)) {
                return false;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, obj2)) {
                return true;
            }
            read.set(this, obj2);
            int i2 = this.write;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.write = i3;
                setPytMcqIds[] setpytmcqidsArrAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                while (true) {
                    setPytMcqIds[] setpytmcqidsArr = setpytmcqidsArrAudioAttributesImplBaseParcelizer2;
                    if (setpytmcqidsArr != null) {
                        for (setPytMcqIds setpytmcqids : setpytmcqidsArr) {
                            if (setpytmcqids != null) {
                                setpytmcqids.RemoteActionCompatParcelizer();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.write;
                        if (i == i3) {
                            this.write = i3 + 1;
                            return true;
                        }
                        setpytmcqidsArrAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    }
                    setpytmcqidsArrAudioAttributesImplBaseParcelizer2 = setpytmcqidsArrAudioAttributesImplBaseParcelizer;
                    i3 = i;
                }
            } else {
                this.write = i2 + 2;
                return true;
            }
        }
    }
}
