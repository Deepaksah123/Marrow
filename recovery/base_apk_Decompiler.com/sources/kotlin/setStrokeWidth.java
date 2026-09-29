package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/setStrokeWidth;", "Lo/writerFor;", "Lo/getPivotY;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V", "AudioAttributesCompatParcelizer", "()Lo/getPivotY;", "RemoteActionCompatParcelizer", "(Lo/getPivotY;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "Lo/getCreatedOnDateMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setStrokeWidth extends writerFor<getPivotY> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;

    public setStrokeWidth(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = getcreatedondatems;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getPivotY IconCompatParcelizer() {
        return new getPivotY(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getPivotY p0) {
        p0.read(this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof setStrokeWidth) && this.RemoteActionCompatParcelizer == ((setStrokeWidth) p0).RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }
}
