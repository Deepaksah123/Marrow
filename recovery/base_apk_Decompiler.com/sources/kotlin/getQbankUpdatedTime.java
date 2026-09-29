package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface getQbankUpdatedTime {
    String AudioAttributesCompatParcelizer();

    String IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs);

    boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs);

    public static final class AudioAttributesCompatParcelizer {
        public static String write(getQbankUpdatedTime getqbankupdatedtime, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            if (getqbankupdatedtime.write(courseConfigV2NavDrawerItemRateUs)) {
                return null;
            }
            return getqbankupdatedtime.AudioAttributesCompatParcelizer();
        }
    }
}
