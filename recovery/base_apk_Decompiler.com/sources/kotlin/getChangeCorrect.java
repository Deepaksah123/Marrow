package kotlin;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class getChangeCorrect implements getTopUserStat {
    float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private VelocityTracker AudioAttributesImplApi26Parcelizer;
    protected setMyStat IconCompatParcelizer;
    float RemoteActionCompatParcelizer;
    private float read;
    private boolean write;

    @Override // kotlin.getTopUserStat
    public boolean write() {
        return false;
    }

    @Override // kotlin.getTopUserStat
    public final void RemoteActionCompatParcelizer(setMyStat setmystat) {
        this.IconCompatParcelizer = setmystat;
    }

    public getChangeCorrect(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.read = viewConfiguration.getScaledMinimumFlingVelocity();
        this.AudioAttributesImplApi21Parcelizer = viewConfiguration.getScaledTouchSlop();
    }

    float write(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    float AudioAttributesCompatParcelizer(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    @Override // kotlin.getTopUserStat
    public final boolean read() {
        return this.write;
    }

    @Override // kotlin.getTopUserStat
    public boolean RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.AudioAttributesImplApi26Parcelizer = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            } else {
                setNeetRanks.IconCompatParcelizer();
            }
            this.RemoteActionCompatParcelizer = write(motionEvent);
            this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent);
            this.write = false;
        } else if (action == 1) {
            if (this.write && this.AudioAttributesImplApi26Parcelizer != null) {
                this.RemoteActionCompatParcelizer = write(motionEvent);
                this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent);
                this.AudioAttributesImplApi26Parcelizer.addMovement(motionEvent);
                this.AudioAttributesImplApi26Parcelizer.computeCurrentVelocity(1000);
                float xVelocity = this.AudioAttributesImplApi26Parcelizer.getXVelocity();
                float yVelocity = this.AudioAttributesImplApi26Parcelizer.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.read) {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.AudioAttributesImplApi26Parcelizer;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.AudioAttributesImplApi26Parcelizer = null;
            }
        } else if (action == 2) {
            float fWrite = write(motionEvent);
            float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent);
            float f = fWrite - this.RemoteActionCompatParcelizer;
            float f2 = fAudioAttributesCompatParcelizer - this.AudioAttributesCompatParcelizer;
            if (!this.write) {
                this.write = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.AudioAttributesImplApi21Parcelizer);
            }
            if (this.write) {
                this.IconCompatParcelizer.read(f, f2);
                this.RemoteActionCompatParcelizer = fWrite;
                this.AudioAttributesCompatParcelizer = fAudioAttributesCompatParcelizer;
                VelocityTracker velocityTracker3 = this.AudioAttributesImplApi26Parcelizer;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3 && (velocityTracker = this.AudioAttributesImplApi26Parcelizer) != null) {
            velocityTracker.recycle();
            this.AudioAttributesImplApi26Parcelizer = null;
        }
        return true;
    }
}
