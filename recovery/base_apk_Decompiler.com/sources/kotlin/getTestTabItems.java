package kotlin;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.ImageUpload;
import kotlin.getCourseIdInt;
import kotlin.getQuote;
import kotlin.getZenArea;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getTestTabItems {
    private static getRelatedLessonId write = getRelatedLessonId.AudioAttributesCompatParcelizer("<built-ins module>");
    private final getListOfLessonCompletions<getRelatedLessonId, CourseConfigV2CustomModuleQuestionSource> AudioAttributesCompatParcelizer;
    private final PageValue<write> AudioAttributesImplApi21Parcelizer;
    private final getMini AudioAttributesImplBaseParcelizer;
    private PageValue<isServerContentUpdated> IconCompatParcelizer;
    private final PageValue<Collection<CourseConfigV2SearchItem>> RemoteActionCompatParcelizer;
    private isServerContentUpdated read;

    public getTestTabItems(getMini getmini) {
        if (getmini == null) {
            AudioAttributesCompatParcelizer(0);
        }
        this.AudioAttributesImplBaseParcelizer = getmini;
        this.RemoteActionCompatParcelizer = getmini.read(new getCreatedOnDateMs<Collection<CourseConfigV2SearchItem>>() { // from class: o.getTestTabItems.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Collection<CourseConfigV2SearchItem> invoke() {
                return Arrays.asList(getTestTabItems.this.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(getZenArea.IconCompatParcelizer), getTestTabItems.this.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(getZenArea.read), getTestTabItems.this.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(getZenArea.MediaBrowserCompatMediaItem), getTestTabItems.this.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(getZenArea.AudioAttributesCompatParcelizer));
            }
        });
        this.AudioAttributesImplApi21Parcelizer = getmini.read(new getCreatedOnDateMs<write>() { // from class: o.getTestTabItems.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public write invoke() {
                EnumMap enumMap = new EnumMap(getShowNotesWatermark.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                byte b = 0;
                for (getShowNotesWatermark getshownoteswatermark : getShowNotesWatermark.values()) {
                    getHref gethrefIconCompatParcelizer = getTestTabItems.this.IconCompatParcelizer(getshownoteswatermark.write().AudioAttributesCompatParcelizer());
                    getHref gethrefIconCompatParcelizer2 = getTestTabItems.this.IconCompatParcelizer(getshownoteswatermark.read().AudioAttributesCompatParcelizer());
                    enumMap.put(getshownoteswatermark, gethrefIconCompatParcelizer2);
                    map.put(gethrefIconCompatParcelizer, gethrefIconCompatParcelizer2);
                    map2.put(gethrefIconCompatParcelizer2, gethrefIconCompatParcelizer);
                }
                return new write(enumMap, map, map2, b);
            }
        });
        this.AudioAttributesCompatParcelizer = getmini.AudioAttributesCompatParcelizer(new getAnswerMap<getRelatedLessonId, CourseConfigV2CustomModuleQuestionSource>() { // from class: o.getTestTabItems.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public CourseConfigV2CustomModuleQuestionSource invoke(getRelatedLessonId getrelatedlessonid) {
                getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = getTestTabItems.this.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(getrelatedlessonid, isCollapsible.FROM_BUILTINS);
                if (getquestionlimitAudioAttributesCompatParcelizer == null) {
                    StringBuilder sb = new StringBuilder("Built-in class ");
                    sb.append(getZenArea.IconCompatParcelizer.write(getrelatedlessonid));
                    sb.append(" is not found");
                    throw new AssertionError(sb.toString());
                }
                if (!(getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource)) {
                    StringBuilder sb2 = new StringBuilder("Must be a class descriptor ");
                    sb2.append(getrelatedlessonid);
                    sb2.append(", but was ");
                    sb2.append(getquestionlimitAudioAttributesCompatParcelizer);
                    throw new AssertionError(sb2.toString());
                }
                return (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer;
            }
        });
    }

    protected final void read(boolean z) {
        isServerContentUpdated isservercontentupdated = new isServerContentUpdated(write, this.AudioAttributesImplBaseParcelizer, this);
        this.read = isservercontentupdated;
        BuiltInsLoader.RemoteActionCompatParcelizer remoteActionCompatParcelizer = BuiltInsLoader.write;
        isservercontentupdated.read(BuiltInsLoader.RemoteActionCompatParcelizer.write().createPackageFragmentProvider(this.AudioAttributesImplBaseParcelizer, this.read, MediaBrowserCompatCustomActionResultReceiver(), onPlayFromMediaId(), AudioAttributesCompatParcelizer(), z));
        isServerContentUpdated isservercontentupdated2 = this.read;
        isservercontentupdated2.RemoteActionCompatParcelizer(isservercontentupdated2);
    }

    public final void AudioAttributesCompatParcelizer(final isServerContentUpdated isservercontentupdated) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(new getCreatedOnDateMs<Void>() { // from class: o.getTestTabItems.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void invoke() {
                if (getTestTabItems.this.read != null) {
                    StringBuilder sb = new StringBuilder("Built-ins module is already set: ");
                    sb.append(getTestTabItems.this.read);
                    sb.append(" (attempting to reset to ");
                    sb.append(isservercontentupdated);
                    sb.append(")");
                    throw new AssertionError(sb.toString());
                }
                getTestTabItems.this.read = isservercontentupdated;
                return null;
            }
        });
    }

    protected getCourseIdInt AudioAttributesCompatParcelizer() {
        getCourseIdInt.read readVar = getCourseIdInt.read.RemoteActionCompatParcelizer;
        if (readVar == null) {
            AudioAttributesCompatParcelizer(3);
        }
        return readVar;
    }

    protected ImageUpload onPlayFromMediaId() {
        ImageUpload.RemoteActionCompatParcelizer remoteActionCompatParcelizer = ImageUpload.RemoteActionCompatParcelizer.read;
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(4);
        }
        return remoteActionCompatParcelizer;
    }

    public Iterable<getDocSideType> MediaBrowserCompatCustomActionResultReceiver() {
        List listSingletonList = Collections.singletonList(new getEndDate(this.AudioAttributesImplBaseParcelizer, AudioAttributesImplApi26Parcelizer()));
        if (listSingletonList == null) {
            AudioAttributesCompatParcelizer(5);
        }
        return listSingletonList;
    }

    protected final getMini onPrepareFromMediaId() {
        getMini getmini = this.AudioAttributesImplBaseParcelizer;
        if (getmini == null) {
            AudioAttributesCompatParcelizer(6);
        }
        return getmini;
    }

    static class write {
        public final Map<getShowNotesWatermark, getHref> AudioAttributesCompatParcelizer;
        private Map<getLink, getHref> IconCompatParcelizer;
        public final Map<getHref, getHref> RemoteActionCompatParcelizer;

        /* synthetic */ write(Map map, Map map2, Map map3, byte b) {
            this(map, map2, map3);
        }

        private write(Map<getShowNotesWatermark, getHref> map, Map<getLink, getHref> map2, Map<getHref, getHref> map3) {
            if (map == null) {
                write(0);
            }
            if (map2 == null) {
                write(1);
            }
            if (map3 == null) {
                write(2);
            }
            this.AudioAttributesCompatParcelizer = map;
            this.IconCompatParcelizer = map2;
            this.RemoteActionCompatParcelizer = map3;
        }

        private static /* synthetic */ void write(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public final isServerContentUpdated AudioAttributesImplApi26Parcelizer() {
        this.read.getClass();
        isServerContentUpdated isservercontentupdated = this.read;
        if (isservercontentupdated == null) {
            AudioAttributesCompatParcelizer(7);
        }
        return isservercontentupdated;
    }

    public static boolean RemoteActionCompatParcelizer(getVariant getvariant) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(9);
        }
        return getAnswerDescription.write(getvariant, getQBankGroupMeta.class, false) != null;
    }

    public static boolean read(getVariant getvariant) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(10);
        }
        while (getvariant != null) {
            if (getvariant instanceof getShouldShowEmptyPlanScreen) {
                return ((getShouldShowEmptyPlanScreen) getvariant).IconCompatParcelizer().AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer);
            }
            getvariant = getvariant.AudioAttributesImplApi21Parcelizer();
        }
        return false;
    }

    public final setTags AudioAttributesImplApi21Parcelizer() {
        setTags settagsIconCompatParcelizer = AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(getZenArea.IconCompatParcelizer).IconCompatParcelizer();
        if (settagsIconCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(11);
        }
        return settagsIconCompatParcelizer;
    }

    public final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(getNotesCount getnotescount) {
        if (getnotescount == null) {
            AudioAttributesCompatParcelizer(12);
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = CourseConfigV2NavDrawerItemContactUs.write(AudioAttributesImplApi26Parcelizer(), getnotescount, isCollapsible.FROM_BUILTINS);
        if (courseConfigV2CustomModuleQuestionSourceWrite == null) {
            AudioAttributesCompatParcelizer(13);
        }
        return courseConfigV2CustomModuleQuestionSourceWrite;
    }

    private CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            AudioAttributesCompatParcelizer(14);
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceInvoke = this.AudioAttributesCompatParcelizer.invoke(getRelatedLessonId.RemoteActionCompatParcelizer(str));
        if (courseConfigV2CustomModuleQuestionSourceInvoke == null) {
            AudioAttributesCompatParcelizer(15);
        }
        return courseConfigV2CustomModuleQuestionSourceInvoke;
    }

    private CourseConfigV2CustomModuleQuestionSource read() {
        return RemoteActionCompatParcelizer("Any");
    }

    private CourseConfigV2CustomModuleQuestionSource onPlayFromSearch() {
        return RemoteActionCompatParcelizer("Nothing");
    }

    private CourseConfigV2CustomModuleQuestionSource write(getShowNotesWatermark getshownoteswatermark) {
        if (getshownoteswatermark == null) {
            AudioAttributesCompatParcelizer(16);
        }
        return RemoteActionCompatParcelizer(getshownoteswatermark.write().AudioAttributesCompatParcelizer());
    }

    public final CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer() {
        return RemoteActionCompatParcelizer("Array");
    }

    public final CourseConfigV2CustomModuleQuestionSource onMediaButtonEvent() {
        return RemoteActionCompatParcelizer("Number");
    }

    private CourseConfigV2CustomModuleQuestionSource onRewind() {
        return RemoteActionCompatParcelizer("Unit");
    }

    public final CourseConfigV2CustomModuleQuestionSource read(int i) {
        return RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer(i));
    }

    public final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer(int i) {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getZenArea.AudioAttributesImplApi26Parcelizer.write(getRelatedLessonId.RemoteActionCompatParcelizer(getZenArea.write(i))));
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(18);
        }
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
    }

    private CourseConfigV2CustomModuleQuestionSource onPlayFromUri() {
        return RemoteActionCompatParcelizer("String");
    }

    public final CourseConfigV2CustomModuleQuestionSource MediaMetadataCompat() {
        return RemoteActionCompatParcelizer("Comparable");
    }

    public final CourseConfigV2CustomModuleQuestionSource handleMediaPlayPauseIfPendingOnHandler() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.onCustomAction.MediaBrowserCompatItemReceiver());
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(21);
        }
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
    }

    public final CourseConfigV2CustomModuleQuestionSource MediaDescriptionCompat() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem);
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(34);
        }
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getHref IconCompatParcelizer(String str) {
        if (str == null) {
            AudioAttributesCompatParcelizer(46);
        }
        getHref gethrefAP_ = RemoteActionCompatParcelizer(str).aP_();
        if (gethrefAP_ == null) {
            AudioAttributesCompatParcelizer(47);
        }
        return gethrefAP_;
    }

    public final getHref MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        getHref gethrefAP_ = onPlayFromSearch().aP_();
        if (gethrefAP_ == null) {
            AudioAttributesCompatParcelizer(48);
        }
        return gethrefAP_;
    }

    public final getHref onPlay() {
        getHref gethrefWrite = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(true);
        if (gethrefWrite == null) {
            AudioAttributesCompatParcelizer(49);
        }
        return gethrefWrite;
    }

    public final getHref write() {
        getHref gethrefAP_ = read().aP_();
        if (gethrefAP_ == null) {
            AudioAttributesCompatParcelizer(50);
        }
        return gethrefAP_;
    }

    public final getHref onCommand() {
        getHref gethrefWrite = write().write(true);
        if (gethrefWrite == null) {
            AudioAttributesCompatParcelizer(51);
        }
        return gethrefWrite;
    }

    public final getHref RatingCompat() {
        getHref gethrefOnCommand = onCommand();
        if (gethrefOnCommand == null) {
            AudioAttributesCompatParcelizer(52);
        }
        return gethrefOnCommand;
    }

    public final getHref RemoteActionCompatParcelizer(getShowNotesWatermark getshownoteswatermark) {
        if (getshownoteswatermark == null) {
            AudioAttributesCompatParcelizer(53);
        }
        getHref gethrefAP_ = write(getshownoteswatermark).aP_();
        if (gethrefAP_ == null) {
            AudioAttributesCompatParcelizer(54);
        }
        return gethrefAP_;
    }

    public final getHref onFastForward() {
        getHref gethrefAP_ = onMediaButtonEvent().aP_();
        if (gethrefAP_ == null) {
            AudioAttributesCompatParcelizer(55);
        }
        return gethrefAP_;
    }

    public final getHref MediaBrowserCompatItemReceiver() {
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getShowNotesWatermark.BYTE);
        if (gethrefRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(56);
        }
        return gethrefRemoteActionCompatParcelizer;
    }

    public final getHref onPause() {
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getShowNotesWatermark.SHORT);
        if (gethrefRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(57);
        }
        return gethrefRemoteActionCompatParcelizer;
    }

    public final getHref onCustomAction() {
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getShowNotesWatermark.INT);
        if (gethrefRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(58);
        }
        return gethrefRemoteActionCompatParcelizer;
    }

    public final getHref onAddQueueItem() {
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getShowNotesWatermark.LONG);
        if (gethrefRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(59);
        }
        return gethrefRemoteActionCompatParcelizer;
    }

    public final getHref MediaBrowserCompatMediaItem() {
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getShowNotesWatermark.FLOAT);
        if (gethrefRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(60);
        }
        return gethrefRemoteActionCompatParcelizer;
    }

    public final getHref MediaBrowserCompatSearchResultReceiver() {
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getShowNotesWatermark.DOUBLE);
        if (gethrefRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(61);
        }
        return gethrefRemoteActionCompatParcelizer;
    }

    public final getHref AudioAttributesImplBaseParcelizer() {
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getShowNotesWatermark.CHAR);
        if (gethrefRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(62);
        }
        return gethrefRemoteActionCompatParcelizer;
    }

    public final getHref RemoteActionCompatParcelizer() {
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getShowNotesWatermark.BOOLEAN);
        if (gethrefRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(63);
        }
        return gethrefRemoteActionCompatParcelizer;
    }

    public final getHref onPrepare() {
        getHref gethrefAP_ = onRewind().aP_();
        if (gethrefAP_ == null) {
            AudioAttributesCompatParcelizer(64);
        }
        return gethrefAP_;
    }

    public final getHref onPrepareFromSearch() {
        getHref gethrefAP_ = onPlayFromUri().aP_();
        if (gethrefAP_ == null) {
            AudioAttributesCompatParcelizer(65);
        }
        return gethrefAP_;
    }

    public final getLink MediaDescriptionCompat(getLink getlink) {
        getLink getlinkIconCompatParcelizer;
        if (getlink == null) {
            AudioAttributesCompatParcelizer(67);
        }
        if (RemoteActionCompatParcelizer(getlink)) {
            if (getlink.bb_().size() != 1) {
                throw new IllegalStateException();
            }
            getLink getlinkAudioAttributesCompatParcelizer = getlink.bb_().get(0).AudioAttributesCompatParcelizer();
            if (getlinkAudioAttributesCompatParcelizer == null) {
                AudioAttributesCompatParcelizer(68);
            }
            return getlinkAudioAttributesCompatParcelizer;
        }
        getLink getlinkAudioAttributesImplApi26Parcelizer = setPlanAddOns.AudioAttributesImplApi26Parcelizer(getlink);
        getHref gethref = this.AudioAttributesImplApi21Parcelizer.invoke().RemoteActionCompatParcelizer.get(getlinkAudioAttributesImplApi26Parcelizer);
        if (gethref != null) {
            if (gethref == null) {
                AudioAttributesCompatParcelizer(69);
            }
            return gethref;
        }
        getTopSection gettopsection = getAnswerDescription.read(getlinkAudioAttributesImplApi26Parcelizer);
        if (gettopsection == null || (getlinkIconCompatParcelizer = IconCompatParcelizer(getlinkAudioAttributesImplApi26Parcelizer, gettopsection)) == null) {
            throw new IllegalStateException("not array: ".concat(String.valueOf(getlink)));
        }
        if (getlinkIconCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(70);
        }
        return getlinkIconCompatParcelizer;
    }

    private static getLink IconCompatParcelizer(getLink getlink, getTopSection gettopsection) {
        RevisionSubjectStatusModel revisionSubjectStatusModel;
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
        if (getlink == null) {
            AudioAttributesCompatParcelizer(71);
        }
        if (gettopsection == null) {
            AudioAttributesCompatParcelizer(72);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer == null) {
            return null;
        }
        getVideoSubjectPageItems getvideosubjectpageitems = getVideoSubjectPageItems.IconCompatParcelizer;
        if (!getVideoSubjectPageItems.AudioAttributesCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer.aQ_()) || (revisionSubjectStatusModel = setLocked.read(getquestionlimitRemoteActionCompatParcelizer)) == null) {
            return null;
        }
        getVideoSubjectPageItems getvideosubjectpageitems2 = getVideoSubjectPageItems.IconCompatParcelizer;
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer = getVideoSubjectPageItems.IconCompatParcelizer(revisionSubjectStatusModel);
        if (revisionSubjectStatusModelIconCompatParcelizer == null || (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = CourseConfigV2NavDrawerItemReportPiracy.AudioAttributesCompatParcelizer(gettopsection, revisionSubjectStatusModelIconCompatParcelizer)) == null) {
            return null;
        }
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.aP_();
    }

    public final getHref AudioAttributesCompatParcelizer(getShowNotesWatermark getshownoteswatermark) {
        if (getshownoteswatermark == null) {
            AudioAttributesCompatParcelizer(73);
        }
        getHref gethref = this.AudioAttributesImplApi21Parcelizer.invoke().AudioAttributesCompatParcelizer.get(getshownoteswatermark);
        if (gethref == null) {
            AudioAttributesCompatParcelizer(74);
        }
        return gethref;
    }

    public static getShowNotesWatermark write(getVariant getvariant) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(76);
        }
        if (getZenArea.RemoteActionCompatParcelizer.onSetCaptioningEnabled.contains(getvariant.aQ_())) {
            return getZenArea.RemoteActionCompatParcelizer.onCommand.get(getAnswerDescription.RemoteActionCompatParcelizer(getvariant));
        }
        return null;
    }

    public static getShowNotesWatermark AudioAttributesCompatParcelizer(getVariant getvariant) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(77);
        }
        if (getZenArea.RemoteActionCompatParcelizer.onSetPlaybackSpeed.contains(getvariant.aQ_())) {
            return getZenArea.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.get(getAnswerDescription.RemoteActionCompatParcelizer(getvariant));
        }
        return null;
    }

    public final getHref AudioAttributesCompatParcelizer(getTotalSubject gettotalsubject, getLink getlink, getQuote getquote) {
        if (gettotalsubject == null) {
            AudioAttributesCompatParcelizer(78);
        }
        if (getlink == null) {
            AudioAttributesCompatParcelizer(79);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(80);
        }
        getHref gethrefWrite = AddOnMetaKt.write(getDurationTitle.AudioAttributesCompatParcelizer(getquote), IconCompatParcelizer(), (List<? extends setDefault>) Collections.singletonList(new isIndividualPlan(gettotalsubject, getlink)));
        if (gethrefWrite == null) {
            AudioAttributesCompatParcelizer(81);
        }
        return gethrefWrite;
    }

    public final getHref write(getTotalSubject gettotalsubject, getLink getlink) {
        if (gettotalsubject == null) {
            AudioAttributesCompatParcelizer(82);
        }
        if (getlink == null) {
            AudioAttributesCompatParcelizer(83);
        }
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        getHref gethrefAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(gettotalsubject, getlink, getQuote.AudioAttributesCompatParcelizer.read());
        if (gethrefAudioAttributesCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(84);
        }
        return gethrefAudioAttributesCompatParcelizer;
    }

    public static boolean RemoteActionCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(88);
        }
        return AudioAttributesCompatParcelizer(getlink, getZenArea.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer);
    }

    public static boolean IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(89);
        }
        return RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource, getZenArea.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer) || AudioAttributesCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource) != null;
    }

    public static boolean AudioAttributesCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(90);
        }
        return RemoteActionCompatParcelizer(getlink) || MediaBrowserCompatCustomActionResultReceiver(getlink);
    }

    public static boolean MediaBrowserCompatCustomActionResultReceiver(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(91);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        return (getquestionlimitRemoteActionCompatParcelizer == null || AudioAttributesCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer) == null) ? false : true;
    }

    public static getShowNotesWatermark read(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(92);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer == null) {
            return null;
        }
        return AudioAttributesCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer);
    }

    public static boolean AudioAttributesImplBaseParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(94);
        }
        return !getlink.ba_() && onAddQueueItem(getlink);
    }

    private static boolean onAddQueueItem(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(95);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        return (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) && read((CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer);
    }

    public static boolean read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(96);
        }
        return write((getVariant) courseConfigV2CustomModuleQuestionSource) != null;
    }

    private static boolean AudioAttributesCompatParcelizer(getLink getlink, getSlidesCount getslidescount) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(97);
        }
        if (getslidescount == null) {
            AudioAttributesCompatParcelizer(98);
        }
        return read(getlink.AudioAttributesImplApi21Parcelizer(), getslidescount);
    }

    public static boolean read(getPlanAddOns getplanaddons, getSlidesCount getslidescount) {
        if (getplanaddons == null) {
            AudioAttributesCompatParcelizer(101);
        }
        if (getslidescount == null) {
            AudioAttributesCompatParcelizer(102);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
        return (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) && RemoteActionCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer, getslidescount);
    }

    private static boolean RemoteActionCompatParcelizer(getQuestionLimit getquestionlimit, getSlidesCount getslidescount) {
        if (getquestionlimit == null) {
            AudioAttributesCompatParcelizer(103);
        }
        if (getslidescount == null) {
            AudioAttributesCompatParcelizer(104);
        }
        return getquestionlimit.aQ_().equals(getslidescount.AudioAttributesImplApi26Parcelizer()) && getslidescount.equals(getAnswerDescription.RemoteActionCompatParcelizer(getquestionlimit));
    }

    private static boolean write(getLink getlink, getSlidesCount getslidescount) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(105);
        }
        if (getslidescount == null) {
            AudioAttributesCompatParcelizer(106);
        }
        return !getlink.ba_() && AudioAttributesCompatParcelizer(getlink, getslidescount);
    }

    public static boolean write(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(107);
        }
        return RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource, getZenArea.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver) || RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource, getZenArea.RemoteActionCompatParcelizer.onRemoveQueueItemAt);
    }

    public static boolean AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(108);
        }
        return RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource, getZenArea.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver);
    }

    public static boolean IconCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(110);
        }
        return read(getlink, getZenArea.RemoteActionCompatParcelizer.IconCompatParcelizer);
    }

    private static boolean onCommand(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(128);
        }
        return read(getlink, getZenArea.RemoteActionCompatParcelizer.PlaybackStateCompat.AudioAttributesImplApi26Parcelizer());
    }

    private static boolean handleMediaPlayPauseIfPendingOnHandler(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(TsExtractor.TS_STREAM_TYPE_AC3);
        }
        return read(getlink, getZenArea.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction.AudioAttributesImplApi26Parcelizer());
    }

    private static boolean onCustomAction(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
        }
        return read(getlink, getZenArea.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem.AudioAttributesImplApi26Parcelizer());
    }

    private static boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(TarConstants.PREFIXLEN_XSTAR);
        }
        return read(getlink, getZenArea.RemoteActionCompatParcelizer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.AudioAttributesImplApi26Parcelizer());
    }

    public static boolean MediaBrowserCompatSearchResultReceiver(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(132);
        }
        return onCommand(getlink) || handleMediaPlayPauseIfPendingOnHandler(getlink) || onCustomAction(getlink) || MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getlink);
    }

    private static boolean read(getLink getlink, getSlidesCount getslidescount) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
        }
        if (getslidescount == null) {
            AudioAttributesCompatParcelizer(TsExtractor.TS_STREAM_TYPE_E_AC3);
        }
        return AudioAttributesCompatParcelizer(getlink, getslidescount) && !getlink.ba_();
    }

    public static boolean AudioAttributesImplApi26Parcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(136);
        }
        return RatingCompat(getlink) && !setPlanAddOns.write(getlink);
    }

    private static boolean RatingCompat(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(TsExtractor.TS_STREAM_TYPE_DTS);
        }
        return AudioAttributesCompatParcelizer(getlink, getZenArea.RemoteActionCompatParcelizer.onRemoveQueueItemAt);
    }

    public static boolean write(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(139);
        }
        return AudioAttributesCompatParcelizer(getlink, getZenArea.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver);
    }

    public static boolean AudioAttributesImplApi21Parcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(140);
        }
        return write(getlink) && getlink.ba_();
    }

    public static boolean MediaBrowserCompatItemReceiver(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(141);
        }
        return AudioAttributesImplApi21Parcelizer(getlink);
    }

    public static boolean MediaMetadataCompat(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(142);
        }
        return write(getlink, getZenArea.RemoteActionCompatParcelizer.ResultReceiver);
    }

    public static boolean MediaBrowserCompatMediaItem(getLink getlink) {
        return getlink != null && write(getlink, getZenArea.RemoteActionCompatParcelizer.onSkipToNext);
    }

    public static boolean RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            AudioAttributesCompatParcelizer(158);
        }
        return RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource, getZenArea.RemoteActionCompatParcelizer.onCustomAction);
    }

    public static boolean IconCompatParcelizer(getVariant getvariant) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(161);
        }
        if (getvariant.onPrepareFromMediaId().RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.MediaMetadataCompat)) {
            return true;
        }
        if (!(getvariant instanceof CourseConfigV2SettingsItems)) {
            return false;
        }
        CourseConfigV2SettingsItems courseConfigV2SettingsItems = (CourseConfigV2SettingsItems) getvariant;
        boolean zOnRewind = courseConfigV2SettingsItems.onRewind();
        CourseConfigV2TestItem courseConfigV2TestItemOnPlayFromMediaId = courseConfigV2SettingsItems.onPlayFromMediaId();
        getAppSettings getappsettingsOnPlayFromSearch = courseConfigV2SettingsItems.onPlayFromSearch();
        if (courseConfigV2TestItemOnPlayFromMediaId == null || !IconCompatParcelizer(courseConfigV2TestItemOnPlayFromMediaId)) {
            return false;
        }
        return !zOnRewind || (getappsettingsOnPlayFromSearch != null && IconCompatParcelizer(getappsettingsOnPlayFromSearch));
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
            case 132:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case 136:
            case 137:
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case TarConstants.CHKSUM_OFFSET /* 148 */:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case TarConstants.PREFIXLEN /* 155 */:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                objArr[2] = "isUShortArray";
                break;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                objArr[2] = "isUIntArray";
                break;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case TarConstants.PREFIXLEN /* 155 */:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
