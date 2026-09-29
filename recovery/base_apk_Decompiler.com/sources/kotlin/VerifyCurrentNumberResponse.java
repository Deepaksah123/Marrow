package kotlin;

import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0094@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "channel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "consume", "", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "<init>", "(Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "markConsumed", "", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceImpl", "Lkotlinx/coroutines/CoroutineScope;", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "additionalToStringProps", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class VerifyCurrentNumberResponse<T> extends getDidReBuffer<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(VerifyCurrentNumberResponse.class, "consumed$volatile");
    private final boolean AudioAttributesImplBaseParcelizer;
    private volatile /* synthetic */ int consumed$volatile;
    private final setLastName<T> read;

    public /* synthetic */ VerifyCurrentNumberResponse(setLastName setlastname, boolean z) {
        this(setlastname, z, VideoSessionResponseBody.RemoteActionCompatParcelizer, -3, setAddressLine2.read);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VerifyCurrentNumberResponse(setLastName<? extends T> setlastname, boolean z, CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        super(currentQuery, i, setaddressline2);
        this.read = setlastname;
        this.AudioAttributesImplBaseParcelizer = z;
        this.consumed$volatile = 0;
    }

    private final void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer && write.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlin.getDidReBuffer
    public final getDidReBuffer<T> AudioAttributesCompatParcelizer(CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        return new VerifyCurrentNumberResponse(this.read, this.AudioAttributesImplBaseParcelizer, currentQuery, i, setaddressline2);
    }

    @Override // kotlin.getDidReBuffer
    public final NewNumberOtpResendRequest<T> write() {
        return new VerifyCurrentNumberResponse(this.read, this.AudioAttributesImplBaseParcelizer);
    }

    @Override // kotlin.getDidReBuffer
    public final Object read(getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = DownloadAnalyticEvent.read(new getTotalFramesDropped(getshowpearldeletionpopup), this.read, this.AudioAttributesImplBaseParcelizer, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getDidReBuffer
    public final setLastName<T> IconCompatParcelizer(TopUserCompanion topUserCompanion) {
        AudioAttributesCompatParcelizer();
        if (this.IconCompatParcelizer == -3) {
            return this.read;
        }
        return super.IconCompatParcelizer(topUserCompanion);
    }

    @Override // kotlin.getDidReBuffer, kotlin.NewNumberOtpResendRequest
    public final Object write(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        if (this.IconCompatParcelizer == -3) {
            AudioAttributesCompatParcelizer();
            Object obj = DownloadAnalyticEvent.read(getvalidationtoken, this.read, this.AudioAttributesImplBaseParcelizer, sampleVideos);
            return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
        }
        Object objWrite = super.write(getvalidationtoken, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getDidReBuffer
    public final String read() {
        StringBuilder sb = new StringBuilder("channel=");
        sb.append(this.read);
        return sb.toString();
    }
}
