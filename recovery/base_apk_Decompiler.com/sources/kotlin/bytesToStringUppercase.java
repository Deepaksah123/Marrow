package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import com.marrow.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/bytesToStringUppercase;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Lkotlin/Function0;", "", "p1", "Lcom/google/android/material/snackbar/Snackbar;", "RemoteActionCompatParcelizer", "(Landroid/view/View;Lo/getCreatedOnDateMs;)Lcom/google/android/material/snackbar/Snackbar;", "", "IconCompatParcelizer", "(I)I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bytesToStringUppercase {
    public static final bytesToStringUppercase INSTANCE = new bytesToStringUppercase();

    public static int IconCompatParcelizer(int p0) {
        return p0 != 1 ? p0 != 2 ? p0 != 3 ? R.drawable.ic_un_bookmark : R.drawable.ic_bookmark_question : R.drawable.ic_bookmark_star : R.drawable.ic_bookmark_filled_colored;
    }

    private bytesToStringUppercase() {
    }

    public static Snackbar RemoteActionCompatParcelizer(View p0, final getCreatedOnDateMs<getShowPopup> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Snackbar snackbarAudioAttributesCompatParcelizer = Snackbar.AudioAttributesCompatParcelizer(p0, R.string.pearl_delete_snack_text);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(snackbarAudioAttributesCompatParcelizer, "");
        View viewIconCompatParcelizer = snackbarAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewIconCompatParcelizer, "");
        viewIconCompatParcelizer.setPadding(viewIconCompatParcelizer.getPaddingLeft(), 0, viewIconCompatParcelizer.getPaddingRight(), 0);
        viewIconCompatParcelizer.setBackgroundColor(_isNaN.getColor(viewIconCompatParcelizer.getContext(), R.color.go_pro_80bg));
        snackbarAudioAttributesCompatParcelizer.IconCompatParcelizer(R.string.got_it, new View.OnClickListener() { // from class: o.IOUtils
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bytesToStringUppercase.read(p1);
            }
        });
        snackbarAudioAttributesCompatParcelizer.IconCompatParcelizer(_isNaN.getColor(viewIconCompatParcelizer.getContext(), R.color.colorPrimary));
        View viewFindViewById = viewIconCompatParcelizer.findViewById(R.id.snackbar_text);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
        TextView textView = (TextView) viewFindViewById;
        textView.setMaxLines(5);
        Drawable drawable = _isNaN.getDrawable(viewIconCompatParcelizer.getContext(), R.drawable.ic_plan_info);
        if (drawable != null) {
            drawable.setTint(_isNaN.getColor(viewIconCompatParcelizer.getContext(), R.color.pure_white));
        }
        Context context = viewIconCompatParcelizer.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        textView.setCompoundDrawablePadding(updateNavigation.read(context, 12));
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setTextColor(_isNaN.getColor(viewIconCompatParcelizer.getContext(), R.color.pure_white));
        snackbarAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        return snackbarAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
    }
}
