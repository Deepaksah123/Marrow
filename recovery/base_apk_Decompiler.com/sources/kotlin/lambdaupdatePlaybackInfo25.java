package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaupdatePlaybackInfo25 {
    public static final Drawable IconCompatParcelizer(Context context, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        Drawable drawableWrite = getDefaultViewModelCreationExtras.write(context, i);
        if (drawableWrite != null) {
            return drawableWrite;
        }
        throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Invalid resource ID: ", (Object) Integer.valueOf(i)).toString());
    }

    private static Drawable AudioAttributesCompatParcelizer(Resources resources, int i, Resources.Theme theme) {
        toMagicModuleMetaRepoModel.write(resources, "");
        Drawable drawable = _parseDoublePrimitive.read(resources, i, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Invalid resource ID: ", (Object) Integer.valueOf(i)).toString());
    }

    public static final Drawable AudioAttributesCompatParcelizer(Context context, Resources resources, int i) throws XmlPullParserException {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(resources, "");
        XmlResourceParser xml = resources.getXml(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(xml, "");
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found.");
        }
        return AudioAttributesCompatParcelizer(resources, i, context.getTheme());
    }

    public static final anyIgnorals write(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof hasGetter)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((hasGetter) baseContext).getLifecycle();
    }
}
