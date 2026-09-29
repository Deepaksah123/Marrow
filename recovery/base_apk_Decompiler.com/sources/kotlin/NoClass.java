package kotlin;

import android.view.View;
import androidx.compose.ui.platform.AndroidViewsHandler;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0001\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0006\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0011*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0006\u0010\u0012"}, d2 = {"Lo/valueInstantiators;", "p0", "Lo/deserializeFromNumber;", "AudioAttributesCompatParcelizer", "(Lo/valueInstantiators;)Lo/deserializeFromNumber;", "", "write", "(Lo/valueInstantiators;)Ljava/lang/Float;", "", "Lo/JsonTypeResolver;", "", "(Ljava/util/List;I)Lo/JsonTypeResolver;", "Lo/keyDeserializers;", "", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroid/view/View;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NoClass {
    public static final deserializeFromNumber AudioAttributesCompatParcelizer(C0216valueInstantiators c0216valueInstantiators) {
        getAnswerMap getanswermap;
        ArrayList arrayList = new ArrayList();
        defaultFeatures defaultfeatures = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiators, withAbstractTypeResolver.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
        if (defaultfeatures == null || (getanswermap = (getAnswerMap) defaultfeatures.RemoteActionCompatParcelizer()) == null || !((Boolean) getanswermap.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (deserializeFromNumber) arrayList.get(0);
    }

    public static final Float write(C0216valueInstantiators c0216valueInstantiators) {
        getAnswerMap getanswermap;
        ArrayList arrayList = new ArrayList();
        defaultFeatures defaultfeatures = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiators, withAbstractTypeResolver.INSTANCE.AudioAttributesImplBaseParcelizer());
        if (defaultfeatures == null || (getanswermap = (getAnswerMap) defaultfeatures.RemoteActionCompatParcelizer()) == null || !((Boolean) getanswermap.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final JsonTypeResolver write(List<JsonTypeResolver> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getRemoteActionCompatParcelizer() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    public static final String RemoteActionCompatParcelizer(int i) {
        if (C0184keyDeserializers.IconCompatParcelizer(i, C0184keyDeserializers.INSTANCE.RemoteActionCompatParcelizer())) {
            return "android.widget.Button";
        }
        if (C0184keyDeserializers.IconCompatParcelizer(i, C0184keyDeserializers.INSTANCE.IconCompatParcelizer())) {
            return "android.widget.CheckBox";
        }
        if (C0184keyDeserializers.IconCompatParcelizer(i, C0184keyDeserializers.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            return "android.widget.RadioButton";
        }
        if (C0184keyDeserializers.IconCompatParcelizer(i, C0184keyDeserializers.INSTANCE.AudioAttributesCompatParcelizer())) {
            return "android.widget.ImageView";
        }
        if (C0184keyDeserializers.IconCompatParcelizer(i, C0184keyDeserializers.INSTANCE.read())) {
            return "android.widget.Spinner";
        }
        if (C0184keyDeserializers.IconCompatParcelizer(i, C0184keyDeserializers.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final View write(AndroidViewsHandler androidViewsHandler, int i) {
        Object next;
        Iterator<T> it = androidViewsHandler.AudioAttributesCompatParcelizer().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((_assertNotNull) ((Map.Entry) next).getKey()).getIconCompatParcelizer() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        return entry != null ? (AndroidViewHolder) entry.getValue() : null;
    }
}
