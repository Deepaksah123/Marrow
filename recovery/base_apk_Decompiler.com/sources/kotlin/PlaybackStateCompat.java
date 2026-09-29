package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Lo/PlaybackStateCompat;", "", "<init>", "()V", "Lo/_init_lambda3;", "p0", "Lo/ContentReference;", "AudioAttributesCompatParcelizer", "(Lo/_init_lambda3;)Lo/ContentReference;", "Lo/CharacterEscapes;", "Lo/CharacterEscapes;", "write", "RemoteActionCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;)Lo/_init_lambda3;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlaybackStateCompat {
    public static final PlaybackStateCompat INSTANCE = new PlaybackStateCompat();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final CharacterEscapes<_init_lambda3> write = resetAsNaN.RemoteActionCompatParcelizer$default(null, AnonymousClass3.AudioAttributesCompatParcelizer, 1, null);

    private PlaybackStateCompat() {
    }

    /* JADX INFO: renamed from: o.PlaybackStateCompat$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/_init_lambda3;", "RemoteActionCompatParcelizer", "()Lo/_init_lambda3;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<_init_lambda3> {
        public static final AnonymousClass3 AudioAttributesCompatParcelizer = new AnonymousClass3();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _init_lambda3 invoke() {
            return null;
        }

        AnonymousClass3() {
            super(0);
        }
    }

    public static _init_lambda3 RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        _handleunrecognizedcharacterescape.read(1418020823);
        _init_lambda3 _init_lambda3Var = (_init_lambda3) _handleunrecognizedcharacterescape.write(write);
        if (_init_lambda3Var == null) {
            Object baseContext = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof _init_lambda3) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            _init_lambda3Var = (_init_lambda3) baseContext;
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        return _init_lambda3Var;
    }

    public static ContentReference<_init_lambda3> AudioAttributesCompatParcelizer(_init_lambda3 p0) {
        return write.AudioAttributesCompatParcelizer(p0);
    }
}
