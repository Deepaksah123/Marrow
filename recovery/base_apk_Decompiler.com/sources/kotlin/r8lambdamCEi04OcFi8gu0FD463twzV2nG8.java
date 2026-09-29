package kotlin;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r8lambdamCEi04OcFi8gu0FD463twzV2nG8 {
    public static final Object RemoteActionCompatParcelizer(boolean z, AtomicReference atomicReference, getCreatedOnDateMs getcreatedondatems) {
        if (z) {
            DefaultAudioSinkInvalidAudioTrackTimestampException.read.set(Boolean.TRUE);
        }
        atomicReference.set(Thread.currentThread());
        try {
            Object objInvoke = getcreatedondatems.invoke();
            DefaultAudioSinkInvalidAudioTrackTimestampException.read.remove();
            return objInvoke;
        } catch (Throwable th) {
            ThreadLocal threadLocal = DefaultAudioSinkInvalidAudioTrackTimestampException.read;
            DefaultAudioSinkInvalidAudioTrackTimestampException.read.remove();
            throw th;
        }
    }

    public static final Object write(long j, boolean z, final boolean z2, final getCreatedOnDateMs getcreatedondatems) {
        Object obj;
        Object obj2;
        StackTraceElement[] stackTrace;
        if (j <= 0) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            return C0177getRfBanners.read(SdkPayloadData.write(new parseMpegAudioFrameSampleCount(new TimeoutException(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer())));
        }
        List listAudioAttributesImplBaseParcelizer = null;
        final AtomicReference atomicReference = new AtomicReference(null);
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            Future futureSubmit = getMeanPlayAndWaitTimeMs.RemoteActionCompatParcelizer.submit(new Callable() { // from class: o.durationUsToBytes
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return r8lambdamCEi04OcFi8gu0FD463twzV2nG8.RemoteActionCompatParcelizer(z2, atomicReference, getcreatedondatems);
                }
            });
            toMagicModuleMetaRepoModel.write(futureSubmit);
            obj = C0177getRfBanners.read(futureSubmit);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(obj);
        if (thIconCompatParcelizer == null) {
            Future future = (Future) obj;
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer4 = C0177getRfBanners.IconCompatParcelizer;
                obj2 = C0177getRfBanners.read(future.get(j, TimeUnit.MILLISECONDS));
            } catch (Throwable th2) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer5 = C0177getRfBanners.IconCompatParcelizer;
                obj2 = C0177getRfBanners.read(SdkPayloadData.write(th2));
            }
            Throwable thIconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer(obj2);
            if (thIconCompatParcelizer2 != null) {
                try {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer6 = C0177getRfBanners.IconCompatParcelizer;
                    if (thIconCompatParcelizer2 instanceof TimeoutException) {
                        TimeoutException timeoutException = (TimeoutException) thIconCompatParcelizer2;
                        Thread thread = (Thread) atomicReference.get();
                        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                            toMagicModuleMetaRepoModel.write(stackTrace);
                            listAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(stackTrace);
                        }
                        throw new parseMpegAudioFrameSampleCount(timeoutException, listAudioAttributesImplBaseParcelizer);
                    }
                    throw thIconCompatParcelizer2;
                } catch (Throwable th3) {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer7 = C0177getRfBanners.IconCompatParcelizer;
                    obj2 = C0177getRfBanners.read(SdkPayloadData.write(th3));
                }
            }
            if (C0177getRfBanners.IconCompatParcelizer(obj2) != null) {
                try {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer8 = C0177getRfBanners.IconCompatParcelizer;
                    C0177getRfBanners.read(Boolean.valueOf(future.cancel(z2)));
                } catch (Throwable th4) {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer9 = C0177getRfBanners.IconCompatParcelizer;
                    C0177getRfBanners.read(SdkPayloadData.write(th4));
                }
            }
            return obj2;
        }
        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer10 = C0177getRfBanners.IconCompatParcelizer;
        return C0177getRfBanners.read(SdkPayloadData.write(thIconCompatParcelizer));
    }
}
