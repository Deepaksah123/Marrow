package kotlinx.coroutines;

import kotlin.CurrentQuery;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lo/CurrentQuery$write;", "Lo/CurrentQuery;", "p0", "", "p1", "", "handleException", "(Lo/CurrentQuery;Ljava/lang/Throwable;)V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CoroutineExceptionHandler extends CurrentQuery.write {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    void handleException(CurrentQuery p0, Throwable p1);

    public static final class DefaultImpls {
        public static CurrentQuery AudioAttributesCompatParcelizer(CoroutineExceptionHandler coroutineExceptionHandler, CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
            return CurrentQuery.write.DefaultImpls.minusKey(coroutineExceptionHandler, iconCompatParcelizer);
        }

        public static <E extends CurrentQuery.write> E IconCompatParcelizer(CoroutineExceptionHandler coroutineExceptionHandler, CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
            return (E) CurrentQuery.write.DefaultImpls.get(coroutineExceptionHandler, iconCompatParcelizer);
        }

        public static CurrentQuery IconCompatParcelizer(CoroutineExceptionHandler coroutineExceptionHandler, CurrentQuery currentQuery) {
            return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(coroutineExceptionHandler, currentQuery);
        }

        public static <R> R read(CoroutineExceptionHandler coroutineExceptionHandler, R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
            return (R) CurrentQuery.write.DefaultImpls.fold(coroutineExceptionHandler, r, magicModuleSubmissionRequestBody);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineExceptionHandler$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<CoroutineExceptionHandler> {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        private Companion() {
        }
    }
}
