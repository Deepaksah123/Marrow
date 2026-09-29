package kotlin;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.frameSizeBytesByTypeNb;

/* JADX INFO: loaded from: classes3.dex */
public class onChunkData extends frameSizeBytesByTypeNb {
    write write;

    /* synthetic */ onChunkData(write writeVar, byte b) {
        this(writeVar);
    }

    public static onChunkData IconCompatParcelizer(isValidFrameType isvalidframetype) {
        if (isvalidframetype == null) {
            isvalidframetype = new isValidFrameType();
        }
        return RemoteActionCompatParcelizer(new write(isvalidframetype, new RectF(), (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static onChunkData RemoteActionCompatParcelizer(write writeVar) {
        return new read(writeVar);
    }

    private onChunkData(write writeVar) {
        super(writeVar);
        this.write = writeVar;
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.write = new write(this.write, (byte) 0);
        return this;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return !this.write.onPause.isEmpty();
    }

    private void read(float f, float f2, float f3, float f4) {
        if (f == this.write.onPause.left && f2 == this.write.onPause.top && f3 == this.write.onPause.right && f4 == this.write.onPause.bottom) {
            return;
        }
        this.write.onPause.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public final void read(RectF rectF) {
        read(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void read() {
        read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    static class read extends onChunkData {
        read(write writeVar) {
            super(writeVar, (byte) 0);
        }

        @Override // kotlin.frameSizeBytesByTypeNb
        public final void IconCompatParcelizer(Canvas canvas) {
            if (((onChunkData) this).write.onPause.isEmpty()) {
                super.IconCompatParcelizer(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(((onChunkData) this).write.onPause);
            super.IconCompatParcelizer(canvas);
            canvas.restore();
        }
    }

    static final class write extends frameSizeBytesByTypeNb.read {
        private final RectF onPause;

        /* synthetic */ write(isValidFrameType isvalidframetype, RectF rectF, byte b) {
            this(isvalidframetype, rectF);
        }

        /* synthetic */ write(write writeVar, byte b) {
            this(writeVar);
        }

        private write(isValidFrameType isvalidframetype, RectF rectF) {
            super(isvalidframetype);
            this.onPause = rectF;
        }

        private write(write writeVar) {
            super(writeVar);
            this.onPause = writeVar.onPause;
        }

        @Override // o.frameSizeBytesByTypeNb.read, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            onChunkData onchunkdataRemoteActionCompatParcelizer = onChunkData.RemoteActionCompatParcelizer(this);
            onchunkdataRemoteActionCompatParcelizer.invalidateSelf();
            return onchunkdataRemoteActionCompatParcelizer;
        }
    }
}
