package kotlin;

import kotlin.getQbankUpdatedTime;
import kotlin.getSupportViews;

/* JADX INFO: loaded from: classes4.dex */
final class getIsInteractive implements getQbankUpdatedTime {
    public static final getIsInteractive write = new getIsInteractive();
    private static final String IconCompatParcelizer = "second parameter must be of type KProperty<*> or its supertype";

    private getIsInteractive() {
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        return getQbankUpdatedTime.AudioAttributesCompatParcelizer.write(this, courseConfigV2NavDrawerItemRateUs);
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    @Override // kotlin.getQbankUpdatedTime
    public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        getMeta getmeta = courseConfigV2NavDrawerItemRateUs.aX_().get(1);
        getSupportViews.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getSupportViews.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmeta, "");
        getLink getlink = getSupportViews.AudioAttributesCompatParcelizer.read(setLocked.IconCompatParcelizer(getmeta));
        if (getlink == null) {
            return false;
        }
        getLink getlinkOnPrepareFromMediaId = getmeta.onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
        return getSearchTimes.RemoteActionCompatParcelizer(getlink, getSearchTimes.MediaMetadataCompat(getlinkOnPrepareFromMediaId));
    }
}
