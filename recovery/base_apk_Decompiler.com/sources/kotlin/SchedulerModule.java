package kotlin;

import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.SyncModule;

/* JADX INFO: loaded from: classes4.dex */
public final class SchedulerModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(TableModule tableModule, SubscriptionDataModule subscriptionDataModule, String str) {
        SyncModule.Companion companion = SyncModule.Companion;
        Logger loggerIconCompatParcelizer = SyncModule.Companion.IconCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(subscriptionDataModule.getName());
        sb.append(' ');
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        sb.append(str2);
        sb.append(": ");
        sb.append(tableModule.getName());
        loggerIconCompatParcelizer.fine(sb.toString());
    }

    public static final String read(long j) {
        String string;
        if (j <= -999500000) {
            StringBuilder sb = new StringBuilder();
            sb.append((j - 500000000) / C.NANOS_PER_SECOND);
            sb.append(" s ");
            string = sb.toString();
        } else if (j <= -999500) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((j - 500000) / 1000000);
            sb2.append(" ms");
            string = sb2.toString();
        } else if (j <= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append((j - 500) / 1000);
            sb3.append(" µs");
            string = sb3.toString();
        } else if (j < 999500) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append((j + 500) / 1000);
            sb4.append(" µs");
            string = sb4.toString();
        } else if (j < 999500000) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append((j + 500000) / 1000000);
            sb5.append(" ms");
            string = sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append((j + 500000000) / C.NANOS_PER_SECOND);
            sb6.append(" s ");
            string = sb6.toString();
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }
}
