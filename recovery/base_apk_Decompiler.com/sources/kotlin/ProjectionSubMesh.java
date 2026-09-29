package kotlin;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ProjectionSubMesh {
    public static final Pair<Float, Float> AudioAttributesCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.getLocationInWindow(new int[2]);
        return new Pair<>(Float.valueOf(r0[0]), Float.valueOf(r0[1] - (view.getHeight() << 1)));
    }

    public static final GradientDrawable read(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        int i = DataSourceBitmapLoaderExternalSyntheticLambda1.read(context, 16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setColor(-16777216);
        return gradientDrawable;
    }

    public static final void read(View view, int i, int i2) {
        toMagicModuleMetaRepoModel.write(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        view.setPadding(i2, i2, i2, i2);
    }

    public static final void IconCompatParcelizer(View view, int i, int i2) {
        toMagicModuleMetaRepoModel.write(view, "");
        IconCompatParcelizer(view, i, i2, 0);
    }

    public static final void IconCompatParcelizer(View view, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i2);
            view.setLayoutParams(layoutParams);
        }
        view.setPadding(i3, i3, i3, i3);
    }

    public static final void write(View view, int i) {
        toMagicModuleMetaRepoModel.write(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void read(TextView textView, int i) {
        toMagicModuleMetaRepoModel.write(textView, "");
        textView.setTextSize(2, i);
    }
}
