package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.registerForActivityResult;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements onRequestPermissionsResult.AudioAttributesCompatParcelizer, registerForActivityResult, AdapterView.OnItemClickListener {
    private static final int[] write = {R.attr.background, R.attr.divider};
    private onRequestPermissionsResult read;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        setTitle settitle = setTitle.read(context, attributeSet, write, i, 0);
        if (settitle.AudioAttributesImplApi26Parcelizer(0)) {
            setBackgroundDrawable(settitle.IconCompatParcelizer(0));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(1)) {
            setDivider(settitle.IconCompatParcelizer(1));
        }
        settitle.write();
    }

    @Override // kotlin.registerForActivityResult
    public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult) {
        this.read = onrequestpermissionsresult;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // o.onRequestPermissionsResult.AudioAttributesCompatParcelizer
    public final boolean RemoteActionCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return this.read.IconCompatParcelizer(onretainnonconfigurationinstance, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        RemoteActionCompatParcelizer((onRetainNonConfigurationInstance) getAdapter().getItem(i));
    }
}
