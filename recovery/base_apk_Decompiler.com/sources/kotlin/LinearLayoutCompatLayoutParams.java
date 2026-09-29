package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/LinearLayoutCompatLayoutParams;", "T", "Lo/ScrollingTabContainerView;", "V", "", "Lo/setShowDividers;", "p0", "Lo/setDividerPadding;", "p1", "<init>", "(Lo/setShowDividers;Lo/setDividerPadding;)V", "", "toString", "()Ljava/lang/String;", "write", "Lo/setShowDividers;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/setDividerPadding;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LinearLayoutCompatLayoutParams<T, V extends ScrollingTabContainerView> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setDividerPadding AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setShowDividers<T, V> IconCompatParcelizer;

    public LinearLayoutCompatLayoutParams(setShowDividers<T, V> setshowdividers, setDividerPadding setdividerpadding) {
        this.IconCompatParcelizer = setshowdividers;
        this.AudioAttributesCompatParcelizer = setdividerpadding;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", endState=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
