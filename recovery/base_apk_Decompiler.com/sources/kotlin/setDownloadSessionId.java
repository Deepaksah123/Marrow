package kotlin;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.setDownloadSessionId;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002-.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010\u001c\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010 \u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010!\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010(\u001a\u00020\u00152\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0014J\u001e\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010+\u001a\u00020,H\u0016R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004R{\u0010\n\u001am\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\f0\fj\u0002`\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R(\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020#8VX\u0096\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "<init>", "(Z)V", "owner", "Lkotlinx/atomicfu/AtomicRef;", "", "onSelectCancellationUnlockConstructor", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/jvm/functions/Function3;", "isLocked", "()Z", "holdsLock", "holdsLockImpl", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "tryLock", "tryLockImpl", "unlock", "onLock", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock$annotations", "()V", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLockRegFunction", "onLockProcessResult", "result", "toString", "", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class setDownloadSessionId extends setDownloadStartedTimeMs implements setDownloadPercent {
    private static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(setDownloadSessionId.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;
    private final getModuleData<getDownloadVersion<?>, Object, Object, getModuleData<Throwable, Object, CurrentQuery, getShowPopup>> write;

    public setDownloadSessionId(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : setEncryptSalt.IconCompatParcelizer;
        this.write = new getModuleData() { // from class: o.getPytCount
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return setDownloadSessionId.read(this.read, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setDownloadSessionId setdownloadsessionid, Object obj) {
        setdownloadsessionid.write(obj);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getModuleData read(final setDownloadSessionId setdownloadsessionid, final Object obj) {
        return new getModuleData() { // from class: o.getPixelRate
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj2, Object obj3, Object obj4) {
                return setDownloadSessionId.IconCompatParcelizer(this.IconCompatParcelizer, obj);
            }
        };
    }

    @Override // kotlin.setDownloadPercent
    public final boolean read() {
        return write() == 0;
    }

    private final int read(Object obj) {
        while (read()) {
            Object obj2 = IconCompatParcelizer.get(this);
            if (obj2 != setEncryptSalt.IconCompatParcelizer) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    private static /* synthetic */ Object read(setDownloadSessionId setdownloadsessionid, Object obj, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer;
        return (!setdownloadsessionid.RemoteActionCompatParcelizer(obj) && (objAudioAttributesCompatParcelizer = setdownloadsessionid.AudioAttributesCompatParcelizer(obj, sampleVideos)) == getYear.IconCompatParcelizer()) ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.setDownloadPercent
    public final boolean RemoteActionCompatParcelizer(Object obj) {
        int iIconCompatParcelizer = IconCompatParcelizer(obj);
        if (iIconCompatParcelizer == 0) {
            return true;
        }
        if (iIconCompatParcelizer == 1) {
            return false;
        }
        if (iIconCompatParcelizer == 2) {
            throw new IllegalStateException("This mutex is already locked by the specified owner: ".concat(String.valueOf(obj)).toString());
        }
        throw new IllegalStateException("unexpected".toString());
    }

    private final int IconCompatParcelizer(Object obj) {
        while (!IconCompatParcelizer()) {
            if (obj == null) {
                return 1;
            }
            int i = read(obj);
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 1;
            }
        }
        getCollegeId.write();
        IconCompatParcelizer.set(this, obj);
        return 0;
    }

    @Override // kotlin.setDownloadPercent
    public final void write(Object obj) {
        while (read()) {
            Object obj2 = IconCompatParcelizer.get(this);
            if (obj2 != setEncryptSalt.IconCompatParcelizer) {
                if (obj2 == obj || obj == null) {
                    if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, obj2, setEncryptSalt.IconCompatParcelizer)) {
                        AudioAttributesCompatParcelizer();
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("This mutex is locked by ");
                    sb.append(obj2);
                    sb.append(", but ");
                    sb.append(obj);
                    sb.append(" is expected");
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    final class RemoteActionCompatParcelizer implements setStateRank<getShowPopup>, setVerified {
        private Object AudioAttributesCompatParcelizer;
        private setStateSolvedCount<getShowPopup> IconCompatParcelizer;

        @Override // kotlin.setStateRank
        public final /* bridge */ /* synthetic */ Object read(Object obj, Object obj2, getModuleData getmoduledata) {
            return read((getShowPopup) obj, obj2);
        }

        @Override // kotlin.setStateRank
        public final /* synthetic */ void read(Object obj, getModuleData getmoduledata) {
            write((getShowPopup) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer(setStateSolvedCount<? super getShowPopup> setstatesolvedcount, Object obj) {
            this.IconCompatParcelizer = setstatesolvedcount;
            this.AudioAttributesCompatParcelizer = obj;
        }

        private <R extends getShowPopup> Object read(R r, Object obj) {
            getCollegeId.write();
            setStateSolvedCount<getShowPopup> setstatesolvedcount = this.IconCompatParcelizer;
            final setDownloadSessionId setdownloadsessionid = setDownloadSessionId.this;
            Object obj2 = setstatesolvedcount.read(r, obj, new getModuleData() { // from class: o.setDownloadStatus
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj3, Object obj4, Object obj5) {
                    return setDownloadSessionId.RemoteActionCompatParcelizer.write(setdownloadsessionid, this);
                }
            });
            if (obj2 != null) {
                getCollegeId.write();
                setDownloadSessionId.AudioAttributesImplApi26Parcelizer().set(setDownloadSessionId.this, this.AudioAttributesCompatParcelizer);
            }
            return obj2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(setDownloadSessionId setdownloadsessionid, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            getCollegeId.write();
            setDownloadSessionId.AudioAttributesImplApi26Parcelizer().set(setdownloadsessionid, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
            setdownloadsessionid.write(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        private <R extends getShowPopup> void write(R r) {
            getCollegeId.write();
            setDownloadSessionId.AudioAttributesImplApi26Parcelizer().set(setDownloadSessionId.this, this.AudioAttributesCompatParcelizer);
            setStateSolvedCount<getShowPopup> setstatesolvedcount = this.IconCompatParcelizer;
            final setDownloadSessionId setdownloadsessionid = setDownloadSessionId.this;
            setstatesolvedcount.write(r, new getAnswerMap() { // from class: o.setDownloadVersion
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setDownloadSessionId.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(setdownloadsessionid, this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(setDownloadSessionId setdownloadsessionid, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            setdownloadsessionid.write(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.setStateRank
        public final boolean write(Throwable th) {
            return this.IconCompatParcelizer.write(th);
        }

        @Override // kotlin.setStateRank
        public final void write(Object obj) {
            this.IconCompatParcelizer.write(obj);
        }

        @Override // kotlin.SampleVideos
        /* JADX INFO: renamed from: getContext */
        public final CurrentQuery getWrite() {
            return this.IconCompatParcelizer.getWrite();
        }

        @Override // kotlin.setStateRank
        public final void write(getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
            this.IconCompatParcelizer.write(getanswermap);
        }

        @Override // kotlin.setVerified
        public final void write(setTotalFramesDropped<?> settotalframesdropped, int i) {
            this.IconCompatParcelizer.write(settotalframesdropped, i);
        }

        @Override // kotlin.setStateRank
        public final boolean read() {
            return this.IconCompatParcelizer.read();
        }

        @Override // kotlin.setStateRank
        public final boolean RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setStateRank
        @getRenewGrpId
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void write(getShowPopup getshowpopup, getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
            this.IconCompatParcelizer.write(getshowpopup, getanswermap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setStateRank
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(getPlatform getplatform, getShowPopup getshowpopup) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(getplatform, getshowpopup);
        }

        @Override // kotlin.SampleVideos
        public final void resumeWith(Object obj) {
            this.IconCompatParcelizer.resumeWith(obj);
        }

        @Override // kotlin.setStateRank
        public final Object AudioAttributesCompatParcelizer(Throwable th) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(th);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(isVerified.IconCompatParcelizer(this));
        sb.append("[isLocked=");
        sb.append(read());
        sb.append(",owner=");
        sb.append(IconCompatParcelizer.get(this));
        sb.append(']');
        return sb.toString();
    }

    private final Object AudioAttributesCompatParcelizer(Object obj, SampleVideos<? super getShowPopup> sampleVideos) {
        setStateSolvedCount setstatesolvedcountIconCompatParcelizer = setStatePercentile.IconCompatParcelizer(getYear.IconCompatParcelizer(sampleVideos));
        try {
            IconCompatParcelizer((setStateRank<? super getShowPopup>) new RemoteActionCompatParcelizer(setstatesolvedcountIconCompatParcelizer, obj));
            Object objAudioAttributesCompatParcelizer = setstatesolvedcountIconCompatParcelizer.AudioAttributesCompatParcelizer();
            if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setstatesolvedcountIconCompatParcelizer.AudioAttributesImplBaseParcelizer();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesImplApi26Parcelizer() {
        return IconCompatParcelizer;
    }

    @Override // kotlin.setDownloadPercent
    public final Object RemoteActionCompatParcelizer(Object obj, SampleVideos<? super getShowPopup> sampleVideos) {
        return read(this, obj, sampleVideos);
    }
}
