package kotlin;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectArrayDeserializer {
    private static HashMap<String, Constructor<? extends NumberDeserializersNumberDeserializer>> RemoteActionCompatParcelizer;
    private HashMap<Integer, ArrayList<NumberDeserializersNumberDeserializer>> AudioAttributesCompatParcelizer = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends NumberDeserializersNumberDeserializer>> map = new HashMap<>();
        RemoteActionCompatParcelizer = map;
        try {
            map.put("KeyAttribute", NumberDeserializersLongDeserializer.class.getConstructor(new Class[0]));
            RemoteActionCompatParcelizer.put("KeyPosition", _concat.class.getConstructor(new Class[0]));
            RemoteActionCompatParcelizer.put("KeyCycle", forType.class.getConstructor(new Class[0]));
            RemoteActionCompatParcelizer.put("KeyTimeCycle", PrimitiveArrayDeserializers.class.getConstructor(new Class[0]));
            RemoteActionCompatParcelizer.put("KeyTrigger", PrimitiveArrayDeserializersCharDeser.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void AudioAttributesCompatParcelizer(NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer) {
        if (!this.AudioAttributesCompatParcelizer.containsKey(Integer.valueOf(numberDeserializersNumberDeserializer.write))) {
            this.AudioAttributesCompatParcelizer.put(Integer.valueOf(numberDeserializersNumberDeserializer.write), new ArrayList<>());
        }
        ArrayList<NumberDeserializersNumberDeserializer> arrayList = this.AudioAttributesCompatParcelizer.get(Integer.valueOf(numberDeserializersNumberDeserializer.write));
        if (arrayList != null) {
            arrayList.add(numberDeserializersNumberDeserializer);
        }
    }

    public ObjectArrayDeserializer() {
    }

    public ObjectArrayDeserializer(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (RemoteActionCompatParcelizer.containsKey(name)) {
                        try {
                            Constructor<? extends NumberDeserializersNumberDeserializer> constructor = RemoteActionCompatParcelizer.get(name);
                            if (constructor != null) {
                                NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializerNewInstance = constructor.newInstance(new Object[0]);
                                try {
                                    numberDeserializersNumberDeserializerNewInstance.write(context, Xml.asAttributeSet(xmlPullParser));
                                    AudioAttributesCompatParcelizer(numberDeserializersNumberDeserializerNewInstance);
                                } catch (Exception unused) {
                                }
                                numberDeserializersNumberDeserializer = numberDeserializersNumberDeserializerNewInstance;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Keymaker for ");
                                sb.append(name);
                                sb.append(" not found");
                                throw new NullPointerException(sb.toString());
                            }
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (numberDeserializersNumberDeserializer != null && numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer != null) {
                            StackTraceElementDeserializer.RemoteActionCompatParcelizer(context, xmlPullParser, numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && numberDeserializersNumberDeserializer != null && numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer != null) {
                        StackTraceElementDeserializer.RemoteActionCompatParcelizer(context, xmlPullParser, numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void read(handleSingleElementUnwrapped handlesingleelementunwrapped) {
        ArrayList<NumberDeserializersNumberDeserializer> arrayList = this.AudioAttributesCompatParcelizer.get(-1);
        if (arrayList != null) {
            handlesingleelementunwrapped.RemoteActionCompatParcelizer(arrayList);
        }
    }

    public final void RemoteActionCompatParcelizer(handleSingleElementUnwrapped handlesingleelementunwrapped) {
        ArrayList<NumberDeserializersNumberDeserializer> arrayList = this.AudioAttributesCompatParcelizer.get(Integer.valueOf(handlesingleelementunwrapped.RemoteActionCompatParcelizer));
        if (arrayList != null) {
            handlesingleelementunwrapped.RemoteActionCompatParcelizer(arrayList);
        }
        ArrayList<NumberDeserializersNumberDeserializer> arrayList2 = this.AudioAttributesCompatParcelizer.get(-1);
        if (arrayList2 != null) {
            for (NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer : arrayList2) {
                if (numberDeserializersNumberDeserializer.write(((ConstraintLayout.LayoutParams) handlesingleelementunwrapped.IconCompatParcelizer.getLayoutParams()).MediaDescriptionCompat)) {
                    handlesingleelementunwrapped.RemoteActionCompatParcelizer(numberDeserializersNumberDeserializer);
                }
            }
        }
    }

    public final ArrayList<NumberDeserializersNumberDeserializer> write() {
        return this.AudioAttributesCompatParcelizer.get(-1);
    }
}
