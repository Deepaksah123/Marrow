package kotlin;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdadrmKeysRestored3comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher implements DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2 {
    private final View RemoteActionCompatParcelizer;
    private final findNameForMutator read;
    private final Window write;

    public lambdadrmKeysRestored3comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher(View view, Window window) {
        toMagicModuleMetaRepoModel.write(view, "");
        this.RemoteActionCompatParcelizer = view;
        this.write = window;
        this.read = window != null ? _IsXOfY.IconCompatParcelizer(window, view) : null;
    }

    @Override // kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2
    public final void AudioAttributesCompatParcelizer(long j, boolean z, getAnswerMap<? super switchToNext, switchToNext> getanswermap) {
        findNameForMutator findnameformutator;
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        write(z);
        Window window = this.write;
        if (window == null) {
            return;
        }
        if (z && ((findnameformutator = this.read) == null || !findnameformutator.read())) {
            j = getanswermap.invoke(switchToNext.write(j)).getIconCompatParcelizer();
        }
        window.setStatusBarColor(RequestPayload.IconCompatParcelizer(j));
    }

    @Override // kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2
    public final void AudioAttributesCompatParcelizer(long j, boolean z, boolean z2, getAnswerMap<? super switchToNext, switchToNext> getanswermap) {
        findNameForMutator findnameformutator;
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        RemoteActionCompatParcelizer(z);
        read(true);
        Window window = this.write;
        if (window == null) {
            return;
        }
        if (z && ((findnameformutator = this.read) == null || !findnameformutator.IconCompatParcelizer())) {
            j = getanswermap.invoke(switchToNext.write(j)).getIconCompatParcelizer();
        }
        window.setNavigationBarColor(RequestPayload.IconCompatParcelizer(j));
    }

    @Override // kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2
    public final void IconCompatParcelizer() {
        findNameForMutator findnameformutator = this.read;
        if (findnameformutator == null) {
            return;
        }
        findnameformutator.IconCompatParcelizer(2);
    }

    @Override // kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2
    public final void read() {
        findNameForMutator findnameformutator = this.read;
        if (findnameformutator != null) {
            findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver());
        }
    }

    private void write(boolean z) {
        findNameForMutator findnameformutator = this.read;
        if (findnameformutator == null) {
            return;
        }
        findnameformutator.IconCompatParcelizer(z);
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        findNameForMutator findnameformutator = this.read;
        if (findnameformutator == null) {
            return;
        }
        findnameformutator.AudioAttributesCompatParcelizer(z);
    }

    private void read(boolean z) {
        Window window = this.write;
        if (window == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(z);
    }
}
