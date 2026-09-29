package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import kotlin.VisibilityChecker;
import kotlin.getSaveProfileModel;
import o.getSaveProfileModel.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
abstract class setAllowMultipleAdaptiveSelections<P extends getSaveProfileModel.IconCompatParcelizer> extends isAccepted<P> implements SubjectStat {
    private volatile setTestName MediaBrowserCompatMediaItem;
    private ContextWrapper write;
    private boolean RatingCompat = false;
    private final Object MediaMetadataCompat = new Object();
    private boolean MediaDescriptionCompat = false;

    setAllowMultipleAdaptiveSelections() {
    }

    @Override // com.marrow.ui.fragments.base.BaseDaggerFragment, kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        MediaBrowserCompatCustomActionResultReceiver();
        RatingCompat();
    }

    @Override // com.marrow.ui.fragments.base.BaseDaggerFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.write;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        MediaBrowserCompatCustomActionResultReceiver();
        RatingCompat();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.write == null) {
            this.write = setTestName.read(super.getContext(), this);
            this.RatingCompat = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.RatingCompat) {
            return null;
        }
        MediaBrowserCompatCustomActionResultReceiver();
        return this.write;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(setTestName.IconCompatParcelizer(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        return MediaBrowserCompatItemReceiver().af_();
    }

    private setTestName AudioAttributesImplBaseParcelizer() {
        return new setTestName(this);
    }

    private setTestName MediaBrowserCompatItemReceiver() {
        if (this.MediaBrowserCompatMediaItem == null) {
            synchronized (this.MediaMetadataCompat) {
                if (this.MediaBrowserCompatMediaItem == null) {
                    this.MediaBrowserCompatMediaItem = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.MediaBrowserCompatMediaItem;
    }

    private void RatingCompat() {
        if (this.MediaDescriptionCompat) {
            return;
        }
        this.MediaDescriptionCompat = true;
        ((setDetailedReason) af_()).RemoteActionCompatParcelizer((setViewportSizeToPhysicalDisplaySize) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
    }

    @Override // androidx.fragment.app.Fragment, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return getNextPercentile.write(this, super.getDefaultViewModelProviderFactory());
    }
}
