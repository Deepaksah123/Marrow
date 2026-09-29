package com.marrow.data.models.home;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/home/HomeRefreshInfoModel;", "", "<init>", "()V", "Lcom/marrow/data/models/home/HomeMainModel;", "mainModel", "Lcom/marrow/data/models/home/HomeMainModel;", "getMainModel", "()Lcom/marrow/data/models/home/HomeMainModel;", "setMainModel", "(Lcom/marrow/data/models/home/HomeMainModel;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeRefreshInfoModel {
    public HomeMainModel mainModel;

    public final HomeMainModel getMainModel() {
        HomeMainModel homeMainModel = this.mainModel;
        if (homeMainModel != null) {
            return homeMainModel;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setMainModel(HomeMainModel homeMainModel) {
        toMagicModuleMetaRepoModel.write(homeMainModel, "");
        this.mainModel = homeMainModel;
    }
}
