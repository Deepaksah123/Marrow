package kotlin;

import kotlin.VisibilityChecker;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes.dex */
public interface anyExplicitsWithoutIgnoral {
    VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory();

    default withFieldVisibility getDefaultViewModelCreationExtras() {
        return withFieldVisibility.write.INSTANCE;
    }
}
