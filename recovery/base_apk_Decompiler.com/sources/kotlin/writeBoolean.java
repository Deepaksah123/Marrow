package kotlin;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0002\u0016\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"Lo/writeBoolean;", "Landroid/graphics/drawable/RippleDrawable;", "", "p0", "<init>", "(Z)V", "Lo/switchToNext;", "", "p1", "", "AudioAttributesCompatParcelizer", "(JF)V", "isProjected", "()Z", "Landroid/graphics/Rect;", "getDirtyBounds", "()Landroid/graphics/Rect;", "", "write", "(I)V", "RemoteActionCompatParcelizer", "(JF)J", "read", "Z", "Lo/switchToNext;", "IconCompatParcelizer", "Ljava/lang/Integer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class writeBoolean extends RippleDrawable {
    private switchToNext AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Integer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;
    private final boolean read;

    public writeBoolean(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.read = z;
    }

    public final void AudioAttributesCompatParcelizer(long p0, float p1) {
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1);
        switchToNext switchtonext = this.AudioAttributesCompatParcelizer;
        if (switchtonext != null && switchToNext.RemoteActionCompatParcelizer(switchtonext.getIconCompatParcelizer(), jRemoteActionCompatParcelizer)) {
            return;
        }
        this.AudioAttributesCompatParcelizer = switchToNext.write(jRemoteActionCompatParcelizer);
        setColor(ColorStateList.valueOf(RequestPayload.IconCompatParcelizer(jRemoteActionCompatParcelizer)));
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.IconCompatParcelizer;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.read) {
            this.IconCompatParcelizer = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.IconCompatParcelizer = false;
        return dirtyBounds;
    }

    public final void write(int p0) {
        Integer num = this.RemoteActionCompatParcelizer;
        if (num == null || num.intValue() != p0) {
            this.RemoteActionCompatParcelizer = Integer.valueOf(p0);
            read.INSTANCE.AudioAttributesCompatParcelizer(this, p0);
        }
    }

    private final long RemoteActionCompatParcelizer(long p0, float p1) {
        return switchToNext.AudioAttributesCompatParcelizer$default(p0, getQues.write(p1, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/writeBoolean$read;", "", "<init>", "()V", "Landroid/graphics/drawable/RippleDrawable;", "p0", "", "p1", "", "AudioAttributesCompatParcelizer", "(Landroid/graphics/drawable/RippleDrawable;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        public static final read INSTANCE = new read();

        private read() {
        }

        public final void AudioAttributesCompatParcelizer(RippleDrawable p0, int p1) {
            p0.setRadius(p1);
        }
    }
}
