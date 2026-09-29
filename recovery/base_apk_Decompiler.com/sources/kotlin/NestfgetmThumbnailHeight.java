package kotlin;

import java.util.Map;
import kotlin.getInviteCode;

/* JADX INFO: loaded from: classes4.dex */
public final class NestfgetmThumbnailHeight extends getInviteCode {
    public static final NestfgetmThumbnailHeight read = new NestfgetmThumbnailHeight();

    private NestfgetmThumbnailHeight() {
    }

    public static getRelatedLessonId IconCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem) {
        toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
        Map<String, getRelatedLessonId> mapIconCompatParcelizer = getInviteCode.RemoteActionCompatParcelizer.IconCompatParcelizer();
        String strIconCompatParcelizer = getPublishedTime.IconCompatParcelizer(courseConfigV2SupportItem);
        if (strIconCompatParcelizer == null) {
            return null;
        }
        return mapIconCompatParcelizer.get(strIconCompatParcelizer);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getTestHeaderTitle, Boolean> {
        private /* synthetic */ CourseConfigV2SupportItem AudioAttributesCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(getTestHeaderTitle gettestheadertitle) {
            toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
            getInviteCode.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getInviteCode.IconCompatParcelizer;
            return Boolean.valueOf(getInviteCode.RemoteActionCompatParcelizer.IconCompatParcelizer().containsKey(getPublishedTime.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem) {
            super(1);
            this.AudioAttributesCompatParcelizer = courseConfigV2SupportItem;
        }
    }

    public static boolean write(CourseConfigV2SupportItem courseConfigV2SupportItem) {
        toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
        return getTestTabItems.RemoteActionCompatParcelizer(courseConfigV2SupportItem) && setLocked.RemoteActionCompatParcelizer(courseConfigV2SupportItem, false, new IconCompatParcelizer(courseConfigV2SupportItem)) != null;
    }

    public static boolean AudioAttributesCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem) {
        toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) courseConfigV2SupportItem.aQ_().AudioAttributesCompatParcelizer(), (Object) "removeAt") && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getPublishedTime.IconCompatParcelizer(courseConfigV2SupportItem), (Object) getInviteCode.RemoteActionCompatParcelizer.write().IconCompatParcelizer());
    }
}
