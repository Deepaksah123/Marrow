package kotlin;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class DefaultAnalyticsCollectorExternalSyntheticLambda49 {
    private static final List<Class<? extends View>> read = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));

    DefaultAnalyticsCollectorExternalSyntheticLambda49() {
    }

    static JSONObject IconCompatParcelizer(View view, View view2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda49.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            RemoteActionCompatParcelizer(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = DefaultAnalyticsCollectorExternalSyntheticLambda17.IconCompatParcelizer(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(IconCompatParcelizer(it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda49.class);
            return null;
        }
    }

    private static void RemoteActionCompatParcelizer(View view, JSONObject jSONObject) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda49.class)) {
            return;
        }
        try {
            String strMediaBrowserCompatItemReceiver = DefaultAnalyticsCollectorExternalSyntheticLambda17.MediaBrowserCompatItemReceiver(view);
            String strAudioAttributesImplBaseParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda17.AudioAttributesImplBaseParcelizer(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", DefaultAnalyticsCollectorExternalSyntheticLambda17.RemoteActionCompatParcelizer(view));
            if (!strMediaBrowserCompatItemReceiver.isEmpty()) {
                jSONObject.put("text", strMediaBrowserCompatItemReceiver);
            }
            if (!strAudioAttributesImplBaseParcelizer.isEmpty()) {
                jSONObject.put("hint", strAudioAttributesImplBaseParcelizer);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda49.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r5.isClickable() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r5 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda17.IconCompatParcelizer(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r5.hasNext() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        r1.addAll(IconCompatParcelizer(r5.next()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.util.List<android.view.View> IconCompatParcelizer(android.view.View r5) {
        /*
            java.lang.Class<o.DefaultAnalyticsCollectorExternalSyntheticLambda49> r0 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda49.class
            boolean r1 = kotlin.getMinWindowSequenceNumber.IconCompatParcelizer(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            java.util.List<java.lang.Class<? extends android.view.View>> r3 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda49.read     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4e
        L15:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L28
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L4e
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r4.isInstance(r5)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L15
            goto L4d
        L28:
            boolean r3 = r5.isClickable()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L31
            r1.add(r5)     // Catch: java.lang.Throwable -> L4e
        L31:
            java.util.List r5 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda17.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4e
        L39:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L4e
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L4e
            java.util.List r3 = IconCompatParcelizer(r3)     // Catch: java.lang.Throwable -> L4e
            r1.addAll(r3)     // Catch: java.lang.Throwable -> L4e
            goto L39
        L4d:
            return r1
        L4e:
            r5 = move-exception
            kotlin.getMinWindowSequenceNumber.read(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda49.IconCompatParcelizer(android.view.View):java.util.List");
    }

    static String write(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda49.class)) {
            return null;
        }
        try {
            String strMediaBrowserCompatItemReceiver = DefaultAnalyticsCollectorExternalSyntheticLambda17.MediaBrowserCompatItemReceiver(view);
            return !strMediaBrowserCompatItemReceiver.isEmpty() ? strMediaBrowserCompatItemReceiver : TextUtils.join(" ", RemoteActionCompatParcelizer(view));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda49.class);
            return null;
        }
    }

    private static List<String> RemoteActionCompatParcelizer(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda49.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : DefaultAnalyticsCollectorExternalSyntheticLambda17.IconCompatParcelizer(view)) {
                String strMediaBrowserCompatItemReceiver = DefaultAnalyticsCollectorExternalSyntheticLambda17.MediaBrowserCompatItemReceiver(view2);
                if (!strMediaBrowserCompatItemReceiver.isEmpty()) {
                    arrayList.add(strMediaBrowserCompatItemReceiver);
                }
                arrayList.addAll(RemoteActionCompatParcelizer(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda49.class);
            return null;
        }
    }
}
