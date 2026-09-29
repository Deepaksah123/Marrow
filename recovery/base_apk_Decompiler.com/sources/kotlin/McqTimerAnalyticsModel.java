package kotlin;

import kotlin.getVideoPageNotesTitle;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public interface McqTimerAnalyticsModel {
    public static final write write = write.AudioAttributesCompatParcelizer;

    Pair<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, Object> read(setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, setTagActive settagactive, SchemaCompletionState schemaCompletionState);

    public static final class write {
        static final /* synthetic */ write AudioAttributesCompatParcelizer = new write();
        private static final McqTimerAnalyticsModel RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        public static final class RemoteActionCompatParcelizer implements McqTimerAnalyticsModel {
            RemoteActionCompatParcelizer() {
            }

            @Override // kotlin.McqTimerAnalyticsModel
            public final Pair read(setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, setTagActive settagactive, SchemaCompletionState schemaCompletionState) {
                toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
                toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
                toMagicModuleMetaRepoModel.write(settagactive, "");
                toMagicModuleMetaRepoModel.write(schemaCompletionState, "");
                return null;
            }
        }

        private write() {
        }

        public static McqTimerAnalyticsModel IconCompatParcelizer() {
            return RemoteActionCompatParcelizer;
        }
    }
}
