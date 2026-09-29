package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class drawFrame extends Fragment implements SubjectStat {
    private ContextWrapper read;
    private volatile setTestName write;
    private boolean RemoteActionCompatParcelizer = false;
    private final Object IconCompatParcelizer = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        RemoteActionCompatParcelizer();
        read();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.read;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        RemoteActionCompatParcelizer();
        read();
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
        return AudioAttributesCompatParcelizer().af_();
    }

    private setTestName write() {
        return new setTestName(this);
    }

    private setTestName AudioAttributesCompatParcelizer() {
        if (this.write == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.write == null) {
                    this.write = write();
                }
            }
        }
        return this.write;
    }

    private void read() {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer = true;
        ((lambdainit0comgoogleandroidexoplayer2videosphericalSceneRenderer) af_()).read((CourseSwitchFragment) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
    }

    @Override // androidx.fragment.app.Fragment, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return getNextPercentile.write(this, super.getDefaultViewModelProviderFactory());
    }
}
