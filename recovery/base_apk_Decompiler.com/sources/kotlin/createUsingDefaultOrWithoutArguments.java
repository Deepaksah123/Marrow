package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/createUsingDefaultOrWithoutArguments;", "Lo/parseDouble;", "", "p0", "<init>", "(Z)V", "AudioAttributesCompatParcelizer", "Z", "IconCompatParcelizer", "()Ljava/lang/Boolean;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class createUsingDefaultOrWithoutArguments implements parseDouble<Boolean> {
    private final boolean AudioAttributesCompatParcelizer;

    public createUsingDefaultOrWithoutArguments(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // kotlin.parseDouble
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final Boolean read() {
        return Boolean.valueOf(this.AudioAttributesCompatParcelizer);
    }
}
