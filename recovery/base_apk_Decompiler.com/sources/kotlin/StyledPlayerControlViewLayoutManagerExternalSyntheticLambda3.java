package kotlin;

import android.content.Context;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.marrow.R;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import com.marrow2.data.tag.local.model.TagLSModel;
import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rJ&\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\u0010*\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/marrow2/AnalyticsUtils;", "", "<init>", "()V", "FILTER_TITLE_ALL", "", "getReviewFilterName", "selectedFilterType", "", "getFeedbackErrorString", LogCategory.CONTEXT, "Landroid/content/Context;", "errors", "", "getMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Lcom/marrow2/ui/custom_module/creation/model/CustomModuleCreationArgs;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3 {
    public static final StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3 write = new StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3();

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[AccountTransferClient.values().length];
            try {
                iArr[AccountTransferClient.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountTransferClient.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountTransferClient.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountTransferClient.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountTransferClient.AudioAttributesImplBaseParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountTransferClient.AudioAttributesImplApi21Parcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountTransferClient.read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountTransferClient.write.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountTransferClient.MediaBrowserCompatItemReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    private StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3() {
    }

    public static String IconCompatParcelizer(int i) {
        switch (i) {
            case -12:
                return "Schema MCQs";
            case -11:
                return "Silly Mistakes";
            case -10:
                return "Guessed Right";
            case -9:
                return "Guessed Wrong";
            case -8:
                return "Changed by You";
            case -7:
                return "New / Revised";
            case -6:
                return "Bookmarked";
            case -5:
                return "Skipped";
            case -4:
                return "Correct";
            case -3:
                return "Wrong";
            case -2:
                return "Subject";
            case -1:
                return "Guessed";
            default:
                return FilterItemRecord.filter_all_title;
        }
    }

    public static String read(Context context, List<Integer> list) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        String string = "";
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue == 1) {
                String string2 = context.getString(R.string.factual_error);
                StringBuilder sb = new StringBuilder();
                sb.append((Object) string);
                sb.append(string2);
                sb.append(",");
                string = sb.toString();
            } else if (iIntValue == 2) {
                String string3 = context.getString(R.string.confusing_question);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) string);
                sb2.append(string3);
                sb2.append(",");
                string = sb2.toString();
            } else if (iIntValue == 3) {
                String string4 = context.getString(R.string.inadequate_exp);
                StringBuilder sb3 = new StringBuilder();
                sb3.append((Object) string);
                sb3.append(string4);
                sb3.append(",");
                string = sb3.toString();
            }
        }
        String strSubstring = string.substring(0, string.length() - 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public static HashMap<String, Object> RemoteActionCompatParcelizer(WorkAccountClient workAccountClient) {
        toMagicModuleMetaRepoModel.write(workAccountClient, "");
        List<TagLSModel> listMediaBrowserCompatMediaItem = workAccountClient.MediaBrowserCompatMediaItem();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listMediaBrowserCompatMediaItem, 10));
        Iterator<T> it = listMediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            arrayList.add(((TagLSModel) it.next()).getTitle());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = workAccountClient.MediaBrowserCompatItemReceiver().iterator();
        while (it2.hasNext()) {
            switch (read.IconCompatParcelizer[((AccountTransferClient) it2.next()).ordinal()]) {
                case 1:
                    arrayList2.add("incorrect");
                    break;
                case 2:
                    arrayList2.add("attempted");
                    break;
                case 3:
                    arrayList2.add("unattempted");
                    break;
                case 4:
                    arrayList2.add(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    break;
                case 5:
                    arrayList2.add("2");
                    break;
                case 6:
                    arrayList2.add("3");
                    break;
                case 7:
                    arrayList2.add("correct");
                    break;
                case 8:
                    arrayList2.add("wrong");
                    break;
                case 9:
                    arrayList2.add("skip");
                    break;
                default:
                    throw new RenewEligibleCreator();
            }
        }
        List<CustomModuleSubjectListModel> listMediaBrowserCompatSearchResultReceiver = workAccountClient.MediaBrowserCompatSearchResultReceiver();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listMediaBrowserCompatSearchResultReceiver) {
            if (((CustomModuleSubjectListModel) obj).getWrite()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((CustomModuleSubjectListModel) it3.next()).getRead());
        }
        Collection<List<String>> collectionValues = workAccountClient.MediaBrowserCompatCustomActionResultReceiver().values();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionValues, "");
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) collectionValues);
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> map2 = map;
        map2.put(FilterParams.KEY_MODE, Integer.valueOf(workAccountClient.getAudioAttributesImplApi26Parcelizer()));
        map2.put(FilterParams.KEY_NUM_QUESTIONS, Integer.valueOf(workAccountClient.getMediaBrowserCompatItemReceiver()));
        map2.put(FilterParams.KEY_DIFFICULTY, workAccountClient.getRemoteActionCompatParcelizer());
        map2.put("category", workAccountClient.getMediaBrowserCompatSearchResultReceiver());
        ArrayList arrayListRemoteActionCompatParcelizer = arrayList2;
        if (arrayListRemoteActionCompatParcelizer.isEmpty()) {
            arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        map2.put(FilterParams.KEY_CATEGORY_TYPES, arrayListRemoteActionCompatParcelizer.toString());
        map2.put(FilterParams.KEY_INCLUDE_UNGTAGGED, Boolean.valueOf(workAccountClient.getAudioAttributesImplBaseParcelizer()));
        return map;
    }
}
