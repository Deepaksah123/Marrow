package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0084\u0001\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012O\b\u0002\u0010\u0006\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u000f2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003JP\u0010\u001f\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0093\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052O\b\u0002\u0010\u0006\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0012\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000RW\u0010\u0006\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "R", "", "result", "cancelHandler", "Lkotlinx/coroutines/CancelHandler;", "onCancellation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/coroutines/CoroutineContext;", LogCategory.CONTEXT, "", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Ljava/lang/Object;", "cancelled", "", "getCancelled", "()Z", "invokeHandlers", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Throwable;)Lkotlinx/coroutines/CompletedContinuation;", "equals", "other", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class setMockTest<R> {
    public final Throwable AudioAttributesCompatParcelizer;
    private getModuleData<Throwable, R, CurrentQuery, getShowPopup> IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final R read;
    public final setMaxMcqCount write;

    /* JADX WARN: Multi-variable type inference failed */
    private setMockTest(R r, setMaxMcqCount setmaxmcqcount, getModuleData<? super Throwable, ? super R, ? super CurrentQuery, getShowPopup> getmoduledata, Object obj, Throwable th) {
        this.read = r;
        this.write = setmaxmcqcount;
        this.IconCompatParcelizer = getmoduledata;
        this.RemoteActionCompatParcelizer = obj;
        this.AudioAttributesCompatParcelizer = th;
    }

    public /* synthetic */ setMockTest(Object obj, setMaxMcqCount setmaxmcqcount, getModuleData getmoduledata, Object obj2, Throwable th, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(obj, (i & 2) != 0 ? null : setmaxmcqcount, (i & 4) != 0 ? null : getmoduledata, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    public final boolean write() {
        return this.AudioAttributesCompatParcelizer != null;
    }

    public final void AudioAttributesCompatParcelizer(setStateSolvedCount<?> setstatesolvedcount, Throwable th) {
        setMaxMcqCount setmaxmcqcount = this.write;
        if (setmaxmcqcount != null) {
            setstatesolvedcount.write(setmaxmcqcount, th);
        }
        getModuleData<Throwable, R, CurrentQuery, getShowPopup> getmoduledata = this.IconCompatParcelizer;
        if (getmoduledata != null) {
            setstatesolvedcount.RemoteActionCompatParcelizer(getmoduledata, th, this.read);
        }
    }

    public static /* synthetic */ setMockTest RemoteActionCompatParcelizer(setMockTest setmocktest, Object obj, setMaxMcqCount setmaxmcqcount, getModuleData getmoduledata, Object obj2, Throwable th, int i) {
        if ((i & 1) != 0) {
            obj = setmocktest.read;
        }
        if ((i & 2) != 0) {
            setmaxmcqcount = setmocktest.write;
        }
        if ((i & 4) != 0) {
            getmoduledata = setmocktest.IconCompatParcelizer;
        }
        if ((i & 8) != 0) {
            obj2 = setmocktest.RemoteActionCompatParcelizer;
        }
        if ((i & 16) != 0) {
            th = setmocktest.AudioAttributesCompatParcelizer;
        }
        return IconCompatParcelizer(obj, setmaxmcqcount, getmoduledata, obj2, th);
    }

    private static setMockTest<R> IconCompatParcelizer(R r, setMaxMcqCount setmaxmcqcount, getModuleData<? super Throwable, ? super R, ? super CurrentQuery, getShowPopup> getmoduledata, Object obj, Throwable th) {
        return new setMockTest<>(r, setmaxmcqcount, getmoduledata, obj, th);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setMockTest)) {
            return false;
        }
        setMockTest setmocktest = (setMockTest) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setmocktest.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, setmocktest.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setmocktest.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setmocktest.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, setmocktest.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        R r = this.read;
        int iHashCode = r == null ? 0 : r.hashCode();
        setMaxMcqCount setmaxmcqcount = this.write;
        int iHashCode2 = setmaxmcqcount == null ? 0 : setmaxmcqcount.hashCode();
        getModuleData<Throwable, R, CurrentQuery, getShowPopup> getmoduledata = this.IconCompatParcelizer;
        int iHashCode3 = getmoduledata == null ? 0 : getmoduledata.hashCode();
        Object obj = this.RemoteActionCompatParcelizer;
        int iHashCode4 = obj == null ? 0 : obj.hashCode();
        Throwable th = this.AudioAttributesCompatParcelizer;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.read);
        sb.append(", cancelHandler=");
        sb.append(this.write);
        sb.append(", onCancellation=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", idempotentResume=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", cancelCause=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
