package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012$\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R2\u0010\u000b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/ChangeBounds;", "Lo/writerFor;", "Lo/ChangeImageTransform;", "Lkotlin/Function2;", "Lo/getReferencedType;", "Lo/SampleVideos;", "", "", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "read", "()Lo/ChangeImageTransform;", "AudioAttributesCompatParcelizer", "(Lo/ChangeImageTransform;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ChangeBounds extends writerFor<ChangeImageTransform> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getShowPopup>, Object> read;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeBounds(MagicModuleSubmissionRequestBody<? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        this.read = magicModuleSubmissionRequestBody;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ChangeImageTransform IconCompatParcelizer() {
        return new ChangeImageTransform(this.read);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(ChangeImageTransform p0) {
        p0.AudioAttributesCompatParcelizer(this.read);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof ChangeBounds) && this.read == ((ChangeBounds) p0).read;
    }

    public final int hashCode() {
        MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.read;
        if (magicModuleSubmissionRequestBody != null) {
            return magicModuleSubmissionRequestBody.hashCode();
        }
        return 0;
    }
}
