package kotlin;

import android.os.Handler;
import android.os.Looper;
import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0016j\u0002`\u0015H\u0016¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0016J)\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0014\u001a\u00060\u0016j\u0002`\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0016j\u0002`\u0015H\u0002¢\u0006\u0002\u0010\u0017J\b\u0010!\u001a\u00020\u0006H\u0016J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006'"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "invokeImmediately", "", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "isDispatchNeeded", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "dispatch", "", "block", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "scheduleResumeAfterDelay", "timeMillis", "", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "cancelOnRejection", "toString", "equals", "other", "", "hashCode", "", "kotlinx-coroutines-android"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getNationalNumber extends setAddressLine1 {
    private final Handler AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private final getNationalNumber write;

    public static final class AudioAttributesCompatParcelizer implements Runnable {
        private /* synthetic */ setStateRank AudioAttributesCompatParcelizer;
        private /* synthetic */ getNationalNumber read;

        @Override // java.lang.Runnable
        public final void run() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read, getShowPopup.INSTANCE);
        }

        public AudioAttributesCompatParcelizer(setStateRank setstaterank, getNationalNumber getnationalnumber) {
            this.AudioAttributesCompatParcelizer = setstaterank;
            this.read = getnationalnumber;
        }
    }

    private getNationalNumber(Handler handler, String str, boolean z) {
        super(null);
        this.AudioAttributesCompatParcelizer = handler;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.IconCompatParcelizer = z;
        this.write = z ? this : new getNationalNumber(handler, str, true);
    }

    public /* synthetic */ getNationalNumber(Handler handler, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public getNationalNumber(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isFmgStudent
    /* JADX INFO: renamed from: read, reason: from getter and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public getNationalNumber RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.getPlatform
    public final boolean IconCompatParcelizer(CurrentQuery currentQuery) {
        return (this.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.myLooper(), this.AudioAttributesCompatParcelizer.getLooper())) ? false : true;
    }

    @Override // kotlin.getPlatform
    public final void RemoteActionCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        if (this.AudioAttributesCompatParcelizer.post(runnable)) {
            return;
        }
        read(currentQuery, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getNationalNumber getnationalnumber, Runnable runnable) {
        getnationalnumber.AudioAttributesCompatParcelizer.removeCallbacks(runnable);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setAddressLine1, kotlin.getCurrentYear
    public final setYearOfPassout read(long j, final Runnable runnable, CurrentQuery currentQuery) {
        if (this.AudioAttributesCompatParcelizer.postDelayed(runnable, getQues.AudioAttributesCompatParcelizer(j, 4611686018427387903L))) {
            return new setYearOfPassout() { // from class: o.setNationalNumber
                @Override // kotlin.setYearOfPassout
                public final void write() {
                    getNationalNumber.write(this.read, runnable);
                }
            };
        }
        read(currentQuery, runnable);
        return setEmail.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getNationalNumber getnationalnumber, Runnable runnable) {
        getnationalnumber.AudioAttributesCompatParcelizer.removeCallbacks(runnable);
    }

    private final void read(CurrentQuery currentQuery, Runnable runnable) {
        StringBuilder sb = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
        sb.append(this);
        sb.append("' was closed");
        getUserConfig.AudioAttributesCompatParcelizer(currentQuery, new CancellationException(sb.toString()));
        setMbbsVerificationYear.write().RemoteActionCompatParcelizer(currentQuery, runnable);
    }

    @Override // kotlin.isFmgStudent, kotlin.getPlatform
    public final String toString() {
        String strWrite = write();
        if (strWrite == null) {
            strWrite = this.AudioAttributesImplApi26Parcelizer;
            if (strWrite == null) {
                strWrite = this.AudioAttributesCompatParcelizer.toString();
            }
            if (this.IconCompatParcelizer) {
                StringBuilder sb = new StringBuilder();
                sb.append(strWrite);
                sb.append(".immediate");
                return sb.toString();
            }
        }
        return strWrite;
    }

    public final boolean equals(Object other) {
        if (!(other instanceof getNationalNumber)) {
            return false;
        }
        getNationalNumber getnationalnumber = (getNationalNumber) other;
        return getnationalnumber.AudioAttributesCompatParcelizer == this.AudioAttributesCompatParcelizer && getnationalnumber.IconCompatParcelizer == this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer ? 1231 : 1237) ^ System.identityHashCode(this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.getCurrentYear
    public final void write(long j, setStateRank<? super getShowPopup> setstaterank) {
        final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(setstaterank, this);
        if (this.AudioAttributesCompatParcelizer.postDelayed(audioAttributesCompatParcelizer, getQues.AudioAttributesCompatParcelizer(j, 4611686018427387903L))) {
            setstaterank.write(new getAnswerMap() { // from class: o.PrimaryAddress
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getNationalNumber.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer);
                }
            });
        } else {
            read(setstaterank.getWrite(), audioAttributesCompatParcelizer);
        }
    }
}
