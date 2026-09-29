package kotlin;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DefaultDataSourceFactory implements getCreatedOnDateMs {
    private /* synthetic */ String AudioAttributesCompatParcelizer;
    private /* synthetic */ String RemoteActionCompatParcelizer;
    private /* synthetic */ Object read;

    public /* synthetic */ DefaultDataSourceFactory(Object obj, String str, String str2) {
        this.read = obj;
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws Throwable {
        try {
            Object[] objArr = {this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-541636845);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 19349 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, -1577155706, false, "write", new Class[]{(Class) startForeground.IconCompatParcelizer((char) ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.getMode(0) + 19349, Color.alpha(0) + 19), String.class, String.class});
            }
            return ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
