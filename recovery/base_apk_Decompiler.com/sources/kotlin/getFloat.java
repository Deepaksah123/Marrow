package kotlin;

import com.marrow.data.api.models.response.common.LearnMoreResponse;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.common.Editor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.setLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class getFloat {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[CourseConfigV2.BottomTabItem.values().length];
            try {
                iArr[CourseConfigV2.BottomTabItem.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseConfigV2.BottomTabItem.QBANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CourseConfigV2.BottomTabItem.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CourseConfigV2.BottomTabItem.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            write = iArr;
        }
    }

    public static final LogLogger1 IconCompatParcelizer(LearnMoreResponse learnMoreResponse) {
        toMagicModuleMetaRepoModel.write(learnMoreResponse, "");
        String title = learnMoreResponse.getTitle();
        String description = learnMoreResponse.getDescription();
        List<LearnMoreResponse.LearnMoreCard> cards = learnMoreResponse.getCards();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) cards, 10));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(IconCompatParcelizer((LearnMoreResponse.LearnMoreCard) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        String oneLiner = learnMoreResponse.getOneLiner();
        String textPrimaryBtn = learnMoreResponse.getTextPrimaryBtn();
        String textSecondaryBtn = learnMoreResponse.getTextSecondaryBtn();
        boolean showEditors = learnMoreResponse.getShowEditors();
        String specialQuesHeader = learnMoreResponse.getSpecialQuesHeader();
        List<LearnMoreResponse.Specials> specialList = learnMoreResponse.getSpecialList();
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) specialList, 10));
        Iterator<T> it2 = specialList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AudioAttributesCompatParcelizer((LearnMoreResponse.Specials) it2.next()));
        }
        return new LogLogger1(title, showEditors, description, oneLiner, arrayList2, textPrimaryBtn, textSecondaryBtn, specialQuesHeader, arrayList3);
    }

    public static final List<LongArray> IconCompatParcelizer(List<? extends Editor> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<? extends Editor> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (Editor editor : list2) {
            String displayname = editor.getDisplayname();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(displayname, "");
            String profilePicture = editor.getProfilePicture();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(profilePicture, "");
            String qualification = editor.getQualification();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(qualification, "");
            arrayList.add(new LongArray(displayname, profilePicture, qualification));
        }
        return arrayList;
    }

    private static createFormatFromMediaFormat IconCompatParcelizer(LearnMoreResponse.LearnMoreCard learnMoreCard) {
        toMagicModuleMetaRepoModel.write(learnMoreCard, "");
        return new createFormatFromMediaFormat(learnMoreCard.getIconUrl(), learnMoreCard.getCardTitle(), learnMoreCard.getPoints());
    }

    private static MediaClock AudioAttributesCompatParcelizer(LearnMoreResponse.Specials specials) {
        toMagicModuleMetaRepoModel.write(specials, "");
        return new MediaClock(specials.getTitle(), specials.getDescription());
    }

    public static final setLogStackTraces write(CourseConfigV2.AnnouncementBanner announcementBanner) {
        toMagicModuleMetaRepoModel.write(announcementBanner, "");
        String id = announcementBanner.getId();
        String text = announcementBanner.getText();
        List<String> subjectIds = announcementBanner.getSubjectIds();
        CourseConfigV2.AnnouncementPopup popup = announcementBanner.getPopup();
        return new setLogStackTraces(id, text, subjectIds, popup != null ? popup.getBody() : null);
    }

    public static final setLogger RemoteActionCompatParcelizer(CourseConfigV2.EditionUpdatePopup editionUpdatePopup) {
        toMagicModuleMetaRepoModel.write(editionUpdatePopup, "");
        setLogger.write.Companion companion = setLogger.write.INSTANCE;
        setLogger.write writeVar = setLogger.write.Companion.read(editionUpdatePopup.getVariant());
        if (writeVar == null) {
            return null;
        }
        return new setLogger(writeVar, editionUpdatePopup.getAckKey());
    }

    public static final List<DataBuffer> write(List<? extends CourseConfigV2.BottomTabItem> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<? extends CourseConfigV2.BottomTabItem> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(write((CourseConfigV2.BottomTabItem) it.next()));
        }
        return arrayList;
    }

    public static final DataBuffer write(CourseConfigV2.BottomTabItem bottomTabItem) {
        toMagicModuleMetaRepoModel.write(bottomTabItem, "");
        int i = IconCompatParcelizer.write[bottomTabItem.ordinal()];
        if (i == 1) {
            return DataBuffer.AudioAttributesCompatParcelizer;
        }
        if (i == 2) {
            return DataBuffer.RemoteActionCompatParcelizer;
        }
        if (i == 3) {
            return DataBuffer.write;
        }
        if (i != 4) {
            throw new RenewEligibleCreator();
        }
        return DataBuffer.read;
    }
}
