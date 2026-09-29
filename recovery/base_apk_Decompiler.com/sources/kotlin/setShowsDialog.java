package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/setShowsDialog;", "Lo/writerFor;", "Lo/setStyle;", "Lo/_skipWSOrEnd$write;", "p0", "<init>", "(Lo/_skipWSOrEnd$write;)V", "RemoteActionCompatParcelizer", "()Lo/setStyle;", "", "(Lo/setStyle;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "write", "Lo/_skipWSOrEnd$write;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setShowsDialog extends writerFor<setStyle> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _skipWSOrEnd.write IconCompatParcelizer;

    public setShowsDialog(_skipWSOrEnd.write writeVar) {
        this.IconCompatParcelizer = writeVar;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final setStyle IconCompatParcelizer() {
        return new setStyle(this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(setStyle p0) {
        p0.write(this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        setShowsDialog setshowsdialog = p0 instanceof setShowsDialog ? (setShowsDialog) p0 : null;
        if (setshowsdialog == null) {
            return false;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setshowsdialog.IconCompatParcelizer);
    }
}
