package kotlin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class enableTunnelingV21 extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ newEncryptedObject write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enableTunnelingV21(newEncryptedObject newencryptedobject, String str) {
        super(0);
        this.write = newencryptedobject;
        this.IconCompatParcelizer = str;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws NoSuchAlgorithmException {
        if (this.write.AudioAttributesImplApi26Parcelizer()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MessageDigest messageDigest = MessageDigest.getInstance(framesToDurationUs.write.write());
        toMagicModuleMetaRepoModel.write(messageDigest);
        byte[] bArrDigest = messageDigest.digest(this.IconCompatParcelizer.getBytes(getSubmissionTimestamp.IconCompatParcelizer));
        toMagicModuleMetaRepoModel.write(bArrDigest);
        int iIconCompatParcelizer = getOrderDetails.IconCompatParcelizer(bArrDigest);
        newEncryptedObject newencryptedobject = this.write;
        return Integer.valueOf(this.write.getRead() + Math.floorMod(iIconCompatParcelizer, newencryptedobject.AudioAttributesImplApi26Parcelizer() ? 0 : (newencryptedobject.getAudioAttributesCompatParcelizer() - newencryptedobject.getRead()) + 1));
    }
}
