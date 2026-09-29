package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class setReleaseMonth {
    private static volatile boolean AudioAttributesCompatParcelizer = true;

    public static Drawable IconCompatParcelizer(Context context, Context context2, int i) {
        return IconCompatParcelizer(context, context2, i, null);
    }

    public static Drawable read(Context context, int i, Resources.Theme theme) {
        return IconCompatParcelizer(context, context, i, theme);
    }

    private static Drawable IconCompatParcelizer(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (AudioAttributesCompatParcelizer) {
                return AudioAttributesCompatParcelizer(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return _isNaN.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            AudioAttributesCompatParcelizer = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return write(context2, i, theme);
    }

    private static Drawable AudioAttributesCompatParcelizer(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            initializeViewTreeOwners initializeviewtreeowners = new initializeViewTreeOwners(context, theme);
            initializeviewtreeowners.read(theme.getResources().getConfiguration());
            context = initializeviewtreeowners;
        }
        return getDefaultViewModelCreationExtras.write(context, i);
    }

    private static Drawable write(Context context, int i, Resources.Theme theme) {
        return _parseDoublePrimitive.read(context.getResources(), i, theme);
    }
}
