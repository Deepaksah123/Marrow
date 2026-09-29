package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015"}, d2 = {"Lo/ButtonBarLayout;", "Lo/SearchViewSearchAutoComplete;", "Lo/bufferMapProperty;", "p0", "<init>", "(Lo/bufferMapProperty;)V", "", "read", "(F)F", "p1", "write", "(FF)F", "", "p2", "IconCompatParcelizer", "(JFF)F", "AudioAttributesCompatParcelizer", "(FF)J", "RemoteActionCompatParcelizer", "Lo/setCompoundDrawablesWithIntrinsicBounds;", "Lo/setCompoundDrawablesWithIntrinsicBounds;", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonBarLayout implements SearchViewSearchAutoComplete {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setCompoundDrawablesWithIntrinsicBounds AudioAttributesCompatParcelizer;

    @Override // kotlin.SearchViewSearchAutoComplete
    public final float RemoteActionCompatParcelizer() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ButtonBarLayout(bufferMapProperty buffermapproperty) {
        this.AudioAttributesCompatParcelizer = new setCompoundDrawablesWithIntrinsicBounds(setTypeface.RemoteActionCompatParcelizer(), buffermapproperty);
    }

    private final float read(float p0) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0) * Math.signum(p0);
    }

    @Override // kotlin.SearchViewSearchAutoComplete
    public final float write(float p0, float p1) {
        return p0 + read(p1);
    }

    @Override // kotlin.SearchViewSearchAutoComplete
    public final float IconCompatParcelizer(long p0, float p1, float p2) {
        return p1 + this.AudioAttributesCompatParcelizer.write(p2).RemoteActionCompatParcelizer(p0 / 1000000);
    }

    @Override // kotlin.SearchViewSearchAutoComplete
    public final long AudioAttributesCompatParcelizer(float p0, float p1) {
        return this.AudioAttributesCompatParcelizer.read(p1) * 1000000;
    }

    @Override // kotlin.SearchViewSearchAutoComplete
    public final float RemoteActionCompatParcelizer(long p0, float p1, float p2) {
        return this.AudioAttributesCompatParcelizer.write(p2).write(p0 / 1000000);
    }
}
