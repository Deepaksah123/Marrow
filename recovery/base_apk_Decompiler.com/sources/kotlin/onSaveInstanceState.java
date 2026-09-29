package kotlin;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class onSaveInstanceState implements removeOnContextAvailableListener, peekAvailableContext, AdapterView.OnItemClickListener {
    private Rect AudioAttributesCompatParcelizer;

    public abstract void AudioAttributesCompatParcelizer(PopupWindow.OnDismissListener onDismissListener);

    @Override // kotlin.peekAvailableContext
    public final int IconCompatParcelizer() {
        return 0;
    }

    public abstract void IconCompatParcelizer(int i);

    @Override // kotlin.peekAvailableContext
    public final boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    public abstract void RemoteActionCompatParcelizer(int i);

    public abstract void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult);

    public abstract void RemoteActionCompatParcelizer(boolean z);

    protected boolean RemoteActionCompatParcelizer() {
        return true;
    }

    @Override // kotlin.peekAvailableContext
    public final void read(Context context, onRequestPermissionsResult onrequestpermissionsresult) {
    }

    @Override // kotlin.peekAvailableContext
    public final boolean read(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    public abstract void write(int i);

    public abstract void write(View view);

    public abstract void write(boolean z);

    onSaveInstanceState() {
    }

    public final void write(Rect rect) {
        this.AudioAttributesCompatParcelizer = rect;
    }

    public final Rect AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        write(listAdapter).write.AudioAttributesCompatParcelizer((MenuItem) listAdapter.getItem(i), this, RemoteActionCompatParcelizer() ? 0 : 4);
    }

    protected static int RemoteActionCompatParcelizer(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    protected static onPreparePanel write(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (onPreparePanel) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (onPreparePanel) listAdapter;
    }

    protected static boolean IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult) {
        int size = onrequestpermissionsresult.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = onrequestpermissionsresult.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
