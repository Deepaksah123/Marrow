package com.marrow.ui.fragments.base;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import kotlin.BaseUrl;
import kotlin.buildResolutionString;
import kotlin.getChannel;
import kotlin.getExtendedEsFrChar;
import kotlin.getNextEventTime;
import kotlin.getProvider;
import kotlin.getSpecialNorthAmericanChar;
import kotlin.getTrackName;
import kotlin.hasSelectionOverride;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.selectTextTrack;
import kotlin.setSdkPayload;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDaggerFragment<P extends getExtendedEsFrChar> extends hasSelectionOverride implements View.OnClickListener, getSpecialNorthAmericanChar, getChannel, getNextEventTime {
    private FragmentManager IconCompatParcelizer;

    @setSdkPayload
    public P mPresenter;

    @Override // kotlin.hasSelectionOverride
    public abstract int write();

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.IconCompatParcelizer = getChildFragmentManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        buildResolutionString.read(getClass(), "frames : dagger:", System.currentTimeMillis());
        super.onAttach(activity);
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // kotlin.hasSelectionOverride, kotlin.getExtendedPtDeChar
    public void RemoteActionCompatParcelizer() {
        if (this.read == null || !this.read.isShowing()) {
            return;
        }
        this.read.dismiss();
    }

    @Override // kotlin.hasSelectionOverride
    public final void IconCompatParcelizer(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        getProvider.getInstance(getContext()).registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override // kotlin.hasSelectionOverride, kotlin.getNextEventTime
    public final void AudioAttributesCompatParcelizer(Intent intent) {
        getProvider.getInstance(getContext()).AudioAttributesCompatParcelizer(intent);
    }

    @Override // kotlin.hasSelectionOverride
    public final void read(BroadcastReceiver broadcastReceiver) {
        getProvider.getInstance(getContext()).IconCompatParcelizer(broadcastReceiver);
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        P p = this.mPresenter;
        if (p != null) {
            p.AudioAttributesImplApi21Parcelizer();
        }
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onStop() {
        P p = this.mPresenter;
        if (p != null) {
            p.MediaBrowserCompatSearchResultReceiver();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onDestroy() {
        P p = this.mPresenter;
        if (p != null) {
            p.AudioAttributesImplApi26Parcelizer();
        }
        super.onDestroy();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        P p = this.mPresenter;
        if (p != null) {
            p.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        BaseUrl.IconCompatParcelizer(this.mPresenter.AudioAttributesImplBaseParcelizer(), bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.mPresenter.write(BaseUrl.write(bundle));
        }
    }

    @Override // kotlin.hasSelectionOverride, kotlin.getExtendedPtDeChar
    public void aj_() {
        RemoteActionCompatParcelizer();
        selectTextTrack selecttexttrack = new selectTextTrack(getContext());
        selecttexttrack.RemoteActionCompatParcelizer();
        this.read = selecttexttrack;
        this.read.show();
    }

    @Override // kotlin.hasSelectionOverride
    public boolean av_() {
        return super.isAdded();
    }

    @Override // kotlin.hasSelectionOverride, kotlin.getExtendedPtDeChar
    public void AudioAttributesCompatParcelizer(String str) {
        Toast.makeText(getContext(), str, 0).show();
    }

    @Override // kotlin.getExtendedPtDeChar
    public void read(String str) {
        Toast.makeText(getContext(), str, 1).show();
    }

    @Override // kotlin.hasSelectionOverride
    public void au_() {
        aD_().onBackPressed();
    }

    @Override // kotlin.getChannel
    public final boolean aC_() {
        return getTrackName.write(getContext());
    }

    @Override // kotlin.hasSelectionOverride
    public final boolean aw_() {
        return super.isDetached();
    }

    @Override // kotlin.getNextEventTime
    public final void RemoteActionCompatParcelizer(String str, String str2) {
        AudioAttributesCompatParcelizer(isSpecialNorthAmericanChar.IconCompatParcelizer(str, str2));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            BaseUrl.write(intent.getExtras());
        }
        super.onActivityResult(i, i2, intent);
    }
}
