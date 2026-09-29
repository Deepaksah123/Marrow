package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.marrow.R;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzef extends Fragment implements SubjectStat {
    private boolean AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final Object RemoteActionCompatParcelizer;
    private volatile setTestName read;
    private ContextWrapper write;

    zzef() {
        this.AudioAttributesCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = new Object();
        this.IconCompatParcelizer = false;
    }

    zzef(byte b) {
        super(R.layout.fragment_qbank_tracker);
        this.AudioAttributesCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = new Object();
        this.IconCompatParcelizer = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        AudioAttributesCompatParcelizer();
        write();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.write;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        AudioAttributesCompatParcelizer();
        write();
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.write == null) {
            this.write = setTestName.read(super.getContext(), this);
            this.AudioAttributesCompatParcelizer = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.AudioAttributesCompatParcelizer) {
            return null;
        }
        AudioAttributesCompatParcelizer();
        return this.write;
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

    private setTestName read() {
        return new setTestName(this);
    }

    private setTestName RemoteActionCompatParcelizer() {
        if (this.read == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.read == null) {
                    this.read = read();
                }
            }
        }
        return this.read;
    }

    private void write() {
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
