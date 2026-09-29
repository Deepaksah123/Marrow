package kotlin;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Iterator;
import kotlin.resolveClassAnnotations;

/* JADX INFO: loaded from: classes2.dex */
public final class createPrimordial {
    private static final int AudioAttributesCompatParcelizer = resolveClassAnnotations.AudioAttributesCompatParcelizer.pooling_container_listener_holder_tag;
    private static final int read = resolveClassAnnotations.AudioAttributesCompatParcelizer.is_pooling_container_tag;

    public static final void RemoteActionCompatParcelizer(View view, resolveWithoutSuperTypes resolvewithoutsupertypes) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(resolvewithoutsupertypes, "");
        read(view).RemoteActionCompatParcelizer(resolvewithoutsupertypes);
    }

    public static final void IconCompatParcelizer(View view, resolveWithoutSuperTypes resolvewithoutsupertypes) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(resolvewithoutsupertypes, "");
        read(view).read(resolvewithoutsupertypes);
    }

    private static boolean IconCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        Object tag = view.getTag(read);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void write(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setTag(read, Boolean.TRUE);
    }

    public static final boolean RemoteActionCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        Iterator<ViewParent> itWrite = findConstructorName.read(view).write();
        while (itWrite.hasNext()) {
            Object obj = (ViewParent) itWrite.next();
            if ((obj instanceof View) && IconCompatParcelizer((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void AudioAttributesCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        Iterator<View> itWrite = findConstructorName.AudioAttributesCompatParcelizer(view).write();
        while (itWrite.hasNext()) {
            read(itWrite.next()).IconCompatParcelizer();
        }
    }

    public static final void write(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        Iterator<View> itWrite = getSerializerForJavaNioFilePath.read(viewGroup).write();
        while (itWrite.hasNext()) {
            read(itWrite.next()).IconCompatParcelizer();
        }
    }

    private static final createArrayType read(View view) {
        int i = AudioAttributesCompatParcelizer;
        createArrayType createarraytype = (createArrayType) view.getTag(i);
        if (createarraytype != null) {
            return createarraytype;
        }
        createArrayType createarraytype2 = new createArrayType();
        view.setTag(i, createarraytype2);
        return createarraytype2;
    }
}
