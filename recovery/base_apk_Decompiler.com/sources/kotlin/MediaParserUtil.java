package kotlin;

import com.marrow.di.activity.ActivityPresenterModule;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserUtil implements getSubmittedOn<UpgradePlanActivityContract.Presenter> {
    private final getTestId<UpgradePlanActivityPresenter> AudioAttributesCompatParcelizer;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public UpgradePlanActivityContract.Presenter get() {
        throw null;
    }

    public static UpgradePlanActivityContract.Presenter write(UpgradePlanActivityPresenter upgradePlanActivityPresenter) {
        return (UpgradePlanActivityContract.Presenter) setPossibleScore.write(ActivityPresenterModule.INSTANCE.RemoteActionCompatParcelizer(upgradePlanActivityPresenter));
    }
}
