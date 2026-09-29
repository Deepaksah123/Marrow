package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class floatElement {
    private static final JpegExtractor RemoteActionCompatParcelizer = new JpegExtractor("AppUpdateService");
    private static final Intent write = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    startReadingMotionPhoto AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private final endMasterElement MediaBrowserCompatItemReceiver;
    private final String read;

    floatElement(Context context, endMasterElement endmasterelement) {
        this.read = context.getPackageName();
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompatItemReceiver = endmasterelement;
        if (ScriptTagPayloadReader.AudioAttributesCompatParcelizer(context)) {
            this.AudioAttributesCompatParcelizer = new startReadingMotionPhoto(MotionPhotoDescriptionContainerItem.IconCompatParcelizer(context), RemoteActionCompatParcelizer, write, DefaultEbmlReaderMasterElement.IconCompatParcelizer);
        }
    }

    private static Task IconCompatParcelizer() {
        RemoteActionCompatParcelizer.write("onError(%d)", -9);
        return Tasks.forException(new MatroskaExtractor(-9));
    }

    static /* synthetic */ FlvExtractorExternalSyntheticLambda0 IconCompatParcelizer(floatElement floatelement, Bundle bundle, String str) {
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i4 = bundle.getInt("in.app.update.priority", 0);
        long j = bundle.getLong("bytes.downloaded");
        long j2 = bundle.getLong("total.bytes.to.download");
        long j3 = bundle.getLong("additional.size.required");
        long jWrite = floatelement.MediaBrowserCompatItemReceiver.write();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", RemoteActionCompatParcelizer(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        map.put("nonblocking.destructive.intent", RemoteActionCompatParcelizer(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        map.put("blocking.intent", RemoteActionCompatParcelizer(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        map.put("nonblocking.intent", RemoteActionCompatParcelizer(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return FlvExtractorExternalSyntheticLambda0.write(str, i, i2, i3, numValueOf, i4, j, j2, j3, jWrite, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    static /* synthetic */ Bundle RemoteActionCompatParcelizer(floatElement floatelement, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(read());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(floatelement.IconCompatParcelizer.getPackageManager().getPackageInfo(floatelement.IconCompatParcelizer.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            RemoteActionCompatParcelizer.write("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    private static HashSet RemoteActionCompatParcelizer(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle read() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapWrite = getKeyFrameTagPositions.write();
        bundle2.putInt("playcore_version_code", ((Integer) mapWrite.get("java")).intValue());
        if (mapWrite.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapWrite.get("native")).intValue());
        }
        if (mapWrite.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapWrite.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    public final Task RemoteActionCompatParcelizer(String str) {
        if (this.AudioAttributesCompatParcelizer == null) {
            return IconCompatParcelizer();
        }
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("requestUpdateInfo(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.AudioAttributesCompatParcelizer.write(new EbmlProcessor(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task read(String str) {
        if (this.AudioAttributesCompatParcelizer == null) {
            return IconCompatParcelizer();
        }
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("completeUpdate(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.AudioAttributesCompatParcelizer.write(new readInteger(this, taskCompletionSource, taskCompletionSource, str), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
