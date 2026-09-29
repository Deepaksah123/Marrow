package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setHdr10PlusInfoV29 extends Fragment implements SubjectStat {
    private ContextWrapper AudioAttributesCompatParcelizer;
    private volatile setTestName RemoteActionCompatParcelizer;
    private boolean write = false;
    private final Object read = new Object();
    private boolean IconCompatParcelizer = false;

    setHdr10PlusInfoV29() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        RemoteActionCompatParcelizer();
        read();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.AudioAttributesCompatParcelizer;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        RemoteActionCompatParcelizer();
        read();
    }

    private void RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = setTestName.read(super.getContext(), this);
            this.write = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.write) {
            return null;
        }
        RemoteActionCompatParcelizer();
        return this.AudioAttributesCompatParcelizer;
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
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
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
