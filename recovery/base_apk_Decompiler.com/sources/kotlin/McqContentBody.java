package kotlin;

import java.util.Comparator;
import java.util.List;
import kotlin.setGuessed;

/* JADX INFO: loaded from: classes4.dex */
public final class McqContentBody implements Comparator<getVariant> {
    private static final setGuessed IconCompatParcelizer;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(getVariant getvariant, getVariant getvariant2) {
        return IconCompatParcelizer(getvariant, getvariant2);
    }

    static {
        new McqContentBody();
        setGuessed.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = setGuessed.write;
        IconCompatParcelizer = setGuessed.AudioAttributesCompatParcelizer.IconCompatParcelizer(new getAnswerMap<setFirstAnswer, getShowPopup>() { // from class: o.McqContentBody.4
            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
                return AudioAttributesCompatParcelizer(setfirstanswer);
            }

            private static getShowPopup AudioAttributesCompatParcelizer(setFirstAnswer setfirstanswer) {
                setfirstanswer.AudioAttributesImplBaseParcelizer(false);
                setfirstanswer.write(true);
                setfirstanswer.read(isFirstAnswerSkipped.UNLESS_EMPTY);
                setfirstanswer.RemoteActionCompatParcelizer(isSillyMistake.RemoteActionCompatParcelizer);
                return getShowPopup.INSTANCE;
            }
        });
    }

    private McqContentBody() {
    }

    public static class AudioAttributesCompatParcelizer implements Comparator<getVariant> {
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer();

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(getVariant getvariant, getVariant getvariant2) {
            return write(getvariant, getvariant2);
        }

        private AudioAttributesCompatParcelizer() {
        }

        private static int read(getVariant getvariant) {
            if (getAnswerDescription.AudioAttributesImplApi26Parcelizer(getvariant)) {
                return 8;
            }
            if (getvariant instanceof CourseConfigV2GtAnalyticsCard) {
                return 7;
            }
            if (getvariant instanceof CourseConfigV2SettingsItems) {
                return ((CourseConfigV2SettingsItems) getvariant).MediaBrowserCompatCustomActionResultReceiver() == null ? 6 : 5;
            }
            if (getvariant instanceof CourseConfigV2NavDrawerItemRateUs) {
                return ((CourseConfigV2NavDrawerItemRateUs) getvariant).MediaBrowserCompatCustomActionResultReceiver() == null ? 4 : 3;
            }
            if (getvariant instanceof CourseConfigV2CustomModuleQuestionSource) {
                return 2;
            }
            return getvariant instanceof CourseConfigV2VideoProperties ? 1 : 0;
        }

        private static int write(getVariant getvariant, getVariant getvariant2) {
            Integer numIconCompatParcelizer = IconCompatParcelizer(getvariant, getvariant2);
            if (numIconCompatParcelizer != null) {
                return numIconCompatParcelizer.intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Integer IconCompatParcelizer(getVariant getvariant, getVariant getvariant2) {
            int i = read(getvariant2) - read(getvariant);
            if (i != 0) {
                return Integer.valueOf(i);
            }
            if (getAnswerDescription.AudioAttributesImplApi26Parcelizer(getvariant) && getAnswerDescription.AudioAttributesImplApi26Parcelizer(getvariant2)) {
                return 0;
            }
            int iCompareTo = getvariant.aQ_().compareTo(getvariant2.aQ_());
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }
    }

    private static int IconCompatParcelizer(getVariant getvariant, getVariant getvariant2) {
        Integer numIconCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(getvariant, getvariant2);
        if (numIconCompatParcelizer != null) {
            return numIconCompatParcelizer.intValue();
        }
        if ((getvariant instanceof CourseConfigV2VideoProperties) && (getvariant2 instanceof CourseConfigV2VideoProperties)) {
            setGuessed setguessed = IconCompatParcelizer;
            int iCompareTo = setguessed.read(((CourseConfigV2VideoProperties) getvariant).AudioAttributesImplBaseParcelizer()).compareTo(setguessed.read(((CourseConfigV2VideoProperties) getvariant2).AudioAttributesImplBaseParcelizer()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else if ((getvariant instanceof getVideoPageNotesTitle) && (getvariant2 instanceof getVideoPageNotesTitle)) {
            getVideoPageNotesTitle getvideopagenotestitle = (getVideoPageNotesTitle) getvariant;
            getVideoPageNotesTitle getvideopagenotestitle2 = (getVideoPageNotesTitle) getvariant2;
            CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = getvideopagenotestitle.MediaBrowserCompatCustomActionResultReceiver();
            CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver2 = getvideopagenotestitle2.MediaBrowserCompatCustomActionResultReceiver();
            if (courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver != null) {
                setGuessed setguessed2 = IconCompatParcelizer;
                int iCompareTo2 = setguessed2.read(courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId()).compareTo(setguessed2.read(courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver2.onPrepareFromMediaId()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            List<getMeta> listAX_ = getvideopagenotestitle.aX_();
            List<getMeta> listAX_2 = getvideopagenotestitle2.aX_();
            for (int i = 0; i < Math.min(listAX_.size(), listAX_2.size()); i++) {
                setGuessed setguessed3 = IconCompatParcelizer;
                int iCompareTo3 = setguessed3.read(listAX_.get(i).onPrepareFromMediaId()).compareTo(setguessed3.read(listAX_2.get(i).onPrepareFromMediaId()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = listAX_.size() - listAX_2.size();
            if (size != 0) {
                return size;
            }
            List<getBadgeText> listMediaDescriptionCompat = getvideopagenotestitle.MediaDescriptionCompat();
            List<getBadgeText> listMediaDescriptionCompat2 = getvideopagenotestitle2.MediaDescriptionCompat();
            for (int i2 = 0; i2 < Math.min(listMediaDescriptionCompat.size(), listMediaDescriptionCompat2.size()); i2++) {
                List<getLink> listMediaBrowserCompatCustomActionResultReceiver = listMediaDescriptionCompat.get(i2).MediaBrowserCompatCustomActionResultReceiver();
                List<getLink> listMediaBrowserCompatCustomActionResultReceiver2 = listMediaDescriptionCompat2.get(i2).MediaBrowserCompatCustomActionResultReceiver();
                int size2 = listMediaBrowserCompatCustomActionResultReceiver.size() - listMediaBrowserCompatCustomActionResultReceiver2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i3 = 0; i3 < listMediaBrowserCompatCustomActionResultReceiver.size(); i3++) {
                    setGuessed setguessed4 = IconCompatParcelizer;
                    int iCompareTo4 = setguessed4.read(listMediaBrowserCompatCustomActionResultReceiver.get(i3)).compareTo(setguessed4.read(listMediaBrowserCompatCustomActionResultReceiver2.get(i3)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = listMediaDescriptionCompat.size() - listMediaDescriptionCompat2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((getvideopagenotestitle instanceof getTestHeaderTitle) && (getvideopagenotestitle2 instanceof getTestHeaderTitle)) {
                int iOrdinal = ((getTestHeaderTitle) getvideopagenotestitle).handleMediaPlayPauseIfPendingOnHandler().ordinal() - ((getTestHeaderTitle) getvideopagenotestitle2).handleMediaPlayPauseIfPendingOnHandler().ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal;
                }
            }
        } else if ((getvariant instanceof CourseConfigV2CustomModuleQuestionSource) && (getvariant2 instanceof CourseConfigV2CustomModuleQuestionSource)) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) getvariant;
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = (CourseConfigV2CustomModuleQuestionSource) getvariant2;
            if (courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer().ordinal() != courseConfigV2CustomModuleQuestionSource2.AudioAttributesImplBaseParcelizer().ordinal()) {
                return courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer().ordinal() - courseConfigV2CustomModuleQuestionSource2.AudioAttributesImplBaseParcelizer().ordinal();
            }
            if (courseConfigV2CustomModuleQuestionSource.onAddQueueItem() != courseConfigV2CustomModuleQuestionSource2.onAddQueueItem()) {
                return courseConfigV2CustomModuleQuestionSource.onAddQueueItem() ? 1 : -1;
            }
        } else {
            throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", getvariant, getvariant.getClass(), getvariant2, getvariant2.getClass()));
        }
        setGuessed setguessed5 = IconCompatParcelizer;
        int iCompareTo5 = setguessed5.RemoteActionCompatParcelizer(getvariant).compareTo(setguessed5.RemoteActionCompatParcelizer(getvariant2));
        return iCompareTo5 != 0 ? iCompareTo5 : getAnswerDescription.AudioAttributesCompatParcelizer(getvariant).aQ_().compareTo(getAnswerDescription.AudioAttributesCompatParcelizer(getvariant2).aQ_());
    }
}
