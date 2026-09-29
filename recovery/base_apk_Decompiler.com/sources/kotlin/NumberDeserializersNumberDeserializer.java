package kotlin;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NumberDeserializersNumberDeserializer {
    HashMap<String, StackTraceElementDeserializer> AudioAttributesCompatParcelizer;
    protected int RemoteActionCompatParcelizer;
    int read = -1;
    int write = -1;
    String IconCompatParcelizer = null;

    public void AudioAttributesCompatParcelizer(HashMap<String, Integer> map) {
    }

    abstract void AudioAttributesCompatParcelizer(HashSet<String> hashSet);

    @Override // 
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public abstract NumberDeserializersNumberDeserializer clone();

    public abstract void read(HashMap<String, NumberDeserializersDoubleDeserializer> map);

    abstract void write(Context context, AttributeSet attributeSet);

    final boolean write(String str) {
        String str2 = this.IconCompatParcelizer;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    static float AudioAttributesCompatParcelizer(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    static int write(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    static boolean RemoteActionCompatParcelizer(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public NumberDeserializersNumberDeserializer IconCompatParcelizer(NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer) {
        this.read = numberDeserializersNumberDeserializer.read;
        this.write = numberDeserializersNumberDeserializer.write;
        this.IconCompatParcelizer = numberDeserializersNumberDeserializer.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = numberDeserializersNumberDeserializer.RemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer;
        return this;
    }

    public final NumberDeserializersNumberDeserializer AudioAttributesCompatParcelizer(int i) {
        this.write = i;
        return this;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.read = i;
    }
}
