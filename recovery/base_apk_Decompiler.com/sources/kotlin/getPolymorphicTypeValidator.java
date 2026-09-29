package kotlin;

import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getPolymorphicTypeValidator;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Landroid/view/ActionMode$Callback;", "p1", "", "p2", "Landroid/view/ActionMode;", "AudioAttributesCompatParcelizer", "(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getPolymorphicTypeValidator {
    public static final getPolymorphicTypeValidator INSTANCE = new getPolymorphicTypeValidator();

    private getPolymorphicTypeValidator() {
    }

    public final ActionMode AudioAttributesCompatParcelizer(View p0, ActionMode.Callback p1, int p2) {
        return p0.startActionMode(p1, p2);
    }
}
