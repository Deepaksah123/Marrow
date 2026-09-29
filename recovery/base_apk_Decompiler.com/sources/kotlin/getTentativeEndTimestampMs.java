package kotlin;

import kotlin.getTestPattern;

/* JADX INFO: loaded from: classes4.dex */
public interface getTentativeEndTimestampMs extends Comparable<getTentativeEndTimestampMs> {
    long read(getTentativeEndTimestampMs gettentativeendtimestampms);

    public static final class read {
        public static int AudioAttributesCompatParcelizer(getTentativeEndTimestampMs gettentativeendtimestampms, getTentativeEndTimestampMs gettentativeendtimestampms2) {
            toMagicModuleMetaRepoModel.write(gettentativeendtimestampms2, "");
            long j = gettentativeendtimestampms.read(gettentativeendtimestampms2);
            getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
            return getTestPattern.read(j, getTestPattern.RemoteActionCompatParcelizer.read());
        }
    }
}
