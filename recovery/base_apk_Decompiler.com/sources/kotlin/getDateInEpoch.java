package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.VideoPlaybackInfo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0005j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0017\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\u0010\u001cJ\r\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001eJ\r\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001eJ$\u0010 \u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0002\u0010\u001cJ\u0013\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J,\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00028\u00002\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00152\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010\u001eJ\u0015\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010$J\u0011\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000eH\u0082\u0010J\u0011\u00101\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000eH\u0082\u0010J\u0015\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH\u0002¢\u0006\u0002\u00103J\u0018\u00104\u001a\u00020\"2\u0006\u00100\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002R\u001a\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u00066"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "T", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "<init>", "()V", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "_size", "Lkotlinx/atomicfu/AtomicInt;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "size", "getSize", "()I", "setSize", "(I)V", "isEmpty", "", "()Z", "find", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "removeFirstIf", "addLast", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLastIf", "cond", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "firstImpl", "removeAtImpl", "index", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "addImpl", "siftUpFrom", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "siftDownFrom", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "swap", "j", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class getDateInEpoch<T extends VideoPlaybackInfo & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(getDateInEpoch.class, "_size$volatile");
    private T[] AudioAttributesCompatParcelizer;
    private volatile /* synthetic */ int _size$volatile;

    private int AudioAttributesImplBaseParcelizer() {
        return RemoteActionCompatParcelizer.get(this);
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        RemoteActionCompatParcelizer.set(this, i);
    }

    public final boolean IconCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer() == 0;
    }

    public final T write() {
        T[] tArr = this.AudioAttributesCompatParcelizer;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T read(int r5) {
        /*
            r4 = this;
            kotlin.getCollegeId.write()
            T extends o.VideoPlaybackInfo & java.lang.Comparable<? super T>[] r0 = r4.AudioAttributesCompatParcelizer
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            int r1 = r4.AudioAttributesImplBaseParcelizer()
            int r1 = r1 + (-1)
            r4.AudioAttributesCompatParcelizer(r1)
            int r1 = r4.AudioAttributesImplBaseParcelizer()
            if (r5 >= r1) goto L40
            int r1 = r4.AudioAttributesImplBaseParcelizer()
            r4.RemoteActionCompatParcelizer(r5, r1)
            int r1 = r5 + (-1)
            int r1 = r1 / 2
            if (r5 <= 0) goto L3d
            r2 = r0[r5]
            kotlin.toMagicModuleMetaRepoModel.write(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = r0[r1]
            kotlin.toMagicModuleMetaRepoModel.write(r3)
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L3d
            r4.RemoteActionCompatParcelizer(r5, r1)
            r4.IconCompatParcelizer(r1)
            goto L40
        L3d:
            r4.RemoteActionCompatParcelizer(r5)
        L40:
            int r5 = r4.AudioAttributesImplBaseParcelizer()
            r5 = r0[r5]
            kotlin.toMagicModuleMetaRepoModel.write(r5)
            kotlin.getCollegeId.write()
            r1 = 0
            r5.RemoteActionCompatParcelizer(r1)
            r2 = -1
            r5.write(r2)
            int r4 = r4.AudioAttributesImplBaseParcelizer()
            r0[r4] = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDateInEpoch.read(int):o.VideoPlaybackInfo");
    }

    public final void write(T t) {
        getCollegeId.write();
        t.RemoteActionCompatParcelizer(this);
        VideoPlaybackInfo[] videoPlaybackInfoArrMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        AudioAttributesCompatParcelizer(iAudioAttributesImplBaseParcelizer + 1);
        videoPlaybackInfoArrMediaBrowserCompatItemReceiver[iAudioAttributesImplBaseParcelizer] = t;
        t.write(iAudioAttributesImplBaseParcelizer);
        IconCompatParcelizer(iAudioAttributesImplBaseParcelizer);
    }

    private final void IconCompatParcelizer(int i) {
        while (i > 0) {
            T[] tArr = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            toMagicModuleMetaRepoModel.write(t);
            T t2 = tArr[i];
            toMagicModuleMetaRepoModel.write(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            RemoteActionCompatParcelizer(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 << 1
            int r1 = r0 + 1
            int r2 = r5.AudioAttributesImplBaseParcelizer()
            if (r1 >= r2) goto L43
            T extends o.VideoPlaybackInfo & java.lang.Comparable<? super T>[] r2 = r5.AudioAttributesCompatParcelizer
            kotlin.toMagicModuleMetaRepoModel.write(r2)
            int r0 = r0 + 2
            int r3 = r5.AudioAttributesImplBaseParcelizer()
            if (r0 >= r3) goto L2a
            r3 = r2[r0]
            kotlin.toMagicModuleMetaRepoModel.write(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.toMagicModuleMetaRepoModel.write(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2a
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r1 = r2[r6]
            kotlin.toMagicModuleMetaRepoModel.write(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.toMagicModuleMetaRepoModel.write(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3e
            goto L43
        L3e:
            r5.RemoteActionCompatParcelizer(r6, r0)
            r6 = r0
            goto L0
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDateInEpoch.RemoteActionCompatParcelizer(int):void");
    }

    private final T[] MediaBrowserCompatItemReceiver() {
        T[] tArr = this.AudioAttributesCompatParcelizer;
        if (tArr == null) {
            T[] tArr2 = (T[]) new VideoPlaybackInfo[4];
            this.AudioAttributesCompatParcelizer = tArr2;
            return tArr2;
        }
        if (AudioAttributesImplBaseParcelizer() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, AudioAttributesImplBaseParcelizer() << 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        T[] tArr3 = (T[]) ((VideoPlaybackInfo[]) objArrCopyOf);
        this.AudioAttributesCompatParcelizer = tArr3;
        return tArr3;
    }

    private final void RemoteActionCompatParcelizer(int i, int i2) {
        T[] tArr = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(tArr);
        T t = tArr[i2];
        toMagicModuleMetaRepoModel.write(t);
        T t2 = tArr[i];
        toMagicModuleMetaRepoModel.write(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.write(i);
        t2.write(i2);
    }

    public final T read() {
        T t;
        synchronized (this) {
            t = (T) write();
        }
        return t;
    }

    public final T AudioAttributesCompatParcelizer() {
        T t;
        synchronized (this) {
            t = AudioAttributesImplBaseParcelizer() > 0 ? (T) read(0) : null;
        }
        return t;
    }

    public final boolean read(T t) {
        boolean z;
        synchronized (this) {
            if (t.read() == null) {
                z = false;
            } else {
                int iIconCompatParcelizer = t.IconCompatParcelizer();
                getCollegeId.write();
                read(iIconCompatParcelizer);
                z = true;
            }
        }
        return z;
    }
}
