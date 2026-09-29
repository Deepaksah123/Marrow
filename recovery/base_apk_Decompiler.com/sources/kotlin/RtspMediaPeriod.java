package kotlin;

import android.app.NotificationManager;
import android.app.Service;
import com.marrow.di.service.ServiceProviderModule;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMediaPeriod implements getSubmittedOn<NotificationManager> {
    private final getTestId<Service> RemoteActionCompatParcelizer;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public NotificationManager get() {
        throw null;
    }

    public static NotificationManager read(Service service) {
        return (NotificationManager) setPossibleScore.write(ServiceProviderModule.INSTANCE.read(service));
    }
}
