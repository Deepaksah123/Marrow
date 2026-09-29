package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class getFirstSampleNumber {
    private float IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private TrackOutput write;
    private final TextPaint AudioAttributesCompatParcelizer = new TextPaint(1);
    private final SeekMapSeekPoints read = new SeekMapSeekPoints() { // from class: o.getFirstSampleNumber.4
        @Override // kotlin.SeekMapSeekPoints
        public final void RemoteActionCompatParcelizer(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            getFirstSampleNumber.AudioAttributesCompatParcelizer(getFirstSampleNumber.this);
            read readVar = (read) getFirstSampleNumber.this.RemoteActionCompatParcelizer.get();
            if (readVar != null) {
                readVar.AudioAttributesCompatParcelizer();
            }
        }

        @Override // kotlin.SeekMapSeekPoints
        public final void AudioAttributesCompatParcelizer(int i) {
            getFirstSampleNumber.AudioAttributesCompatParcelizer(getFirstSampleNumber.this);
            read readVar = (read) getFirstSampleNumber.this.RemoteActionCompatParcelizer.get();
            if (readVar != null) {
                readVar.AudioAttributesCompatParcelizer();
            }
        }
    };
    private boolean AudioAttributesImplApi26Parcelizer = true;
    private WeakReference<read> RemoteActionCompatParcelizer = new WeakReference<>(null);

    public interface read {
        void AudioAttributesCompatParcelizer();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    static /* synthetic */ boolean AudioAttributesCompatParcelizer(getFirstSampleNumber getfirstsamplenumber) {
        getfirstsamplenumber.AudioAttributesImplApi26Parcelizer = true;
        return true;
    }

    public getFirstSampleNumber(read readVar) {
        IconCompatParcelizer(readVar);
    }

    private void IconCompatParcelizer(read readVar) {
        this.RemoteActionCompatParcelizer = new WeakReference<>(readVar);
    }

    public final TextPaint RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    public final void write() {
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    private void AudioAttributesCompatParcelizer(String str) {
        this.MediaBrowserCompatCustomActionResultReceiver = read(str);
        this.IconCompatParcelizer = RemoteActionCompatParcelizer(str);
        this.AudioAttributesImplApi26Parcelizer = false;
    }

    public final float IconCompatParcelizer(String str) {
        if (!this.AudioAttributesImplApi26Parcelizer) {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }
        AudioAttributesCompatParcelizer(str);
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private float read(CharSequence charSequence) {
        return charSequence == null ? BitmapDescriptorFactory.HUE_RED : this.AudioAttributesCompatParcelizer.measureText(charSequence, 0, charSequence.length());
    }

    public final float write(String str) {
        if (!this.AudioAttributesImplApi26Parcelizer) {
            return this.IconCompatParcelizer;
        }
        AudioAttributesCompatParcelizer(str);
        return this.IconCompatParcelizer;
    }

    private float RemoteActionCompatParcelizer(String str) {
        return str == null ? BitmapDescriptorFactory.HUE_RED : Math.abs(this.AudioAttributesCompatParcelizer.getFontMetrics().ascent);
    }

    public final TrackOutput read() {
        return this.write;
    }

    public final void write(TrackOutput trackOutput, Context context) {
        if (this.write != trackOutput) {
            this.write = trackOutput;
            if (trackOutput != null) {
                trackOutput.read(context, this.AudioAttributesCompatParcelizer, this.read);
                read readVar = this.RemoteActionCompatParcelizer.get();
                if (readVar != null) {
                    this.AudioAttributesCompatParcelizer.drawableState = readVar.getState();
                }
                trackOutput.write(context, this.AudioAttributesCompatParcelizer, this.read);
                this.AudioAttributesImplApi26Parcelizer = true;
            }
            read readVar2 = this.RemoteActionCompatParcelizer.get();
            if (readVar2 != null) {
                readVar2.AudioAttributesCompatParcelizer();
                readVar2.onStateChange(readVar2.getState());
            }
        }
    }

    public final void write(Context context) {
        this.write.write(context, this.AudioAttributesCompatParcelizer, this.read);
    }
}
