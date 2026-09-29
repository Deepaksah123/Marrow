package kotlin;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/_buildAliasMapping;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lo/findViews;", "p0", "<init>", "(Lo/findViews;)V", "Landroid/text/TextPaint;", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "read", "Lo/findViews;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _buildAliasMapping extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final findViews write;

    public _buildAliasMapping(findViews findviews) {
        this.write = findviews;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint p0) {
        if (p0 != null) {
            findViews findviews = this.write;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findviews, findTypeResolver.INSTANCE)) {
                p0.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(findviews instanceof findValueInstantiator)) {
                throw new RenewEligibleCreator();
            }
            p0.setStyle(Paint.Style.STROKE);
            p0.setStrokeWidth(((findValueInstantiator) this.write).getIconCompatParcelizer());
            p0.setStrokeMiter(((findValueInstantiator) this.write).getRemoteActionCompatParcelizer());
            p0.setStrokeJoin(_deserializeFromNonArray.read(((findValueInstantiator) this.write).getAudioAttributesCompatParcelizer()));
            p0.setStrokeCap(_deserializeFromNonArray.RemoteActionCompatParcelizer(((findValueInstantiator) this.write).getWrite()));
            setCurrentLength read = ((findValueInstantiator) this.write).getRead();
            p0.setPathEffect(read != null ? getCurrentSegmentLength.read(read) : null);
        }
    }
}
