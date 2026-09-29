package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultImpl {
    private static final String handleMediaPlayPauseIfPendingOnHandler;
    private static final String onAddQueueItem;
    private static final String onCommand;
    private static final String onFastForward;
    private static final String onMediaButtonEvent;
    private static final String onPause;
    private static final String onPlay;
    private static final String onPlayFromMediaId;
    private static final String onPlayFromSearch;
    private static final String onPlayFromUri;
    private static final String onPrepare;
    private static final String onPrepareFromMediaId;
    private static final String onPrepareFromSearch;
    private static final String onPrepareFromUri;
    private static final String onRemoveQueueItem;
    private static final String onRemoveQueueItemAt;
    private static final String onRewind;
    private static final String onSeekTo;
    private static final String onSetShuffleMode;
    public final Bitmap AudioAttributesCompatParcelizer;
    public final float AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final float AudioAttributesImplBaseParcelizer;
    public final float IconCompatParcelizer;
    public final Layout.Alignment MediaBrowserCompatCustomActionResultReceiver;
    public final float MediaBrowserCompatItemReceiver;
    public final Layout.Alignment MediaBrowserCompatMediaItem;
    public final int MediaBrowserCompatSearchResultReceiver;
    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final float MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final CharSequence RatingCompat;
    public final float RemoteActionCompatParcelizer;
    public final int onCustomAction;
    public final int read;
    public final int write;

    /* synthetic */ getDefaultImpl(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, byte b) {
        this(charSequence, alignment, alignment2, bitmap, f, i, i2, f2, i3, i4, f3, f4, f5, z, i5, i6, f6);
    }

    static {
        new write().RemoteActionCompatParcelizer("").write();
        onPlayFromUri = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        onMediaButtonEvent = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(17);
        onRemoveQueueItem = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        onPause = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        handleMediaPlayPauseIfPendingOnHandler = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        onCommand = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(18);
        onPlay = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        onPlayFromMediaId = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
        onFastForward = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
        onPlayFromSearch = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(7);
        onPrepareFromMediaId = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(8);
        onSeekTo = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(9);
        onPrepareFromUri = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(10);
        onPrepareFromSearch = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(11);
        onAddQueueItem = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(12);
        onRemoveQueueItemAt = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(13);
        onSetShuffleMode = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(14);
        onRewind = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(15);
        onPrepare = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(16);
    }

    private getDefaultImpl(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence != null) {
            buildTypeSerializer.IconCompatParcelizer(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.RatingCompat = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.RatingCompat = charSequence.toString();
        } else {
            this.RatingCompat = null;
        }
        this.MediaBrowserCompatMediaItem = alignment;
        this.MediaBrowserCompatCustomActionResultReceiver = alignment2;
        this.AudioAttributesCompatParcelizer = bitmap;
        this.IconCompatParcelizer = f;
        this.read = i;
        this.write = i2;
        this.AudioAttributesImplApi21Parcelizer = f2;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.AudioAttributesImplBaseParcelizer = f4;
        this.RemoteActionCompatParcelizer = f5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
        this.onCustomAction = i5;
        this.MediaMetadataCompat = i4;
        this.MediaDescriptionCompat = f3;
        this.MediaBrowserCompatSearchResultReceiver = i6;
        this.MediaBrowserCompatItemReceiver = f6;
    }

    public final write AudioAttributesCompatParcelizer() {
        return new write(this, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getDefaultImpl getdefaultimpl = (getDefaultImpl) obj;
        if (!TextUtils.equals(this.RatingCompat, getdefaultimpl.RatingCompat) || this.MediaBrowserCompatMediaItem != getdefaultimpl.MediaBrowserCompatMediaItem || this.MediaBrowserCompatCustomActionResultReceiver != getdefaultimpl.MediaBrowserCompatCustomActionResultReceiver) {
            return false;
        }
        Bitmap bitmap = this.AudioAttributesCompatParcelizer;
        if (bitmap != null) {
            Bitmap bitmap2 = getdefaultimpl.AudioAttributesCompatParcelizer;
            if (bitmap2 == null || !bitmap.sameAs(bitmap2)) {
                return false;
            }
        } else if (getdefaultimpl.AudioAttributesCompatParcelizer != null) {
            return false;
        }
        return this.IconCompatParcelizer == getdefaultimpl.IconCompatParcelizer && this.read == getdefaultimpl.read && this.write == getdefaultimpl.write && this.AudioAttributesImplApi21Parcelizer == getdefaultimpl.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == getdefaultimpl.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplBaseParcelizer == getdefaultimpl.AudioAttributesImplBaseParcelizer && this.RemoteActionCompatParcelizer == getdefaultimpl.RemoteActionCompatParcelizer && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == getdefaultimpl.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.onCustomAction == getdefaultimpl.onCustomAction && this.MediaMetadataCompat == getdefaultimpl.MediaMetadataCompat && this.MediaDescriptionCompat == getdefaultimpl.MediaDescriptionCompat && this.MediaBrowserCompatSearchResultReceiver == getdefaultimpl.MediaBrowserCompatSearchResultReceiver && this.MediaBrowserCompatItemReceiver == getdefaultimpl.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        return parseSmta.read(this.RatingCompat, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, Float.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.read), Integer.valueOf(this.write), Float.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(this.AudioAttributesImplApi26Parcelizer), Float.valueOf(this.AudioAttributesImplBaseParcelizer), Float.valueOf(this.RemoteActionCompatParcelizer), Boolean.valueOf(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), Integer.valueOf(this.onCustomAction), Integer.valueOf(this.MediaMetadataCompat), Float.valueOf(this.MediaDescriptionCompat), Integer.valueOf(this.MediaBrowserCompatSearchResultReceiver), Float.valueOf(this.MediaBrowserCompatItemReceiver));
    }

    public static final class write {
        private Bitmap AudioAttributesCompatParcelizer;
        private Layout.Alignment AudioAttributesImplApi21Parcelizer;
        private float AudioAttributesImplApi26Parcelizer;
        private float AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private float MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private float MediaBrowserCompatMediaItem;
        private CharSequence MediaBrowserCompatSearchResultReceiver;
        private int MediaDescriptionCompat;
        private Layout.Alignment MediaMetadataCompat;
        private int RatingCompat;
        private float RemoteActionCompatParcelizer;
        private int handleMediaPlayPauseIfPendingOnHandler;
        private boolean onAddQueueItem;
        private float read;
        private int write;

        /* synthetic */ write(getDefaultImpl getdefaultimpl, byte b) {
            this(getdefaultimpl);
        }

        public write() {
            this.MediaBrowserCompatSearchResultReceiver = null;
            this.AudioAttributesCompatParcelizer = null;
            this.MediaMetadataCompat = null;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.read = -3.4028235E38f;
            this.write = Integer.MIN_VALUE;
            this.IconCompatParcelizer = Integer.MIN_VALUE;
            this.MediaBrowserCompatCustomActionResultReceiver = -3.4028235E38f;
            this.MediaBrowserCompatItemReceiver = Integer.MIN_VALUE;
            this.MediaDescriptionCompat = Integer.MIN_VALUE;
            this.MediaBrowserCompatMediaItem = -3.4028235E38f;
            this.AudioAttributesImplApi26Parcelizer = -3.4028235E38f;
            this.RemoteActionCompatParcelizer = -3.4028235E38f;
            this.onAddQueueItem = false;
            this.handleMediaPlayPauseIfPendingOnHandler = -16777216;
            this.RatingCompat = Integer.MIN_VALUE;
        }

        private write(getDefaultImpl getdefaultimpl) {
            this.MediaBrowserCompatSearchResultReceiver = getdefaultimpl.RatingCompat;
            this.AudioAttributesCompatParcelizer = getdefaultimpl.AudioAttributesCompatParcelizer;
            this.MediaMetadataCompat = getdefaultimpl.MediaBrowserCompatMediaItem;
            this.AudioAttributesImplApi21Parcelizer = getdefaultimpl.MediaBrowserCompatCustomActionResultReceiver;
            this.read = getdefaultimpl.IconCompatParcelizer;
            this.write = getdefaultimpl.read;
            this.IconCompatParcelizer = getdefaultimpl.write;
            this.MediaBrowserCompatCustomActionResultReceiver = getdefaultimpl.AudioAttributesImplApi21Parcelizer;
            this.MediaBrowserCompatItemReceiver = getdefaultimpl.AudioAttributesImplApi26Parcelizer;
            this.MediaDescriptionCompat = getdefaultimpl.MediaMetadataCompat;
            this.MediaBrowserCompatMediaItem = getdefaultimpl.MediaDescriptionCompat;
            this.AudioAttributesImplApi26Parcelizer = getdefaultimpl.AudioAttributesImplBaseParcelizer;
            this.RemoteActionCompatParcelizer = getdefaultimpl.RemoteActionCompatParcelizer;
            this.onAddQueueItem = getdefaultimpl.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.handleMediaPlayPauseIfPendingOnHandler = getdefaultimpl.onCustomAction;
            this.RatingCompat = getdefaultimpl.MediaBrowserCompatSearchResultReceiver;
            this.AudioAttributesImplBaseParcelizer = getdefaultimpl.MediaBrowserCompatItemReceiver;
        }

        public final write RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.MediaBrowserCompatSearchResultReceiver = charSequence;
            return this;
        }

        public final CharSequence read() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final write read(Bitmap bitmap) {
            this.AudioAttributesCompatParcelizer = bitmap;
            return this;
        }

        public final write AudioAttributesCompatParcelizer(Layout.Alignment alignment) {
            this.MediaMetadataCompat = alignment;
            return this;
        }

        public final write write(Layout.Alignment alignment) {
            this.AudioAttributesImplApi21Parcelizer = alignment;
            return this;
        }

        public final write write(float f, int i) {
            this.read = f;
            this.write = i;
            return this;
        }

        public final write read(int i) {
            this.IconCompatParcelizer = i;
            return this;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final write RemoteActionCompatParcelizer(float f) {
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            return this;
        }

        public final write IconCompatParcelizer(int i) {
            this.MediaBrowserCompatItemReceiver = i;
            return this;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final write RemoteActionCompatParcelizer(float f, int i) {
            this.MediaBrowserCompatMediaItem = f;
            this.MediaDescriptionCompat = i;
            return this;
        }

        public final write read(float f) {
            this.AudioAttributesImplApi26Parcelizer = f;
            return this;
        }

        public final write AudioAttributesCompatParcelizer(float f) {
            this.RemoteActionCompatParcelizer = f;
            return this;
        }

        public final write AudioAttributesCompatParcelizer(int i) {
            this.handleMediaPlayPauseIfPendingOnHandler = i;
            this.onAddQueueItem = true;
            return this;
        }

        public final write IconCompatParcelizer() {
            this.onAddQueueItem = false;
            return this;
        }

        public final write RemoteActionCompatParcelizer(int i) {
            this.RatingCompat = i;
            return this;
        }

        public final write IconCompatParcelizer(float f) {
            this.AudioAttributesImplBaseParcelizer = f;
            return this;
        }

        public final getDefaultImpl write() {
            return new getDefaultImpl(this.MediaBrowserCompatSearchResultReceiver, this.MediaMetadataCompat, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, this.read, this.write, this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.onAddQueueItem, this.handleMediaPlayPauseIfPendingOnHandler, this.RatingCompat, this.AudioAttributesImplBaseParcelizer, (byte) 0);
        }
    }

    public final Bundle read() {
        Bundle bundleWrite = write();
        if (this.AudioAttributesCompatParcelizer != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            buildTypeSerializer.write(this.AudioAttributesCompatParcelizer.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleWrite.putByteArray(onCommand, byteArrayOutputStream.toByteArray());
        }
        return bundleWrite;
    }

    private Bundle write() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.RatingCompat;
        if (charSequence != null) {
            bundle.putCharSequence(onPlayFromUri, charSequence);
            CharSequence charSequence2 = this.RatingCompat;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayList = TypeIdResolver.read((Spanned) charSequence2);
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(onMediaButtonEvent, arrayList);
                }
            }
        }
        bundle.putSerializable(onRemoveQueueItem, this.MediaBrowserCompatMediaItem);
        bundle.putSerializable(onPause, this.MediaBrowserCompatCustomActionResultReceiver);
        bundle.putFloat(onPlay, this.IconCompatParcelizer);
        bundle.putInt(onPlayFromMediaId, this.read);
        bundle.putInt(onFastForward, this.write);
        bundle.putFloat(onPlayFromSearch, this.AudioAttributesImplApi21Parcelizer);
        bundle.putInt(onPrepareFromMediaId, this.AudioAttributesImplApi26Parcelizer);
        bundle.putInt(onSeekTo, this.MediaMetadataCompat);
        bundle.putFloat(onPrepareFromUri, this.MediaDescriptionCompat);
        bundle.putFloat(onPrepareFromSearch, this.AudioAttributesImplBaseParcelizer);
        bundle.putFloat(onAddQueueItem, this.RemoteActionCompatParcelizer);
        bundle.putBoolean(onSetShuffleMode, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        bundle.putInt(onRemoveQueueItemAt, this.onCustomAction);
        bundle.putInt(onRewind, this.MediaBrowserCompatSearchResultReceiver);
        bundle.putFloat(onPrepare, this.MediaBrowserCompatItemReceiver);
        return bundle;
    }

    public static getDefaultImpl RemoteActionCompatParcelizer(Bundle bundle) {
        write writeVar = new write();
        CharSequence charSequence = bundle.getCharSequence(onPlayFromUri);
        if (charSequence != null) {
            writeVar.RemoteActionCompatParcelizer(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(onMediaButtonEvent);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    TypeIdResolver.AudioAttributesCompatParcelizer((Bundle) it.next(), spannableStringValueOf);
                }
                writeVar.RemoteActionCompatParcelizer(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(onRemoveQueueItem);
        if (alignment != null) {
            writeVar.AudioAttributesCompatParcelizer(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(onPause);
        if (alignment2 != null) {
            writeVar.write(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(handleMediaPlayPauseIfPendingOnHandler);
        if (bitmap != null) {
            writeVar.read(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(onCommand);
            if (byteArray != null) {
                writeVar.read(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = onPlay;
        if (bundle.containsKey(str)) {
            String str2 = onPlayFromMediaId;
            if (bundle.containsKey(str2)) {
                writeVar.write(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = onFastForward;
        if (bundle.containsKey(str3)) {
            writeVar.read(bundle.getInt(str3));
        }
        String str4 = onPlayFromSearch;
        if (bundle.containsKey(str4)) {
            writeVar.RemoteActionCompatParcelizer(bundle.getFloat(str4));
        }
        String str5 = onPrepareFromMediaId;
        if (bundle.containsKey(str5)) {
            writeVar.IconCompatParcelizer(bundle.getInt(str5));
        }
        String str6 = onPrepareFromUri;
        if (bundle.containsKey(str6)) {
            String str7 = onSeekTo;
            if (bundle.containsKey(str7)) {
                writeVar.RemoteActionCompatParcelizer(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = onPrepareFromSearch;
        if (bundle.containsKey(str8)) {
            writeVar.read(bundle.getFloat(str8));
        }
        String str9 = onAddQueueItem;
        if (bundle.containsKey(str9)) {
            writeVar.AudioAttributesCompatParcelizer(bundle.getFloat(str9));
        }
        String str10 = onRemoveQueueItemAt;
        if (bundle.containsKey(str10)) {
            writeVar.AudioAttributesCompatParcelizer(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(onSetShuffleMode, false)) {
            writeVar.IconCompatParcelizer();
        }
        String str11 = onRewind;
        if (bundle.containsKey(str11)) {
            writeVar.RemoteActionCompatParcelizer(bundle.getInt(str11));
        }
        String str12 = onPrepare;
        if (bundle.containsKey(str12)) {
            writeVar.IconCompatParcelizer(bundle.getFloat(str12));
        }
        return writeVar.write();
    }
}
