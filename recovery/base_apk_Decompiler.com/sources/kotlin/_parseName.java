package kotlin;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0007B1\b\u0002\u0012&\u0010\u0006\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004`\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\t\u0010\nJN\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR4\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00018\u00008G¢\u0006\u0006\u001a\u0004\b\t\u0010\u001e\u0088\u0001\u001f\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004`\u0005"}, d2 = {"Lo/_parseName;", "T", "", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/_parseName$RemoteActionCompatParcelizer;", "Lo/AudioAttributesCompatParcelizer;", "p0", "RemoteActionCompatParcelizer", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "write", "()Ljava/util/concurrent/atomic/AtomicReference;", "R", "Lkotlin/Function1;", "Lo/TopUserCompanion;", "Lkotlin/Function2;", "Lo/SampleVideos;", "p1", "AudioAttributesCompatParcelizer", "(Ljava/util/concurrent/atomic/AtomicReference;Lo/getAnswerMap;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/util/concurrent/atomic/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSessionHolder"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class _parseName<T> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final AtomicReference<RemoteActionCompatParcelizer<T>> write;

    private static <T> AtomicReference<RemoteActionCompatParcelizer<T>> RemoteActionCompatParcelizer(AtomicReference<RemoteActionCompatParcelizer<T>> atomicReference) {
        return atomicReference;
    }

    public static <T> AtomicReference<RemoteActionCompatParcelizer<T>> write() {
        return RemoteActionCompatParcelizer(new AtomicReference(null));
    }

    public static final T write(AtomicReference<RemoteActionCompatParcelizer<T>> atomicReference) {
        RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer = atomicReference.get();
        if (remoteActionCompatParcelizer != null) {
            return remoteActionCompatParcelizer.write();
        }
        return null;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer<R> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super R>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        final /* synthetic */ AtomicReference<RemoteActionCompatParcelizer<T>> IconCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<T, SampleVideos<? super R>, Object> RemoteActionCompatParcelizer;
        final /* synthetic */ getAnswerMap<TopUserCompanion, T> read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer;
            setPassingYear audioAttributesCompatParcelizer;
            RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesCompatParcelizer;
                    remoteActionCompatParcelizer = new RemoteActionCompatParcelizer<>(getUserConfig.RemoteActionCompatParcelizer(topUserCompanion.getIconCompatParcelizer()), this.read.invoke(topUserCompanion));
                    RemoteActionCompatParcelizer<T> andSet = this.IconCompatParcelizer.getAndSet(remoteActionCompatParcelizer);
                    if (andSet != null && (audioAttributesCompatParcelizer = andSet.getAudioAttributesCompatParcelizer()) != null) {
                        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
                        this.write = 1;
                        if (getUserConfig.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, this) != objIconCompatParcelizer) {
                        }
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) this.AudioAttributesCompatParcelizer;
                        try {
                            SdkPayloadData.IconCompatParcelizer(obj);
                            setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, remoteActionCompatParcelizer2, null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, remoteActionCompatParcelizer2, null);
                            throw th;
                        }
                    }
                    remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) this.AudioAttributesCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                MagicModuleSubmissionRequestBody<T, SampleVideos<? super R>, Object> magicModuleSubmissionRequestBody = this.RemoteActionCompatParcelizer;
                T tWrite = remoteActionCompatParcelizer.write();
                this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
                this.write = 2;
                obj = magicModuleSubmissionRequestBody.invoke(tWrite, this);
                if (obj != objIconCompatParcelizer) {
                    remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                    setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, remoteActionCompatParcelizer2, null);
                    return obj;
                }
                return objIconCompatParcelizer;
            } catch (Throwable th2) {
                th = th2;
                remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, remoteActionCompatParcelizer2, null);
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(getAnswerMap<? super TopUserCompanion, ? extends T> getanswermap, AtomicReference<RemoteActionCompatParcelizer<T>> atomicReference, MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = getanswermap;
            this.IconCompatParcelizer = atomicReference;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super R> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final <R> Object AudioAttributesCompatParcelizer(AtomicReference<RemoteActionCompatParcelizer<T>> atomicReference, getAnswerMap<? super TopUserCompanion, ? extends T> getanswermap, MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super R> sampleVideos) {
        return College.IconCompatParcelizer(new AudioAttributesCompatParcelizer(getanswermap, atomicReference, magicModuleSubmissionRequestBody, null), sampleVideos);
    }

    public static boolean read(AtomicReference<RemoteActionCompatParcelizer<T>> atomicReference, Object obj) {
        return (obj instanceof _parseName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(atomicReference, ((_parseName) obj).getWrite());
    }

    public static int IconCompatParcelizer(AtomicReference<RemoteActionCompatParcelizer<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    public static String AudioAttributesCompatParcelizer(AtomicReference<RemoteActionCompatParcelizer<T>> atomicReference) {
        StringBuilder sb = new StringBuilder("SessionMutex(currentSessionHolder=");
        sb.append(atomicReference);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return read(this.write, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.write);
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ AtomicReference getWrite() {
        return this.write;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\b\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/_parseName$RemoteActionCompatParcelizer;", "T", "", "Lo/setPassingYear;", "p0", "p1", "<init>", "(Lo/setPassingYear;Ljava/lang/Object;)V", "IconCompatParcelizer", "Lo/setPassingYear;", "()Lo/setPassingYear;", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "write", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer<T> {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final T IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final setPassingYear AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(setPassingYear setpassingyear, T t) {
            this.AudioAttributesCompatParcelizer = setpassingyear;
            this.IconCompatParcelizer = t;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final setPassingYear getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final T write() {
            return this.IconCompatParcelizer;
        }
    }
}
