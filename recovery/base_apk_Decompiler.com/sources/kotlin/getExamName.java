package kotlin;

import android.os.Process;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.CourseConfigV2NavDrawerItemRateUs;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes.dex */
public abstract class getExamName extends PresenterBundle implements getAllSettings {
    public static int RemoteActionCompatParcelizer;
    public static int write;
    private boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private CourseConfigV2NavDrawerItemFreeExtension AudioAttributesImplApi26Parcelizer;
    private final getTestHeaderTitle.RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer;
    private CourseConfigV2NavDrawerItemRateUs IconCompatParcelizer;
    private final CourseConfigV2NavDrawerItems MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final CourseConfigV2SettingsItems read;

    @Override // kotlin.getVideoPageNotesTitle
    public final <V> V IconCompatParcelizer(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer) {
        return null;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onCommand() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    /* JADX INFO: renamed from: onFastForward, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract getAllSettings onPrepareFromMediaId();

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onPause() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onPlayFromUri() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onPrepare() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onPrepareFromSearch() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onPrepareFromUri() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onSeekTo() {
        return false;
    }

    @Override // kotlin.getTestHeaderTitle
    public final /* synthetic */ getTestHeaderTitle write(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return onRewind();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getExamName(CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, getRelatedLessonId getrelatedlessonid, boolean z, boolean z2, boolean z3, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds) {
        super(courseConfigV2SettingsItems.AudioAttributesImplApi21Parcelizer(), getquote, getrelatedlessonid, getintrodurationseconds);
        if (courseConfigV2NavDrawerItems == null) {
            write(0);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            write(1);
        }
        if (courseConfigV2SettingsItems == null) {
            write(2);
        }
        if (getquote == null) {
            write(3);
        }
        if (getrelatedlessonid == null) {
            write(4);
        }
        if (getintrodurationseconds == null) {
            write(5);
        }
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompatCustomActionResultReceiver = courseConfigV2NavDrawerItems;
        this.AudioAttributesImplApi26Parcelizer = courseConfigV2NavDrawerItemFreeExtension;
        this.read = courseConfigV2SettingsItems;
        this.AudioAttributesCompatParcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer;
    }

    @Override // kotlin.getAllSettings
    public final boolean onPlay() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void onPlayFromMediaId() {
        this.AudioAttributesCompatParcelizer = false;
    }

    @Override // kotlin.getTestHeaderTitle
    public final getTestHeaderTitle.RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler() {
        getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (remoteActionCompatParcelizer == null) {
            write(6);
        }
        return remoteActionCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onMediaButtonEvent() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<getBadgeText> MediaDescriptionCompat() {
        List<getBadgeText> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            write(9);
        }
        return listEmptyList;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems = this.MediaBrowserCompatCustomActionResultReceiver;
        if (courseConfigV2NavDrawerItems == null) {
            write(10);
        }
        return courseConfigV2NavDrawerItems;
    }

    @Override // kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = this.AudioAttributesImplApi26Parcelizer;
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            write(11);
        }
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    public final void IconCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        this.AudioAttributesImplApi26Parcelizer = courseConfigV2NavDrawerItemFreeExtension;
    }

    @Override // kotlin.getAllSettings
    public final CourseConfigV2SettingsItems MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        CourseConfigV2SettingsItems courseConfigV2SettingsItems = this.read;
        if (courseConfigV2SettingsItems == null) {
            write(13);
        }
        return courseConfigV2SettingsItems;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<CourseConfigV2TestTabItem> read() {
        List<CourseConfigV2TestTabItem> list = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read();
        if (list == null) {
            write(14);
        }
        return list;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final CourseConfigV2TestTabItem write() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write();
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final CourseConfigV2NavDrawerItemRateUs.write<? extends CourseConfigV2NavDrawerItemRateUs> onRemoveQueueItemAt() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    private static getAllSettings onRewind() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    protected final Collection<getAllSettings> AudioAttributesCompatParcelizer(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (CourseConfigV2SettingsItems courseConfigV2SettingsItems : MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesImplApi26Parcelizer()) {
            CourseConfigV2NavDrawerItemAboutUs courseConfigV2NavDrawerItemAboutUsOnPlayFromMediaId = z ? courseConfigV2SettingsItems.onPlayFromMediaId() : courseConfigV2SettingsItems.onPlayFromSearch();
            if (courseConfigV2NavDrawerItemAboutUsOnPlayFromMediaId != null) {
                arrayList.add(courseConfigV2NavDrawerItemAboutUsOnPlayFromMediaId);
            }
        }
        return arrayList;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final CourseConfigV2NavDrawerItemRateUs onPlayFromSearch() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        this.IconCompatParcelizer = courseConfigV2NavDrawerItemRateUs;
    }

    private static /* synthetic */ void write(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.getTestHeaderTitle
    public final void write(Collection<? extends getTestHeaderTitle> collection) {
        if (collection == null) {
            write(16);
        }
    }

    @Override // kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CourseConfigV2NavDrawerItemRateUs write(setDesriptionList setdesriptionlist) {
        if (setdesriptionlist == null) {
            write(7);
        }
        return this;
    }

    public static int onRemoveQueueItem() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 6400377;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iMyUid = Process.myUid();
        write = iMyUid;
        return iMyUid;
    }
}
