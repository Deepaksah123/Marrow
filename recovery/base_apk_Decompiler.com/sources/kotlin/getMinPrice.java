package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface getMinPrice {
    void AudioAttributesCompatParcelizer(dummyEditor dummyeditor);

    void read(CourseConfigV2VideoProperties courseConfigV2VideoProperties);

    void write(CourseConfigV2VideoProperties courseConfigV2VideoProperties, getLink getlink);

    public static final class AudioAttributesCompatParcelizer implements getMinPrice {
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.getMinPrice
        public final void write(CourseConfigV2VideoProperties courseConfigV2VideoProperties, getLink getlink) {
            toMagicModuleMetaRepoModel.write(courseConfigV2VideoProperties, "");
            toMagicModuleMetaRepoModel.write(getlink, "");
        }

        @Override // kotlin.getMinPrice
        public final void read(CourseConfigV2VideoProperties courseConfigV2VideoProperties) {
            toMagicModuleMetaRepoModel.write(courseConfigV2VideoProperties, "");
        }

        @Override // kotlin.getMinPrice
        public final void AudioAttributesCompatParcelizer(dummyEditor dummyeditor) {
            toMagicModuleMetaRepoModel.write(dummyeditor, "");
        }
    }
}
