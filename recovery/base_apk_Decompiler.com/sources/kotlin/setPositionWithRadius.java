package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setPositionWithRadius extends Fragment implements SubjectStat {
    private ContextWrapper RemoteActionCompatParcelizer;
    private volatile setTestName write;
    private boolean read = false;
    private final Object IconCompatParcelizer = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    setPositionWithRadius() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        read();
        AudioAttributesCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.RemoteActionCompatParcelizer;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        read();
        AudioAttributesCompatParcelizer();
    }

    private void read() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = setTestName.read(super.getContext(), this);
            this.read = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.read) {
            return null;
        }
        read();
        return this.RemoteActionCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(setTestName.IconCompatParcelizer(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        return write().af_();
    }

    private setTestName RemoteActionCompatParcelizer() {
        return new setTestName(this);
    }

    private setTestName write() {
        if (this.write == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.write == null) {
                    this.write = RemoteActionCompatParcelizer();
                }
            }
        }
        return this.write;
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer = true;
    }

    @Override // androidx.fragment.app.Fragment, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return getNextPercentile.write(this, super.getDefaultViewModelProviderFactory());
    }
}
