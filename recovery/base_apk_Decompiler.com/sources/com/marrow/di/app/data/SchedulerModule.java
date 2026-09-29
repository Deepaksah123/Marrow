package com.marrow.di.app.data;

import kotlin.Metadata;
import kotlin.PlanBUpgradeData;
import kotlin.getDeeplink;
import kotlin.getIds;
import kotlin.getPlanOldPrice;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/marrow/di/app/data/SchedulerModule;", "", "<init>", "()V", "Lo/getIds;", "IconCompatParcelizer", "()Lo/getIds;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SchedulerModule {
    @getPlanOldPrice
    public final getIds IconCompatParcelizer() {
        getIds getids = PlanBUpgradeData.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getids, "");
        return getids;
    }

    @getPlanOldPrice
    public final getIds AudioAttributesCompatParcelizer() {
        getIds getidsRemoteActionCompatParcelizer = PlanBUpgradeData.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getidsRemoteActionCompatParcelizer, "");
        return getidsRemoteActionCompatParcelizer;
    }

    @getPlanOldPrice
    public final getIds RemoteActionCompatParcelizer() {
        getIds getids = getDeeplink.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getids, "");
        return getids;
    }
}
