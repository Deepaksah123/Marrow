package kotlin;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.accessaddObserverForBackInvoker;

/* JADX INFO: loaded from: classes.dex */
public final class _init_lambda4 {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/_init_lambda4$AudioAttributesImplApi26Parcelizer;", "Lo/accessaddObserverForBackInvoker;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "Landroid/content/Context;", "p0", "p1", "IconCompatParcelizer", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "read", "(ILandroid/content/Intent;)Landroidx/activity/result/ActivityResult;", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends accessaddObserverForBackInvoker<Intent, ActivityResult> {
        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ ActivityResult AudioAttributesCompatParcelizer(int i, Intent intent) {
            return read(i, intent);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Intent write(Context context, Intent intent) {
            return IconCompatParcelizer(context, intent);
        }

        private static ActivityResult read(int p0, Intent p1) {
            return new ActivityResult(p0, p1);
        }

        private static Intent IconCompatParcelizer(Context p0, Intent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return p1;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u0000 \f2 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0012"}, d2 = {"Lo/_init_lambda4$RemoteActionCompatParcelizer;", "Lo/accessaddObserverForBackInvoker;", "", "", "", "", "<init>", "()V", "Landroid/content/Context;", "p0", "p1", "Landroid/content/Intent;", "write", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lo/accessaddObserverForBackInvoker$IconCompatParcelizer;", "IconCompatParcelizer", "(Landroid/content/Context;[Ljava/lang/String;)Lo/accessaddObserverForBackInvoker$IconCompatParcelizer;", "", "(ILandroid/content/Intent;)Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends accessaddObserverForBackInvoker<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Map<String, Boolean> AudioAttributesCompatParcelizer(int i, Intent intent) {
            return IconCompatParcelizer(i, intent);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ accessaddObserverForBackInvoker.IconCompatParcelizer<Map<String, Boolean>> read(Context context, String[] strArr) {
            return IconCompatParcelizer(context, strArr);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* bridge */ /* synthetic */ Intent write(Context context, String[] strArr) {
            return write2(context, strArr);
        }

        /* JADX INFO: renamed from: o._init_lambda4$RemoteActionCompatParcelizer$write, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/_init_lambda4$RemoteActionCompatParcelizer$write;", "", "<init>", "()V", "", "", "p0", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "([Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static Intent AudioAttributesCompatParcelizer(String[] p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", p0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentPutExtra, "");
                return intentPutExtra;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        private static Intent write2(Context p0, String[] p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return Companion.AudioAttributesCompatParcelizer(p1);
        }

        private static accessaddObserverForBackInvoker.IconCompatParcelizer<Map<String, Boolean>> IconCompatParcelizer(Context p0, String[] p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (p1.length == 0) {
                return new accessaddObserverForBackInvoker.IconCompatParcelizer<>(VideoTimelineResponseBody.read());
            }
            for (String str : p1) {
                if (_isNaN.checkSelfPermission(p0, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(p1.length), 16));
            for (String str2 : p1) {
                Pair pairWrite = setAction.write(str2, Boolean.TRUE);
                linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
            }
            return new accessaddObserverForBackInvoker.IconCompatParcelizer<>(linkedHashMap);
        }

        private static Map<String, Boolean> IconCompatParcelizer(int p0, Intent p1) {
            if (p0 != -1) {
                return VideoTimelineResponseBody.read();
            }
            if (p1 == null) {
                return VideoTimelineResponseBody.read();
            }
            String[] stringArrayExtra = p1.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = p1.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return VideoTimelineResponseBody.read();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i == 0));
            }
            return VideoTimelineResponseBody.read(IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(getOrderDetails.AudioAttributesImplBaseParcelizer(stringArrayExtra), arrayList));
        }
    }

    public static final class write extends accessaddObserverForBackInvoker<String, Boolean> {
        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Boolean AudioAttributesCompatParcelizer(int i, Intent intent) {
            return RemoteActionCompatParcelizer(i, intent);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ accessaddObserverForBackInvoker.IconCompatParcelizer<Boolean> read(Context context, String str) {
            return write2(context, str);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Intent write(Context context, String str) {
            return RemoteActionCompatParcelizer(context, str);
        }

        private static Intent RemoteActionCompatParcelizer(Context context, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            RemoteActionCompatParcelizer.Companion companion = RemoteActionCompatParcelizer.INSTANCE;
            return RemoteActionCompatParcelizer.Companion.AudioAttributesCompatParcelizer(new String[]{str});
        }

        private static Boolean RemoteActionCompatParcelizer(int i, Intent intent) {
            if (intent == null || i != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            return Boolean.valueOf(z);
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        private static accessaddObserverForBackInvoker.IconCompatParcelizer<Boolean> write2(Context context, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            if (_isNaN.checkSelfPermission(context, str) == 0) {
                return new accessaddObserverForBackInvoker.IconCompatParcelizer<>(Boolean.TRUE);
            }
            return null;
        }
    }

    public static class AudioAttributesImplApi21Parcelizer extends accessaddObserverForBackInvoker<Uri, Boolean> {
        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Boolean AudioAttributesCompatParcelizer(int i, Intent intent) {
            return write(i);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ accessaddObserverForBackInvoker.IconCompatParcelizer<Boolean> read(Context context, Uri uri) {
            return IconCompatParcelizer(context, uri);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Intent write(Context context, Uri uri) {
            return read2(context, uri);
        }

        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        private static Intent read2(Context context, Uri uri) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(uri, "");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentPutExtra, "");
            return intentPutExtra;
        }

        private static Boolean write(int i) {
            return Boolean.valueOf(i == -1);
        }

        private static accessaddObserverForBackInvoker.IconCompatParcelizer<Boolean> IconCompatParcelizer(Context context, Uri uri) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(uri, "");
            return null;
        }
    }

    public static class read extends accessaddObserverForBackInvoker<String, Uri> {
        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Uri AudioAttributesCompatParcelizer(int i, Intent intent) {
            return IconCompatParcelizer(i, intent);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ accessaddObserverForBackInvoker.IconCompatParcelizer<Uri> read(Context context, String str) {
            return RemoteActionCompatParcelizer(context, str);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* bridge */ /* synthetic */ Intent write(Context context, String str) {
            return write2(context, str);
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        private static Intent write2(Context context, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(type, "");
            return type;
        }

        private static Uri IconCompatParcelizer(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        private static accessaddObserverForBackInvoker.IconCompatParcelizer<Uri> RemoteActionCompatParcelizer(Context context, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            return null;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/_init_lambda4$AudioAttributesCompatParcelizer;", "Lo/accessaddObserverForBackInvoker;", "", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "p0", "p1", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Lo/accessaddObserverForBackInvoker$IconCompatParcelizer;", "write", "(Landroid/content/Context;Ljava/lang/String;)Lo/accessaddObserverForBackInvoker$IconCompatParcelizer;", "", "IconCompatParcelizer", "(ILandroid/content/Intent;)Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class AudioAttributesCompatParcelizer extends accessaddObserverForBackInvoker<String, List<Uri>> {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ List<Uri> AudioAttributesCompatParcelizer(int i, Intent intent) {
            return IconCompatParcelizer(i, intent);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ accessaddObserverForBackInvoker.IconCompatParcelizer<List<Uri>> read(Context context, String str) {
            return write2(context, str);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Intent write(Context context, String str) {
            return AudioAttributesCompatParcelizer(context, str);
        }

        private static Intent AudioAttributesCompatParcelizer(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(p1).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentPutExtra, "");
            return intentPutExtra;
        }

        private static List<Uri> IconCompatParcelizer(int p0, Intent p1) {
            List<Uri> listIconCompatParcelizer;
            if (p0 != -1) {
                p1 = null;
            }
            return (p1 == null || (listIconCompatParcelizer = Companion.IconCompatParcelizer(p1)) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listIconCompatParcelizer;
        }

        /* JADX INFO: renamed from: o._init_lambda4$AudioAttributesCompatParcelizer$IconCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/_init_lambda4$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "", "Landroid/net/Uri;", "IconCompatParcelizer", "(Landroid/content/Intent;)Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static List<Uri> IconCompatParcelizer(Intent intent) {
                toMagicModuleMetaRepoModel.write(intent, "");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        private static accessaddObserverForBackInvoker.IconCompatParcelizer<List<Uri>> write2(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 \n2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0006\n\u0012\r\u0010\u0013\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/_init_lambda4$IconCompatParcelizer;", "Lo/accessaddObserverForBackInvoker;", "Lo/accessgetReportFullyDrawnExecutorp;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "p0", "p1", "Landroid/content/Intent;", "read", "(Landroid/content/Context;Lo/accessgetReportFullyDrawnExecutorp;)Landroid/content/Intent;", "Lo/accessaddObserverForBackInvoker$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/accessgetReportFullyDrawnExecutorp;)Lo/accessaddObserverForBackInvoker$IconCompatParcelizer;", "", "write", "(ILandroid/content/Intent;)Landroid/net/Uri;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class IconCompatParcelizer extends accessaddObserverForBackInvoker<accessgetReportFullyDrawnExecutorp, Uri> {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public interface MediaBrowserCompatItemReceiver {
        }

        /* JADX INFO: renamed from: o._init_lambda4$IconCompatParcelizer$read, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\t\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\t\u0010\u0012"}, d2 = {"Lo/_init_lambda4$IconCompatParcelizer$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/pm/ResolveInfo;", "IconCompatParcelizer", "(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;", "read", "Lo/_init_lambda4$IconCompatParcelizer$MediaBrowserCompatItemReceiver;", "", "RemoteActionCompatParcelizer", "(Lo/_init_lambda4$IconCompatParcelizer$MediaBrowserCompatItemReceiver;)Ljava/lang/String;", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Z", "write", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @getMagicModuleMeta
            public final boolean write(Context p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                return read() || RemoteActionCompatParcelizer(p0) || AudioAttributesCompatParcelizer(p0);
            }

            @getMagicModuleMeta
            public static boolean read() {
                if (Build.VERSION.SDK_INT >= 33) {
                    return true;
                }
                return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            @getMagicModuleMeta
            public static boolean RemoteActionCompatParcelizer(Context p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                return read(p0) != null;
            }

            @getMagicModuleMeta
            public static ResolveInfo read(Context p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                return p0.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            }

            @getMagicModuleMeta
            public static boolean AudioAttributesCompatParcelizer(Context p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                return IconCompatParcelizer(p0) != null;
            }

            @getMagicModuleMeta
            public static ResolveInfo IconCompatParcelizer(Context p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                return p0.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
            }

            public static String RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                if (p0 instanceof AudioAttributesCompatParcelizer) {
                    return "image/*";
                }
                if (p0 instanceof C0058IconCompatParcelizer) {
                    return "video/*";
                }
                if (p0 instanceof write) {
                    return ((write) p0).RemoteActionCompatParcelizer();
                }
                if (p0 instanceof RemoteActionCompatParcelizer) {
                    return null;
                }
                throw new RenewEligibleCreator();
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Uri AudioAttributesCompatParcelizer(int i, Intent intent) {
            return write(i, intent);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ accessaddObserverForBackInvoker.IconCompatParcelizer<Uri> read(Context context, accessgetReportFullyDrawnExecutorp accessgetreportfullydrawnexecutorp) {
            return AudioAttributesCompatParcelizer(context, accessgetreportfullydrawnexecutorp);
        }

        @Override // kotlin.accessaddObserverForBackInvoker
        public final /* synthetic */ Intent write(Context context, accessgetReportFullyDrawnExecutorp accessgetreportfullydrawnexecutorp) {
            return read2(context, accessgetreportfullydrawnexecutorp);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_init_lambda4$IconCompatParcelizer$AudioAttributesCompatParcelizer;", "Lo/_init_lambda4$IconCompatParcelizer$MediaBrowserCompatItemReceiver;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AudioAttributesCompatParcelizer implements MediaBrowserCompatItemReceiver {
            public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

            private AudioAttributesCompatParcelizer() {
            }
        }

        /* JADX INFO: renamed from: o._init_lambda4$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_init_lambda4$IconCompatParcelizer$IconCompatParcelizer;", "Lo/_init_lambda4$IconCompatParcelizer$MediaBrowserCompatItemReceiver;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0058IconCompatParcelizer implements MediaBrowserCompatItemReceiver {
            public static final C0058IconCompatParcelizer INSTANCE = new C0058IconCompatParcelizer();

            private C0058IconCompatParcelizer() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_init_lambda4$IconCompatParcelizer$RemoteActionCompatParcelizer;", "Lo/_init_lambda4$IconCompatParcelizer$MediaBrowserCompatItemReceiver;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RemoteActionCompatParcelizer implements MediaBrowserCompatItemReceiver {
            public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

            private RemoteActionCompatParcelizer() {
            }
        }

        public static final class write implements MediaBrowserCompatItemReceiver {
            private final String write;

            public final String RemoteActionCompatParcelizer() {
                return this.write;
            }
        }

        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        private static Intent read2(Context p0, accessgetReportFullyDrawnExecutorp p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (Companion.read()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(Companion.RemoteActionCompatParcelizer(p1.AudioAttributesCompatParcelizer()));
                return intent;
            }
            if (Companion.RemoteActionCompatParcelizer(p0)) {
                ResolveInfo resolveInfo = Companion.read(p0);
                if (resolveInfo == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent2.setClassName(((PackageItemInfo) ((ComponentInfo) activityInfo).applicationInfo).packageName, ((PackageItemInfo) activityInfo).name);
                intent2.setType(Companion.RemoteActionCompatParcelizer(p1.AudioAttributesCompatParcelizer()));
                return intent2;
            }
            if (Companion.AudioAttributesCompatParcelizer(p0)) {
                ResolveInfo resolveInfoIconCompatParcelizer = Companion.IconCompatParcelizer(p0);
                if (resolveInfoIconCompatParcelizer == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = resolveInfoIconCompatParcelizer.activityInfo;
                Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent3.setClassName(((PackageItemInfo) ((ComponentInfo) activityInfo2).applicationInfo).packageName, ((PackageItemInfo) activityInfo2).name);
                intent3.setType(Companion.RemoteActionCompatParcelizer(p1.AudioAttributesCompatParcelizer()));
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(Companion.RemoteActionCompatParcelizer(p1.AudioAttributesCompatParcelizer()));
            if (intent4.getType() == null) {
                intent4.setType("*/*");
                intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent4;
        }

        private static Uri write(int p0, Intent p1) {
            if (p0 != -1) {
                p1 = null;
            }
            if (p1 == null) {
                return null;
            }
            Uri data = p1.getData();
            if (data != null) {
                return data;
            }
            AudioAttributesCompatParcelizer.Companion companion = AudioAttributesCompatParcelizer.INSTANCE;
            return (Uri) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) AudioAttributesCompatParcelizer.Companion.IconCompatParcelizer(p1));
        }

        private static accessaddObserverForBackInvoker.IconCompatParcelizer<Uri> AudioAttributesCompatParcelizer(Context p0, accessgetReportFullyDrawnExecutorp p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return null;
        }
    }
}
