package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.Subscription;
import in.juspay.hyper.constants.LogCategory;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getFidoAppIdExtension;
import kotlin.selectModule;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getCredentialList;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getCredentialList extends DynamiteModuleDynamiteLoaderClassLoader {
    private static char AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char MediaBrowserCompatCustomActionResultReceiver;
    private static char RemoteActionCompatParcelizer;
    private static char read;
    private static int write;
    private static final byte[] $$l = {87, 74, -120, 12};
    private static final int $$m = 233;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {62, -25, -124, -119, -67, 74, -2, -24, 10, -7, -11, 9, -17, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -34, 18, 11, -10, -13, 10, -15, 6, 1, -25, 27, -8, -74, 44, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$k = 70;
    private static final byte[] $$d = {8, -19, -66, -33, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 57;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int MediaBrowserCompatItemReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r5, int r6, byte r7) {
        /*
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r1 = kotlin.getCredentialList.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L28:
            r3 = r1[r6]
        L2a:
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCredentialList.$$n(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 114 - r7
            int r6 = 190 - r6
            byte[] r0 = kotlin.getCredentialList.$$d
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = -1
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L24:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCredentialList.g(short, byte, byte, java.lang.Object[]):void");
    }

    private static void h(short s, int i, byte b, Object[] objArr) {
        byte[] bArr = $$j;
        int i2 = s + 4;
        int i3 = i + 82;
        byte[] bArr2 = new byte[46 - b];
        int i4 = 45 - b;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = i4 + i2 + 2;
            i2++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3;
            int i8 = i2 + 1;
            i5 = i6;
            i3 = i7 + bArr[i2] + 2;
            i2 = i8;
        }
    }

    /* JADX INFO: renamed from: o.getCredentialList$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JZ\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u0007J0\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u0007J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/marrow2/ui/plan/post_purchase/PaymentDoneActivity$Companion;", "", "<init>", "()V", "BUNDLE_KEY_PLAN", "", "BUNDLE_KEY_COUPON", "BUNDLE_KEY_PAYMENT_ID", "BUNDLE_KEY_IS_PLAN_B_UPGRADE", "BUNDLE_KEY_IN_APP_NOTES_PURCHASE", "BUNDLE_KEY_IS_ADD_ON_AVAILABLE", "KEY_PAYMENT_GATEWAY", "KEY_SUBSCRIPTIONS", "getLaunchIntent", "Landroid/content/Intent;", LogCategory.CONTEXT, "Landroid/content/Context;", "paymentId", "plan", "Lcom/marrow/data/models/plan/Plan;", "coupon", "Lcom/marrow/data/api/models/response/plan/Coupon;", "addOns", "", "paymentGateway", "", "subscriptionList", "Ljava/util/ArrayList;", "Lcom/marrow/data/models/plan/Subscription;", "Lkotlin/collections/ArrayList;", "getLaunchIntentPlanBUpgrade", "getLaunchIntentNotesPurchase", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent write(Context context, String str, Plan plan, Coupon coupon, List<String> list, int i, ArrayList<Subscription> arrayList) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            Intent intent = new Intent(context, (Class<?>) getCredentialList.class);
            if (plan != null) {
                intent.putExtra("plan", plan.toJSON().toString());
            }
            if (coupon != null) {
                intent.putExtra("coupon", coupon.toJSON().toString());
            }
            intent.putExtra("payment_id", str);
            if (!list.isEmpty()) {
                intent.putExtra("add_ons", list.get(0));
            }
            intent.putExtra("payment_gateway", i);
            intent.putExtra(PaymentStatusResponseKt.KEY_SUBSCRIPTION, arrayList);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context context, String str, ArrayList<Subscription> arrayList) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            Intent intent = new Intent(context, (Class<?>) getCredentialList.class);
            intent.putExtra("is_plan_b_upgrade", true);
            intent.putExtra("payment_id", str);
            intent.putExtra(PaymentStatusResponseKt.KEY_SUBSCRIPTION, arrayList);
            return intent;
        }

        public static Intent AudioAttributesCompatParcelizer(Context context) {
            toMagicModuleMetaRepoModel.write(context, "");
            Intent intent = new Intent(context, (Class<?>) getCredentialList.class);
            intent.putExtra("is_in_app_notes_purchase", true);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i4 = $11 + 101;
            $10 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[isstopped.read];
                cArr3[i3] = cArr[isstopped.read / i3];
            } else {
                cArr3[i3] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $11 + 15;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (((long) RemoteActionCompatParcelizer) ^ 1193402106669854891L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cGreen = (char) Color.green(i3);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1504;
                        int scrollBarFadeDuration = 21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b = (byte) i3;
                        byte b2 = b;
                        String str$$n = $$n(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(cGreen, packedPositionGroup, scrollBarFadeDuration, 1322448859, false, str$$n, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) read) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1503, (ViewConfiguration.getScrollBarSize() >> 8) + 21, 1322448859, false, $$n(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 9016 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getCapsMode("", 0, 0) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void e(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23703, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 44863), TextUtils.lastIndexOf("", '0') + 18945, 28 - (KeyEvent.getMaxKeyCode() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            int i6 = $11 + 95;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                int i8 = $10 + 87;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                try {
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44862), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18943, View.resolveSizeAndState(0, 0, 0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // kotlin.DynamiteModuleDynamiteLoaderClassLoader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        ArrayList arrayList;
        String str;
        selectModule selectmoduleAudioAttributesCompatParcelizer;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 106, new char[]{1, 11, 65534, 16, 16, 2, 0, '\f', 15, 65517, 65483, 16, '\f', 65483, 1, 6, '\f', 15}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 210, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 1, new char[]{65517, 17, 5, 65532, 1}, 215 - TextUtils.lastIndexOf("", '0', 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(26 - ExpandableListView.getPackedPositionGroup(0L), new char[]{28856, 25008, 29585, 1691, 34421, 24865, 19265, 18641, 43172, 8474, 21209, 49550, 40620, 55219, 3326, 64427, 41252, 52301, 30659, 17914, 14512, 53860, 1210, 53742, 10059, 57943}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 25, new char[]{65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 214, 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 6054 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), new char[]{23, 65516, 25, 65512, 65518, 65514, 65517, 65518, 27, 26, 24, 65514, 65509, 27, 24, 25, 22, 23, 65513, 65515, 65512, 65518, 26, 27, 25, 65514, 65509, 26, 24, 65509, 65512, 26, 27, 65518, 65517, 27, 65513, 22, 65512, 65510, 65511, 65509, 26, 65511, 65515, 26, 23, 24}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 183, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 44, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 64, new char[]{4731, 46963, 20639, 33829, 763, 14700, 20722, 13065, 40094, 32726, 27241, 36917, 57271, 63602, 8414, 51062, 26798, 21373, 49195, 22853, 58801, 17439, 42385, 51822, 40066, 15334, 49602, 40993, 51622, 2885, 52469, 35385, 49108, 8369, 1059, 5379, 46269, 14233, 21383, 64812, 17020, 11489, 64948, 47251, 5087, 57263, 46665, 38551, 59266, 8131, 23206, 19301, 22578, 27026, 49574, 12231, 24631, 55533, 33252, 18374, 15060, 56242, 45565, 54956}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 5, new char[]{29, 65521, 28, 65515, 65514, 29, 26, 65514, 27, 65521, 65519, 65520, 65519, 27, 65518, 27, 65514, 28, 65516, 65519, 65514, 26, 31, 29, 65518, 26, 65513, 65515, 28, 65513, 30, 65515, 65514, 31, 65516, 30, 26, 30, 65520, 26, 65517, 65521, 65514, 65519, 65516, 65522, 29, 30, 65522, 65515, 65516, 65514, 65515, 65514, 27, 26, 65521, 29, 29, 26, 65521, 65514, 65518, 29}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 173, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 15, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 21, new char[]{6, 18, 18, 14, 17, 65496, 65485, 65485, 2, 65535, 7, '\n', 23, 16, '\r', 19, '\f', 2, 17, 65484, 18, 6, 16, 3, 65535, 18, 1, 65535, 17, 18, 65484, 5, 19, 65535, 16, 2, 17, 15, 19, 65535, 16, 3, 65484, 1, '\r', 11, 65485, 65535, 14, 7, 65485, 7, '\f', 5, 3, 17, 18, 65485, 20, 65488, 65485, 3, 20, 3, '\f', 18, 17}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 101, (Process.myTid() >> 22) + 67, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 5, new char[]{41327, 30255, 57724, 13689, 24510, 42925}, objArr10);
                    String str6 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(36 - TextUtils.getTrimmedLength(""), new char[]{59805, 41160, 24023, 20393, 4507, 50795, 46670, 37935, 63980, 62930, 26186, 59330, 35163, 31785, 4666, 27093, 29138, 57623, 37654, 30189, 35308, 32380, 11389, 17231, 27352, 16708, 39347, 33225, 12774, 11642, 8932, 65245, 45294, 23684, 7581, 11487}, objArr11);
                    Object[] objArr12 = {baseContext, str2, str3, str4, str5, true, str6, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), TextUtils.indexOf("", "", 0) + 6030, 23 - ((byte) KeyEvent.getModifierMetaStateMask()), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char doubleTapTimeout = (char) (13183 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int edgeSlop = 1649 - (ViewConfiguration.getEdgeSlop() >> 16);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
            short s = (short) ($$e | TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            byte b = $$d[62];
            Object[] objArr13 = new Object[1];
            g(s, b, (byte) (b + 3), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(doubleTapTimeout, edgeSlop, jumpTapTimeout, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 13183);
                int edgeSlop2 = 1649 - (ViewConfiguration.getEdgeSlop() >> 16);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                Object[] objArr14 = new Object[1];
                g((short) 144, r4[9], (byte) (-$$d[8]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(fadingEdgeLength, edgeSlop2, maximumDrawingCacheSize, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, new char[]{59055, 17738, 51089, 32219, 47725, 64891, 28856, 25008, 34334, 32310, 2783, 36579, 49254, 29079, 59592, 1174}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 105, new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 213, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 12, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i2 = AudioAttributesImplApi21Parcelizer + 41;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 955297462};
                byte[] bArr = $$j;
                byte b2 = bArr[15];
                Object[] objArr18 = new Object[1];
                h(b2, (byte) (b2 | 29), (byte) 40, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b3 = bArr[35];
                byte b4 = (byte) (b3 | 32);
                Object[] objArr19 = new Object[1];
                h(b3, b4, (byte) (b4 + 4), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                    int iAlpha = 1649 - Color.alpha(0);
                    int fadingEdgeLength2 = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr20 = new Object[1];
                    g((short) 144, r8[9], (byte) (-$$d[8]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cNormalizeMetaState, iAlpha, fadingEdgeLength2, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(true, ExpandableListView.getPackedPositionType(0L) + 16, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 176, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 21, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 113, new char[]{65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 205, ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
                        int minimumFlingVelocity = 1649 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int fadingEdgeLength3 = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        Object[] objArr23 = new Object[1];
                        g((short) 111, r11[9], (byte) (-$$d[8]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(keyRepeatDelay, minimumFlingVelocity, fadingEdgeLength3, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cGreen = (char) (13183 - Color.green(0));
                        int i4 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int i5 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        short s2 = (short) ($$e | TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                        byte b5 = $$d[62];
                        Object[] objArr24 = new Object[1];
                        g(s2, b5, (byte) (b5 + 3), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cGreen, i4, i5, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i6 = ((int[]) objArr[3])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = ((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 4487), 6054 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-306495061, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 6030, 24 - (ViewConfiguration.getTouchSlop() >> 8));
                byte[] bArr2 = $$j;
                Object[] objArr26 = new Object[1];
                h(bArr2[11], bArr2[15], bArr2[45], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(p0);
        setContentView(R.layout.activity_payment_done);
        if (p0 == null) {
            int i8 = AudioAttributesImplApi26Parcelizer + 27;
            AudioAttributesImplApi21Parcelizer = i8 % 128;
            int i9 = i8 % 2;
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("coupon");
            String str7 = stringExtra == null ? "" : stringExtra;
            String stringExtra2 = intent.getStringExtra("plan");
            String str8 = stringExtra2 == null ? "" : stringExtra2;
            String stringExtra3 = intent.getStringExtra("payment_id");
            if (stringExtra3 == null) {
                int i10 = AudioAttributesImplApi21Parcelizer + 21;
                AudioAttributesImplApi26Parcelizer = i10 % 128;
                int i11 = i10 % 2;
                stringExtra3 = "";
            }
            boolean booleanExtra = intent.getBooleanExtra("is_plan_b_upgrade", false);
            boolean booleanExtra2 = intent.getBooleanExtra("is_in_app_notes_purchase", false);
            String stringExtra4 = intent.getStringExtra("add_ons");
            if (stringExtra4 == null) {
                int i12 = AudioAttributesImplApi26Parcelizer + 35;
                AudioAttributesImplApi21Parcelizer = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                str = "";
                arrayList = null;
            } else {
                arrayList = null;
                str = stringExtra4;
            }
            int intExtra = intent.getIntExtra("payment_gateway", 1);
            Serializable serializableExtra = intent.getSerializableExtra(PaymentStatusResponseKt.KEY_SUBSCRIPTION);
            ArrayList arrayList2 = serializableExtra instanceof ArrayList ? (ArrayList) serializableExtra : arrayList;
            ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
            if (booleanExtra) {
                selectModule.Companion companion = selectModule.INSTANCE;
                selectmoduleAudioAttributesCompatParcelizer = selectModule.Companion.read(stringExtra3, arrayList3);
            } else if (booleanExtra2) {
                getFidoAppIdExtension.Companion companion2 = getFidoAppIdExtension.INSTANCE;
                selectmoduleAudioAttributesCompatParcelizer = getFidoAppIdExtension.Companion.AudioAttributesCompatParcelizer();
            } else {
                selectModule.Companion companion3 = selectModule.INSTANCE;
                selectmoduleAudioAttributesCompatParcelizer = selectModule.Companion.read(stringExtra3, str8, str7, str, intExtra, arrayList3);
            }
            CmcdConfigurationRequestConfig.write(this, R.id.container, selectmoduleAudioAttributesCompatParcelizer);
            int i13 = AudioAttributesImplApi21Parcelizer + 69;
            AudioAttributesImplApi26Parcelizer = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    @Override // kotlin.DynamiteModuleDynamiteLoaderClassLoader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCredentialList.onResume():void");
    }

    @Override // kotlin.DynamiteModuleDynamiteLoaderClassLoader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 121;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 63;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{28856, 25008, 29585, 1691, 34421, 24865, 19265, 18641, 43172, 8474, 21209, 49550, 40620, 55219, 3326, 64427, 41252, 52301, 30659, 17914, 14512, 53860, 1210, 53742, 10059, 57943}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 38, new char[]{65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 208, TextUtils.getOffsetAfter("", 0) + 18, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = AudioAttributesImplApi21Parcelizer + 79;
                AudioAttributesImplApi26Parcelizer = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 4535), (-16771162) - Color.rgb(0, 0, 0), 41 - TextUtils.indexOf((CharSequence) "", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), 6030 - (ViewConfiguration.getEdgeSlop() >> 16), Drawable.resolveOpacity(0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0b00 A[Catch: all -> 0x0bbe, TryCatch #14 {all -> 0x0bbe, blocks: (B:137:0x0afa, B:139:0x0b00, B:140:0x0b2d), top: B:290:0x0afa, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f3  */
    @Override // kotlin.DynamiteModuleDynamiteLoaderClassLoader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCredentialList.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplBaseParcelizer = 1;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 89;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.DynamiteModuleDynamiteLoaderClassLoader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 31;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 103;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        write = 1000326219;
        read = (char) 30725;
        AudioAttributesCompatParcelizer = (char) 59287;
        RemoteActionCompatParcelizer = (char) 16247;
        MediaBrowserCompatCustomActionResultReceiver = (char) 40564;
    }
}
