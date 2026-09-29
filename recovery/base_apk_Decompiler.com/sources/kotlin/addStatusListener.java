package kotlin;

import java.nio.ByteBuffer;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class addStatusListener implements MediaItemLocalConfigurationExternalSyntheticLambda0<PendingResults, ByteBuffer> {
    private final getNalUnitType read;
    private final TopUserCompanion write;

    public addStatusListener(getNalUnitType getnalunittype, TopUserCompanion topUserCompanion) {
        toMagicModuleMetaRepoModel.write(getnalunittype, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        this.read = getnalunittype;
        this.write = topUserCompanion;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(PendingResults pendingResults) {
        return RemoteActionCompatParcelizer(pendingResults);
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<ByteBuffer> write(PendingResults pendingResults, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return RemoteActionCompatParcelizer(pendingResults, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<ByteBuffer> RemoteActionCompatParcelizer(PendingResults pendingResults, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        toMagicModuleMetaRepoModel.write(pendingResults, "");
        toMagicModuleMetaRepoModel.write(r8lambda_r106e6zya8q8i_ekunqwrolpk, "");
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(pendingResults.AudioAttributesCompatParcelizer()), new PendingResult(pendingResults, this.read, this.write));
    }

    private static boolean RemoteActionCompatParcelizer(PendingResults pendingResults) {
        toMagicModuleMetaRepoModel.write(pendingResults, "");
        return true;
    }

    public static final class IconCompatParcelizer implements setTargetOffsetMs<PendingResults, ByteBuffer> {
        private final getPlatform AudioAttributesCompatParcelizer;
        private final getNalUnitType RemoteActionCompatParcelizer;
        private final TopUserCompanion read;

        public IconCompatParcelizer(getNalUnitType getnalunittype, getPlatform getplatform) {
            toMagicModuleMetaRepoModel.write(getnalunittype, "");
            toMagicModuleMetaRepoModel.write(getplatform, "");
            this.RemoteActionCompatParcelizer = getnalunittype;
            this.AudioAttributesCompatParcelizer = getplatform;
            this.read = College.AudioAttributesCompatParcelizer(getplatform.plus(getAltContact.read(null)));
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<PendingResults, ByteBuffer> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            toMagicModuleMetaRepoModel.write(mediaItemRequestMetadataExternalSyntheticLambda0, "");
            return new addStatusListener(this.RemoteActionCompatParcelizer, this.read);
        }

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
            College.AudioAttributesCompatParcelizer(this.read, null);
        }
    }
}
