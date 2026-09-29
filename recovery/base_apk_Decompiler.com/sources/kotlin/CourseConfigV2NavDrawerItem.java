package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CourseConfigV2NavDrawerItem extends CourseConfigV2NavDrawerItemFreeExtension {
    private final DataSet IconCompatParcelizer;

    public CourseConfigV2NavDrawerItem(DataSet dataSet) {
        toMagicModuleMetaRepoModel.write(dataSet, "");
        this.IconCompatParcelizer = dataSet;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
    public final DataSet AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
    public final String RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer().write();
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
    public final CourseConfigV2NavDrawerItemFreeExtension IconCompatParcelizer() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionAudioAttributesCompatParcelizer = CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer().read());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionAudioAttributesCompatParcelizer, "");
        return courseConfigV2NavDrawerItemFreeExtensionAudioAttributesCompatParcelizer;
    }
}
