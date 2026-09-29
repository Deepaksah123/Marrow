package kotlin;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda17 {
    private static final String AudioAttributesCompatParcelizer = "com.facebook.appevents.codeless.internal.ViewHierarchy";
    private static WeakReference<View> read = new WeakReference<>(null);
    private static Method RemoteActionCompatParcelizer = null;

    public static ViewGroup AudioAttributesImplApi26Parcelizer(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    public static List<View> IconCompatParcelizer(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    private static void RemoteActionCompatParcelizer(View view, JSONObject jSONObject) {
        try {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
                return;
            }
            try {
                String strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(view);
                String strAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", RemoteActionCompatParcelizer(view));
                jSONObject.put("id", view.getId());
                if (!DefaultAnalyticsCollectorExternalSyntheticLambda16.write(view)) {
                    jSONObject.put("text", DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(strMediaBrowserCompatItemReceiver), ""));
                } else {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(strAudioAttributesImplBaseParcelizer), ""));
                if (tag != null) {
                    jSONObject.put("tag", DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", MediaBrowserCompatCustomActionResultReceiver(view));
            } catch (JSONException e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
        }
    }

    public static JSONObject AudioAttributesCompatParcelizer(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                read = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                RemoteActionCompatParcelizer(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> listIconCompatParcelizer = IconCompatParcelizer(view);
                for (int i = 0; i < listIconCompatParcelizer.size(); i++) {
                    jSONArray.put(AudioAttributesCompatParcelizer(listIconCompatParcelizer.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    public static int RemoteActionCompatParcelizer(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return 0;
        }
        int i = view instanceof ImageView ? 2 : 0;
        try {
            if (view.isClickable()) {
                i |= 32;
            }
            if (RatingCompat(view)) {
                i |= 512;
            }
            if (view instanceof TextView) {
                int i2 = i | AnalyticsListener.EVENT_DRM_KEYS_RESTORED;
                if (view instanceof Button) {
                    i2 = i | AnalyticsListener.EVENT_AUDIO_CODEC_ERROR;
                    if (view instanceof Switch) {
                        i2 = i | 9221;
                    } else if (view instanceof CheckBox) {
                        i2 = 33797 | i;
                    }
                }
                return view instanceof EditText ? i2 | 2048 : i2;
            }
            if ((view instanceof Spinner) || (view instanceof DatePicker)) {
                return i | 4096;
            }
            if (view instanceof RatingBar) {
                return 65536 | i;
            }
            if (view instanceof RadioGroup) {
                return i | 16384;
            }
            if (view instanceof ViewGroup) {
                if (AudioAttributesCompatParcelizer(view, read.get())) {
                    return i | 64;
                }
            }
            return i;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return 0;
        }
    }

    private static boolean RatingCompat(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> clsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("android.support.v4.view.NestedScrollingChild");
            if (clsAudioAttributesCompatParcelizer != null && clsAudioAttributesCompatParcelizer.isInstance(parent)) {
                return true;
            }
            Class<?> clsAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer("androidx.core.view.NestedScrollingChild");
            if (clsAudioAttributesCompatParcelizer2 != null) {
                if (clsAudioAttributesCompatParcelizer2.isInstance(parent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return false;
        }
    }

    public static String MediaBrowserCompatItemReceiver(View view) {
        CharSequence charSequenceValueOf;
        CharSequence text;
        Object selectedItem;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    text = ((Switch) view).isChecked() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION;
                    charSequenceValueOf = text;
                    break;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    text = selectedItem.toString();
                    charSequenceValueOf = text;
                    break;
                }
                charSequenceValueOf = null;
            } else {
                if (view instanceof DatePicker) {
                    DatePicker datePicker = (DatePicker) view;
                    charSequenceValueOf = String.format("%04d-%02d-%02d", Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth()));
                } else if (view instanceof TimePicker) {
                    TimePicker timePicker = (TimePicker) view;
                    charSequenceValueOf = String.format("%02d:%02d", Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue()));
                } else {
                    if (view instanceof RadioGroup) {
                        RadioGroup radioGroup = (RadioGroup) view;
                        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                        int childCount = radioGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = radioGroup.getChildAt(i);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                text = ((RadioButton) childAt).getText();
                                charSequenceValueOf = text;
                                break;
                            }
                        }
                    } else if (view instanceof RatingBar) {
                        charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    charSequenceValueOf = null;
                }
            }
            return charSequenceValueOf == null ? "" : charSequenceValueOf.toString();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    public static String AudioAttributesImplBaseParcelizer(View view) {
        CharSequence hint;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return hint == null ? "" : hint.toString();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    private static JSONObject MediaBrowserCompatCustomActionResultReceiver(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put(TtmlNode.LEFT, view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    public static View.OnClickListener read(View view) {
        Field declaredField;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    public static void read(View view, View.OnClickListener onClickListener) {
        Field declaredField;
        Field declaredField2;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return;
        }
        Object obj = null;
        try {
            try {
                declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            } catch (ClassNotFoundException | NoSuchFieldException unused) {
                declaredField = null;
            }
            try {
                declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                declaredField2 = null;
            }
            if (declaredField == null || declaredField2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } catch (IllegalAccessException unused3) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                declaredField2.set(obj, onClickListener);
            }
        } catch (Exception unused4) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
        }
    }

    public static View.OnTouchListener AudioAttributesImplApi21Parcelizer(View view) {
        Field declaredField;
        try {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
                return null;
            }
            try {
                Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
                Object obj = declaredField2.get(view);
                if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                    return null;
                }
                declaredField.setAccessible(true);
                return (View.OnTouchListener) declaredField.get(obj);
            } catch (ClassNotFoundException e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e);
                return null;
            } catch (IllegalAccessException e2) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e2);
                return null;
            } catch (NoSuchFieldException e3) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e3);
                return null;
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    private static View IconCompatParcelizer(float[] fArr, View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            AudioAttributesCompatParcelizer();
            Method method = RemoteActionCompatParcelizer;
            if (method != null && view != null) {
                try {
                    View view2 = (View) method.invoke(null, fArr, view);
                    if (view2 != null && view2.getId() > 0) {
                        View view3 = (View) view2.getParent();
                        if (view3 != null) {
                            return view3;
                        }
                        return null;
                    }
                } catch (IllegalAccessException e) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e);
                } catch (InvocationTargetException e2) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e2);
                }
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    public static boolean AudioAttributesCompatParcelizer(View view, View view2) {
        View viewIconCompatParcelizer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return false;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") && (viewIconCompatParcelizer = IconCompatParcelizer(MediaMetadataCompat(view), view2)) != null) {
                if (viewIconCompatParcelizer.getId() == view.getId()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return false;
        }
    }

    private static boolean MediaBrowserCompatMediaItem(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return false;
        }
        try {
            return view.getClass().getName().equals("com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return false;
        }
    }

    public static View write(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!MediaBrowserCompatMediaItem(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            }
        }
        return null;
    }

    private static float[] MediaMetadataCompat(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r3[0], r3[1]};
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }

    private static void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return;
        }
        try {
            if (RemoteActionCompatParcelizer == null) {
                try {
                    Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                    RemoteActionCompatParcelizer = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (ClassNotFoundException e) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e);
                } catch (NoSuchMethodException e2) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e2);
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
        }
    }

    private static Class<?> AudioAttributesCompatParcelizer(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda17.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda17.class);
            return null;
        }
    }
}
