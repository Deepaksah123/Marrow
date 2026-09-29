package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;
import kotlin._handleOddValue;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b"}, d2 = {"Lo/keyUsing;", "Lo/_handleOddValue;", "<init>", "()V", "", "p0", "write", "Lo/nextTokenToRead;", "read", "()F", "IconCompatParcelizer", "(F)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class keyUsing implements _handleOddValue {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final nextTokenToRead RemoteActionCompatParcelizer = getInputCodeUtf8.AudioAttributesCompatParcelizer(1.0f);

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

    public final void IconCompatParcelizer(float f) {
        this.RemoteActionCompatParcelizer.write(f);
    }

    @Override // kotlin._handleOddValue
    public final float read() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
