package kotlin;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface RemoteActionCompatParcelizer extends IInterface {
    void AudioAttributesCompatParcelizer() throws RemoteException;

    void AudioAttributesCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void IconCompatParcelizer(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void RemoteActionCompatParcelizer() throws RemoteException;

    void RemoteActionCompatParcelizer(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void RemoteActionCompatParcelizer(String str, Bundle bundle) throws RemoteException;

    void RemoteActionCompatParcelizer(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void RemoteActionCompatParcelizer(boolean z) throws RemoteException;

    void read(int i) throws RemoteException;

    void write(int i) throws RemoteException;

    void write(Bundle bundle) throws RemoteException;

    void write(CharSequence charSequence) throws RemoteException;

    void write(boolean z) throws RemoteException;

    public static abstract class IconCompatParcelizer extends Binder implements RemoteActionCompatParcelizer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public IconCompatParcelizer() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static RemoteActionCompatParcelizer write(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof RemoteActionCompatParcelizer)) {
                return (RemoteActionCompatParcelizer) iInterfaceQueryLocalInterface;
            }
            return new C0043IconCompatParcelizer(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    RemoteActionCompatParcelizer(parcel.readString(), (Bundle) read.RemoteActionCompatParcelizer(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    AudioAttributesCompatParcelizer();
                    return true;
                case 3:
                    RemoteActionCompatParcelizer((PlaybackStateCompat) read.RemoteActionCompatParcelizer(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    AudioAttributesCompatParcelizer((MediaMetadataCompat) read.RemoteActionCompatParcelizer(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    RemoteActionCompatParcelizer(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    write((CharSequence) read.RemoteActionCompatParcelizer(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    write((Bundle) read.RemoteActionCompatParcelizer(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    IconCompatParcelizer((ParcelableVolumeInfo) read.RemoteActionCompatParcelizer(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                case 9:
                    read(parcel.readInt());
                    return true;
                case 10:
                    write(parcel.readInt() != 0);
                    return true;
                case 11:
                    RemoteActionCompatParcelizer(parcel.readInt() != 0);
                    return true;
                case 12:
                    write(parcel.readInt());
                    return true;
                case 13:
                    RemoteActionCompatParcelizer();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: renamed from: o.RemoteActionCompatParcelizer$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        static class C0043IconCompatParcelizer implements RemoteActionCompatParcelizer {
            private IBinder write;

            C0043IconCompatParcelizer(IBinder iBinder) {
                this.write = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.write;
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeString(str);
                    read.read(parcelObtain, bundle, 0);
                    this.write.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.write.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    read.read(parcelObtain, playbackStateCompat, 0);
                    this.write.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    read.read(parcelObtain, mediaMetadataCompat, 0);
                    this.write.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    read.read(parcelObtain, list, 0);
                    this.write.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void write(CharSequence charSequence) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        parcelObtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.write.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void write(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    read.read(parcelObtain, bundle, 0);
                    this.write.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void IconCompatParcelizer(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    read.read(parcelObtain, parcelableVolumeInfo, 0);
                    this.write.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void read(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i);
                    this.write.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void write(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.write.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.write.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void write(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i);
                    this.write.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.write.transact(13, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class read {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T RemoteActionCompatParcelizer(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void read(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void read(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                read(parcel, list.get(i2), 0);
            }
        }
    }
}
