package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface getWarningMsg {
    getMagicLine<?> read(getExpiryTimeStamp getexpirytimestamp, CourseConfigV2SettingsItems courseConfigV2SettingsItems);

    public static final class RemoteActionCompatParcelizer implements getWarningMsg {
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.getWarningMsg
        public final getMagicLine<?> read(getExpiryTimeStamp getexpirytimestamp, CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
            toMagicModuleMetaRepoModel.write(getexpirytimestamp, "");
            toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
            return null;
        }
    }
}
