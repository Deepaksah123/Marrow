package kotlin;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R+\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00118G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u000f\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/BeanPropertyMap;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lo/throwInternal;", "p0", "", "p1", "<init>", "(Lo/throwInternal;F)V", "Landroid/text/TextPaint;", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "read", "Lo/throwInternal;", "AudioAttributesCompatParcelizer", "F", "Lo/calloc;", "IconCompatParcelizer", "Lo/InputAccessor;", "RemoteActionCompatParcelizer", "()J", "(J)V", "Lo/parseDouble;", "Landroid/graphics/Shader;", "write", "Lo/parseDouble;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeanPropertyMap extends CharacterStyle implements UpdateAppearance {
    private final float AudioAttributesCompatParcelizer;
    private final throwInternal read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(calloc.read(calloc.INSTANCE.IconCompatParcelizer()), null, 2, null);
    private final parseDouble<Shader> write = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o._deserializeNonVanilla
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return BeanPropertyMap.AudioAttributesCompatParcelizer(this.write);
        }
    });

    public BeanPropertyMap(throwInternal throwinternal, float f) {
        this.read = throwinternal;
        this.AudioAttributesCompatParcelizer = f;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.RemoteActionCompatParcelizer.write(calloc.read(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long RemoteActionCompatParcelizer() {
        return ((calloc) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()).getIconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader AudioAttributesCompatParcelizer(BeanPropertyMap beanPropertyMap) {
        if (beanPropertyMap.RemoteActionCompatParcelizer() == 9205357640488583168L || calloc.MediaBrowserCompatCustomActionResultReceiver(beanPropertyMap.RemoteActionCompatParcelizer())) {
            return null;
        }
        return beanPropertyMap.read.IconCompatParcelizer(beanPropertyMap.RemoteActionCompatParcelizer());
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint p0) {
        createFromDouble.write(p0, this.AudioAttributesCompatParcelizer);
        p0.setShader(this.write.getRemoteActionCompatParcelizer());
    }
}
