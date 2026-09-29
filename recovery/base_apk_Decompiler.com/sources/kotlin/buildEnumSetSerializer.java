package kotlin;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.util.List;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
final class buildEnumSetSerializer {
    private static final StdKeySerializers.write handleMediaPlayPauseIfPendingOnHandler = new StdKeySerializers.write(new Object());
    public final long AudioAttributesCompatParcelizer;
    public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes AudioAttributesImplApi21Parcelizer;
    public final addNull AudioAttributesImplApi26Parcelizer;
    public final int AudioAttributesImplBaseParcelizer;
    public volatile long IconCompatParcelizer;
    public final boolean MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    public final boolean MediaBrowserCompatMediaItem;
    public final int MediaBrowserCompatSearchResultReceiver;
    public final _writeAsBinary MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final List<androidx.media3.common.Metadata> MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public volatile long RatingCompat;
    public final StdKeySerializers.write RemoteActionCompatParcelizer;
    public final PolymorphicTypeValidator onAddQueueItem;
    public final _findPrimitive onCommand;
    public volatile long onCustomAction;
    private volatile long onMediaButtonEvent;
    public final StdKeySerializers.write read;
    public final boolean write;

    public static buildEnumSetSerializer IconCompatParcelizer(_findPrimitive _findprimitive) {
        PolymorphicTypeValidator polymorphicTypeValidator = PolymorphicTypeValidator.RemoteActionCompatParcelizer;
        StdKeySerializers.write writeVar = handleMediaPlayPauseIfPendingOnHandler;
        return new buildEnumSetSerializer(polymorphicTypeValidator, writeVar, C.TIME_UNSET, 0L, 1, null, false, _writeAsBinary.read, _findprimitive, initExtraTracks.AudioAttributesImplApi26Parcelizer(), writeVar, false, 1, 0, DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write, 0L, 0L, 0L, 0L, false);
    }

    public buildEnumSetSerializer(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar, long j, long j2, int i, addNull addnull, boolean z, _writeAsBinary _writeasbinary, _findPrimitive _findprimitive, List<androidx.media3.common.Metadata> list, StdKeySerializers.write writeVar2, boolean z2, int i2, int i3, DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes, long j3, long j4, long j5, long j6, boolean z3) {
        this.onAddQueueItem = polymorphicTypeValidator;
        this.RemoteActionCompatParcelizer = writeVar;
        this.MediaMetadataCompat = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.MediaBrowserCompatItemReceiver = i;
        this.AudioAttributesImplApi26Parcelizer = addnull;
        this.write = z;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = _writeasbinary;
        this.onCommand = _findprimitive;
        this.MediaDescriptionCompat = list;
        this.read = writeVar2;
        this.MediaBrowserCompatCustomActionResultReceiver = z2;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.MediaBrowserCompatSearchResultReceiver = i3;
        this.AudioAttributesImplApi21Parcelizer = defaultBaseTypeLimitingValidatorUnsafeBaseTypes;
        this.IconCompatParcelizer = j3;
        this.onCustomAction = j4;
        this.RatingCompat = j5;
        this.onMediaButtonEvent = j6;
        this.MediaBrowserCompatMediaItem = z3;
    }

    public static StdKeySerializers.write read() {
        return handleMediaPlayPauseIfPendingOnHandler;
    }

    public final buildEnumSetSerializer AudioAttributesCompatParcelizer(StdKeySerializers.write writeVar, long j, long j2, long j3, long j4, _writeAsBinary _writeasbinary, _findPrimitive _findprimitive, List<androidx.media3.common.Metadata> list) {
        return new buildEnumSetSerializer(this.onAddQueueItem, writeVar, j2, j3, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, _writeasbinary, _findprimitive, list, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, j4, j, SystemClock.elapsedRealtime(), this.MediaBrowserCompatMediaItem);
    }

    public final buildEnumSetSerializer RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator) {
        return new buildEnumSetSerializer(polymorphicTypeValidator, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.onCustomAction, this.RatingCompat, this.onMediaButtonEvent, this.MediaBrowserCompatMediaItem);
    }

    public final buildEnumSetSerializer read(int i) {
        return new buildEnumSetSerializer(this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, i, this.AudioAttributesImplApi26Parcelizer, this.write, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.onCustomAction, this.RatingCompat, this.onMediaButtonEvent, this.MediaBrowserCompatMediaItem);
    }

    public final buildEnumSetSerializer RemoteActionCompatParcelizer(addNull addnull) {
        return new buildEnumSetSerializer(this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, addnull, this.write, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.onCustomAction, this.RatingCompat, this.onMediaButtonEvent, this.MediaBrowserCompatMediaItem);
    }

    public final buildEnumSetSerializer IconCompatParcelizer(boolean z) {
        return new buildEnumSetSerializer(this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, z, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.onCustomAction, this.RatingCompat, this.onMediaButtonEvent, this.MediaBrowserCompatMediaItem);
    }

    public final buildEnumSetSerializer RemoteActionCompatParcelizer(StdKeySerializers.write writeVar) {
        return new buildEnumSetSerializer(this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, writeVar, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.onCustomAction, this.RatingCompat, this.onMediaButtonEvent, this.MediaBrowserCompatMediaItem);
    }

    public final buildEnumSetSerializer AudioAttributesCompatParcelizer(boolean z, int i, int i2) {
        return new buildEnumSetSerializer(this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, this.read, z, i, i2, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.onCustomAction, this.RatingCompat, this.onMediaButtonEvent, this.MediaBrowserCompatMediaItem);
    }

    public final buildEnumSetSerializer RemoteActionCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        return new buildEnumSetSerializer(this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, defaultBaseTypeLimitingValidatorUnsafeBaseTypes, this.IconCompatParcelizer, this.onCustomAction, this.RatingCompat, this.onMediaButtonEvent, this.MediaBrowserCompatMediaItem);
    }

    public final buildEnumSetSerializer RemoteActionCompatParcelizer(boolean z) {
        return new buildEnumSetSerializer(this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.onCustomAction, this.RatingCompat, this.onMediaButtonEvent, z);
    }

    public final buildEnumSetSerializer RemoteActionCompatParcelizer() {
        return new buildEnumSetSerializer(this.onAddQueueItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCommand, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.onCustomAction, AudioAttributesCompatParcelizer(), SystemClock.elapsedRealtime(), this.MediaBrowserCompatMediaItem);
    }

    public final void IconCompatParcelizer(long j) {
        this.RatingCompat = j;
        this.onMediaButtonEvent = SystemClock.elapsedRealtime();
    }

    public final long AudioAttributesCompatParcelizer() {
        long j;
        long j2;
        if (!IconCompatParcelizer()) {
            return this.RatingCompat;
        }
        do {
            j = this.onMediaButtonEvent;
            j2 = this.RatingCompat;
        } while (j != this.onMediaButtonEvent);
        return LaissezFaireSubTypeValidator.IconCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer)));
    }

    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver == 3 && this.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatSearchResultReceiver == 0;
    }
}
