package kotlin;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class getChangeWrong implements GestureDetector.OnDoubleTapListener {
    private getGuessedStat read;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public getChangeWrong(getGuessedStat getguessedstat) {
        IconCompatParcelizer(getguessedstat);
    }

    private void IconCompatParcelizer(getGuessedStat getguessedstat) {
        this.read = getguessedstat;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF rectFRemoteActionCompatParcelizer;
        getGuessedStat getguessedstat = this.read;
        if (getguessedstat == null) {
            return false;
        }
        getguessedstat.IconCompatParcelizer();
        if (this.read.MediaBrowserCompatCustomActionResultReceiver() != null && (rectFRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer()) != null) {
            if (rectFRemoteActionCompatParcelizer.contains(motionEvent.getX(), motionEvent.getY())) {
                float f = rectFRemoteActionCompatParcelizer.left;
                rectFRemoteActionCompatParcelizer.width();
                float f2 = rectFRemoteActionCompatParcelizer.top;
                rectFRemoteActionCompatParcelizer.height();
                this.read.MediaBrowserCompatCustomActionResultReceiver();
                return true;
            }
            this.read.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (this.read.AudioAttributesImplBaseParcelizer() != null) {
            this.read.AudioAttributesImplBaseParcelizer();
            motionEvent.getX();
            motionEvent.getY();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        getGuessedStat getguessedstat = this.read;
        if (getguessedstat == null) {
            return false;
        }
        try {
            float fMediaDescriptionCompat = getguessedstat.MediaDescriptionCompat();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (fMediaDescriptionCompat < this.read.MediaBrowserCompatItemReceiver()) {
                getGuessedStat getguessedstat2 = this.read;
                getguessedstat2.RemoteActionCompatParcelizer(getguessedstat2.MediaBrowserCompatItemReceiver(), x, y, true);
            } else if (fMediaDescriptionCompat >= this.read.MediaBrowserCompatItemReceiver() && fMediaDescriptionCompat < this.read.AudioAttributesImplApi26Parcelizer()) {
                getGuessedStat getguessedstat3 = this.read;
                getguessedstat3.RemoteActionCompatParcelizer(getguessedstat3.AudioAttributesImplApi26Parcelizer(), x, y, true);
            } else {
                getGuessedStat getguessedstat4 = this.read;
                getguessedstat4.RemoteActionCompatParcelizer(getguessedstat4.AudioAttributesImplApi21Parcelizer(), x, y, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }
}
