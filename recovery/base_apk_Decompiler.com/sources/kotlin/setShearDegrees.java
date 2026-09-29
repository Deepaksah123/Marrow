package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.marrow.kt.base.BaseDaggerFragment;
import kotlin.VisibilityChecker;
import kotlin.getExtendedEsFrChar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setShearDegrees<P extends getExtendedEsFrChar> extends BaseDaggerFragment<P> implements SubjectStat {
    private volatile setTestName IconCompatParcelizer;
    private ContextWrapper RemoteActionCompatParcelizer;
    private boolean AudioAttributesCompatParcelizer = false;
    private final Object write = new Object();
    private boolean MediaBrowserCompatItemReceiver = false;

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        MediaBrowserCompatItemReceiver();
        RatingCompat();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.RemoteActionCompatParcelizer;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        MediaBrowserCompatItemReceiver();
        RatingCompat();
    }

    private void MediaBrowserCompatItemReceiver() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = setTestName.read(super.getContext(), this);
            this.AudioAttributesCompatParcelizer = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.AudioAttributesCompatParcelizer) {
            return null;
        }
        MediaBrowserCompatItemReceiver();
        return this.RemoteActionCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(setTestName.IconCompatParcelizer(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        return MediaBrowserCompatCustomActionResultReceiver().af_();
    }

    private setTestName AudioAttributesImplBaseParcelizer() {
        return new setTestName(this);
    }

    private setTestName MediaBrowserCompatCustomActionResultReceiver() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    private void RatingCompat() {
        if (this.MediaBrowserCompatItemReceiver) {
            return;
        }
        this.MediaBrowserCompatItemReceiver = true;
        ((ExoplayerCuesDecoder1) af_()).AudioAttributesCompatParcelizer((CueDecoder) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
    }

    @Override // androidx.fragment.app.Fragment, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return getNextPercentile.write(this, super.getDefaultViewModelProviderFactory());
    }
}
