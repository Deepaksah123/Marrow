package kotlin;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.VisibilityChecker;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
public class _renameWithWrappers implements anyExplicitsWithoutIgnoral, PieChart, TypeResolutionContext {
    private final hasMixIns AudioAttributesImplApi26Parcelizer;
    private final Runnable IconCompatParcelizer;
    private VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private final Fragment write;
    private getSetterUnchecked AudioAttributesCompatParcelizer = null;
    private setRenderer read = null;

    public _renameWithWrappers(Fragment fragment, hasMixIns hasmixins, Runnable runnable) {
        this.write = fragment;
        this.AudioAttributesImplApi26Parcelizer = hasmixins;
        this.IconCompatParcelizer = runnable;
    }

    @Override // kotlin.TypeResolutionContext
    public hasMixIns getViewModelStore() {
        RemoteActionCompatParcelizer();
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new getSetterUnchecked(this);
            setRenderer setrendererAudioAttributesCompatParcelizer = setRenderer.AudioAttributesCompatParcelizer(this);
            this.read = setrendererAudioAttributesCompatParcelizer;
            setrendererAudioAttributesCompatParcelizer.write();
            this.IconCompatParcelizer.run();
        }
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer != null;
    }

    @Override // kotlin.hasGetter
    public anyIgnorals getLifecycle() {
        RemoteActionCompatParcelizer();
        return this.AudioAttributesCompatParcelizer;
    }

    final void write(anyIgnorals.write writeVar) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(writeVar);
    }

    public final void RemoteActionCompatParcelizer(anyIgnorals.read readVar) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(readVar);
    }

    @Override // kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        Application application;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = this.write.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.write.mDefaultFactory)) {
            this.RemoteActionCompatParcelizer = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.RemoteActionCompatParcelizer == null) {
            Context applicationContext = this.write.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.write;
            this.RemoteActionCompatParcelizer = new next(application, fragment, fragment.getArguments());
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.anyExplicitsWithoutIgnoral
    public withFieldVisibility getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.write.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        _defaultOrOverride _defaultoroverride = new _defaultOrOverride();
        if (application != null) {
            _defaultoroverride.AudioAttributesCompatParcelizer(VisibilityChecker.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, application);
        }
        _defaultoroverride.AudioAttributesCompatParcelizer(withoutIgnored.read, this.write);
        _defaultoroverride.AudioAttributesCompatParcelizer(withoutIgnored.AudioAttributesCompatParcelizer, this);
        if (this.write.getArguments() != null) {
            _defaultoroverride.AudioAttributesCompatParcelizer(withoutIgnored.write, this.write.getArguments());
        }
        return _defaultoroverride;
    }

    @Override // kotlin.PieChart
    public setOnChartValueSelectedListener getSavedStateRegistry() {
        RemoteActionCompatParcelizer();
        return this.read.getRead();
    }

    public final void AudioAttributesCompatParcelizer(Bundle bundle) {
        this.read.AudioAttributesCompatParcelizer(bundle);
    }

    final void read(Bundle bundle) {
        this.read.RemoteActionCompatParcelizer(bundle);
    }
}
