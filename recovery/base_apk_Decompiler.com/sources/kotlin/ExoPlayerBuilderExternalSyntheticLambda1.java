package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@submitMagicModule
public final class ExoPlayerBuilderExternalSyntheticLambda1 {
    private final CharacterEscapes<setAnalyticsCollector> read;

    /* JADX INFO: renamed from: o.ExoPlayerBuilderExternalSyntheticLambda1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/setAnalyticsCollector;", "RemoteActionCompatParcelizer", "()Lo/setAnalyticsCollector;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<setAnalyticsCollector> {
        public static final AnonymousClass1 write = new AnonymousClass1();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final setAnalyticsCollector invoke() {
            return null;
        }

        AnonymousClass1() {
            super(0);
        }
    }

    public static final setAnalyticsCollector IconCompatParcelizer(CharacterEscapes<setAnalyticsCollector> characterEscapes, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        toMagicModuleMetaRepoModel.write(characterEscapes, "");
        _handleunrecognizedcharacterescape.read(380256078);
        setAnalyticsCollector setanalyticscollector = (setAnalyticsCollector) _handleunrecognizedcharacterescape.write(characterEscapes);
        if (setanalyticscollector != null) {
            _handleunrecognizedcharacterescape.read(380256086);
        } else {
            _handleunrecognizedcharacterescape.read(380256127);
            Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            experimentalSetForegroundModeTimeoutMs experimentalsetforegroundmodetimeoutms = experimentalSetForegroundModeTimeoutMs.INSTANCE;
            setanalyticscollector = experimentalSetForegroundModeTimeoutMs.read(context);
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        _handleunrecognizedcharacterescape.RatingCompat();
        return setanalyticscollector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CharacterEscapes<setAnalyticsCollector> RemoteActionCompatParcelizer(CharacterEscapes<setAnalyticsCollector> characterEscapes) {
        toMagicModuleMetaRepoModel.write(characterEscapes, "");
        return characterEscapes;
    }

    private static boolean read(CharacterEscapes<setAnalyticsCollector> characterEscapes, Object obj) {
        return (obj instanceof ExoPlayerBuilderExternalSyntheticLambda1) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(characterEscapes, ((ExoPlayerBuilderExternalSyntheticLambda1) obj).write());
    }

    private static int AudioAttributesCompatParcelizer(CharacterEscapes<setAnalyticsCollector> characterEscapes) {
        return characterEscapes.hashCode();
    }

    private static String IconCompatParcelizer(CharacterEscapes<setAnalyticsCollector> characterEscapes) {
        StringBuilder sb = new StringBuilder("ImageLoaderProvidableCompositionLocal(delegate=");
        sb.append(characterEscapes);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return read(write(), obj);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(write());
    }

    public final String toString() {
        return IconCompatParcelizer(write());
    }

    private /* synthetic */ CharacterEscapes write() {
        return this.read;
    }
}
