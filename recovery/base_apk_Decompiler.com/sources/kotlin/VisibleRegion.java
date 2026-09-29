package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VisibleRegion extends Fragment implements SubjectStat {
    private volatile setTestName IconCompatParcelizer;
    private ContextWrapper read;
    private boolean AudioAttributesCompatParcelizer = false;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean write = false;

    VisibleRegion() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.read;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.read == null) {
            this.read = setTestName.read(super.getContext(), this);
            this.AudioAttributesCompatParcelizer = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.AudioAttributesCompatParcelizer) {
            return null;
        }
        AudioAttributesCompatParcelizer();
        return this.read;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(setTestName.IconCompatParcelizer(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        return read().af_();
    }

    private setTestName write() {
        return new setTestName(this);
    }

    private setTestName read() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = write();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer() {
        if (this.write) {
            return;
        }
        this.write = true;
    }

    @Override // androidx.fragment.app.Fragment, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return getNextPercentile.write(this, super.getDefaultViewModelProviderFactory());
    }
}
