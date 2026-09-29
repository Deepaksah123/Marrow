package kotlin;

import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 0*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002/0B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0006J\u0013\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018J1\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002J1\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010!J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010#\u001a\u00020$H\u0002J%\u0010%\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u001a2\u0006\u0010&\u001a\u00020$H\u0002¢\u0006\u0002\u0010'J%\u0010(\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u001a2\u0006\u0010&\u001a\u00020$H\u0002¢\u0006\u0002\u0010'J&\u0010)\u001a\b\u0012\u0004\u0012\u0002H+0*\"\u0004\b\u0001\u0010+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H+0-J\u0006\u0010.\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u000bX\u0082\u0004R\t\u0010\f\u001a\u00020\rX\u0082\u0004R\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fX\u0082\u0004R\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "E", "", "capacity", "", "singleConsumer", "", "<init>", "(IZ)V", "mask", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Lkotlinx/atomicfu/AtomicArray;", "isEmpty", "()Z", "size", "getSize", "()I", "close", "addLast", "element", "(Ljava/lang/Object;)I", "fillPlaceholder", "Lkotlinx/coroutines/internal/Core;", "index", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "next", "markFrozen", "", "allocateOrGetNextCopy", NotesDispatchAddressRequestKt.KEY_STATE, "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateNextCopy", "map", "", "R", "transform", "Lkotlin/Function1;", "isClosed", "Placeholder", "Companion", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setReBufferDurationMs<E> {
    private final /* synthetic */ AtomicReferenceArray AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private static IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);
    private static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(setReBufferDurationMs.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater read = AtomicLongFieldUpdater.newUpdater(setReBufferDurationMs.class, "_state$volatile");
    public static final accessgetVideoConfigurationC2cp RemoteActionCompatParcelizer = new accessgetVideoConfigurationC2cp("REMOVE_FROZEN");

    public setReBufferDurationMs(int i, boolean z) {
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatItemReceiver = z;
        int i2 = i - 1;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.AudioAttributesCompatParcelizer = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean write() {
        long j = read.get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final int read() {
        long j = read.get(this);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final boolean RemoteActionCompatParcelizer() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = read;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(E r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = AudioAttributesImplApi26Parcelizer()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            int r12 = o.setReBufferDurationMs.IconCompatParcelizer.IconCompatParcelizer(r3)
            return r12
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.MediaBrowserCompatCustomActionResultReceiver
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.MediaBrowserCompatItemReceiver
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.getAudioAttributesCompatParcelizer()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L51
            int r2 = r12.AudioAttributesImplApi26Parcelizer
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L50
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L50:
            return r6
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = AudioAttributesImplApi26Parcelizer()
            int r2 = r9 + 1
            r2 = r2 & r5
            long r5 = o.setReBufferDurationMs.IconCompatParcelizer.IconCompatParcelizer(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.getAudioAttributesCompatParcelizer()
            r1 = r9 & r10
            r0.set(r1, r13)
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = AudioAttributesImplApi26Parcelizer()
            long r0 = r0.get(r12)
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L85
            o.setReBufferDurationMs r12 = r12.AudioAttributesCompatParcelizer()
            o.setReBufferDurationMs r12 = r12.AudioAttributesCompatParcelizer(r9, r13)
            if (r12 != 0) goto L6c
        L85:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setReBufferDurationMs.read(java.lang.Object):int");
    }

    private final setReBufferDurationMs<E> AudioAttributesCompatParcelizer(int i, E e) {
        Object obj = getAudioAttributesCompatParcelizer().get(this.MediaBrowserCompatCustomActionResultReceiver & i);
        if (!(obj instanceof read) || ((read) obj).AudioAttributesCompatParcelizer != i) {
            return null;
        }
        getAudioAttributesCompatParcelizer().set(i & this.MediaBrowserCompatCustomActionResultReceiver, e);
        return this;
    }

    public final Object IconCompatParcelizer() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = read;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return RemoteActionCompatParcelizer;
            }
            int i = (int) (1073741823 & j);
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i2 & i)) {
                return null;
            }
            Object obj = getAudioAttributesCompatParcelizer().get(this.MediaBrowserCompatCustomActionResultReceiver & i);
            if (obj == null) {
                if (this.MediaBrowserCompatItemReceiver) {
                    return null;
                }
            } else {
                if (obj instanceof read) {
                    return null;
                }
                int i3 = (i + 1) & 1073741823;
                if (read.compareAndSet(this, j, IconCompatParcelizer.read(j, i3))) {
                    getAudioAttributesCompatParcelizer().set(this.MediaBrowserCompatCustomActionResultReceiver & i, null);
                    return obj;
                }
                if (this.MediaBrowserCompatItemReceiver) {
                    do {
                        this = this.read(i, i3);
                    } while (this != null);
                    return obj;
                }
            }
        }
    }

    private final setReBufferDurationMs<E> read(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = read;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) (1073741823 & j);
            getCollegeId.write();
            if ((1152921504606846976L & j) != 0) {
                return AudioAttributesCompatParcelizer();
            }
        } while (!read.compareAndSet(this, j, IconCompatParcelizer.read(j, i2)));
        getAudioAttributesCompatParcelizer().set(this.MediaBrowserCompatCustomActionResultReceiver & i3, null);
        return null;
    }

    public final setReBufferDurationMs<E> AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver());
    }

    private final long MediaBrowserCompatItemReceiver() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = read;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    private final setReBufferDurationMs<E> RemoteActionCompatParcelizer(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = write;
        while (true) {
            setReBufferDurationMs<E> setrebufferdurationms = (setReBufferDurationMs) atomicReferenceFieldUpdater.get(this);
            if (setrebufferdurationms != null) {
                return setrebufferdurationms;
            }
            DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, null, write(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final setReBufferDurationMs<E> write(long j) {
        setReBufferDurationMs<E> setrebufferdurationms = new setReBufferDurationMs<>(this.AudioAttributesImplApi26Parcelizer << 1, this.MediaBrowserCompatItemReceiver);
        int i = (int) (1073741823 & j);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
            if ((i & i3) != (i3 & i2)) {
                Object readVar = getAudioAttributesCompatParcelizer().get(this.MediaBrowserCompatCustomActionResultReceiver & i);
                if (readVar == null) {
                    readVar = new read(i);
                }
                setrebufferdurationms.getAudioAttributesCompatParcelizer().set(setrebufferdurationms.MediaBrowserCompatCustomActionResultReceiver & i, readVar);
                i++;
            } else {
                read.set(setrebufferdurationms, IconCompatParcelizer.RemoteActionCompatParcelizer(j, 1152921504606846976L));
                return setrebufferdurationms;
            }
        }
    }

    public static final class read {
        public final int AudioAttributesCompatParcelizer;

        public read(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e"}, d2 = {"Lo/setReBufferDurationMs$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "RemoteActionCompatParcelizer", "(JJ)J", "", "read", "(JI)J", "IconCompatParcelizer", "(J)I", "Lo/accessgetVideoConfigurationC2cp;", "Lo/accessgetVideoConfigurationC2cp;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        public static int IconCompatParcelizer(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public static long RemoteActionCompatParcelizer(long j, long j2) {
            return j & (~j2);
        }

        private IconCompatParcelizer() {
        }

        public static long read(long j, int i) {
            return RemoteActionCompatParcelizer(j, 1073741823L) | ((long) i);
        }

        public static long IconCompatParcelizer(long j, int i) {
            return RemoteActionCompatParcelizer(j, 1152921503533105152L) | (((long) i) << 30);
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    private final /* synthetic */ AtomicReferenceArray getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
