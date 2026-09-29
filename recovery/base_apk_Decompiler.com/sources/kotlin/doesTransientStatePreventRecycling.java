package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a3\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getAdapterPosition;", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Lo/findProperty;", "p3", "", "RemoteActionCompatParcelizer", "(Lo/getAdapterPosition;Landroid/content/Context;ZLjava/lang/CharSequence;J)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class doesTransientStatePreventRecycling {
    public static final void RemoteActionCompatParcelizer(getAdapterPosition getadapterposition, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (!getDesignInfoListui_tooling.AudioAttributesCompatParcelizer || findProperty.write(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listRemoteActionCompatParcelizer = getAbsoluteAdapterPosition.INSTANCE.RemoteActionCompatParcelizer(context);
        if (listRemoteActionCompatParcelizer.isEmpty()) {
            return;
        }
        getadapterposition.write();
        int size = listRemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = listRemoteActionCompatParcelizer.get(i);
            getLayoutPosition.write$default(getadapterposition, new getOldPosition(i), resolveInfo.loadLabel(packageManager).toString(), 0, new getAnswerMap() { // from class: o.getBindingAdapter
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return doesTransientStatePreventRecycling.AudioAttributesCompatParcelizer(context, resolveInfo, z, charSequence, j, (isRecyclable) obj);
                }
            }, 4, null);
        }
        getadapterposition.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j, isRecyclable isrecyclable) {
        getAbsoluteAdapterPosition.INSTANCE.IconCompatParcelizer().RemoteActionCompatParcelizer(context, resolveInfo, Boolean.valueOf(z), charSequence, findProperty.AudioAttributesCompatParcelizer(j));
        isrecyclable.write();
        return getShowPopup.INSTANCE;
    }
}
