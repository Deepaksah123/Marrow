package in.juspay.hypersdk.core;

import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.marrow.data.models.lesson.LessonIndex;
import in.juspay.hypersdk.core.InflateView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class InflateJSON extends InflateView {
    private final String ARGS;
    private final String BODY;
    private final String CATCH;
    private final String COMMAND;
    private final String CONDITION;
    private final String CONDITIONS;
    private final String EXPLICIT_TYPE;
    private final String FUNCTION_STACK_NAME;
    private final String GLOBAL;
    private final String IF;
    private final String INVOKE_ON;
    private final String JSON_ARRAY;
    private final String JSON_OBJECT;
    private final String LISTENER;
    private final String LOCAL;
    private final String METHOD_NAME;
    private final String NEW;
    private final String OVERRIDE_CLASS_LISTENER;
    private final String OVERRIDE_METHODS;
    private final String RETURN_TO;
    private final String RETURN_TYPE;
    private final String RUNIN_UI_JSON;
    private final String STATE;
    private final String STATIC;
    private final String TO;
    private final String TYPE;
    private final String VALUE;
    private final String VALUE_GET;
    private final String VALUE_SET;
    private final String VOID;
    private final String WHILE;
    private final HashMap<InflateView.Cmd, Constructor<?>> constructorCache;
    private final AtomicInteger idCounter;
    private final HashMap<String, HashMap<String, Object>> localState;
    private OverrideClass overrideClass;

    /* JADX INFO: loaded from: classes5.dex */
    class Arguments {
        private final Object[] args;
        private Class<?>[] classTypes;

        public Arguments(JSONArray jSONArray, Object obj, LinkedList<String> linkedList) throws JSONException {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
                this.classTypes = new Class[0];
            }
            this.args = new Object[jSONArray.length()];
            this.classTypes = new Class[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                this.args[i] = InflateJSON.this.getValue(jSONObject, obj, linkedList);
                this.classTypes[i] = (Class) InflateJSON.this.getClassTypeFromObject(this.args[i], jSONObject.optString("et"));
            }
        }
    }

    InflateJSON(DynamicUI dynamicUI) {
        super(dynamicUI);
        this.constructorCache = new HashMap<>();
        this.RUNIN_UI_JSON = "rj";
        this.JSON_ARRAY = "jsa";
        this.JSON_OBJECT = "jso";
        this.idCounter = new AtomicInteger(0);
        this.VALUE = "v";
        this.VOID = "vo";
        this.COMMAND = "c";
        this.CATCH = "ct";
        this.TYPE = "t";
        this.TO = "to";
        this.GLOBAL = "g";
        this.LOCAL = "lcl";
        this.STATE = CmcdConfiguration.KEY_STREAM_TYPE;
        this.INVOKE_ON = "io";
        this.RETURN_TO = "rt";
        this.METHOD_NAME = "mn";
        this.ARGS = CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY;
        this.NEW = "n";
        this.EXPLICIT_TYPE = "et";
        this.CONDITION = "cnd";
        this.CONDITIONS = "cnds";
        this.RETURN_TYPE = "rty";
        this.BODY = "bd";
        this.IF = "if";
        this.WHILE = "w";
        this.VALUE_SET = "vs";
        this.VALUE_GET = "vg";
        this.FUNCTION_STACK_NAME = "fnstk";
        this.STATIC = "stc";
        this.OVERRIDE_CLASS_LISTENER = "ocl";
        this.OVERRIDE_METHODS = "orm";
        this.LISTENER = "lis";
        this.localState = new HashMap<>();
        this.overrideClass = new OverrideClass(this);
    }

    private Object createNewInstance(Class<?> cls, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<?> constructor;
        if (objArr == null || objArr.length == 0) {
            return cls.newInstance();
        }
        InflateView.Cmd cmd = new InflateView.Cmd(cls, LessonIndex.TAG_TYPE_NEW, clsArr);
        if (this.constructorCache.containsKey(cmd)) {
            return ((Constructor) Objects.requireNonNull(this.constructorCache.get(cmd))).newInstance(objArr);
        }
        Object objNewInstance = null;
        try {
            constructor = cls.getConstructor(clsArr);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        try {
            objNewInstance = constructor.newInstance(objArr);
        } catch (NoSuchMethodException unused2) {
            Constructor<?>[] constructors = cls.getConstructors();
            int i = 0;
            if (clsArr == null) {
                clsArr = new Class[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    Object obj = objArr[i2];
                    if (obj != null) {
                        clsArr[i2] = obj.getClass();
                    }
                }
            }
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor2 = constructors[i];
                if (constructor2.getParameterTypes().length == objArr.length && matchTypes(constructor2.getParameterTypes(), clsArr)) {
                    objNewInstance = constructor2.newInstance(objArr);
                    constructor = constructor2;
                    break;
                }
                i++;
            }
        }
        this.constructorCache.put(cmd, constructor);
        return objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <Any> Any getClassTypeFromObject(Object obj, String str) {
        if (str.equals("")) {
            return (Any) obj.getClass();
        }
        Any any = (Any) createPrimitiveClass(str);
        return any == null ? (Any) Class.forName(str) : any;
    }

    private Field getField(Class<?> cls, String str) {
        return cls.getDeclaredField(str);
    }

    private Object getLocalStateValue(String str, LinkedList<String> linkedList) throws Exception {
        Iterator<String> itDescendingIterator = linkedList.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            String next = itDescendingIterator.next();
            if (!this.localState.containsKey(next)) {
                throw new Exception("local state not found for function ".concat(String.valueOf(next)));
            }
            if (((HashMap) Objects.requireNonNull(this.localState.get(next))).containsKey(str)) {
                return ((HashMap) Objects.requireNonNull(this.localState.get(next))).get(str);
            }
        }
        return null;
    }

    private Object getStateValue(String str) {
        return this.state.get(str);
    }

    private Object invokeFunction(Method method, Object obj, Object[] objArr) {
        return objArr == null ? method.invoke(obj, null) : method.invoke(obj, objArr);
    }

    private void saveOutput(Object obj, JSONObject jSONObject, LinkedList<String> linkedList) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.getString("to");
        String string2 = jSONObject.getString("v");
        if (string.equals("g")) {
            getDUI().setGlobalState(string2, obj);
        } else if (string.equals("lcl")) {
            setLocalStateValue(string2, obj, linkedList);
        } else {
            this.state.put(string2, obj);
        }
    }

    private void setLocalStateValue(String str, Object obj, LinkedList<String> linkedList) {
        ((HashMap) Objects.requireNonNull(this.localState.get(linkedList.getLast()))).put(str, obj);
    }

    public Object callFunction(String str, Object obj, Object[] objArr) {
        return callFunction(str, obj, objArr, null);
    }

    protected Method findMethodInClassWithArgs(Class<?> cls, String str, Class<?>[] clsArr) {
        return findMethodWithCmd(new InflateView.Cmd(cls, str, clsArr));
    }

    public Class<?> getClassNameJSON(JSONObject jSONObject, Object obj) throws Exception {
        String string = jSONObject.getString("t");
        String strOptString = jSONObject.optString("et");
        if (string.equals("stc")) {
            strOptString = jSONObject.getString("v");
        }
        if (!strOptString.equals("")) {
            return getClassName(strOptString);
        }
        if (obj != null) {
            return obj.getClass();
        }
        throw new Exception("toRunOn is null");
    }

    public Object getValue(JSONObject jSONObject, Object obj, LinkedList<String> linkedList) throws JSONException {
        String string = jSONObject.getString("t");
        return string.equals("jsa") ? jSONObject.getJSONArray("v") : string.equals("jso") ? jSONObject.getJSONObject("v") : getValueNew(string, jSONObject.getString("v"), obj, linkedList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <Any> Any getValueNew(java.lang.String r2, java.lang.String r3, java.lang.Object r4, java.util.LinkedList<java.lang.String> r5) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateJSON.getValueNew(java.lang.String, java.lang.String, java.lang.Object, java.util.LinkedList):java.lang.Object");
    }

    public Object parseAndRunPipeJSON(Object obj, JSONArray jSONArray, boolean z, LinkedList<String> linkedList) throws Exception {
        Object obj2 = null;
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Object objRunCommandJSON = runCommandJSON(jSONObject, obj, z, linkedList);
            if (jSONObject.has("rt")) {
                saveOutput(objRunCommandJSON, jSONObject.getJSONObject("rt"), linkedList);
            }
            i++;
            obj2 = objRunCommandJSON;
        }
        return obj2;
    }

    @Override // in.juspay.hypersdk.core.InflateView
    public void parseKeys(String str, JSONObject jSONObject, Object obj, boolean z) {
        try {
        } catch (Exception e) {
            DuiLogger logger = this.dynamicUI.getLogger();
            StringBuilder sb = new StringBuilder("Error in parsing new infl ");
            sb.append(e.getMessage());
            logger.e("WARNING", sb.toString());
        }
        if (str.equals("rj")) {
            runJSON(obj, jSONObject.getJSONArray("rj"), z, null);
            return;
        }
        if (str.equals("ocl")) {
            JSONArray jSONArray = jSONObject.getJSONArray("ocl");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                this.overrideClass.addListener(obj, jSONObject2.getString("lis"), jSONObject2.getJSONObject("orm"));
            }
        }
        super.parseKeys(str, jSONObject, obj, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object runCommandJSON(org.json.JSONObject r17, java.lang.Object r18, boolean r19, java.util.LinkedList<java.lang.String> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.InflateJSON.runCommandJSON(org.json.JSONObject, java.lang.Object, boolean, java.util.LinkedList):java.lang.Object");
    }

    public Object runJSON(Object obj, JSONArray jSONArray, boolean z, LinkedList<String> linkedList) {
        Object andRunPipeJSON = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                andRunPipeJSON = parseAndRunPipeJSON(obj, jSONArray.getJSONArray(i), z, linkedList);
            } catch (Exception e) {
                DuiLogger logger = this.dynamicUI.getLogger();
                StringBuilder sb = new StringBuilder("Error in parsing new infl ");
                sb.append(e.getMessage());
                logger.e("WARNING", sb.toString());
                return andRunPipeJSON;
            }
        }
        return andRunPipeJSON;
    }

    public Object runProps(JSONObject jSONObject, String str, Object obj) throws JSONException, ClassNotFoundException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("props");
        Iterator<String> itKeys = jSONObject3.keys();
        while (itKeys.hasNext()) {
            parseKeys(itKeys.next(), jSONObject3, obj, false);
        }
        Object obj2 = getState().get("rt");
        String string = jSONObject2.getString("rty");
        if (string.equals("vo")) {
            return null;
        }
        Class<?> cls = Class.forName(string);
        if (cls.isInstance(obj2)) {
            return obj2;
        }
        DuiLogger logger = getDUI().getLogger();
        StringBuilder sb = new StringBuilder("return type mismatch for method ");
        sb.append(str);
        sb.append(" expected ");
        sb.append(string);
        sb.append(" got ");
        sb.append(obj2 != null ? obj2.getClass().getName() : "result isnull");
        logger.e("WARNING", sb.toString());
        Object objRunJSON = runJSON(obj, jSONObject2.getJSONArray("ct"), false, null);
        if (cls.isInstance(objRunJSON)) {
            return objRunJSON;
        }
        DuiLogger logger2 = getDUI().getLogger();
        StringBuilder sb2 = new StringBuilder("return type mismatch for method on default");
        sb2.append(str);
        sb2.append(" expected ");
        sb2.append(string);
        sb2.append(" got ");
        sb2.append(objRunJSON == null ? "null" : objRunJSON.getClass().getName());
        logger2.e("WARNING", sb2.toString());
        return null;
    }

    public Object callFunction(String str, Object obj, Object[] objArr, LinkedList<String> linkedList) {
        HashMap<String, Object> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.idCounter.getAndIncrement());
        String string = sb.toString();
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        map.put("fnstk", linkedList);
        this.localState.put(string, map);
        linkedList.add(string);
        map.put(CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, objArr);
        Object objRunJSON = runJSON(obj, getDUI().getFunction(str), false, linkedList);
        linkedList.removeLast();
        this.localState.remove(string);
        return objRunJSON;
    }
}
