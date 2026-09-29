package kotlin;

import android.widget.ListView;

/* JADX INFO: loaded from: classes2.dex */
public final class _addAnnotationsIfNotPresent extends hasAnnotations {
    private final ListView AudioAttributesImplBaseParcelizer;

    public _addAnnotationsIfNotPresent(ListView listView) {
        super(listView);
        this.AudioAttributesImplBaseParcelizer = listView;
    }

    @Override // kotlin.hasAnnotations
    public final void IconCompatParcelizer(int i) {
        this.AudioAttributesImplBaseParcelizer.scrollListBy(i);
    }

    @Override // kotlin.hasAnnotations
    public final boolean RemoteActionCompatParcelizer(int i) {
        ListView listView = this.AudioAttributesImplBaseParcelizer;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            if (firstVisiblePosition + childCount >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
