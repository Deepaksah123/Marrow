package kotlin;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000eB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0010\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/getDateTense;", "T", "Lo/SampleVideos;", "Lo/getNextQuery;", "p0", "", "p1", "<init>", "(Lo/SampleVideos;Ljava/lang/Object;)V", "(Lo/SampleVideos;)V", "Lo/getRfBanners;", "", "resumeWith", "(Ljava/lang/Object;)V", "IconCompatParcelizer", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "toString", "()Ljava/lang/String;", "read", "Lo/SampleVideos;", "write", "Lo/CurrentQuery;", "getContext", "()Lo/CurrentQuery;", "result", "Ljava/lang/Object;", "getCallerFrame", "()Lo/getNextQuery;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getDateTense<T> implements SampleVideos<T>, getNextQuery {
    private static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);
    private static final AtomicReferenceFieldUpdater<getDateTense<?>, Object> RemoteActionCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(getDateTense.class, Object.class, "result");

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final SampleVideos<T> write;
    private volatile Object result;

    @Override // kotlin.getNextQuery
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getDateTense(SampleVideos<? super T> sampleVideos, Object obj) {
        toMagicModuleMetaRepoModel.write(sampleVideos, "");
        this.write = sampleVideos;
        this.result = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getDateTense(SampleVideos<? super T> sampleVideos) {
        this(sampleVideos, getMonth.read);
        toMagicModuleMetaRepoModel.write(sampleVideos, "");
    }

    @Override // kotlin.SampleVideos
    /* JADX INFO: renamed from: getContext */
    public final CurrentQuery getWrite() {
        return this.write.getWrite();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003RP\u0010\b\u001a>\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00050\u0005\u0012\b\u0012\u0006*\u00020\u00010\u0001*\u001e\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00050\u0005\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getDateTense$IconCompatParcelizer;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lo/getDateTense;", "RemoteActionCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.SampleVideos
    public final void resumeWith(Object p0) {
        while (true) {
            Object obj = this.result;
            if (obj == getMonth.read) {
                if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(RemoteActionCompatParcelizer, this, getMonth.read, p0)) {
                    return;
                }
            } else {
                if (obj != getYear.IconCompatParcelizer()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(RemoteActionCompatParcelizer, this, getYear.IconCompatParcelizer(), getMonth.RemoteActionCompatParcelizer)) {
                    this.write.resumeWith(p0);
                    return;
                }
            }
        }
    }

    public final Object IconCompatParcelizer() throws Throwable {
        Object obj = this.result;
        if (obj == getMonth.read) {
            if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(RemoteActionCompatParcelizer, this, getMonth.read, getYear.IconCompatParcelizer())) {
                return getYear.IconCompatParcelizer();
            }
            obj = this.result;
        }
        if (obj == getMonth.RemoteActionCompatParcelizer) {
            return getYear.IconCompatParcelizer();
        }
        if (obj instanceof C0177getRfBanners.AudioAttributesCompatParcelizer) {
            throw ((C0177getRfBanners.AudioAttributesCompatParcelizer) obj).AudioAttributesCompatParcelizer;
        }
        return obj;
    }

    @Override // kotlin.getNextQuery
    public final getNextQuery getCallerFrame() {
        SampleVideos<T> sampleVideos = this.write;
        if (sampleVideos instanceof getNextQuery) {
            return (getNextQuery) sampleVideos;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeContinuation for ");
        sb.append(this.write);
        return sb.toString();
    }
}
