package kotlin;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface CourseConfigV2VideoSubjectPageItem {
    Collection<getLink> AudioAttributesCompatParcelizer(getPlanAddOns getplanaddons, Collection<? extends getLink> collection, getAnswerMap<? super getPlanAddOns, ? extends Iterable<? extends getLink>> getanswermap, getAnswerMap<? super getLink, getShowPopup> getanswermap2);

    public static final class read implements CourseConfigV2VideoSubjectPageItem {
        public static final read read = new read();

        private read() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.CourseConfigV2VideoSubjectPageItem
        public final Collection<getLink> AudioAttributesCompatParcelizer(getPlanAddOns getplanaddons, Collection<? extends getLink> collection, getAnswerMap<? super getPlanAddOns, ? extends Iterable<? extends getLink>> getanswermap, getAnswerMap<? super getLink, getShowPopup> getanswermap2) {
            toMagicModuleMetaRepoModel.write(getplanaddons, "");
            toMagicModuleMetaRepoModel.write(collection, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            toMagicModuleMetaRepoModel.write(getanswermap2, "");
            return collection;
        }
    }
}
