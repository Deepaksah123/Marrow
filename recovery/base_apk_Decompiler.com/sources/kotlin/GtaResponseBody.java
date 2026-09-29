package kotlin;

import android.app.Application;
import android.app.Service;

/* JADX INFO: loaded from: classes.dex */
public final class GtaResponseBody implements getModifiedScore<Object> {
    private final Service RemoteActionCompatParcelizer;
    private Object write;

    /* JADX INFO: loaded from: classes4.dex */
    public interface IconCompatParcelizer {
        getRank getSavedStateRegistry();
    }

    public GtaResponseBody(Service service) {
        this.RemoteActionCompatParcelizer = service;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        if (this.write == null) {
            this.write = write();
        }
        return this.write;
    }

    private Object write() {
        Application application = this.RemoteActionCompatParcelizer.getApplication();
        getSubjScore.IconCompatParcelizer(application instanceof getModifiedScore, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((IconCompatParcelizer) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(application, IconCompatParcelizer.class)).getSavedStateRegistry().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).IconCompatParcelizer();
    }
}
