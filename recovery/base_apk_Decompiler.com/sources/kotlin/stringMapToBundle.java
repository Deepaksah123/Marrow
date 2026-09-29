package kotlin;

import com.marrow.data.models.search.RecentSearch;

/* JADX INFO: loaded from: classes3.dex */
public final class stringMapToBundle {
    public static final toBundleArrayList IconCompatParcelizer(RecentSearch recentSearch) {
        toMagicModuleMetaRepoModel.write(recentSearch, "");
        int searchTimes = recentSearch.getSearchTimes();
        long lastUpdated = recentSearch.getLastUpdated();
        String id = recentSearch.getId();
        String videoLessonId = recentSearch.getVideoLessonId();
        String itemType = recentSearch.getItemType();
        String itemTitle = recentSearch.getItemTitle();
        String itemSubTitle = recentSearch.getItemSubTitle();
        String str = itemSubTitle == null ? "" : itemSubTitle;
        String bulletDescText = recentSearch.getBulletDescText();
        return new toBundleArrayList(searchTimes, lastUpdated, id, videoLessonId, itemType, itemTitle, str, bulletDescText == null ? "" : bulletDescText, recentSearch.getVideoStartTime());
    }

    public static final toBundleArrayList RemoteActionCompatParcelizer(toBundleList tobundlelist) {
        toMagicModuleMetaRepoModel.write(tobundlelist, "");
        return new toBundleArrayList(tobundlelist.getRead(), tobundlelist.getRemoteActionCompatParcelizer(), tobundlelist.getAudioAttributesCompatParcelizer(), tobundlelist.getWrite(), tobundlelist.getIconCompatParcelizer(), tobundlelist.getMediaBrowserCompatItemReceiver(), tobundlelist.getAudioAttributesImplApi21Parcelizer(), tobundlelist.getAudioAttributesImplApi26Parcelizer(), tobundlelist.getAudioAttributesImplBaseParcelizer());
    }

    public static final RecentSearch AudioAttributesCompatParcelizer(toBundleArrayList tobundlearraylist) {
        toMagicModuleMetaRepoModel.write(tobundlearraylist, "");
        return new RecentSearch(tobundlearraylist.getAudioAttributesCompatParcelizer(), tobundlearraylist.getRead(), tobundlearraylist.getRemoteActionCompatParcelizer(), tobundlearraylist.getIconCompatParcelizer(), tobundlearraylist.getWrite(), tobundlearraylist.getMediaBrowserCompatItemReceiver(), tobundlearraylist.getAudioAttributesImplApi26Parcelizer(), tobundlearraylist.getAudioAttributesImplApi21Parcelizer(), tobundlearraylist.getAudioAttributesImplBaseParcelizer());
    }
}
