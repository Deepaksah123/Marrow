package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012,\u0010\b\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R7\u0010\r\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00078\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/updateReference;", "Lo/writerFor;", "Lo/_deserializeAnyScalar;", "Lkotlin/Function1;", "Lo/WritableTypeIdInclusion;", "", "Lo/BringIntoViewRequester;", "Lo/OnRequesterReady;", "p0", "<init>", "(Lo/getAnswerMap;)V", "AudioAttributesCompatParcelizer", "()Lo/_deserializeAnyScalar;", "IconCompatParcelizer", "(Lo/_deserializeAnyScalar;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "write", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updateReference extends writerFor<_deserializeAnyScalar> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<getAnswerMap<? super WritableTypeIdInclusion, getShowPopup>, getShowPopup> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public updateReference(getAnswerMap<? super getAnswerMap<? super WritableTypeIdInclusion, getShowPopup>, getShowPopup> getanswermap) {
        this.IconCompatParcelizer = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final _deserializeAnyScalar IconCompatParcelizer() {
        return new _deserializeAnyScalar(this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(_deserializeAnyScalar p0) {
        p0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object p0) {
        if (this != p0) {
            return (p0 instanceof updateReference) && this.IconCompatParcelizer == ((updateReference) p0).IconCompatParcelizer;
        }
        return true;
    }
}
