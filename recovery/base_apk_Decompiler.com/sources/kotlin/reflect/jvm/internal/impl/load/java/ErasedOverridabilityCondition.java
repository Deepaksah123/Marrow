package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.CourseConfigV2CustomModuleQuestionSource;
import kotlin.CourseConfigV2NavDrawerItemRateUs;
import kotlin.CourseConfigV2SupportItem;
import kotlin.CourseConfigV2TestTabItem;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleUseCase;
import kotlin.StateResult;
import kotlin.getAnswerMap;
import kotlin.getBadgeText;
import kotlin.getLink;
import kotlin.getMeta;
import kotlin.getOptions;
import kotlin.getTagsList;
import kotlin.getTopRankers;
import kotlin.getVideoPageNotesTitle;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.setPearlList;
import kotlin.setUserInitiatedExamStartedOn;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getOptions.RemoteActionCompatParcelizer.IconCompatParcelizer.values().length];
            try {
                iArr[getOptions.RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.read isOverridable(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle2, "");
        if (getvideopagenotestitle2 instanceof setUserInitiatedExamStartedOn) {
            setUserInitiatedExamStartedOn setuserinitiatedexamstartedon = (setUserInitiatedExamStartedOn) getvideopagenotestitle2;
            List<getBadgeText> listMediaDescriptionCompat = setuserinitiatedexamstartedon.MediaDescriptionCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat, "");
            if (listMediaDescriptionCompat.isEmpty()) {
                getOptions.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = getOptions.write(getvideopagenotestitle, getvideopagenotestitle2);
                if ((remoteActionCompatParcelizerWrite != null ? remoteActionCompatParcelizerWrite.IconCompatParcelizer() : null) != null) {
                    return ExternalOverridabilityCondition.read.UNKNOWN;
                }
                List<getMeta> listAX_ = setuserinitiatedexamstartedon.aX_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
                getTopRankers gettoprankersWrite = StateResult.write(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) listAX_), AudioAttributesCompatParcelizer.write);
                getLink getlinkAudioAttributesImplBaseParcelizer = setuserinitiatedexamstartedon.AudioAttributesImplBaseParcelizer();
                toMagicModuleMetaRepoModel.write(getlinkAudioAttributesImplBaseParcelizer);
                getTopRankers gettoprankersIconCompatParcelizer = StateResult.IconCompatParcelizer((getTopRankers<? extends getLink>) gettoprankersWrite, getlinkAudioAttributesImplBaseParcelizer);
                CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = setuserinitiatedexamstartedon.MediaBrowserCompatCustomActionResultReceiver();
                Iterator itWrite = StateResult.read(gettoprankersIconCompatParcelizer, IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver != null ? courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId() : null)).write();
                while (itWrite.hasNext()) {
                    getLink getlink = (getLink) itWrite.next();
                    if (!getlink.bb_().isEmpty() && !(getlink.MediaBrowserCompatMediaItem() instanceof getTagsList)) {
                        return ExternalOverridabilityCondition.read.UNKNOWN;
                    }
                }
                CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsWrite = getvideopagenotestitle.write(new setPearlList((byte) 0).AudioAttributesImplBaseParcelizer());
                if (courseConfigV2NavDrawerItemRateUsWrite == null) {
                    return ExternalOverridabilityCondition.read.UNKNOWN;
                }
                if (courseConfigV2NavDrawerItemRateUsWrite instanceof CourseConfigV2SupportItem) {
                    CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) courseConfigV2NavDrawerItemRateUsWrite;
                    List<getBadgeText> listMediaDescriptionCompat2 = courseConfigV2SupportItem.MediaDescriptionCompat();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat2, "");
                    if (!listMediaDescriptionCompat2.isEmpty()) {
                        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsIconCompatParcelizer = courseConfigV2SupportItem.onRemoveQueueItemAt().IconCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer()).IconCompatParcelizer();
                        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUsIconCompatParcelizer);
                        courseConfigV2NavDrawerItemRateUsWrite = courseConfigV2NavDrawerItemRateUsIconCompatParcelizer;
                    }
                }
                getOptions.RemoteActionCompatParcelizer.IconCompatParcelizer IconCompatParcelizer = getOptions.RemoteActionCompatParcelizer.read(courseConfigV2NavDrawerItemRateUsWrite, getvideopagenotestitle2, false).IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(IconCompatParcelizer, "");
                if (read.IconCompatParcelizer[IconCompatParcelizer.ordinal()] == 1) {
                    return ExternalOverridabilityCondition.read.OVERRIDABLE;
                }
                return ExternalOverridabilityCondition.read.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.read.UNKNOWN;
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getMeta, getLink> {
        public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer();

        private static getLink read(getMeta getmeta) {
            return getmeta.onPrepareFromMediaId();
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getLink invoke(getMeta getmeta) {
            return read(getmeta);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.IconCompatParcelizer getContract() {
        return ExternalOverridabilityCondition.IconCompatParcelizer.SUCCESS_ONLY;
    }
}
