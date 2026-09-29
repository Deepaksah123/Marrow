package kotlin;

import java.util.List;
import kotlin.CourseConfigV2AcademicYear;

/* JADX INFO: loaded from: classes4.dex */
public final class isBookmarkOnTestToolbar extends setStatusUpdateStartTimeMs {

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getStartDate.values().length];
            try {
                iArr[getStartDate.Function.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getStartDate.SuspendFunction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isBookmarkOnTestToolbar(getMini getmini, isTestIntroFooterEnabled istestintrofooterenabled) {
        super(getmini, istestintrofooterenabled);
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(istestintrofooterenabled, "");
    }

    @Override // kotlin.setStatusUpdateStartTimeMs
    public final List<CourseConfigV2NavDrawerItemRateUs> read() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer = IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer, "");
        int i = IconCompatParcelizer.IconCompatParcelizer[((isTestIntroFooterEnabled) courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer).AudioAttributesImplApi26Parcelizer().ordinal()];
        if (i == 1) {
            CourseConfigV2AcademicYear.read readVar = CourseConfigV2AcademicYear.read;
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(CourseConfigV2AcademicYear.read.write((isTestIntroFooterEnabled) IconCompatParcelizer(), false));
        }
        if (i == 2) {
            CourseConfigV2AcademicYear.read readVar2 = CourseConfigV2AcademicYear.read;
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(CourseConfigV2AcademicYear.read.write((isTestIntroFooterEnabled) IconCompatParcelizer(), true));
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }
}
