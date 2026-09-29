package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
import kotlin.registerForActivityResult;

/* JADX INFO: loaded from: classes.dex */
public final class onPreparePanel extends BaseAdapter {
    private boolean AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer = -1;
    private final boolean MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private final LayoutInflater read;
    onRequestPermissionsResult write;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public onPreparePanel(onRequestPermissionsResult onrequestpermissionsresult, LayoutInflater layoutInflater, boolean z, int i) {
        this.MediaBrowserCompatItemReceiver = z;
        this.read = layoutInflater;
        this.write = onrequestpermissionsresult;
        this.RemoteActionCompatParcelizer = i;
        IconCompatParcelizer();
    }

    public final void write(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<onRetainNonConfigurationInstance> arrayListMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver ? this.write.MediaBrowserCompatCustomActionResultReceiver() : this.write.MediaDescriptionCompat();
        if (this.IconCompatParcelizer < 0) {
            return arrayListMediaBrowserCompatCustomActionResultReceiver.size();
        }
        return arrayListMediaBrowserCompatCustomActionResultReceiver.size() - 1;
    }

    public final onRequestPermissionsResult write() {
        return this.write;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final onRetainNonConfigurationInstance getItem(int i) {
        ArrayList<onRetainNonConfigurationInstance> arrayListMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver ? this.write.MediaBrowserCompatCustomActionResultReceiver() : this.write.MediaDescriptionCompat();
        int i2 = this.IconCompatParcelizer;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListMediaBrowserCompatCustomActionResultReceiver.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.read.inflate(this.RemoteActionCompatParcelizer, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        int groupId2 = i2 >= 0 ? getItem(i2).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.write.MediaMetadataCompat() && groupId != groupId2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        registerForActivityResult.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (registerForActivityResult.AudioAttributesCompatParcelizer) view;
        if (this.AudioAttributesCompatParcelizer) {
            listMenuItemView.setForceShowIcon(true);
        }
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getItem(i));
        return view;
    }

    private void IconCompatParcelizer() {
        onRetainNonConfigurationInstance onretainnonconfigurationinstanceMediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver();
        if (onretainnonconfigurationinstanceMediaBrowserCompatItemReceiver != null) {
            ArrayList<onRetainNonConfigurationInstance> arrayListMediaBrowserCompatCustomActionResultReceiver = this.write.MediaBrowserCompatCustomActionResultReceiver();
            int size = arrayListMediaBrowserCompatCustomActionResultReceiver.size();
            for (int i = 0; i < size; i++) {
                if (arrayListMediaBrowserCompatCustomActionResultReceiver.get(i) == onretainnonconfigurationinstanceMediaBrowserCompatItemReceiver) {
                    this.IconCompatParcelizer = i;
                    return;
                }
            }
        }
        this.IconCompatParcelizer = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        IconCompatParcelizer();
        super.notifyDataSetChanged();
    }
}
