package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class ContentResetResponseBookmark extends getSerializable<CourseConfigSerializerWhenMappings<?>, getShowPopup> {
    private final getNavDrawerKey AudioAttributesCompatParcelizer;

    public ContentResetResponseBookmark(getNavDrawerKey getnavdrawerkey) {
        toMagicModuleMetaRepoModel.write(getnavdrawerkey, "");
        this.AudioAttributesCompatParcelizer = getnavdrawerkey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getSerializable, kotlin.CourseConfigV2NavDrawerItemAddVideo
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public CourseConfigSerializerWhenMappings<?> read(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getShowPopup getshowpopup) {
        toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
        toMagicModuleMetaRepoModel.write(getshowpopup, "");
        int i = (courseConfigV2SettingsItems.write() != null ? 1 : 0) + (courseConfigV2SettingsItems.MediaBrowserCompatCustomActionResultReceiver() != null ? 1 : 0);
        if (courseConfigV2SettingsItems.onRewind()) {
            if (i == 0) {
                return new CourseConfigV2(this.AudioAttributesCompatParcelizer, courseConfigV2SettingsItems);
            }
            if (i == 1) {
                return new component18(this.AudioAttributesCompatParcelizer, courseConfigV2SettingsItems);
            }
            return new component15(this.AudioAttributesCompatParcelizer, courseConfigV2SettingsItems);
        }
        if (i == 0) {
            return new component20(this.AudioAttributesCompatParcelizer, courseConfigV2SettingsItems);
        }
        if (i == 1) {
            return new component19(this.AudioAttributesCompatParcelizer, courseConfigV2SettingsItems);
        }
        return new component21(this.AudioAttributesCompatParcelizer, courseConfigV2SettingsItems);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getSerializable, kotlin.CourseConfigV2NavDrawerItemAddVideo
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public CourseConfigSerializerWhenMappings<?> IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getShowPopup getshowpopup) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        toMagicModuleMetaRepoModel.write(getshowpopup, "");
        return new component17(this.AudioAttributesCompatParcelizer, courseConfigV2NavDrawerItemRateUs);
    }
}
