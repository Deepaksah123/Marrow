package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.getQbankUpdatedTime;

/* JADX INFO: loaded from: classes4.dex */
final class setInteractive implements getQbankUpdatedTime {
    public static final setInteractive write = new setInteractive();
    private static final String read = "should not have varargs or parameters with default values";

    private setInteractive() {
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        return getQbankUpdatedTime.AudioAttributesCompatParcelizer.write(this, courseConfigV2NavDrawerItemRateUs);
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String AudioAttributesCompatParcelizer() {
        return read;
    }

    @Override // kotlin.getQbankUpdatedTime
    public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        List<getMeta> listAX_ = courseConfigV2NavDrawerItemRateUs.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
        List<getMeta> list = listAX_;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (getMeta getmeta : list) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmeta, "");
            if (setLocked.AudioAttributesCompatParcelizer(getmeta) || getmeta.handleMediaPlayPauseIfPendingOnHandler() != null) {
                return false;
            }
        }
        return true;
    }
}
