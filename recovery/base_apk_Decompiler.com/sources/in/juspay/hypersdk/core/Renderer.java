package in.juspay.hypersdk.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.mystique.Callback;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Renderer {
    private final DynamicUI dynamicUI;
    private int viewCacheCapacity;
    ConcurrentHashMap<String, List<View>> viewCache = new ConcurrentHashMap<>();
    private final HashMap<String, ViewGroup> container = new HashMap<>();
    private final HashMap<String, View> prevView = new HashMap<>();

    /* JADX INFO: loaded from: classes5.dex */
    static class RenderTreeNode {
        View itself;
        ViewGroup parent;

        RenderTreeNode(ViewGroup viewGroup, View view) {
            this.parent = viewGroup;
            this.itself = view;
        }
    }

    Renderer(DynamicUI dynamicUI, JSONObject jSONObject) {
        this.dynamicUI = dynamicUI;
        try {
            this.viewCacheCapacity = jSONObject.getJSONObject("uiFeatures").getJSONObject("nbListItemCaching").getInt("bgCacheCapacity");
        } catch (Exception unused) {
            this.viewCacheCapacity = 4;
        }
        try {
            initCache();
        } catch (Exception e) {
            dynamicUI.getLogger().e("Error while initializing cache", e.toString());
        }
    }

    private void addViewFromRenderTreeNodeQueue(Queue<RenderTreeNode> queue) {
        while (!queue.isEmpty()) {
            RenderTreeNode renderTreeNodePoll = queue.poll();
            if (renderTreeNodePoll != null) {
                renderTreeNodePoll.parent.addView(renderTreeNodePoll.itself);
            }
        }
    }

    private View createAllNodesAndReturnRoot(JSONObject jSONObject, Queue<RenderTreeNode> queue, boolean z) throws JSONException {
        ViewGroup viewGroup;
        View merchantView;
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("props");
        if (jSONObject.has("props")) {
            setCurrentNodeDetails(string, jSONObject2);
        }
        Object newInstanceFromClassName = getNewInstanceFromClassName(string);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            this.dynamicUI.getInflateView().parseKeys(itKeys.next(), jSONObject2, newInstanceFromClassName, z);
        }
        String strOptString = jSONObject2.optString("viewType");
        if (!strOptString.isEmpty() && (merchantView = this.dynamicUI.getMerchantView((viewGroup = (ViewGroup) newInstanceFromClassName), MerchantViewType.valueOf(strOptString))) != null) {
            queue.add(new RenderTreeNode(viewGroup, merchantView));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                queue.add(new RenderTreeNode((ViewGroup) newInstanceFromClassName, createAllNodesAndReturnRoot(jSONArray.getJSONObject(i), queue, z)));
            }
        }
        return (View) newInstanceFromClassName;
    }

    private View createNodesAndReturnRoot(JSONObject jSONObject, InflateView inflateView) throws JSONException {
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("props");
        if (jSONObject.has("props")) {
            setCurrentNodeDetails(string, jSONObject2);
        }
        Object newInstanceFromClassName = getNewInstanceFromClassName(string);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            inflateView.parseKeys(itKeys.next(), jSONObject2, newInstanceFromClassName, inflateView.getUseAppContext());
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                ((ViewGroup) newInstanceFromClassName).addView(createNodesAndReturnRoot(jSONArray.getJSONObject(i), inflateView));
            }
        }
        return (View) newInstanceFromClassName;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object getNewInstanceFromClassName(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.Renderer.getNewInstanceFromClassName(java.lang.String):java.lang.Object");
    }

    private void initCache() {
        final String[] strArr = {"android.widget.RelativeLayout", "android.widget.LinearLayout", "android.widget.ImageView", "android.widget.ScrollView", "android.widget.TextView", "android.widget.EditText", "android.widget.FrameLayout"};
        ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.core.Renderer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m340lambda$initCache$0$injuspayhypersdkcoreRenderer(strArr);
            }
        });
    }

    private void removeViewFromContainer(View view, String str) {
        ViewGroup viewGroup = this.container.get(str);
        if (viewGroup != null) {
            viewGroup.removeViewAt(viewGroup.indexOfChild(view));
        }
    }

    private void render(View view, String str) {
        ViewGroup viewGroup = this.container.get(str);
        if (view != null && viewGroup != null) {
            viewGroup.addView(view);
            return;
        }
        Callback errorCallback = this.dynamicUI.getErrorCallback();
        StringBuilder sb = new StringBuilder(" isNull : fn__Render -  instance null ");
        sb.append(getErrorDetails());
        errorCallback.onError("ERROR", sb.toString());
    }

    public void addStoredViewToParent(String str, String str2, int i, boolean z, String str3) {
        int identifier = this.dynamicUI.getAppContext().getResources().getIdentifier(str, "id", this.dynamicUI.getAppContext().getPackageName());
        if (i < 0) {
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb = new StringBuilder(" isNull : fn__addViewToParent - negative index ");
            sb.append(getErrorDetails());
            errorCallback.onError("ERROR", sb.toString());
            return;
        }
        ViewGroup container = this.dynamicUI.getContainer(str3);
        if (container == null) {
            Callback errorCallback2 = this.dynamicUI.getErrorCallback();
            StringBuilder sb2 = new StringBuilder(" isNull : fn__addViewToParent - container null ");
            sb2.append(getErrorDetails());
            errorCallback2.onError("ERROR", sb2.toString());
            return;
        }
        ViewGroup viewGroup = (ViewGroup) container.findViewById(identifier);
        if (z) {
            viewGroup.removeAllViews();
        }
        View view = (View) this.dynamicUI.getViewFromScreenName(str2);
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            viewGroup.addView(view, i);
        } else {
            Callback errorCallback3 = this.dynamicUI.getErrorCallback();
            StringBuilder sb3 = new StringBuilder(" isNull : fn__addViewToParent - child null ");
            sb3.append(getErrorDetails());
            errorCallback3.onError("ERROR", sb3.toString());
        }
    }

    public void addViewToParent(String str, JSONObject jSONObject, int i, boolean z, String str2) throws JSONException {
        int identifier = this.dynamicUI.getAppContext().getResources().getIdentifier(str, "id", this.dynamicUI.getAppContext().getPackageName());
        ViewGroup container = this.dynamicUI.getContainer(str2);
        if (i < 0 || container == null) {
            if (container == null) {
                this.dynamicUI.getLogger().e("Missing Container", "addViewToParent, InflateView, it is not  activity, it is applicationContext");
            }
            if (jSONObject.has("props")) {
                setCurrentNodeDetails(jSONObject.getString("type"), jSONObject.getJSONObject("props"));
            }
            Callback errorCallback = this.dynamicUI.getErrorCallback();
            StringBuilder sb = new StringBuilder(" isNull : fn__addViewToParent - negative index ");
            sb.append(getErrorDetails());
            errorCallback.onError("ERROR", sb.toString());
            return;
        }
        ViewGroup viewGroup = (ViewGroup) container.findViewById(identifier);
        if (z) {
            viewGroup.removeAllViews();
        }
        LinkedList linkedList = new LinkedList();
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(true);
        View viewCreateAllNodesAndReturnRoot = createAllNodesAndReturnRoot(jSONObject, linkedList, inflateJSON.getUseAppContext());
        addViewFromRenderTreeNodeQueue(linkedList);
        viewGroup.addView(viewCreateAllNodesAndReturnRoot, i);
    }

    public View createView(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("props");
        if (jSONObject.has("props")) {
            setCurrentNodeDetails(string, jSONObject2);
        }
        Object newInstanceFromClassName = getNewInstanceFromClassName(string);
        Iterator<String> itKeys = jSONObject2.keys();
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(true);
        while (itKeys.hasNext()) {
            this.dynamicUI.getInflateView().parseKeys(itKeys.next(), jSONObject2, newInstanceFromClassName, inflateJSON.getUseAppContext());
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                View viewCreateView = createView(jSONArray.getJSONObject(i));
                if (viewCreateView != null) {
                    ((ViewGroup) newInstanceFromClassName).addView(viewCreateView);
                }
            }
        }
        return (View) newInstanceFromClassName;
    }

    public void dismissPopUp() {
        this.dynamicUI.getInflateView().dismissPopUp();
    }

    public View getCachedViewFor(String str) {
        List<View> list = this.viewCache.get(str);
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            replenishCache(str);
            return null;
        }
        View viewRemove = list.remove(0);
        if (size < this.viewCacheCapacity) {
            replenishCache(str);
        }
        return viewRemove;
    }

    public String getErrorDetails() {
        return this.dynamicUI.getInflateView().getErrorDetails();
    }

    public InflateView getInflateView() {
        return this.dynamicUI.getInflateView();
    }

    /* JADX INFO: renamed from: lambda$initCache$0$in-juspay-hypersdk-core-Renderer, reason: not valid java name */
    /* synthetic */ void m340lambda$initCache$0$injuspayhypersdkcoreRenderer(String[] strArr) {
        List<View> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        for (String str : strArr) {
            for (int i = 0; i < this.viewCacheCapacity; i++) {
                try {
                    listSynchronizedList.add((View) Class.forName(str).getConstructor(Context.class).newInstance(this.dynamicUI.getAppContext()));
                } catch (Exception e) {
                    this.dynamicUI.getLogger().e("Error while initializing cache in function", e.toString());
                }
            }
            this.viewCache.put(str, listSynchronizedList);
            listSynchronizedList = Collections.synchronizedList(new ArrayList());
        }
    }

    /* JADX INFO: renamed from: lambda$replenishCache$1$in-juspay-hypersdk-core-Renderer, reason: not valid java name */
    /* synthetic */ void m341lambda$replenishCache$1$injuspayhypersdkcoreRenderer(String str) {
        List<View> listSynchronizedList = this.viewCache.get(str);
        if (listSynchronizedList == null) {
            listSynchronizedList = Collections.synchronizedList(new ArrayList());
            this.viewCache.put(str, listSynchronizedList);
        }
        if (listSynchronizedList.size() < this.viewCacheCapacity) {
            try {
                listSynchronizedList.add((View) Class.forName(str).getConstructor(Context.class).newInstance(this.dynamicUI.getAppContext()));
            } catch (Exception unused) {
            }
        }
    }

    public void parseAndRunPipe(Object obj, String str, String str2, String str3, boolean z) throws IllegalAccessException, NoSuchFieldException, InvocationTargetException {
        this.dynamicUI.getInflateView().setCurrView("modifyDom");
        this.dynamicUI.getInflateView().setCurrViewId("");
        InflateView inflateView = this.dynamicUI.getInflateView();
        StringBuilder sb = new StringBuilder("ln: ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        inflateView.setFileOrigin(sb.toString());
        this.dynamicUI.getInflateView().parseAndRunPipe(obj, str, z);
    }

    public void prepareAndStoreView(String str, JSONObject jSONObject) throws JSONException {
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(true);
        this.dynamicUI.addToScreenMap(str, createNodesAndReturnRoot(jSONObject, inflateJSON));
    }

    public void renderUI(JSONObject jSONObject, ViewGroup viewGroup, String str) throws JSONException {
        renderUI(jSONObject, viewGroup, true, str);
    }

    public void replenishCache(final String str) {
        ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.core.Renderer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m341lambda$replenishCache$1$injuspayhypersdkcoreRenderer(str);
            }
        });
    }

    public void setCurrentNodeDetails(String str, JSONObject jSONObject) throws JSONException {
        this.dynamicUI.getInflateView().setCurrView(str);
        if (jSONObject.has("node_id")) {
            this.dynamicUI.getInflateView().setCurrViewId(jSONObject.getString("node_id"));
        }
        if (jSONObject.has("__filename")) {
            this.dynamicUI.getInflateView().setFileOrigin(jSONObject.getString("__filename"));
        }
    }

    public void renderUI(JSONObject jSONObject, ViewGroup viewGroup, boolean z, String str) throws JSONException {
        if (str == null) {
            str = LogConstants.DEFAULT_CHANNEL;
        }
        this.container.put(str, viewGroup);
        LinkedList linkedList = new LinkedList();
        InflateJSON inflateJSON = new InflateJSON(this.dynamicUI);
        inflateJSON.setUseAppContext(true);
        View viewCreateAllNodesAndReturnRoot = createAllNodesAndReturnRoot(jSONObject, linkedList, inflateJSON.getUseAppContext());
        if (z && this.prevView.get(str) != viewCreateAllNodesAndReturnRoot) {
            removeViewFromContainer(this.prevView.get(str), str);
        }
        addViewFromRenderTreeNodeQueue(linkedList);
        render(viewCreateAllNodesAndReturnRoot, str);
        this.prevView.put(str, viewCreateAllNodesAndReturnRoot);
    }
}
