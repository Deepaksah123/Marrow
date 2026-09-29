package com.marrow.data.models.home;

import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.home.qbank.HomeQbankModel;
import com.marrow.data.models.home.test.HomeTestModel;
import com.marrow.data.models.home.video.HomeVideoModel;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 "}, d2 = {"Lcom/marrow/data/models/home/HomeMainModel;", "", "<init>", "()V", "", "Lcom/marrow/data/models/home/test/HomeTestModel;", "testModels", "[Lcom/marrow/data/models/home/test/HomeTestModel;", "getTestModels", "()[Lcom/marrow/data/models/home/test/HomeTestModel;", "setTestModels", "([Lcom/marrow/data/models/home/test/HomeTestModel;)V", "Lcom/marrow/data/models/home/qbank/HomeQbankModel;", "qbankModels", "[Lcom/marrow/data/models/home/qbank/HomeQbankModel;", "getQbankModels", "()[Lcom/marrow/data/models/home/qbank/HomeQbankModel;", "setQbankModels", "([Lcom/marrow/data/models/home/qbank/HomeQbankModel;)V", "Lcom/marrow/data/models/home/video/HomeVideoModel;", "videoModels", "[Lcom/marrow/data/models/home/video/HomeVideoModel;", "getVideoModels", "()[Lcom/marrow/data/models/home/video/HomeVideoModel;", "setVideoModels", "([Lcom/marrow/data/models/home/video/HomeVideoModel;)V", "Lcom/marrow/data/models/common/FeaturedCard;", "featuredCards", "[Lcom/marrow/data/models/common/FeaturedCard;", "getFeaturedCards", "()[Lcom/marrow/data/models/common/FeaturedCard;", "setFeaturedCards", "([Lcom/marrow/data/models/common/FeaturedCard;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeMainModel {
    public FeaturedCard[] featuredCards;
    public HomeQbankModel[] qbankModels;
    public HomeTestModel[] testModels;
    public HomeVideoModel[] videoModels;

    public final HomeTestModel[] getTestModels() {
        HomeTestModel[] homeTestModelArr = this.testModels;
        if (homeTestModelArr != null) {
            return homeTestModelArr;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setTestModels(HomeTestModel[] homeTestModelArr) {
        toMagicModuleMetaRepoModel.write(homeTestModelArr, "");
        this.testModels = homeTestModelArr;
    }

    public final HomeQbankModel[] getQbankModels() {
        HomeQbankModel[] homeQbankModelArr = this.qbankModels;
        if (homeQbankModelArr != null) {
            return homeQbankModelArr;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setQbankModels(HomeQbankModel[] homeQbankModelArr) {
        toMagicModuleMetaRepoModel.write(homeQbankModelArr, "");
        this.qbankModels = homeQbankModelArr;
    }

    public final HomeVideoModel[] getVideoModels() {
        HomeVideoModel[] homeVideoModelArr = this.videoModels;
        if (homeVideoModelArr != null) {
            return homeVideoModelArr;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setVideoModels(HomeVideoModel[] homeVideoModelArr) {
        toMagicModuleMetaRepoModel.write(homeVideoModelArr, "");
        this.videoModels = homeVideoModelArr;
    }

    public final FeaturedCard[] getFeaturedCards() {
        FeaturedCard[] featuredCardArr = this.featuredCards;
        if (featuredCardArr != null) {
            return featuredCardArr;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setFeaturedCards(FeaturedCard[] featuredCardArr) {
        toMagicModuleMetaRepoModel.write(featuredCardArr, "");
        this.featuredCards = featuredCardArr;
    }
}
