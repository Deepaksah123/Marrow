package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.CurrentQuery;
import kotlin.Metadata;
import kotlin._handleOddValue;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/withPerCallAttribute;", "Lo/_handleOddValue;", "<init>", "()V", "", "read", "()F", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class withPerCallAttribute implements _handleOddValue {
    public static final withPerCallAttribute INSTANCE = new withPerCallAttribute();

    @Override // kotlin._handleOddValue
    public final float read() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    private withPerCallAttribute() {
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) _handleOddValue.DefaultImpls.write(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) _handleOddValue.DefaultImpls.read(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return _handleOddValue.DefaultImpls.RemoteActionCompatParcelizer(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return _handleOddValue.DefaultImpls.write(this, currentQuery);
    }
}
