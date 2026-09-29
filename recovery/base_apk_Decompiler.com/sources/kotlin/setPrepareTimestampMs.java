package kotlin;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\bH\u0002J\u001e\u0010\u0016\u001a\u00060\u0000j\u0002`\u00112\n\u0010\u0017\u001a\u00060\u0000j\u0002`\u0011H\u0082\u0010¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\n\u0010\u001a\u001a\u00060\u0000j\u0002`\u0011¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000b2\n\u0010\u001a\u001a\u00060\u0000j\u0002`\u00112\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eJ%\u0010#\u001a\u00020\u000b2\n\u0010\u001a\u001a\u00060\u0000j\u0002`\u00112\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0001¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u000bH\u0016J\u0015\u0010&\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0011H\u0001¢\u0006\u0002\u0010\u0013J\u0019\u0010'\u001a\u00020!2\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0002¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0011H\u0082\u0010¢\u0006\u0002\u0010\u0013J'\u0010*\u001a\u00020!2\n\u0010+\u001a\u00060\u0000j\u0002`\u00112\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0000¢\u0006\u0004\b,\u0010-J\b\u0010.\u001a\u00020/H\u0016R\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004R\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005X\u0082\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0010\u001a\u00060\u0000j\u0002`\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0014\u001a\u00060\u0000j\u0002`\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "removed", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prevNode", "getPrevNode", "findPrevNonRemoved", "current", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "addOneIfEmpty", "node", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addLast", "permissionsBitmask", "", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;I)Z", "close", "", "forbiddenElementsBit", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "remove", "removeOrNext", "finishAdd", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "correctPrev", "validateNode", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class setPrepareTimestampMs {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(setPrepareTimestampMs.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(setPrepareTimestampMs.class, Object.class, "_prev$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(setPrepareTimestampMs.class, Object.class, "_removedRef$volatile");

    private final setWvAudioLevel RatingCompat() {
        setWvAudioLevel setwvaudiolevel = (setWvAudioLevel) AudioAttributesCompatParcelizer.get(this);
        if (setwvaudiolevel != null) {
            return setwvaudiolevel;
        }
        setWvAudioLevel setwvaudiolevel2 = new setWvAudioLevel(this);
        AudioAttributesCompatParcelizer.set(this, setwvaudiolevel2);
        return setwvaudiolevel2;
    }

    public boolean bg_() {
        return AudioAttributesImplBaseParcelizer() instanceof setWvAudioLevel;
    }

    public final Object AudioAttributesImplBaseParcelizer() {
        return IconCompatParcelizer.get(this);
    }

    public final setPrepareTimestampMs AudioAttributesImplApi21Parcelizer() {
        setPrepareTimestampMs setpreparetimestampms;
        Object objAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        setWvAudioLevel setwvaudiolevel = objAudioAttributesImplBaseParcelizer instanceof setWvAudioLevel ? (setWvAudioLevel) objAudioAttributesImplBaseParcelizer : null;
        if (setwvaudiolevel != null && (setpreparetimestampms = setwvaudiolevel.write) != null) {
            return setpreparetimestampms;
        }
        toMagicModuleMetaRepoModel.read(objAudioAttributesImplBaseParcelizer, "");
        return (setPrepareTimestampMs) objAudioAttributesImplBaseParcelizer;
    }

    public final setPrepareTimestampMs AudioAttributesImplApi26Parcelizer() {
        setPrepareTimestampMs setpreparetimestampmsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        return setpreparetimestampmsAudioAttributesCompatParcelizer == null ? write((setPrepareTimestampMs) write.get(this)) : setpreparetimestampmsAudioAttributesCompatParcelizer;
    }

    private static setPrepareTimestampMs write(setPrepareTimestampMs setpreparetimestampms) {
        while (setpreparetimestampms.bg_()) {
            setpreparetimestampms = (setPrepareTimestampMs) write.get(setpreparetimestampms);
        }
        return setpreparetimestampms;
    }

    public final boolean RemoteActionCompatParcelizer(setPrepareTimestampMs setpreparetimestampms) {
        write.set(setpreparetimestampms, this);
        IconCompatParcelizer.set(setpreparetimestampms, this);
        while (AudioAttributesImplBaseParcelizer() == this) {
            if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, this, setpreparetimestampms)) {
                setpreparetimestampms.AudioAttributesCompatParcelizer(this);
                return true;
            }
        }
        return false;
    }

    public final boolean AudioAttributesCompatParcelizer(setPrepareTimestampMs setpreparetimestampms, int i) {
        setPrepareTimestampMs setpreparetimestampmsAudioAttributesImplApi26Parcelizer;
        do {
            setpreparetimestampmsAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (setpreparetimestampmsAudioAttributesImplApi26Parcelizer instanceof setPlaybackType) {
                return (((setPlaybackType) setpreparetimestampmsAudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer & i) == 0 && setpreparetimestampmsAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(setpreparetimestampms, i);
            }
        } while (!setpreparetimestampmsAudioAttributesImplApi26Parcelizer.IconCompatParcelizer(setpreparetimestampms, this));
        return true;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        AudioAttributesCompatParcelizer(new setPlaybackType(i), i);
    }

    private boolean IconCompatParcelizer(setPrepareTimestampMs setpreparetimestampms, setPrepareTimestampMs setpreparetimestampms2) {
        write.set(setpreparetimestampms, this);
        IconCompatParcelizer.set(setpreparetimestampms, setpreparetimestampms2);
        if (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, setpreparetimestampms2, setpreparetimestampms)) {
            return false;
        }
        setpreparetimestampms.AudioAttributesCompatParcelizer(setpreparetimestampms2);
        return true;
    }

    public boolean bh_() {
        return MediaDescriptionCompat() == null;
    }

    private setPrepareTimestampMs MediaDescriptionCompat() {
        Object objAudioAttributesImplBaseParcelizer;
        setPrepareTimestampMs setpreparetimestampms;
        do {
            objAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            if (objAudioAttributesImplBaseParcelizer instanceof setWvAudioLevel) {
                return ((setWvAudioLevel) objAudioAttributesImplBaseParcelizer).write;
            }
            if (objAudioAttributesImplBaseParcelizer == this) {
                return (setPrepareTimestampMs) objAudioAttributesImplBaseParcelizer;
            }
            toMagicModuleMetaRepoModel.read(objAudioAttributesImplBaseParcelizer, "");
            setpreparetimestampms = (setPrepareTimestampMs) objAudioAttributesImplBaseParcelizer;
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, objAudioAttributesImplBaseParcelizer, setpreparetimestampms.RatingCompat()));
        setpreparetimestampms.AudioAttributesCompatParcelizer();
        return null;
    }

    private final void AudioAttributesCompatParcelizer(setPrepareTimestampMs setpreparetimestampms) {
        setPrepareTimestampMs setpreparetimestampms2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = write;
        do {
            setpreparetimestampms2 = (setPrepareTimestampMs) atomicReferenceFieldUpdater.get(setpreparetimestampms);
            if (AudioAttributesImplBaseParcelizer() != setpreparetimestampms) {
                return;
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, setpreparetimestampms, setpreparetimestampms2, this));
        if (bg_()) {
            setpreparetimestampms.AudioAttributesCompatParcelizer();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (kotlin.DateDeserializersDateBasedDeserializer.IconCompatParcelizer(kotlin.setPrepareTimestampMs.IconCompatParcelizer, r3, r1, ((kotlin.setWvAudioLevel) r4).write) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.setPrepareTimestampMs AudioAttributesCompatParcelizer() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = MediaBrowserCompatItemReceiver()
            java.lang.Object r0 = r0.get(r7)
            o.setPrepareTimestampMs r0 = (kotlin.setPrepareTimestampMs) r0
            r1 = r0
        Lb:
            r2 = 0
            r3 = r2
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = MediaBrowserCompatCustomActionResultReceiver()
            java.lang.Object r4 = r4.get(r1)
            if (r4 != r7) goto L24
            if (r0 == r1) goto L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = MediaBrowserCompatItemReceiver()
            boolean r0 = kotlin.DateDeserializersDateBasedDeserializer.IconCompatParcelizer(r2, r7, r0, r1)
            if (r0 == 0) goto L0
        L23:
            return r1
        L24:
            boolean r5 = r7.bg_()
            if (r5 == 0) goto L2b
            return r2
        L2b:
            boolean r5 = r4 instanceof kotlin.setWvAudioLevel
            if (r5 == 0) goto L4c
            if (r3 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = MediaBrowserCompatCustomActionResultReceiver()
            o.setWvAudioLevel r4 = (kotlin.setWvAudioLevel) r4
            o.setPrepareTimestampMs r4 = r4.write
            boolean r1 = kotlin.DateDeserializersDateBasedDeserializer.IconCompatParcelizer(r2, r3, r1, r4)
            if (r1 == 0) goto L0
            r1 = r3
            goto Lb
        L41:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = MediaBrowserCompatItemReceiver()
            java.lang.Object r1 = r4.get(r1)
            o.setPrepareTimestampMs r1 = (kotlin.setPrepareTimestampMs) r1
            goto Ld
        L4c:
            java.lang.String r3 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r4, r3)
            r3 = r4
            o.setPrepareTimestampMs r3 = (kotlin.setPrepareTimestampMs) r3
            r6 = r3
            r3 = r1
            r1 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPrepareTimestampMs.AudioAttributesCompatParcelizer():o.setPrepareTimestampMs");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new r8lambdaUFY5mAmNSw5Bop5Ye76bF6DmHgA(this) { // from class: o.setPrepareTimestampMs.IconCompatParcelizer
            @Override // kotlin.r8lambdaUFY5mAmNSw5Bop5Ye76bF6DmHgA, kotlin.ResponseErrorCompanion
            public final Object read() {
                return isVerified.read(this.AudioAttributesImplApi26Parcelizer);
            }
        });
        sb.append('@');
        sb.append(isVerified.IconCompatParcelizer(this));
        return sb.toString();
    }
}
