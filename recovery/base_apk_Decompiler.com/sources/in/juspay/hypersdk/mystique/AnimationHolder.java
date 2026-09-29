package in.juspay.hypersdk.mystique;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.hypersdk.core.DuiCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AnimationHolder {
    private static final String NAME = "name";
    private final WeakHashMap<View, HashMap<String, InlineAnimation>> animatorHashMap = new WeakHashMap<>();
    private final WeakHashMap<View, CallbackHolder> callbackHashMap = new WeakHashMap<>();
    private final float density;
    private final DuiCallback duiCallback;

    /* JADX INFO: loaded from: classes5.dex */
    class CallbackHolder {
        private static final String ON_ANIMATION_END = "onAnimationEnd";
        private static final String ON_ANIMATION_START = "onAnimationStart";
        private static final String ON_ANIMATION_UPDATE = "onAnimationUpdate";
        private String onEnd;
        private String onStart;
        private String onUpdate;

        CallbackHolder() {
        }

        public String getOnEnd() {
            return this.onEnd;
        }

        public String getOnStart() {
            return this.onStart;
        }

        public String getOnUpdate() {
            return this.onUpdate;
        }

        void updateCallbacks(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.onEnd = AnimationHolder.this.getString(jSONObject, ON_ANIMATION_END, this.onEnd);
            this.onStart = AnimationHolder.this.getString(jSONObject, ON_ANIMATION_START, this.onStart);
            this.onUpdate = AnimationHolder.this.getString(jSONObject, ON_ANIMATION_UPDATE, this.onUpdate);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class InlineAnimation {
        private static final String DELAY = "delay";
        private static final String DURATION = "duration";
        private static final String FROM_ALPHA = "fromAlpha";
        private static final String FROM_ROTATION = "fromRotation";
        private static final String FROM_ROTATION_X = "fromRotationX";
        private static final String FROM_ROTATION_Y = "fromRotationY";
        private static final String FROM_SCALE_X = "fromScaleX";
        private static final String FROM_SCALE_Y = "fromScaleY";
        private static final String FROM_X = "fromX";
        private static final String FROM_Y = "fromY";
        private static final String INTERPOLATOR = "interpolator";
        private static final String REPEAT_COUNT = "repeatCount";
        private static final String REPEAT_MODE = "repeatMode";
        private static final String TAG = "tag";
        private static final String TO_ALPHA = "toAlpha";
        private static final String TO_ROTATION = "toRotation";
        private static final String TO_ROTATION_X = "toRotationX";
        private static final String TO_ROTATION_Y = "toRotationY";
        private static final String TO_SCALE_X = "toScaleX";
        private static final String TO_SCALE_Y = "toScaleY";
        private static final String TO_X = "toX";
        private static final String TO_Y = "toY";
        private ObjectAnimator animator;
        private ArrayList<PropertyValuesHolder> holders = new ArrayList<>();
        private JSONObject newProperties;
        private JSONObject properties;
        private final WeakReference<View> viewRef;

        public InlineAnimation(JSONObject jSONObject, View view) {
            this.viewRef = new WeakReference<>(view);
            this.properties = jSONObject;
        }

        private void createAnimator() {
            if (this.viewRef.get() == null) {
                return;
            }
            View view = this.viewRef.get();
            this.holders = new ArrayList<>();
            ObjectAnimator objectAnimator = new ObjectAnimator();
            this.animator = objectAnimator;
            objectAnimator.setTarget(view);
            this.animator.setInterpolator(getInterpolator());
            this.animator.setDuration((int) AnimationHolder.this.getFloat(this.properties, DURATION, BitmapDescriptorFactory.HUE_RED, 1.0f));
            this.animator.setStartDelay((int) AnimationHolder.this.getFloat(this.properties, DELAY, BitmapDescriptorFactory.HUE_RED, 1.0f));
            this.animator.setRepeatCount((int) AnimationHolder.this.getFloat(this.properties, REPEAT_COUNT, BitmapDescriptorFactory.HUE_RED, 1.0f));
            if (this.properties.has(REPEAT_MODE)) {
                this.animator.setRepeatMode("reverse".equals(AnimationHolder.this.getString(this.properties, REPEAT_MODE, null)) ? 2 : 1);
            }
            createPropertyHolder(View.ALPHA, view.getAlpha(), FROM_ALPHA, TO_ALPHA);
            createPropertyHolder(View.ROTATION, view.getRotation(), FROM_ROTATION, TO_ROTATION);
            createPropertyHolder(View.ROTATION_X, view.getRotationX(), FROM_ROTATION_X, TO_ROTATION_X);
            createPropertyHolder(View.ROTATION_Y, view.getRotationY(), FROM_ROTATION_Y, TO_ROTATION_Y);
            createPropertyHolder(View.SCALE_X, view.getScaleX(), FROM_SCALE_X, TO_SCALE_X);
            createPropertyHolder(View.SCALE_Y, view.getScaleY(), FROM_SCALE_Y, TO_SCALE_Y);
            createPropertyHolder(View.TRANSLATION_X, view.getTranslationX(), FROM_X, TO_X);
            createPropertyHolder(View.TRANSLATION_Y, view.getTranslationY(), FROM_Y, TO_Y);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.holders.size()];
            for (int i = 0; i < this.holders.size(); i++) {
                propertyValuesHolderArr[i] = this.holders.get(i);
            }
            this.animator.setValues(propertyValuesHolderArr);
        }

        private void createPropertyHolder(Property<View, Float> property, float f, String... strArr) {
            if (AnimationHolder.this.hasOneKeyAtleast(this.properties, strArr)) {
                float f2 = (property == View.TRANSLATION_Y || property == View.TRANSLATION_X) ? AnimationHolder.this.density : 1.0f;
                float[] fArr = new float[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    fArr[i] = AnimationHolder.this.getFloat(this.properties, strArr[i], f, f2);
                }
                this.holders.add(PropertyValuesHolder.ofFloat(property, fArr));
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private android.view.animation.Interpolator getInterpolator() {
            /*
                r7 = this;
                in.juspay.hypersdk.mystique.AnimationHolder r0 = in.juspay.hypersdk.mystique.AnimationHolder.this
                org.json.JSONObject r7 = r7.properties
                java.lang.String r1 = "interpolator"
                java.lang.String r2 = "linear"
                java.lang.String r7 = in.juspay.hypersdk.mystique.AnimationHolder.access$000(r0, r7, r1, r2)
                r7.hashCode()
                r7.hashCode()
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                switch(r0) {
                    case -1965056864: goto L3c;
                    case -1383205240: goto L32;
                    case -1310315117: goto L28;
                    case 1360213211: goto L1e;
                    default: goto L1d;
                }
            L1d:
                goto L46
            L1e:
                java.lang.String r0 = "easeinout"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L46
                r0 = r2
                goto L47
            L28:
                java.lang.String r0 = "easein"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L46
                r0 = r3
                goto L47
            L32:
                java.lang.String r0 = "bounce"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L46
                r0 = r4
                goto L47
            L3c:
                java.lang.String r0 = "easeout"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L46
                r0 = r1
                goto L47
            L46:
                r0 = -1
            L47:
                if (r0 == 0) goto L96
                if (r0 == r4) goto L90
                if (r0 == r3) goto L8a
                if (r0 == r2) goto L84
                java.lang.String r0 = ","
                boolean r5 = r7.contains(r0)
                if (r5 == 0) goto L7e
                java.lang.String[] r7 = r7.split(r0)
                r0 = 4
                float[] r0 = new float[r0]
                r0 = {x00ae: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
                r5 = r1
            L62:
                int r6 = r7.length
                if (r5 >= r6) goto L70
                r6 = r7[r5]
                float r6 = java.lang.Float.parseFloat(r6)
                r0[r5] = r6
                int r5 = r5 + 1
                goto L62
            L70:
                android.view.animation.PathInterpolator r7 = new android.view.animation.PathInterpolator
                r1 = r0[r1]
                r4 = r0[r4]
                r3 = r0[r3]
                r0 = r0[r2]
                r7.<init>(r1, r4, r3, r0)
                return r7
            L7e:
                android.view.animation.LinearInterpolator r7 = new android.view.animation.LinearInterpolator
                r7.<init>()
                return r7
            L84:
                android.view.animation.AccelerateDecelerateInterpolator r7 = new android.view.animation.AccelerateDecelerateInterpolator
                r7.<init>()
                return r7
            L8a:
                android.view.animation.AccelerateInterpolator r7 = new android.view.animation.AccelerateInterpolator
                r7.<init>()
                return r7
            L90:
                android.view.animation.BounceInterpolator r7 = new android.view.animation.BounceInterpolator
                r7.<init>()
                return r7
            L96:
                android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
                r7.<init>()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.mystique.AnimationHolder.InlineAnimation.getInterpolator():android.view.animation.Interpolator");
        }

        private boolean isSame(JSONObject jSONObject) {
            ArrayList jSONKeys = AnimationHolder.this.getJSONKeys(this.properties);
            for (String str : AnimationHolder.this.getJSONKeys(jSONObject)) {
                if (!jSONKeys.contains(str) || !AnimationHolder.this.getString(this.properties, str, "").equals(AnimationHolder.this.getString(jSONObject, str, null))) {
                    return false;
                }
                jSONKeys.remove(str);
            }
            return jSONKeys.size() == 0;
        }

        private void resetAnimation() {
            resetProperty(View.ALPHA, 1.0f, FROM_ALPHA, TO_ALPHA);
            resetProperty(View.ROTATION, BitmapDescriptorFactory.HUE_RED, FROM_ROTATION, TO_ROTATION);
            resetProperty(View.ROTATION_X, BitmapDescriptorFactory.HUE_RED, FROM_ROTATION_X, TO_ROTATION_X);
            resetProperty(View.ROTATION_Y, BitmapDescriptorFactory.HUE_RED, FROM_ROTATION_Y, TO_ROTATION_Y);
            resetProperty(View.SCALE_X, 1.0f, FROM_SCALE_X, TO_SCALE_X);
            resetProperty(View.SCALE_Y, 1.0f, FROM_SCALE_Y, TO_SCALE_Y);
            resetProperty(View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED, FROM_X, TO_X);
            resetProperty(View.TRANSLATION_Y, BitmapDescriptorFactory.HUE_RED, FROM_Y, TO_Y);
        }

        private void resetProperty(Property<View, Float> property, float f, String... strArr) {
            if (AnimationHolder.this.hasOneKeyAtleast(this.properties, strArr)) {
                JSONObject jSONObject = this.newProperties;
                if (jSONObject == null || !AnimationHolder.this.hasOneKeyAtleast(jSONObject, strArr)) {
                    property.set(this.viewRef.get(), Float.valueOf(f));
                }
            }
        }

        private void setEventListeners() {
            final CallbackHolder callbackHolder;
            if (AnimationHolder.this.duiCallback == null || (callbackHolder = (CallbackHolder) AnimationHolder.this.callbackHashMap.get(this.viewRef.get())) == null) {
                return;
            }
            if (callbackHolder.getOnEnd() == null && callbackHolder.getOnStart() == null) {
                return;
            }
            this.animator.addListener(new Animator.AnimatorListener() { // from class: in.juspay.hypersdk.mystique.AnimationHolder.InlineAnimation.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (callbackHolder.getOnEnd() != null) {
                        DuiCallback duiCallback = AnimationHolder.this.duiCallback;
                        StringBuilder sb = new StringBuilder("window.callUICallback('");
                        sb.append(callbackHolder.getOnEnd());
                        sb.append("','");
                        sb.append(InlineAnimation.this.getTag());
                        sb.append("');");
                        duiCallback.addJsToWebView(sb.toString());
                    }
                    animator.removeListener(this);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    if (callbackHolder.getOnStart() != null) {
                        DuiCallback duiCallback = AnimationHolder.this.duiCallback;
                        StringBuilder sb = new StringBuilder("window.callUICallback('");
                        sb.append(callbackHolder.getOnStart());
                        sb.append("','");
                        sb.append(InlineAnimation.this.getTag());
                        sb.append("');");
                        duiCallback.addJsToWebView(sb.toString());
                    }
                }
            });
        }

        public String getName() {
            return AnimationHolder.this.getString(this.properties, "name", "");
        }

        public String getTag() {
            return AnimationHolder.this.getString(this.properties, TAG, "untagged");
        }

        public void remove() {
            stop();
            resetAnimation();
        }

        public void start() {
            createAnimator();
            setEventListeners();
            this.animator.start();
        }

        public void stop() {
            if (this.animator.isRunning()) {
                this.animator.cancel();
            }
        }

        public void update(JSONObject jSONObject, Boolean bool) {
            if (bool.booleanValue() || !isSame(jSONObject)) {
                stop();
                this.newProperties = jSONObject;
                resetAnimation();
                this.newProperties = null;
                this.properties = jSONObject;
                start();
            }
        }
    }

    public AnimationHolder(DuiCallback duiCallback, float f) {
        this.density = f;
        this.duiCallback = duiCallback;
    }

    private void assertView(Object obj) {
        if (!(obj instanceof View)) {
            throw new Error("Instance object is not a view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFloat(JSONObject jSONObject, String str, float f, float f2) {
        try {
            return (float) (((double) f2) * jSONObject.getDouble(str));
        } catch (JSONException unused) {
            return f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<String> getJSONKeys(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        ArrayList<String> arrayList = new ArrayList<>();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        return arrayList;
    }

    private JSONObject getJSONObject(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getString(JSONObject jSONObject, String str, String str2) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasOneKeyAtleast(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                return true;
            }
        }
        return false;
    }

    private void setupAnimation(View view, JSONArray jSONArray, Boolean bool) {
        InlineAnimation inlineAnimation;
        HashMap<String, InlineAnimation> map = this.animatorHashMap.get(view);
        if (map == null) {
            map = new HashMap<>();
            this.animatorHashMap.put(view, map);
        }
        HashMap map2 = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = getJSONObject(jSONArray, i);
            if (jSONObject != null) {
                String string = getString(jSONObject, "name", "");
                if (!map.containsKey(string) || (inlineAnimation = map.get(string)) == null) {
                    startNewAnimation(view, jSONObject, map, string);
                } else {
                    inlineAnimation.update(jSONObject, bool);
                }
                map2.put(string, Boolean.TRUE);
            }
        }
        for (String str : new ArrayList(map.keySet())) {
            if (!map2.containsKey(str)) {
                InlineAnimation inlineAnimation2 = map.get(str);
                if (inlineAnimation2 != null) {
                    inlineAnimation2.remove();
                }
                map.remove(str);
            }
        }
    }

    private void startNewAnimation(View view, JSONObject jSONObject, HashMap<String, InlineAnimation> map, String str) {
        InlineAnimation inlineAnimation = new InlineAnimation(jSONObject, view);
        inlineAnimation.start();
        map.put(str, inlineAnimation);
    }

    private Boolean toResetAnimation(JSONObject jSONObject) {
        if (!jSONObject.has("resetAnimation")) {
            return Boolean.FALSE;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean("resetAnimation"));
        } catch (JSONException unused) {
            return Boolean.FALSE;
        }
    }

    private void updateViewCallbacks(View view, JSONObject jSONObject) {
        CallbackHolder callbackHolder = this.callbackHashMap.get(view);
        if (callbackHolder == null) {
            callbackHolder = new CallbackHolder();
        }
        callbackHolder.updateCallbacks(jSONObject);
        this.callbackHashMap.put(view, callbackHolder);
    }

    public void applyAnimation(Object obj, JSONArray jSONArray, JSONObject jSONObject) {
        if (obj instanceof View) {
            assertView(obj);
            View view = (View) obj;
            updateViewCallbacks(view, jSONObject);
            setupAnimation(view, jSONArray, toResetAnimation(jSONObject));
        }
    }
}
