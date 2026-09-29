package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;
import kotlin._init_lambda5;
import kotlin.peekAvailableContext;
import kotlin.registerForActivityResult;

/* JADX INFO: loaded from: classes.dex */
public final class onPanelClosed implements peekAvailableContext, AdapterView.OnItemClickListener {
    LayoutInflater AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private Context AudioAttributesImplApi26Parcelizer;
    private ExpandedMenuView AudioAttributesImplBaseParcelizer;
    private RemoteActionCompatParcelizer IconCompatParcelizer;
    private peekAvailableContext.AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    int RemoteActionCompatParcelizer;
    onRequestPermissionsResult read;
    int write;

    @Override // kotlin.peekAvailableContext
    public final boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean read(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    public onPanelClosed(Context context, int i) {
        this(i);
        this.AudioAttributesImplApi26Parcelizer = context;
        this.AudioAttributesCompatParcelizer = LayoutInflater.from(context);
    }

    private onPanelClosed(int i) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
    }

    @Override // kotlin.peekAvailableContext
    public final void read(Context context, onRequestPermissionsResult onrequestpermissionsresult) {
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            this.AudioAttributesImplApi26Parcelizer = context;
            if (this.AudioAttributesCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer = LayoutInflater.from(context);
            }
        }
        this.read = onrequestpermissionsresult;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.notifyDataSetChanged();
        }
    }

    public final registerForActivityResult RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = (ExpandedMenuView) this.AudioAttributesCompatParcelizer.inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_expanded_menu_layout, viewGroup, false);
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new RemoteActionCompatParcelizer();
            }
            this.AudioAttributesImplBaseParcelizer.setAdapter((ListAdapter) this.IconCompatParcelizer);
            this.AudioAttributesImplBaseParcelizer.setOnItemClickListener(this);
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final ListAdapter read() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new RemoteActionCompatParcelizer();
        }
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.peekAvailableContext
    public final void AudioAttributesCompatParcelizer(boolean z) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.notifyDataSetChanged();
        }
    }

    @Override // kotlin.peekAvailableContext
    public final void read(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean write(removeOnTrimMemoryListener removeontrimmemorylistener) {
        if (!removeontrimmemorylistener.hasVisibleItems()) {
            return false;
        }
        new onRetainCustomNonConfigurationInstance(removeontrimmemorylistener).read();
        peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        if (audioAttributesCompatParcelizer == null) {
            return true;
        }
        audioAttributesCompatParcelizer.read(removeontrimmemorylistener);
        return true;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onrequestpermissionsresult, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.read.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.getItem(i), this, 0);
    }

    private void RemoteActionCompatParcelizer(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.AudioAttributesImplBaseParcelizer;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    private void read(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.AudioAttributesImplBaseParcelizer.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // kotlin.peekAvailableContext
    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.peekAvailableContext
    public final Parcelable AudioAttributesImplApi26Parcelizer() {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        RemoteActionCompatParcelizer(bundle);
        return bundle;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(Parcelable parcelable) {
        read((Bundle) parcelable);
    }

    class RemoteActionCompatParcelizer extends BaseAdapter {
        private int RemoteActionCompatParcelizer = -1;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public RemoteActionCompatParcelizer() {
            AudioAttributesCompatParcelizer();
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int size = onPanelClosed.this.read.MediaBrowserCompatCustomActionResultReceiver().size() - onPanelClosed.this.write;
            return this.RemoteActionCompatParcelizer < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final onRetainNonConfigurationInstance getItem(int i) {
            ArrayList<onRetainNonConfigurationInstance> arrayListMediaBrowserCompatCustomActionResultReceiver = onPanelClosed.this.read.MediaBrowserCompatCustomActionResultReceiver();
            int i2 = i + onPanelClosed.this.write;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayListMediaBrowserCompatCustomActionResultReceiver.get(i2);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = onPanelClosed.this.AudioAttributesCompatParcelizer.inflate(onPanelClosed.this.RemoteActionCompatParcelizer, viewGroup, false);
            }
            ((registerForActivityResult.AudioAttributesCompatParcelizer) view).AudioAttributesCompatParcelizer(getItem(i));
            return view;
        }

        private void AudioAttributesCompatParcelizer() {
            onRetainNonConfigurationInstance onretainnonconfigurationinstanceMediaBrowserCompatItemReceiver = onPanelClosed.this.read.MediaBrowserCompatItemReceiver();
            if (onretainnonconfigurationinstanceMediaBrowserCompatItemReceiver != null) {
                ArrayList<onRetainNonConfigurationInstance> arrayListMediaBrowserCompatCustomActionResultReceiver = onPanelClosed.this.read.MediaBrowserCompatCustomActionResultReceiver();
                int size = arrayListMediaBrowserCompatCustomActionResultReceiver.size();
                for (int i = 0; i < size; i++) {
                    if (arrayListMediaBrowserCompatCustomActionResultReceiver.get(i) == onretainnonconfigurationinstanceMediaBrowserCompatItemReceiver) {
                        this.RemoteActionCompatParcelizer = i;
                        return;
                    }
                }
            }
            this.RemoteActionCompatParcelizer = -1;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            AudioAttributesCompatParcelizer();
            super.notifyDataSetChanged();
        }
    }
}
