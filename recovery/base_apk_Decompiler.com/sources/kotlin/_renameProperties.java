package kotlin;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
public class _renameProperties extends Fragment {
    private CharSequence AudioAttributesCompatParcelizer;
    private View AudioAttributesImplApi21Parcelizer;
    private View AudioAttributesImplBaseParcelizer;
    private ListAdapter IconCompatParcelizer;
    private boolean MediaBrowserCompatItemReceiver;
    private TextView MediaBrowserCompatSearchResultReceiver;
    ListView RemoteActionCompatParcelizer;
    private View write;
    private final Handler read = new Handler();
    private final Runnable AudioAttributesImplApi26Parcelizer = new Runnable() { // from class: o._renameProperties.3
        @Override // java.lang.Runnable
        public final void run() {
            _renameProperties.this.RemoteActionCompatParcelizer.focusableViewAvailable(_renameProperties.this.RemoteActionCompatParcelizer);
        }
    };
    private final AdapterView.OnItemClickListener MediaBrowserCompatCustomActionResultReceiver = new AdapterView.OnItemClickListener() { // from class: o._renameProperties.1
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    };

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.read.removeCallbacks(this.AudioAttributesImplApi26Parcelizer);
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompatItemReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.AudioAttributesImplBaseParcelizer = null;
        this.write = null;
        this.MediaBrowserCompatSearchResultReceiver = null;
        super.onDestroyView();
    }

    private void AudioAttributesCompatParcelizer(ListAdapter listAdapter) {
        boolean z = this.IconCompatParcelizer != null;
        this.IconCompatParcelizer = listAdapter;
        ListView listView = this.RemoteActionCompatParcelizer;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.MediaBrowserCompatItemReceiver || z) {
                return;
            }
            IconCompatParcelizer(true, requireView().getWindowToken() != null);
        }
    }

    private void IconCompatParcelizer(boolean z, boolean z2) {
        RemoteActionCompatParcelizer();
        View view = this.AudioAttributesImplBaseParcelizer;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.MediaBrowserCompatItemReceiver == z) {
            return;
        }
        this.MediaBrowserCompatItemReceiver = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.AudioAttributesImplApi21Parcelizer.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.AudioAttributesImplApi21Parcelizer.clearAnimation();
            }
            this.AudioAttributesImplBaseParcelizer.setVisibility(8);
            this.AudioAttributesImplApi21Parcelizer.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.AudioAttributesImplApi21Parcelizer.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.AudioAttributesImplApi21Parcelizer.clearAnimation();
        }
        this.AudioAttributesImplBaseParcelizer.setVisibility(0);
        this.AudioAttributesImplApi21Parcelizer.setVisibility(8);
    }

    private void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.RemoteActionCompatParcelizer = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.MediaBrowserCompatSearchResultReceiver = textView;
            if (textView == null) {
                this.write = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.AudioAttributesImplBaseParcelizer = view.findViewById(16711682);
            this.AudioAttributesImplApi21Parcelizer = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            ListView listView = (ListView) viewFindViewById;
            this.RemoteActionCompatParcelizer = listView;
            View view2 = this.write;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.MediaBrowserCompatItemReceiver = true;
        this.RemoteActionCompatParcelizer.setOnItemClickListener(this.MediaBrowserCompatCustomActionResultReceiver);
        ListAdapter listAdapter = this.IconCompatParcelizer;
        if (listAdapter != null) {
            this.IconCompatParcelizer = null;
            AudioAttributesCompatParcelizer(listAdapter);
        } else if (this.AudioAttributesImplBaseParcelizer != null) {
            IconCompatParcelizer(false, false);
        }
        this.read.post(this.AudioAttributesImplApi26Parcelizer);
    }
}
