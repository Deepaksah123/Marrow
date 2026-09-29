package kotlin;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015"}, d2 = {"Lo/ArcMotion;", "Lo/writerFor;", "Lo/Checks1;", "Lkotlin/Function2;", "Lo/getAdapterPosition;", "Landroid/content/Context;", "", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "read", "()Lo/Checks1;", "write", "(Lo/Checks1;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/MagicModuleSubmissionRequestBody;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ArcMotion extends writerFor<Checks1> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<getAdapterPosition, Context, getShowPopup> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public ArcMotion(MagicModuleSubmissionRequestBody<? super getAdapterPosition, ? super Context, getShowPopup> magicModuleSubmissionRequestBody) {
        this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final Checks1 IconCompatParcelizer() {
        return new Checks1(this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(Checks1 p0) {
        p0.read(this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof ArcMotion) && this.IconCompatParcelizer == ((ArcMotion) p0).IconCompatParcelizer;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }
}
