package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class skipOutputBuffer extends Fragment implements SubjectStat {
    private ContextWrapper IconCompatParcelizer;
    private volatile setTestName RemoteActionCompatParcelizer;
    private boolean AudioAttributesCompatParcelizer = false;
    private final Object read = new Object();
    private boolean write = false;

    skipOutputBuffer() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        read();
        write();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.IconCompatParcelizer;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        read();
        write();
    }

    private void read() {
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
        read();
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

    private setTestName AudioAttributesCompatParcelizer() {
        return new setTestName(this);
    }

    private setTestName RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    private void write() {
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
