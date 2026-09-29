package kotlin;

import android.app.NotificationManager;
import com.marrow2.ui.settings.kyc.upload.service.ImageUploadService;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationSourceOnLocationChangedListener {
    public static void IconCompatParcelizer(ImageUploadService imageUploadService, skipShortTermReferencePictureSets skipshorttermreferencepicturesets) {
        imageUploadService.kycUseCase = skipshorttermreferencepicturesets;
    }

    public static void RemoteActionCompatParcelizer(ImageUploadService imageUploadService, NotificationManager notificationManager) {
        imageUploadService.notificationManager = notificationManager;
    }
}
