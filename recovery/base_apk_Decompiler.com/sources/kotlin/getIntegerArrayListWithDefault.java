package kotlin;

import com.marrow.data.models.search.RecentSearch;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class getIntegerArrayListWithDefault implements getBundleWithDefault {
    private final getFirstSegmentNum read;

    @setSdkPayload
    public getIntegerArrayListWithDefault(getFirstSegmentNum getfirstsegmentnum) {
        toMagicModuleMetaRepoModel.write(getfirstsegmentnum, "");
        this.read = getfirstsegmentnum;
    }

    @Override // kotlin.getBundleWithDefault
    public final Object AudioAttributesCompatParcelizer(String str) {
        RecentSearch recentSearchA_ = this.read.a_(str);
        if (recentSearchA_ != null) {
            return stringMapToBundle.IconCompatParcelizer(recentSearchA_);
        }
        return null;
    }

    @Override // kotlin.getBundleWithDefault
    public final Object read() {
        RecentSearch[] recentSearchArrAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recentSearchArrAudioAttributesCompatParcelizer, "");
        RecentSearch[] recentSearchArr = recentSearchArrAudioAttributesCompatParcelizer;
        ArrayList arrayList = new ArrayList(recentSearchArr.length);
        for (RecentSearch recentSearch : recentSearchArr) {
            toMagicModuleMetaRepoModel.write(recentSearch);
            arrayList.add(stringMapToBundle.IconCompatParcelizer(recentSearch));
        }
        return arrayList;
    }

    @Override // kotlin.getBundleWithDefault
    public final Object AudioAttributesCompatParcelizer() {
        this.read.ah_();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.getBundleWithDefault
    public final Object write(toBundleArrayList tobundlearraylist) {
        this.read.AudioAttributesCompatParcelizer(stringMapToBundle.AudioAttributesCompatParcelizer(tobundlearraylist));
        return getShowPopup.INSTANCE;
    }
}
