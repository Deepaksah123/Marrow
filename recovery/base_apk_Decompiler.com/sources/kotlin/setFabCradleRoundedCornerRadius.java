package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setFabCradleRoundedCornerRadius extends Fragment implements SubjectStat {
    private ContextWrapper IconCompatParcelizer;
    private volatile setTestName write;
    private boolean AudioAttributesCompatParcelizer = false;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean read = false;

    setFabCradleRoundedCornerRadius() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        AudioAttributesCompatParcelizer();
        read();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.IconCompatParcelizer;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        AudioAttributesCompatParcelizer();
        read();
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = setTestName.read(super.getContext(), this);
            this.AudioAttributesCompatParcelizer = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.AudioAttributesCompatParcelizer) {
            return null;
        }
        AudioAttributesCompatParcelizer();
        return this.IconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(setTestName.IconCompatParcelizer(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        return RemoteActionCompatParcelizer().af_();
    }

    private setTestName write() {
        return new setTestName(this);
    }

    private setTestName RemoteActionCompatParcelizer() {
        if (this.write == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.write == null) {
                    this.write = write();
                }
            }
        }
        return this.write;
    }

    private void read() {
        if (this.read) {
            return;
        }
        this.read = true;
    }

    @Override // androidx.fragment.app.Fragment, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return getNextPercentile.write(this, super.getDefaultViewModelProviderFactory());
    }
}
