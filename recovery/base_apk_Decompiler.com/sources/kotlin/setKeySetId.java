package kotlin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.isPrepared;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
public final class setKeySetId {
    private final prepareChildSource<onVolumeChanged, String> read = new prepareChildSource<>(1000);
    private final rewrapCtorProblem.IconCompatParcelizer<RemoteActionCompatParcelizer> IconCompatParcelizer = isPrepared.read(10, new isPrepared.IconCompatParcelizer<RemoteActionCompatParcelizer>() { // from class: o.setKeySetId.5
        @Override // o.isPrepared.IconCompatParcelizer
        public final /* synthetic */ RemoteActionCompatParcelizer write() {
            return RemoteActionCompatParcelizer();
        }

        private static RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            try {
                return new RemoteActionCompatParcelizer(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    });

    public final String IconCompatParcelizer(onVolumeChanged onvolumechanged) {
        String strRemoteActionCompatParcelizer;
        synchronized (this.read) {
            strRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(onvolumechanged);
        }
        if (strRemoteActionCompatParcelizer == null) {
            strRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(onvolumechanged);
        }
        synchronized (this.read) {
            this.read.IconCompatParcelizer(onvolumechanged, strRemoteActionCompatParcelizer);
        }
        return strRemoteActionCompatParcelizer;
    }

    private String AudioAttributesCompatParcelizer(onVolumeChanged onvolumechanged) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) moveMediaSource.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer());
        try {
            onvolumechanged.write(remoteActionCompatParcelizer.read);
            return moveMediaSourceRange.IconCompatParcelizer(remoteActionCompatParcelizer.read.digest());
        } finally {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
    }

    static final class RemoteActionCompatParcelizer implements isPrepared.read {
        final MessageDigest read;
        private final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList write = lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList.write();

        RemoteActionCompatParcelizer(MessageDigest messageDigest) {
            this.read = messageDigest;
        }

        @Override // o.isPrepared.read
        public final lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList I_() {
            return this.write;
        }
    }
}
