package kotlin;

import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AvcConfig {

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[getAttributeValueIgnorePrefix.values().length];
            try {
                iArr[getAttributeValueIgnorePrefix.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.AudioAttributesImplBaseParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.MediaBrowserCompatItemReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.RemoteActionCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.AudioAttributesCompatParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.write.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[getAttributeValueIgnorePrefix.IconCompatParcelizer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            RemoteActionCompatParcelizer = iArr;
            int[] iArr2 = new int[CourseConfigV2.SearchItem.values().length];
            try {
                iArr2[CourseConfigV2.SearchItem.QBANK.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CourseConfigV2.SearchItem.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CourseConfigV2.SearchItem.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CourseConfigV2.SearchItem.PEARL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CourseConfigV2.SearchItem.MCQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            IconCompatParcelizer = iArr2;
        }
    }

    public static final String read(getAttributeValueIgnorePrefix getattributevalueignoreprefix) {
        toMagicModuleMetaRepoModel.write(getattributevalueignoreprefix, "");
        switch (RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[getattributevalueignoreprefix.ordinal()]) {
            case 1:
                return "all";
            case 2:
                return "qbank";
            case 3:
                return "video";
            case 4:
                return "test";
            case 5:
                return CourseConfigKeyConstantsKt.KEY_PEARLS;
            case 6:
            case 7:
            case 8:
                return "";
            default:
                throw new RenewEligibleCreator();
        }
    }

    public static final getAttributeValueIgnorePrefix AudioAttributesCompatParcelizer(CourseConfigV2.SearchItem searchItem) {
        toMagicModuleMetaRepoModel.write(searchItem, "");
        int i = RemoteActionCompatParcelizer.IconCompatParcelizer[searchItem.ordinal()];
        if (i == 1) {
            return getAttributeValueIgnorePrefix.AudioAttributesImplBaseParcelizer;
        }
        if (i == 2) {
            return getAttributeValueIgnorePrefix.MediaBrowserCompatCustomActionResultReceiver;
        }
        if (i == 3) {
            return getAttributeValueIgnorePrefix.MediaBrowserCompatItemReceiver;
        }
        if (i == 4) {
            return getAttributeValueIgnorePrefix.RemoteActionCompatParcelizer;
        }
        if (i != 5) {
            throw new RenewEligibleCreator();
        }
        return getAttributeValueIgnorePrefix.IconCompatParcelizer;
    }

    public static final List<getAttributeValueIgnorePrefix> read(List<? extends getAttributeValueIgnorePrefix> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(getAttributeValueIgnorePrefix.read);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((getAttributeValueIgnorePrefix) obj) != getAttributeValueIgnorePrefix.IconCompatParcelizer) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static final String write(getAttributeValueIgnorePrefix getattributevalueignoreprefix) {
        toMagicModuleMetaRepoModel.write(getattributevalueignoreprefix, "");
        int i = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[getattributevalueignoreprefix.ordinal()];
        if (i == 1) {
            return FilterItemRecord.filter_all_title;
        }
        if (i == 2) {
            return "QBank";
        }
        if (i == 3) {
            return "Videos";
        }
        if (i != 4) {
            return i != 5 ? "" : "Pearls";
        }
        return "Tests";
    }
}
