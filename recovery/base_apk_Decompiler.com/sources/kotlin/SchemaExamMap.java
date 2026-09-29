package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.getQuote;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaExamMap extends toMap {
    private CourseConfigV2NavDrawerItems AudioAttributesCompatParcelizer;
    private final getMini AudioAttributesImplApi21Parcelizer;
    private getPlanAddOns AudioAttributesImplApi26Parcelizer;
    private final Collection<getLink> AudioAttributesImplBaseParcelizer;
    private CourseConfigV2NavDrawerItemFreeExtension MediaBrowserCompatCustomActionResultReceiver;
    private List<getBadgeText> MediaBrowserCompatItemReceiver;
    private final boolean read;
    private final getQuestionSource write;

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer() {
        return null;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2ZenAreaItem<getHref> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return null;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2EditionSwitch handleMediaPlayPauseIfPendingOnHandler() {
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

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final /* synthetic */ Collection MediaBrowserCompatCustomActionResultReceiver() {
        return onRemoveQueueItemAt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchemaExamMap(getVariant getvariant, getQuestionSource getquestionsource, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds, getMini getmini) {
        super(getmini, getvariant, getrelatedlessonid, getintrodurationseconds, false);
        if (getquestionsource == null) {
            RemoteActionCompatParcelizer(1);
        }
        if (getrelatedlessonid == null) {
            RemoteActionCompatParcelizer(2);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(3);
        }
        if (getmini == null) {
            RemoteActionCompatParcelizer(4);
        }
        this.AudioAttributesImplBaseParcelizer = new ArrayList();
        this.AudioAttributesImplApi21Parcelizer = getmini;
        this.write = getquestionsource;
        this.read = false;
    }

    @Override // kotlin.fromJSONArray
    public final getQuote RemoteActionCompatParcelizer() {
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        getQuote getquote = getQuote.AudioAttributesCompatParcelizer.read();
        if (getquote == null) {
            RemoteActionCompatParcelizer(5);
        }
        return getquote;
    }

    public final void write(CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems) {
        if (courseConfigV2NavDrawerItems == null) {
            RemoteActionCompatParcelizer(6);
        }
        this.AudioAttributesCompatParcelizer = courseConfigV2NavDrawerItems;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems = this.AudioAttributesCompatParcelizer;
        if (courseConfigV2NavDrawerItems == null) {
            RemoteActionCompatParcelizer(7);
        }
        return courseConfigV2NavDrawerItems;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final getQuestionSource AudioAttributesImplBaseParcelizer() {
        getQuestionSource getquestionsource = this.write;
        if (getquestionsource == null) {
            RemoteActionCompatParcelizer(8);
        }
        return getquestionsource;
    }

    public final void read(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            RemoteActionCompatParcelizer(9);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = courseConfigV2NavDrawerItemFreeExtension;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse, kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = this.MediaBrowserCompatCustomActionResultReceiver;
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            RemoteActionCompatParcelizer(10);
        }
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    @Override // kotlin.getBadge
    public final boolean onPrepareFromSearch() {
        return this.read;
    }

    @Override // kotlin.getQuestionLimit
    public final getPlanAddOns MediaBrowserCompatSearchResultReceiver() {
        getPlanAddOns getplanaddons = this.AudioAttributesImplApi26Parcelizer;
        if (getplanaddons == null) {
            RemoteActionCompatParcelizer(11);
        }
        return getplanaddons;
    }

    private static Set<CourseConfigV2EditionSwitch> onRemoveQueueItemAt() {
        Set<CourseConfigV2EditionSwitch> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            RemoteActionCompatParcelizer(13);
        }
        return setEmptySet;
    }

    public final void AudioAttributesCompatParcelizer(List<getBadgeText> list) {
        if (list == null) {
            RemoteActionCompatParcelizer(14);
        }
        if (this.MediaBrowserCompatItemReceiver != null) {
            StringBuilder sb = new StringBuilder("Type parameters are already set for ");
            sb.append(aQ_());
            throw new IllegalStateException(sb.toString());
        }
        this.MediaBrowserCompatItemReceiver = new ArrayList(list);
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.getBadge
    public final List<getBadgeText> MediaBrowserCompatItemReceiver() {
        List<getBadgeText> list = this.MediaBrowserCompatItemReceiver;
        if (list == null) {
            RemoteActionCompatParcelizer(15);
        }
        return list;
    }

    public final void write() {
        this.AudioAttributesImplApi26Parcelizer = new setSubjectIds(this, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer);
        Iterator<CourseConfigV2EditionSwitch> it = onRemoveQueueItemAt().iterator();
        while (it.hasNext()) {
            ((NetworkStat) it.next()).write(aP_());
        }
    }

    @Override // kotlin.getStringArrayMap
    public final setTags IconCompatParcelizer(getCheapestPlan getcheapestplan) {
        if (getcheapestplan == null) {
            RemoteActionCompatParcelizer(16);
        }
        setTags.write writeVar = setTags.write.RemoteActionCompatParcelizer;
        if (writeVar == null) {
            RemoteActionCompatParcelizer(17);
        }
        return writeVar;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags MediaMetadataCompat() {
        setTags.write writeVar = setTags.write.RemoteActionCompatParcelizer;
        if (writeVar == null) {
            RemoteActionCompatParcelizer(18);
        }
        return writeVar;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final Collection<CourseConfigV2CustomModuleQuestionSource> MediaDescriptionCompat() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            RemoteActionCompatParcelizer(19);
        }
        return listEmptyList;
    }

    public final String toString() {
        return getBooleanMap.IconCompatParcelizer(this);
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
