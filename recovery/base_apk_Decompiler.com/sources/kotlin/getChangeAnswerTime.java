package kotlin;

import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public interface getChangeAnswerTime {
    getLink write(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, String str, getHref gethref, getHref gethref2);

    public static final class RemoteActionCompatParcelizer implements getChangeAnswerTime {
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.getChangeAnswerTime
        public final getLink write(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, String str, getHref gethref, getHref gethref2) {
            toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(gethref, "");
            toMagicModuleMetaRepoModel.write(gethref2, "");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }
}
