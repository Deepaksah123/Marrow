package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes5.dex */
public abstract class setFontColor extends argCount implements SubjectStat {
    private ContextWrapper AudioAttributesCompatParcelizer;
    private volatile setTestName write;
    private boolean read = false;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean IconCompatParcelizer = false;

    setFontColor() {
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.AudioAttributesCompatParcelizer;
        getSubjScore.IconCompatParcelizer(contextWrapper == null || setTestName.read(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer();
    }

    private void RemoteActionCompatParcelizer() {
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
        RemoteActionCompatParcelizer();
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(setTestName.IconCompatParcelizer(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        return read().af_();
    }

    private setTestName write() {
        return new setTestName(this);
    }

    private setTestName read() {
        if (this.write == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.write == null) {
                    this.write = write();
                }
            }
        }
        return this.write;
    }

    private void AudioAttributesCompatParcelizer() {
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
