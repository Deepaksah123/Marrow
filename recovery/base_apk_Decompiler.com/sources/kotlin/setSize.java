package kotlin;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0010"}, d2 = {"Lo/setSize;", "", "<init>", "()V", "Lo/setCrossfade;", "Landroid/content/Context;", "p0", "Lo/isRemoved;", "p1", "", "read", "(Lo/setCrossfade;Landroid/content/Context;Lo/isRemoved;)V", "Landroid/graphics/drawable/Icon;", "write", "(Landroid/graphics/drawable/Icon;Lo/_handleUnrecognizedCharacterEscape;I)V", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;Lo/_handleUnrecognizedCharacterEscape;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setSize {
    public static final setSize INSTANCE = new setSize();

    private setSize() {
    }

    public final void read(setCrossfade setcrossfade, final Context context, isRemoved isremoved) {
        if (context == null) {
            return;
        }
        int iconCompatParcelizer = isremoved.getIconCompatParcelizer();
        final TextClassification write2 = isremoved.getWrite();
        if (iconCompatParcelizer < 0) {
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.setRefreshing
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setSize.AudioAttributesCompatParcelizer(write2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            };
            Drawable icon = write2.getIcon();
            setCrossfade.AudioAttributesCompatParcelizer$default(setcrossfade, magicModuleSubmissionRequestBody, null, false, icon != null ? multiplyFft.IconCompatParcelizer(-1123224187, true, new write(icon)) : null, new getCreatedOnDateMs() { // from class: o.setProgressViewOffset
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setSize.read(context, write2);
                }
            }, 6, null);
        } else {
            final RemoteAction remoteAction = write2.getActions().get(iconCompatParcelizer);
            setCrossfade.AudioAttributesCompatParcelizer$default(setcrossfade, new MagicModuleSubmissionRequestBody() { // from class: o.InstrumentationActivityInvokerBootstrapActivity1
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setSize.AudioAttributesCompatParcelizer(remoteAction, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, null, false, ((iconCompatParcelizer == 0) || remoteAction.shouldShowIcon()) ? multiplyFft.IconCompatParcelizer(-1261173016, true, new IconCompatParcelizer(remoteAction)) : null, new getCreatedOnDateMs() { // from class: o.setSlingshotDistance
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setSize.AudioAttributesCompatParcelizer(remoteAction);
                }
            }, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write implements getModuleData<switchToNext, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ Drawable IconCompatParcelizer;

        @Override // kotlin.getModuleData
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(switchToNext switchtonext, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            write(switchtonext.getIconCompatParcelizer(), _handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void write(long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1123224187, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:247)");
            }
            setSize.INSTANCE.write(this.IconCompatParcelizer, _handleunrecognizedcharacterescape, 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        write(Drawable drawable) {
            this.IconCompatParcelizer = drawable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesCompatParcelizer(TextClassification textClassification, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(950061013);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(950061013, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:246)");
        }
        String strValueOf = String.valueOf(textClassification.getLabel());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        setProgressBackgroundColorSchemeColor.INSTANCE.RemoteActionCompatParcelizer(context, textClassification);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesCompatParcelizer(RemoteAction remoteAction, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1376593684);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1376593684, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:254)");
        }
        String string = remoteAction.getTitle().toString();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return string;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements getModuleData<switchToNext, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ RemoteAction RemoteActionCompatParcelizer;

        @Override // kotlin.getModuleData
        public final /* bridge */ /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(switchToNext switchtonext, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(switchtonext.getIconCompatParcelizer(), _handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1261173016, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:257)");
            }
            setSize.INSTANCE.write(this.RemoteActionCompatParcelizer.getIcon(), _handleunrecognizedcharacterescape, 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        IconCompatParcelizer(RemoteAction remoteAction) {
            this.RemoteActionCompatParcelizer = remoteAction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        setProgressBackgroundColorSchemeColor.INSTANCE.AudioAttributesCompatParcelizer(remoteAction.getActionIntent());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(final Icon icon, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver;
        MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(2116504409);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2116504409, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:267)");
            }
            Context context = (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(icon);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(context);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = icon.loadDrawable(context);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            Drawable drawable = (Drawable) objOnPause;
            if (drawable != null) {
                write(drawable, _handleunrecognizedcharacterescapeWrite, i2 & 112);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
                releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
                if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
                    magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.setProgressBackgroundColorSchemeResource
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return setSize.RemoteActionCompatParcelizer(this.IconCompatParcelizer, icon, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                        }
                    };
                    releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(magicModuleSubmissionRequestBody);
                }
                return;
            }
        }
        releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.setProgressViewEndTarget
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setSize.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, icon, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            };
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(magicModuleSubmissionRequestBody);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(final Drawable drawable, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(257732500);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(drawable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(257732500, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:274)");
            }
            _handleOddName _handleoddnameAudioAttributesImplBaseParcelizer = isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, setSaturation.INSTANCE.MediaBrowserCompatItemReceiver());
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(drawable);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.InstrumentationActivityInvokerBootstrapActivity
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setSize.AudioAttributesCompatParcelizer(drawable, (findSetterInfo) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            AbsSavedState1.RemoteActionCompatParcelizer(WriterBasedJsonGenerator.read(_handleoddnameAudioAttributesImplBaseParcelizer, (getAnswerMap) objOnPause), _handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.Beta
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setSize.AudioAttributesCompatParcelizer(this.write, drawable, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Drawable drawable, findSetterInfo findsetterinfo) {
        JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer();
        drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32)), (int) Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver()));
        drawable.draw(balloc.RemoteActionCompatParcelizer(jsonParserDelegateIconCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(setSize setsize, Icon icon, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        setsize.write(icon, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setSize setsize, Icon icon, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        setsize.write(icon, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setSize setsize, Drawable drawable, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        setsize.write(drawable, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
