package kotlin;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@getPlanOldPrice
public class addLaUrlAttributeIfMissing implements FrameworkMediaDrm {
    private static volatile FrameworkCryptoConfig RemoteActionCompatParcelizer;
    private final BinarySearchSeeker AudioAttributesCompatParcelizer;
    private final OfflineLicenseHelperExternalSyntheticLambda1 IconCompatParcelizer;
    private final newWidevineInstance read;
    private final BinarySearchSeeker write;

    @setSdkPayload
    addLaUrlAttributeIfMissing(BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2, newWidevineInstance newwidevineinstance, OfflineLicenseHelperExternalSyntheticLambda1 offlineLicenseHelperExternalSyntheticLambda1, canDispatchQueueEdit candispatchqueueedit) {
        this.write = binarySearchSeeker;
        this.AudioAttributesCompatParcelizer = binarySearchSeeker2;
        this.read = newwidevineinstance;
        this.IconCompatParcelizer = offlineLicenseHelperExternalSyntheticLambda1;
        candispatchqueueedit.write();
    }

    public static void AudioAttributesCompatParcelizer(Context context) {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (addLaUrlAttributeIfMissing.class) {
                if (RemoteActionCompatParcelizer == null) {
                    RemoteActionCompatParcelizer = ExoMediaDrmKeyStatus.RemoteActionCompatParcelizer().write(context).write();
                }
            }
        }
    }

    public static addLaUrlAttributeIfMissing AudioAttributesCompatParcelizer() {
        FrameworkCryptoConfig frameworkCryptoConfig = RemoteActionCompatParcelizer;
        if (frameworkCryptoConfig == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return frameworkCryptoConfig.AudioAttributesCompatParcelizer();
    }

    public final DrmUtilApi18 AudioAttributesCompatParcelizer(getLicenseServerUrl getlicenseserverurl) {
        return new ExoMediaDrmOnKeyStatusChangeListener(RemoteActionCompatParcelizer(getlicenseserverurl), ExoMediaDrmProvider.read().write(getlicenseserverurl.read()).RemoteActionCompatParcelizer(getlicenseserverurl.AudioAttributesCompatParcelizer()).RemoteActionCompatParcelizer(), this);
    }

    private static Set<DrmSessionManagerDrmSessionReference> RemoteActionCompatParcelizer(getLicenseServerUrl getlicenseserverurl) {
        if (getlicenseserverurl instanceof getRequestType) {
            return Collections.unmodifiableSet(((getRequestType) getlicenseserverurl).write());
        }
        return Collections.singleton(DrmSessionManagerDrmSessionReference.IconCompatParcelizer("proto"));
    }

    public final OfflineLicenseHelperExternalSyntheticLambda1 IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.FrameworkMediaDrm
    public final void read(ExoMediaDrmProvisionRequest exoMediaDrmProvisionRequest, DummyExoMediaDrm dummyExoMediaDrm) {
        this.read.read(exoMediaDrmProvisionRequest.RemoteActionCompatParcelizer().IconCompatParcelizer(exoMediaDrmProvisionRequest.write().RemoteActionCompatParcelizer()), IconCompatParcelizer(exoMediaDrmProvisionRequest), dummyExoMediaDrm);
    }

    private ExoMediaDrmOnEventListener IconCompatParcelizer(ExoMediaDrmProvisionRequest exoMediaDrmProvisionRequest) {
        return ExoMediaDrmOnEventListener.AudioAttributesImplApi21Parcelizer().write(this.write.IconCompatParcelizer()).RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer()).read(exoMediaDrmProvisionRequest.IconCompatParcelizer()).write(new ExoMediaDrmKeyRequest(exoMediaDrmProvisionRequest.AudioAttributesCompatParcelizer(), exoMediaDrmProvisionRequest.MediaBrowserCompatCustomActionResultReceiver())).write(exoMediaDrmProvisionRequest.write().read()).AudioAttributesCompatParcelizer();
    }
}
