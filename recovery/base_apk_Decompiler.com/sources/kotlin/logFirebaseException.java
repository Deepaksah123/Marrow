package kotlin;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.getGroupDescription;

/* JADX INFO: loaded from: classes4.dex */
public final class logFirebaseException {

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[deleteSearchTables.values().length];
            try {
                iArr[deleteSearchTables.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deleteSearchTables.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[deleteSearchTables.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final deleteOfflineDownloadedFiles read(isApiBlockError isapiblockerror, List<clearAllAppData> list, boolean z, List<? extends Annotation> list2) {
        getQuestionLimit getquestionlimitMediaMetadataCompat;
        getGroupDescription getgroupdescriptionRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(isapiblockerror, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        CourseConfigKeyConstantsKt courseConfigKeyConstantsKt = isapiblockerror instanceof CourseConfigKeyConstantsKt ? (CourseConfigKeyConstantsKt) isapiblockerror : null;
        if (courseConfigKeyConstantsKt == null || (getquestionlimitMediaMetadataCompat = courseConfigKeyConstantsKt.MediaMetadataCompat()) == null) {
            StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
            sb.append(isapiblockerror);
            sb.append(" (");
            sb.append(isapiblockerror.getClass());
            sb.append(')');
            throw new component28(sb.toString());
        }
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = getquestionlimitMediaMetadataCompat.MediaBrowserCompatSearchResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver, "");
        List<getBadgeText> listAudioAttributesCompatParcelizer = getplanaddonsMediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        if (listAudioAttributesCompatParcelizer.size() != list.size()) {
            StringBuilder sb2 = new StringBuilder("Class declares ");
            sb2.append(listAudioAttributesCompatParcelizer.size());
            sb2.append(" type parameters, but ");
            sb2.append(list.size());
            sb2.append(" were provided.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (list2.isEmpty()) {
            getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
            getgroupdescriptionRemoteActionCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        } else {
            getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = getGroupDescription.AudioAttributesCompatParcelizer;
            getgroupdescriptionRemoteActionCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }
        return new component26(AudioAttributesCompatParcelizer(getgroupdescriptionRemoteActionCompatParcelizer, getplanaddonsMediaBrowserCompatSearchResultReceiver, list, z));
    }

    private static final getHref AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription, getPlanAddOns getplanaddons, List<clearAllAppData> list, boolean z) {
        isPlanContainsAnyVideo getdiscountedprice;
        List<getBadgeText> listAudioAttributesCompatParcelizer = getplanaddons.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        List<clearAllAppData> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        int i = 0;
        for (Object obj : list2) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            clearAllAppData clearallappdata = (clearAllAppData) obj;
            component26 component26Var = (component26) clearallappdata.read();
            getLink getlinkAudioAttributesCompatParcelizer = component26Var != null ? component26Var.AudioAttributesCompatParcelizer() : null;
            deleteSearchTables deletesearchtablesRemoteActionCompatParcelizer = clearallappdata.RemoteActionCompatParcelizer();
            int i2 = deletesearchtablesRemoteActionCompatParcelizer == null ? -1 : RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[deletesearchtablesRemoteActionCompatParcelizer.ordinal()];
            if (i2 == -1) {
                getBadgeText getbadgetext = listAudioAttributesCompatParcelizer.get(i);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getbadgetext, "");
                getdiscountedprice = new getDiscountedPrice(getbadgetext);
            } else if (i2 == 1) {
                getTotalSubject gettotalsubject = getTotalSubject.INVARIANT;
                toMagicModuleMetaRepoModel.write(getlinkAudioAttributesCompatParcelizer);
                getdiscountedprice = new isIndividualPlan(gettotalsubject, getlinkAudioAttributesCompatParcelizer);
            } else if (i2 == 2) {
                getTotalSubject gettotalsubject2 = getTotalSubject.IN_VARIANCE;
                toMagicModuleMetaRepoModel.write(getlinkAudioAttributesCompatParcelizer);
                getdiscountedprice = new isIndividualPlan(gettotalsubject2, getlinkAudioAttributesCompatParcelizer);
            } else if (i2 == 3) {
                getTotalSubject gettotalsubject3 = getTotalSubject.OUT_VARIANCE;
                toMagicModuleMetaRepoModel.write(getlinkAudioAttributesCompatParcelizer);
                getdiscountedprice = new isIndividualPlan(gettotalsubject3, getlinkAudioAttributesCompatParcelizer);
            } else {
                throw new RenewEligibleCreator();
            }
            arrayList.add(getdiscountedprice);
            i++;
        }
        return AddOnMetaKt.write(getgroupdescription, getplanaddons, arrayList, z);
    }
}
