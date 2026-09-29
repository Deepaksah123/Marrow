package com.razorpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import in.juspay.hyper.constants.LogCategory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003$%&B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0004H\u0002J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\"\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000ej\b\u0012\u0004\u0012\u00020\u0004`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u000ej\b\u0012\u0004\u0012\u00020\u0011`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u000ej\b\u0012\u0004\u0012\u00020\u0011`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/razorpay/OpinionatedSoln;", "", "()V", "alertShownForStatus", "", "getAlertShownForStatus", "()Z", "setAlertShownForStatus", "(Z)V", "callbackSent", "checkedForSubMinorVersion", "getCheckedForSubMinorVersion", "setCheckedForSubMinorVersion", "dialogItemStatus", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dialogItemSubTitles", "", "dialogItemTitles", "dismissCallback", "Lcom/razorpay/OpinionatedSoln$DismissCallback;", "checkEnvVariablesForProject", "", "activity", "Landroid/app/Activity;", "checkIfVersionUpdateExists", "version", "getBuildConfigValue", LogCategory.CONTEXT, "Landroid/content/Context;", "fieldName", "getUpdatedVersionNumber", "isMinor", "integrationStatusCheck", "sendCallbackIfExists", "showDialog", "DismissCallback", "HandleDialogShowPreference", "MyListAdapter", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OpinionatedSoln {
    private static boolean alertShownForStatus;
    private static boolean callbackSent;
    private static boolean checkedForSubMinorVersion;
    private static DismissCallback dismissCallback;
    public static final OpinionatedSoln INSTANCE = new OpinionatedSoln();
    private static final ArrayList<String> dialogItemTitles = new ArrayList<>();
    private static final ArrayList<String> dialogItemSubTitles = new ArrayList<>();
    private static final ArrayList<Boolean> dialogItemStatus = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/razorpay/OpinionatedSoln$DismissCallback;", "", "", "alertDismissed", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface DismissCallback {
        void alertDismissed();
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/razorpay/OpinionatedSoln$HandleDialogShowPreference;", "", "", "errorFound", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface HandleDialogShowPreference {
        void errorFound();
    }

    private OpinionatedSoln() {
    }

    public final boolean getAlertShownForStatus() {
        return alertShownForStatus;
    }

    public final void setAlertShownForStatus(boolean z) {
        alertShownForStatus = z;
    }

    public final boolean getCheckedForSubMinorVersion() {
        return checkedForSubMinorVersion;
    }

    public final void setCheckedForSubMinorVersion(boolean z) {
        checkedForSubMinorVersion = z;
    }

    public final void integrationStatusCheck(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        checkIfVersionUpdateExists(activity, getUpdatedVersionNumber(true));
    }

    public final void integrationStatusCheck(Activity activity, DismissCallback dismissCallback2) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(dismissCallback2, "");
        Activity activity2 = activity;
        _Oo_O_$.ensureInitialized(activity2);
        CheckoutUtils.showLoader(activity2);
        callbackSent = false;
        dismissCallback = dismissCallback2;
        checkIfVersionUpdateExists(activity, getUpdatedVersionNumber(true));
    }

    private final void checkEnvVariablesForProject(Activity activity) {
        dialogItemTitles.add("Min SDK Version Check");
        dialogItemSubTitles.add("Min SDK Version Compatible");
        dialogItemStatus.add(Boolean.TRUE);
        showDialog(activity);
    }

    private final String getUpdatedVersionNumber(boolean isMinor) {
        List listWrite = TestGroupLSModel.write((CharSequence) TestGroupLSModel.write(com.razorpay.a.a.O$$$__o0Oo.VERSION_NAME, new String[]{"-"}, 0, 6).get(0), new String[]{"."}, 0, 6);
        String str = (String) listWrite.get(0);
        String str2 = (String) listWrite.get(1);
        String str3 = (String) listWrite.get(2);
        if (isMinor) {
            int i = Integer.parseInt(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(i + 1);
            sb.append(".0");
            return sb.toString();
        }
        int i2 = Integer.parseInt(str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('.');
        sb2.append(str2);
        sb2.append('.');
        sb2.append(i2 + 1);
        return sb2.toString();
    }

    private final void checkIfVersionUpdateExists(final Activity activity, String version) {
        final MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        Owl.get("https://mvnrepository.com/artifact/com.razorpay/checkout/".concat(String.valueOf(version)), new Callback() { // from class: com.razorpay.OpinionatedSoln$$ExternalSyntheticLambda3
            @Override // com.razorpay.Callback
            public final void run(ResponseObject responseObject) {
                OpinionatedSoln.m222checkIfVersionUpdateExists$lambda0(audioAttributesCompatParcelizer, activity, responseObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkIfVersionUpdateExists$lambda-0, reason: not valid java name */
    public static final void m222checkIfVersionUpdateExists$lambda0(MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Activity activity, ResponseObject responseObject) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(activity, "");
        if (responseObject != null && responseObject.getResponseCode() == 200) {
            audioAttributesCompatParcelizer.IconCompatParcelizer = true;
            dialogItemTitles.add("Version Upgrade Check");
            dialogItemSubTitles.add("A version update was found. Click here to go to docs");
            dialogItemStatus.add(Boolean.FALSE);
            INSTANCE.checkEnvVariablesForProject(activity);
            return;
        }
        OpinionatedSoln opinionatedSoln = INSTANCE;
        if (!checkedForSubMinorVersion) {
            checkedForSubMinorVersion = true;
            opinionatedSoln.checkIfVersionUpdateExists(activity, opinionatedSoln.getUpdatedVersionNumber(false));
            return;
        }
        audioAttributesCompatParcelizer.IconCompatParcelizer = false;
        dialogItemTitles.add("Version Upgrade Check");
        dialogItemSubTitles.add("Running the latest version");
        dialogItemStatus.add(Boolean.TRUE);
        opinionatedSoln.checkEnvVariablesForProject(activity);
    }

    public final void showDialog(final Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        Activity activity2 = activity;
        Object buildConfigValue = getBuildConfigValue(activity2, "DEBUG");
        if (buildConfigValue != null) {
            if (((Boolean) buildConfigValue).booleanValue() && !alertShownForStatus) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                View viewInflate = activity.getLayoutInflater().inflate(com.razorpay.checkout.lib.R.layout.sdk_integration_status, (ViewGroup) null);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
                ListView listView = (ListView) viewInflate.findViewById(com.razorpay.checkout.lib.R.id.check_list);
                final ArrayList<String> arrayList = dialogItemTitles;
                final ArrayList<String> arrayList2 = dialogItemSubTitles;
                final ArrayList<Boolean> arrayList3 = dialogItemStatus;
                listView.setAdapter((ListAdapter) new ArrayAdapter<String>(activity, arrayList, arrayList2, arrayList3) { // from class: com.razorpay.OpinionatedSoln$O$$$__o0Oo
                    private final Activity context;
                    private final ArrayList<String> itemDescs;
                    private final ArrayList<String> itemTitles;
                    private final ArrayList<Boolean> status;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(activity, com.razorpay.checkout.lib.R.layout.single_item);
                        toMagicModuleMetaRepoModel.write(activity, "");
                        toMagicModuleMetaRepoModel.write(arrayList, "");
                        toMagicModuleMetaRepoModel.write(arrayList2, "");
                        toMagicModuleMetaRepoModel.write(arrayList3, "");
                        this.context = activity;
                        this.itemTitles = arrayList;
                        this.itemDescs = arrayList2;
                        this.status = arrayList3;
                    }

                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public final int getCount() {
                        return this.itemTitles.size();
                    }

                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public final View getView(int position, View view, ViewGroup parent) {
                        toMagicModuleMetaRepoModel.write(parent, "");
                        LayoutInflater layoutInflater = this.context.getLayoutInflater();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflater, "");
                        View viewInflate2 = layoutInflater.inflate(com.razorpay.checkout.lib.R.layout.single_item, (ViewGroup) null, true);
                        View viewFindViewById = viewInflate2.findViewById(com.razorpay.checkout.lib.R.id.tv_title);
                        if (viewFindViewById == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        TextView textView = (TextView) viewFindViewById;
                        View viewFindViewById2 = viewInflate2.findViewById(com.razorpay.checkout.lib.R.id.iv_check_mark);
                        if (viewFindViewById2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                        }
                        ImageView imageView = (ImageView) viewFindViewById2;
                        View viewFindViewById3 = viewInflate2.findViewById(com.razorpay.checkout.lib.R.id.tv_sub_item);
                        if (viewFindViewById3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        TextView textView2 = (TextView) viewFindViewById3;
                        textView.setText(this.itemTitles.get(position));
                        Boolean bool = this.status.get(position);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bool, "");
                        if (bool.booleanValue()) {
                            imageView.setImageResource(com.razorpay.checkout.lib.R.drawable.ic_tick_mark);
                        } else {
                            imageView.setImageResource(com.razorpay.checkout.lib.R.drawable.ic_alert);
                        }
                        textView2.setText(this.itemDescs.get(position));
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate2, "");
                        return viewInflate2;
                    }
                });
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.razorpay.OpinionatedSoln$$ExternalSyntheticLambda0
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                        OpinionatedSoln.m223showDialog$lambda1(activity, adapterView, view, i, j);
                    }
                });
                builder.setView(viewInflate);
                builder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.razorpay.OpinionatedSoln$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        OpinionatedSoln.m224showDialog$lambda2(dialogInterface);
                    }
                });
                Iterator<Boolean> it = arrayList3.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    if (!it.next().booleanValue()) {
                        z = false;
                    }
                }
                if (z) {
                    builder.setNegativeButton("Hide notification forever", new DialogInterface.OnClickListener() { // from class: com.razorpay.OpinionatedSoln$$ExternalSyntheticLambda2
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            OpinionatedSoln.m225showDialog$lambda3(activity, dialogInterface, i);
                        }
                    });
                }
                Boolean opinionatedSolnPreference = BaseConfig.getOpinionatedSolnPreference(activity2);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(opinionatedSolnPreference, "");
                if (opinionatedSolnPreference.booleanValue() || !z) {
                    if (!z) {
                        BaseConfig.setOpinionatedSolnPreference(activity2, Boolean.TRUE);
                    }
                    final AlertDialog alertDialogShow = builder.show();
                    alertShownForStatus = true;
                    new CountDownTimer() { // from class: com.razorpay.OpinionatedSoln$_$O0_o
                        @Override // android.os.CountDownTimer
                        public final void onTick(long millisUntilFinished) {
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(5000L, 1000L);
                        }

                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            alertDialogShow.dismiss();
                            OpinionatedSoln.INSTANCE.sendCallbackIfExists();
                        }
                    }.start();
                    CheckoutUtils.dismissLoader();
                    return;
                }
                HashMap map = new HashMap();
                String str = "";
                for (String str2 : dialogItemTitles) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                    ArrayList<String> arrayList4 = dialogItemSubTitles;
                    ArrayList<String> arrayList5 = dialogItemTitles;
                    String str3 = arrayList4.get(arrayList5.indexOf(str2));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                    map.put(str2, str3);
                    if (!dialogItemStatus.get(arrayList5.indexOf(str2)).booleanValue()) {
                        str = "https://razorpay.com/docs/payments/payment-gateway/android-integration/standard";
                    }
                }
                StringBuilder sb = new StringBuilder("RAZORPAY_SDK: ");
                sb.append(map);
                sb.append('\n');
                sb.append(str);
                Logger.w(sb.toString());
                sendCallbackIfExists();
                CheckoutUtils.dismissLoader();
                return;
            }
            CheckoutUtils.dismissLoader();
            sendCallbackIfExists();
            return;
        }
        CheckoutUtils.dismissLoader();
        sendCallbackIfExists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showDialog$lambda-1, reason: not valid java name */
    public static final void m223showDialog$lambda1(Activity activity, AdapterView adapterView, View view, int i, long j) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if (i == 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://razorpay.com/docs/payments/payment-gateway/android-integration/standard/#list-of-razorpay-android-standard-sdk-versions-last"));
            activity.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showDialog$lambda-2, reason: not valid java name */
    public static final void m224showDialog$lambda2(DialogInterface dialogInterface) {
        INSTANCE.sendCallbackIfExists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showDialog$lambda-3, reason: not valid java name */
    public static final void m225showDialog$lambda3(Activity activity, DialogInterface dialogInterface, int i) {
        toMagicModuleMetaRepoModel.write(activity, "");
        Activity activity2 = activity;
        BaseConfig.setOpinionatedSolnPreference(activity2, Boolean.FALSE);
        Toast.makeText(activity2, "Status will be shown in logs. RAZORPAY_SDK", 1).show();
        INSTANCE.sendCallbackIfExists();
    }

    public final void sendCallbackIfExists() {
        DismissCallback dismissCallback2 = dismissCallback;
        if (dismissCallback2 == null || callbackSent) {
            return;
        }
        if (dismissCallback2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            dismissCallback2 = null;
        }
        dismissCallback2.alertDismissed();
        callbackSent = true;
    }

    public final Object getBuildConfigValue(Context context, String fieldName) {
        toMagicModuleMetaRepoModel.write(context, "");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(".BuildConfig");
            Field field = fieldName != null ? Class.forName(sb.toString()).getField(fieldName) : null;
            if (field != null) {
                return field.get(null);
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }
}
