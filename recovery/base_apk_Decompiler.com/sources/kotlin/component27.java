package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.component33;
import kotlin.toMagicModuleTimelineIndexLSModel;

/* JADX INFO: loaded from: classes4.dex */
public final class component27 implements deleteCourseTables, CourseConfigKeyConstantsKt {
    private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(component27.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    private final getBadgeText IconCompatParcelizer;
    private final component25 RemoteActionCompatParcelizer;
    private final component33.IconCompatParcelizer write;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[getTotalSubject.values().length];
            try {
                iArr[getTotalSubject.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getTotalSubject.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getTotalSubject.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public component27(component25 component25Var, getBadgeText getbadgetext) {
        CourseConfigSerializer<?> courseConfigSerializer;
        Object objAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        this.IconCompatParcelizer = getbadgetext;
        this.write = component33.read(new AnonymousClass3());
        if (component25Var == null) {
            getVariant getvariantAudioAttributesImplApi21Parcelizer = MediaMetadataCompat().onPlayFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer, "");
            if (getvariantAudioAttributesImplApi21Parcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
                objAudioAttributesCompatParcelizer = read((CourseConfigV2CustomModuleQuestionSource) getvariantAudioAttributesImplApi21Parcelizer);
            } else if (getvariantAudioAttributesImplApi21Parcelizer instanceof getTestHeaderTitle) {
                getVariant getvariantAudioAttributesImplApi21Parcelizer2 = ((getTestHeaderTitle) getvariantAudioAttributesImplApi21Parcelizer).onPlayFromMediaId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer2, "");
                if (getvariantAudioAttributesImplApi21Parcelizer2 instanceof CourseConfigV2CustomModuleQuestionSource) {
                    courseConfigSerializer = read((CourseConfigV2CustomModuleQuestionSource) getvariantAudioAttributesImplApi21Parcelizer2);
                } else {
                    getStepId getstepid = getvariantAudioAttributesImplApi21Parcelizer instanceof getStepId ? (getStepId) getvariantAudioAttributesImplApi21Parcelizer : null;
                    if (getstepid == null) {
                        throw new component28("Non-class callable descriptor must be deserialized: ".concat(String.valueOf(getvariantAudioAttributesImplApi21Parcelizer)));
                    }
                    isHdPlaybackError ishdplaybackerror = MagicModuleFeedbackRequestBody.read(AudioAttributesCompatParcelizer(getstepid));
                    toMagicModuleMetaRepoModel.read(ishdplaybackerror, "");
                    courseConfigSerializer = (CourseConfigSerializer) ishdplaybackerror;
                }
                objAudioAttributesCompatParcelizer = getvariantAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(new ContentResetResponseBookmark(courseConfigSerializer), getShowPopup.INSTANCE);
            } else {
                throw new component28("Unknown type parameter container: ".concat(String.valueOf(getvariantAudioAttributesImplApi21Parcelizer)));
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer, "");
            component25Var = (component25) objAudioAttributesCompatParcelizer;
        }
        this.RemoteActionCompatParcelizer = component25Var;
    }

    @Override // kotlin.CourseConfigKeyConstantsKt
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getBadgeText MediaMetadataCompat() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.deleteCourseTables
    /* JADX INFO: renamed from: write */
    public final String getRead() {
        String strAudioAttributesCompatParcelizer = MediaMetadataCompat().aQ_().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        return strAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.component27$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lo/component26;", "RemoteActionCompatParcelizer", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends component26>> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<component26> invoke() {
            List<getLink> listMediaBrowserCompatCustomActionResultReceiver = component27.this.MediaMetadataCompat().MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver, "");
            List<getLink> list = listMediaBrowserCompatCustomActionResultReceiver;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new component26((getLink) it.next()));
            }
            return arrayList;
        }

        AnonymousClass3() {
            super(0);
        }
    }

    @Override // kotlin.deleteCourseTables
    public final List<deleteOfflineDownloadedFiles> RemoteActionCompatParcelizer() {
        component33.IconCompatParcelizer iconCompatParcelizer = this.write;
        isResolutionNotSupported<Object> isresolutionnotsupported = AudioAttributesCompatParcelizer[0];
        T tWrite = iconCompatParcelizer.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tWrite, "");
        return (List) tWrite;
    }

    @Override // kotlin.deleteCourseTables
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final deleteSearchTables getRemoteActionCompatParcelizer() {
        int i = read.AudioAttributesCompatParcelizer[MediaMetadataCompat().MediaBrowserCompatMediaItem().ordinal()];
        if (i == 1) {
            return deleteSearchTables.AudioAttributesCompatParcelizer;
        }
        if (i == 2) {
            return deleteSearchTables.IconCompatParcelizer;
        }
        if (i == 3) {
            return deleteSearchTables.read;
        }
        throw new RenewEligibleCreator();
    }

    private static CourseConfigSerializer<?> read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        Class<?> clsAudioAttributesCompatParcelizer = getCourseStrings.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource);
        CourseConfigSerializer<?> courseConfigSerializer = (CourseConfigSerializer) (clsAudioAttributesCompatParcelizer != null ? MagicModuleFeedbackRequestBody.read(clsAudioAttributesCompatParcelizer) : null);
        if (courseConfigSerializer != null) {
            return courseConfigSerializer;
        }
        StringBuilder sb = new StringBuilder("Type parameter container is not resolved: ");
        sb.append(courseConfigV2CustomModuleQuestionSource.onPlayFromMediaId());
        throw new component28(sb.toString());
    }

    private static Class<?> AudioAttributesCompatParcelizer(getStepId getstepid) {
        Class<?> clsIconCompatParcelizer;
        setQuestions setquestionsOnSetRating = getstepid.onSetRating();
        getIntro getintro = setquestionsOnSetRating instanceof getIntro ? (getIntro) setquestionsOnSetRating : null;
        getMasterOrder getmasterorder = getintro != null ? getintro.read() : null;
        getMsInterimHtmlStartTime getmsinterimhtmlstarttime = getmasterorder instanceof getMsInterimHtmlStartTime ? (getMsInterimHtmlStartTime) getmasterorder : null;
        if (getmsinterimhtmlstarttime == null || (clsIconCompatParcelizer = getmsinterimhtmlstarttime.IconCompatParcelizer()) == null) {
            throw new component28("Container of deserialized member is not resolved: ".concat(String.valueOf(getstepid)));
        }
        return clsIconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof component27)) {
            return false;
        }
        component27 component27Var = (component27) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, component27Var.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getRead(), (Object) component27Var.getRead());
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + getRead().hashCode();
    }

    public final String toString() {
        toMagicModuleTimelineIndexLSModel.Companion companion = toMagicModuleTimelineIndexLSModel.INSTANCE;
        return toMagicModuleTimelineIndexLSModel.Companion.IconCompatParcelizer(this);
    }
}
