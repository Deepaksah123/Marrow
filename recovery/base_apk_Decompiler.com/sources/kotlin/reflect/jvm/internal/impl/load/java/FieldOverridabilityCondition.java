package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.CourseConfigV2CustomModuleQuestionSource;
import kotlin.CourseConfigV2SettingsItems;
import kotlin.HomeRefreshInfoModel;
import kotlin.getVideoPageNotesTitle;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.read isOverridable(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle2, "");
        if (!(getvideopagenotestitle2 instanceof CourseConfigV2SettingsItems) || !(getvideopagenotestitle instanceof CourseConfigV2SettingsItems)) {
            return ExternalOverridabilityCondition.read.UNKNOWN;
        }
        CourseConfigV2SettingsItems courseConfigV2SettingsItems = (CourseConfigV2SettingsItems) getvideopagenotestitle2;
        CourseConfigV2SettingsItems courseConfigV2SettingsItems2 = (CourseConfigV2SettingsItems) getvideopagenotestitle;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2SettingsItems.aQ_(), courseConfigV2SettingsItems2.aQ_())) {
            return ExternalOverridabilityCondition.read.UNKNOWN;
        }
        if (HomeRefreshInfoModel.IconCompatParcelizer(courseConfigV2SettingsItems) && HomeRefreshInfoModel.IconCompatParcelizer(courseConfigV2SettingsItems2)) {
            return ExternalOverridabilityCondition.read.OVERRIDABLE;
        }
        if (HomeRefreshInfoModel.IconCompatParcelizer(courseConfigV2SettingsItems) || HomeRefreshInfoModel.IconCompatParcelizer(courseConfigV2SettingsItems2)) {
            return ExternalOverridabilityCondition.read.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.read.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.IconCompatParcelizer getContract() {
        return ExternalOverridabilityCondition.IconCompatParcelizer.BOTH;
    }
}
