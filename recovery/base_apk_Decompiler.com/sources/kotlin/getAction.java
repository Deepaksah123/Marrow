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
public abstract class getAction extends Fragment implements SubjectStat {
    private final Object AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private ContextWrapper read;
    private volatile setTestName write;

    getAction() {
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer = new Object();
        this.IconCompatParcelizer = false;
    }

    getAction(byte b) {
        super(R.layout.fragment_video_notes);
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer = new Object();
        this.IconCompatParcelizer = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        RemoteActionCompatParcelizer();
        write();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.read;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        RemoteActionCompatParcelizer();
        write();
    }

    private void RemoteActionCompatParcelizer() {
        if (this.read == null) {
            this.read = setTestName.read(super.getContext(), this);
            this.RemoteActionCompatParcelizer = getImageUrl.read(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.RemoteActionCompatParcelizer) {
            return null;
        }
        RemoteActionCompatParcelizer();
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

    private setTestName AudioAttributesCompatParcelizer() {
        return new setTestName(this);
    }

    private setTestName read() {
        if (this.write == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.write == null) {
                    this.write = AudioAttributesCompatParcelizer();
                }
            }
        }
        return this.write;
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
