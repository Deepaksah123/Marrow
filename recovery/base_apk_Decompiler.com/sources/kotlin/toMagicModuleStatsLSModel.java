package kotlin;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.getModuleId;

/* JADX INFO: loaded from: classes4.dex */
public class toMagicModuleStatsLSModel {
    private static <T extends Throwable> T read(T t) {
        return (T) toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Throwable) t, toMagicModuleStatsLSModel.class.getName());
    }

    private static void AudioAttributesCompatParcelizer(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        read(sb.toString());
    }

    private static void read(String str) {
        throw write(new ClassCastException(str));
    }

    private static ClassCastException write(ClassCastException classCastException) {
        throw ((ClassCastException) read(classCastException));
    }

    public static Iterable AudioAttributesCompatParcelizer(Object obj) {
        if ((obj instanceof getCurrentAnsweredMcqProgress) && !(obj instanceof getPausedOnMs)) {
            AudioAttributesCompatParcelizer(obj, "kotlin.collections.MutableIterable");
        }
        return AudioAttributesImplApi21Parcelizer(obj);
    }

    private static Iterable AudioAttributesImplApi21Parcelizer(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw write(e);
        }
    }

    public static Collection IconCompatParcelizer(Object obj) {
        if ((obj instanceof getCurrentAnsweredMcqProgress) && !(obj instanceof getCreatedOnMs)) {
            AudioAttributesCompatParcelizer(obj, "kotlin.collections.MutableCollection");
        }
        return MediaBrowserCompatItemReceiver(obj);
    }

    private static Collection MediaBrowserCompatItemReceiver(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw write(e);
        }
    }

    public static boolean AudioAttributesImplApi26Parcelizer(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof getCurrentAnsweredMcqProgress) || (obj instanceof getModulesCompleted);
        }
        return false;
    }

    public static List RemoteActionCompatParcelizer(Object obj) {
        if ((obj instanceof getCurrentAnsweredMcqProgress) && !(obj instanceof getModulesCompleted)) {
            AudioAttributesCompatParcelizer(obj, "kotlin.collections.MutableList");
        }
        return RatingCompat(obj);
    }

    private static List RatingCompat(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw write(e);
        }
    }

    public static boolean AudioAttributesImplBaseParcelizer(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof getCurrentAnsweredMcqProgress) || (obj instanceof FinalDataRsModel);
        }
        return false;
    }

    public static Set MediaBrowserCompatCustomActionResultReceiver(Object obj) {
        if ((obj instanceof getCurrentAnsweredMcqProgress) && !(obj instanceof FinalDataRsModel)) {
            AudioAttributesCompatParcelizer(obj, "kotlin.collections.MutableSet");
        }
        return MediaBrowserCompatMediaItem(obj);
    }

    private static Set MediaBrowserCompatMediaItem(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw write(e);
        }
    }

    public static Map write(Object obj) {
        if ((obj instanceof getCurrentAnsweredMcqProgress) && !(obj instanceof getModuleId)) {
            AudioAttributesCompatParcelizer(obj, "kotlin.collections.MutableMap");
        }
        return MediaDescriptionCompat(obj);
    }

    private static Map MediaDescriptionCompat(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw write(e);
        }
    }

    public static Map.Entry read(Object obj) {
        if ((obj instanceof getCurrentAnsweredMcqProgress) && !(obj instanceof getModuleId.read)) {
            AudioAttributesCompatParcelizer(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return MediaMetadataCompat(obj);
    }

    private static Map.Entry MediaMetadataCompat(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw write(e);
        }
    }

    private static int MediaBrowserCompatSearchResultReceiver(Object obj) {
        if (obj instanceof MagicModuleMetaRepoModel) {
            return ((MagicModuleMetaRepoModel) obj).getArity();
        }
        if (obj instanceof getCreatedOnDateMs) {
            return 0;
        }
        if (obj instanceof getAnswerMap) {
            return 1;
        }
        if (obj instanceof MagicModuleSubmissionRequestBody) {
            return 2;
        }
        if (obj instanceof getModuleData) {
            return 3;
        }
        if (obj instanceof getMagicModuleStat) {
            return 4;
        }
        if (obj instanceof MagicModuleRepository) {
            return 5;
        }
        if (obj instanceof markComplete) {
            return 6;
        }
        if (obj instanceof isDetailDownloaded) {
            return 7;
        }
        if (obj instanceof saveMagicModuleModule) {
            return 8;
        }
        if (obj instanceof MagicModuleRepositoryImpl) {
            return 9;
        }
        if (obj instanceof MagicModuleModel) {
            return 10;
        }
        if (obj instanceof getComment) {
            return 11;
        }
        if (obj instanceof getError_code) {
            return 12;
        }
        if (obj instanceof getMcqResponseList) {
            return 13;
        }
        if (obj instanceof toMagicModuleMetaLSModel) {
            return 14;
        }
        if (obj instanceof MagicModuleRSModelsKt) {
            return 15;
        }
        if (obj instanceof getMagicModuleRsStat) {
            return 16;
        }
        if (obj instanceof getCorrected) {
            return 17;
        }
        if (obj instanceof getNeedRevision) {
            return 18;
        }
        if (obj instanceof MagicModuleStatsRSModel) {
            return 19;
        }
        if (obj instanceof getModuleCompleted) {
            return 20;
        }
        if (obj instanceof MagicModuleTimelineRSModel) {
            return 21;
        }
        return obj instanceof MagicModuleSubmissionResponseBody ? 22 : -1;
    }

    public static boolean write(Object obj, int i) {
        return (obj instanceof setRenewGrpId) && MediaBrowserCompatSearchResultReceiver(obj) == i;
    }

    public static Object RemoteActionCompatParcelizer(Object obj, int i) {
        if (obj != null && !write(obj, i)) {
            AudioAttributesCompatParcelizer(obj, "kotlin.jvm.functions.Function".concat(String.valueOf(i)));
        }
        return obj;
    }
}
