package kotlin;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public class getChangeTotal extends getChangeCorrect {
    private int read;
    private int write;

    public getChangeTotal(Context context) {
        super(context);
        this.write = -1;
        this.read = 0;
    }

    @Override // kotlin.getChangeCorrect
    final float write(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.read);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // kotlin.getChangeCorrect
    final float AudioAttributesCompatParcelizer(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.read);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    @Override // kotlin.getChangeCorrect, kotlin.getTopUserStat
    public boolean RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.write = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.write = -1;
        } else if (action == 6) {
            int iAudioAttributesCompatParcelizer = SubjectStatV2RSModel.AudioAttributesCompatParcelizer(motionEvent.getAction());
            if (motionEvent.getPointerId(iAudioAttributesCompatParcelizer) == this.write) {
                int i = iAudioAttributesCompatParcelizer == 0 ? 1 : 0;
                this.write = motionEvent.getPointerId(i);
                this.RemoteActionCompatParcelizer = motionEvent.getX(i);
                this.AudioAttributesCompatParcelizer = motionEvent.getY(i);
            }
        }
        int i2 = this.write;
        this.read = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
        try {
            return super.RemoteActionCompatParcelizer(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
