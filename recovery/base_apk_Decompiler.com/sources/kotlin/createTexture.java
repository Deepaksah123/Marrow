package kotlin;

import com.marrow.data.models.test.TopUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createTexture {
    public static final TopUser[] AudioAttributesCompatParcelizer(List<createEglDisplay> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        List<createEglDisplay> list2 = list;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (createEglDisplay createegldisplay : list2) {
            TopUser topUser = new TopUser();
            topUser.testId = createegldisplay.AudioAttributesImplApi21Parcelizer();
            topUser.id = createegldisplay.AudioAttributesCompatParcelizer();
            topUser.rank = createegldisplay.MediaBrowserCompatCustomActionResultReceiver();
            int iRemoteActionCompatParcelizer = logAssumedSupport.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = logAssumedSupport.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = logAssumedSupport.RemoteActionCompatParcelizer();
            topUser.firstName = (String) createEglDisplay.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2, 1804388920, -1804388919, logAssumedSupport.RemoteActionCompatParcelizer(), new Object[]{createegldisplay}, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer);
            topUser.lastName = createegldisplay.RemoteActionCompatParcelizer();
            topUser.profilePic = createegldisplay.write();
            topUser.score = createegldisplay.AudioAttributesImplApi26Parcelizer();
            topUser.skipped = createegldisplay.MediaBrowserCompatItemReceiver();
            topUser.wrong = createegldisplay.MediaDescriptionCompat();
            topUser.correct = createegldisplay.IconCompatParcelizer();
            topUser.isAnonymous = createegldisplay.MediaBrowserCompatSearchResultReceiver();
            topUser.stateId = createegldisplay.AudioAttributesImplBaseParcelizer();
            arrayList2.add(Boolean.valueOf(arrayList.add(topUser)));
        }
        return (TopUser[]) arrayList.toArray(new TopUser[0]);
    }

    public static final List<createEglDisplay> RemoteActionCompatParcelizer(TopUser[] topUserArr) {
        TopUser[] topUserArr2 = topUserArr;
        String str = "";
        toMagicModuleMetaRepoModel.write(topUserArr2, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(topUserArr2.length);
        int i = 0;
        for (int length = topUserArr2.length; i < length; length = length) {
            TopUser topUser = topUserArr2[i];
            String str2 = topUser.testId;
            String str3 = topUser.id;
            arrayList2.add(Boolean.valueOf(arrayList.add(new createEglDisplay(str2, str3 == null ? str : str3, topUser.rank, topUser.firstName, topUser.lastName, topUser.profilePic, topUser.score, topUser.skipped, topUser.wrong, topUser.correct, topUser.isAnonymous, topUser.stateId))));
            i++;
            topUserArr2 = topUserArr;
            str = str;
        }
        return IntermediateLoginResponseBody.onPlay(arrayList);
    }
}
