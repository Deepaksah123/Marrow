package kotlin;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.findAndAddPrimarySerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class matchesTyped {
    public static int AudioAttributesCompatParcelizer(Throwable th, int i) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && IconCompatParcelizer.write(th)) {
            return IconCompatParcelizer.read(th);
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && AudioAttributesCompatParcelizer.read(th)) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if ((th instanceof NotProvisionedException) || IconCompatParcelizer(th)) {
            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        if (th instanceof DeniedByServerException) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (th instanceof UnwrappingBeanPropertyWriter1) {
            return PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
        }
        if (th instanceof findAndAddPrimarySerializer.write) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        if (th instanceof C0215typeSerializer) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i == 1) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i == 2) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 3) {
            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        throw new IllegalArgumentException();
    }

    public static boolean IconCompatParcelizer(Throwable th) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean AudioAttributesCompatParcelizer(Throwable th) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    static final class IconCompatParcelizer {
        public static boolean write(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int read(Throwable th) {
            return LaissezFaireSubTypeValidator.IconCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public static boolean read(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }
}
