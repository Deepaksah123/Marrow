package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setUiRequired extends Fragment implements SubjectStat {
    private volatile setTestName AudioAttributesCompatParcelizer;
    private ContextWrapper write;
    private boolean read = false;
    private final Object IconCompatParcelizer = new Object();
    private boolean RemoteActionCompatParcelizer = false;

    setUiRequired() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        read();
        RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.write;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        read();
        RemoteActionCompatParcelizer();
    }

    private void read() {
        if (this.write == null) {
            this.write = setTestName.read(super.getContext(), this);
            this.read = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.read) {
            return null;
        }
        read();
        return this.write;
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

    private setTestName AudioAttributesCompatParcelizer() {
        return new setTestName(this);
    }

    private setTestName write() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // androidx.fragment.app.Fragment, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return getNextPercentile.write(this, super.getDefaultViewModelProviderFactory());
    }
}
