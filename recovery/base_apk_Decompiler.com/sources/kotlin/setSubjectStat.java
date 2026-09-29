package kotlin;

import android.content.Context;
import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* JADX INFO: loaded from: classes4.dex */
public final class setSubjectStat implements getSubmittedOn<Context> {
    private final ApplicationContextModule IconCompatParcelizer;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return read(this.IconCompatParcelizer);
    }

    public static Context read(ApplicationContextModule applicationContextModule) {
        return (Context) setPossibleScore.write(applicationContextModule.RemoteActionCompatParcelizer());
    }
}
