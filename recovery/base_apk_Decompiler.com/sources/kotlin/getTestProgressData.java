package kotlin;

import android.app.Application;
import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* JADX INFO: loaded from: classes4.dex */
public final class getTestProgressData implements getSubmittedOn<Application> {
    private final ApplicationContextModule write;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return RemoteActionCompatParcelizer(this.write);
    }

    public static Application RemoteActionCompatParcelizer(ApplicationContextModule applicationContextModule) {
        return (Application) setPossibleScore.write(applicationContextModule.IconCompatParcelizer());
    }
}
