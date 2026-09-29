package kotlin;

import android.os.Build;
import android.view.ViewConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\f\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR\u0014\u0010\t\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f"}, d2 = {"Lo/_dateFormat;", "Lo/CoercionConfig;", "Landroid/view/ViewConfiguration;", "p0", "<init>", "(Landroid/view/ViewConfiguration;)V", "AudioAttributesCompatParcelizer", "Landroid/view/ViewConfiguration;", "", "IconCompatParcelizer", "()J", "write", "read", "RemoteActionCompatParcelizer", "", "()F", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _dateFormat implements CoercionConfig {
    private final ViewConfiguration AudioAttributesCompatParcelizer;

    @Override // kotlin.CoercionConfig
    public final long AudioAttributesCompatParcelizer() {
        return 40L;
    }

    public _dateFormat(ViewConfiguration viewConfiguration) {
        this.AudioAttributesCompatParcelizer = viewConfiguration;
    }

    @Override // kotlin.CoercionConfig
    public final long IconCompatParcelizer() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // kotlin.CoercionConfig
    public final long read() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // kotlin.CoercionConfig
    public final float RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getScaledTouchSlop();
    }

    @Override // kotlin.CoercionConfig
    public final float MediaBrowserCompatCustomActionResultReceiver() {
        if (Build.VERSION.SDK_INT >= 34) {
            return _handleContextualResolvable.INSTANCE.write(this.AudioAttributesCompatParcelizer);
        }
        return super.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.CoercionConfig
    public final float AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer.getScaledMaximumFlingVelocity();
    }

    @Override // kotlin.CoercionConfig
    public final float MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer.getScaledMinimumFlingVelocity();
    }

    @Override // kotlin.CoercionConfig
    public final float AudioAttributesImplApi26Parcelizer() {
        if (Build.VERSION.SDK_INT >= 34) {
            return _handleContextualResolvable.INSTANCE.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
        return super.AudioAttributesImplApi26Parcelizer();
    }
}
