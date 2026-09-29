package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes.dex */
public abstract class setOnInputFrameProcessedListener extends Fragment implements SubjectStat {
    private ContextWrapper AudioAttributesCompatParcelizer;
    private volatile setTestName write;
    private boolean read = false;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean IconCompatParcelizer = false;

    setOnInputFrameProcessedListener() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        write();
        read();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.AudioAttributesCompatParcelizer;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        write();
        read();
    }

    private void write() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = setTestName.read(super.getContext(), this);
            this.read = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.read) {
            return null;
        }
        write();
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(setTestName.IconCompatParcelizer(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        return AudioAttributesCompatParcelizer().af_();
    }

    private setTestName RemoteActionCompatParcelizer() {
        return new setTestName(this);
    }

    private setTestName AudioAttributesCompatParcelizer() {
        if (this.write == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.write == null) {
                    this.write = RemoteActionCompatParcelizer();
                }
            }
        }
        return this.write;
    }

    private void read() {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
    }

    @Override // androidx.fragment.app.Fragment, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return getNextPercentile.write(this, super.getDefaultViewModelProviderFactory());
    }
}
