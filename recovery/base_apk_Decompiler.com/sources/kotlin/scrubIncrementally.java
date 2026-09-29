package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.marrow.R;
import kotlin.MediaPeriodId;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/scrubIncrementally;", "", "<init>", "()V", "Landroid/widget/TextView;", "p0", "Landroid/content/Context;", "p1", "Landroid/util/AttributeSet;", "p2", "", "IconCompatParcelizer", "(Landroid/widget/TextView;Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "", "Landroid/graphics/Typeface;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class scrubIncrementally {
    public static final scrubIncrementally INSTANCE = new scrubIncrementally();

    private scrubIncrementally() {
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(TextView p0, Context p1, AttributeSet p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        TypedArray typedArrayObtainStyledAttributes = p1.obtainStyledAttributes(p2, MediaPeriodId.AudioAttributesCompatParcelizer.CustomView);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes, "");
        String string = typedArrayObtainStyledAttributes.getString(1);
        if (typedArrayObtainStyledAttributes.getInt(6, 0) == 0 && p2 != null) {
            try {
                p2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (string != null) {
            p0.setTypeface(RemoteActionCompatParcelizer(p1, string));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @getMagicModuleMeta
    private static Typeface RemoteActionCompatParcelizer(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String string = context.getString(R.string.georgia);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = context.getString(R.string.roboto_medium);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = context.getString(R.string.roboto_light);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String string4 = context.getString(R.string.roboto_bold);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        String string5 = context.getString(R.string.roboto_regular);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) string)) {
            drawTimeBar drawtimebar = drawTimeBar.INSTANCE;
            return drawTimeBar.read("font/Georgia.ttf", context);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) string2)) {
            drawTimeBar drawtimebar2 = drawTimeBar.INSTANCE;
            return drawTimeBar.read("font/Roboto-Medium.ttf", context);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) string3)) {
            drawTimeBar drawtimebar3 = drawTimeBar.INSTANCE;
            return drawTimeBar.read("font/Roboto-Light.ttf", context);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) string4)) {
            drawTimeBar drawtimebar4 = drawTimeBar.INSTANCE;
            return drawTimeBar.read("font/Roboto-Bold.ttf", context);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) string5)) {
            return null;
        }
        drawTimeBar drawtimebar5 = drawTimeBar.INSTANCE;
        return drawTimeBar.read("font/Roboto-Regular.ttf", context);
    }
}
