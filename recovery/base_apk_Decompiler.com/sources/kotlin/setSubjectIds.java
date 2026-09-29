package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.CourseConfigV2VideoSubjectPageItem;

/* JADX INFO: loaded from: classes4.dex */
public final class setSubjectIds extends getPearlDisplayId {
    private final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer;
    private final List<getBadgeText> IconCompatParcelizer;
    private final Collection<getLink> RemoteActionCompatParcelizer;

    @Override // kotlin.getPlanAddOns
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return true;
    }

    @Override // kotlin.getPearlDisplayId, kotlin.setPearlType, kotlin.getPlanAddOns
    public final /* synthetic */ getQuestionLimit RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSubjectIds(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, List<? extends getBadgeText> list, Collection<getLink> collection, getMini getmini) {
        super(getmini);
        if (list == null) {
            read(1);
        }
        if (collection == null) {
            read(2);
        }
        if (getmini == null) {
            read(3);
        }
        this.AudioAttributesCompatParcelizer = courseConfigV2CustomModuleQuestionSource;
        this.IconCompatParcelizer = Collections.unmodifiableList(new ArrayList(list));
        this.RemoteActionCompatParcelizer = Collections.unmodifiableCollection(collection);
    }

    @Override // kotlin.getPlanAddOns
    public final List<getBadgeText> AudioAttributesCompatParcelizer() {
        List<getBadgeText> list = this.IconCompatParcelizer;
        if (list == null) {
            read(4);
        }
        return list;
    }

    public final String toString() {
        return getAnswerDescription.RemoteActionCompatParcelizer((getVariant) this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getPearlDisplayId
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = this.AudioAttributesCompatParcelizer;
        if (courseConfigV2CustomModuleQuestionSource == null) {
            read(5);
        }
        return courseConfigV2CustomModuleQuestionSource;
    }

    @Override // kotlin.isHtmlPearl
    protected final Collection<getLink> read() {
        Collection<getLink> collection = this.RemoteActionCompatParcelizer;
        if (collection == null) {
            read(6);
        }
        return collection;
    }

    @Override // kotlin.isHtmlPearl
    protected final CourseConfigV2VideoSubjectPageItem write() {
        CourseConfigV2VideoSubjectPageItem.read readVar = CourseConfigV2VideoSubjectPageItem.read.read;
        if (readVar == null) {
            read(7);
        }
        return readVar;
    }

    private static /* synthetic */ void read(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
