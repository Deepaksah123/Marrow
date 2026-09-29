package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Lo/MediaSessionCompatQueueItem;", "", "<init>", "()V", "Lo/onSetShuffleMode;", "p0", "Lo/ContentReference;", "read", "(Lo/onSetShuffleMode;)Lo/ContentReference;", "Lo/CharacterEscapes;", "write", "Lo/CharacterEscapes;", "RemoteActionCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;)Lo/onSetShuffleMode;", "IconCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaSessionCompatQueueItem {
    public static final int AudioAttributesCompatParcelizer = 0;
    public static final MediaSessionCompatQueueItem INSTANCE = new MediaSessionCompatQueueItem();
    private static final CharacterEscapes<onSetShuffleMode> write = resetAsNaN.RemoteActionCompatParcelizer$default(null, AnonymousClass2.read, 1, null);

    private MediaSessionCompatQueueItem() {
    }

    /* JADX INFO: renamed from: o.MediaSessionCompatQueueItem$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/onSetShuffleMode;", "AudioAttributesCompatParcelizer", "()Lo/onSetShuffleMode;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<onSetShuffleMode> {
        public static final AnonymousClass2 read = new AnonymousClass2();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final onSetShuffleMode invoke() {
            return null;
        }

        AnonymousClass2() {
            super(0);
        }
    }

    public static onSetShuffleMode RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        _handleunrecognizedcharacterescape.read(-2068013981);
        onSetShuffleMode onsetshufflemodeWrite = (onSetShuffleMode) _handleunrecognizedcharacterescape.write(write);
        _handleunrecognizedcharacterescape.read(1680121597);
        if (onsetshufflemodeWrite == null) {
            onsetshufflemodeWrite = onSkipToQueueItem.write((View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver()));
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        if (onsetshufflemodeWrite == null) {
            Object baseContext = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof onSetShuffleMode) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            onsetshufflemodeWrite = (onSetShuffleMode) baseContext;
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        return onsetshufflemodeWrite;
    }

    public static ContentReference<onSetShuffleMode> read(onSetShuffleMode p0) {
        return write.AudioAttributesCompatParcelizer(p0);
    }
}
