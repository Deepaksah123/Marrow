package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_handleOddValue;", "Lo/CurrentQuery$write;", "", "read", "()F", "AudioAttributesCompatParcelizer", "Lo/CurrentQuery$IconCompatParcelizer;", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _handleOddValue extends CurrentQuery.write {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;

    float read();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static CurrentQuery RemoteActionCompatParcelizer(_handleOddValue _handleoddvalue, CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
            return CurrentQuery.write.DefaultImpls.minusKey(_handleoddvalue, iconCompatParcelizer);
        }

        public static <E extends CurrentQuery.write> E read(_handleOddValue _handleoddvalue, CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
            return (E) CurrentQuery.write.DefaultImpls.get(_handleoddvalue, iconCompatParcelizer);
        }

        public static <R> R write(_handleOddValue _handleoddvalue, R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
            return (R) CurrentQuery.write.DefaultImpls.fold(_handleoddvalue, r, magicModuleSubmissionRequestBody);
        }

        public static CurrentQuery write(_handleOddValue _handleoddvalue, CurrentQuery currentQuery) {
            return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(_handleoddvalue, currentQuery);
        }
    }

    @Override // o.CurrentQuery.write
    default CurrentQuery.IconCompatParcelizer<?> getKey() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: o._handleOddValue$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleOddValue$AudioAttributesCompatParcelizer;", "Lo/CurrentQuery$IconCompatParcelizer;", "Lo/_handleOddValue;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<_handleOddValue> {
        static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();

        private Companion() {
        }
    }
}
