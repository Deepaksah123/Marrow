package in.juspay.hypersdk.core;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.mystique.Callback;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.InvalidTypeIdException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidInterface {
    private final DynamicUI dynamicUI;
    private String state;
    private final Map<String, PendingAddScreenMapItem> pendingAddScreenMap = new HashMap();
    private final Set<String> onGoingPrepareScreenSet = new HashSet();

    /* JADX INFO: loaded from: classes5.dex */
    static final class PendingAddScreenMapItem {
        String callbackName;
        int index;
        String parentId;
        boolean replaceChild;
        String runInUIprop;
        String screenName;

        PendingAddScreenMapItem(String str, String str2, int i, String str3, boolean z, String str4) {
            this.parentId = str;
            this.screenName = str2;
            this.index = i;
            this.callbackName = str3;
            this.replaceChild = z;
            this.runInUIprop = str4;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class PreRenderThread extends Thread {
        public PreRenderThread(Runnable runnable) {
            super(runnable);
            setName("PreRenderThread");
        }
    }

    AndroidInterface(DynamicUI dynamicUI) {
        this.dynamicUI = dynamicUI;
    }

    private int findChildIndex(int i, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (viewGroup.getChildAt(i2).getId() == i) {
                return i2;
            }
        }
        return -1;
    }

    private String getJSONResult(String str) {
        JSONArray jSONArray = new JSONArray(str);
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(this.dynamicUI.getActivity() == null);
        Object objRunJSON = inflateJSON.runJSON(null, jSONArray, inflateJSON.getUseAppContext(), null);
        return objRunJSON != null ? objRunJSON.toString() : "_null_";
    }

    private boolean replaceViewImpl(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view2.getParent();
        int iFindChildIndex = findChildIndex(view2.getId(), viewGroup);
        if (iFindChildIndex == -1) {
            return false;
        }
        viewGroup.removeViewAt(iFindChildIndex);
        viewGroup.addView(view, iFindChildIndex);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runJSONWithCallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m285lambda$runCmdsInUI$10$injuspayhypersdkcoreAndroidInterface(String str, String str2) {
        try {
            String jSONResult = getJSONResult(str);
            if (str2 != null) {
                this.dynamicUI.addJsToWebView(String.format("window.callUICallback('%s',%s);", str2, this.dynamicUI.encodeUtfAndWrapDecode(jSONResult, "ERROR")));
            }
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb = new StringBuilder(" excep: fn__runInUIJSON  - ");
            sb.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb2 = new StringBuilder(" excep: fn__runInUIJSON  - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onException("ERROR", sb2.toString(), e);
            if (str2 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb3 = new StringBuilder("window.callUICallbackJSON(");
                sb3.append(str2);
                sb3.append(",'failure');");
                dynamicUI.addJsToWebView(sb3.toString());
            }
        }
    }

    @JavascriptInterface
    public final void addStoredViewToParent(String str, String str2, int i, String str3, boolean z, String str4) {
        addStoredViewToParent(str, str2, i, str3, z, str4, null);
    }

    @JavascriptInterface
    public final String addToContainerList(int i, String str) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        return (container == null || !(container.findViewById(i) instanceof ViewGroup)) ? "__failed" : this.dynamicUI.addToContainerList((ViewGroup) container.findViewById(i));
    }

    @JavascriptInterface
    public final void addViewToParent(String str, String str2, int i, String str3, boolean z) {
        addViewToParent(str, str2, i, str3, z, null);
    }

    @JavascriptInterface
    public final void cancelAnim(final String str, final String str2) {
        final ObjectAnimator objectAnimator = (ObjectAnimator) ((Pair) this.dynamicUI.getRenderer().getInflateView().getStateValFromKey("M_anim_".concat(String.valueOf(str)))).second;
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m275lambda$cancelAnim$18$injuspayhypersdkcoreAndroidInterface(objectAnimator, str2, str);
            }
        });
    }

    @JavascriptInterface
    public final void dismissPopUp() {
        this.dynamicUI.getRenderer().dismissPopUp();
    }

    @JavascriptInterface
    public final int dpToPx(int i) {
        if (i > 0) {
            return Math.round(i * this.dynamicUI.getAppContext().getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    @JavascriptInterface
    public final String fetchData(String str) {
        return this.dynamicUI.getAppContext().getSharedPreferences("DUI", 0).getString(str, "null");
    }

    @JavascriptInterface
    public final void generateUIElement(String str, int i, String[] strArr, String str2) {
        generateUIElement(str, i, strArr, str2, null);
    }

    @JavascriptInterface
    public final String getInternalStorageBaseFilePath() {
        return this.dynamicUI.getAppContext().getDir("juspay", 0).getAbsolutePath();
    }

    @JavascriptInterface
    public final String getNewID() {
        return String.valueOf(InvalidTypeIdException.read());
    }

    public final Renderer getRenderer() {
        return this.dynamicUI.getRenderer();
    }

    @JavascriptInterface
    public final String getScreenDimensions() {
        int iHeight;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        Rect rect = new Rect();
        try {
            if (this.dynamicUI.getActivity() != null) {
                this.dynamicUI.getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                this.dynamicUI.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                if (Build.VERSION.SDK_INT >= 30) {
                    iHeight = this.dynamicUI.getActivity().getWindowManager().getCurrentWindowMetrics().getBounds().height();
                } else {
                    this.dynamicUI.getActivity().getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics2);
                    iHeight = displayMetrics2.heightPixels;
                }
            } else {
                displayMetrics = Resources.getSystem().getDisplayMetrics();
                iHeight = 0;
            }
            jSONObject.put("width", displayMetrics.widthPixels);
            jSONObject.put("height", displayMetrics.heightPixels);
            jSONObject.put("screenHeight", iHeight);
            jSONObject2.put("top", rect.top);
            jSONObject2.put("bottom", rect.bottom);
            jSONObject2.put(TtmlNode.LEFT, rect.left);
            jSONObject2.put(TtmlNode.RIGHT, rect.right);
            jSONObject.put("viewportDimensions", jSONObject2);
        } catch (JSONException e) {
            this.dynamicUI.getLogger().e("JSON_EXCEPTION", e.toString());
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final String getState() {
        String str = this.state;
        return str != null ? str : "{}";
    }

    @JavascriptInterface
    public final boolean isFilePresent(String str) {
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: lambda$addStoredViewToParent$3$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m273lambda$addStoredViewToParent$3$injuspayhypersdkcoreAndroidInterface(String str, String str2, int i, String str3, boolean z, String str4, String str5) {
        try {
            if (this.onGoingPrepareScreenSet.contains(str)) {
                this.pendingAddScreenMap.put(str, new PendingAddScreenMapItem(str2, str, i, str3, z, str4));
                return;
            }
            this.dynamicUI.getRenderer().addStoredViewToParent(str2, str, i, z, str5);
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            inflateJSON.setUseAppContext(true);
            this.dynamicUI.getRenderer().parseAndRunPipe(this.dynamicUI.getAppContext(), str4, "", "", inflateJSON.getUseAppContext());
            if (str3 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback('");
                sb.append(str3);
                sb.append("','success');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb2 = new StringBuilder(" excep: fn__addStoredViewToParent  - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb2.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb3 = new StringBuilder(" excep: fn__addStoredViewToParent  - ");
            sb3.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onException("ERROR", sb3.toString(), e);
        }
    }

    /* JADX INFO: renamed from: lambda$addViewToParent$1$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m274lambda$addViewToParent$1$injuspayhypersdkcoreAndroidInterface(String str, JSONObject jSONObject, int i, boolean z, String str2, String str3) {
        try {
            this.dynamicUI.getRenderer().addViewToParent(str, jSONObject, i, z, str2);
            if (str3 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback('");
                sb.append(str3);
                sb.append("','success');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb2 = new StringBuilder(" excep: fn__addViewToParent  - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb2.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb3 = new StringBuilder(" excep: fn__addViewToParent  - ");
            sb3.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onException("ERROR", sb3.toString(), e);
            if (str3 != null) {
                DynamicUI dynamicUI2 = this.dynamicUI;
                StringBuilder sb4 = new StringBuilder("window.callUICallback('");
                sb4.append(str3);
                sb4.append("','failure');");
                dynamicUI2.addJsToWebView(sb4.toString());
            }
        }
    }

    /* JADX INFO: renamed from: lambda$cancelAnim$18$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m275lambda$cancelAnim$18$injuspayhypersdkcoreAndroidInterface(ObjectAnimator objectAnimator, String str, String str2) {
        try {
            objectAnimator.cancel();
            float fFloatValue = ((Float) objectAnimator.getAnimatedValue()).floatValue();
            DynamicUI dynamicUI = this.dynamicUI;
            StringBuilder sb = new StringBuilder("window.callUICallback('");
            sb.append(str);
            sb.append("', '");
            sb.append(fFloatValue);
            sb.append("');");
            dynamicUI.addJsToWebView(sb.toString());
        } catch (Exception unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "Error parsing json for animation with id ".concat(String.valueOf(str2)));
        }
    }

    /* JADX INFO: renamed from: lambda$generateUIElement$15$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m277lambda$generateUIElement$15$injuspayhypersdkcoreAndroidInterface(String str, String str2, int i, final String[] strArr, final String str3) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        if (container == null) {
            this.dynamicUI.getLogger().e("missing_container", "render, no container");
        } else if (str2.equals("PopupMenu")) {
            container.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m276lambda$generateUIElement$14$injuspayhypersdkcoreAndroidInterface(strArr, str3, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$moveView$5$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m278lambda$moveView$5$injuspayhypersdkcoreAndroidInterface(String str, String str2, String str3) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container == null) {
                this.dynamicUI.getLogger().e("missing_container", "moveView, no container");
                return;
            }
            View viewFindViewById = container.findViewById(Integer.parseInt(str2));
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(viewFindViewById, Integer.parseInt(str3));
        } catch (Exception unused) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb = new StringBuilder(" fn__moveView - ");
            sb.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb.toString());
        }
    }

    /* JADX INFO: renamed from: lambda$prepareAndStoreView$2$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m279lambda$prepareAndStoreView$2$injuspayhypersdkcoreAndroidInterface(String str, JSONObject jSONObject, String str2) {
        try {
            setPrepareScreenTaskStatus(str, true);
            this.dynamicUI.getRenderer().prepareAndStoreView(str, jSONObject);
            if (str2 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback('");
                sb.append(str2);
                sb.append("','success');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb2 = new StringBuilder(" excep: fn__prepareAndStoreView  - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb2.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb3 = new StringBuilder(" excep: fn__prepareAndStoreView  - ");
            sb3.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onException("ERROR", sb3.toString(), e);
            if (str2 != null) {
                DynamicUI dynamicUI2 = this.dynamicUI;
                StringBuilder sb4 = new StringBuilder("window.callUICallback('");
                sb4.append(str2);
                sb4.append("','failure');");
                dynamicUI2.addJsToWebView(sb4.toString());
            }
        }
        setPrepareScreenTaskStatus(str, false);
        processPendingAddScreen(str);
    }

    /* JADX INFO: renamed from: lambda$processPendingAddScreen$21$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m280lambda$processPendingAddScreen$21$injuspayhypersdkcoreAndroidInterface(String str) {
        PendingAddScreenMapItem pendingAddScreenMapItem = this.pendingAddScreenMap.get(str);
        if (pendingAddScreenMapItem != null) {
            this.pendingAddScreenMap.remove(str);
            addStoredViewToParent(pendingAddScreenMapItem.parentId, pendingAddScreenMapItem.screenName, pendingAddScreenMapItem.index, pendingAddScreenMapItem.callbackName, pendingAddScreenMapItem.replaceChild, pendingAddScreenMapItem.runInUIprop, null);
        }
    }

    /* JADX INFO: renamed from: lambda$removeView$6$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m281lambda$removeView$6$injuspayhypersdkcoreAndroidInterface(String str, int i) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        if (container == null) {
            this.dynamicUI.getLogger().e("missing_container", "removeView, no container");
            return;
        }
        View viewFindViewById = container.findViewById(i);
        if (viewFindViewById == null) {
            return;
        }
        ((ViewGroup) viewFindViewById.getParent()).removeView(viewFindViewById);
    }

    /* JADX INFO: renamed from: lambda$render$0$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m282lambda$render$0$injuspayhypersdkcoreAndroidInterface(JSONObject jSONObject, String str, String str2, String str3) {
        try {
            this.dynamicUI.getRenderer().renderUI(jSONObject, this.dynamicUI.getContainer(str), Boolean.parseBoolean(str2), str);
            if (str3 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback(");
                sb.append(str3);
                sb.append(",'success');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb2 = new StringBuilder(" excep: fn__Render  - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb2.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb3 = new StringBuilder(" excep: fn__Render  - ");
            sb3.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onException("ERROR", sb3.toString(), e);
            if (str3 != null) {
                DynamicUI dynamicUI2 = this.dynamicUI;
                StringBuilder sb4 = new StringBuilder("window.callUICallback(");
                sb4.append(str3);
                sb4.append(",'failure');");
                dynamicUI2.addJsToWebView(sb4.toString());
            }
        }
    }

    /* JADX INFO: renamed from: lambda$replaceView$4$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m283lambda$replaceView$4$injuspayhypersdkcoreAndroidInterface(String str, JSONObject jSONObject, int i) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container == null) {
                this.dynamicUI.getLogger().e("missing_container", "replaceView, no container");
                return;
            }
            View viewCreateView = this.dynamicUI.getRenderer().createView(jSONObject);
            View viewFindViewById = container.findViewById(i);
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    int childCount = ((ViewGroup) viewFindViewById).getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = ((ViewGroup) viewFindViewById).getChildAt(0);
                        if (childAt != null) {
                            ((ViewGroup) viewFindViewById).removeViewAt(0);
                            ((ViewGroup) viewCreateView).addView(childAt, i2);
                        }
                    }
                }
                if (replaceViewImpl(viewCreateView, viewFindViewById)) {
                    viewCreateView.requestLayout();
                }
            }
        } catch (JSONException unused) {
        } catch (Exception e) {
            this.dynamicUI.getLogger().e(e.getLocalizedMessage(), "excep: fn__replaceView - Error while replaceView ".concat(String.valueOf(e)));
        }
    }

    /* JADX INFO: renamed from: lambda$runInUI$7$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m286lambda$runInUI$7$injuspayhypersdkcoreAndroidInterface(String str, String str2, String str3, String str4) {
        try {
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            if (this.dynamicUI.getActivity() != null) {
                inflateJSON.setUseAppContext(false);
                this.dynamicUI.getRenderer().parseAndRunPipe(this.dynamicUI.getActivity(), str, str2, str3, inflateJSON.getUseAppContext());
            } else {
                inflateJSON.setUseAppContext(true);
                this.dynamicUI.getRenderer().parseAndRunPipe(this.dynamicUI.getAppContext(), str, str2, str3, inflateJSON.getUseAppContext());
            }
            if (str4 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback(");
                sb.append(str4);
                sb.append(",'success');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb2 = new StringBuilder(" excep: fn__runInUI  - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb2.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb3 = new StringBuilder(" excep: fn__runInUI  - ");
            sb3.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onException("ERROR", sb3.toString(), e);
            if (str4 != null) {
                DynamicUI dynamicUI2 = this.dynamicUI;
                StringBuilder sb4 = new StringBuilder("window.callUICallback(");
                sb4.append(str4);
                sb4.append(",'failure');");
                dynamicUI2.addJsToWebView(sb4.toString());
            }
        }
    }

    /* JADX INFO: renamed from: lambda$runInUI$8$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m287lambda$runInUI$8$injuspayhypersdkcoreAndroidInterface(String str, String str2) {
        try {
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            if (this.dynamicUI.getActivity() != null) {
                inflateJSON.setUseAppContext(false);
                this.dynamicUI.getRenderer().parseAndRunPipe(this.dynamicUI.getActivity(), str, "", "", inflateJSON.getUseAppContext());
            } else {
                inflateJSON.setUseAppContext(true);
                this.dynamicUI.getRenderer().parseAndRunPipe(this.dynamicUI.getAppContext(), str, "", "", inflateJSON.getUseAppContext());
            }
            if (str2 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback(");
                sb.append(str2);
                sb.append(",'success');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        } catch (Exception e) {
            String name = e.getClass().getName();
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb2 = new StringBuilder(" excep: fn__runInUI  - ");
            sb2.append(name);
            sb2.append(" - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb2.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb3 = new StringBuilder(" excep: fn__runInUI  - ");
            sb3.append(name);
            sb3.append(" - ");
            sb3.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onError("ERROR", sb3.toString());
            if (str2 != null) {
                DynamicUI dynamicUI2 = this.dynamicUI;
                StringBuilder sb4 = new StringBuilder("window.callUICallback(");
                sb4.append(str2);
                sb4.append(",'failure');");
                dynamicUI2.addJsToWebView(sb4.toString());
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setImage$12$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m288lambda$setImage$12$injuspayhypersdkcoreAndroidInterface(String str, int i, String str2) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container == null) {
                this.dynamicUI.getLogger().e("missing_container", "setImage, no container");
                return;
            }
            ImageView imageView = (ImageView) container.findViewById(i);
            byte[] bArrDecode = Base64.decode(str2, 0);
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb = new StringBuilder(" excep: fn__setImage  - ");
            sb.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb2 = new StringBuilder(" excep: fn__setImage  - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onException("ERROR", sb2.toString(), e);
        }
    }

    /* JADX INFO: renamed from: lambda$setPrepareScreenTaskStatus$20$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m289lambda$setPrepareScreenTaskStatus$20$injuspayhypersdkcoreAndroidInterface(boolean z, String str) {
        if (z) {
            this.onGoingPrepareScreenSet.add(str);
        } else {
            this.onGoingPrepareScreenSet.remove(str);
        }
    }

    /* JADX INFO: renamed from: lambda$showPopup$16$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ boolean m290lambda$showPopup$16$injuspayhypersdkcoreAndroidInterface(String str, MenuItem menuItem) {
        DynamicUI dynamicUI = this.dynamicUI;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(str);
        sb.append("', '");
        sb.append(menuItem.getItemId());
        sb.append("');");
        dynamicUI.addJsToWebView(sb.toString());
        Activity activity = this.dynamicUI.getActivity();
        StringBuilder sb2 = new StringBuilder("You Clicked : ");
        sb2.append((Object) menuItem.getTitle());
        Toast.makeText(activity, sb2.toString(), 0).show();
        return true;
    }

    /* JADX INFO: renamed from: lambda$startAnim$17$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m291lambda$startAnim$17$injuspayhypersdkcoreAndroidInterface(Pair pair, final String str, final String str2) {
        if (pair != null) {
            try {
                Object obj = pair.second;
                if (obj != null) {
                    ((ObjectAnimator) obj).start();
                    ((ObjectAnimator) pair.second).addListener(new Animator.AnimatorListener() { // from class: in.juspay.hypersdk.core.AndroidInterface.1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            String str3 = str;
                            if (str3 == null || str3.isEmpty()) {
                                return;
                            }
                            DynamicUI dynamicUI = AndroidInterface.this.dynamicUI;
                            StringBuilder sb = new StringBuilder("window.callUICallback('");
                            sb.append(str);
                            sb.append("', '");
                            sb.append(str2);
                            sb.append("');");
                            dynamicUI.addJsToWebView(sb.toString());
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                }
            } catch (Exception unused) {
                this.dynamicUI.getLogger().e("JSONERROR", "Error parsing json for animation with id ".concat(String.valueOf(str2)));
            }
        }
    }

    /* JADX INFO: renamed from: lambda$toggleKeyboard$13$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m292lambda$toggleKeyboard$13$injuspayhypersdkcoreAndroidInterface(String str, int i, String str2) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        if (container == null) {
            this.dynamicUI.getLogger().e("missing_container", "removeView, no container");
            return;
        }
        View viewFindViewById = container.findViewById(i);
        InputMethodManager inputMethodManager = (InputMethodManager) this.dynamicUI.getActivity().getSystemService("input_method");
        if (str2.equals("show")) {
            inputMethodManager.showSoftInput(viewFindViewById, 1);
        } else {
            inputMethodManager.hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: lambda$updateAnim$19$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m293lambda$updateAnim$19$injuspayhypersdkcoreAndroidInterface(String str, int i, JSONArray jSONArray) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container == null) {
                this.dynamicUI.getLogger().e("missing_container", "updateAnim, no container");
            } else {
                this.dynamicUI.getRenderer().getInflateView().handleAnimation(container.findViewById(i), jSONArray);
            }
        } catch (Exception unused) {
            this.dynamicUI.getLogger().e("ERROR", "updateAnim: View doesn't exist for id -".concat(String.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: lambda$updateProperties$11$in-juspay-hypersdk-core-AndroidInterface, reason: not valid java name */
    final /* synthetic */ void m294lambda$updateProperties$11$injuspayhypersdkcoreAndroidInterface(String str, String str2) {
        try {
            ViewGroup container = this.dynamicUI.getContainer(str);
            if (container == null) {
                this.dynamicUI.getLogger().e("missing_container", "updateProperties, no container");
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            View viewFindViewById = container.findViewById(jSONObject.getInt("id"));
            jSONObject.remove("id");
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            inflateJSON.setUseAppContext(true);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                this.dynamicUI.getRenderer().getInflateView().parseKeys(itKeys.next(), jSONObject, viewFindViewById, inflateJSON.getUseAppContext());
            }
        } catch (Exception e) {
            this.dynamicUI.getLogger().e(e.getLocalizedMessage(), "excep: fn__updateProperties- Error while updateProperties ".concat(String.valueOf(e)));
        }
    }

    @JavascriptInterface
    public final void moveView(String str, String str2) {
        moveView(str, str2, null);
    }

    @JavascriptInterface
    public final void prepareAndStoreView(final String str, String str2, final String str3) {
        try {
            final JSONObject jSONObject = new JSONObject(str2);
            new PreRenderThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m279lambda$prepareAndStoreView$2$injuspayhypersdkcoreAndroidInterface(str, jSONObject, str3);
                }
            }).start();
        } catch (JSONException unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "Error while parsing ".concat(String.valueOf(str2)));
        }
    }

    final void processPendingAddScreen(final String str) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m280lambda$processPendingAddScreen$21$injuspayhypersdkcoreAndroidInterface(str);
            }
        });
    }

    @JavascriptInterface
    public final void removeView(int i) {
        removeView(i, null);
    }

    @JavascriptInterface
    public final void render(String str, String str2) {
        render(str, str2, "true", null);
    }

    @JavascriptInterface
    public final void replaceView(String str, int i) {
        replaceView(str, i, null);
    }

    @JavascriptInterface
    public final void run(String str, String str2) {
        try {
            InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
            if (this.dynamicUI.getActivity() != null) {
                inflateJSON.setUseAppContext(false);
                this.dynamicUI.getRenderer().parseAndRunPipe(this.dynamicUI.getActivity(), str, "", "", inflateJSON.getUseAppContext());
            } else {
                inflateJSON.setUseAppContext(true);
                this.dynamicUI.getRenderer().parseAndRunPipe(this.dynamicUI.getAppContext(), str, "", "", inflateJSON.getUseAppContext());
            }
            if (str2 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb = new StringBuilder("window.callUICallback(");
                sb.append(str2);
                sb.append(",'success');");
                dynamicUI.addJsToWebView(sb.toString());
            }
        } catch (Exception e) {
            String name = e.getClass().getName();
            this.dynamicUI.getLogger().e("runInUI", name);
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name);
            sb2.append(" - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onError("runInUI", sb2.toString());
            if (str2 != null) {
                DynamicUI dynamicUI2 = this.dynamicUI;
                StringBuilder sb3 = new StringBuilder("window.callUICallback(");
                sb3.append(str2);
                sb3.append(",'failure');");
                dynamicUI2.addJsToWebView(sb3.toString());
            }
        }
    }

    @JavascriptInterface
    public final String runCmds(String str) {
        try {
            return getJSONResult(str);
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb = new StringBuilder(" excep: fn__runInUIJSON  - ");
            sb.append(this.dynamicUI.getRenderer().getErrorDetails());
            logger.e("ERROR", sb.toString());
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb2 = new StringBuilder(" excep: fn__runInUIJSON  - ");
            sb2.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onException("ERROR", sb2.toString(), e);
            return "__failure__";
        }
    }

    @JavascriptInterface
    public final void runCmdsInBg(final String str, final String str2) {
        ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m284lambda$runCmdsInBg$9$injuspayhypersdkcoreAndroidInterface(str, str2);
            }
        });
    }

    @JavascriptInterface
    public final void runCmdsInUI(final String str, final String str2) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m285lambda$runCmdsInUI$10$injuspayhypersdkcoreAndroidInterface(str, str2);
            }
        });
    }

    @JavascriptInterface
    public final void runInUI(final String str, final String str2, final String str3, final String str4) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m286lambda$runInUI$7$injuspayhypersdkcoreAndroidInterface(str, str3, str4, str2);
            }
        });
    }

    @JavascriptInterface
    public final void saveData(String str, String str2) {
        this.dynamicUI.getAppContext().getSharedPreferences("DUI", 0).edit().putString(str, str2).apply();
    }

    @JavascriptInterface
    public final void saveState(String str) {
        this.state = str;
    }

    @JavascriptInterface
    public final String setFragmentContainer(int i, String str) {
        ViewGroup container = this.dynamicUI.getContainer(str);
        if (container == null) {
            return "__failed";
        }
        View viewFindViewById = container.findViewById(i);
        return viewFindViewById instanceof ViewGroup ? this.dynamicUI.addToContainerList((ViewGroup) viewFindViewById) : "__failed";
    }

    @JavascriptInterface
    public final void setImage(final int i, final String str, final String str2) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m288lambda$setImage$12$injuspayhypersdkcoreAndroidInterface(str2, i, str);
            }
        });
    }

    final void setPrepareScreenTaskStatus(final String str, final boolean z) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m289lambda$setPrepareScreenTaskStatus$20$injuspayhypersdkcoreAndroidInterface(z, str);
            }
        });
    }

    @JavascriptInterface
    public final void setState(String str) {
        this.state = str;
    }

    @JavascriptInterface
    @Deprecated
    public final void showLoading() {
    }

    /* JADX INFO: renamed from: showPopup, reason: merged with bridge method [inline-methods] */
    public final void m276lambda$generateUIElement$14$injuspayhypersdkcoreAndroidInterface(View view, String[] strArr, final String str) {
        if (this.dynamicUI.getActivity() == null) {
            this.dynamicUI.getLogger().e("Missing Activity", "showPopup, it is not  activity, it is applicationContext");
            return;
        }
        PopupMenu popupMenu = new PopupMenu(this.dynamicUI.getActivity(), view);
        for (int i = 0; i < strArr.length; i++) {
            popupMenu.getMenu().add(0, i, 0, strArr[i]);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda18
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f$0.m290lambda$showPopup$16$injuspayhypersdkcoreAndroidInterface(str, menuItem);
            }
        });
        popupMenu.show();
    }

    @JavascriptInterface
    public final void startAnim(String str) {
        startAnim(str, null);
    }

    @JavascriptInterface
    public final void throwError(String str) {
        this.dynamicUI.getLogger().e("throwError", str);
    }

    @JavascriptInterface
    public final void toggleKeyboard(int i, String str, String str2) {
        if (this.dynamicUI.getActivity() != null) {
            ExecutorManager.runOnMainThread(new AndroidInterface$$ExternalSyntheticLambda4(this, str2, i, str));
        } else {
            this.dynamicUI.getLogger().e("Missing Activity", "toggleKeyboard, it is not  activity, it is applicationContext");
        }
    }

    @JavascriptInterface
    public final void updateAnim(int i, String str) {
        updateAnim(i, str, null);
    }

    @JavascriptInterface
    public final void updateProperties(String str) {
        updateProperties(str, null);
    }

    @JavascriptInterface
    @Deprecated
    public final void Render(String str, String str2) {
        render(str, str2, null);
    }

    @JavascriptInterface
    public final void addStoredViewToParent(final String str, final String str2, final int i, final String str3, final boolean z, final String str4, final String str5) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m273lambda$addStoredViewToParent$3$injuspayhypersdkcoreAndroidInterface(str2, str, i, str3, z, str4, str5);
            }
        });
    }

    @JavascriptInterface
    public final void addViewToParent(final String str, String str2, final int i, final String str3, final boolean z, final String str4) {
        try {
            final JSONObject jSONObject = new JSONObject(str2);
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m274lambda$addViewToParent$1$injuspayhypersdkcoreAndroidInterface(str, jSONObject, i, z, str4, str3);
                }
            });
        } catch (JSONException unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "Error while parsing ".concat(String.valueOf(str2)));
        }
    }

    @JavascriptInterface
    public final void generateUIElement(final String str, final int i, final String[] strArr, final String str2, final String str3) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m277lambda$generateUIElement$15$injuspayhypersdkcoreAndroidInterface(str3, str, i, strArr, str2);
            }
        });
    }

    @JavascriptInterface
    public final void moveView(final String str, final String str2, final String str3) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m278lambda$moveView$5$injuspayhypersdkcoreAndroidInterface(str3, str, str2);
            }
        });
    }

    @JavascriptInterface
    public final void removeView(final int i, final String str) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m281lambda$removeView$6$injuspayhypersdkcoreAndroidInterface(str, i);
            }
        });
    }

    @JavascriptInterface
    public final void render(String str, String str2, String str3) {
        render(str, str2, str3, null);
    }

    @JavascriptInterface
    public final void replaceView(String str, final int i, final String str2) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m283lambda$replaceView$4$injuspayhypersdkcoreAndroidInterface(str2, jSONObject, i);
                }
            });
        } catch (JSONException unused) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb = new StringBuilder("fn__replaceView - ");
            sb.append(this.dynamicUI.getRenderer().getErrorDetails());
            sb.append(" - ");
            sb.append(str);
            logger.e("JSON_ERROR", sb.toString());
        }
    }

    @JavascriptInterface
    public final void runInUI(final String str, final String str2) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m287lambda$runInUI$8$injuspayhypersdkcoreAndroidInterface(str, str2);
            }
        });
    }

    @JavascriptInterface
    public final void startAnim(final String str, final String str2) {
        final Pair<String, ObjectAnimator> pairFindAnimationById = this.dynamicUI.getRenderer().getInflateView().findAnimationById(str);
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m291lambda$startAnim$17$injuspayhypersdkcoreAndroidInterface(pairFindAnimationById, str2, str);
            }
        });
    }

    @JavascriptInterface
    public final void updateAnim(final int i, String str, final String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            final JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m293lambda$updateAnim$19$injuspayhypersdkcoreAndroidInterface(str2, i, jSONArray);
                }
            });
        } catch (JSONException unused) {
            this.dynamicUI.getLogger().e("JSONERROR", "Error parsing json for animation string ".concat(String.valueOf(str)));
        }
    }

    @JavascriptInterface
    public final void updateProperties(final String str, final String str2) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m294lambda$updateProperties$11$injuspayhypersdkcoreAndroidInterface(str2, str);
            }
        });
    }

    @JavascriptInterface
    public final void render(String str, final String str2, final String str3, final String str4) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (this.dynamicUI.getContainer(str4) != null) {
                ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m282lambda$render$0$injuspayhypersdkcoreAndroidInterface(jSONObject, str4, str3, str2);
                    }
                });
                return;
            }
            this.dynamicUI.getLogger().e("missing_container", "render, it is not activity, it is applicationContext/ no container");
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb = new StringBuilder(" excep: fn__Render  - missing_container - ");
            sb.append(this.dynamicUI.getRenderer().getErrorDetails());
            errorCallback.onError("ERROR", sb.toString());
            if (str2 != null) {
                DynamicUI dynamicUI = this.dynamicUI;
                StringBuilder sb2 = new StringBuilder("window.callUICallback(");
                sb2.append(str2);
                sb2.append(",'failure');");
                dynamicUI.addJsToWebView(sb2.toString());
            }
        } catch (JSONException unused) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb3 = new StringBuilder("fn__render - ");
            sb3.append(this.dynamicUI.getRenderer().getErrorDetails());
            sb3.append(" - ");
            sb3.append(str);
            logger.e("JSONERROR", sb3.toString());
        }
    }

    @JavascriptInterface
    @Deprecated
    public final void Render(String str, String str2, String str3) {
        render(str, str2, str3, null);
    }

    @JavascriptInterface
    public final void addViewToParent(String str, String str2, int i, String str3) {
        addViewToParent(str, str2, i, str3, (String) null);
    }

    @JavascriptInterface
    public final void addViewToParent(String str, String str2, int i, String str3, String str4) {
        addViewToParent(str, str2, i, str3, false, str4);
    }
}
