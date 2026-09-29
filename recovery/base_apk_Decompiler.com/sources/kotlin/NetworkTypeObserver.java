package kotlin;

import com.marrow2.data.lesson.remote.model.QBankStatsResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkTypeObserver {
    public static final getMobileNetworkType IconCompatParcelizer(QBankStatsResponse qBankStatsResponse) {
        toMagicModuleMetaRepoModel.write(qBankStatsResponse, "");
        return new getMobileNetworkType(qBankStatsResponse.getCalendarDayMatrix(), qBankStatsResponse.getNextQuery().getMonth(), qBankStatsResponse.getPrevQuery().getMonth(), qBankStatsResponse.getTotalSolvedModule(), qBankStatsResponse.getTotalModule());
    }
}
