package kotlin;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0006\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u000f\u001a\u0004\u0018\u00010\n*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0019J3\u0010\u000f\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u000f\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b"}, d2 = {"Lo/_collectIgnorals;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "p0", "p1", "", "p2", "Lo/setTitleOptional;", "", "Landroid/view/View;", "p3", "p4", "", "RemoteActionCompatParcelizer", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLo/setTitleOptional;Z)V", "Lo/_removeUnwantedAccessor;", "IconCompatParcelizer", "()Lo/_removeUnwantedAccessor;", "", "", "(Ljava/util/List;I)V", "write", "()Z", "(Lo/setTitleOptional;Ljava/lang/String;)Ljava/lang/String;", "(Lo/setTitleOptional;Lo/setTitleOptional;)V", "Lo/_removeUnwantedAccessor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class _collectIgnorals {
    public static final _collectIgnorals INSTANCE = new _collectIgnorals();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final _removeUnwantedAccessor RemoteActionCompatParcelizer = new _removeUnwantedProperties();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final _removeUnwantedAccessor write = IconCompatParcelizer();

    private _collectIgnorals() {
    }

    private static _removeUnwantedAccessor IconCompatParcelizer() {
        try {
            Class<?> cls = Class.forName("o.BubbleEntry");
            toMagicModuleMetaRepoModel.read(cls, "");
            return (_removeUnwantedAccessor) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(setTitleOptional<String, String> settitleoptional, String str) {
        toMagicModuleMetaRepoModel.write(settitleoptional, "");
        toMagicModuleMetaRepoModel.write(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : settitleoptional.entrySet()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) entry.getValue(), (Object) str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) arrayList);
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(setTitleOptional<String, String> settitleoptional, setTitleOptional<String, View> settitleoptional2) {
        toMagicModuleMetaRepoModel.write(settitleoptional, "");
        toMagicModuleMetaRepoModel.write(settitleoptional2, "");
        for (int remoteActionCompatParcelizer = settitleoptional.getRemoteActionCompatParcelizer() - 1; remoteActionCompatParcelizer >= 0; remoteActionCompatParcelizer--) {
            if (!settitleoptional2.containsKey(settitleoptional.IconCompatParcelizer(remoteActionCompatParcelizer))) {
                settitleoptional.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
            }
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Fragment p0, Fragment p1, boolean p2, setTitleOptional<String, View> p3, boolean p4) {
        _intOverflow enterTransitionCallback;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        if (p2) {
            enterTransitionCallback = p1.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = p0.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            setTitleOptional<String, View> settitleoptional = p3;
            ArrayList arrayList = new ArrayList(settitleoptional.size());
            Iterator<Map.Entry<String, View>> it = settitleoptional.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(settitleoptional.size());
            Iterator<Map.Entry<String, View>> it2 = settitleoptional.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
        }
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(List<? extends View> p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(p1);
        }
    }

    @getMagicModuleMeta
    public static final boolean write() {
        return (RemoteActionCompatParcelizer == null && write == null) ? false : true;
    }
}
