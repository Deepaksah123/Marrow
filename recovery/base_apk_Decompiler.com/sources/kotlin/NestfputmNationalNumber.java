package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/NestfputmNationalNumber;", "Lo/CurrentQuery$write;", "Lo/CurrentQuery$IconCompatParcelizer;", "<init>", "()V", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NestfputmNationalNumber implements CurrentQuery.write, CurrentQuery.IconCompatParcelizer<NestfputmNationalNumber> {
    public static final NestfputmNationalNumber INSTANCE = new NestfputmNationalNumber();

    private NestfputmNationalNumber() {
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) CurrentQuery.write.DefaultImpls.fold(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) CurrentQuery.write.DefaultImpls.get(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return CurrentQuery.write.DefaultImpls.minusKey(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(this, currentQuery);
    }

    @Override // o.CurrentQuery.write
    public final CurrentQuery.IconCompatParcelizer<?> getKey() {
        return this;
    }
}
