package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0005\"\u0015\u0010\t\u001a\u00020\b*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"R", "Lkotlin/Function1;", "", "p0", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "read", "Lo/CurrentQuery;", "Lo/appendDesc;", "IconCompatParcelizer", "(Lo/CurrentQuery;)Lo/appendDesc;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TokenFilterInclusion {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class write<R> implements getAnswerMap<Long, R> {
        final /* synthetic */ getAnswerMap<Long, R> IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Long l) {
            return write(l.longValue());
        }

        public final R write(long j) {
            return this.IconCompatParcelizer.invoke(Long.valueOf(j / 1000000));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public write(getAnswerMap<? super Long, ? extends R> getanswermap) {
            this.IconCompatParcelizer = getanswermap;
        }
    }

    public static final <R> Object AudioAttributesCompatParcelizer(getAnswerMap<? super Long, ? extends R> getanswermap, SampleVideos<? super R> sampleVideos) {
        return IconCompatParcelizer(sampleVideos.getContext()).IconCompatParcelizer(getanswermap, sampleVideos);
    }

    public static final <R> Object read(getAnswerMap<? super Long, ? extends R> getanswermap, SampleVideos<? super R> sampleVideos) {
        return IconCompatParcelizer(sampleVideos.getContext()).IconCompatParcelizer(new write(getanswermap), sampleVideos);
    }

    public static final appendDesc IconCompatParcelizer(CurrentQuery currentQuery) {
        appendDesc appenddesc = (appendDesc) currentQuery.get(appendDesc.INSTANCE);
        if (appenddesc != null) {
            return appenddesc;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
