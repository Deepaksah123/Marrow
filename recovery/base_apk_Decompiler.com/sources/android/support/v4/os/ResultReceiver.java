package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.AudioAttributesImplApi21Parcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ResultReceiver createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ResultReceiver[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static ResultReceiver IconCompatParcelizer(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        private static ResultReceiver[] RemoteActionCompatParcelizer(int i) {
            return new ResultReceiver[i];
        }
    };
    AudioAttributesImplApi21Parcelizer write;
    final boolean read = false;
    final Handler IconCompatParcelizer = null;

    protected void AudioAttributesCompatParcelizer(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    class IconCompatParcelizer implements Runnable {
        final Bundle IconCompatParcelizer;
        final int write;

        IconCompatParcelizer(int i, Bundle bundle) {
            this.write = i;
            this.IconCompatParcelizer = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ResultReceiver.this.AudioAttributesCompatParcelizer(this.write, this.IconCompatParcelizer);
        }
    }

    class read extends AudioAttributesImplApi21Parcelizer.read {
        read() {
        }

        @Override // kotlin.AudioAttributesImplApi21Parcelizer
        public final void write(int i, Bundle bundle) {
            if (ResultReceiver.this.IconCompatParcelizer != null) {
                ResultReceiver.this.IconCompatParcelizer.post(ResultReceiver.this.new IconCompatParcelizer(i, bundle));
            } else {
                ResultReceiver.this.AudioAttributesCompatParcelizer(i, bundle);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.write == null) {
                this.write = new read();
            }
            parcel.writeStrongBinder(this.write.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.write = AudioAttributesImplApi21Parcelizer.read.IconCompatParcelizer(parcel.readStrongBinder());
    }
}
