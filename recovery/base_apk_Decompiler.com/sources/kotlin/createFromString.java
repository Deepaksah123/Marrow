package kotlin;

import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/createFromString;", "Landroid/text/style/ClickableSpan;", "Lo/_deserializeFromObjectId;", "p0", "<init>", "(Lo/_deserializeFromObjectId;)V", "Landroid/view/View;", "", "onClick", "(Landroid/view/View;)V", "RemoteActionCompatParcelizer", "Lo/_deserializeFromObjectId;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class createFromString extends ClickableSpan {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _deserializeFromObjectId AudioAttributesCompatParcelizer;

    public createFromString(_deserializeFromObjectId _deserializefromobjectid) {
        this.AudioAttributesCompatParcelizer = _deserializefromobjectid;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View p0) {
        _addExplicitAnyCreator audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
    }
}
