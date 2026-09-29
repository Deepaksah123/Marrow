package kotlin;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setMsInterimHtmlStartTime implements setTagsList {
    public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer(0);
    private final getRelatedLessonId IconCompatParcelizer;

    private setMsInterimHtmlStartTime(getRelatedLessonId getrelatedlessonid) {
        this.IconCompatParcelizer = getrelatedlessonid;
    }

    @Override // kotlin.setTagsList
    public final getRelatedLessonId read() {
        return this.IconCompatParcelizer;
    }

    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static setMsInterimHtmlStartTime read(Object obj, getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(obj, "");
            return getFinalImageUrl.AudioAttributesImplBaseParcelizer(obj.getClass()) ? new getImageUrlV2(getrelatedlessonid, (Enum) obj) : obj instanceof Annotation ? new setShowDummyReference(getrelatedlessonid, (Annotation) obj) : obj instanceof Object[] ? new getImageCitationLink(getrelatedlessonid, (Object[]) obj) : obj instanceof Class ? new getThumbnailWidth(getrelatedlessonid, (Class) obj) : new setImageCitationLicense(getrelatedlessonid, obj);
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }

    public /* synthetic */ setMsInterimHtmlStartTime(getRelatedLessonId getrelatedlessonid, byte b) {
        this(getrelatedlessonid);
    }
}
