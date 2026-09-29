package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/appendDesc;", "Lo/CurrentQuery$write;", "R", "Lkotlin/Function1;", "", "p0", "IconCompatParcelizer", "(Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CurrentQuery$IconCompatParcelizer;", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface appendDesc extends CurrentQuery.write {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;

    <R> Object IconCompatParcelizer(getAnswerMap<? super Long, ? extends R> getanswermap, SampleVideos<? super R> sampleVideos);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <E extends CurrentQuery.write> E AudioAttributesCompatParcelizer(appendDesc appenddesc, CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
            return (E) CurrentQuery.write.DefaultImpls.get(appenddesc, iconCompatParcelizer);
        }

        public static CurrentQuery IconCompatParcelizer(appendDesc appenddesc, CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
            return CurrentQuery.write.DefaultImpls.minusKey(appenddesc, iconCompatParcelizer);
        }

        public static CurrentQuery IconCompatParcelizer(appendDesc appenddesc, CurrentQuery currentQuery) {
            return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(appenddesc, currentQuery);
        }

        public static <R> R write(appendDesc appenddesc, R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
            return (R) CurrentQuery.write.DefaultImpls.fold(appenddesc, r, magicModuleSubmissionRequestBody);
        }
    }

    @Override // o.CurrentQuery.write
    default CurrentQuery.IconCompatParcelizer<?> getKey() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: o.appendDesc$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/appendDesc$write;", "Lo/CurrentQuery$IconCompatParcelizer;", "Lo/appendDesc;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<appendDesc> {
        static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();

        private Companion() {
        }
    }
}
