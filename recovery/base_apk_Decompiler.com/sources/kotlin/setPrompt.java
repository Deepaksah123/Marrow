package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/setPrompt;", "Lo/setDropDownVerticalOffset;", "Lo/setSelector;", "p0", "<init>", "(Lo/setSelector;)V", "read", "Lo/setSelector;", "RemoteActionCompatParcelizer", "()Lo/setSelector;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setPrompt extends setDropDownVerticalOffset {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setSelector write;

    public setPrompt(setSelector setselector) {
        super(null);
        this.write = setselector;
    }

    @Override // kotlin.setDropDownVerticalOffset
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final setSelector getWrite() {
        return this.write;
    }
}
