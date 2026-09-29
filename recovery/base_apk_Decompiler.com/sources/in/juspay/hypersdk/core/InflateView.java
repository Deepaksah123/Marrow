package in.juspay.hypersdk.core;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.PopupMenu;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.test.TestIndex;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyperlottie.LottieAnimation;
import in.juspay.hypersdk.mystique.AnimationHolder;
import in.juspay.hypersdk.mystique.Callback;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class InflateView {
    private static final String ARG_TYPE_SPLIT = "_";
    private static final Pattern COMMAND_SPLIT;
    private static final String FUNCTION_ARG_SPLIT = ",";
    private static final Pattern FUNCTION_ARG_SPLIT_ESCAPE;
    private static final String FUNCTION_ARG_START = ":";
    private static final String KEYWORD_SPLIT = "->";
    private static final String LOG_TAG = "in.juspay.hypersdk.core.InflateView";
    private static final Map<Class<?>, Class<?>> PRIMITIVE_TYPES;
    private static final String SETTER_EQUALS = "=";
    private final AnimationHolder animationHolder;
    private final DuiCallback duiCallback;
    protected final DynamicUI dynamicUI;
    private LottieAnimation lottieAnimation;
    private PopupMenu popUpMenu;
    private float swipeEndX;
    private float swipeEndY;
    private float swipeStartX;
    private float swipeStartY;
    private final HashMap<Cmd, Method> functionCache = new HashMap<>();
    protected HashMap<String, Object> state = new HashMap<>();
    private String currViewId = TestIndex.ALL_INDIA_ID;
    private String lastCommand = "";
    private String currView = "";
    private String fileOrigin = "";
    private boolean useAppContext = false;

    /* JADX INFO: renamed from: in.juspay.hypersdk.core.InflateView$2, reason: invalid class name */
    class AnonymousClass2 implements TextureView.SurfaceTextureListener {
        private boolean isDrawn = false;
        final /* synthetic */ Context val$context;
        final /* synthetic */ MediaPlayer val$mMediaPlayer;
        final /* synthetic */ JSONObject val$properties;
        final /* synthetic */ Uri val$uri;

        AnonymousClass2(MediaPlayer mediaPlayer, Context context, Uri uri, JSONObject jSONObject) {
            this.val$mMediaPlayer = mediaPlayer;
            this.val$context = context;
            this.val$uri = uri;
            this.val$properties = jSONObject;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (this.isDrawn) {
                return;
            }
            try {
                this.isDrawn = true;
                this.val$mMediaPlayer.reset();
                this.val$mMediaPlayer.setDataSource(this.val$context, this.val$uri);
                this.val$mMediaPlayer.setSurface(new Surface(surfaceTexture));
                this.val$mMediaPlayer.prepareAsync();
                if (this.val$properties.optBoolean("autoloop", false)) {
                    this.val$mMediaPlayer.setLooping(true);
                }
                final MediaPlayer mediaPlayer = this.val$mMediaPlayer;
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: in.juspay.hypersdk.core.InflateView$2$$ExternalSyntheticLambda0
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer2) {
                        mediaPlayer.start();
                    }
                });
            } catch (Exception e) {
                InflateView.this.dynamicUI.getLogger().e("TextureView", "Exception in TextureView: ".concat(String.valueOf(e)));
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                this.val$mMediaPlayer.stop();
                this.val$mMediaPlayer.release();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static class Cmd {
        private final Class<?>[] args;
        private final Class<?> clazz;
        private final String functionName;

        public Cmd(Class<?> cls, String str, Class<?>[] clsArr) {
            this.clazz = cls;
            this.functionName = str;
            this.args = clsArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Cmd cmd = (Cmd) obj;
            if (this.clazz.equals(cmd.clazz) && this.functionName.equals(cmd.functionName)) {
                return Arrays.equals(this.args, cmd.args);
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.clazz.hashCode();
            int iHashCode2 = this.functionName.hashCode();
            Class<?>[] clsArr = this.args;
            return (((iHashCode * 31) + iHashCode2) * 31) + (clsArr != null ? Arrays.hashCode(clsArr) : 0);
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        PRIMITIVE_TYPES = hashtable;
        StringBuilder sb = new StringBuilder("(?<!\\\\)");
        sb.append(Pattern.quote(FUNCTION_ARG_SPLIT));
        FUNCTION_ARG_SPLIT_ESCAPE = Pattern.compile(sb.toString());
        StringBuilder sb2 = new StringBuilder("(?<!\\\\)");
        sb2.append(Pattern.quote(";"));
        COMMAND_SPLIT = Pattern.compile(sb2.toString());
        hashtable.put(Boolean.class, Boolean.TYPE);
        hashtable.put(Character.class, Character.TYPE);
        hashtable.put(Byte.class, Byte.TYPE);
        hashtable.put(Short.class, Short.TYPE);
        hashtable.put(Integer.class, Integer.TYPE);
        hashtable.put(Long.class, Long.TYPE);
        hashtable.put(Float.class, Float.TYPE);
        hashtable.put(Double.class, Double.TYPE);
        hashtable.put(Void.class, Void.TYPE);
    }

    InflateView(final DynamicUI dynamicUI) {
        this.lottieAnimation = null;
        this.dynamicUI = dynamicUI;
        DuiCallback duiCallback = new DuiCallback() { // from class: in.juspay.hypersdk.core.InflateView.1
            @Override // in.juspay.hyper.core.JsCallback
            public void addJsToWebView(String str) {
                dynamicUI.addJsToWebView(str);
            }

            @Override // in.juspay.hypersdk.core.DuiCallback
            public InflateView getInflateView() {
                return dynamicUI.getInflateView();
            }

            @Override // in.juspay.hypersdk.core.DuiCallback
            public DuiLogger getLogger() {
                return dynamicUI.getLogger();
            }
        };
        this.duiCallback = duiCallback;
        this.state.put("duiObj", dynamicUI);
        this.animationHolder = new AnimationHolder(duiCallback, dynamicUI.getAppContext().getResources().getDisplayMetrics().density);
        if (PaymentUtils.isClassAvailable("in.juspay.hyperlottie.LottieAnimation")) {
            this.lottieAnimation = new LottieAnimation(dynamicUI.getAppContext(), dynamicUI, dynamicUI.getBridgeComponents().getFileProviderInterface());
        }
    }

    private Object findAndSetField(Object obj, String str, String str2, boolean z) throws IllegalAccessException {
        Field field;
        try {
            field = obj.getClass().getField(str);
        } catch (NoSuchFieldException unused) {
            Field field2 = null;
            for (Field field3 : obj.getClass().getFields()) {
                if (field3.getName().equals(str)) {
                    field2 = field3;
                }
            }
            field = field2;
        }
        if (field != null) {
            field.set(obj, getValue(str2, z));
        } else {
            this.dynamicUI.getLogger().d(LOG_TAG, "Couldn't set field for ".concat(String.valueOf(str)));
        }
        return obj;
    }

    private Method findMethodInClass(Class<?> cls, String str) {
        String str2;
        String str3;
        if (cls == null) {
            return null;
        }
        if (indexOf(str, FUNCTION_ARG_START, 0) != -1) {
            String[] strArrSubstr = substr(str, FUNCTION_ARG_START);
            str2 = strArrSubstr[0];
            str3 = strArrSubstr[1];
        } else {
            str2 = str;
            str3 = null;
        }
        return findMethodWithCmd(new Cmd(cls, str2, str3 != null ? parseTypeArguments(str3) : null));
    }

    private int getArgsLength(String str) {
        return FUNCTION_ARG_SPLIT_ESCAPE.split(str).length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <Any> Any getClassType(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.getClassType(java.lang.String):java.lang.Object");
    }

    private Context getContext() {
        return this.useAppContext ? this.dynamicUI.getAppContext() : this.dynamicUI.getActivity();
    }

    private TimeInterpolator getCustomEasing(String str, final float[] fArr) {
        str.hashCode();
        return !str.equals("bezier") ? !str.equals("spring") ? new LinearInterpolator() : new TimeInterpolator() { // from class: in.juspay.hypersdk.core.InflateView$$ExternalSyntheticLambda0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return InflateView.lambda$getCustomEasing$11(fArr, f);
            }
        } : new PathInterpolator(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.animation.TimeInterpolator getEasing(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "["
            r8.hashCode()
            r8.hashCode()
            int r1 = r8.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r1) {
                case -1965120668: goto L3d;
                case -1383205240: goto L33;
                case -1102672091: goto L29;
                case -789192465: goto L1f;
                case -361990811: goto L15;
                default: goto L14;
            }
        L14:
            goto L47
        L15:
            java.lang.String r1 = "ease-in-out"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L47
            r1 = r2
            goto L48
        L1f:
            java.lang.String r1 = "ease-out"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L47
            r1 = r3
            goto L48
        L29:
            java.lang.String r1 = "linear"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L47
            r1 = r4
            goto L48
        L33:
            java.lang.String r1 = "bounce"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L47
            r1 = r6
            goto L48
        L3d:
            java.lang.String r1 = "ease-in"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L47
            r1 = r5
            goto L48
        L47:
            r1 = -1
        L48:
            if (r1 == 0) goto La2
            if (r1 == r6) goto L9c
            if (r1 == r4) goto L96
            if (r1 == r3) goto L90
            if (r1 == r2) goto L8a
            boolean r1 = r8.contains(r0)     // Catch: org.json.JSONException -> L84
            if (r1 == 0) goto L84
            int r1 = r8.indexOf(r0)     // Catch: org.json.JSONException -> L84
            java.lang.String r1 = r8.substring(r5, r1)     // Catch: org.json.JSONException -> L84
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L84
            int r0 = r8.indexOf(r0)     // Catch: org.json.JSONException -> L84
            java.lang.String r8 = r8.substring(r0)     // Catch: org.json.JSONException -> L84
            r2.<init>(r8)     // Catch: org.json.JSONException -> L84
            int r8 = r2.length()     // Catch: org.json.JSONException -> L84
            float[] r0 = new float[r8]     // Catch: org.json.JSONException -> L84
        L73:
            if (r5 >= r8) goto L7f
            double r3 = r2.getDouble(r5)     // Catch: org.json.JSONException -> L84
            float r3 = (float) r3     // Catch: org.json.JSONException -> L84
            r0[r5] = r3     // Catch: org.json.JSONException -> L84
            int r5 = r5 + 1
            goto L73
        L7f:
            android.animation.TimeInterpolator r7 = r7.getCustomEasing(r1, r0)     // Catch: org.json.JSONException -> L84
            return r7
        L84:
            android.view.animation.LinearInterpolator r7 = new android.view.animation.LinearInterpolator
            r7.<init>()
            return r7
        L8a:
            android.view.animation.AccelerateDecelerateInterpolator r7 = new android.view.animation.AccelerateDecelerateInterpolator
            r7.<init>()
            return r7
        L90:
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            return r7
        L96:
            android.view.animation.LinearInterpolator r7 = new android.view.animation.LinearInterpolator
            r7.<init>()
            return r7
        L9c:
            android.view.animation.BounceInterpolator r7 = new android.view.animation.BounceInterpolator
            r7.<init>()
            return r7
        La2:
            android.view.animation.AccelerateInterpolator r7 = new android.view.animation.AccelerateInterpolator
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.getEasing(java.lang.String):android.animation.TimeInterpolator");
    }

    private <Any> Any getValue(String str, boolean z) {
        if (str == null) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb = new StringBuilder(" isNull : fn__getValue - value ");
            sb.append(getErrorDetails());
            logger.e("WARNING", sb.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb2 = new StringBuilder(" isNull : fn__getValue - value ");
            sb2.append(getErrorDetails());
            errorCallback.onError("WARNING", sb2.toString());
            return null;
        }
        this.dynamicUI.getLogger().d("getValue!", str);
        String[] strArrSubstr = substr(str, ARG_TYPE_SPLIT);
        String str2 = strArrSubstr[0];
        String strReplace = strArrSubstr[1];
        if (strReplace.indexOf(92) != -1 && strReplace.contains(";")) {
            strReplace = strReplace.replace("\\\\;", ";");
        }
        if (strReplace.indexOf(92) != -1 && strReplace.contains(ARG_TYPE_SPLIT)) {
            strReplace = strReplace.replace("\\\\_", ARG_TYPE_SPLIT);
        }
        if (strReplace.indexOf(92) != -1 && strReplace.contains(FUNCTION_ARG_START)) {
            strReplace = strReplace.replace("\\\\:", FUNCTION_ARG_START);
        }
        if (strReplace.indexOf(92) != -1 && strReplace.contains(FUNCTION_ARG_SPLIT)) {
            strReplace = strReplace.replace("\\\\,", FUNCTION_ARG_SPLIT);
        }
        if (strReplace.indexOf(92) != -1 && strReplace.contains(SETTER_EQUALS)) {
            strReplace = strReplace.replace("\\\\=", SETTER_EQUALS);
        }
        return (Any) getValueNew(str2, strReplace);
    }

    private int indexOf(String str, String str2, int i) {
        int iIndexOf = str.substring(i).indexOf(str2);
        if (iIndexOf != -1 && iIndexOf != 0 && iIndexOf < str.length()) {
            int i2 = iIndexOf + i;
            if (str.charAt(i2 - 1) == '\\') {
                return indexOf(str, str2, i2 + str2.length());
            }
        }
        return iIndexOf == -1 ? iIndexOf : iIndexOf + i;
    }

    public static boolean isWrappedPrimitiveType(Class<?> cls) {
        return PRIMITIVE_TYPES.containsKey(cls);
    }

    static /* synthetic */ float lambda$getCustomEasing$11(float[] fArr, float f) {
        double dPow = Math.pow(2.0d, (-10.0f) * f);
        float f2 = fArr[0];
        return ((float) (dPow * Math.sin((6.283185307179586d / ((double) f2)) * ((double) (f - (f2 / 4.0f)))))) + 1.0f;
    }

    static /* synthetic */ CharSequence lambda$parseKeys$0(String str, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!Pattern.compile(str).matcher(String.valueOf(charSequence.charAt(i))).matches()) {
                return "";
            }
            i++;
        }
        return null;
    }

    static /* synthetic */ CharSequence lambda$parseKeys$1(String str, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(spanned.subSequence(0, i3).toString());
        sb.append((Object) charSequence.subSequence(i, i2));
        sb.append((Object) spanned.subSequence(i4, spanned.length()));
        Matcher matcher = Pattern.compile(str).matcher(sb.toString());
        if (matcher.matches() || matcher.hitEnd()) {
            return null;
        }
        return (!charSequence.equals("") || i3 == i4) ? "" : spanned.subSequence(i3, i4);
    }

    private void normalTextChange(JSONObject jSONObject, Object obj) throws JSONException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method method = obj.getClass().getMethod("addTextChangedListener", TextWatcher.class);
        final String string = jSONObject.getString("onChange");
        method.invoke(obj, new TextWatcher() { // from class: in.juspay.hypersdk.core.InflateView.7
            private String previousText;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.previousText = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (this.previousText.equals(charSequence.toString())) {
                    return;
                }
                DynamicUI dynamicUI = InflateView.this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback('");
                sb.append(string);
                sb.append("', '");
                sb.append((Object) charSequence);
                sb.append("');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        });
    }

    private Object[] parseArguments(String str, boolean z) {
        if (str == null || str.trim().equals("")) {
            return new Object[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(ARG_TYPE_SPLIT);
        if (indexOf(str, FUNCTION_ARG_SPLIT, 0) == -1 || strArrSplit.length == 2) {
            arrayList.add(getValue(str, z));
        } else {
            for (String str2 : FUNCTION_ARG_SPLIT_ESCAPE.split(str)) {
                arrayList.add(getValue(str2, z));
            }
        }
        return arrayList.toArray();
    }

    private Class<?>[] parseTypeArguments(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(ARG_TYPE_SPLIT);
        if (indexOf(str, FUNCTION_ARG_SPLIT, 0) != -1 && strArrSplit.length != 2) {
            String[] strArrSplit2 = FUNCTION_ARG_SPLIT_ESCAPE.split(str);
            if (strArrSplit2.length > 1) {
                Class<?>[] clsArr = new Class[strArrSplit2.length];
                for (int i = 0; i < strArrSplit2.length; i++) {
                    clsArr[i] = (Class) getClassType(strArrSplit2[i]);
                }
                return clsArr;
            }
        }
        return new Class[]{(Class) getClassType(str)};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object runCommand(java.lang.Object r18, java.lang.Object r19, java.lang.String r20, boolean r21) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.runCommand(java.lang.Object, java.lang.Object, java.lang.String, boolean):java.lang.Object");
    }

    private void separatorTextChange(JSONObject jSONObject, Object obj) throws JSONException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        obj.getClass().getMethod("addTextChangedListener", TextWatcher.class).invoke(obj, new TextWatcher(jSONObject, jSONObject.getString("onChange"), (EditText) obj) { // from class: in.juspay.hypersdk.core.InflateView.8
            private static final int TOTAL_DIGITS = 21;
            private static final int TOTAL_SYMBOLS = 26;
            private final char DIVIDER;
            private final int DIVIDER_MODULO;
            private final int DIVIDER_POSITION;
            private boolean executeTextChange;
            private String previousText;
            final /* synthetic */ EditText val$cardField;
            final /* synthetic */ String val$js;
            final /* synthetic */ JSONObject val$properties;

            {
                this.val$properties = jSONObject;
                this.val$js = str;
                this.val$cardField = editText;
                int i = jSONObject.getInt("separatorRepeat");
                this.DIVIDER_POSITION = i;
                this.DIVIDER_MODULO = i + 1;
                this.DIVIDER = jSONObject.getString("separator").charAt(0);
                this.executeTextChange = true;
            }

            private String buildCorrectString(char[] cArr, int i) {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < cArr.length; i2++) {
                    char c = cArr[i2];
                    if (c != 0) {
                        sb.append(c);
                        if (i2 > 0 && i2 < i - 1 && (i2 + 1) % this.DIVIDER_POSITION == 0) {
                            sb.append(this.DIVIDER);
                        }
                    }
                }
                return sb.toString();
            }

            private char[] getDigitArray(Editable editable) {
                char[] cArr = new char[21];
                int i = 0;
                for (int i2 = 0; i2 < editable.length() && i < 21; i2++) {
                    char cCharAt = editable.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        cArr[i] = cCharAt;
                        i++;
                    }
                }
                return cArr;
            }

            private boolean isInputCorrect(Editable editable) {
                boolean zIsDigit = editable.length() <= 26;
                int i = 0;
                while (i < editable.length()) {
                    zIsDigit &= (i <= 0 || (i + 1) % this.DIVIDER_MODULO != 0) ? Character.isDigit(editable.charAt(i)) : this.DIVIDER == editable.charAt(i);
                    i++;
                }
                return zIsDigit;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable.length() == 0 || !this.val$cardField.isFocused() || this.previousText.equals(editable.toString()) || !this.executeTextChange) {
                    return;
                }
                boolean z = this.previousText.length() > editable.length();
                InputFilter[] filters = editable.getFilters();
                editable.setFilters(new InputFilter[0]);
                int selectionStart = this.val$cardField.getSelectionStart();
                this.executeTextChange = false;
                int i = selectionStart + 1;
                if (i % this.DIVIDER_MODULO == 0 && z) {
                    editable.delete(selectionStart - 1, selectionStart);
                }
                if (!isInputCorrect(editable)) {
                    editable.replace(0, editable.length(), buildCorrectString(getDigitArray(editable), editable.length()));
                    if (editable.length() > 0 && this.DIVIDER == editable.charAt(editable.length() - 1) && z) {
                        editable.delete(editable.length() - 1, editable.length());
                    }
                }
                if (selectionStart != 0 && selectionStart % this.DIVIDER_MODULO == 0 && editable.length() > selectionStart && !z) {
                    this.val$cardField.setSelection(i);
                }
                this.executeTextChange = true;
                editable.setFilters(filters);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.previousText = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (this.previousText.equals(charSequence.toString()) || !this.executeTextChange) {
                    return;
                }
                DynamicUI dynamicUI = InflateView.this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback('");
                sb.append(this.val$js);
                sb.append("', '");
                sb.append((Object) charSequence);
                sb.append("');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        });
    }

    private String[] substr(String str, String str2) {
        int iIndexOf = indexOf(str, str2, 0);
        return iIndexOf == -1 ? new String[]{str} : new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + str2.length())};
    }

    private Method tryExactMatch(Class<?> cls, String str, Class<?>[] clsArr) {
        return cls.getMethod(str, clsArr);
    }

    private Method tryMultiAgrumentDeepMatch(Class<?> cls, String str, Class<?>[] clsArr) {
        if ("undefined".equals(str)) {
            return null;
        }
        DuiLogger logger = this.dynamicUI.getLogger();
        String str2 = LOG_TAG;
        StringBuilder sb = new StringBuilder("tryMultiAgrumentDeepMatch reached. Beware slow function.. ");
        sb.append(cls.toString());
        sb.append(" : ");
        sb.append(str);
        sb.append(" : ");
        sb.append(clsArr.length);
        logger.d(str2, sb.toString());
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == clsArr.length && matchTypes(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    private Method trySingleArgumentDeepMatch(Class<?> cls, String str, Class<?> cls2) {
        if (isWrappedPrimitiveType(cls2)) {
            try {
                return cls.getMethod(str, PRIMITIVE_TYPES.get(cls2));
            } catch (NoSuchMethodException unused) {
            }
        }
        do {
            for (Class<?> cls3 : cls2.getInterfaces()) {
                try {
                    return cls.getMethod(str, cls3);
                } catch (NoSuchMethodException unused2) {
                }
            }
            try {
                return cls.getMethod(str, cls2);
            } catch (NoSuchMethodException unused3) {
                cls2 = cls2.getSuperclass();
            }
        } while (cls2 != null);
        this.dynamicUI.getLogger().e(LOG_TAG, "Never reach here");
        return null;
    }

    public Boolean containsInState(String str) {
        return Boolean.valueOf(this.state.containsKey(str));
    }

    public void convertAndStoreArray(ArrayList<?> arrayList, Class<?> cls, String str, boolean z) {
        int size = arrayList.size();
        if (z) {
            cls = PRIMITIVE_TYPES.get(cls);
        }
        if (cls != null) {
            Object objNewInstance = Array.newInstance(cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(objNewInstance, i, arrayList.get(i));
            }
            this.state.put(str, objNewInstance);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class<?> createPrimitiveClass(java.lang.String r2) {
        /*
            r1 = this;
            r2.hashCode()
            r2.hashCode()
            int r1 = r2.hashCode()
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto L77
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L6d
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 == r0) goto L63
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L59
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L4f
            r0 = 3159(0xc57, float:4.427E-42)
            if (r1 == r0) goto L44
            switch(r1) {
                case 98: goto L3a;
                case 99: goto L30;
                case 100: goto L26;
                default: goto L25;
            }
        L25:
            goto L81
        L26:
            java.lang.String r1 = "d"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 2
            goto L82
        L30:
            java.lang.String r1 = "c"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 1
            goto L82
        L3a:
            java.lang.String r1 = "b"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 0
            goto L82
        L44:
            java.lang.String r1 = "by"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 8
            goto L82
        L4f:
            java.lang.String r1 = "v"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 7
            goto L82
        L59:
            java.lang.String r1 = "s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 6
            goto L82
        L63:
            java.lang.String r1 = "l"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 5
            goto L82
        L6d:
            java.lang.String r1 = "i"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 4
            goto L82
        L77:
            java.lang.String r1 = "f"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L81
            r1 = 3
            goto L82
        L81:
            r1 = -1
        L82:
            switch(r1) {
                case 0: goto L9f;
                case 1: goto L9c;
                case 2: goto L99;
                case 3: goto L96;
                case 4: goto L93;
                case 5: goto L90;
                case 6: goto L8d;
                case 7: goto L8a;
                case 8: goto L87;
                default: goto L85;
            }
        L85:
            r1 = 0
            return r1
        L87:
            java.lang.Class r1 = java.lang.Byte.TYPE
            return r1
        L8a:
            java.lang.Class r1 = java.lang.Void.TYPE
            return r1
        L8d:
            java.lang.Class r1 = java.lang.Short.TYPE
            return r1
        L90:
            java.lang.Class r1 = java.lang.Long.TYPE
            return r1
        L93:
            java.lang.Class r1 = java.lang.Integer.TYPE
            return r1
        L96:
            java.lang.Class r1 = java.lang.Float.TYPE
            return r1
        L99:
            java.lang.Class r1 = java.lang.Double.TYPE
            return r1
        L9c:
            java.lang.Class r1 = java.lang.Character.TYPE
            return r1
        L9f:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.createPrimitiveClass(java.lang.String):java.lang.Class");
    }

    public void dismissPopUp() {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.InflateView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m308lambda$dismissPopUp$12$injuspayhypersdkcoreInflateView();
            }
        });
    }

    public int dpToPx(int i) {
        if (i > 0) {
            return Math.round(i * this.dynamicUI.getAppContext().getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    public Pair<String, ObjectAnimator> findAnimationById(String str) {
        String strConcat = "M_anim_".concat(String.valueOf(str));
        if (this.state.containsKey(strConcat)) {
            return (Pair) this.state.get(strConcat);
        }
        return null;
    }

    protected Method findMethodWithCmd(Cmd cmd) {
        Method methodTryMultiAgrumentDeepMatch;
        if (this.functionCache.containsKey(cmd)) {
            return this.functionCache.get(cmd);
        }
        try {
            methodTryMultiAgrumentDeepMatch = tryExactMatch(cmd.clazz, cmd.functionName, cmd.args);
        } catch (NoSuchMethodException unused) {
            methodTryMultiAgrumentDeepMatch = (cmd.args == null || cmd.args.length != 1) ? tryMultiAgrumentDeepMatch(cmd.clazz, cmd.functionName, cmd.args) : trySingleArgumentDeepMatch(cmd.clazz, cmd.functionName, cmd.args[0]);
        }
        this.functionCache.put(cmd, methodTryMultiAgrumentDeepMatch);
        return methodTryMultiAgrumentDeepMatch;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.Class<?> getClassName(java.lang.String r4) {
        /*
            r3 = this;
            r4.hashCode()
            r4.hashCode()
            int r3 = r4.hashCode()
            r0 = 3
            r1 = 2
            r2 = 1
            switch(r3) {
                case -1409106502: goto L2f;
                case -833865840: goto L25;
                case -631823565: goto L1b;
                case -407376626: goto L11;
                default: goto L10;
            }
        L10:
            goto L39
        L11:
            java.lang.String r3 = "in.juspay.mystique.AccordionLayout"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            r3 = r0
            goto L3a
        L1b:
            java.lang.String r3 = "in.juspay.mystique.SwypeScroll"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            r3 = r1
            goto L3a
        L25:
            java.lang.String r3 = "in.juspay.mystique.SwypeLayout"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            r3 = r2
            goto L3a
        L2f:
            java.lang.String r3 = "in.juspay.mystique.BottomSheetLayout"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            r3 = 0
            goto L3a
        L39:
            r3 = -1
        L3a:
            if (r3 == 0) goto L50
            if (r3 == r2) goto L4d
            if (r3 == r1) goto L4a
            if (r3 == r0) goto L47
            java.lang.Class r3 = java.lang.Class.forName(r4)
            return r3
        L47:
            java.lang.Class<in.juspay.hypersdk.mystique.AccordionLayout> r3 = in.juspay.hypersdk.mystique.AccordionLayout.class
            return r3
        L4a:
            java.lang.Class<in.juspay.hypersdk.mystique.SwypeScroll> r3 = in.juspay.hypersdk.mystique.SwypeScroll.class
            return r3
        L4d:
            java.lang.Class<in.juspay.hypersdk.mystique.SwypeLayout> r3 = in.juspay.hypersdk.mystique.SwypeLayout.class
            return r3
        L50:
            java.lang.Class<in.juspay.hypersdk.mystique.BottomSheetLayout> r3 = in.juspay.hypersdk.mystique.BottomSheetLayout.class
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.getClassName(java.lang.String):java.lang.Class");
    }

    public DynamicUI getDUI() {
        return this.dynamicUI;
    }

    public String getErrorDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.currViewId);
        sb.append(" - ");
        sb.append(this.currView);
        sb.append("-");
        sb.append(this.fileOrigin);
        sb.append(" - ");
        sb.append(this.lastCommand);
        return sb.toString();
    }

    public HashMap<String, Object> getState() {
        return this.state;
    }

    public <T> T getStateValFromKey(String str) {
        return (T) this.state.get(str);
    }

    public boolean getUseAppContext() {
        return this.useAppContext;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected <Any> Any getValueNew(java.lang.String r2, java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.getValueNew(java.lang.String, java.lang.String):java.lang.Object");
    }

    public void handleAnimation(Object obj, JSONArray jSONArray) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            JSONArray jSONArray2 = new JSONArray(jSONObject.getString("props"));
            String string = jSONObject.has("id") ? jSONObject.getString("id") : "";
            String string2 = jSONObject.has("onEnd") ? jSONObject.getString("onEnd") : "";
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[jSONArray2.length()];
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                propertyValuesHolderArr[i2] = PropertyValuesHolder.ofFloat(jSONObject2.getString("prop"), (float) jSONObject2.getDouble("from"), (float) jSONObject2.getDouble("to"));
            }
            final ObjectAnimator animator = getAnimator(obj, propertyValuesHolderArr, jSONObject);
            this.state.put("M_anim_".concat(String.valueOf(string)), new Pair(Integer.valueOf(((View) obj).getId()), animator));
            if (jSONObject.has("onEnd")) {
                final String strConcat = "M_anim_".concat(String.valueOf(string2));
                animator.addListener(new Animator.AnimatorListener() { // from class: in.juspay.hypersdk.core.InflateView.6
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        ObjectAnimator objectAnimator;
                        if (!InflateView.this.state.containsKey(strConcat) || (objectAnimator = (ObjectAnimator) ((Pair) InflateView.this.state.get(strConcat)).second) == null || objectAnimator == animator) {
                            return;
                        }
                        objectAnimator.start();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator2) {
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: lambda$dismissPopUp$12$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ void m308lambda$dismissPopUp$12$injuspayhypersdkcoreInflateView() {
        PopupMenu popupMenu = this.popUpMenu;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    /* JADX INFO: renamed from: lambda$parseKeys$2$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ boolean m309lambda$parseKeys$2$injuspayhypersdkcoreInflateView(String str, View view, int i, KeyEvent keyEvent) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("','");
        sb.append(i);
        sb.append("');");
        dynamicUI.addJsToWebView(sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: lambda$parseKeys$3$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ boolean m310lambda$parseKeys$3$injuspayhypersdkcoreInflateView(String str, View view) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("');");
        dynamicUI.addJsToWebView(sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: lambda$parseKeys$4$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ void m311lambda$parseKeys$4$injuspayhypersdkcoreInflateView(String str, View view) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("');");
        dynamicUI.addJsToWebView(sb.toString());
    }

    /* JADX INFO: renamed from: lambda$parseKeys$5$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ void m312lambda$parseKeys$5$injuspayhypersdkcoreInflateView(String str) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("');");
        dynamicUI.addJsToWebView(sb.toString());
    }

    /* JADX INFO: renamed from: lambda$parseKeys$6$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ void m313lambda$parseKeys$6$injuspayhypersdkcoreInflateView(String str, AdapterView adapterView, View view, int i, long j) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("',");
        sb.append(i);
        sb.append(");");
        dynamicUI.addJsToWebView(sb.toString());
    }

    /* JADX INFO: renamed from: lambda$parseKeys$7$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ void m314lambda$parseKeys$7$injuspayhypersdkcoreInflateView(String str, View view, boolean z) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("','");
        sb.append(z);
        sb.append("');");
        dynamicUI.addJsToWebView(sb.toString());
    }

    /* JADX INFO: renamed from: lambda$parseKeys$8$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ void m315lambda$parseKeys$8$injuspayhypersdkcoreInflateView(String str, CalendarView calendarView, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("','");
        sb.append(i);
        sb.append("','");
        sb.append(i2);
        sb.append("','");
        sb.append(i3);
        sb.append("');");
        this.dynamicUI.addJsToWebView(sb.toString());
    }

    /* JADX INFO: renamed from: lambda$parseKeys$9$in-juspay-hypersdk-core-InflateView, reason: not valid java name */
    /* synthetic */ boolean m316lambda$parseKeys$9$injuspayhypersdkcoreInflateView(String str, MenuItem menuItem) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("', '");
        sb.append(menuItem.getItemId());
        sb.append("');");
        dynamicUI.addJsToWebView(sb.toString());
        return true;
    }

    protected boolean matchTypes(Class<?>[] clsArr, Class<?>[] clsArr2) {
        Class<?> cls;
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr2[i] != null && (cls = clsArr[i]) != null && ((!cls.equals(Object.class) || clsArr2[i].isPrimitive()) && !clsArr[i].equals(clsArr2[i]))) {
                if (clsArr[i].isPrimitive() && !clsArr2[i].isArray()) {
                    try {
                        Class cls2 = (Class) clsArr2[i].getField("TYPE").get(null);
                        if (cls2 != null && !cls2.equals(clsArr[i])) {
                            return false;
                        }
                    } catch (NoSuchFieldException unused) {
                        return false;
                    } catch (Exception unused2) {
                        return true;
                    }
                } else if (clsArr[i].equals(ClassLoader.class)) {
                    if (clsArr2[i].getName().equals("dalvik.system.PathClassLoader")) {
                        return true;
                    }
                } else if (!clsArr[i].equals(clsArr2[i]) && !clsArr[i].isAssignableFrom(clsArr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public Object parseAndRunPipe(Object obj, String str, boolean z) throws IllegalAccessException, NoSuchFieldException, InvocationTargetException {
        Object objRunCommand = null;
        for (String str2 : COMMAND_SPLIT.split(str)) {
            if (!str2.equals("")) {
                if (indexOf(str2, SETTER_EQUALS, 0) != -1) {
                    String[] strArrSubstr = substr(str2, SETTER_EQUALS);
                    String str3 = substr(strArrSubstr[0], ARG_TYPE_SPLIT)[1];
                    Object objRunCommand2 = runCommand(obj, objRunCommand, strArrSubstr[1], z);
                    this.state.put(str3, objRunCommand2);
                    DuiLogger logger = this.dynamicUI.getLogger();
                    String str4 = LOG_TAG;
                    StringBuilder sb = new StringBuilder("setting ");
                    sb.append(str3);
                    sb.append(" to ");
                    sb.append(objRunCommand2);
                    logger.d(str4, sb.toString());
                } else {
                    objRunCommand = runCommand(obj, objRunCommand, str2, z);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0615  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseKeys(java.lang.String r27, org.json.JSONObject r28, java.lang.Object r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateView.parseKeys(java.lang.String, org.json.JSONObject, java.lang.Object, boolean):void");
    }

    public void putInState(String str, Object obj) {
        this.state.put(str, obj);
    }

    public void resetState() {
        this.state = new HashMap<>();
    }

    public void setCurrView(String str) {
        this.currView = str;
    }

    public void setCurrViewId(String str) {
        this.currViewId = str;
    }

    public void setFileOrigin(String str) {
        this.fileOrigin = str;
    }

    public void setUseAppContext(boolean z) {
        this.useAppContext = z;
    }

    private ObjectAnimator getAnimator(Object obj, PropertyValuesHolder[] propertyValuesHolderArr, JSONObject jSONObject) {
        boolean zHas = jSONObject.has("duration");
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = zHas ? (float) jSONObject.getDouble("duration") : 0.0f;
        if (jSONObject.has("delay")) {
            f = (float) jSONObject.getDouble("delay");
        }
        boolean z = false;
        int i = jSONObject.has("repeatCount") ? jSONObject.getInt("repeatCount") : 0;
        if (jSONObject.has("startImmediate") && jSONObject.getBoolean("startImmediate")) {
            z = true;
        }
        String string = jSONObject.has("easing") ? jSONObject.getString("easing") : "linear";
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValuesHolderArr);
        objectAnimatorOfPropertyValuesHolder.setDuration((long) f2);
        objectAnimatorOfPropertyValuesHolder.setStartDelay((long) f);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(i);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(getEasing(string));
        if (z) {
            objectAnimatorOfPropertyValuesHolder.start();
        }
        return objectAnimatorOfPropertyValuesHolder;
    }

    public float dpToPx(float f) {
        return f > BitmapDescriptorFactory.HUE_RED ? Math.round(f * this.dynamicUI.getAppContext().getResources().getDisplayMetrics().density) : BitmapDescriptorFactory.HUE_RED;
    }
}
