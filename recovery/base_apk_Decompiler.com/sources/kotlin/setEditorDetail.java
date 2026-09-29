package kotlin;

import kotlin.getQbankUpdatedTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setEditorDetail implements getQbankUpdatedTime {
    private final String AudioAttributesCompatParcelizer;

    public static final class read extends setEditorDetail {
        public static final read RemoteActionCompatParcelizer = new read();

        private read() {
            super("must be a member or an extension function", (byte) 0);
        }

        @Override // kotlin.getQbankUpdatedTime
        public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return (courseConfigV2NavDrawerItemRateUs.write() == null && courseConfigV2NavDrawerItemRateUs.MediaBrowserCompatCustomActionResultReceiver() == null) ? false : true;
        }
    }

    private setEditorDetail(String str) {
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        return getQbankUpdatedTime.AudioAttributesCompatParcelizer.write(this, courseConfigV2NavDrawerItemRateUs);
    }

    public /* synthetic */ setEditorDetail(String str, byte b) {
        this(str);
    }

    public static final class AudioAttributesCompatParcelizer extends setEditorDetail {
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super("must be a member function", (byte) 0);
        }

        @Override // kotlin.getQbankUpdatedTime
        public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return courseConfigV2NavDrawerItemRateUs.write() != null;
        }
    }
}
