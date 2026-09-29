package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public class getRootSubjectId extends getFirstNonEmptyBody implements CourseConfigV2SettingsItems {
    private List<CourseConfigV2TestTabItem> AudioAttributesCompatParcelizer;
    private SchemaKt AudioAttributesImplApi21Parcelizer;
    private CourseConfigV2TestTabItem AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatMediaItem;
    private final boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final boolean MediaDescriptionCompat;
    private final getTestHeaderTitle.RemoteActionCompatParcelizer MediaMetadataCompat;
    private final boolean RatingCompat;
    private CourseConfigV2NavDrawerItemKnowMore RemoteActionCompatParcelizer;
    private Collection<? extends CourseConfigV2SettingsItems> handleMediaPlayPauseIfPendingOnHandler;
    private final CourseConfigV2NavDrawerItems onAddQueueItem;
    private final CourseConfigV2SettingsItems onCommand;
    private getAppSettings onCustomAction;
    private List<getBadgeText> onPause;
    private CourseConfigV2NavDrawerItemFreeExtension onPlayFromMediaId;
    private CourseConfigV2NavDrawerItemKnowMore read;

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public <V> V IconCompatParcelizer(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer) {
        return null;
    }

    @Override // kotlin.getTestHeaderTitle
    public final /* synthetic */ getTestHeaderTitle write(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return IconCompatParcelizer(getvariant, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, remoteActionCompatParcelizer, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRootSubjectId(getVariant getvariant, CourseConfigV2SettingsItems courseConfigV2SettingsItems, getQuote getquote, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, boolean z, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(getvariant, getquote, getrelatedlessonid, z, getintrodurationseconds);
        if (getvariant == null) {
            IconCompatParcelizer(0);
        }
        if (getquote == null) {
            IconCompatParcelizer(1);
        }
        if (courseConfigV2NavDrawerItems == null) {
            IconCompatParcelizer(2);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            IconCompatParcelizer(3);
        }
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(4);
        }
        if (remoteActionCompatParcelizer == null) {
            IconCompatParcelizer(5);
        }
        if (getintrodurationseconds == null) {
            IconCompatParcelizer(6);
        }
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        this.AudioAttributesCompatParcelizer = Collections.emptyList();
        this.onAddQueueItem = courseConfigV2NavDrawerItems;
        this.onPlayFromMediaId = courseConfigV2NavDrawerItemFreeExtension;
        this.onCommand = courseConfigV2SettingsItems == null ? this : courseConfigV2SettingsItems;
        this.MediaMetadataCompat = remoteActionCompatParcelizer;
        this.RatingCompat = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.MediaBrowserCompatSearchResultReceiver = z4;
        this.AudioAttributesImplBaseParcelizer = z5;
        this.MediaBrowserCompatMediaItem = z6;
        this.MediaDescriptionCompat = z7;
    }

    public static getRootSubjectId IconCompatParcelizer(getVariant getvariant, getQuote getquote, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, boolean z, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds) {
        if (getvariant == null) {
            IconCompatParcelizer(7);
        }
        if (getquote == null) {
            IconCompatParcelizer(8);
        }
        if (courseConfigV2NavDrawerItems == null) {
            IconCompatParcelizer(9);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            IconCompatParcelizer(10);
        }
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(11);
        }
        if (remoteActionCompatParcelizer == null) {
            IconCompatParcelizer(12);
        }
        if (getintrodurationseconds == null) {
            IconCompatParcelizer(13);
        }
        return new getRootSubjectId(getvariant, null, getquote, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, z, getrelatedlessonid, remoteActionCompatParcelizer, getintrodurationseconds, false, false, false, false, false, false);
    }

    public final void write(getLink getlink, List<? extends getBadgeText> list, CourseConfigV2TestTabItem courseConfigV2TestTabItem, CourseConfigV2TestTabItem courseConfigV2TestTabItem2, List<CourseConfigV2TestTabItem> list2) {
        if (getlink == null) {
            IconCompatParcelizer(17);
        }
        if (list == null) {
            IconCompatParcelizer(18);
        }
        if (list2 == null) {
            IconCompatParcelizer(19);
        }
        IconCompatParcelizer(getlink);
        this.onPause = new ArrayList(list);
        this.MediaBrowserCompatCustomActionResultReceiver = courseConfigV2TestTabItem2;
        this.AudioAttributesImplApi26Parcelizer = courseConfigV2TestTabItem;
        this.AudioAttributesCompatParcelizer = list2;
    }

    public final void read(SchemaKt schemaKt, getAppSettings getappsettings) {
        write(schemaKt, getappsettings, (CourseConfigV2NavDrawerItemKnowMore) null, (CourseConfigV2NavDrawerItemKnowMore) null);
    }

    public final void write(SchemaKt schemaKt, getAppSettings getappsettings, CourseConfigV2NavDrawerItemKnowMore courseConfigV2NavDrawerItemKnowMore, CourseConfigV2NavDrawerItemKnowMore courseConfigV2NavDrawerItemKnowMore2) {
        this.AudioAttributesImplApi21Parcelizer = schemaKt;
        this.onCustomAction = getappsettings;
        this.read = courseConfigV2NavDrawerItemKnowMore;
        this.RemoteActionCompatParcelizer = courseConfigV2NavDrawerItemKnowMore2;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }

    public final void IconCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            IconCompatParcelizer(20);
        }
        this.onPlayFromMediaId = courseConfigV2NavDrawerItemFreeExtension;
    }

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final List<getBadgeText> MediaDescriptionCompat() {
        List<getBadgeText> list = this.onPause;
        if (list != null) {
            if (list == null) {
                IconCompatParcelizer(21);
            }
            return list;
        }
        StringBuilder sb = new StringBuilder("typeParameters == null for ");
        sb.append(toString());
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final List<CourseConfigV2TestTabItem> read() {
        List<CourseConfigV2TestTabItem> list = this.AudioAttributesCompatParcelizer;
        if (list == null) {
            IconCompatParcelizer(22);
        }
        return list;
    }

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final CourseConfigV2TestTabItem write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final getLink AudioAttributesImplBaseParcelizer() {
        getLink getlinkOnPrepareFromMediaId = onPrepareFromMediaId();
        if (getlinkOnPrepareFromMediaId == null) {
            IconCompatParcelizer(23);
        }
        return getlinkOnPrepareFromMediaId;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems = this.onAddQueueItem;
        if (courseConfigV2NavDrawerItems == null) {
            IconCompatParcelizer(24);
        }
        return courseConfigV2NavDrawerItems;
    }

    @Override // kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = this.onPlayFromMediaId;
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            IconCompatParcelizer(25);
        }
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    @Override // kotlin.CourseConfigV2SettingsItems
    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: merged with bridge method [inline-methods] */
    public final SchemaKt onPlayFromMediaId() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.CourseConfigV2SettingsItems
    public final getAppSettings onPlayFromSearch() {
        return this.onCustomAction;
    }

    public final boolean onRemoveQueueItem() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.Editor
    public final boolean onPrepare() {
        return this.RatingCompat;
    }

    @Override // kotlin.ContentBody, kotlin.Editor
    public boolean onPlayFromUri() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public boolean onMediaButtonEvent() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.asDataSet
    public final boolean onSeekTo() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.CourseConfigV2SettingsItems
    public final List<getAllSettings> IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList(2);
        SchemaKt schemaKt = this.AudioAttributesImplApi21Parcelizer;
        if (schemaKt != null) {
            arrayList.add(schemaKt);
        }
        getAppSettings getappsettings = this.onCustomAction;
        if (getappsettings != null) {
            arrayList.add(getappsettings);
        }
        return arrayList;
    }

    @Override // kotlin.ContentBody, kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CourseConfigV2SettingsItems write(setDesriptionList setdesriptionlist) {
        if (setdesriptionlist == null) {
            IconCompatParcelizer(27);
        }
        return setdesriptionlist.read() ? this : onSetCaptioningEnabled().RemoteActionCompatParcelizer(setdesriptionlist.AudioAttributesCompatParcelizer()).read(onAddQueueItem()).AudioAttributesCompatParcelizer();
    }

    public class AudioAttributesCompatParcelizer {
        private getRelatedLessonId AudioAttributesCompatParcelizer;
        private getTestHeaderTitle.RemoteActionCompatParcelizer IconCompatParcelizer;
        private getVariant MediaBrowserCompatCustomActionResultReceiver;
        private getLink MediaBrowserCompatItemReceiver;
        private CourseConfigV2NavDrawerItemFreeExtension MediaDescriptionCompat;
        private CourseConfigV2TestTabItem read;
        private CourseConfigV2NavDrawerItems write;
        private CourseConfigV2SettingsItems AudioAttributesImplApi26Parcelizer = null;
        private boolean AudioAttributesImplBaseParcelizer = false;
        private isVideoPlanCtype RatingCompat = isVideoPlanCtype.write;
        private boolean RemoteActionCompatParcelizer = true;
        private List<getBadgeText> AudioAttributesImplApi21Parcelizer = null;

        public AudioAttributesCompatParcelizer() {
            this.MediaBrowserCompatCustomActionResultReceiver = getRootSubjectId.this.onPlayFromMediaId();
            this.write = getRootSubjectId.this.MediaBrowserCompatMediaItem();
            this.MediaDescriptionCompat = getRootSubjectId.this.onCustomAction();
            this.IconCompatParcelizer = getRootSubjectId.this.handleMediaPlayPauseIfPendingOnHandler();
            this.read = getRootSubjectId.this.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesCompatParcelizer = getRootSubjectId.this.aQ_();
            this.MediaBrowserCompatItemReceiver = getRootSubjectId.this.onPrepareFromMediaId();
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(getVariant getvariant) {
            if (getvariant == null) {
                RemoteActionCompatParcelizer(0);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = getvariant;
            return this;
        }

        public final AudioAttributesCompatParcelizer read(getTestHeaderTitle gettestheadertitle) {
            this.AudioAttributesImplApi26Parcelizer = (CourseConfigV2SettingsItems) gettestheadertitle;
            return this;
        }

        public final AudioAttributesCompatParcelizer write(CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems) {
            if (courseConfigV2NavDrawerItems == null) {
                RemoteActionCompatParcelizer(6);
            }
            this.write = courseConfigV2NavDrawerItems;
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
            if (courseConfigV2NavDrawerItemFreeExtension == null) {
                RemoteActionCompatParcelizer(8);
            }
            this.MediaDescriptionCompat = courseConfigV2NavDrawerItemFreeExtension;
            return this;
        }

        public final AudioAttributesCompatParcelizer write(getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (remoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer(10);
            }
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(isVideoPlanCtype isvideoplanctype) {
            if (isvideoplanctype == null) {
                RemoteActionCompatParcelizer(15);
            }
            this.RatingCompat = isvideoplanctype;
            return this;
        }

        public final AudioAttributesCompatParcelizer write(boolean z) {
            this.RemoteActionCompatParcelizer = z;
            return this;
        }

        public final CourseConfigV2SettingsItems AudioAttributesCompatParcelizer() {
            return getRootSubjectId.this.AudioAttributesCompatParcelizer(this);
        }

        final CourseConfigV2TestItem IconCompatParcelizer() {
            CourseConfigV2SettingsItems courseConfigV2SettingsItems = this.AudioAttributesImplApi26Parcelizer;
            if (courseConfigV2SettingsItems == null) {
                return null;
            }
            return courseConfigV2SettingsItems.onPlayFromMediaId();
        }

        final getAppSettings read() {
            CourseConfigV2SettingsItems courseConfigV2SettingsItems = this.AudioAttributesImplApi26Parcelizer;
            if (courseConfigV2SettingsItems == null) {
                return null;
            }
            return courseConfigV2SettingsItems.onPlayFromSearch();
        }

        private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }
    }

    private AudioAttributesCompatParcelizer onSetCaptioningEnabled() {
        return new AudioAttributesCompatParcelizer();
    }

    private getIntroDurationSeconds IconCompatParcelizer(boolean z, CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        getIntroDurationSeconds getintrodurationsecondsRatingCompat;
        if (z) {
            if (courseConfigV2SettingsItems == null) {
                courseConfigV2SettingsItems = onAddQueueItem();
            }
            getintrodurationsecondsRatingCompat = courseConfigV2SettingsItems.RatingCompat();
        } else {
            getintrodurationsecondsRatingCompat = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
        }
        if (getintrodurationsecondsRatingCompat == null) {
            IconCompatParcelizer(28);
        }
        return getintrodurationsecondsRatingCompat;
    }

    protected final CourseConfigV2SettingsItems AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItem;
        getRootSubjectId getrootsubjectidIconCompatParcelizer = IconCompatParcelizer(audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver, audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer.MediaDescriptionCompat, audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer, audioAttributesCompatParcelizer.IconCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, IconCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer));
        List<getBadgeText> listMediaDescriptionCompat = audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer == null ? MediaDescriptionCompat() : audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        ArrayList arrayList = new ArrayList(listMediaDescriptionCompat.size());
        setDesriptionList setdesriptionlistWrite = PearlListItem.write(listMediaDescriptionCompat, audioAttributesCompatParcelizer.RatingCompat, getrootsubjectidIconCompatParcelizer, arrayList);
        getLink getlink = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
        getLink getlinkIconCompatParcelizer = setdesriptionlistWrite.IconCompatParcelizer(getlink, getTotalSubject.OUT_VARIANCE);
        if (getlinkIconCompatParcelizer == null) {
            return null;
        }
        getLink getlinkIconCompatParcelizer2 = setdesriptionlistWrite.IconCompatParcelizer(getlink, getTotalSubject.IN_VARIANCE);
        if (getlinkIconCompatParcelizer2 != null) {
            getrootsubjectidIconCompatParcelizer.write(getlinkIconCompatParcelizer2);
        }
        CourseConfigV2TestTabItem courseConfigV2TestTabItem2 = audioAttributesCompatParcelizer.read;
        if (courseConfigV2TestTabItem2 != null) {
            CourseConfigV2TestTabItem courseConfigV2TestTabItemWrite = courseConfigV2TestTabItem2.write(setdesriptionlistWrite);
            if (courseConfigV2TestTabItemWrite == null) {
                return null;
            }
            courseConfigV2TestTabItem = courseConfigV2TestTabItemWrite;
        } else {
            courseConfigV2TestTabItem = null;
        }
        CourseConfigV2TestTabItem courseConfigV2TestTabItem3 = this.MediaBrowserCompatCustomActionResultReceiver;
        CourseConfigV2TestTabItem courseConfigV2TestTabItemWrite2 = courseConfigV2TestTabItem3 != null ? write(setdesriptionlistWrite, getrootsubjectidIconCompatParcelizer, courseConfigV2TestTabItem3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<CourseConfigV2TestTabItem> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            CourseConfigV2TestTabItem courseConfigV2TestTabItemRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setdesriptionlistWrite, getrootsubjectidIconCompatParcelizer, it.next());
            if (courseConfigV2TestTabItemRemoteActionCompatParcelizer != null) {
                arrayList2.add(courseConfigV2TestTabItemRemoteActionCompatParcelizer);
            }
        }
        getrootsubjectidIconCompatParcelizer.write(getlinkIconCompatParcelizer, arrayList, courseConfigV2TestTabItem, courseConfigV2TestTabItemWrite2, arrayList2);
        SchemaKt schemaKt = this.AudioAttributesImplApi21Parcelizer;
        SchemaKt schemaKt2 = schemaKt == null ? null : new SchemaKt(getrootsubjectidIconCompatParcelizer, schemaKt.RemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.write, read(this.AudioAttributesImplApi21Parcelizer.onCustomAction(), audioAttributesCompatParcelizer.IconCompatParcelizer), this.AudioAttributesImplApi21Parcelizer.onPlay(), this.AudioAttributesImplApi21Parcelizer.onMediaButtonEvent(), this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), audioAttributesCompatParcelizer.IconCompatParcelizer, audioAttributesCompatParcelizer.IconCompatParcelizer(), getIntroDurationSeconds.AudioAttributesCompatParcelizer);
        if (schemaKt2 != null) {
            getLink getlinkAudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplBaseParcelizer();
            schemaKt2.IconCompatParcelizer(write(setdesriptionlistWrite, this.AudioAttributesImplApi21Parcelizer));
            schemaKt2.write(getlinkAudioAttributesImplBaseParcelizer != null ? setdesriptionlistWrite.IconCompatParcelizer(getlinkAudioAttributesImplBaseParcelizer, getTotalSubject.OUT_VARIANCE) : null);
        }
        getAppSettings getappsettings = this.onCustomAction;
        getSchemaId getschemaid = getappsettings == null ? null : new getSchemaId(getrootsubjectidIconCompatParcelizer, getappsettings.RemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.write, read(this.onCustomAction.onCustomAction(), audioAttributesCompatParcelizer.IconCompatParcelizer), this.onCustomAction.onPlay(), this.onCustomAction.onMediaButtonEvent(), this.onCustomAction.AudioAttributesCompatParcelizer(), audioAttributesCompatParcelizer.IconCompatParcelizer, audioAttributesCompatParcelizer.read(), getIntroDurationSeconds.AudioAttributesCompatParcelizer);
        if (getschemaid != null) {
            List<getMeta> listAudioAttributesCompatParcelizer = getIntegerMap.AudioAttributesCompatParcelizer(getschemaid, this.onCustomAction.aX_(), setdesriptionlistWrite, false, false, null);
            if (listAudioAttributesCompatParcelizer == null) {
                getrootsubjectidIconCompatParcelizer.AudioAttributesCompatParcelizer(true);
                listAudioAttributesCompatParcelizer = Collections.singletonList(getSchemaId.AudioAttributesCompatParcelizer(getschemaid, setLocked.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), this.onCustomAction.aX_().get(0).RemoteActionCompatParcelizer()));
            }
            if (listAudioAttributesCompatParcelizer.size() != 1) {
                throw new IllegalStateException();
            }
            getschemaid.IconCompatParcelizer(write(setdesriptionlistWrite, this.onCustomAction));
            getschemaid.IconCompatParcelizer(listAudioAttributesCompatParcelizer.get(0));
        }
        CourseConfigV2NavDrawerItemKnowMore courseConfigV2NavDrawerItemKnowMore = this.read;
        getSerializableMap getserializablemap = courseConfigV2NavDrawerItemKnowMore == null ? null : new getSerializableMap(courseConfigV2NavDrawerItemKnowMore.RemoteActionCompatParcelizer(), getrootsubjectidIconCompatParcelizer);
        CourseConfigV2NavDrawerItemKnowMore courseConfigV2NavDrawerItemKnowMore2 = this.RemoteActionCompatParcelizer;
        getrootsubjectidIconCompatParcelizer.write(schemaKt2, getschemaid, getserializablemap, courseConfigV2NavDrawerItemKnowMore2 != null ? new getSerializableMap(courseConfigV2NavDrawerItemKnowMore2.RemoteActionCompatParcelizer(), getrootsubjectidIconCompatParcelizer) : null);
        if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
            Tag tagRemoteActionCompatParcelizer = Tag.RemoteActionCompatParcelizer();
            Iterator<? extends getVideoPageNotesTitle> it2 = AudioAttributesImplApi26Parcelizer().iterator();
            while (it2.hasNext()) {
                tagRemoteActionCompatParcelizer.add(((CourseConfigV2SettingsItems) it2.next()).write(setdesriptionlistWrite));
            }
            getrootsubjectidIconCompatParcelizer.write(tagRemoteActionCompatParcelizer);
        }
        if (onPlayFromUri() && this.write != null) {
            getrootsubjectidIconCompatParcelizer.AudioAttributesCompatParcelizer(((getFirstNonEmptyBody) this).IconCompatParcelizer, this.write);
        }
        return getrootsubjectidIconCompatParcelizer;
    }

    private static CourseConfigV2NavDrawerItemFreeExtension read(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return (remoteActionCompatParcelizer == getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE && CourseConfigV2NavDrawerItemFaq.write(courseConfigV2NavDrawerItemFreeExtension.IconCompatParcelizer())) ? CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatItemReceiver : courseConfigV2NavDrawerItemFreeExtension;
    }

    private static CourseConfigV2TestTabItem write(setDesriptionList setdesriptionlist, CourseConfigV2SettingsItems courseConfigV2SettingsItems, CourseConfigV2TestTabItem courseConfigV2TestTabItem) {
        getLink getlinkIconCompatParcelizer = setdesriptionlist.IconCompatParcelizer(courseConfigV2TestTabItem.onPrepareFromMediaId(), getTotalSubject.IN_VARIANCE);
        if (getlinkIconCompatParcelizer == null) {
            return null;
        }
        return new getCorrectnessScore(courseConfigV2SettingsItems, new getMainMcqIds(courseConfigV2SettingsItems, getlinkIconCompatParcelizer, courseConfigV2TestTabItem.IconCompatParcelizer()), courseConfigV2TestTabItem.RemoteActionCompatParcelizer());
    }

    private static CourseConfigV2TestTabItem RemoteActionCompatParcelizer(setDesriptionList setdesriptionlist, CourseConfigV2SettingsItems courseConfigV2SettingsItems, CourseConfigV2TestTabItem courseConfigV2TestTabItem) {
        getLink getlinkIconCompatParcelizer = setdesriptionlist.IconCompatParcelizer(courseConfigV2TestTabItem.onPrepareFromMediaId(), getTotalSubject.IN_VARIANCE);
        if (getlinkIconCompatParcelizer == null) {
            return null;
        }
        return new getCorrectnessScore(courseConfigV2SettingsItems, new getAnsweredCount(courseConfigV2SettingsItems, getlinkIconCompatParcelizer, ((getPlaybackIndex) courseConfigV2TestTabItem.IconCompatParcelizer()).RemoteActionCompatParcelizer(), courseConfigV2TestTabItem.IconCompatParcelizer()), courseConfigV2TestTabItem.RemoteActionCompatParcelizer());
    }

    private static CourseConfigV2NavDrawerItemRateUs write(setDesriptionList setdesriptionlist, getAllSettings getallsettings) {
        if (setdesriptionlist == null) {
            IconCompatParcelizer(30);
        }
        if (getallsettings == null) {
            IconCompatParcelizer(31);
        }
        if (getallsettings.onPlayFromSearch() != null) {
            return getallsettings.onPlayFromSearch().write(setdesriptionlist);
        }
        return null;
    }

    protected getRootSubjectId IconCompatParcelizer(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, CourseConfigV2SettingsItems courseConfigV2SettingsItems, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds) {
        if (getvariant == null) {
            IconCompatParcelizer(32);
        }
        if (courseConfigV2NavDrawerItems == null) {
            IconCompatParcelizer(33);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            IconCompatParcelizer(34);
        }
        if (remoteActionCompatParcelizer == null) {
            IconCompatParcelizer(35);
        }
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(36);
        }
        if (getintrodurationseconds == null) {
            IconCompatParcelizer(37);
        }
        return new getRootSubjectId(getvariant, courseConfigV2SettingsItems, RemoteActionCompatParcelizer(), courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, onRewind(), getrelatedlessonid, remoteActionCompatParcelizer, getintrodurationseconds, onPrepare(), onPlayFromUri(), onPause(), onCommand(), onMediaButtonEvent(), onSeekTo());
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.read(this, d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.CourseConfigV2SettingsItems] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.ContentBody
    /* JADX INFO: renamed from: onPlay, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final CourseConfigV2SettingsItems onAddQueueItem() {
        CourseConfigV2SettingsItems courseConfigV2SettingsItems = this.onCommand;
        ?? OnAddQueueItem = this;
        if (courseConfigV2SettingsItems != this) {
            OnAddQueueItem = courseConfigV2SettingsItems.onAddQueueItem();
        }
        if (OnAddQueueItem == 0) {
            IconCompatParcelizer(38);
        }
        return OnAddQueueItem;
    }

    @Override // kotlin.getTestHeaderTitle
    public final getTestHeaderTitle.RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler() {
        getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaMetadataCompat;
        if (remoteActionCompatParcelizer == null) {
            IconCompatParcelizer(39);
        }
        return remoteActionCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onPause() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onCommand() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.CourseConfigV2SettingsItems
    public final CourseConfigV2NavDrawerItemKnowMore MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.read;
    }

    @Override // kotlin.CourseConfigV2SettingsItems
    public final CourseConfigV2NavDrawerItemKnowMore onFastForward() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getTestHeaderTitle
    public final void write(Collection<? extends getTestHeaderTitle> collection) {
        if (collection == 0) {
            IconCompatParcelizer(40);
        }
        this.handleMediaPlayPauseIfPendingOnHandler = collection;
    }

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final Collection<? extends CourseConfigV2SettingsItems> AudioAttributesImplApi26Parcelizer() {
        Collection<? extends CourseConfigV2SettingsItems> collectionEmptyList = this.handleMediaPlayPauseIfPendingOnHandler;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            IconCompatParcelizer(41);
        }
        return collectionEmptyList;
    }

    public final CourseConfigV2SettingsItems IconCompatParcelizer(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        CourseConfigV2SettingsItems courseConfigV2SettingsItemsAudioAttributesCompatParcelizer = onSetCaptioningEnabled().RemoteActionCompatParcelizer(getvariant).read((getTestHeaderTitle) null).write(courseConfigV2NavDrawerItems).AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension).write(remoteActionCompatParcelizer).write(false).AudioAttributesCompatParcelizer();
        if (courseConfigV2SettingsItemsAudioAttributesCompatParcelizer == null) {
            IconCompatParcelizer(42);
        }
        return courseConfigV2SettingsItemsAudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void IconCompatParcelizer(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRootSubjectId.IconCompatParcelizer(int):void");
    }

    public void write(getLink getlink) {
        if (getlink == null) {
            IconCompatParcelizer(14);
        }
    }
}
