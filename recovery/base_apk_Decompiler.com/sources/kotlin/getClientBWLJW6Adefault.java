package kotlin;

import kotlin.StandardIntegrityVerdictOptOut;

/* JADX INFO: loaded from: classes4.dex */
public final class getClientBWLJW6Adefault {
    public static final StandardIntegrityVerdictOptOut.read RemoteActionCompatParcelizer(ReviewManagerFactory reviewManagerFactory) {
        toMagicModuleMetaRepoModel.write(reviewManagerFactory, "");
        int write = reviewManagerFactory.getWrite();
        if (write == 0) {
            return StandardIntegrityVerdictOptOut.read.read;
        }
        if (write == 1) {
            return StandardIntegrityVerdictOptOut.read.AudioAttributesImplBaseParcelizer;
        }
        if (write == 2) {
            return StandardIntegrityVerdictOptOut.read.AudioAttributesImplApi21Parcelizer;
        }
        if (write == 3) {
            return StandardIntegrityVerdictOptOut.read.MediaBrowserCompatItemReceiver;
        }
        return StandardIntegrityVerdictOptOut.read.read;
    }
}
