package kotlin;

import kotlin.getTestPattern;

/* JADX INFO: loaded from: classes4.dex */
public final class isStateRankApplcable {
    private static final long RemoteActionCompatParcelizer(long j) {
        if (j < 0) {
            getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
            return getTestPattern.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }
        getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = getTestPattern.read;
        return getTestPattern.RemoteActionCompatParcelizer.write();
    }

    public static final long RemoteActionCompatParcelizer(long j, long j2, isAnonymous isanonymous) {
        toMagicModuleMetaRepoModel.write(isanonymous, "");
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            if ((1 | (j - 1)) == Long.MAX_VALUE) {
                return RemoteActionCompatParcelizer(j);
            }
            return IconCompatParcelizer(j, j2, isanonymous);
        }
        if (j == j2) {
            getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
            return getTestPattern.RemoteActionCompatParcelizer.read();
        }
        return getTestPattern.AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer(j2));
    }

    private static final long IconCompatParcelizer(long j, long j2, isAnonymous isanonymous) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            if (isanonymous.compareTo(isAnonymous.RemoteActionCompatParcelizer) < 0) {
                long jRemoteActionCompatParcelizer = isFromDetailApi.RemoteActionCompatParcelizer(1L, isAnonymous.RemoteActionCompatParcelizer, isanonymous);
                getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
                return getTestPattern.RemoteActionCompatParcelizer(getUserSubmissionTimestamp.read((j / jRemoteActionCompatParcelizer) - (j2 / jRemoteActionCompatParcelizer), isAnonymous.RemoteActionCompatParcelizer), getUserSubmissionTimestamp.read((j % jRemoteActionCompatParcelizer) - (j2 % jRemoteActionCompatParcelizer), isanonymous));
            }
            return getTestPattern.AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer(j3));
        }
        return getUserSubmissionTimestamp.read(j3, isanonymous);
    }
}
