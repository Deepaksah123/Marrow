package kotlin;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.ResponseError;
import com.marrow.services.NetworkAvailableJobService;
import com.marrow.ui.activities.base.BaseActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class hasSelectionOverride extends Fragment implements View.OnClickListener {
    private Handler AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private ConnectivityManager RemoteActionCompatParcelizer;
    public Dialog read;
    private Toast write;
    private isServiceSwitchCommand AudioAttributesImplApi26Parcelizer = new isServiceSwitchCommand() { // from class: o.hasSelectionOverride.5
        @Override // kotlin.isServiceSwitchCommand
        public final void RemoteActionCompatParcelizer(Context context) {
            boolean zWrite = getTrackName.write(context);
            hasSelectionOverride.this.RemoteActionCompatParcelizer(zWrite);
            if (zWrite) {
                return;
            }
            hasSelectionOverride.this.aF_();
        }

        @Override // kotlin.isServiceSwitchCommand, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    };
    private ConnectivityManager.NetworkCallback MediaBrowserCompatCustomActionResultReceiver = null;

    public void RemoteActionCompatParcelizer(boolean z) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public boolean onRemoveQueueItemAt() {
        return false;
    }

    protected handlePreambleAddressCode[] onSetPlaybackSpeed() {
        return null;
    }

    protected abstract int write();

    private void AudioAttributesImplBaseParcelizer() {
        final Context applicationContext = getContext().getApplicationContext();
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = new ConnectivityManager.NetworkCallback() { // from class: o.hasSelectionOverride.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
                    super.onAvailable(network);
                    hasSelectionOverride.this.RemoteActionCompatParcelizer(getTrackName.write(applicationContext));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
                    super.onLost(network);
                    hasSelectionOverride.this.RemoteActionCompatParcelizer(getTrackName.write(hasSelectionOverride.this.getContext()));
                }
            };
        }
        this.RemoteActionCompatParcelizer.registerDefaultNetworkCallback(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        ConnectivityManager.NetworkCallback networkCallback = this.MediaBrowserCompatCustomActionResultReceiver;
        if (networkCallback != null) {
            this.RemoteActionCompatParcelizer.unregisterNetworkCallback(networkCallback);
            this.MediaBrowserCompatCustomActionResultReceiver = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.AudioAttributesCompatParcelizer = new Handler();
        this.RemoteActionCompatParcelizer = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            return layoutInflater.inflate(write(), viewGroup, false);
        } finally {
            buildResolutionString.read(getClass(), "frames : layout inflation:", jCurrentTimeMillis);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void RemoteActionCompatParcelizer() {
        Dialog dialog = this.read;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.read.dismiss();
    }

    public final String a_(String str, String str2) {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString(str, str2) : str2;
    }

    public final boolean c_(String str) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(str, false);
        }
        return false;
    }

    public void IconCompatParcelizer(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        getProvider.getInstance(getContext()).registerReceiver(broadcastReceiver, intentFilter);
    }

    public void AudioAttributesCompatParcelizer(Intent intent) {
        getProvider.getInstance(getContext()).AudioAttributesCompatParcelizer(intent);
    }

    public void read(BroadcastReceiver broadcastReceiver) {
        getProvider.getInstance(getContext()).IconCompatParcelizer(broadcastReceiver);
    }

    public final int aE_() {
        return _isNaN.getColor(getContext(), R.color.light_watermark);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        handlePreambleAddressCode[] handlepreambleaddresscodeArrOnSetPlaybackSpeed = onSetPlaybackSpeed();
        if (handlepreambleaddresscodeArrOnSetPlaybackSpeed != null) {
            for (handlePreambleAddressCode handlepreambleaddresscode : handlepreambleaddresscodeArrOnSetPlaybackSpeed) {
                if (handlepreambleaddresscode != null) {
                    IconCompatParcelizer(handlepreambleaddresscode, handlepreambleaddresscode.AudioAttributesCompatParcelizer());
                }
            }
        }
        if (onRemoveQueueItemAt()) {
            AudioAttributesImplBaseParcelizer();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        handlePreambleAddressCode[] handlepreambleaddresscodeArrOnSetPlaybackSpeed = onSetPlaybackSpeed();
        if (handlepreambleaddresscodeArrOnSetPlaybackSpeed != null) {
            for (handlePreambleAddressCode handlepreambleaddresscode : handlepreambleaddresscodeArrOnSetPlaybackSpeed) {
                if (handlepreambleaddresscode != null) {
                    read(handlepreambleaddresscode);
                }
            }
        }
        if (onRemoveQueueItemAt()) {
            MediaBrowserCompatCustomActionResultReceiver();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        RemoteActionCompatParcelizer();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.IconCompatParcelizer = false;
    }

    protected final void IconCompatParcelizer(int i) {
        Toast toast = this.write;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(getContext(), i, 1);
        this.write = toastMakeText;
        toastMakeText.show();
    }

    private void RemoteActionCompatParcelizer(String str) {
        Toast toast = this.write;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(getContext(), str, 1);
        this.write = toastMakeText;
        toastMakeText.show();
    }

    public void write(ResponseError responseError) {
        Object[] objArr = {responseError, getContext()};
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        RemoteActionCompatParcelizer((String) updateShuffleButton.IconCompatParcelizer(MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), -953939975, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 953939977, objArr, iIconCompatParcelizer));
    }

    public void aj_() {
        RemoteActionCompatParcelizer();
        selectTextTrack selecttexttrack = new selectTextTrack(getContext());
        selecttexttrack.RemoteActionCompatParcelizer();
        this.read = selecttexttrack;
        selecttexttrack.show();
    }

    public BaseActivity aD_() {
        return (BaseActivity) super.getActivity();
    }

    protected final void aF_() {
        NetworkAvailableJobService.IconCompatParcelizer(getContext());
    }

    public final void aH_() {
        aD_().setTitle(R.string.plan_subscribe);
    }

    public final void d_(String str) {
        aD_().setTitle(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.IconCompatParcelizer = true;
        super.onSaveInstanceState(bundle);
    }

    public void AudioAttributesCompatParcelizer(String str) {
        Toast.makeText(getContext(), str, 0).show();
    }

    public void MediaBrowserCompatMediaItem() {
        IconCompatParcelizer(R.string.app_error_no_internet);
    }

    public void au_() {
        aD_().onBackPressed();
    }

    public boolean av_() {
        return super.isAdded();
    }

    public boolean aw_() {
        return super.isDetached();
    }

    public final String f_(int i) {
        return getContext().getString(i);
    }

    public final String RemoteActionCompatParcelizer(Object... objArr) {
        return getContext().getString(R.string.text_kyc_disclaimer, objArr);
    }

    protected final boolean aG_() {
        return ((TrainingApplication) getContext().getApplicationContext()).RatingCompat();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesImplApi26Parcelizer = null;
    }
}
