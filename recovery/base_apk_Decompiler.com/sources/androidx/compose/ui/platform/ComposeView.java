package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.InputAccessor;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin._appendEscaped;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._validJsonValueList;
import kotlin.available;
import kotlin.getShowPopup;
import kotlin.releaseNameCopyBuffer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178\u0015@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "setContent", "(Lo/MagicModuleSubmissionRequestBody;)V", "Lo/InputAccessor;", "AudioAttributesCompatParcelizer", "Lo/InputAccessor;", "RemoteActionCompatParcelizer", "", "read", "Z", "write", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor<MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(int i) {
            super(2);
            this.write = i;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            ComposeView.this.IconCompatParcelizer(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.write | 1));
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: write, reason: from getter */
    protected final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(420213850);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(420213850, i2, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:444)");
            }
            MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer == null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1238823553);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(98585282);
                remoteActionCompatParcelizer.invoke(_handleunrecognizedcharacterescapeWrite, 0);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new RemoteActionCompatParcelizer(i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final void setContent(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        this.AudioAttributesCompatParcelizer = true;
        this.RemoteActionCompatParcelizer.write(p0);
        if (isAttachedToWindow()) {
            IconCompatParcelizer();
        }
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }
}
