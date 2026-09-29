package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.getQuote;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public class getBundle extends toMap {
    private final CourseConfigV2NavDrawerItems AudioAttributesCompatParcelizer;
    private CourseConfigV2EditionSwitch AudioAttributesImplApi26Parcelizer;
    private final getPlanAddOns MediaBrowserCompatCustomActionResultReceiver;
    private setTags MediaBrowserCompatItemReceiver;
    private final getQuestionSource read;
    private Set<CourseConfigV2EditionSwitch> write;

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer() {
        return null;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2ZenAreaItem<getHref> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return null;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onAddQueueItem() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onCommand() {
        return false;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onFastForward() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onPause() {
        return false;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlay() {
        return false;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlayFromMediaId() {
        return false;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlayFromUri() {
        return false;
    }

    @Override // kotlin.getBadge
    public final boolean onPrepareFromSearch() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBundle(getVariant getvariant, getRelatedLessonId getrelatedlessonid, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, getQuestionSource getquestionsource, Collection<getLink> collection, getIntroDurationSeconds getintrodurationseconds, getMini getmini) {
        super(getmini, getvariant, getrelatedlessonid, getintrodurationseconds, false);
        if (getvariant == null) {
            RemoteActionCompatParcelizer(0);
        }
        if (getrelatedlessonid == null) {
            RemoteActionCompatParcelizer(1);
        }
        if (courseConfigV2NavDrawerItems == null) {
            RemoteActionCompatParcelizer(2);
        }
        if (getquestionsource == null) {
            RemoteActionCompatParcelizer(3);
        }
        if (collection == null) {
            RemoteActionCompatParcelizer(4);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(5);
        }
        if (getmini == null) {
            RemoteActionCompatParcelizer(6);
        }
        this.AudioAttributesCompatParcelizer = courseConfigV2NavDrawerItems;
        this.read = getquestionsource;
        this.MediaBrowserCompatCustomActionResultReceiver = new setSubjectIds(this, Collections.emptyList(), collection, getmini);
    }

    public final void read(setTags settags, Set<CourseConfigV2EditionSwitch> set, CourseConfigV2EditionSwitch courseConfigV2EditionSwitch) {
        if (settags == null) {
            RemoteActionCompatParcelizer(7);
        }
        if (set == null) {
            RemoteActionCompatParcelizer(8);
        }
        this.MediaBrowserCompatItemReceiver = settags;
        this.write = set;
        this.AudioAttributesImplApi26Parcelizer = courseConfigV2EditionSwitch;
    }

    @Override // kotlin.fromJSONArray
    public final getQuote RemoteActionCompatParcelizer() {
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        getQuote getquote = getQuote.AudioAttributesCompatParcelizer.read();
        if (getquote == null) {
            RemoteActionCompatParcelizer(9);
        }
        return getquote;
    }

    @Override // kotlin.getQuestionLimit
    public final getPlanAddOns MediaBrowserCompatSearchResultReceiver() {
        getPlanAddOns getplanaddons = this.MediaBrowserCompatCustomActionResultReceiver;
        if (getplanaddons == null) {
            RemoteActionCompatParcelizer(10);
        }
        return getplanaddons;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final Collection<CourseConfigV2EditionSwitch> MediaBrowserCompatCustomActionResultReceiver() {
        Set<CourseConfigV2EditionSwitch> set = this.write;
        if (set == null) {
            RemoteActionCompatParcelizer(11);
        }
        return set;
    }

    @Override // kotlin.getStringArrayMap
    public final setTags IconCompatParcelizer(getCheapestPlan getcheapestplan) {
        if (getcheapestplan == null) {
            RemoteActionCompatParcelizer(12);
        }
        setTags settags = this.MediaBrowserCompatItemReceiver;
        if (settags == null) {
            RemoteActionCompatParcelizer(13);
        }
        return settags;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags MediaMetadataCompat() {
        setTags.write writeVar = setTags.write.RemoteActionCompatParcelizer;
        if (writeVar == null) {
            RemoteActionCompatParcelizer(14);
        }
        return writeVar;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final getQuestionSource AudioAttributesImplBaseParcelizer() {
        getQuestionSource getquestionsource = this.read;
        if (getquestionsource == null) {
            RemoteActionCompatParcelizer(15);
        }
        return getquestionsource;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2EditionSwitch handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems = this.AudioAttributesCompatParcelizer;
        if (courseConfigV2NavDrawerItems == null) {
            RemoteActionCompatParcelizer(16);
        }
        return courseConfigV2NavDrawerItems;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse, kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem;
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            RemoteActionCompatParcelizer(17);
        }
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class ");
        sb.append(aQ_());
        return sb.toString();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.getBadge
    public final List<getBadgeText> MediaBrowserCompatItemReceiver() {
        List<getBadgeText> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            RemoteActionCompatParcelizer(18);
        }
        return listEmptyList;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final Collection<CourseConfigV2CustomModuleQuestionSource> MediaDescriptionCompat() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            RemoteActionCompatParcelizer(19);
        }
        return listEmptyList;
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
