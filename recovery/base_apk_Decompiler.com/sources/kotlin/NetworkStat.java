package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkStat extends getIntegerMap implements CourseConfigV2EditionSwitch {
    public final boolean write;

    @Override // kotlin.getIntegerMap
    protected /* synthetic */ getIntegerMap read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        return write(getvariant, courseConfigV2NavDrawerItemRateUs, remoteActionCompatParcelizer, getquote, getintrodurationseconds);
    }

    @Override // kotlin.getIntegerMap, kotlin.getTestHeaderTitle
    public final /* synthetic */ getTestHeaderTitle write(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return AudioAttributesCompatParcelizer(getvariant, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, remoteActionCompatParcelizer, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStat(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard, getQuote getquote, boolean z, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds) {
        super(courseConfigV2CustomModuleQuestionSource, courseConfigV2GtAnalyticsCard, getquote, getVideoMetaEncrypt.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer, getintrodurationseconds);
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(0);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(1);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(2);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(3);
        }
        this.write = z;
    }

    public static NetworkStat AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        if (getquote == null) {
            AudioAttributesCompatParcelizer(5);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(6);
        }
        return new NetworkStat(courseConfigV2CustomModuleQuestionSource, null, getquote, true, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, getintrodurationseconds);
    }

    public final NetworkStat RemoteActionCompatParcelizer(List<getMeta> list, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, List<getBadgeText> list2) {
        if (list == null) {
            AudioAttributesCompatParcelizer(10);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            AudioAttributesCompatParcelizer(11);
        }
        if (list2 == null) {
            AudioAttributesCompatParcelizer(12);
        }
        super.read(null, onSetCaptioningEnabled(), onSetRepeatMode(), list2, list, null, CourseConfigV2NavDrawerItems.FINAL, courseConfigV2NavDrawerItemFreeExtension);
        return this;
    }

    public final NetworkStat read(List<getMeta> list, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        if (list == null) {
            AudioAttributesCompatParcelizer(13);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            AudioAttributesCompatParcelizer(14);
        }
        RemoteActionCompatParcelizer(list, courseConfigV2NavDrawerItemFreeExtension, AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver());
        return this;
    }

    private CourseConfigV2TestTabItem onSetCaptioningEnabled() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (!courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer.onPrepareFromSearch()) {
            return null;
        }
        getVariant getvariantOnPlayFromMediaId = courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer.onPlayFromMediaId();
        if (getvariantOnPlayFromMediaId instanceof CourseConfigV2CustomModuleQuestionSource) {
            return ((CourseConfigV2CustomModuleQuestionSource) getvariantOnPlayFromMediaId).onPlayFromSearch();
        }
        return null;
    }

    private List<CourseConfigV2TestTabItem> onSetRepeatMode() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (!courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer.onPrepare().isEmpty()) {
            List<CourseConfigV2TestTabItem> listOnPrepare = courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer.onPrepare();
            if (listOnPrepare == null) {
                AudioAttributesCompatParcelizer(15);
            }
            return listOnPrepare;
        }
        List<CourseConfigV2TestTabItem> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            AudioAttributesCompatParcelizer(16);
        }
        return listEmptyList;
    }

    @Override // kotlin.CourseConfigV2GtAnalyticsCard
    /* JADX INFO: renamed from: onRemoveQueueItem, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final CourseConfigV2CustomModuleQuestionSource onPlayFromMediaId() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) super.onPlayFromMediaId();
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(17);
        }
        return courseConfigV2CustomModuleQuestionSource;
    }

    @Override // kotlin.CourseConfigV2GtAnalyticsCard
    public final CourseConfigV2CustomModuleQuestionSource onFastForward() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer == null) {
            AudioAttributesCompatParcelizer(18);
        }
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final CourseConfigV2EditionSwitch aS_() {
        CourseConfigV2EditionSwitch courseConfigV2EditionSwitch = (CourseConfigV2EditionSwitch) super.aS_();
        if (courseConfigV2EditionSwitch == null) {
            AudioAttributesCompatParcelizer(19);
        }
        return courseConfigV2EditionSwitch;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final CourseConfigV2EditionSwitch write(setDesriptionList setdesriptionlist) {
        if (setdesriptionlist == null) {
            AudioAttributesCompatParcelizer(20);
        }
        return (CourseConfigV2EditionSwitch) super.write(setdesriptionlist);
    }

    @Override // kotlin.getIntegerMap, kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.IconCompatParcelizer((CourseConfigV2GtAnalyticsCard) this, (Object) d);
    }

    @Override // kotlin.CourseConfigV2GtAnalyticsCard
    public final boolean onPlay() {
        return this.write;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs, kotlin.getTestHeaderTitle, kotlin.getVideoPageNotesTitle
    public final Collection<? extends CourseConfigV2NavDrawerItemRateUs> AudioAttributesImplApi26Parcelizer() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            AudioAttributesCompatParcelizer(21);
        }
        return setEmptySet;
    }

    protected NetworkStat write(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(23);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(24);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(25);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(26);
        }
        if (remoteActionCompatParcelizer != getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION && remoteActionCompatParcelizer != getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(getvariant);
            sb.append("\nkind: ");
            sb.append(remoteActionCompatParcelizer);
            throw new IllegalStateException(sb.toString());
        }
        return new NetworkStat((CourseConfigV2CustomModuleQuestionSource) getvariant, this, getquote, this.write, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, getintrodurationseconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntegerMap
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public CourseConfigV2EditionSwitch AudioAttributesCompatParcelizer(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        CourseConfigV2EditionSwitch courseConfigV2EditionSwitch = (CourseConfigV2EditionSwitch) super.AudioAttributesCompatParcelizer(getvariant, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, remoteActionCompatParcelizer, z);
        if (courseConfigV2EditionSwitch == null) {
            AudioAttributesCompatParcelizer(27);
        }
        return courseConfigV2EditionSwitch;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void AudioAttributesCompatParcelizer(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkStat.AudioAttributesCompatParcelizer(int):void");
    }

    @Override // kotlin.getIntegerMap, kotlin.getTestHeaderTitle
    public final void write(Collection<? extends getTestHeaderTitle> collection) {
        if (collection == null) {
            AudioAttributesCompatParcelizer(22);
        }
    }
}
