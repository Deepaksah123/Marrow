package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setUploaded extends getBooleanMap implements CourseConfigV2TestTabItem {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getBooleanMap, kotlin.getVariant
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CourseConfigV2SettingsItem onAddQueueItem() {
        return this;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final <V> V IconCompatParcelizer(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer) {
        return null;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver() {
        return null;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return false;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final CourseConfigV2TestTabItem write() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setUploaded(getQuote getquote) {
        super(getquote, getVideoMetaEncrypt.MediaBrowserCompatCustomActionResultReceiver);
        if (getquote == null) {
            read(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setUploaded(getQuote getquote, getRelatedLessonId getrelatedlessonid) {
        super(getquote, getrelatedlessonid);
        if (getquote == null) {
            read(1);
        }
        if (getrelatedlessonid == null) {
            read(2);
        }
    }

    @Override // kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CourseConfigV2TestTabItem write(setDesriptionList setdesriptionlist) {
        getLink getlinkIconCompatParcelizer;
        if (setdesriptionlist == null) {
            read(3);
        }
        if (!setdesriptionlist.read()) {
            if (AudioAttributesImplApi21Parcelizer() instanceof CourseConfigV2CustomModuleQuestionSource) {
                getlinkIconCompatParcelizer = setdesriptionlist.IconCompatParcelizer(onPrepareFromMediaId(), getTotalSubject.OUT_VARIANCE);
            } else {
                getlinkIconCompatParcelizer = setdesriptionlist.IconCompatParcelizer(onPrepareFromMediaId(), getTotalSubject.INVARIANT);
            }
            if (getlinkIconCompatParcelizer == null) {
                return null;
            }
            if (getlinkIconCompatParcelizer != onPrepareFromMediaId()) {
                return new getCorrectnessScore(AudioAttributesImplApi21Parcelizer(), new setMainMcqIds(getlinkIconCompatParcelizer), RemoteActionCompatParcelizer());
            }
        }
        return this;
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.AudioAttributesCompatParcelizer(this, d);
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<CourseConfigV2TestTabItem> read() {
        List<CourseConfigV2TestTabItem> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            read(4);
        }
        return listEmptyList;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<getBadgeText> MediaDescriptionCompat() {
        List<getBadgeText> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            read(5);
        }
        return listEmptyList;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final getLink AudioAttributesImplBaseParcelizer() {
        return onPrepareFromMediaId();
    }

    @Override // kotlin.getLinkedGroupIds
    public final getLink onPrepareFromMediaId() {
        getLink getlinkWrite = IconCompatParcelizer().write();
        if (getlinkWrite == null) {
            read(6);
        }
        return getlinkWrite;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<getMeta> aX_() {
        List<getMeta> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            read(7);
        }
        return listEmptyList;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final Collection<? extends getVideoPageNotesTitle> AudioAttributesImplApi26Parcelizer() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            read(8);
        }
        return setEmptySet;
    }

    @Override // kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = CourseConfigV2NavDrawerItemFaq.AudioAttributesImplApi21Parcelizer;
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            read(9);
        }
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    @Override // kotlin.CourseConfigV2HomePageItems
    public final getIntroDurationSeconds RatingCompat() {
        getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
        if (getintrodurationseconds == null) {
            read(11);
        }
        return getintrodurationseconds;
    }

    private static /* synthetic */ void read(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
