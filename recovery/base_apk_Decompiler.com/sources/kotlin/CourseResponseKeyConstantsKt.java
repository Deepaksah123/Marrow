package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseResponseKeyConstantsKt {
    public static final List<getBadgeText> IconCompatParcelizer(getBadge getbadge) {
        List<getBadgeText> listRemoteActionCompatParcelizer;
        getVariant next;
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.write(getbadge, "");
        List<getBadgeText> listMediaBrowserCompatItemReceiver = getbadge.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver, "");
        if (!getbadge.onPrepareFromSearch() && !(getbadge.onPlayFromMediaId() instanceof getVideoPageNotesTitle)) {
            return listMediaBrowserCompatItemReceiver;
        }
        getBadge getbadge2 = getbadge;
        List listMediaBrowserCompatItemReceiver2 = StateResult.MediaBrowserCompatItemReceiver(StateResult.RemoteActionCompatParcelizer(StateResult.IconCompatParcelizer(StateResult.AudioAttributesImplApi26Parcelizer(setLocked.AudioAttributesImplApi21Parcelizer(getbadge2), AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer), (getAnswerMap) read.AudioAttributesCompatParcelizer), (getAnswerMap) write.RemoteActionCompatParcelizer));
        Iterator<getVariant> itWrite = setLocked.AudioAttributesImplApi21Parcelizer(getbadge2).write();
        while (true) {
            listRemoteActionCompatParcelizer = null;
            if (!itWrite.hasNext()) {
                next = null;
                break;
            }
            next = itWrite.next();
            if (next instanceof CourseConfigV2CustomModuleQuestionSource) {
                break;
            }
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) next;
        if (courseConfigV2CustomModuleQuestionSource != null && (getplanaddonsMediaBrowserCompatSearchResultReceiver = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver()) != null) {
            listRemoteActionCompatParcelizer = getplanaddonsMediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer();
        }
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (listMediaBrowserCompatItemReceiver2.isEmpty() && listRemoteActionCompatParcelizer.isEmpty()) {
            List<getBadgeText> listMediaBrowserCompatItemReceiver3 = getbadge.MediaBrowserCompatItemReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver3, "");
            return listMediaBrowserCompatItemReceiver3;
        }
        List<getBadgeText> listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) listMediaBrowserCompatItemReceiver2, (Iterable) listRemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        for (getBadgeText getbadgetext : listAudioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getbadgetext, "");
            arrayList.add(IconCompatParcelizer(getbadgetext, getbadge2, listMediaBrowserCompatItemReceiver.size()));
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) listMediaBrowserCompatItemReceiver, (Iterable) arrayList);
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getVariant, Boolean> {
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();

        private static Boolean write(getVariant getvariant) {
            toMagicModuleMetaRepoModel.write(getvariant, "");
            return Boolean.valueOf(getvariant instanceof getVideoPageNotesTitle);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(getVariant getvariant) {
            return write(getvariant);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<getVariant, Boolean> {
        public static final read AudioAttributesCompatParcelizer = new read();

        private static Boolean AudioAttributesCompatParcelizer(getVariant getvariant) {
            toMagicModuleMetaRepoModel.write(getvariant, "");
            return Boolean.valueOf(!(getvariant instanceof CourseConfigV2GtAnalyticsCard));
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(getVariant getvariant) {
            return AudioAttributesCompatParcelizer(getvariant);
        }

        read() {
            super(1);
        }
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<getVariant, getTopRankers<? extends getBadgeText>> {
        public static final write RemoteActionCompatParcelizer = new write();

        private static getTopRankers<getBadgeText> IconCompatParcelizer(getVariant getvariant) {
            toMagicModuleMetaRepoModel.write(getvariant, "");
            List<getBadgeText> listMediaDescriptionCompat = ((getVideoPageNotesTitle) getvariant).MediaDescriptionCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat, "");
            return IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) listMediaDescriptionCompat);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getTopRankers<? extends getBadgeText> invoke(getVariant getvariant) {
            return IconCompatParcelizer(getvariant);
        }

        write() {
            super(1);
        }
    }

    private static final getVideoHeaderTitle IconCompatParcelizer(getBadgeText getbadgetext, getVariant getvariant, int i) {
        return new getVideoHeaderTitle(getbadgetext, getvariant, i);
    }

    public static final getAccountSettings AudioAttributesCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        return write(getlink, getquestionlimitRemoteActionCompatParcelizer instanceof getBadge ? (getBadge) getquestionlimitRemoteActionCompatParcelizer : null, 0);
    }

    private static final getAccountSettings write(getLink getlink, getBadge getbadge, int i) {
        if (getbadge == null) {
            return null;
        }
        getBadge getbadge2 = getbadge;
        if (SubscriptionType.write(getbadge2)) {
            return null;
        }
        int size = getbadge.MediaBrowserCompatItemReceiver().size() + i;
        if (!getbadge.onPrepareFromSearch()) {
            if (size != getlink.bb_().size()) {
                getAnswerDescription.MediaDescriptionCompat(getbadge2);
            }
            return new getAccountSettings(getbadge, getlink.bb_().subList(i, getlink.bb_().size()), null);
        }
        List<setDefault> listSubList = getlink.bb_().subList(i, size);
        getVariant getvariantAudioAttributesImplApi21Parcelizer = getbadge.onPlayFromMediaId();
        return new getAccountSettings(getbadge, listSubList, write(getlink, getvariantAudioAttributesImplApi21Parcelizer instanceof getBadge ? (getBadge) getvariantAudioAttributesImplApi21Parcelizer : null, size));
    }
}
