package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import kotlin._isBlank;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class StackTraceElementDeserializer {
    private float AudioAttributesCompatParcelizer;
    private RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private String MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private boolean read;
    private boolean write;

    public enum RemoteActionCompatParcelizer {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public final String write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final RemoteActionCompatParcelizer read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: o.StackTraceElementDeserializer$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[RemoteActionCompatParcelizer.values().length];
            read = iArr;
            try {
                iArr[RemoteActionCompatParcelizer.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[RemoteActionCompatParcelizer.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[RemoteActionCompatParcelizer.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[RemoteActionCompatParcelizer.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                read[RemoteActionCompatParcelizer.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                read[RemoteActionCompatParcelizer.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                read[RemoteActionCompatParcelizer.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                read[RemoteActionCompatParcelizer.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final boolean IconCompatParcelizer() {
        int i = AnonymousClass3.read[this.AudioAttributesImplApi26Parcelizer.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = AnonymousClass3.read[this.AudioAttributesImplApi26Parcelizer.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    public final float AudioAttributesCompatParcelizer() {
        switch (AnonymousClass3.read[this.AudioAttributesImplApi26Parcelizer.ordinal()]) {
            case 2:
                if (this.read) {
                    return 1.0f;
                }
                return BitmapDescriptorFactory.HUE_RED;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.RemoteActionCompatParcelizer;
            case 7:
                return this.AudioAttributesCompatParcelizer;
            case 8:
                return this.AudioAttributesCompatParcelizer;
            default:
                return Float.NaN;
        }
    }

    public final void write(float[] fArr) {
        switch (AnonymousClass3.read[this.AudioAttributesImplApi26Parcelizer.ordinal()]) {
            case 2:
                fArr[0] = this.read ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.IconCompatParcelizer;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = (i >>> 24) / 255.0f;
                return;
            case 6:
                fArr[0] = this.RemoteActionCompatParcelizer;
                return;
            case 7:
                fArr[0] = this.AudioAttributesCompatParcelizer;
                return;
            case 8:
                fArr[0] = this.AudioAttributesCompatParcelizer;
                return;
            default:
                return;
        }
    }

    private StackTraceElementDeserializer(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Object obj, boolean z) {
        this.AudioAttributesImplBaseParcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
        this.write = z;
        AudioAttributesCompatParcelizer(obj);
    }

    private StackTraceElementDeserializer(StackTraceElementDeserializer stackTraceElementDeserializer, Object obj) {
        this.write = false;
        this.AudioAttributesImplBaseParcelizer = stackTraceElementDeserializer.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplApi26Parcelizer = stackTraceElementDeserializer.AudioAttributesImplApi26Parcelizer;
        AudioAttributesCompatParcelizer(obj);
    }

    private void AudioAttributesCompatParcelizer(Object obj) {
        switch (AnonymousClass3.read[this.AudioAttributesImplApi26Parcelizer.ordinal()]) {
            case 1:
            case 6:
                this.RemoteActionCompatParcelizer = ((Integer) obj).intValue();
                break;
            case 2:
                this.read = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.MediaBrowserCompatItemReceiver = (String) obj;
                break;
            case 4:
            case 5:
                this.IconCompatParcelizer = ((Integer) obj).intValue();
                break;
            case 7:
                this.AudioAttributesCompatParcelizer = ((Float) obj).floatValue();
                break;
            case 8:
                this.AudioAttributesCompatParcelizer = ((Float) obj).floatValue();
                break;
        }
    }

    public static HashMap<String, StackTraceElementDeserializer> write(HashMap<String, StackTraceElementDeserializer> map, View view) {
        HashMap<String, StackTraceElementDeserializer> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            StackTraceElementDeserializer stackTraceElementDeserializer = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new StackTraceElementDeserializer(stackTraceElementDeserializer, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMap");
                    sb.append(str);
                    map2.put(str, new StackTraceElementDeserializer(stackTraceElementDeserializer, cls.getMethod(sb.toString(), new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return map2;
    }

    public static void write(View view, HashMap<String, StackTraceElementDeserializer> map) {
        Class<?> cls = view.getClass();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            StackTraceElementDeserializer stackTraceElementDeserializer = map.get(next);
            if (!stackTraceElementDeserializer.write) {
                next = "set".concat(String.valueOf(next));
            }
            try {
                switch (AnonymousClass3.read[stackTraceElementDeserializer.AudioAttributesImplApi26Parcelizer.ordinal()]) {
                    case 1:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(stackTraceElementDeserializer.RemoteActionCompatParcelizer));
                        break;
                    case 2:
                        cls.getMethod(next, Boolean.TYPE).invoke(view, Boolean.valueOf(stackTraceElementDeserializer.read));
                        break;
                    case 3:
                        cls.getMethod(next, CharSequence.class).invoke(view, stackTraceElementDeserializer.MediaBrowserCompatItemReceiver);
                        break;
                    case 4:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(stackTraceElementDeserializer.IconCompatParcelizer));
                        break;
                    case 5:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(stackTraceElementDeserializer.IconCompatParcelizer);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(stackTraceElementDeserializer.RemoteActionCompatParcelizer));
                        break;
                    case 7:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(stackTraceElementDeserializer.AudioAttributesCompatParcelizer));
                        break;
                    case 8:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(stackTraceElementDeserializer.AudioAttributesCompatParcelizer));
                        break;
                }
            } catch (IllegalAccessException e) {
                cls.getName();
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.getMessage();
                cls.getName();
                cls.getName();
            } catch (InvocationTargetException e3) {
                cls.getName();
                e3.printStackTrace();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(View view) {
        Class<?> cls = view.getClass();
        String strConcat = this.AudioAttributesImplBaseParcelizer;
        if (!this.write) {
            strConcat = "set".concat(String.valueOf(strConcat));
        }
        try {
            switch (AnonymousClass3.read[this.AudioAttributesImplApi26Parcelizer.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(strConcat, Integer.TYPE).invoke(view, Integer.valueOf(this.RemoteActionCompatParcelizer));
                    break;
                case 2:
                    cls.getMethod(strConcat, Boolean.TYPE).invoke(view, Boolean.valueOf(this.read));
                    break;
                case 3:
                    cls.getMethod(strConcat, CharSequence.class).invoke(view, this.MediaBrowserCompatItemReceiver);
                    break;
                case 4:
                    cls.getMethod(strConcat, Integer.TYPE).invoke(view, Integer.valueOf(this.IconCompatParcelizer));
                    break;
                case 5:
                    Method method = cls.getMethod(strConcat, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.IconCompatParcelizer);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(strConcat, Float.TYPE).invoke(view, Float.valueOf(this.AudioAttributesCompatParcelizer));
                    break;
                case 8:
                    cls.getMethod(strConcat, Float.TYPE).invoke(view, Float.valueOf(this.AudioAttributesCompatParcelizer));
                    break;
            }
        } catch (IllegalAccessException e) {
            cls.getName();
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.getMessage();
            cls.getName();
            cls.getName();
        } catch (InvocationTargetException e3) {
            cls.getName();
            e3.printStackTrace();
        }
    }

    public static void RemoteActionCompatParcelizer(Context context, XmlPullParser xmlPullParser, HashMap<String, StackTraceElementDeserializer> map) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == _isBlank.read.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Character.toUpperCase(string.charAt(0)));
                    sb.append(string.substring(1));
                    string = sb.toString();
                }
            } else if (index == _isBlank.read.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == _isBlank.read.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                remoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.BOOLEAN_TYPE;
            } else {
                if (index == _isBlank.read.CustomAttribute_customColorValue) {
                    remoteActionCompatParcelizer = RemoteActionCompatParcelizer.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == _isBlank.read.CustomAttribute_customColorDrawableValue) {
                    remoteActionCompatParcelizer = RemoteActionCompatParcelizer.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == _isBlank.read.CustomAttribute_customPixelDimension) {
                    remoteActionCompatParcelizer = RemoteActionCompatParcelizer.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED), context.getResources().getDisplayMetrics()));
                } else if (index == _isBlank.read.CustomAttribute_customDimension) {
                    remoteActionCompatParcelizer = RemoteActionCompatParcelizer.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.CustomAttribute_customFloatValue) {
                    remoteActionCompatParcelizer = RemoteActionCompatParcelizer.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == _isBlank.read.CustomAttribute_customIntegerValue) {
                    remoteActionCompatParcelizer = RemoteActionCompatParcelizer.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == _isBlank.read.CustomAttribute_customStringValue) {
                    remoteActionCompatParcelizer = RemoteActionCompatParcelizer.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == _isBlank.read.CustomAttribute_customReference) {
                    remoteActionCompatParcelizer = RemoteActionCompatParcelizer.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new StackTraceElementDeserializer(string, remoteActionCompatParcelizer2, objValueOf2, z));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
