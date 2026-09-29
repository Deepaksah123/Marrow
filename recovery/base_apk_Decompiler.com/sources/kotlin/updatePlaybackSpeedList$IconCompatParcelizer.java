package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/updatePlaybackSpeedList$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "write$6a058029", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class updatePlaybackSpeedList$IconCompatParcelizer {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    private updatePlaybackSpeedList$IconCompatParcelizer() {
    }

    @getMagicModuleMeta
    public static Object write$6a058029(String p0, Object p1) throws Throwable {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        try {
            Object[] objArr = {p0, p1};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-50847606);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Process.getGidForName("") + 14259, ExpandableListView.getPackedPositionGroup(0L) + 25, -2102270945, false, null, new Class[]{String.class, (Class) startForeground.IconCompatParcelizer((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 8691, KeyEvent.normalizeMetaState(0) + 28)});
            }
            Object objNewInstance = ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
            int i2 = IconCompatParcelizer;
            int i3 = i2 & 25;
            int i4 = ((i2 ^ 25) | i3) << 1;
            int i5 = -((i2 | 25) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr2 = {60000};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(646896849);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 14257 - ((byte) KeyEvent.getModifierMetaStateMask()), 25 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1489442884, false, "IconCompatParcelizer", new Class[]{Integer.TYPE});
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer2).invoke(objNewInstance, objArr2);
            Object[] objArr3 = {60000};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(730886077);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.argb(0, 0, 0, 0), ImageFormat.getBitsPerPixel(0) + 14259, 25 - Drawable.resolveOpacity(0, 0), 1440328488, false, "read", new Class[]{Integer.TYPE});
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(objInvoke, objArr3);
            int i8 = IconCompatParcelizer;
            int i9 = ((i8 | 113) << 1) - (i8 ^ 113);
            RemoteActionCompatParcelizer = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 90 / 0;
            }
            return objInvoke2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public /* synthetic */ updatePlaybackSpeedList$IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
