package kotlin;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.api.models.response.plan.RenewEligible;
import com.marrow.ui.views.CustomTypefaceSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes.dex */
public final class dispatchTouchEvent {
    public static final newYearNameItem AudioAttributesCompatParcelizer;
    public static final newYearNameItem IconCompatParcelizer;
    public static final newYearNameItem RemoteActionCompatParcelizer;
    public static final newYearNameItem read;
    public static final newYearNameItem write;

    static {
        new newYearNameItem("(?=^.*[a-z]+)(?=^.*[A-Z]+)(?=^.*[!@#$%^&*.,?_+]+)[^`\\s()]{8,}$");
        IconCompatParcelizer = new newYearNameItem(".*([A-Z]).*");
        RemoteActionCompatParcelizer = new newYearNameItem(".*([a-z]).*");
        AudioAttributesCompatParcelizer = new newYearNameItem(".*([0-9]).*");
        read = new newYearNameItem(".*([!@#$%^&*.,?_+]).*");
        write = new newYearNameItem("#(?:[0-9a-fA-F]{6})$");
    }

    public static /* synthetic */ void IconCompatParcelizer(Context context, String str, String str2, HlsPlaylist hlsPlaylist, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        RemoteActionCompatParcelizer(context, str, str2, null, hlsPlaylist);
    }

    public static final void RemoteActionCompatParcelizer(Context context, String str, String str2, String str3, HlsPlaylist<String> hlsPlaylist) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(hlsPlaylist, "");
        if (str == null) {
            hlsPlaylist.IconCompatParcelizer(null);
            return;
        }
        StringBuilder sb = new StringBuilder("https://link.marrow.com/");
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        hlsPlaylist.IconCompatParcelizer(sb.toString());
    }

    public static final void read(View view) {
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public static final void write(EditText editText) {
        if (editText != null) {
            editText.requestFocus();
            Object systemService = editText.getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(editText, 0);
            }
        }
    }

    public static final boolean RemoteActionCompatParcelizer(String str, newYearNameItem newyearnameitem) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(newyearnameitem, "");
        return newyearnameitem.write(str);
    }

    public static final void read(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        Object systemService = context.getSystemService("activity");
        toMagicModuleMetaRepoModel.read(systemService, "");
        for (ActivityManager.AppTask appTask : ((ActivityManager) systemService).getAppTasks()) {
            Intent intent = appTask.getTaskInfo().baseIntent;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
            Set<String> categories = intent.getCategories();
            if (categories != null && categories.contains("android.intent.category.LAUNCHER")) {
                appTask.moveToFront();
                return;
            }
        }
    }

    public static final boolean write(int[] iArr, int i) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        return getOrderDetails.write(iArr, i);
    }

    public static final <T> boolean AudioAttributesCompatParcelizer(List<? extends T> list, T t) {
        toMagicModuleMetaRepoModel.write(list, "");
        return list.contains(t);
    }

    public static final boolean IconCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
    }

    public static final class write implements View.OnClickListener {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
        private long write;

        write(long j, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.AudioAttributesCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = getcreatedondatems;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            if (System.currentTimeMillis() - this.write < this.AudioAttributesCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer.invoke();
            this.write = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer(View view, long j, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        view.setOnClickListener(new write(600L, getcreatedondatems));
    }

    public static final String read(long j, int i) {
        String str;
        boolean zRemoteActionCompatParcelizer = parseEac3SupplementalProperties.RemoteActionCompatParcelizer(j, System.currentTimeMillis());
        if (i != -2) {
            switch (i) {
                case 1:
                case 2:
                    str = "Live";
                    break;
                case 3:
                    str = "Results";
                    break;
                case 4:
                    str = "Ended";
                    break;
                case 5:
                    str = "Attempted";
                    break;
                case 6:
                    str = "Started";
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = "Discarded";
        }
        if (IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{4, 5, -2}).contains(Integer.valueOf(i))) {
            String strWrite = parseEac3SupplementalProperties.write(j, "dd MMM");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" on ");
            sb.append(strWrite);
            return sb.toString();
        }
        if (zRemoteActionCompatParcelizer && IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{2, 3, 6}).contains(Integer.valueOf(i))) {
            String strWrite2 = parseEac3SupplementalProperties.write(j, "dd MMM'-'h:mm a");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" on ");
            sb2.append(strWrite2);
            return sb2.toString();
        }
        if (!zRemoteActionCompatParcelizer && IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{2, 3, 6}).contains(Integer.valueOf(i))) {
            String strWrite3 = parseEac3SupplementalProperties.write(j, "h:mm a");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" today ");
            sb3.append(strWrite3);
            return sb3.toString();
        }
        if (i != 1) {
            return "";
        }
        String strWrite4 = parseEac3SupplementalProperties.write(j, "dd MMM'-'h:mm a");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(" till ");
        sb4.append(strWrite4);
        return sb4.toString();
    }

    private static boolean IconCompatParcelizer(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!Character.isDigit(str2.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final void AudioAttributesCompatParcelizer(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(packageName, "");
            try {
                StringBuilder sb = new StringBuilder("market://details?id=");
                sb.append(packageName);
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
            } catch (ActivityNotFoundException unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(String.valueOf(packageName)))));
            }
        }
    }

    public static final void AudioAttributesCompatParcelizer(Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        Object systemService = context.getSystemService("clipboard");
        toMagicModuleMetaRepoModel.read(systemService, "");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str2, str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(clipDataNewPlainText, "");
        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
    }

    public static final void RemoteActionCompatParcelizer(Context context, long j) {
        toMagicModuleMetaRepoModel.write(context, "");
        Object systemService = context.getSystemService("vibrator");
        toMagicModuleMetaRepoModel.read(systemService, "");
        Vibrator vibrator = (Vibrator) systemService;
        vibrator.cancel();
        vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double read(int i, int i2, int i3) {
        if (i == 0 || i2 == 0) {
            return 0.0d;
        }
        double d = (((double) i) * 100.0d) / ((double) i2);
        double dPow = (int) Math.pow(10.0d, 1.0d);
        return ((double) getOnline.read(d * dPow)) / dPow;
    }

    public static final String AudioAttributesCompatParcelizer(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i / 1000);
        int i2 = i % 1000;
        int i3 = i2 / 100;
        if (i2 > 0 && i3 > 0) {
            sb.append(".");
            sb.append(i3);
            sb.append("K");
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.write((Object) string);
        return string;
    }

    public static final int read(String str, String str2) {
        int length;
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            return 101;
        }
        String strSubstring = str.substring(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        if (!IconCompatParcelizer(strSubstring)) {
            return 102;
        }
        String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            return 103;
        }
        return (!IconCompatParcelizer(str2) || 8 > (length = str2.length()) || length >= 15) ? 104 : 200;
    }

    public static final void write(SpannableString spannableString, Context context, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(spannableString, "");
        toMagicModuleMetaRepoModel.write(context, "");
        spannableString.setSpan(new ForegroundColorSpan(_isNaN.getColor(context, i)), i2, i3, 0);
    }

    public static final void read(SpannableString spannableString, Context context, String str, int i, int i2) {
        toMagicModuleMetaRepoModel.write(spannableString, "");
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typefaceCreateFromAsset, "");
        spannableString.setSpan(new CustomTypefaceSpan("", typefaceCreateFromAsset), i, i2, 0);
    }

    public static final SpannableString IconCompatParcelizer(String str, Context context, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        String str4 = str;
        int i = TestGroupLSModel.read((CharSequence) str4, str3, 0, false, 6);
        int length = str3.length();
        SpannableString spannableString = new SpannableString(str4);
        read(spannableString, context, str2, i, length + i);
        return spannableString;
    }

    public static final boolean RemoteActionCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        return appOpsManager != null && appOpsManager.unsafeCheckOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0;
    }

    public static final void IconCompatParcelizer(PieChart pieChart, float f) {
        toMagicModuleMetaRepoModel.write(pieChart, "");
        pieChart.setDrawHoleEnabled(false);
        pieChart.setUsePercentValues(true);
        pieChart.onPrepareFromUri().onPrepareFromUri();
        pieChart.setRotationEnabled(false);
        pieChart.setDrawEntryLabels(false);
        pieChart.onSetRepeatMode().onPrepareFromUri();
        pieChart.setTouchEnabled(false);
        pieChart.setDrawMarkers(false);
        pieChart.setExtraOffsets(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context context = pieChart.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        int i = shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceGreen, new TypedValue(), true);
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Context context2 = pieChart.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
        int i2 = shouldEscapeCharacter.Companion.read(context2, R.attr.backgroundColor, new TypedValue(), true);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new PieEntry(f));
        arrayList2.add(Integer.valueOf(i));
        arrayList.add(new PieEntry(100.0f - f));
        arrayList2.add(Integer.valueOf(i2));
        DefaultDrmSessionExternalSyntheticLambda3 defaultDrmSessionExternalSyntheticLambda3 = new DefaultDrmSessionExternalSyntheticLambda3(arrayList, "");
        defaultDrmSessionExternalSyntheticLambda3.RemoteActionCompatParcelizer(arrayList2);
        defaultDrmSessionExternalSyntheticLambda3.AudioAttributesCompatParcelizer(false);
        defaultDrmSessionExternalSyntheticLambda3.onSetShuffleMode();
        pieChart.setData(new provisionRequired(defaultDrmSessionExternalSyntheticLambda3));
        pieChart.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17, types: [T, o.dispatchTouchEvent$RemoteActionCompatParcelizer] */
    public static final CountDownTimer AudioAttributesCompatParcelizer(RenewEligible renewEligible, TextView textView) {
        toMagicModuleMetaRepoModel.write(renewEligible, "");
        toMagicModuleMetaRepoModel.write(textView, "");
        Context context = textView.getContext();
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        int renewFlowType = renewEligible.getRenewFlowType();
        if (renewFlowType == 1) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(R.string.text_renew_header_1), parseEac3SupplementalProperties.write(renewEligible.getSubscriptionExpiresOn(), "dd MMM yyyy")}, 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            textView.setText(str);
        } else if (renewFlowType == 2) {
            long subscriptionExpiresOn = renewEligible.getSubscriptionExpiresOn() - System.currentTimeMillis();
            int days = ((int) TimeUnit.MILLISECONDS.toDays(subscriptionExpiresOn)) + (subscriptionExpiresOn % 86400000 <= 0 ? 0 : 1);
            String quantityString = context.getResources().getQuantityString(R.plurals.renew_days_left, days, Integer.valueOf(days));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString, "");
            textView.setText(new SpannableStringBuilder().append((CharSequence) context.getString(R.string.text_renew_header_2)).append((CharSequence) " ").append((CharSequence) hide.RemoteActionCompatParcelizer(quantityString, new int[]{2}, _isNaN.getColor(context, R.color.live_red))));
        } else if (renewFlowType == 3) {
            writeVar.write = new RemoteActionCompatParcelizer(context, textView, writeVar, renewEligible.getSubscriptionExpiresOn() - System.currentTimeMillis());
            ((RemoteActionCompatParcelizer) writeVar.write).start();
        } else if (renewFlowType == 4) {
            textView.setText(context.getString(R.string.text_renew_header_4));
            PlayerControlViewExternalSyntheticLambda1.read(textView, R.color.live_red);
        }
        return (CountDownTimer) writeVar.write;
    }

    public static final class RemoteActionCompatParcelizer extends CountDownTimer {
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<CountDownTimer> IconCompatParcelizer;
        private /* synthetic */ Context RemoteActionCompatParcelizer;
        private /* synthetic */ TextView read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(Context context, TextView textView, MagicModuleUseCaseImplWhenMappings.write<CountDownTimer> writeVar, long j) {
            super(j, 1000L);
            this.RemoteActionCompatParcelizer = context;
            this.read = textView;
            this.IconCompatParcelizer = writeVar;
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            this.read.setText(new SpannableStringBuilder().append((CharSequence) this.RemoteActionCompatParcelizer.getString(R.string.text_renew_header_2)).append((CharSequence) " ").append((CharSequence) hide.RemoteActionCompatParcelizer(parseEac3SupplementalProperties.read(j), new int[]{2}, _isNaN.getColor(this.RemoteActionCompatParcelizer, R.color.live_red))));
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            CountDownTimer countDownTimer = this.IconCompatParcelizer.write;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.read.setText(this.RemoteActionCompatParcelizer.getString(R.string.text_renew_header_4));
            PlayerControlViewExternalSyntheticLambda1.read(this.read, R.color.live_red);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [T, o.dispatchTouchEvent$AudioAttributesCompatParcelizer] */
    public static final CountDownTimer write(int i, long j, TextView textView) {
        toMagicModuleMetaRepoModel.write(textView, "");
        Context context = textView.getContext();
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        if (i == 1) {
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            toMagicModuleMetaRepoModel.write(context);
            textView.setText(new SpannableStringBuilder().append((CharSequence) context.getString(R.string.text_renew_header_1)).append((CharSequence) " ").append((CharSequence) hide.RemoteActionCompatParcelizer(parseEac3SupplementalProperties.write(j, "dd MMM, yyyy"), new int[]{2}, shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceSepia, new TypedValue(), true))));
        } else if (i == 2) {
            long jCurrentTimeMillis = j - System.currentTimeMillis();
            int days = ((int) TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis)) + (jCurrentTimeMillis % 86400000 <= 0 ? 0 : 1);
            String quantityString = context.getResources().getQuantityString(R.plurals.renew_days_left, days, Integer.valueOf(days));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString, "");
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            toMagicModuleMetaRepoModel.write(context);
            textView.setText(new SpannableStringBuilder().append((CharSequence) context.getString(R.string.text_renew_header_2)).append((CharSequence) " ").append((CharSequence) hide.RemoteActionCompatParcelizer(quantityString, new int[]{2}, shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceRed, new TypedValue(), true))));
        } else if (i == 3) {
            writeVar.write = new AudioAttributesCompatParcelizer(context, textView, writeVar, j - System.currentTimeMillis());
            ((AudioAttributesCompatParcelizer) writeVar.write).start();
        } else if (i == 4) {
            textView.setText(context.getString(R.string.text_renew_header_4));
            shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
            toMagicModuleMetaRepoModel.write(context);
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceRed, new TypedValue(), true));
        }
        return (CountDownTimer) writeVar.write;
    }

    public static final class AudioAttributesCompatParcelizer extends CountDownTimer {
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<CountDownTimer> IconCompatParcelizer;
        private /* synthetic */ Context read;
        private /* synthetic */ TextView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(Context context, TextView textView, MagicModuleUseCaseImplWhenMappings.write<CountDownTimer> writeVar, long j) {
            super(j, 1000L);
            this.read = context;
            this.write = textView;
            this.IconCompatParcelizer = writeVar;
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = this.read;
            toMagicModuleMetaRepoModel.write(context);
            this.write.setText(new SpannableStringBuilder().append((CharSequence) this.read.getString(R.string.text_renew_header_2)).append((CharSequence) " ").append((CharSequence) hide.RemoteActionCompatParcelizer(parseEac3SupplementalProperties.read(j), new int[]{2}, shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceRed, new TypedValue(), true))));
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            CountDownTimer countDownTimer = this.IconCompatParcelizer.write;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.write.setText(this.read.getString(R.string.text_renew_header_4));
            TextView textView = this.write;
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = this.read;
            toMagicModuleMetaRepoModel.write(context);
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceRed, new TypedValue(), true));
        }
    }

    public static final Bundle AudioAttributesCompatParcelizer(Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        Pair[] pairArr = (Pair[]) VideoTimelineResponseBody.MediaBrowserCompatCustomActionResultReceiver(map).toArray(new Pair[0]);
        return _getIndexResolver.write((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final String read(String str) {
        String strValueOf;
        if (str == null) {
            str = null;
        } else if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = str.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                Locale locale = Locale.getDefault();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
                strValueOf = setStatusTimestamp.read(cCharAt, locale);
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb.append((Object) strValueOf);
            String strSubstring = str.substring(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            sb.append(strSubstring);
            str = sb.toString();
        }
        return PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(str);
    }

    public static final Bundle RemoteActionCompatParcelizer(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        Bundle bundle = new Bundle();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                bundle.putString(str, TestGroupLSModel.RemoteActionCompatParcelizer(String.valueOf(extras.get(str)), 50));
            }
        }
        return bundle;
    }
}
