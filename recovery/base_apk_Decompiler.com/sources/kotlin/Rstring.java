package kotlin;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Rstring {
    public View AudioAttributesCompatParcelizer;
    public final Map<String, Object> read = new HashMap();
    public final ArrayList<Transition> IconCompatParcelizer = new ArrayList<>();

    @Deprecated
    public Rstring() {
    }

    public Rstring(View view) {
        this.AudioAttributesCompatParcelizer = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Rstring)) {
            return false;
        }
        Rstring rstring = (Rstring) obj;
        return this.AudioAttributesCompatParcelizer == rstring.AudioAttributesCompatParcelizer && this.read.equals(rstring.read);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("    view = ");
        sb2.append(this.AudioAttributesCompatParcelizer);
        sb2.append("\n");
        String string2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string2);
        sb3.append("    values:");
        String string3 = sb3.toString();
        for (String str : this.read.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string3);
            sb4.append("    ");
            sb4.append(str);
            sb4.append(": ");
            sb4.append(this.read.get(str));
            sb4.append("\n");
            string3 = sb4.toString();
        }
        return string3;
    }
}
