package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.CourseConfigV2NavDrawerItemRateUs;
import kotlin.getLastHtmlBody;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getIntegerMap extends PresenterBundle implements CourseConfigV2NavDrawerItemRateUs {
    protected Map<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, Object> AudioAttributesCompatParcelizer;
    private CourseConfigV2NavDrawerItemRateUs AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private List<CourseConfigV2TestTabItem> IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private boolean RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private final getTestHeaderTitle.RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private volatile getCreatedOnDateMs<Collection<CourseConfigV2NavDrawerItemRateUs>> onAddQueueItem;
    private CourseConfigV2NavDrawerItems onCommand;
    private boolean onCustomAction;
    private List<getMeta> onFastForward;
    private final CourseConfigV2NavDrawerItemRateUs onMediaButtonEvent;
    private getLink onPause;
    private Collection<? extends CourseConfigV2NavDrawerItemRateUs> onPlay;
    private List<getBadgeText> onPlayFromMediaId;
    private CourseConfigV2NavDrawerItemFreeExtension onPrepare;
    private CourseConfigV2TestTabItem read;
    private CourseConfigV2TestTabItem write;

    protected abstract getIntegerMap read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds);

    public /* synthetic */ getTestHeaderTitle write(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return AudioAttributesCompatParcelizer(getvariant, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, remoteActionCompatParcelizer, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected getIntegerMap(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getQuote getquote, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds) {
        super(getvariant, getquote, getrelatedlessonid, getintrodurationseconds);
        if (getvariant == null) {
            read(0);
        }
        if (getquote == null) {
            read(1);
        }
        if (getrelatedlessonid == null) {
            read(2);
        }
        if (remoteActionCompatParcelizer == null) {
            read(3);
        }
        if (getintrodurationseconds == null) {
            read(4);
        }
        this.onPrepare = CourseConfigV2NavDrawerItemFaq.MediaDescriptionCompat;
        this.MediaDescriptionCompat = false;
        this.MediaMetadataCompat = false;
        this.AudioAttributesImplBaseParcelizer = false;
        this.MediaBrowserCompatSearchResultReceiver = false;
        this.onCustomAction = false;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.RatingCompat = false;
        this.MediaBrowserCompatMediaItem = false;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        this.RemoteActionCompatParcelizer = true;
        this.MediaBrowserCompatItemReceiver = false;
        this.onPlay = null;
        this.onAddQueueItem = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
        this.onMediaButtonEvent = courseConfigV2NavDrawerItemRateUs == null ? this : courseConfigV2NavDrawerItemRateUs;
        this.handleMediaPlayPauseIfPendingOnHandler = remoteActionCompatParcelizer;
    }

    public getIntegerMap read(CourseConfigV2TestTabItem courseConfigV2TestTabItem, CourseConfigV2TestTabItem courseConfigV2TestTabItem2, List<CourseConfigV2TestTabItem> list, List<? extends getBadgeText> list2, List<getMeta> list3, getLink getlink, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        if (list == null) {
            read(5);
        }
        if (list2 == null) {
            read(6);
        }
        if (list3 == null) {
            read(7);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            read(8);
        }
        this.onPlayFromMediaId = IntermediateLoginResponseBody.onPlay(list2);
        this.onFastForward = IntermediateLoginResponseBody.onPlay(list3);
        this.onPause = getlink;
        this.onCommand = courseConfigV2NavDrawerItems;
        this.onPrepare = courseConfigV2NavDrawerItemFreeExtension;
        this.write = courseConfigV2TestTabItem;
        this.read = courseConfigV2TestTabItem2;
        this.IconCompatParcelizer = list;
        for (int i = 0; i < list2.size(); i++) {
            getBadgeText getbadgetext = list2.get(i);
            if (getbadgetext.write() != i) {
                StringBuilder sb = new StringBuilder();
                sb.append(getbadgetext);
                sb.append(" index is ");
                sb.append(getbadgetext.write());
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            getMeta getmeta = list3.get(i2);
            if (getmeta.onCommand() != i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getmeta);
                sb2.append("index is ");
                sb2.append(getmeta.onCommand());
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
        return this;
    }

    public final void RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            read(10);
        }
        this.onPrepare = courseConfigV2NavDrawerItemFreeExtension;
    }

    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.MediaMetadataCompat = z;
    }

    public final void read(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = z;
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.onCustomAction = z;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = z;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    private void MediaBrowserCompatSearchResultReceiver(boolean z) {
        this.RatingCompat = z;
    }

    private void MediaMetadataCompat(boolean z) {
        this.MediaBrowserCompatMediaItem = z;
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }

    public final void write(getLink getlink) {
        if (getlink == null) {
            read(11);
        }
        this.onPause = getlink;
    }

    public void AudioAttributesCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public void write(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<CourseConfigV2TestTabItem> read() {
        List<CourseConfigV2TestTabItem> list = this.IconCompatParcelizer;
        if (list == null) {
            read(13);
        }
        return list;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final CourseConfigV2TestTabItem write() {
        return this.read;
    }

    public Collection<? extends CourseConfigV2NavDrawerItemRateUs> AudioAttributesImplApi26Parcelizer() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        Collection<? extends CourseConfigV2NavDrawerItemRateUs> collectionEmptyList = this.onPlay;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            read(14);
        }
        return collectionEmptyList;
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        getCreatedOnDateMs<Collection<CourseConfigV2NavDrawerItemRateUs>> getcreatedondatems = this.onAddQueueItem;
        if (getcreatedondatems != null) {
            this.onPlay = getcreatedondatems.invoke();
            this.onAddQueueItem = null;
        }
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems = this.onCommand;
        if (courseConfigV2NavDrawerItems == null) {
            read(15);
        }
        return courseConfigV2NavDrawerItems;
    }

    @Override // kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = this.onPrepare;
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            read(16);
        }
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onPrepareFromUri() {
        if (this.MediaDescriptionCompat) {
            return true;
        }
        Iterator<? extends CourseConfigV2NavDrawerItemRateUs> it = onPrepareFromMediaId().AudioAttributesImplApi26Parcelizer().iterator();
        while (it.hasNext()) {
            if (it.next().onPrepareFromUri()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onPrepareFromSearch() {
        if (this.MediaMetadataCompat) {
            return true;
        }
        Iterator<? extends CourseConfigV2NavDrawerItemRateUs> it = onPrepareFromMediaId().AudioAttributesImplApi26Parcelizer().iterator();
        while (it.hasNext()) {
            if (it.next().onPrepareFromSearch()) {
                return true;
            }
        }
        return false;
    }

    public boolean onMediaButtonEvent() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public boolean AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public boolean IconCompatParcelizer() {
        return this.onCustomAction;
    }

    public boolean onSeekTo() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onPause() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onCommand() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public <V> V IconCompatParcelizer(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer) {
        Map<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, Object> map = this.AudioAttributesCompatParcelizer;
        if (map == null) {
            return null;
        }
        return (V) map.get(remoteActionCompatParcelizer);
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onPlayFromUri() {
        return this.RatingCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void write(Collection<? extends getTestHeaderTitle> collection) {
        if (collection == 0) {
            read(17);
        }
        this.onPlay = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((CourseConfigV2NavDrawerItemRateUs) it.next()).onPrepare()) {
                this.MediaBrowserCompatMediaItem = true;
                return;
            }
        }
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<getBadgeText> MediaDescriptionCompat() {
        List<getBadgeText> list = this.onPlayFromMediaId;
        if (list == null) {
            throw new IllegalStateException("typeParameters == null for ".concat(String.valueOf(this)));
        }
        if (list == null) {
            read(18);
        }
        return list;
    }

    @Override // kotlin.getVideoPageNotesTitle
    public final List<getMeta> aX_() {
        List<getMeta> list = this.onFastForward;
        if (list == null) {
            read(19);
        }
        return list;
    }

    public boolean onRewind() {
        return this.RemoteActionCompatParcelizer;
    }

    public boolean MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public getLink AudioAttributesImplBaseParcelizer() {
        return this.onPause;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.CourseConfigV2NavDrawerItemRateUs] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.getTestHeaderTitle
    public CourseConfigV2NavDrawerItemRateUs onPrepareFromMediaId() {
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs = this.onMediaButtonEvent;
        ?? OnPrepareFromMediaId = this;
        if (courseConfigV2NavDrawerItemRateUs != this) {
            OnPrepareFromMediaId = courseConfigV2NavDrawerItemRateUs.onPrepareFromMediaId();
        }
        if (OnPrepareFromMediaId == 0) {
            read(20);
        }
        return OnPrepareFromMediaId;
    }

    @Override // kotlin.getTestHeaderTitle
    public final getTestHeaderTitle.RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler() {
        getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler;
        if (remoteActionCompatParcelizer == null) {
            read(21);
        }
        return remoteActionCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: read */
    public CourseConfigV2NavDrawerItemRateUs write(setDesriptionList setdesriptionlist) {
        if (setdesriptionlist == null) {
            read(22);
        }
        return setdesriptionlist.read() ? this : RemoteActionCompatParcelizer(setdesriptionlist).write(onPrepareFromMediaId()).AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer();
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean onPrepare() {
        return this.MediaBrowserCompatMediaItem;
    }

    public class AudioAttributesCompatParcelizer implements CourseConfigV2NavDrawerItemRateUs.write<CourseConfigV2NavDrawerItemRateUs> {
        protected getTestHeaderTitle.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        protected CourseConfigV2TestTabItem AudioAttributesImplApi21Parcelizer;
        protected getVariant AudioAttributesImplApi26Parcelizer;
        protected List<CourseConfigV2TestTabItem> AudioAttributesImplBaseParcelizer;
        protected boolean IconCompatParcelizer;
        protected getRelatedLessonId MediaBrowserCompatCustomActionResultReceiver;
        protected CourseConfigV2NavDrawerItems MediaBrowserCompatItemReceiver;
        protected CourseConfigV2NavDrawerItemRateUs MediaBrowserCompatMediaItem;
        protected List<getMeta> MediaBrowserCompatSearchResultReceiver;
        private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        protected getLink MediaDescriptionCompat;
        protected CourseConfigV2NavDrawerItemFreeExtension MediaMetadataCompat;
        protected boolean RatingCompat;
        protected CourseConfigV2TestTabItem RemoteActionCompatParcelizer;
        private getQuote handleMediaPlayPauseIfPendingOnHandler;
        private boolean onAddQueueItem;
        protected isVideoPlanCtype onCommand;
        protected boolean onCustomAction;
        private Boolean onMediaButtonEvent;
        private List<getBadgeText> onPause;
        private Map<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, Object> onPlay;
        private /* synthetic */ getIntegerMap onPlayFromMediaId;
        protected boolean read;
        protected boolean write;

        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        public final /* synthetic */ CourseConfigV2NavDrawerItemRateUs.write AudioAttributesCompatParcelizer(List list) {
            return RemoteActionCompatParcelizer((List<getMeta>) list);
        }

        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        public final /* synthetic */ CourseConfigV2NavDrawerItemRateUs.write IconCompatParcelizer(List list) {
            return read((List<getBadgeText>) list);
        }

        public AudioAttributesCompatParcelizer(getIntegerMap getintegermap, isVideoPlanCtype isvideoplanctype, getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, List<getMeta> list, List<CourseConfigV2TestTabItem> list2, CourseConfigV2TestTabItem courseConfigV2TestTabItem, getLink getlink) {
            if (isvideoplanctype == null) {
                IconCompatParcelizer(0);
            }
            if (getvariant == null) {
                IconCompatParcelizer(1);
            }
            if (courseConfigV2NavDrawerItems == null) {
                IconCompatParcelizer(2);
            }
            if (courseConfigV2NavDrawerItemFreeExtension == null) {
                IconCompatParcelizer(3);
            }
            if (remoteActionCompatParcelizer == null) {
                IconCompatParcelizer(4);
            }
            if (list == null) {
                IconCompatParcelizer(5);
            }
            if (list2 == null) {
                IconCompatParcelizer(6);
            }
            if (getlink == null) {
                IconCompatParcelizer(7);
            }
            this.onPlayFromMediaId = getintegermap;
            this.MediaBrowserCompatMediaItem = null;
            this.RemoteActionCompatParcelizer = getintegermap.read;
            this.IconCompatParcelizer = true;
            this.onCustomAction = false;
            this.RatingCompat = false;
            this.write = false;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getintegermap.onPlayFromUri();
            this.onPause = null;
            this.handleMediaPlayPauseIfPendingOnHandler = null;
            this.onAddQueueItem = getintegermap.onPrepare();
            this.onPlay = new LinkedHashMap();
            this.onMediaButtonEvent = null;
            this.read = false;
            this.onCommand = isvideoplanctype;
            this.AudioAttributesImplApi26Parcelizer = getvariant;
            this.MediaBrowserCompatItemReceiver = courseConfigV2NavDrawerItems;
            this.MediaMetadataCompat = courseConfigV2NavDrawerItemFreeExtension;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            this.MediaBrowserCompatSearchResultReceiver = list;
            this.AudioAttributesImplBaseParcelizer = list2;
            this.AudioAttributesImplApi21Parcelizer = courseConfigV2TestTabItem;
            this.MediaDescriptionCompat = getlink;
            this.MediaBrowserCompatCustomActionResultReceiver = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(getVariant getvariant) {
            if (getvariant == null) {
                IconCompatParcelizer(8);
            }
            this.AudioAttributesImplApi26Parcelizer = getvariant;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer write(CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems) {
            if (courseConfigV2NavDrawerItems == null) {
                IconCompatParcelizer(10);
            }
            this.MediaBrowserCompatItemReceiver = courseConfigV2NavDrawerItems;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
            if (courseConfigV2NavDrawerItemFreeExtension == null) {
                IconCompatParcelizer(12);
            }
            this.MediaMetadataCompat = courseConfigV2NavDrawerItemFreeExtension;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer read(getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (remoteActionCompatParcelizer == null) {
                IconCompatParcelizer(14);
            }
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer read(boolean z) {
            this.IconCompatParcelizer = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer read(getRelatedLessonId getrelatedlessonid) {
            if (getrelatedlessonid == null) {
                IconCompatParcelizer(17);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = getrelatedlessonid;
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(List<getMeta> list) {
            if (list == null) {
                IconCompatParcelizer(19);
            }
            this.MediaBrowserCompatSearchResultReceiver = list;
            return this;
        }

        private AudioAttributesCompatParcelizer read(List<getBadgeText> list) {
            if (list == null) {
                IconCompatParcelizer(21);
            }
            this.onPause = list;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getLink getlink) {
            if (getlink == null) {
                IconCompatParcelizer(23);
            }
            this.MediaDescriptionCompat = getlink;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer write(CourseConfigV2TestTabItem courseConfigV2TestTabItem) {
            this.AudioAttributesImplApi21Parcelizer = courseConfigV2TestTabItem;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer read(CourseConfigV2TestTabItem courseConfigV2TestTabItem) {
            this.RemoteActionCompatParcelizer = courseConfigV2TestTabItem;
            return this;
        }

        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final AudioAttributesCompatParcelizer write(getTestHeaderTitle gettestheadertitle) {
            this.MediaBrowserCompatMediaItem = (CourseConfigV2NavDrawerItemRateUs) gettestheadertitle;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
            this.onCustomAction = true;
            return this;
        }

        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            this.RatingCompat = true;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer read() {
            this.write = true;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer write() {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
            this.onAddQueueItem = true;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer IconCompatParcelizer(getQuote getquote) {
            if (getquote == null) {
                IconCompatParcelizer(35);
            }
            this.handleMediaPlayPauseIfPendingOnHandler = getquote;
            return this;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer(boolean z) {
            this.onMediaButtonEvent = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(isVideoPlanCtype isvideoplanctype) {
            if (isvideoplanctype == null) {
                IconCompatParcelizer(37);
            }
            this.onCommand = isvideoplanctype;
            return this;
        }

        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        public final <V> CourseConfigV2NavDrawerItemRateUs.write<CourseConfigV2NavDrawerItemRateUs> write(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer, V v) {
            if (remoteActionCompatParcelizer == null) {
                IconCompatParcelizer(39);
            }
            this.onPlay.put(remoteActionCompatParcelizer, v);
            return this;
        }

        @Override // o.CourseConfigV2NavDrawerItemRateUs.write
        public final CourseConfigV2NavDrawerItemRateUs IconCompatParcelizer() {
            return this.onPlayFromMediaId.AudioAttributesCompatParcelizer(this);
        }

        public final AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer() {
            this.read = true;
            return this;
        }

        private static /* synthetic */ void IconCompatParcelizer(int i) {
            String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
    }

    public CourseConfigV2NavDrawerItemRateUs.write<? extends CourseConfigV2NavDrawerItemRateUs> onRemoveQueueItemAt() {
        return RemoteActionCompatParcelizer(setDesriptionList.read);
    }

    protected final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(setDesriptionList setdesriptionlist) {
        if (setdesriptionlist == null) {
            read(24);
        }
        return new AudioAttributesCompatParcelizer(this, setdesriptionlist.AudioAttributesCompatParcelizer(), AudioAttributesImplApi21Parcelizer(), MediaBrowserCompatMediaItem(), onCustomAction(), handleMediaPlayPauseIfPendingOnHandler(), aX_(), read(), MediaBrowserCompatCustomActionResultReceiver(), AudioAttributesImplBaseParcelizer());
    }

    public CourseConfigV2NavDrawerItemRateUs AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        getQuote getquoteRemoteActionCompatParcelizer;
        getCorrectnessScore getcorrectnessscore;
        CourseConfigV2TestTabItem courseConfigV2TestTabItem;
        getLink getlinkIconCompatParcelizer;
        if (audioAttributesCompatParcelizer == null) {
            read(25);
        }
        boolean[] zArr = new boolean[1];
        if (audioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler != null) {
            getquoteRemoteActionCompatParcelizer = getProfilePicture.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler);
        } else {
            getquoteRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        }
        getIntegerMap getintegermap = read(audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer, audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver, getquoteRemoteActionCompatParcelizer, read(audioAttributesCompatParcelizer.RatingCompat, audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem));
        List<getBadgeText> listMediaDescriptionCompat = audioAttributesCompatParcelizer.onPause == null ? MediaDescriptionCompat() : audioAttributesCompatParcelizer.onPause;
        zArr[0] = zArr[0] | (!listMediaDescriptionCompat.isEmpty());
        ArrayList arrayList = new ArrayList(listMediaDescriptionCompat.size());
        final setDesriptionList setdesriptionlistRemoteActionCompatParcelizer = PearlListItem.RemoteActionCompatParcelizer(listMediaDescriptionCompat, audioAttributesCompatParcelizer.onCommand, getintegermap, arrayList, zArr);
        if (setdesriptionlistRemoteActionCompatParcelizer == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer.isEmpty()) {
            int i = 0;
            for (CourseConfigV2TestTabItem courseConfigV2TestTabItem2 : audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                getLink getlinkIconCompatParcelizer2 = setdesriptionlistRemoteActionCompatParcelizer.IconCompatParcelizer(courseConfigV2TestTabItem2.onPrepareFromMediaId(), getTotalSubject.IN_VARIANCE);
                if (getlinkIconCompatParcelizer2 == null) {
                    return null;
                }
                arrayList2.add(getOption2.read(getintegermap, getlinkIconCompatParcelizer2, ((getPlaybackIndex) courseConfigV2TestTabItem2.IconCompatParcelizer()).RemoteActionCompatParcelizer(), courseConfigV2TestTabItem2.RemoteActionCompatParcelizer(), i));
                zArr[0] = (getlinkIconCompatParcelizer2 != courseConfigV2TestTabItem2.onPrepareFromMediaId()) | zArr[0];
                i++;
            }
        }
        if (audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer != null) {
            getLink getlinkIconCompatParcelizer3 = setdesriptionlistRemoteActionCompatParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.onPrepareFromMediaId(), getTotalSubject.IN_VARIANCE);
            if (getlinkIconCompatParcelizer3 == null) {
                return null;
            }
            getCorrectnessScore getcorrectnessscore2 = new getCorrectnessScore(getintegermap, new getMainMcqIds(getintegermap, getlinkIconCompatParcelizer3, audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()), audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
            zArr[0] = (getlinkIconCompatParcelizer3 != audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.onPrepareFromMediaId()) | zArr[0];
            getcorrectnessscore = getcorrectnessscore2;
        } else {
            getcorrectnessscore = null;
        }
        if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer != null) {
            CourseConfigV2TestTabItem courseConfigV2TestTabItemWrite = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.write(setdesriptionlistRemoteActionCompatParcelizer);
            if (courseConfigV2TestTabItemWrite == null) {
                return null;
            }
            zArr[0] = zArr[0] | (courseConfigV2TestTabItemWrite != audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
            courseConfigV2TestTabItem = courseConfigV2TestTabItemWrite;
        } else {
            courseConfigV2TestTabItem = null;
        }
        List<getMeta> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getintegermap, audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver, setdesriptionlistRemoteActionCompatParcelizer, audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer.RatingCompat, zArr);
        if (listAudioAttributesCompatParcelizer == null || (getlinkIconCompatParcelizer = setdesriptionlistRemoteActionCompatParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizer.MediaDescriptionCompat, getTotalSubject.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z = zArr[0] | (getlinkIconCompatParcelizer != audioAttributesCompatParcelizer.MediaDescriptionCompat);
        zArr[0] = z;
        if (!z && audioAttributesCompatParcelizer.read) {
            return this;
        }
        getintegermap.read(getcorrectnessscore, courseConfigV2TestTabItem, arrayList2, arrayList, listAudioAttributesCompatParcelizer, getlinkIconCompatParcelizer, audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver, audioAttributesCompatParcelizer.MediaMetadataCompat);
        getintegermap.AudioAttributesImplBaseParcelizer(this.MediaDescriptionCompat);
        getintegermap.MediaBrowserCompatCustomActionResultReceiver(this.MediaMetadataCompat);
        getintegermap.read(this.AudioAttributesImplBaseParcelizer);
        getintegermap.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver);
        getintegermap.AudioAttributesImplApi26Parcelizer(this.onCustomAction);
        getintegermap.MediaBrowserCompatItemReceiver(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        getintegermap.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        getintegermap.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        getintegermap.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        getintegermap.MediaBrowserCompatSearchResultReceiver(audioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        getintegermap.MediaMetadataCompat(audioAttributesCompatParcelizer.onAddQueueItem);
        getintegermap.write(audioAttributesCompatParcelizer.onMediaButtonEvent != null ? audioAttributesCompatParcelizer.onMediaButtonEvent.booleanValue() : this.MediaBrowserCompatItemReceiver);
        if (!audioAttributesCompatParcelizer.onPlay.isEmpty() || this.AudioAttributesCompatParcelizer != null) {
            Map<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, Object> map = audioAttributesCompatParcelizer.onPlay;
            Map<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, Object> map2 = this.AudioAttributesCompatParcelizer;
            if (map2 != null) {
                for (Map.Entry<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                getintegermap.AudioAttributesCompatParcelizer = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                getintegermap.AudioAttributesCompatParcelizer = map;
            }
        }
        if (audioAttributesCompatParcelizer.onCustomAction || onPlayFromSearch() != null) {
            getintegermap.RemoteActionCompatParcelizer((onPlayFromSearch() != null ? onPlayFromSearch() : this).write(setdesriptionlistRemoteActionCompatParcelizer));
        }
        if (audioAttributesCompatParcelizer.IconCompatParcelizer && !onPrepareFromMediaId().AudioAttributesImplApi26Parcelizer().isEmpty()) {
            if (audioAttributesCompatParcelizer.onCommand.read()) {
                getCreatedOnDateMs<Collection<CourseConfigV2NavDrawerItemRateUs>> getcreatedondatems = this.onAddQueueItem;
                if (getcreatedondatems != null) {
                    getintegermap.onAddQueueItem = getcreatedondatems;
                    return getintegermap;
                }
                getintegermap.write(AudioAttributesImplApi26Parcelizer());
                return getintegermap;
            }
            getintegermap.onAddQueueItem = new getCreatedOnDateMs<Collection<CourseConfigV2NavDrawerItemRateUs>>() { // from class: o.getIntegerMap.4
                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.getCreatedOnDateMs
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Collection<CourseConfigV2NavDrawerItemRateUs> invoke() {
                    getMonthTimeStamp getmonthtimestamp = new getMonthTimeStamp();
                    Iterator<? extends CourseConfigV2NavDrawerItemRateUs> it = getIntegerMap.this.AudioAttributesImplApi26Parcelizer().iterator();
                    while (it.hasNext()) {
                        getmonthtimestamp.add(it.next().write(setdesriptionlistRemoteActionCompatParcelizer));
                    }
                    return getmonthtimestamp;
                }
            };
        }
        return getintegermap;
    }

    public CourseConfigV2NavDrawerItemRateUs AudioAttributesCompatParcelizer(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsIconCompatParcelizer = onRemoveQueueItemAt().RemoteActionCompatParcelizer(getvariant).write(courseConfigV2NavDrawerItems).RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension).read(remoteActionCompatParcelizer).read(z).IconCompatParcelizer();
        if (courseConfigV2NavDrawerItemRateUsIconCompatParcelizer == null) {
            read(26);
        }
        return courseConfigV2NavDrawerItemRateUsIconCompatParcelizer;
    }

    private getIntroDurationSeconds read(boolean z, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        getIntroDurationSeconds getintrodurationsecondsRatingCompat;
        if (z) {
            if (courseConfigV2NavDrawerItemRateUs == null) {
                courseConfigV2NavDrawerItemRateUs = onPrepareFromMediaId();
            }
            getintrodurationsecondsRatingCompat = courseConfigV2NavDrawerItemRateUs.RatingCompat();
        } else {
            getintrodurationsecondsRatingCompat = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
        }
        if (getintrodurationsecondsRatingCompat == null) {
            read(27);
        }
        return getintrodurationsecondsRatingCompat;
    }

    public <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.IconCompatParcelizer(this, d);
    }

    public static List<getMeta> IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, List<getMeta> list, setDesriptionList setdesriptionlist) {
        if (list == null) {
            read(28);
        }
        if (setdesriptionlist == null) {
            read(29);
        }
        return AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUs, list, setdesriptionlist, false, false, null);
    }

    public static List<getMeta> AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, List<getMeta> list, setDesriptionList setdesriptionlist, boolean z, boolean z2, boolean[] zArr) {
        getCreatedOnDateMs<List<Editor>> getcreatedondatems;
        if (list == null) {
            read(30);
        }
        if (setdesriptionlist == null) {
            read(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (getMeta getmeta : list) {
            getLink getlinkIconCompatParcelizer = setdesriptionlist.IconCompatParcelizer(getmeta.onPrepareFromMediaId(), getTotalSubject.IN_VARIANCE);
            getLink getlinkHandleMediaPlayPauseIfPendingOnHandler = getmeta.handleMediaPlayPauseIfPendingOnHandler();
            getLink getlinkIconCompatParcelizer2 = getlinkHandleMediaPlayPauseIfPendingOnHandler == null ? null : setdesriptionlist.IconCompatParcelizer(getlinkHandleMediaPlayPauseIfPendingOnHandler, getTotalSubject.IN_VARIANCE);
            if (getlinkIconCompatParcelizer == null) {
                return null;
            }
            if ((getlinkIconCompatParcelizer != getmeta.onPrepareFromMediaId() || getlinkHandleMediaPlayPauseIfPendingOnHandler != getlinkIconCompatParcelizer2) && zArr != null) {
                zArr[0] = true;
            }
            if (getmeta instanceof getLastHtmlBody.read) {
                final List<Editor> listOnPause = ((getLastHtmlBody.read) getmeta).onPause();
                getcreatedondatems = new getCreatedOnDateMs<List<Editor>>() { // from class: o.getIntegerMap.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // kotlin.getCreatedOnDateMs
                    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public List<Editor> invoke() {
                        return listOnPause;
                    }
                };
            } else {
                getcreatedondatems = null;
            }
            arrayList.add(getLastHtmlBody.read(courseConfigV2NavDrawerItemRateUs, z ? null : getmeta, getmeta.onCommand(), getmeta.RemoteActionCompatParcelizer(), getmeta.aQ_(), getlinkIconCompatParcelizer, getmeta.IconCompatParcelizer(), getmeta.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), getmeta.onMediaButtonEvent(), getlinkIconCompatParcelizer2, z2 ? getmeta.RatingCompat() : getIntroDurationSeconds.AudioAttributesCompatParcelizer, getcreatedondatems));
        }
        return arrayList;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemRateUs
    public final CourseConfigV2NavDrawerItemRateUs onPlayFromSearch() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private void RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        this.AudioAttributesImplApi21Parcelizer = courseConfigV2NavDrawerItemRateUs;
    }

    public final <V> void AudioAttributesCompatParcelizer(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer, Object obj) {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new LinkedHashMap();
        }
        this.AudioAttributesCompatParcelizer.put(remoteActionCompatParcelizer, obj);
    }

    private static /* synthetic */ void read(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
