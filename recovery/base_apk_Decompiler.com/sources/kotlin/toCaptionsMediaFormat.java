package kotlin;

import android.app.Activity;
import com.marrow.di.activity.ActivityPresenterModule;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract;

/* JADX INFO: loaded from: classes3.dex */
public final class toCaptionsMediaFormat implements getSubmittedOn<UpgradePlanActivityContract.AudioAttributesCompatParcelizer> {
    private final getTestId<Activity> read;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public UpgradePlanActivityContract.AudioAttributesCompatParcelizer get() {
        throw null;
    }

    public static UpgradePlanActivityContract.AudioAttributesCompatParcelizer read(Activity activity) {
        return (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) setPossibleScore.write(ActivityPresenterModule.INSTANCE.AudioAttributesImplApi26Parcelizer(activity));
    }
}
