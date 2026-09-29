package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\b\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0005\u0010\u0011J\u001b\u0010\u0005\u001a\u00020\t*\u00020\u00122\u0006\u0010\b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0005\u0010\u0013R(\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u00148\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R@\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00168\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c"}, d2 = {"Lo/getAbsoluteAdapterPosition;", "", "<init>", "()V", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "()Landroid/content/Intent;", "Landroid/content/pm/ResolveInfo;", "p0", "", "p1", "write", "(Landroid/content/pm/ResolveInfo;Z)Landroid/content/Intent;", "Landroid/content/Context;", "", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Ljava/util/List;", "(Landroid/content/pm/ResolveInfo;Landroid/content/Context;)Z", "Landroid/content/pm/ActivityInfo;", "(Landroid/content/pm/ActivityInfo;Landroid/content/Context;)Z", "Lkotlin/Function1;", "Lo/getAnswerMap;", "Lkotlin/Function5;", "", "Lo/findProperty;", "", "IconCompatParcelizer", "Lo/MagicModuleRepository;", "()Lo/MagicModuleRepository;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAbsoluteAdapterPosition {
    public static final getAbsoluteAdapterPosition INSTANCE = new getAbsoluteAdapterPosition();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static getAnswerMap<? super Context, ? extends List<? extends ResolveInfo>> write = new getAnswerMap() { // from class: o.clearTmpDetachFlag
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return getAbsoluteAdapterPosition.write((Context) obj);
        }
    };

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static MagicModuleRepository<? super Context, ? super ResolveInfo, ? super Boolean, ? super CharSequence, ? super findProperty, getShowPopup> AudioAttributesCompatParcelizer = new MagicModuleRepository() { // from class: o.flagRemovedAndOffsetPosition
        @Override // kotlin.MagicModuleRepository
        public final Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return getAbsoluteAdapterPosition.AudioAttributesCompatParcelizer((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (findProperty) obj5);
        }
    };
    public static final int AudioAttributesCompatParcelizer = 8;

    private getAbsoluteAdapterPosition() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List write(Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(INSTANCE.AudioAttributesCompatParcelizer(), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
            if (INSTANCE.AudioAttributesCompatParcelizer(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public final MagicModuleRepository<Context, ResolveInfo, Boolean, CharSequence, findProperty, getShowPopup> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, findProperty findproperty) {
        String string = charSequence.subSequence(findProperty.MediaBrowserCompatCustomActionResultReceiver(findproperty.getIconCompatParcelizer()), findProperty.AudioAttributesImplApi26Parcelizer(findproperty.getIconCompatParcelizer())).toString();
        Intent intentWrite = INSTANCE.write(resolveInfo, z);
        intentWrite.putExtra("android.intent.extra.PROCESS_TEXT", string);
        context.startActivity(intentWrite);
        return getShowPopup.INSTANCE;
    }

    private final Intent AudioAttributesCompatParcelizer() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public final Intent write(ResolveInfo p0, boolean p1) {
        return AudioAttributesCompatParcelizer().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", p1).setClassName(((PackageItemInfo) p0.activityInfo).packageName, ((PackageItemInfo) p0.activityInfo).name);
    }

    public final List<ResolveInfo> RemoteActionCompatParcelizer(Context p0) {
        return (List) write.invoke(p0);
    }

    private final boolean AudioAttributesCompatParcelizer(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(((PackageItemInfo) resolveInfo.activityInfo).packageName) || AudioAttributesCompatParcelizer(resolveInfo.activityInfo, context);
    }

    private final boolean AudioAttributesCompatParcelizer(ActivityInfo activityInfo, Context context) {
        if (((ComponentInfo) activityInfo).exported) {
            return activityInfo.permission == null || context.checkSelfPermission(activityInfo.permission) == 0;
        }
        return false;
    }
}
