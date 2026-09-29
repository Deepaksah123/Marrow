package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.models.content.ImageInfo;
import com.marrow.data.models.lesson.StepIndex;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1 implements AdsMediaSourceAdPrepareListener {
    private final onUtcTimestampLoadCompleted AudioAttributesCompatParcelizer;
    private final onDashManifestPublishTimeExpired IconCompatParcelizer;
    private final withAdGroupTimeUs RemoteActionCompatParcelizer;
    private final onInitializationFailed read;

    @setSdkPayload
    public AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1(withAdGroupTimeUs withadgrouptimeus, onInitializationFailed oninitializationfailed, onUtcTimestampLoadCompleted onutctimestamploadcompleted, onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired) {
        toMagicModuleMetaRepoModel.write(withadgrouptimeus, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(onutctimestamploadcompleted, "");
        toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
        this.RemoteActionCompatParcelizer = withadgrouptimeus;
        this.read = oninitializationfailed;
        this.AudioAttributesCompatParcelizer = onutctimestamploadcompleted;
        this.IconCompatParcelizer = ondashmanifestpublishtimeexpired;
    }

    @Override // kotlin.AdsMediaSourceAdPrepareListener
    public final StepIndex read(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str, 0);
    }

    @Override // kotlin.AdsMediaSourceAdPrepareListener
    public final accessgetEmptyStatecp<ImageInfo[]> RemoteActionCompatParcelizer(final String str, final String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        accessgetEmptyStatecp<String[][]> accessgetemptystatecp = this.AudioAttributesCompatParcelizer.read(new String[]{"_id", "_video_meta"}, "lesson_id =?  AND step_type =? ", new String[]{str, SessionDescription.SUPPORTED_SDP_VERSION});
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.lambdaonPrepareError1comgoogleandroidexoplayer2sourceadsAdsMediaSourceAdPrepareListener
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str2, str, (String[][]) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpRemoteActionCompatParcelizer = accessgetemptystatecp.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.correctMediaLoadData
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1.AudioAttributesCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, "");
        return accessgetemptystatecpRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageInfo[] AudioAttributesCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (ImageInfo[]) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageInfo[] IconCompatParcelizer(AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1 adsMediaSourceAdPrepareListenerExternalSyntheticLambda1, String str, String str2, String[][] strArr) throws AdsMediaSourceAdPrepareListenerExternalSyntheticLambda0 {
        toMagicModuleMetaRepoModel.write(strArr, "");
        if (strArr.length != 0) {
            String[] strArr2 = strArr[0];
            ImageInfo[] imageInfoArrIconCompatParcelizer = adsMediaSourceAdPrepareListenerExternalSyntheticLambda1.RemoteActionCompatParcelizer.IconCompatParcelizer(strArr2[0], strArr2[1], str);
            if (imageInfoArrIconCompatParcelizer != null && imageInfoArrIconCompatParcelizer.length != 0) {
                final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.AdsMediaSourceComponentListener
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return Integer.valueOf(AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1.RemoteActionCompatParcelizer((ImageInfo) obj, (ImageInfo) obj2));
                    }
                };
                Arrays.sort(imageInfoArrIconCompatParcelizer, new Comparator() { // from class: o.AdsMediaSourceComponentListenerExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, obj, obj2);
                    }
                });
                return imageInfoArrIconCompatParcelizer;
            }
            throw new AdsMediaSourceAdPrepareListenerExternalSyntheticLambda0();
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format(Locale.getDefault(), "No slides found - LID: %s, NotesType:%s", Arrays.copyOf(new Object[]{str2, str}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        throw new DashMediaSource(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(ImageInfo imageInfo, ImageInfo imageInfo2) {
        toMagicModuleMetaRepoModel.write(imageInfo, "");
        toMagicModuleMetaRepoModel.write(imageInfo2, "");
        return imageInfo.getSort() - imageInfo2.getSort();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj, Object obj2) {
        return ((Number) magicModuleSubmissionRequestBody.invoke(obj, obj2)).intValue();
    }
}
