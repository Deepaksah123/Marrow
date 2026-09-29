package kotlin;

import kotlin.HomeLessonIndexV2;
import kotlin.getMyRating;
import kotlin.getSchemaTitle;
import kotlin.setActiveRecallQbankId;
import kotlin.toHomeLessonIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class setHasVideo {
    public static /* synthetic */ getMyRating RemoteActionCompatParcelizer(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, setRatingCount setratingcount, setTagActive settagactive, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = (i & 8) != 0 ? false : z;
        boolean z5 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            z3 = true;
        }
        return read(mediaBrowserCompatMediaItem, setratingcount, settagactive, z4, z5, z3);
    }

    public static final getMyRating read(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, setRatingCount setratingcount, setTagActive settagactive, boolean z, boolean z2, boolean z3) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatMediaItem, toHomeLessonIndex.AudioAttributesCompatParcelizer> iconCompatParcelizer = toHomeLessonIndex.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
        toHomeLessonIndex.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (toHomeLessonIndex.AudioAttributesCompatParcelizer) setTagLabel.read(mediaBrowserCompatMediaItem, iconCompatParcelizer);
        if (audioAttributesCompatParcelizer == null) {
            return null;
        }
        if (z) {
            getCompletedARQBankCount getcompletedarqbankcount = getCompletedARQBankCount.IconCompatParcelizer;
            getSchemaTitle.write writeVarIconCompatParcelizer = getCompletedARQBankCount.IconCompatParcelizer(mediaBrowserCompatMediaItem, setratingcount, settagactive, z3);
            if (writeVarIconCompatParcelizer == null) {
                return null;
            }
            getMyRating.IconCompatParcelizer iconCompatParcelizer2 = getMyRating.AudioAttributesCompatParcelizer;
            return getMyRating.IconCompatParcelizer.read(writeVarIconCompatParcelizer);
        }
        if (!z2 || !audioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return null;
        }
        getMyRating.IconCompatParcelizer iconCompatParcelizer3 = getMyRating.AudioAttributesCompatParcelizer;
        toHomeLessonIndex.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerMediaBrowserCompatItemReceiver, "");
        return getMyRating.IconCompatParcelizer.write(setratingcount, iconCompatParcelizerMediaBrowserCompatItemReceiver);
    }
}
