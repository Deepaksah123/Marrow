package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.CollectionType;

/* JADX INFO: loaded from: classes4.dex */
public final class withKeyValueHandler extends ClassKey {
    private final CollectionType IconCompatParcelizer;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final long handleMediaPlayPauseIfPendingOnHandler;
    private long onAddQueueItem;
    private volatile boolean read;
    private final int write;

    private static CollectionType.write read(LogicalType logicalType) {
        return logicalType;
    }

    public withKeyValueHandler(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, C0170format c0170format, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, CollectionType collectionType) {
        super(_hastyperesolver, subTypeValidator, c0170format, i, obj, j, j2, j3, j4, j5);
        this.write = i2;
        this.handleMediaPlayPauseIfPendingOnHandler = j6;
        this.IconCompatParcelizer = collectionType;
    }

    @Override // kotlin.getSelfReferencedType
    public final long C_() {
        return this.MediaBrowserCompatMediaItem + ((long) this.write);
    }

    @Override // kotlin.getSelfReferencedType
    public final boolean write() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void B_() {
        this.read = true;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() throws IOException {
        LogicalType logicalType = read();
        if (this.onAddQueueItem == 0) {
            logicalType.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
            CollectionType collectionType = this.IconCompatParcelizer;
            CollectionType.write writeVar = read(logicalType);
            long j = this.AudioAttributesCompatParcelizer;
            long j2 = C.TIME_UNSET;
            long j3 = j == C.TIME_UNSET ? -9223372036854775807L : this.AudioAttributesCompatParcelizer - this.handleMediaPlayPauseIfPendingOnHandler;
            if (this.RemoteActionCompatParcelizer != C.TIME_UNSET) {
                j2 = this.RemoteActionCompatParcelizer - this.handleMediaPlayPauseIfPendingOnHandler;
            }
            collectionType.read(writeVar, j3, j2);
        }
        try {
            SubTypeValidator subTypeValidatorIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.onAddQueueItem);
            classOf classof = new classOf(this.AudioAttributesImplBaseParcelizer, subTypeValidatorIconCompatParcelizer.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(subTypeValidatorIconCompatParcelizer));
            do {
                try {
                    if (this.read) {
                        break;
                    }
                } finally {
                    this.onAddQueueItem = classof.IconCompatParcelizer() - this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer;
                }
            } while (this.IconCompatParcelizer.read(classof));
            RemoteActionCompatParcelizer(logicalType);
            StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = !this.read;
        } catch (Throwable th) {
            StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            throw th;
        }
    }

    private void RemoteActionCompatParcelizer(LogicalType logicalType) {
        if (DefaultBaseTypeLimitingValidator.AudioAttributesImplBaseParcelizer(this.MediaDescriptionCompat.AudioAttributesImplApi21Parcelizer)) {
            if ((this.MediaDescriptionCompat.onRemoveQueueItemAt <= 1 && this.MediaDescriptionCompat.onSetShuffleMode <= 1) || this.MediaDescriptionCompat.onRemoveQueueItemAt == -1 || this.MediaDescriptionCompat.onSetShuffleMode == -1) {
                return;
            }
            nonNullString nonnullstringRemoteActionCompatParcelizer = logicalType.RemoteActionCompatParcelizer(4);
            int i = this.MediaDescriptionCompat.onRemoveQueueItemAt * this.MediaDescriptionCompat.onSetShuffleMode;
            long j = (this.AudioAttributesImplApi21Parcelizer - this.MediaBrowserCompatItemReceiver) / ((long) i);
            for (int i2 = 1; i2 < i; i2++) {
                nonnullstringRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new AsPropertyTypeDeserializer(), 0);
                nonnullstringRemoteActionCompatParcelizer.IconCompatParcelizer(((long) i2) * j, 0, 0, 0, null);
            }
        }
    }
}
