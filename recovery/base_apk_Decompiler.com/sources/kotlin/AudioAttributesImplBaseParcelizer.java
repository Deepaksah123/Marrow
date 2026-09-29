package kotlin;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;
import kotlin.RemoteActionCompatParcelizer;

/* JADX INFO: loaded from: classes.dex */
public interface AudioAttributesImplBaseParcelizer extends IInterface {
    void AudioAttributesCompatParcelizer() throws RemoteException;

    void AudioAttributesCompatParcelizer(long j) throws RemoteException;

    void AudioAttributesCompatParcelizer(Uri uri, Bundle bundle) throws RemoteException;

    void AudioAttributesCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    void AudioAttributesCompatParcelizer(String str, Bundle bundle) throws RemoteException;

    void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws RemoteException;

    int AudioAttributesImplApi21Parcelizer() throws RemoteException;

    PlaybackStateCompat AudioAttributesImplApi26Parcelizer() throws RemoteException;

    String AudioAttributesImplBaseParcelizer() throws RemoteException;

    PendingIntent IconCompatParcelizer() throws RemoteException;

    void IconCompatParcelizer(int i) throws RemoteException;

    void IconCompatParcelizer(Uri uri, Bundle bundle) throws RemoteException;

    void IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void IconCompatParcelizer(String str, Bundle bundle) throws RemoteException;

    void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws RemoteException;

    void IconCompatParcelizer(boolean z) throws RemoteException;

    List<MediaSessionCompat.QueueItem> MediaBrowserCompatCustomActionResultReceiver() throws RemoteException;

    CharSequence MediaBrowserCompatItemReceiver() throws RemoteException;

    int MediaBrowserCompatMediaItem() throws RemoteException;

    ParcelableVolumeInfo MediaBrowserCompatSearchResultReceiver() throws RemoteException;

    void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws RemoteException;

    Bundle MediaDescriptionCompat() throws RemoteException;

    String MediaMetadataCompat() throws RemoteException;

    int RatingCompat() throws RemoteException;

    MediaMetadataCompat RemoteActionCompatParcelizer() throws RemoteException;

    void RemoteActionCompatParcelizer(float f) throws RemoteException;

    void RemoteActionCompatParcelizer(int i) throws RemoteException;

    void RemoteActionCompatParcelizer(int i, int i2, String str) throws RemoteException;

    void RemoteActionCompatParcelizer(String str, Bundle bundle) throws RemoteException;

    void handleMediaPlayPauseIfPendingOnHandler() throws RemoteException;

    boolean onAddQueueItem() throws RemoteException;

    boolean onCommand() throws RemoteException;

    boolean onCustomAction() throws RemoteException;

    void onFastForward() throws RemoteException;

    void onMediaButtonEvent() throws RemoteException;

    void onPause() throws RemoteException;

    void onPlay() throws RemoteException;

    void onPlayFromMediaId() throws RemoteException;

    long read() throws RemoteException;

    void read(int i, int i2, String str) throws RemoteException;

    void read(long j) throws RemoteException;

    void read(RatingCompat ratingCompat) throws RemoteException;

    void read(String str, Bundle bundle) throws RemoteException;

    void read(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    Bundle write() throws RemoteException;

    void write(int i) throws RemoteException;

    void write(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void write(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    void write(String str, Bundle bundle) throws RemoteException;

    void write(boolean z) throws RemoteException;

    boolean write(KeyEvent keyEvent) throws RemoteException;

    public static abstract class IconCompatParcelizer extends Binder implements AudioAttributesImplBaseParcelizer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public IconCompatParcelizer() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof AudioAttributesImplBaseParcelizer)) {
                return (AudioAttributesImplBaseParcelizer) iInterfaceQueryLocalInterface;
            }
            return new RemoteActionCompatParcelizer(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i) {
                case 1:
                    read(parcel.readString(), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper) write.IconCompatParcelizer(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean zWrite = write((KeyEvent) write.IconCompatParcelizer(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zWrite ? 1 : 0);
                    return true;
                case 3:
                    IconCompatParcelizer(RemoteActionCompatParcelizer.IconCompatParcelizer.write(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer.IconCompatParcelizer.write(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean zOnAddQueueItem = onAddQueueItem();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOnAddQueueItem ? 1 : 0);
                    return true;
                case 6:
                    String strAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                    parcel2.writeNoException();
                    parcel2.writeString(strAudioAttributesImplBaseParcelizer);
                    return true;
                case 7:
                    String strMediaMetadataCompat = MediaMetadataCompat();
                    parcel2.writeNoException();
                    parcel2.writeString(strMediaMetadataCompat);
                    return true;
                case 8:
                    PendingIntent pendingIntentIconCompatParcelizer = IconCompatParcelizer();
                    parcel2.writeNoException();
                    write.AudioAttributesCompatParcelizer(parcel2, pendingIntentIconCompatParcelizer, 1);
                    return true;
                case 9:
                    long j = read();
                    parcel2.writeNoException();
                    parcel2.writeLong(j);
                    return true;
                case 10:
                    ParcelableVolumeInfo parcelableVolumeInfoMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
                    parcel2.writeNoException();
                    write.AudioAttributesCompatParcelizer(parcel2, parcelableVolumeInfoMediaBrowserCompatSearchResultReceiver, 1);
                    return true;
                case 11:
                    read(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    RemoteActionCompatParcelizer(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    onPlayFromMediaId();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    write(parcel.readString(), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    IconCompatParcelizer(parcel.readString(), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    IconCompatParcelizer((Uri) write.IconCompatParcelizer(parcel, Uri.CREATOR), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    read(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    handleMediaPlayPauseIfPendingOnHandler();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    onMediaButtonEvent();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    onPause();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    AudioAttributesCompatParcelizer();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    onFastForward();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    AudioAttributesCompatParcelizer(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    read((RatingCompat) write.IconCompatParcelizer(parcel, RatingCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    AudioAttributesCompatParcelizer(parcel.readString(), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    MediaMetadataCompat mediaMetadataCompatRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                    parcel2.writeNoException();
                    write.AudioAttributesCompatParcelizer(parcel2, mediaMetadataCompatRemoteActionCompatParcelizer, 1);
                    return true;
                case 28:
                    PlaybackStateCompat playbackStateCompatAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                    parcel2.writeNoException();
                    write.AudioAttributesCompatParcelizer(parcel2, playbackStateCompatAudioAttributesImplApi26Parcelizer, 1);
                    return true;
                case 29:
                    List<MediaSessionCompat.QueueItem> listMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                    parcel2.writeNoException();
                    write.AudioAttributesCompatParcelizer(parcel2, listMediaBrowserCompatCustomActionResultReceiver, 1);
                    return true;
                case 30:
                    CharSequence charSequenceMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
                    parcel2.writeNoException();
                    if (charSequenceMediaBrowserCompatItemReceiver != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceMediaBrowserCompatItemReceiver, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    Bundle bundleWrite = write();
                    parcel2.writeNoException();
                    write.AudioAttributesCompatParcelizer(parcel2, bundleWrite, 1);
                    return true;
                case 32:
                    int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
                    parcel2.writeNoException();
                    parcel2.writeInt(iAudioAttributesImplApi21Parcelizer);
                    return true;
                case 33:
                    onPlay();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    RemoteActionCompatParcelizer(parcel.readString(), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    read(parcel.readString(), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    AudioAttributesCompatParcelizer((Uri) write.IconCompatParcelizer(parcel, Uri.CREATOR), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMediaBrowserCompatMediaItem);
                    return true;
                case 38:
                    boolean zOnCustomAction = onCustomAction();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOnCustomAction ? 1 : 0);
                    return true;
                case 39:
                    IconCompatParcelizer(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    IconCompatParcelizer(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    write((MediaDescriptionCompat) write.IconCompatParcelizer(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    AudioAttributesCompatParcelizer((MediaDescriptionCompat) write.IconCompatParcelizer(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    IconCompatParcelizer((MediaDescriptionCompat) write.IconCompatParcelizer(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    write(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    boolean zOnCommand = onCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOnCommand ? 1 : 0);
                    return true;
                case 46:
                    write(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    int iRatingCompat = RatingCompat();
                    parcel2.writeNoException();
                    parcel2.writeInt(iRatingCompat);
                    return true;
                case 48:
                    RemoteActionCompatParcelizer(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    RemoteActionCompatParcelizer(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    Bundle bundleMediaDescriptionCompat = MediaDescriptionCompat();
                    parcel2.writeNoException();
                    write.AudioAttributesCompatParcelizer(parcel2, bundleMediaDescriptionCompat, 1);
                    return true;
                case 51:
                    write((RatingCompat) write.IconCompatParcelizer(parcel, RatingCompat.CREATOR), (Bundle) write.IconCompatParcelizer(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class RemoteActionCompatParcelizer implements AudioAttributesImplBaseParcelizer {
            private IBinder read;

            RemoteActionCompatParcelizer(IBinder iBinder) {
                this.read = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.read;
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void read(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    write.AudioAttributesCompatParcelizer(parcelObtain, resultReceiverWrapper, 0);
                    this.read.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final boolean write(KeyEvent keyEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    write.AudioAttributesCompatParcelizer(parcelObtain, keyEvent, 0);
                    this.read.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void IconCompatParcelizer(kotlin.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongInterface(remoteActionCompatParcelizer);
                    this.read.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(kotlin.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongInterface(remoteActionCompatParcelizer);
                    this.read.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final boolean onAddQueueItem() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final String AudioAttributesImplBaseParcelizer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final String MediaMetadataCompat() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final PendingIntent IconCompatParcelizer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PendingIntent) write.IconCompatParcelizer(parcelObtain2, PendingIntent.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final long read() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final ParcelableVolumeInfo MediaBrowserCompatSearchResultReceiver() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelableVolumeInfo) write.IconCompatParcelizer(parcelObtain2, ParcelableVolumeInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void read(int i, int i2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    this.read.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void RemoteActionCompatParcelizer(int i, int i2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    this.read.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final MediaMetadataCompat RemoteActionCompatParcelizer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (MediaMetadataCompat) write.IconCompatParcelizer(parcelObtain2, MediaMetadataCompat.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final PlaybackStateCompat AudioAttributesImplApi26Parcelizer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PlaybackStateCompat) write.IconCompatParcelizer(parcelObtain2, PlaybackStateCompat.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final List<MediaSessionCompat.QueueItem> MediaBrowserCompatCustomActionResultReceiver() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final CharSequence MediaBrowserCompatItemReceiver() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (CharSequence) write.IconCompatParcelizer(parcelObtain2, TextUtils.CHAR_SEQUENCE_CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final Bundle write() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) write.IconCompatParcelizer(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final int AudioAttributesImplApi21Parcelizer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final boolean onCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final int MediaBrowserCompatMediaItem() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final boolean onCustomAction() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final int RatingCompat() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void write(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    write.AudioAttributesCompatParcelizer(parcelObtain, mediaDescriptionCompat, 0);
                    this.read.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    write.AudioAttributesCompatParcelizer(parcelObtain, mediaDescriptionCompat, 0);
                    parcelObtain.writeInt(i);
                    this.read.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    write.AudioAttributesCompatParcelizer(parcelObtain, mediaDescriptionCompat, 0);
                    this.read.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void write(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    this.read.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final Bundle MediaDescriptionCompat() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(50, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) write.IconCompatParcelizer(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void onPlay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void RemoteActionCompatParcelizer(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.read.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void read(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.read.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    write.AudioAttributesCompatParcelizer(parcelObtain, uri, 0);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.read.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void onPlayFromMediaId() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void write(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.read.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void IconCompatParcelizer(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.read.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void IconCompatParcelizer(Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    write.AudioAttributesCompatParcelizer(parcelObtain, uri, 0);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.read.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void read(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeLong(j);
                    this.read.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void handleMediaPlayPauseIfPendingOnHandler() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void onMediaButtonEvent() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void onPause() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void onFastForward() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.read.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeLong(j);
                    this.read.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void read(RatingCompat ratingCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    write.AudioAttributesCompatParcelizer(parcelObtain, ratingCompat, 0);
                    this.read.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void write(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    write.AudioAttributesCompatParcelizer(parcelObtain, ratingCompat, 0);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.read.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void RemoteActionCompatParcelizer(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeFloat(f);
                    this.read.transact(49, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void write(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.read.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void IconCompatParcelizer(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    this.read.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void IconCompatParcelizer(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.read.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void RemoteActionCompatParcelizer(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    this.read.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    write.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.read.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class write {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T IconCompatParcelizer(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void AudioAttributesCompatParcelizer(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void AudioAttributesCompatParcelizer(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                AudioAttributesCompatParcelizer(parcel, list.get(i2), 1);
            }
        }
    }
}
