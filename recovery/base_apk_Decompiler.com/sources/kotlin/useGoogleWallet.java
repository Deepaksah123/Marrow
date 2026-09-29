package kotlin;

import com.marrow.data.models.test.TestIndex;
import kotlin.WalletWalletOptionsBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class useGoogleWallet {
    public static final setEnvironment write(String str, boolean z, boolean z2, TestIndex testIndex) {
        WalletWalletOptionsBuilder.read remoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(testIndex, "");
        boolean z3 = testIndex.isPaid() && !z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long startTimestamp = testIndex.getStartTimestamp();
        long endTimestamp = testIndex.getEndTimestamp();
        boolean z4 = endTimestamp < jCurrentTimeMillis;
        if (startTimestamp > jCurrentTimeMillis) {
            remoteActionCompatParcelizer = new WalletWalletOptionsBuilder.IconCompatParcelizer(startTimestamp);
        } else if (testIndex.getStatus() == 2) {
            remoteActionCompatParcelizer = new WalletWalletOptionsBuilder.AudioAttributesCompatParcelizer(testIndex.isReviewAvailable());
        } else if (testIndex.getStatus() == 1) {
            remoteActionCompatParcelizer = new WalletWalletOptionsBuilder.RemoteActionCompatParcelizer(((int) ((jCurrentTimeMillis - (testIndex.isStarted() ? testIndex.getUserStartedTimestamp() : jCurrentTimeMillis)) / 1000)) > testIndex.getDuration());
        } else {
            remoteActionCompatParcelizer = WalletWalletOptionsBuilder.read.INSTANCE;
        }
        int i = Integer.parseInt(parseEac3SupplementalProperties.write(endTimestamp, "dd"));
        String strWrite = parseDolbyChannelConfiguration.write(i);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(strWrite);
        String string = sb.toString();
        String strWrite2 = parseEac3SupplementalProperties.write(endTimestamp, "MMM");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strWrite2);
        sb2.append(" ");
        sb2.append(string);
        String string2 = sb2.toString();
        boolean z5 = startTimestamp + 1 <= jCurrentTimeMillis && jCurrentTimeMillis < endTimestamp;
        String title = testIndex.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        String testType = testIndex.getTestType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
        return new setEnvironment(z3, z2, remoteActionCompatParcelizer, str, title, testType, testIndex.getTestPattern(), testIndex.getMaxMcqCount(), testIndex.getDuration(), string2, z5, z4, testIndex.isAnonymous());
    }
}
