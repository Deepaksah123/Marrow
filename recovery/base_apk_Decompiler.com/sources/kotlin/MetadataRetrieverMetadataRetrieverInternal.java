package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import com.google.android.exoplayer2.C;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u000e\u0010\u0015J/\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/MetadataRetrieverMetadataRetrieverInternal;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "Landroid/content/Intent;", "p3", "p4", "Landroid/app/PendingIntent;", "IconCompatParcelizer", "(Landroid/content/Context;ILandroid/os/Bundle;Landroid/content/Intent;I)Landroid/app/PendingIntent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;)Landroid/app/PendingIntent;", "", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;", "p5", "(Landroid/content/Context;ILandroid/os/Bundle;ZILo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;)Landroid/app/PendingIntent;", "", "read", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;I)Landroid/app/PendingIntent;", "(I)I", "RemoteActionCompatParcelizer", "Landroid/content/Intent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetadataRetrieverMetadataRetrieverInternal {
    private static final byte[] $$a = {112, -82, -21, -22, 11, -3, -64, TarConstants.LF_BLK, 8, -8, 16, -18, 12, 1, -20, 14, -67, TarConstants.LF_SYMLINK, 12, -11, 13, -4, -7, -6, -55, 68, -16, 6, -62, 65, 4, -3, -12, 5, 0, 4, -12, -4, 2, -7, -3, 18, -12, 5, -2, -65, 20, 16, -7, 32, 4, -12, -4, 2, -7, -3, 18, -12, 5, -2, -38, 36, 5, -16, 8, 5, -34, 17, 12, 3, -14, -7, 1};
    private static final int $$b = 83;
    public static final MetadataRetrieverMetadataRetrieverInternal INSTANCE = new MetadataRetrieverMetadataRetrieverInternal();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static Intent IconCompatParcelizer;

    @getMagicModuleMeta
    private static final int AudioAttributesCompatParcelizer(int p0) {
        switch (p0) {
            case 8:
                return 1;
            case 9:
                return 2;
            case 10:
                return 3;
            case 11:
                return 4;
            default:
                return 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.MetadataRetrieverMetadataRetrieverInternal.$$a
            int r8 = r8 * 4
            int r8 = 99 - r8
            int r6 = r6 * 4
            int r1 = 70 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            int r6 = 69 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r7
            int r7 = r3 + 1
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MetadataRetrieverMetadataRetrieverInternal.a(int, short, int, java.lang.Object[]):void");
    }

    private MetadataRetrieverMetadataRetrieverInternal() {
    }

    @getMagicModuleMeta
    private static PendingIntent IconCompatParcelizer(Context p0, int p1, Bundle p2, Intent p3, int p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Object obj = p2.get("wzrk_dl");
        p2.putInt("notificationId", p1);
        if (obj != null) {
            p2.putBoolean("default_dl", true);
        }
        if (p3 == null) {
            PendingIntent pendingIntentWrite = getAdGroupIndexForPositionUs.write(p2, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pendingIntentWrite, "");
            return pendingIntentWrite;
        }
        p3.putExtras(p2);
        p3.removeExtra("wzrk_acts");
        p3.putExtra("wzrk_from", "CTPushNotificationReceiver");
        p3.setFlags(872415232);
        PendingIntent broadcast = PendingIntent.getBroadcast(p0, p4, p3, (p3.hasExtra("pt_input_feedback") ? 33554432 : 67108864) | C.BUFFER_FLAG_FIRST_SAMPLE);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(broadcast, "");
        return broadcast;
    }

    @getMagicModuleMeta
    public static final PendingIntent AudioAttributesCompatParcelizer(Context p0, Bundle p1, Intent p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        p2.putExtras(p1);
        p2.putExtra("pt_dismiss_intent", true);
        PendingIntent broadcast = PendingIntent.getBroadcast(p0, new Random().nextInt(), p2, 335544320);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(broadcast, "");
        return broadcast;
    }

    @getMagicModuleMeta
    public static final PendingIntent IconCompatParcelizer(Context p0, int p1, Bundle p2, boolean p3, int p4, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        IconCompatParcelizer = null;
        if (p3 && Build.VERSION.SDK_INT < 31) {
            IconCompatParcelizer = new Intent(p0, (Class<?>) onLoadCompleted.class);
        } else if (!p3) {
            IconCompatParcelizer = new Intent(p0, (Class<?>) onLoadError.class);
        }
        int iNextInt = new Random().nextInt();
        switch (p4) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                Intent intent = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent);
                intent.putExtra("right_swipe", true);
                Intent intent2 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent2);
                intent2.putExtra("notificationId", p1);
                Intent intent3 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent3);
                intent3.putExtras(p2);
                return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
            case 5:
                Intent intent4 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent4);
                intent4.putExtra("right_swipe", false);
                Intent intent5 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent5);
                intent5.putExtra("notificationId", p1);
                Intent intent6 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent6);
                intent6.putExtras(p2);
                return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
            case 6:
                return AudioAttributesCompatParcelizer(p0, p2, new Intent(p0, (Class<?>) onLoadError.class));
            case 7:
                p2.putString("wzrk_dl", p5 != null ? p5.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : null);
                if (Build.VERSION.SDK_INT < 31) {
                    return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
                }
                return getAdGroupIndexForPositionUs.write(p2, p0);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p4);
                Intent intent7 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent7);
                intent7.putExtras(p2);
                Intent intent8 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent8);
                intent8.putExtra("click".concat(String.valueOf(iAudioAttributesCompatParcelizer)), true);
                Intent intent9 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent9);
                intent9.putExtra("clickedStar", iAudioAttributesCompatParcelizer);
                Intent intent10 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent10);
                intent10.putExtra("notificationId", p1);
                Intent intent11 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent11);
                intent11.putExtra(PaymentConstants.Category.CONFIG, p5 != null ? p5.getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() : null);
                int[] intArray = p2.getIntArray("requestCodes");
                Integer numValueOf = intArray != null ? Integer.valueOf(intArray[iAudioAttributesCompatParcelizer - 1]) : null;
                toMagicModuleMetaRepoModel.write(numValueOf);
                int iIntValue = numValueOf.intValue();
                Intent intent12 = IconCompatParcelizer;
                toMagicModuleMetaRepoModel.write(intent12);
                return PendingIntent.getBroadcast(p0, iIntValue, intent12, 67108864);
            case 13:
                p2.putString("wzrk_dl", null);
                return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
            default:
                switch (p4) {
                    case 20:
                    case 29:
                    case 30:
                    case 31:
                        break;
                    case 21:
                        Intent intent13 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent13);
                        intent13.putExtras(p2);
                        Intent intent14 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent14);
                        intent14.putExtra("pt_current_position", 0);
                        Intent intent15 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent15);
                        intent15.putExtra("notificationId", p1);
                        Intent intent16 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent16);
                        ArrayList<String> arrayListMediaBrowserCompatItemReceiver = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver);
                        intent16.putExtra("pt_buy_now_dl", arrayListMediaBrowserCompatItemReceiver.get(0));
                        Intent intent17 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent17);
                        return PendingIntent.getBroadcast(p0, iNextInt, intent17, 67108864);
                    case 22:
                        Intent intent18 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent18);
                        intent18.putExtras(p2);
                        Intent intent19 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent19);
                        intent19.putExtra("pt_current_position", 1);
                        Intent intent20 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent20);
                        intent20.putExtra("notificationId", p1);
                        Intent intent21 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent21);
                        ArrayList<String> arrayListMediaBrowserCompatItemReceiver2 = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver2);
                        intent21.putExtra("pt_buy_now_dl", arrayListMediaBrowserCompatItemReceiver2.get(1));
                        Intent intent22 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent22);
                        return PendingIntent.getBroadcast(p0, iNextInt, intent22, 67108864);
                    case 23:
                        Intent intent23 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent23);
                        intent23.putExtras(p2);
                        Intent intent24 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent24);
                        intent24.putExtra("pt_current_position", 2);
                        Intent intent25 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent25);
                        intent25.putExtra("notificationId", p1);
                        Intent intent26 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent26);
                        ArrayList<String> arrayListMediaBrowserCompatItemReceiver3 = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver3);
                        intent26.putExtra("pt_buy_now_dl", arrayListMediaBrowserCompatItemReceiver3.get(2));
                        Intent intent27 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent27);
                        return PendingIntent.getBroadcast(p0, iNextInt, intent27, 67108864);
                    case 24:
                        ArrayList<String> arrayListMediaBrowserCompatItemReceiver4 = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver4);
                        p2.putString("wzrk_dl", arrayListMediaBrowserCompatItemReceiver4.get(0));
                        return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
                    case 25:
                        ArrayList<String> arrayListMediaBrowserCompatItemReceiver5 = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver5);
                        p2.putString("wzrk_dl", arrayListMediaBrowserCompatItemReceiver5.get(1));
                        return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
                    case 26:
                        ArrayList<String> arrayListMediaBrowserCompatItemReceiver6 = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver6);
                        p2.putString("wzrk_dl", arrayListMediaBrowserCompatItemReceiver6.get(2));
                        return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
                    case 27:
                        Intent intent28 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent28);
                        intent28.putExtra("img1", true);
                        Intent intent29 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent29);
                        intent29.putExtra("notificationId", p1);
                        Intent intent30 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent30);
                        ArrayList<String> arrayListMediaBrowserCompatItemReceiver7 = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver7);
                        intent30.putExtra("pt_buy_now_dl", arrayListMediaBrowserCompatItemReceiver7.get(0));
                        Intent intent31 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent31);
                        intent31.putExtra("buynow", true);
                        Intent intent32 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent32);
                        intent32.putExtra(PaymentConstants.Category.CONFIG, p5 != null ? p5.getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() : null);
                        Intent intent33 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent33);
                        intent33.putExtras(p2);
                        Intent intent34 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent34);
                        return PendingIntent.getBroadcast(p0, iNextInt, intent34, 67108864);
                    case 28:
                        return AudioAttributesCompatParcelizer(p0, p2, new Intent(p0, (Class<?>) onLoadError.class));
                    case 32:
                        ArrayList<String> arrayListMediaBrowserCompatItemReceiver8 = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                        toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver8);
                        if (arrayListMediaBrowserCompatItemReceiver8.size() > 0) {
                            ArrayList<String> arrayListMediaBrowserCompatItemReceiver9 = p5 != null ? p5.MediaBrowserCompatItemReceiver() : null;
                            toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver9);
                            p2.putString("wzrk_dl", arrayListMediaBrowserCompatItemReceiver9.get(0));
                        }
                        Intent intent35 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent35);
                        intent35.putExtra("pt_input_feedback", p5 != null ? p5.getOnPrepare() : null);
                        Intent intent36 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent36);
                        intent36.putExtra("pt_input_auto_open", p5 != null ? p5.getOnPrepareFromSearch() : null);
                        Intent intent37 = IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(intent37);
                        intent37.putExtra(PaymentConstants.Category.CONFIG, p5 != null ? p5.getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() : null);
                        if (p5.MediaBrowserCompatItemReceiver() == null) {
                            p2.putString("wzrk_dl", null);
                        }
                        return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
                    default:
                        throw new IllegalArgumentException("invalid pendingIntentType");
                }
                break;
        }
        if ((p5 != null ? p5.MediaBrowserCompatItemReceiver() : null) != null) {
            ArrayList<String> arrayListMediaBrowserCompatItemReceiver10 = p5.MediaBrowserCompatItemReceiver();
            toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver10);
            if (arrayListMediaBrowserCompatItemReceiver10.size() > 0) {
                ArrayList<String> arrayListMediaBrowserCompatItemReceiver11 = p5.MediaBrowserCompatItemReceiver();
                toMagicModuleMetaRepoModel.write(arrayListMediaBrowserCompatItemReceiver11);
                p2.putString("wzrk_dl", arrayListMediaBrowserCompatItemReceiver11.get(0));
                return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
            }
        }
        if (p2.get("wzrk_dl") == null) {
            p2.putString("wzrk_dl", null);
        }
        return IconCompatParcelizer(p0, p1, p2, IconCompatParcelizer, iNextInt);
    }

    @getMagicModuleMeta
    public static final PendingIntent read(Context p0, Bundle p1, String p2, int p3) {
        Class<?> cls;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        try {
            byte b = $$a[34];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            cls = Class.forName((String) objArr[0]);
        } catch (ClassNotFoundException unused) {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
            cls = null;
        }
        boolean zIconCompatParcelizer = RendererCapabilitiesListener.IconCompatParcelizer(p0, cls);
        if (Build.VERSION.SDK_INT < 31 && zIconCompatParcelizer) {
            p1.putBoolean("autoCancel", true);
            p1.putInt("notificationId", p3);
            Intent intent = new Intent(CTNotificationIntentService.MAIN_ACTION);
            IconCompatParcelizer = intent;
            toMagicModuleMetaRepoModel.write(intent);
            intent.putExtras(p1);
            Intent intent2 = IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(intent2);
            intent2.putExtra("dl", p2);
            Intent intent3 = IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(intent3);
            intent3.setPackage(p0.getPackageName());
            Intent intent4 = IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(intent4);
            intent4.putExtra("ct_type", CTNotificationIntentService.TYPE_BUTTON_CLICK);
            int iNextInt = new Random().nextInt();
            Intent intent5 = IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(intent5);
            PendingIntent service = PendingIntent.getService(p0, iNextInt, intent5, 201326592);
            toMagicModuleMetaRepoModel.write(service);
            return service;
        }
        p1.putString("wzrk_dl", p2);
        PendingIntent pendingIntentWrite = getAdGroupIndexForPositionUs.write(p1, p0);
        toMagicModuleMetaRepoModel.write(pendingIntentWrite);
        return pendingIntentWrite;
    }
}
