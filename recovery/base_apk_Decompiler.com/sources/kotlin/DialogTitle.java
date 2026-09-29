package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R'\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0011\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010%"}, d2 = {"Lo/DialogTitle;", "Lo/writerFor;", "Lo/setBaselineAligned;", "Lo/setLayoutInflater;", "Lo/setDropDownHorizontalOffset;", "p0", "Lo/setLayoutInflater$IconCompatParcelizer;", "Lo/switchToNext;", "Lo/setAppSearchData;", "p1", "Lo/setDropDownVerticalOffset;", "p2", "Lo/setDropDownWidth;", "p3", "<init>", "(Lo/setLayoutInflater;Lo/setLayoutInflater$IconCompatParcelizer;Lo/setDropDownVerticalOffset;Lo/setDropDownWidth;)V", "write", "()Lo/setBaselineAligned;", "", "read", "(Lo/setBaselineAligned;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/setLayoutInflater;", "IconCompatParcelizer", "Lo/setLayoutInflater$IconCompatParcelizer;", "Lo/setDropDownVerticalOffset;", "AudioAttributesCompatParcelizer", "Lo/setDropDownWidth;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class DialogTitle extends writerFor<setBaselineAligned> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<switchToNext, setAppSearchData> read;
    private final setLayoutInflater<setDropDownHorizontalOffset> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setDropDownWidth write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setDropDownVerticalOffset AudioAttributesCompatParcelizer;

    public DialogTitle(setLayoutInflater<setDropDownHorizontalOffset> setlayoutinflater, setLayoutInflater<setDropDownHorizontalOffset>.IconCompatParcelizer<switchToNext, setAppSearchData> iconCompatParcelizer, setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth) {
        this.RemoteActionCompatParcelizer = setlayoutinflater;
        this.read = iconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = setdropdownverticaloffset;
        this.write = setdropdownwidth;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final setBaselineAligned IconCompatParcelizer() {
        return new setBaselineAligned(this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(setBaselineAligned p0) {
        p0.read(this.RemoteActionCompatParcelizer);
        p0.RemoteActionCompatParcelizer(this.read);
        p0.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        p0.RemoteActionCompatParcelizer(this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DialogTitle)) {
            return false;
        }
        DialogTitle dialogTitle = (DialogTitle) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, dialogTitle.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, dialogTitle.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, dialogTitle.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, dialogTitle.write);
    }

    public final int hashCode() {
        return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogTitle(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
