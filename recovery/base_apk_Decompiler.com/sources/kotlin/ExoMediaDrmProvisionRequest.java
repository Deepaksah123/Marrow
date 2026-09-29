package kotlin;

import kotlin.ExoMediaDrm;

/* JADX INFO: loaded from: classes5.dex */
abstract class ExoMediaDrmProvisionRequest {

    public static abstract class IconCompatParcelizer {
        abstract IconCompatParcelizer AudioAttributesCompatParcelizer(DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReference);

        abstract IconCompatParcelizer AudioAttributesCompatParcelizer(isMediaDrmStateException<?, byte[]> ismediadrmstateexception);

        public abstract ExoMediaDrmProvisionRequest IconCompatParcelizer();

        public abstract IconCompatParcelizer RemoteActionCompatParcelizer(String str);

        abstract IconCompatParcelizer RemoteActionCompatParcelizer(isNotProvisionedException<?> isnotprovisionedexception);

        public abstract IconCompatParcelizer read(ExoMediaDrmProvider exoMediaDrmProvider);
    }

    public abstract DrmSessionManagerDrmSessionReference AudioAttributesCompatParcelizer();

    public abstract String IconCompatParcelizer();

    public abstract ExoMediaDrmProvider RemoteActionCompatParcelizer();

    abstract isMediaDrmStateException<?, byte[]> read();

    abstract isNotProvisionedException<?> write();

    ExoMediaDrmProvisionRequest() {
    }

    public final byte[] MediaBrowserCompatCustomActionResultReceiver() {
        return read().AudioAttributesCompatParcelizer(write().write());
    }

    public static IconCompatParcelizer AudioAttributesImplApi21Parcelizer() {
        return new ExoMediaDrm.read();
    }
}
