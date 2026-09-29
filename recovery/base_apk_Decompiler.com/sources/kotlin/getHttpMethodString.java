package kotlin;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import com.marrow.R;

/* JADX INFO: loaded from: classes.dex */
public final class getHttpMethodString {
    private static final void IconCompatParcelizer(View view, final int i, final boolean z, final MagicModuleSubmissionRequestBody<? super View, ? super withUri, getShowPopup> magicModuleSubmissionRequestBody) {
        InvalidTypeIdException.read(view, new finishBranchObject() { // from class: o.getStringForHttpMethod
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return getHttpMethodString.RemoteActionCompatParcelizer(i, magicModuleSubmissionRequestBody, z, view2, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat RemoteActionCompatParcelizer(int i, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, boolean z, View view, WindowInsetsCompat windowInsetsCompat) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(windowInsetsCompat, "");
        _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_verifyendarrayforsingle, "");
        magicModuleSubmissionRequestBody.invoke(view, new withUri(read(view, R.id.initial_padding_top, view.getPaddingTop()), _verifyendarrayforsingle.write, read(view, R.id.initial_padding_bottom, view.getPaddingBottom()), _verifyendarrayforsingle.AudioAttributesCompatParcelizer, read(view, R.id.initial_padding_left, view.getPaddingLeft()), _verifyendarrayforsingle.read, read(view, R.id.initial_padding_right, view.getPaddingRight()), _verifyendarrayforsingle.IconCompatParcelizer));
        return z ? windowInsetsCompat : WindowInsetsCompat.IconCompatParcelizer;
    }

    private static final void write(View view, final int i, final boolean z, final MagicModuleSubmissionRequestBody<? super ViewGroup.MarginLayoutParams, ? super withUri, getShowPopup> magicModuleSubmissionRequestBody) {
        InvalidTypeIdException.read(view, new finishBranchObject() { // from class: o.subrange
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return getHttpMethodString.write(i, z, magicModuleSubmissionRequestBody, view2, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat write(int i, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, View view, WindowInsetsCompat windowInsetsCompat) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(windowInsetsCompat, "");
        _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_verifyendarrayforsingle, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = read(view, R.id.initial_margin_top, marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = read(view, R.id.initial_margin_bottom, marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i4 = read(view, R.id.initial_margin_left, marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        withUri withuri = new withUri(i2, _verifyendarrayforsingle.write, i3, _verifyendarrayforsingle.AudioAttributesCompatParcelizer, i4, _verifyendarrayforsingle.read, read(view, R.id.initial_margin_right, marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0), _verifyendarrayforsingle.IconCompatParcelizer);
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        if (layoutParams5 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            magicModuleSubmissionRequestBody.invoke(marginLayoutParams5, withuri);
            view.setLayoutParams(marginLayoutParams5);
            return z ? windowInsetsCompat : WindowInsetsCompat.IconCompatParcelizer;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static /* synthetic */ void read(View view, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z4 = false;
        }
        if ((i2 & 16) != 0) {
            i = WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer() | WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        }
        read(view, z, z2, z3, z4, i, false);
    }

    private static void read(View view, final boolean z, final boolean z2, final boolean z3, final boolean z4, int i, boolean z5) {
        toMagicModuleMetaRepoModel.write(view, "");
        CmcdHeadersFactory1 cmcdHeadersFactory1 = CmcdHeadersFactory1.INSTANCE;
        if (CmcdHeadersFactory1.RemoteActionCompatParcelizer()) {
            IconCompatParcelizer(view, i, false, new MagicModuleSubmissionRequestBody() { // from class: o.DataSpec1
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getHttpMethodString.read(z, z2, z3, z4, (View) obj, (withUri) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(boolean z, boolean z2, boolean z3, boolean z4, View view, withUri withuri) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(withuri, "");
        if (z) {
            view.setPadding(view.getPaddingLeft(), withuri.read(), view.getPaddingRight(), view.getPaddingBottom());
        }
        if (z2) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), withuri.AudioAttributesCompatParcelizer());
        }
        if (z3) {
            view.setPadding(withuri.RemoteActionCompatParcelizer(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        if (z4) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), withuri.write(), view.getPaddingBottom());
        }
        return getShowPopup.INSTANCE;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(View view, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z4 = false;
        }
        if ((i2 & 16) != 0) {
            i = WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer() | WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        }
        IconCompatParcelizer(view, z, z2, z3, z4, i, false);
    }

    private static void IconCompatParcelizer(View view, final boolean z, final boolean z2, final boolean z3, final boolean z4, int i, boolean z5) {
        toMagicModuleMetaRepoModel.write(view, "");
        CmcdHeadersFactory1 cmcdHeadersFactory1 = CmcdHeadersFactory1.INSTANCE;
        if (CmcdHeadersFactory1.RemoteActionCompatParcelizer()) {
            write(view, i, false, new MagicModuleSubmissionRequestBody() { // from class: o.setHttpBody
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getHttpMethodString.RemoteActionCompatParcelizer(z, z2, z3, z4, (ViewGroup.MarginLayoutParams) obj, (withUri) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, boolean z2, boolean z3, boolean z4, ViewGroup.MarginLayoutParams marginLayoutParams, withUri withuri) {
        toMagicModuleMetaRepoModel.write(marginLayoutParams, "");
        toMagicModuleMetaRepoModel.write(withuri, "");
        if (z) {
            marginLayoutParams.topMargin = withuri.read();
        }
        if (z2) {
            marginLayoutParams.bottomMargin = withuri.AudioAttributesCompatParcelizer();
        }
        if (z3) {
            marginLayoutParams.leftMargin = withuri.RemoteActionCompatParcelizer();
        }
        if (z4) {
            marginLayoutParams.rightMargin = withuri.write();
        }
        return getShowPopup.INSTANCE;
    }

    private static final int read(View view, int i, int i2) {
        Object tag = view.getTag(i);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        view.setTag(i, Integer.valueOf(i2));
        return i2;
    }
}
