package kotlin;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PearlListItem {
    public static setDesriptionList write(List<getBadgeText> list, isVideoPlanCtype isvideoplanctype, getVariant getvariant, List<getBadgeText> list2) {
        if (list == null) {
            RemoteActionCompatParcelizer(0);
        }
        if (isvideoplanctype == null) {
            RemoteActionCompatParcelizer(1);
        }
        if (getvariant == null) {
            RemoteActionCompatParcelizer(2);
        }
        if (list2 == null) {
            RemoteActionCompatParcelizer(3);
        }
        setDesriptionList setdesriptionlistRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(list, isvideoplanctype, getvariant, list2, null);
        if (setdesriptionlistRemoteActionCompatParcelizer == null) {
            throw new AssertionError("Substitution failed");
        }
        if (setdesriptionlistRemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer(4);
        }
        return setdesriptionlistRemoteActionCompatParcelizer;
    }

    public static setDesriptionList RemoteActionCompatParcelizer(List<getBadgeText> list, isVideoPlanCtype isvideoplanctype, getVariant getvariant, List<getBadgeText> list2, boolean[] zArr) {
        if (list == null) {
            RemoteActionCompatParcelizer(5);
        }
        if (isvideoplanctype == null) {
            RemoteActionCompatParcelizer(6);
        }
        if (getvariant == null) {
            RemoteActionCompatParcelizer(7);
        }
        if (list2 == null) {
            RemoteActionCompatParcelizer(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i = 0;
        for (getBadgeText getbadgetext : list) {
            getWrongCount getwrongcountIconCompatParcelizer = getWrongCount.IconCompatParcelizer(getvariant, getbadgetext.RemoteActionCompatParcelizer(), getbadgetext.aZ_(), getbadgetext.MediaBrowserCompatMediaItem(), getbadgetext.aQ_(), i, getIntroDurationSeconds.AudioAttributesCompatParcelizer, getbadgetext.MediaBrowserCompatItemReceiver());
            map.put(getbadgetext.MediaBrowserCompatSearchResultReceiver(), new isIndividualPlan(getwrongcountIconCompatParcelizer.aP_()));
            map2.put(getbadgetext, getwrongcountIconCompatParcelizer);
            list2.add(getwrongcountIconCompatParcelizer);
            i++;
        }
        getSubscriptionDetails getsubscriptiondetailsWrite = getSubscriptionDetails.write(map);
        setDesriptionList setdesriptionlistRemoteActionCompatParcelizer = setDesriptionList.RemoteActionCompatParcelizer(isvideoplanctype, getsubscriptiondetailsWrite);
        setDesriptionList setdesriptionlistRemoteActionCompatParcelizer2 = setDesriptionList.RemoteActionCompatParcelizer(isvideoplanctype.MediaBrowserCompatCustomActionResultReceiver(), getsubscriptiondetailsWrite);
        for (getBadgeText getbadgetext2 : list) {
            getWrongCount getwrongcount = (getWrongCount) map2.get(getbadgetext2);
            for (getLink getlink : getbadgetext2.MediaBrowserCompatCustomActionResultReceiver()) {
                getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
                getLink getlinkIconCompatParcelizer = (((getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText) && getSearchTimes.AudioAttributesCompatParcelizer((getBadgeText) getquestionlimitRemoteActionCompatParcelizer)) ? setdesriptionlistRemoteActionCompatParcelizer : setdesriptionlistRemoteActionCompatParcelizer2).IconCompatParcelizer(getlink, getTotalSubject.OUT_VARIANCE);
                if (getlinkIconCompatParcelizer == null) {
                    return null;
                }
                if (getlinkIconCompatParcelizer != getlink && zArr != null) {
                    zArr[0] = true;
                }
                getwrongcount.AudioAttributesCompatParcelizer(getlinkIconCompatParcelizer);
            }
            getwrongcount.onCommand();
        }
        return setdesriptionlistRemoteActionCompatParcelizer;
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }
}
