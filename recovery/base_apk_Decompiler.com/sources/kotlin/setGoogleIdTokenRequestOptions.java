package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setGoogleIdTokenRequestOptions extends Fragment implements SubjectStat {
    private volatile setTestName AudioAttributesCompatParcelizer;
    private ContextWrapper RemoteActionCompatParcelizer;
    private boolean write = false;
    private final Object read = new Object();
    private boolean IconCompatParcelizer = false;

    setGoogleIdTokenRequestOptions() {
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
        ContextWrapper contextWrapper = this.RemoteActionCompatParcelizer;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        write();
        read();
    }

    private void write() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = setTestName.read(super.getContext(), this);
            this.write = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.write) {
            return null;
        }
        write();
        return this.RemoteActionCompatParcelizer;
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
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
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
