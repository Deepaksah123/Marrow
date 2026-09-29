package kotlin;

import com.marrow.data.models.common.CourseConfigV2;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FabTransformationScrimBehavior {
    /* JADX WARN: Multi-variable type inference failed */
    public static final FabTransformationSheetBehavior write(CourseConfigV2.VideoSubjectPageItem videoSubjectPageItem) {
        List listRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(videoSubjectPageItem, "");
        try {
            String target = videoSubjectPageItem.getTarget();
            listRemoteActionCompatParcelizer = target != null ? TestGroupLSModel.write(target, new String[]{"/"}, 0, 6) : null;
            List list = listRemoteActionCompatParcelizer;
            if (list == null || list.isEmpty()) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"", ""});
            } else if (listRemoteActionCompatParcelizer.size() == 1) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{IntermediateLoginResponseBody.RatingCompat(listRemoteActionCompatParcelizer), ""});
            }
        } catch (Exception unused) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"", ""});
        }
        String title = videoSubjectPageItem.getTitle();
        String badgeText = videoSubjectPageItem.getBadgeText();
        String str = badgeText == null ? "" : badgeText;
        String subText = videoSubjectPageItem.getSubText();
        return new FabTransformationSheetBehavior(title, str, subText == null ? "" : subText, (String) listRemoteActionCompatParcelizer.get(0), (String) listRemoteActionCompatParcelizer.get(1), videoSubjectPageItem.getId());
    }
}
